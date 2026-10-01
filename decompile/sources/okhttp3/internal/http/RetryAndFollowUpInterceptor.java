package okhttp3.internal.http;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import ie.j;
import ie.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        k.e(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        boolean z10;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, "Location", null, 2, null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!k.a(resolve.scheme(), response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            int code = response.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (!httpMethod.redirectsWithBody(str) && code != 308 && code != 307) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (httpMethod.redirectsToGet(str) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                if (z10) {
                    requestBody = response.request().body();
                }
                newBuilder.method(str, requestBody);
            }
            if (!z10) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader(CommonGatewayClient.HEADER_CONTENT_TYPE);
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response response, Exchange exchange) {
        Route route;
        RealConnection connection$okhttp;
        if (exchange != null && (connection$okhttp = exchange.getConnection$okhttp()) != null) {
            route = connection$okhttp.route();
        } else {
            route = null;
        }
        int code = response.code();
        String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code != 421) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure()) {
                                    return null;
                                }
                                RequestBody body = response.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                Response priorResponse = response.priorResponse();
                                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(response, 0) > 0) {
                                    return null;
                                }
                                return response.request();
                            }
                        } else {
                            k.b(route);
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, response);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response priorResponse2 = response.priorResponse();
                        if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(response, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return response.request();
                    }
                } else {
                    RequestBody body2 = response.request().body();
                    if ((body2 != null && body2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                        return null;
                    }
                    exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return response.request();
                }
            } else {
                return this.client.authenticator().authenticate(route, response);
            }
        }
        return buildRedirectRequest(response, method);
    }

    private final boolean isRecoverable(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z10) {
                return false;
            }
            return true;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean z10) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((z10 && requestIsOneShot(iOException, request)) || !isRecoverable(iOException, z10) || !realCall.retryAfterFailure()) {
            return false;
        }
        return true;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        if ((body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int retryAfter(Response response, int i6) {
        String header$default = Response.header$default(response, CommonGatewayClient.HEADER_RETRY_AFTER, null, 2, null);
        if (header$default == null) {
            return i6;
        }
        Pattern compile = Pattern.compile("\\d+");
        k.d(compile, "compile(...)");
        if (compile.matcher(header$default).matches()) {
            Integer valueOf = Integer.valueOf(header$default);
            k.d(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Exchange interceptorScopedExchange$okhttp;
        Request followUpRequest;
        k.e(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RealCall call$okhttp = realInterceptorChain.getCall$okhttp();
        List list = r.f6846x;
        Response response = null;
        boolean z10 = true;
        int i6 = 0;
        while (true) {
            call$okhttp.enterNetworkInterceptorExchange(request$okhttp, z10);
            try {
                if (!call$okhttp.isCanceled()) {
                    try {
                        try {
                            Response proceed = realInterceptorChain.proceed(request$okhttp);
                            if (response != null) {
                                proceed = proceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                            }
                            response = proceed;
                            interceptorScopedExchange$okhttp = call$okhttp.getInterceptorScopedExchange$okhttp();
                            followUpRequest = followUpRequest(response, interceptorScopedExchange$okhttp);
                        } catch (IOException e10) {
                            if (recover(e10, call$okhttp, request$okhttp, !(e10 instanceof ConnectionShutdownException))) {
                                list = j.Q(list, e10);
                                call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                                z10 = false;
                            } else {
                                throw Util.withSuppressed(e10, list);
                            }
                        }
                    } catch (RouteException e11) {
                        if (recover(e11.getLastConnectException(), call$okhttp, request$okhttp, false)) {
                            list = j.Q(list, e11.getFirstConnectException());
                            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                            z10 = false;
                        } else {
                            throw Util.withSuppressed(e11.getFirstConnectException(), list);
                        }
                    }
                    if (followUpRequest == null) {
                        if (interceptorScopedExchange$okhttp != null && interceptorScopedExchange$okhttp.isDuplex$okhttp()) {
                            call$okhttp.timeoutEarlyExit();
                        }
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    RequestBody body = followUpRequest.body();
                    if (body != null && body.isOneShot()) {
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    ResponseBody body2 = response.body();
                    if (body2 != null) {
                        Util.closeQuietly(body2);
                    }
                    i6++;
                    if (i6 <= 20) {
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                        request$okhttp = followUpRequest;
                        z10 = true;
                    } else {
                        throw new ProtocolException("Too many follow-up requests: " + i6);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (Throwable th) {
                call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                throw th;
            }
        }
    }
}
