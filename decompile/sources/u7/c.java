package u7;

import a8.h;
import a8.l;
import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NetUnknownHostException;
import com.drake.net.exception.NoCacheException;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.k;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import q7.d;
import r7.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final c f12949a = new Object();

    public static void a(Interceptor.Chain chain) {
        p7.a.f10621g.add(new WeakReference(chain.call()));
    }

    public static void b(Interceptor.Chain chain) {
        Iterator it = p7.a.f10621g.iterator();
        k.d(it, "NetConfig.runningCalls.iterator()");
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else if (call.equals(chain.call())) {
                it.remove();
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [r7.i, okhttp3.Response] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        q7.b bVar;
        ConnectException connectException;
        Throwable th;
        Response proceed;
        d dVar;
        int i6;
        k.e(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.body();
        ResponseBody responseBody = null;
        if (body != null) {
            bVar = new q7.b(body, (ConcurrentLinkedQueue) request.tag(l.class));
        } else {
            bVar = null;
        }
        i iVar = (i) request.tag(i.class);
        ?? r12 = iVar;
        if (iVar == null) {
            r12 = p7.a.f10618d;
        }
        r7.a aVar = (r7.a) request.tag(r7.a.class);
        Request.Builder newBuilder = request.newBuilder();
        if (r12 != 0 && aVar != null) {
            newBuilder.cacheControl(new CacheControl.Builder().noCache().noStore().build());
        }
        Request build = newBuilder.method(request.method(), bVar).build();
        try {
            try {
                try {
                    a(chain);
                    if (r12 != 0) {
                        if (aVar == null) {
                            i6 = -1;
                        } else {
                            i6 = a.f12947a[aVar.ordinal()];
                        }
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        proceed = chain.proceed(build);
                                    } else {
                                        proceed = r12.f(chain.proceed(build));
                                    }
                                } else {
                                    try {
                                        proceed = r12.f(chain.proceed(build));
                                    } catch (Exception unused) {
                                        proceed = r12.d(build);
                                        if (proceed == null) {
                                            throw new NoCacheException(build, null, null, 6, null);
                                        }
                                    }
                                }
                            } else {
                                proceed = r12.d(build);
                                if (proceed == null) {
                                    proceed = r12.f(chain.proceed(build));
                                }
                            }
                        } else {
                            proceed = r12.d(build);
                            if (proceed == null) {
                                throw new NoCacheException(build, null, null, 6, null);
                            }
                        }
                    } else {
                        proceed = chain.proceed(build);
                    }
                    Response response = proceed;
                    try {
                        ResponseBody body2 = response.body();
                        if (body2 != null) {
                            dVar = new d(body2, (ConcurrentLinkedQueue) build.tag(h.class), new b(chain));
                        } else {
                            dVar = null;
                        }
                        Response build2 = response.newBuilder().body(dVar).build();
                        if (build2 != null) {
                            responseBody = build2.body();
                        }
                        if (responseBody == null) {
                            b(chain);
                        }
                        return build2;
                    } catch (NetException e10) {
                        throw e10;
                    } catch (ConnectException e11) {
                        connectException = e11;
                        throw new NetConnectException(build, null, connectException, 2, null);
                    } catch (SocketTimeoutException e12) {
                        e = e12;
                        throw new NetSocketTimeoutException(build, e.getMessage(), e);
                    } catch (UnknownHostException e13) {
                        e = e13;
                        throw new NetUnknownHostException(build, e.getMessage(), null, 4, null);
                    } catch (Throwable th2) {
                        th = th2;
                        throw new HttpFailureException(build, null, th, 2, null);
                    }
                } catch (NetException e14) {
                    throw e14;
                } catch (ConnectException e15) {
                    connectException = e15;
                } catch (SocketTimeoutException e16) {
                    e = e16;
                } catch (UnknownHostException e17) {
                    e = e17;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            if (r12 != 0) {
                responseBody = r12.body();
            }
            if (responseBody == null) {
                b(chain);
            }
            throw th4;
        }
    }
}
