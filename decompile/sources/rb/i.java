package rb;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i.p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import s8.l;
import s8.m;
import s9.n;
import w4.o;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11942x;

    /* renamed from: y, reason: collision with root package name */
    public Object f11943y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f11944z;

    public /* synthetic */ i(int i6, Object obj, Object obj2) {
        this.f11942x = i6;
        this.f11943y = obj;
        this.f11944z = obj2;
    }

    private final void a() {
        s8.k kVar = (s8.k) this.f11943y;
        IBinder iBinder = (IBinder) this.f11944z;
        synchronized (kVar) {
            if (iBinder == null) {
                kVar.a("Null service connection");
                return;
            }
            try {
                kVar.f12249z = new l(iBinder);
                kVar.f12247x = 2;
                ((ScheduledExecutorService) kVar.C.f12261c).execute(new s8.i(kVar, 0));
            } catch (RemoteException e10) {
                kVar.a(e10.getMessage());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Exception, c2.r] */
    private final void b() {
        s8.k kVar = (s8.k) this.f11943y;
        int i6 = ((m) this.f11944z).f12253a;
        synchronized (kVar) {
            m mVar = (m) kVar.B.get(i6);
            if (mVar != 0) {
                Log.w("MessengerIpcClient", "Timing out request: " + i6);
                kVar.B.remove(i6);
                mVar.b(new Exception("Timed out waiting for response", null));
                kVar.c();
            }
        }
    }

    private final void c() {
        synchronized (((s9.l) this.f11944z).f12274z) {
            ((s9.c) ((s9.l) this.f11944z).A).onComplete((Task) this.f11943y);
        }
    }

    private final void d() {
        synchronized (((s9.l) this.f11944z).f12274z) {
            s9.d dVar = (s9.d) ((s9.l) this.f11944z).A;
            Exception e10 = ((Task) this.f11943y).e();
            x.g(e10);
            dVar.onFailure(e10);
        }
    }

    private final void e() {
        synchronized (((s9.l) this.f11944z).f12274z) {
            ((s9.e) ((s9.l) this.f11944z).A).onSuccess(((Task) this.f11943y).f());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f11943y).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f11943y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        rb.j.C.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f11943y), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            java.lang.Object r2 = r10.f11944z     // Catch: java.lang.Throwable -> L58
            rb.j r2 = (rb.j) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f11946y     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f11944z     // Catch: java.lang.Throwable -> L20
            rb.j r0 = (rb.j) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f11947z     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.A     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.A = r6     // Catch: java.lang.Throwable -> L20
            r0.f11947z = r5     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r4 = r10.f11944z     // Catch: java.lang.Throwable -> L20
            rb.j r4 = (rb.j) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f11946y     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f11943y = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f11944z     // Catch: java.lang.Throwable -> L20
            rb.j r0 = (rb.j) r0     // Catch: java.lang.Throwable -> L20
            r0.f11947z = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f11943y     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f11943y = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = rb.j.C     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f11943y     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f11943y = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.i.f():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        w8.i iVar;
        o oVar;
        int i6;
        ArrayList arrayList;
        switch (this.f11942x) {
            case 0:
                try {
                    f();
                    return;
                } catch (Error e10) {
                    synchronized (((j) this.f11944z).f11946y) {
                        ((j) this.f11944z).f11947z = 1;
                        throw e10;
                    }
                }
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                if (((n) ((Task) this.f11943y)).f12278d) {
                    ((s9.k) this.f11944z).A.n();
                    return;
                }
                try {
                    ((s9.k) this.f11944z).A.m(((s9.k) this.f11944z).f12271z.e((Task) this.f11943y));
                    return;
                } catch (s9.f e11) {
                    if (e11.getCause() instanceof Exception) {
                        ((s9.k) this.f11944z).A.l((Exception) e11.getCause());
                        return;
                    } else {
                        ((s9.k) this.f11944z).A.l(e11);
                        return;
                    }
                } catch (Exception e12) {
                    ((s9.k) this.f11944z).A.l(e12);
                    return;
                }
            case 4:
                s9.k kVar = (s9.k) this.f11944z;
                n nVar = kVar.A;
                try {
                    Task task = (Task) kVar.f12271z.e((Task) this.f11943y);
                    if (task == null) {
                        kVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    p pVar = s9.i.f12265b;
                    task.c(pVar, kVar);
                    task.b(pVar, kVar);
                    task.a(pVar, kVar);
                    return;
                } catch (s9.f e13) {
                    if (e13.getCause() instanceof Exception) {
                        nVar.l((Exception) e13.getCause());
                        return;
                    } else {
                        nVar.l(e13);
                        return;
                    }
                } catch (Exception e14) {
                    nVar.l(e14);
                    return;
                }
            case 5:
                c();
                return;
            case 6:
                d();
                return;
            case 7:
                e();
                return;
            case 8:
                s9.l lVar = (s9.l) this.f11944z;
                try {
                    n b10 = ((s9.g) lVar.f12274z).b(((Task) this.f11943y).f());
                    if (b10 == null) {
                        lVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    p pVar2 = s9.i.f12265b;
                    b10.c(pVar2, lVar);
                    b10.b(pVar2, lVar);
                    b10.a(pVar2, lVar);
                    return;
                } catch (CancellationException unused) {
                    lVar.b();
                    return;
                } catch (s9.f e15) {
                    if (e15.getCause() instanceof Exception) {
                        lVar.onFailure((Exception) e15.getCause());
                        return;
                    } else {
                        lVar.onFailure(e15);
                        return;
                    }
                } catch (Exception e16) {
                    lVar.onFailure(e16);
                    return;
                }
            case 9:
                n nVar2 = (n) this.f11943y;
                try {
                    nVar2.m(((Callable) this.f11944z).call());
                    return;
                } catch (Exception e17) {
                    nVar2.l(e17);
                    return;
                } catch (Throwable th) {
                    nVar2.l(new RuntimeException(th));
                    return;
                }
            case 10:
                td.a aVar = (td.a) this.f11943y;
                HashMap hashMap = ((rg.a) this.f11944z).f11953a;
                if (hashMap.size() > 0) {
                    aVar.onSignalsCollected(new JSONObject(hashMap).toString());
                    return;
                } else {
                    aVar.onSignalsCollected(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
            case 11:
                gf.k kVar2 = (gf.k) this.f11943y;
                try {
                    kVar2.resumeWith(((hb.x) this.f11944z).get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        kVar2.n(cause);
                        return;
                    } else {
                        kVar2.resumeWith(he.a.b(cause));
                        return;
                    }
                }
            case 12:
                t8.b bVar = (t8.b) this.f11943y;
                q2.p pVar3 = (q2.p) this.f11944z;
                u8.a aVar2 = (u8.a) pVar3.f10925y;
                v8.j jVar = (v8.j) ((v8.d) pVar3.C).G.get((v8.a) pVar3.f10926z);
                if (jVar != null) {
                    if (bVar.f12629y == 0) {
                        pVar3.f10924x = true;
                        if (aVar2.m()) {
                            if (pVar3.f10924x && (iVar = (w8.i) pVar3.A) != null) {
                                aVar2.e(iVar, (Set) pVar3.B);
                                return;
                            }
                            return;
                        }
                        try {
                            aVar2.e(null, aVar2.c());
                            return;
                        } catch (SecurityException e18) {
                            Log.e("GoogleApiManager", "Failed to get service from broker. ", e18);
                            aVar2.d("Failed to get service from broker.");
                            jVar.n(new t8.b(10), null);
                            return;
                        }
                    }
                    jVar.n(bVar, null);
                    return;
                }
                return;
            case 13:
                w4.d dVar = (w4.d) this.f11944z;
                w4.e eVar = dVar.B;
                if (eVar.f13856g == dVar.f13847z) {
                    List list = dVar.f13846y;
                    o oVar2 = (o) this.f11943y;
                    Runnable runnable = dVar.A;
                    eVar.f13854e = list;
                    eVar.f13855f = Collections.unmodifiableList(list);
                    v9.b bVar2 = eVar.f13850a;
                    int[] iArr = oVar2.f13964b;
                    ArrayList arrayList2 = oVar2.f13963a;
                    int i10 = oVar2.f13967e;
                    w4.c cVar = oVar2.f13966d;
                    w4.f fVar = new w4.f(bVar2);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i11 = oVar2.f13968f;
                    int size = arrayList2.size() - 1;
                    int i12 = i11;
                    int i13 = i10;
                    while (size >= 0) {
                        w4.n nVar3 = (w4.n) arrayList2.get(size);
                        int i14 = nVar3.f13959a;
                        int i15 = nVar3.f13961c;
                        int i16 = i14 + i15;
                        int i17 = nVar3.f13960b;
                        int[] iArr2 = iArr;
                        int i18 = i17 + i15;
                        while (i13 > i16) {
                            i13--;
                            int i19 = iArr2[i13];
                            if ((i19 & 12) != 0) {
                                i6 = i16;
                                int i20 = i19 >> 4;
                                arrayList = arrayList2;
                                int i21 = i10;
                                w4.p a10 = o.a(arrayDeque, i20, false);
                                if (a10 != null) {
                                    int i22 = (i21 - a10.f13980b) - 1;
                                    fVar.b(i13, i22);
                                    if ((i19 & 4) != 0) {
                                        fVar.e(i22, 1, cVar.e(i13, i20));
                                    }
                                } else {
                                    arrayDeque.add(new w4.p(true, i13, (i21 - i13) - 1));
                                }
                                i10 = i21;
                            } else {
                                i6 = i16;
                                arrayList = arrayList2;
                                fVar.d(i13, 1);
                                i10--;
                            }
                            i16 = i6;
                            arrayList2 = arrayList;
                        }
                        ArrayList arrayList3 = arrayList2;
                        while (i12 > i18) {
                            i12--;
                            int i23 = oVar2.f13965c[i12];
                            if ((i23 & 12) != 0) {
                                int i24 = i23 >> 4;
                                oVar = oVar2;
                                if (o.a(arrayDeque, i24, true) == null) {
                                    arrayDeque.add(new w4.p(false, i12, i10 - i13));
                                } else {
                                    fVar.b((i10 - r6.f13980b) - 1, i13);
                                    if ((i23 & 4) != 0) {
                                        fVar.e(i13, 1, cVar.e(i24, i12));
                                    }
                                }
                            } else {
                                oVar = oVar2;
                                fVar.c(i13, 1);
                                i10++;
                            }
                            oVar2 = oVar;
                        }
                        o oVar3 = oVar2;
                        int i25 = i17;
                        int i26 = i14;
                        for (int i27 = 0; i27 < i15; i27++) {
                            if ((iArr2[i26] & 15) == 2) {
                                fVar.e(i26, 1, cVar.e(i26, i25));
                            }
                            i26++;
                            i25++;
                        }
                        size--;
                        i12 = i17;
                        i13 = i14;
                        iArr = iArr2;
                        oVar2 = oVar3;
                        arrayList2 = arrayList3;
                    }
                    fVar.a();
                    eVar.a(runnable);
                    return;
                }
                return;
            case 14:
                wc.g.b((WebView) this.f11943y, (String) this.f11944z);
                return;
            case 15:
                v5.o f3 = v5.o.f();
                String str = x5.a.f14684d;
                e6.i iVar2 = (e6.i) this.f11943y;
                f3.b(str, r4.a.k("Scheduling work ", iVar2.f4371a), new Throwable[0]);
                ((x5.a) this.f11944z).f14685a.f(iVar2);
                return;
            default:
                a1.f fVar2 = ((SwipeDismissBehavior) this.f11944z).f2600a;
                if (fVar2 != null && fVar2.f()) {
                    ((View) this.f11943y).postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f11942x) {
            case 0:
                Runnable runnable = (Runnable) this.f11943y;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i6 = ((j) this.f11944z).f11947z;
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i6, boolean z10) {
        this.f11942x = i6;
        this.f11944z = obj;
        this.f11943y = obj2;
    }

    public i(wc.g gVar, WebView webView, String str) {
        this.f11942x = 14;
        this.f11943y = webView;
        this.f11944z = str;
    }

    public i(j jVar) {
        this.f11942x = 0;
        this.f11944z = jVar;
    }

    public i(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.f11942x = 16;
        this.f11944z = swipeDismissBehavior;
        this.f11943y = view;
    }
}
