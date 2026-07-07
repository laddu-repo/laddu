package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import c2.z;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes.dex */
public final class TopicsReceiver implements OutcomeReceiver<GetTopicsResponse, Exception> {
    private final IEventSender eventSender;

    public TopicsReceiver(IEventSender eventSender) {
        k.e(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final JSONObject formatTopic(Topic topic) {
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        k.e(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        taxonomyVersion = topic.getTaxonomyVersion();
        jSONObject.put("taxonomyVersion", taxonomyVersion);
        modelVersion = topic.getModelVersion();
        jSONObject.put("modelVersion", modelVersion);
        topicId = topic.getTopicId();
        jSONObject.put("topicId", topicId);
        return jSONObject;
    }

    @Override // android.os.OutcomeReceiver
    public /* bridge */ /* synthetic */ void onResult(GetTopicsResponse getTopicsResponse) {
        onResult2(z.i(getTopicsResponse));
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Exception error) {
        k.e(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    /* renamed from: onResult, reason: avoid collision after fix types in other method */
    public void onResult2(GetTopicsResponse result) {
        List topics;
        k.e(result, "result");
        JSONArray jSONArray = new JSONArray();
        topics = result.getTopics();
        k.d(topics, "result.topics");
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            Topic it2 = z.j(it.next());
            k.d(it2, "it");
            jSONArray.put(formatTopic(it2));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String jSONArray2 = jSONArray.toString();
        k.d(jSONArray2, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, jSONArray2);
    }
}
