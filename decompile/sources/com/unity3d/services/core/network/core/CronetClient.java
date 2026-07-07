package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import df.m;
import df.t;
import gf.f0;
import gf.j;
import he.a;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import le.c;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public CronetClient(CronetEngine engine, ISDKDispatchers dispatchers) {
        k.e(engine, "engine");
        k.e(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        return m.Y(m.o0(httpRequest.getBaseURL(), '/') + '/' + m.o0(httpRequest.getPath(), '/'), "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long x10;
        List<String> list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list != null && (str = list.get(0)) != null && (x10 = t.x(str)) != null) {
            return x10.longValue();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    return 1;
                }
                return 2;
            }
            return 3;
        }
        return 4;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, final boolean z10, c cVar) {
        PipedOutputStream pipedOutputStream;
        byte[] bArr;
        if (z10) {
            pipedOutputStream = new PipedOutputStream();
        } else {
            pipedOutputStream = null;
        }
        final PipedOutputStream pipedOutputStream2 = pipedOutputStream;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                String str;
                super.onCanceled(urlRequest, urlResponseInfo);
                PipedOutputStream pipedOutputStream3 = pipedOutputStream2;
                if (pipedOutputStream3 != null) {
                    pipedOutputStream3.close();
                }
                String str2 = null;
                if (urlResponseInfo != null) {
                    str = urlResponseInfo.getUrl();
                } else {
                    str = null;
                }
                if (urlResponseInfo != null) {
                    str2 = urlResponseInfo.getNegotiatedProtocol();
                }
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, str, str2, null, "cronet", 38, null);
                if (!atomicBoolean.getAndSet(true)) {
                    kVar.resumeWith(a.b(networkTimeoutException));
                }
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                NetworkException networkException;
                Integer num;
                Integer num2;
                String str;
                PipedOutputStream pipedOutputStream3 = pipedOutputStream2;
                if (pipedOutputStream3 != null) {
                    pipedOutputStream3.close();
                }
                String str2 = null;
                if (cronetException instanceof NetworkException) {
                    networkException = (NetworkException) cronetException;
                } else {
                    networkException = null;
                }
                if (networkException != null) {
                    num = Integer.valueOf(networkException.getCronetInternalErrorCode());
                } else {
                    num = null;
                }
                if (urlResponseInfo != null) {
                    num2 = Integer.valueOf(urlResponseInfo.getHttpStatusCode());
                } else {
                    num2 = null;
                }
                if (urlResponseInfo != null) {
                    str = urlResponseInfo.getUrl();
                } else {
                    str = null;
                }
                if (urlResponseInfo != null) {
                    str2 = urlResponseInfo.getNegotiatedProtocol();
                }
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, num2, str, str2, num, "cronet", 2, null);
                if (!atomicBoolean.getAndSet(true)) {
                    kVar.resumeWith(a.b(unityAdsNetworkException));
                }
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
                long contentSize;
                k.e(request, "request");
                k.e(info, "info");
                k.e(byteBuffer, "byteBuffer");
                if (pipedOutputStream2 != null) {
                    if (!atomicBoolean.getAndSet(true)) {
                        j jVar = kVar;
                        int httpStatusCode = info.getHttpStatusCode();
                        Map<String, List<String>> allHeaders = info.getAllHeaders();
                        String url = info.getUrl();
                        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream2);
                        String negotiatedProtocol = info.getNegotiatedProtocol();
                        contentSize = this.getContentSize(info);
                        k.d(allHeaders, "allHeaders");
                        k.d(url, "url");
                        k.d(negotiatedProtocol, "negotiatedProtocol");
                        jVar.resumeWith(new HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
                    }
                    byteBuffer.flip();
                    try {
                        byte[] bArr2 = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr2);
                        pipedOutputStream2.write(bArr2);
                    } catch (IOException e10) {
                        DeviceLog.info("IOException during ByteBuffer read. Details: ", e10);
                    }
                    byteBuffer.clear();
                    request.read(byteBuffer);
                    return;
                }
                super.onReadCompleted(request, info, byteBuffer);
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
                long contentSize;
                PipedOutputStream pipedOutputStream3;
                k.e(request, "request");
                k.e(info, "info");
                k.e(bodyBytes, "bodyBytes");
                if (z10 && (pipedOutputStream3 = pipedOutputStream2) != null) {
                    pipedOutputStream3.close();
                }
                if (!atomicBoolean.getAndSet(true)) {
                    j jVar = kVar;
                    int httpStatusCode = info.getHttpStatusCode();
                    Map<String, List<String>> allHeaders = info.getAllHeaders();
                    String url = info.getUrl();
                    String negotiatedProtocol = info.getNegotiatedProtocol();
                    contentSize = this.getContentSize(info);
                    k.d(allHeaders, "allHeaders");
                    k.d(url, "url");
                    k.d(negotiatedProtocol, "negotiatedProtocol");
                    jVar.resumeWith(new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
                }
            }
        }, f0.f(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bArr = ((String) httpRequest.getBody()).getBytes(df.a.f4115a);
                k.d(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), f0.f(this.dispatchers.getIo()));
        }
        UrlRequest build = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        kVar.u(new CronetClient$execute$2$2(build));
        build.start();
        return kVar.r();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        k.e(request, "request");
        return (HttpResponse) f0.B(this.dispatchers.getIo(), new CronetClient$executeBlocking$1(this, request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
