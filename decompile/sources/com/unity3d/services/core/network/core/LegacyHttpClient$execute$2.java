package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import gf.c0;
import he.a;
import he.y;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import okhttp3.HttpUrl;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyHttpClient$execute$2 extends j implements p {
    final /* synthetic */ HttpRequest $request;
    final /* synthetic */ boolean $withInputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyHttpClient$execute$2(HttpRequest httpRequest, boolean z10, c cVar) {
        super(2, cVar);
        this.$request = httpRequest;
        this.$withInputStream = z10;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new LegacyHttpClient$execute$2(this.$request, this.$withInputStream, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((LegacyHttpClient$execute$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            a.f(obj);
            WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
            String makeRequest = webRequest.makeRequest();
            if (makeRequest == null) {
                makeRequest = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (this.$withInputStream) {
                byte[] bytes = makeRequest.getBytes(df.a.f4115a);
                k.d(bytes, "this as java.lang.String).getBytes(charset)");
                obj2 = new ByteArrayInputStream(bytes);
            } else {
                obj2 = makeRequest;
            }
            int responseCode = webRequest.getResponseCode();
            Map<String, List<String>> headers = webRequest.getHeaders();
            String url = webRequest.getUrl().toString();
            k.d(headers, "headers");
            k.d(url, "toString()");
            return new HttpResponse(obj2, responseCode, headers, url, null, "legacy", 0L, 80, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
