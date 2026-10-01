package okhttp3.internal.connection;

import a8.g;
import ie.p;
import ie.r;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            k.e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                k.d(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            k.d(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> routes) {
            k.e(routes, "routes");
            this.routes = routes;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            if (this.nextRouteIndex < this.routes.size()) {
                return true;
            }
            return false;
        }

        public final Route next() {
            if (hasNext()) {
                List<Route> list = this.routes;
                int i6 = this.nextRouteIndex;
                this.nextRouteIndex = i6 + 1;
                return list.get(i6);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        k.e(address, "address");
        k.e(routeDatabase, "routeDatabase");
        k.e(call, "call");
        k.e(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        r rVar = r.f6846x;
        this.proxies = rVar;
        this.inetSocketAddresses = rVar;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        if (this.nextProxyIndex < this.proxies.size()) {
            return true;
        }
        return false;
    }

    private final Proxy nextProxy() {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i6 = this.nextProxyIndex;
            this.nextProxyIndex = i6 + 1;
            Proxy proxy = list.get(i6);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) {
        String host;
        int port;
        List<InetAddress> lookup;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                host = Companion.getSocketHost(inetSocketAddress);
                port = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        } else {
            host = this.address.url().host();
            port = this.address.url().port();
        }
        if (1 <= port && port < 65536) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(host, port));
                return;
            }
            if (Util.canParseAsIpAddress(host)) {
                lookup = g.m(InetAddress.getByName(host));
            } else {
                this.eventListener.dnsStart(this.call, host);
                lookup = this.address.dns().lookup(host);
                if (!lookup.isEmpty()) {
                    this.eventListener.dnsEnd(this.call, host, lookup);
                } else {
                    throw new UnknownHostException(this.address.dns() + " returned no addresses for " + host);
                }
            }
            Iterator<InetAddress> it = lookup.iterator();
            while (it.hasNext()) {
                arrayList.add(new InetSocketAddress(it.next(), port));
            }
            return;
        }
        throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        List<Proxy> resetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.proxies = resetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, resetNextProxy$selectProxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        if (proxy != null) {
            return g.m(proxy);
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = routeSelector.address.proxySelector().select(uri);
        if (proxiesOrNull != null && !proxiesOrNull.isEmpty()) {
            k.d(proxiesOrNull, "proxiesOrNull");
            return Util.toImmutableList(proxiesOrNull);
        }
        return Util.immutableListOf(Proxy.NO_PROXY);
    }

    public final boolean hasNext() {
        if (!hasNextProxy() && this.postponedRoutes.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Selection next() {
        if (hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (hasNextProxy()) {
                Proxy nextProxy = nextProxy();
                Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
                while (it.hasNext()) {
                    Route route = new Route(this.address, nextProxy, it.next());
                    if (this.routeDatabase.shouldPostpone(route)) {
                        this.postponedRoutes.add(route);
                    } else {
                        arrayList.add(route);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                p.z(this.postponedRoutes, arrayList);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }
}
