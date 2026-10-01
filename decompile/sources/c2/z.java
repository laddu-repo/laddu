package c2;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.window.SurfaceSyncGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ GetTopicsRequest.Builder e() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse i(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic j(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager k(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* synthetic */ SurfaceSyncGroup p() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return TopicsManager.class;
    }
}
