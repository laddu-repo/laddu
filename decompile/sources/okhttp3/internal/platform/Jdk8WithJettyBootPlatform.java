package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.Protocol;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> protocols) {
            k.e(protocols, "protocols");
            this.protocols = protocols;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            k.e(proxy, "proxy");
            k.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (k.a(name, "supports") && k.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (k.a(name, "unsupported") && k.a(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (k.a(name, "protocols") && objArr.length == 0) {
                return this.protocols;
            }
            if ((k.a(name, "selectProtocol") || k.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i6 = 0;
                        while (true) {
                            Object obj2 = list.get(i6);
                            k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (this.protocols.contains(str)) {
                                this.selected = str;
                                return str;
                            }
                            if (i6 == size) {
                                break;
                            }
                            i6++;
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((k.a(name, "protocolSelected") || k.a(name, "selected")) && objArr.length == 1) {
                Object obj3 = objArr[0];
                k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                this.selected = (String) obj3;
                return null;
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z10) {
            this.unsupported = z10;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (java.lang.Integer.parseInt(r1) >= 9) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.internal.platform.Platform buildIfSupported() {
            /*
                r12 = this;
                java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
                java.lang.String r1 = "java.specification.version"
                java.lang.String r2 = "unknown"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)
                r2 = 0
                java.lang.String r3 = "jvmVersion"
                kotlin.jvm.internal.k.d(r1, r3)     // Catch: java.lang.NumberFormatException -> L19
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L19
                r3 = 9
                if (r1 < r3) goto L19
                goto L74
            L19:
                java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
                r3 = 1
                java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L74
                java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
                java.lang.Class r4 = java.lang.Class.forName(r4, r3, r2)     // Catch: java.lang.Throwable -> L74
                java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
                java.lang.Class r10 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> L74
                java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
                java.lang.Class r11 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> L74
                java.lang.String r5 = "put"
                r6 = 2
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L74
                r7 = 0
                r6[r7] = r0     // Catch: java.lang.Throwable -> L74
                r6[r3] = r4     // Catch: java.lang.Throwable -> L74
                java.lang.reflect.Method r4 = r1.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L74
                java.lang.String r5 = "get"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L74
                r6[r7] = r0     // Catch: java.lang.Throwable -> L74
                java.lang.reflect.Method r8 = r1.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L74
                java.lang.String r5 = "remove"
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L74
                r3[r7] = r0     // Catch: java.lang.Throwable -> L74
                java.lang.reflect.Method r9 = r1.getMethod(r5, r3)     // Catch: java.lang.Throwable -> L74
                okhttp3.internal.platform.Jdk8WithJettyBootPlatform r6 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform     // Catch: java.lang.Throwable -> L74
                java.lang.String r0 = "putMethod"
                kotlin.jvm.internal.k.d(r4, r0)     // Catch: java.lang.Throwable -> L74
                java.lang.String r0 = "getMethod"
                kotlin.jvm.internal.k.d(r8, r0)     // Catch: java.lang.Throwable -> L74
                java.lang.String r0 = "removeMethod"
                kotlin.jvm.internal.k.d(r9, r0)     // Catch: java.lang.Throwable -> L74
                java.lang.String r0 = "clientProviderClass"
                kotlin.jvm.internal.k.d(r10, r0)     // Catch: java.lang.Throwable -> L74
                java.lang.String r0 = "serverProviderClass"
                kotlin.jvm.internal.k.d(r11, r0)     // Catch: java.lang.Throwable -> L74
                r7 = r4
                r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L74
                return r6
            L74:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion.buildIfSupported():okhttp3.internal.platform.Platform");
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        k.e(putMethod, "putMethod");
        k.e(getMethod, "getMethod");
        k.e(removeMethod, "removeMethod");
        k.e(clientProviderClass, "clientProviderClass");
        k.e(serverProviderClass, "serverProviderClass");
        this.putMethod = putMethod;
        this.getMethod = getMethod;
        this.removeMethod = removeMethod;
        this.clientProviderClass = clientProviderClass;
        this.serverProviderClass = serverProviderClass;
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sslSocket) {
        k.e(sslSocket, "sslSocket");
        try {
            this.removeMethod.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
        k.e(sslSocket, "sslSocket");
        k.e(protocols, "protocols");
        try {
            this.putMethod.invoke(null, sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sslSocket) {
        k.e(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
            k.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
