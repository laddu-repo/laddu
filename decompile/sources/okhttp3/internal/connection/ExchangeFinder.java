package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.k;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        k.e(connectionPool, "connectionPool");
        k.e(address, "address");
        k.e(call, "call");
        k.e(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.connection.RealConnection findConnection(int r13, int r14, int r15, int r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection findHealthyConnection(int i6, int i10, int i11, int i12, boolean z10, boolean z11) {
        boolean z12;
        while (true) {
            RealConnection findConnection = findConnection(i6, i10, i11, i12, z10);
            boolean z13 = z10;
            int i13 = i12;
            int i14 = i11;
            int i15 = i10;
            int i16 = i6;
            if (findConnection.isHealthy(z11)) {
                return findConnection;
            }
            findConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                boolean z14 = true;
                if (selection != null) {
                    z12 = selection.hasNext();
                } else {
                    z12 = true;
                }
                if (z12) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (routeSelector != null) {
                        z14 = routeSelector.hasNext();
                    }
                    if (!z14) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i6 = i16;
            i10 = i15;
            i11 = i14;
            i12 = i13;
            z10 = z13;
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (!Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return null;
            }
            return connection.route();
        }
    }

    public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
        k.e(client, "client");
        k.e(chain, "chain");
        try {
            try {
                return findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis$okhttp(), chain.getWriteTimeoutMillis$okhttp(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !k.a(chain.getRequest$okhttp().method(), "GET")).newCodec$okhttp(client, chain);
            } catch (IOException e10) {
                e = e10;
                IOException iOException = e;
                trackFailure(iOException);
                throw new RouteException(iOException);
            } catch (RouteException e11) {
                e = e11;
                RouteException routeException = e;
                trackFailure(routeException.getLastConnectException());
                throw routeException;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (RouteException e13) {
            e = e13;
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route retryRoute = retryRoute();
        if (retryRoute != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection != null && selection.hasNext()) || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    public final boolean sameHostAndPort(HttpUrl url) {
        k.e(url, "url");
        HttpUrl url2 = this.address.url();
        if (url.port() == url2.port() && k.a(url.host(), url2.host())) {
            return true;
        }
        return false;
    }

    public final void trackFailure(IOException e10) {
        k.e(e10, "e");
        this.nextRouteToTry = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
