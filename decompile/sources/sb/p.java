package sb;

import ac.z0;
import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.q0;
import androidx.fragment.app.t0;
import androidx.fragment.app.x0;
import com.google.android.gms.internal.measurement.t4;
import d1.b0;
import d1.e0;
import d1.y0;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k8.d1;
import k8.f0;
import k8.p1;
import k8.v0;
import o2.j1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y9.c0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements cc.b, t3.m, c7.b, vf.s {
    public static p A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f11742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f11743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f11744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f11745z;

    public /* synthetic */ p(int i, boolean z2) {
        this.f11741v = i;
    }

    public static void B(p pVar, jf.k kVar, jf.k kVar2, int i) {
        ef.l lVar;
        if ((i & 1) != 0) {
            kVar = null;
        }
        if ((i & 4) != 0) {
            kVar2 = null;
        }
        pVar.getClass();
        TimeZone timeZone = ff.f.f5401a;
        boolean zIsShutdown = ((ThreadPoolExecutor) pVar.i()).isShutdown();
        synchronized (pVar) {
            if (kVar2 != null) {
                try {
                    kVar2.f7163w.decrementAndGet();
                    if (!((ArrayDeque) pVar.f11743x).remove(kVar2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (kVar != null) {
                ((ArrayDeque) pVar.f11745z).add(kVar);
                jf.k kVarL = pVar.l(((ef.s) kVar.f7164x.f7168w.f2888b).f5038d);
                if (kVarL != null) {
                    kVar.f7163w = kVarL.f7163w;
                }
            }
            if (kVar2 != null && (zIsShutdown || ((ArrayDeque) pVar.f11743x).isEmpty())) {
                ((ArrayDeque) pVar.f11744y).isEmpty();
            }
            if (zIsShutdown) {
                List listO = pd.j.O((ArrayDeque) pVar.f11745z);
                ((ArrayDeque) pVar.f11745z).clear();
                lVar = new ef.l(listO);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) pVar.f11745z).iterator();
                de.i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    jf.k kVar3 = (jf.k) it.next();
                    if (((ArrayDeque) pVar.f11743x).size() >= 64) {
                        break;
                    }
                    if (kVar3.f7163w.get() < 5) {
                        it.remove();
                        kVar3.f7163w.incrementAndGet();
                        arrayList.add(kVar3);
                        ((ArrayDeque) pVar.f11743x).add(kVar3);
                    }
                }
                lVar = new ef.l(arrayList);
            }
        }
        int size = lVar.f5015v.size();
        for (int i10 = 0; i10 < size; i10++) {
            jf.k kVar4 = (jf.k) lVar.f5015v.get(i10);
            if (kVar4 != kVar) {
                jf.n nVar = kVar4.f7164x;
            }
            if (zIsShutdown) {
                kVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                kVar4.f7164x.i(interruptedIOException);
                kVar4.f7162v.c(interruptedIOException);
            } else {
                ExecutorService executorServiceI = pVar.i();
                kVar4.getClass();
                jf.n nVar2 = kVar4.f7164x;
                de.i.e(nVar2.f7167v.f5068a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceI).execute(kVar4);
                    } catch (RejectedExecutionException e7) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e7);
                        kVar4.f7164x.i(interruptedIOException2);
                        kVar4.f7162v.c(interruptedIOException2);
                        p pVar2 = nVar2.f7167v.f5068a;
                        pVar2.getClass();
                        B(pVar2, null, kVar4, 3);
                    }
                } catch (Throwable th2) {
                    p pVar3 = nVar2.f7167v.f5068a;
                    pVar3.getClass();
                    B(pVar3, null, kVar4, 3);
                    throw th2;
                }
            }
        }
    }

    public static void C(long j8, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j8) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static synchronized p s() {
        try {
            if (A == null) {
                A = new p(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return A;
    }

    public boolean A(m.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f11742w;
        m.e eVarN = n(aVar);
        v.i iVar = (v.i) this.f11745z;
        Menu a0Var = (Menu) iVar.get(menu);
        if (a0Var == null) {
            a0Var = new n.a0((Context) this.f11743x, (n.l) menu);
            iVar.put(menu, a0Var);
        }
        return callback.onCreateActionMode(eVarN, a0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ue.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object F(ud.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof d1.b1
            if (r0 == 0) goto L13
            r0 = r8
            d1.b1 r0 = (d1.b1) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            d1.b1 r0 = new d1.b1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.A
            int r1 = r0.C
            r2 = 2
            r3 = 1
            od.l r4 = od.l.f10126a
            r5 = 0
            td.a r6 = td.a.f12544v
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            ue.a r1 = r0.f3854z
            sb.p r0 = r0.f3853y
            fa.b.z(r8)     // Catch: java.lang.Throwable -> L31
            goto L80
        L31:
            r8 = move-exception
            goto L8b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            ue.a r1 = r0.f3854z
            sb.p r3 = r0.f3853y
            fa.b.z(r8)
            goto L64
        L43:
            fa.b.z(r8)
            java.lang.Object r8 = r7.f11743x
            me.n r8 = (me.n) r8
            boolean r8 = r8.L()
            if (r8 == 0) goto L51
            return r4
        L51:
            java.lang.Object r8 = r7.f11742w
            ue.c r8 = (ue.c) r8
            r0.f3853y = r7
            r0.f3854z = r8
            r0.C = r3
            java.lang.Object r1 = r8.a(r0)
            if (r1 != r6) goto L62
            goto L7e
        L62:
            r3 = r7
            r1 = r8
        L64:
            java.lang.Object r8 = r3.f11743x     // Catch: java.lang.Throwable -> L31
            me.n r8 = (me.n) r8     // Catch: java.lang.Throwable -> L31
            boolean r8 = r8.L()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L72
            r1.i(r5)
            return r4
        L72:
            r0.f3853y = r3     // Catch: java.lang.Throwable -> L31
            r0.f3854z = r1     // Catch: java.lang.Throwable -> L31
            r0.C = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r3.h(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 != r6) goto L7f
        L7e:
            return r6
        L7f:
            r0 = r3
        L80:
            java.lang.Object r8 = r0.f11743x     // Catch: java.lang.Throwable -> L31
            me.n r8 = (me.n) r8     // Catch: java.lang.Throwable -> L31
            r8.N(r4)     // Catch: java.lang.Throwable -> L31
            r1.i(r5)
            return r4
        L8b:
            r1.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.p.F(ud.c):java.lang.Object");
    }

    public g2.b G(List list) {
        g2.b bVar;
        HashMap map = (HashMap) this.f11744y;
        ArrayList arrayListE = e(list);
        if (arrayListE.size() < 2) {
            return (g2.b) y9.p.k(arrayListE, null);
        }
        Collections.sort(arrayListE, new c4.d(2));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i10 = ((g2.b) arrayListE.get(0)).f5413c;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayListE.size()) {
                break;
            }
            g2.b bVar2 = (g2.b) arrayListE.get(i11);
            if (i10 == bVar2.f5413c) {
                arrayList.add(new Pair(bVar2.f5412b, Integer.valueOf(bVar2.f5414d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (g2.b) arrayListE.get(0);
            }
        }
        g2.b bVar3 = (g2.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListE.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < listSubList.size(); i13++) {
            i12 += ((g2.b) listSubList.get(i13)).f5414d;
        }
        int iNextInt = ((Random) this.f11745z).nextInt(i12);
        int i14 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                bVar = (g2.b) y9.p.l(listSubList);
                break;
            }
            bVar = (g2.b) listSubList.get(i);
            i14 += bVar.f5414d;
            if (iNextInt < i14) {
                break;
            }
            i++;
        }
        map.put(arrayList, bVar);
        return bVar;
    }

    public Bundle H(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f11744y;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle I() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.p.I():android.os.Bundle");
    }

    public void J(Bundle bundle) {
        String str = (String) this.f11742w;
        d1 d1Var = (d1) this.f11745z;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesH = d1Var.H();
        p1 p1Var = (p1) d1Var.f2053w;
        SharedPreferences.Editor editorEdit = sharedPreferencesH.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        t4.a();
                        if (p1Var.f7695y.O(null, f0.Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                v0 v0Var = p1Var.A;
                                p1.l(v0Var);
                                v0Var.B.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                v0 v0Var2 = p1Var.A;
                                p1.l(v0Var2);
                                v0Var2.B.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e7) {
                        v0 v0Var3 = p1Var.A;
                        p1.l(v0Var3);
                        v0Var3.B.b(e7, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f11744y = bundle2;
    }

    public void a(androidx.fragment.app.y yVar) {
        if (((ArrayList) this.f11742w).contains(yVar)) {
            throw new IllegalStateException("Fragment already added: " + yVar);
        }
        synchronized (((ArrayList) this.f11742w)) {
            ((ArrayList) this.f11742w).add(yVar);
        }
        yVar.G = true;
    }

    public void b(h4.d dVar) {
        if (((LinkedHashSet) this.f11745z).add(dVar)) {
            ((h4.e) this.f11743x).a(this, dVar, -1);
        }
    }

    @Override // vf.s
    public vf.t c() {
        return (wf.d) this.f11744y;
    }

    public void d(h4.h hVar, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(d0.d.h(i, "Unsupported priority value: ").toString());
        }
        if (((LinkedHashSet) this.f11745z).add(hVar)) {
            ((h4.e) this.f11743x).a(this, hVar, i);
        }
    }

    public ArrayList e(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f11742w;
        C(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f11743x;
        C(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            g2.b bVar = (g2.b) list.get(i);
            if (!map.containsKey(bVar.f5412b) && !map2.containsKey(Integer.valueOf(bVar.f5413c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((v.i) this.f11743x).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                f(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void g(h4.d dVar, h4.b bVar) {
        h4.e eVar = (h4.e) this.f11743x;
        eVar.getClass();
        if (eVar.f6133g != 0) {
            return;
        }
        c.x xVarC = eVar.c(-1);
        eVar.f = xVarC;
        eVar.f6133g = -1;
        eVar.f6134h = dVar;
        if (bVar != null) {
            if (xVarC != null) {
                xVarC.f1675d.getClass();
            }
            pe.x xVar = eVar.f6128a;
            h4.g gVar = new h4.g(bVar);
            xVar.getClass();
            xVar.P(null, gVar);
        }
    }

    @Override // nd.a
    public Object get() {
        switch (this.f11741v) {
            case 1:
                return new ac.p((fa.g) ((cc.c) this.f11742w).f2288v, (dc.k) ((cc.d) this.f11743x).get(), (sd.h) ((cc.d) this.f11744y).get(), (z0) ((cc.d) this.f11745z).get());
            default:
                return new p((Executor) ((nd.a) this.f11742w).get(), (h7.d) ((nd.a) this.f11743x).get(), (a7.j) ((a7.j) this.f11744y).get(), (i7.c) ((nd.a) this.f11745z).get(), 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(ud.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11745z
            d1.e0 r0 = (d1.e0) r0
            boolean r1 = r7 instanceof d1.i
            if (r1 == 0) goto L17
            r1 = r7
            d1.i r1 = (d1.i) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.B = r2
            goto L1c
        L17:
            d1.i r1 = new d1.i
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f3890z
            int r2 = r1.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            sb.p r0 = r1.f3889y
            fa.b.z(r7)
            goto L64
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            sb.p r0 = r1.f3889y
            fa.b.z(r7)
            goto L74
        L3c:
            fa.b.z(r7)
            java.lang.Object r7 = r6.f11744y
            java.util.List r7 = (java.util.List) r7
            td.a r2 = td.a.f12544v
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            d1.p0 r7 = r0.h()
            d1.l r4 = new d1.l
            r5 = 0
            r4.<init>(r0, r6, r5)
            r1.f3889y = r6
            r1.B = r3
            java.lang.Object r7 = r7.a(r4, r1)
            if (r7 != r2) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            d1.d r7 = (d1.d) r7
            goto L76
        L67:
            r1.f3889y = r6
            r1.B = r4
            r7 = 0
            java.lang.Object r7 = d1.e0.g(r0, r7, r1)
            if (r7 != r2) goto L73
        L72:
            return r2
        L73:
            r0 = r6
        L74:
            d1.d r7 = (d1.d) r7
        L76:
            java.lang.Object r0 = r0.f11745z
            d1.e0 r0 = (d1.e0) r0
            s5.d r0 = r0.f3870h
            r0.A(r7)
            od.l r7 = od.l.f10126a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.p.h(ud.c):java.lang.Object");
    }

    public synchronized ExecutorService i() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f11742w) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = ff.f.f5402b + " Dispatcher";
                de.i.e(str, "name");
                this.f11742w = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ff.e(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f11742w;
            de.i.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // t3.m
    public /* synthetic */ t3.d j(byte[] bArr, int i, int i10) {
        int i11 = this.f11741v;
        return d0.d.a(this, bArr, i10);
    }

    public androidx.fragment.app.y k(String str) {
        x0 x0Var = (x0) ((HashMap) this.f11743x).get(str);
        if (x0Var != null) {
            return x0Var.f1130c;
        }
        return null;
    }

    public jf.k l(String str) {
        Iterator it = ((ArrayDeque) this.f11743x).iterator();
        de.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            jf.k kVar = (jf.k) it.next();
            if (de.i.a(((ef.s) kVar.f7164x.f7168w.f2888b).f5038d, str)) {
                return kVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f11745z).iterator();
        de.i.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            jf.k kVar2 = (jf.k) it2.next();
            if (de.i.a(((ef.s) kVar2.f7164x.f7168w.f2888b).f5038d, str)) {
                return kVar2;
            }
        }
        return null;
    }

    public androidx.fragment.app.y m(String str) {
        for (x0 x0Var : ((HashMap) this.f11743x).values()) {
            if (x0Var != null) {
                androidx.fragment.app.y yVarM = x0Var.f1130c;
                if (!str.equals(yVarM.A)) {
                    yVarM = yVarM.P.f1070c.m(str);
                }
                if (yVarM != null) {
                    return yVarM;
                }
            }
        }
        return null;
    }

    public m.e n(m.a aVar) {
        ArrayList arrayList = (ArrayList) this.f11744y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m.e eVar = (m.e) arrayList.get(i);
            if (eVar != null && eVar.f8375b == aVar) {
                return eVar;
            }
        }
        m.e eVar2 = new m.e((Context) this.f11743x, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    @Override // t3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(byte[] r43, int r44, int r45, t3.l r46, w1.f r47) {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.p.o(byte[], int, int, t3.l, w1.f):void");
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (x0 x0Var : ((HashMap) this.f11743x).values()) {
            if (x0Var != null) {
                arrayList.add(x0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (x0 x0Var : ((HashMap) this.f11743x).values()) {
            if (x0Var != null) {
                arrayList.add(x0Var.f1130c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List r() {
        ArrayList arrayList;
        if (((ArrayList) this.f11742w).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f11742w)) {
            arrayList = new ArrayList((ArrayList) this.f11742w);
        }
        return arrayList;
    }

    @Override // t3.m
    public /* synthetic */ void reset() {
        int i = this.f11741v;
    }

    @Override // t3.m
    public int t() {
        switch (this.f11741v) {
        }
        return 2;
    }

    public String toString() {
        switch (this.f11741v) {
            case 27:
                String string = ((Socket) this.f11742w).toString();
                de.i.d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public boolean u(Context context) {
        if (((Boolean) this.f11744y) == null) {
            this.f11744y = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f11743x).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11744y).booleanValue();
    }

    public boolean v(Context context) {
        if (((Boolean) this.f11743x) == null) {
            this.f11743x = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f11743x).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11743x).booleanValue();
    }

    public void w(x0 x0Var) {
        androidx.fragment.app.y yVar = x0Var.f1130c;
        String str = yVar.A;
        HashMap map = (HashMap) this.f11743x;
        if (map.get(str) != null) {
            return;
        }
        map.put(yVar.A, x0Var);
        if (yVar.X) {
            if (yVar.W) {
                ((t0) this.f11745z).c(yVar);
            } else {
                ((t0) this.f11745z).f(yVar);
            }
            yVar.X = false;
        }
        if (q0.I(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + yVar);
        }
    }

    @Override // vf.s
    public vf.r x() {
        return (wf.c) this.f11745z;
    }

    public void y(x0 x0Var) {
        HashMap map = (HashMap) this.f11743x;
        androidx.fragment.app.y yVar = x0Var.f1130c;
        if (yVar.W) {
            ((t0) this.f11745z).f(yVar);
        }
        if (map.get(yVar.A) == x0Var && ((x0) map.put(yVar.A, null)) != null && q0.I(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + yVar);
        }
    }

    public boolean z(m.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f11742w).onActionItemClicked(n(aVar), new n.s((Context) this.f11743x, (n0.a) menuItem));
    }

    public /* synthetic */ p(ViewGroup viewGroup, View view, View view2, ViewGroup viewGroup2, Object obj, int i) {
        this.f11741v = i;
        this.f11742w = view;
        this.f11743x = view2;
        this.f11744y = viewGroup2;
        this.f11745z = obj;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11741v = i;
        this.f11742w = obj;
        this.f11743x = obj2;
        this.f11744y = obj3;
        this.f11745z = obj4;
    }

    public p(d1 d1Var, String str) {
        this.f11741v = 22;
        this.f11745z = d1Var;
        t7.y.d(str);
        this.f11742w = str;
        this.f11743x = new Bundle();
    }

    public p(me.v vVar, b0 b0Var, ac.o oVar) {
        this.f11741v = 7;
        this.f11742w = vVar;
        this.f11743x = oVar;
        this.f11744y = p4.v.d(Integer.MAX_VALUE, null, 6);
        this.f11745z = new a9.g(9);
        me.v0 v0Var = (me.v0) vVar.b().A(me.t.f8732w);
        if (v0Var != null) {
            ((me.d1) v0Var).K(true, new me.j(2, new y0(1, b0Var, this)));
        }
    }

    public p(Socket socket) {
        this.f11741v = 27;
        this.f11742w = socket;
        this.f11743x = new AtomicInteger();
        this.f11744y = new wf.d(this);
        this.f11745z = new wf.c(this);
    }

    public p(androidx.fragment.app.d1 d1Var) {
        this.f11741v = 16;
        this.f11742w = d1Var;
        this.f11743x = new h4.e();
        new LinkedHashSet();
        this.f11744y = new LinkedHashSet();
        this.f11745z = new LinkedHashSet();
    }

    public p(List list) {
        int i;
        this.f11741v = 4;
        this.f11742w = new w1.t();
        this.f11743x = new w1.t();
        b4.a aVar = new b4.a();
        this.f11744y = aVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i10 = w1.b0.f13686a;
        for (String str : strTrim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                aVar.f1550d = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int[] iArr = aVar.f1550d;
                    try {
                        i = Integer.parseInt(strArrSplit[i11].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i11] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        aVar.f1551e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f = Integer.parseInt(strArrSplit2[1]);
                        aVar.f1548b = true;
                    } catch (RuntimeException e7) {
                        w1.a.D("VobsubParser", "Parsing IDX failed", e7);
                    }
                }
            }
        }
    }

    private final /* synthetic */ void D() {
    }

    private final /* synthetic */ void E() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(h0.m mVar) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i10;
        this.f11741v = 15;
        new ArrayList();
        this.f11745z = new Bundle();
        this.f11744y = mVar;
        Context context = mVar.f6024a;
        ArrayList arrayList2 = mVar.f6041t;
        ArrayList arrayList3 = mVar.f6026c;
        ArrayList arrayList4 = mVar.f6027d;
        this.f11742w = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11743x = h0.o.a(context, mVar.f6038q);
        } else {
            this.f11743x = new Notification.Builder(context);
        }
        Notification notification = mVar.f6040s;
        Context context2 = null;
        ((Notification.Builder) this.f11743x).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mVar.f6028e).setContentText(mVar.f).setContentInfo(null).setContentIntent(mVar.f6029g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(mVar.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f11743x;
        IconCompat iconCompat = mVar.f6030h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.f11743x).setSubText(null).setUsesChronometer(false).setPriority(mVar.f6031j);
        ArrayList arrayList5 = mVar.f6025b;
        int size = arrayList5.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList5.get(i11);
            i11++;
            h0.g gVar = (h0.g) obj;
            int i12 = Build.VERSION.SDK_INT;
            if (gVar.f6015b == null && (i10 = gVar.f6018e) != 0) {
                gVar.f6015b = IconCompat.b(i10);
            }
            IconCompat iconCompat2 = gVar.f6015b;
            boolean z2 = gVar.f6016c;
            Bundle bundle3 = gVar.f6014a;
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = arrayList3;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, gVar.f, gVar.f6019g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z2);
            if (i12 >= 24) {
                h0.n.b(builder2, z2);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i12 >= 28) {
                h0.p.a(builder2);
            }
            if (i12 >= 29) {
                h0.d.d(builder2);
            }
            if (i12 >= 31) {
                h0.q.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", gVar.f6017d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f11743x).addAction(builder2.build());
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
            context2 = null;
        }
        ArrayList arrayList8 = arrayList3;
        Bundle bundle4 = mVar.f6035n;
        if (bundle4 != null) {
            ((Bundle) this.f11745z).putAll(bundle4);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f11743x).setShowWhen(mVar.f6032k);
        ((Notification.Builder) this.f11743x).setLocalOnly(mVar.f6034m);
        ((Notification.Builder) this.f11743x).setGroup(null);
        ((Notification.Builder) this.f11743x).setSortKey(null);
        ((Notification.Builder) this.f11743x).setGroupSummary(false);
        ((Notification.Builder) this.f11743x).setCategory(null);
        ((Notification.Builder) this.f11743x).setColor(mVar.f6036o);
        ((Notification.Builder) this.f11743x).setVisibility(mVar.f6037p);
        ((Notification.Builder) this.f11743x).setPublicVersion(null);
        ((Notification.Builder) this.f11743x).setSound(notification.sound, notification.audioAttributes);
        if (i13 < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    throw d0.d.g(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    v.f fVar = new v.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                ((Notification.Builder) this.f11743x).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (mVar.f6035n == null) {
                mVar.f6035n = new Bundle();
            }
            Bundle bundle5 = mVar.f6035n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                String string = Integer.toString(i15);
                h0.g gVar2 = (h0.g) arrayList4.get(i15);
                Bundle bundle8 = new Bundle();
                if (gVar2.f6015b == null && (i = gVar2.f6018e) != 0) {
                    gVar2.f6015b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = gVar2.f6015b;
                Bundle bundle9 = gVar2.f6014a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", gVar2.f);
                bundle8.putParcelable("actionIntent", gVar2.f6019g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", gVar2.f6016c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", gVar2.f6017d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (mVar.f6035n == null) {
                mVar.f6035n = new Bundle();
            }
            mVar.f6035n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f11745z).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            ((Notification.Builder) this.f11743x).setExtras(mVar.f6035n);
            h0.n.c((Notification.Builder) this.f11743x);
        }
        if (i16 >= 26) {
            h0.o.b((Notification.Builder) this.f11743x);
            h0.o.d((Notification.Builder) this.f11743x);
            h0.o.e((Notification.Builder) this.f11743x);
            h0.o.f((Notification.Builder) this.f11743x);
            h0.o.c((Notification.Builder) this.f11743x);
            if (!TextUtils.isEmpty(mVar.f6038q)) {
                ((Notification.Builder) this.f11743x).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                throw d0.d.g(it2);
            }
        }
        if (i16 >= 29) {
            h0.d.b((Notification.Builder) this.f11743x, mVar.f6039r);
            h0.d.c((Notification.Builder) this.f11743x);
        }
    }

    public p(Typeface typeface, j1.b bVar) {
        int i;
        int i10;
        int i11;
        int i12;
        this.f11741v = 2;
        this.f11745z = typeface;
        this.f11742w = bVar;
        this.f11744y = new androidx.emoji2.text.y(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i13 = iA + bVar.f6646v;
            i = ((ByteBuffer) bVar.f6649y).getInt(((ByteBuffer) bVar.f6649y).getInt(i13) + i13);
        } else {
            i = 0;
        }
        this.f11743x = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + bVar.f6646v;
            i10 = ((ByteBuffer) bVar.f6649y).getInt(((ByteBuffer) bVar.f6649y).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.b0 b0Var = new androidx.emoji2.text.b0(this, i15);
            j1.a aVarB = b0Var.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f6649y).getInt(iA3 + aVarB.f6646v) : 0, (char[]) this.f11743x, i15 * 2);
            j1.a aVarB2 = b0Var.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + aVarB2.f6646v;
                i11 = ((ByteBuffer) aVarB2.f6649y).getInt(((ByteBuffer) aVarB2.f6649y).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            u1.c.d("invalid metadata codepoint length", i11 > 0);
            androidx.emoji2.text.y yVar = (androidx.emoji2.text.y) this.f11744y;
            j1.a aVarB3 = b0Var.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + aVarB3.f6646v;
                i12 = ((ByteBuffer) aVarB3.f6649y).getInt(((ByteBuffer) aVarB3.f6649y).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            yVar.a(b0Var, 0, i12 - 1);
        }
    }

    public p(Context context, View view) {
        this.f11741v = 24;
        int i = g.a.popupMenuStyle;
        this.f11743x = view;
        n.l lVar = new n.l(context);
        this.f11742w = lVar;
        lVar.f8898e = new ka.c(this);
        n.v vVar = new n.v(context, lVar, view, false, i, 0);
        this.f11744y = vVar;
        vVar.f = 0;
        vVar.f8962j = new n.u(1, this);
    }

    public p(int i) {
        this.f11741v = i;
        switch (i) {
            case 3:
                this.f11742w = new ArrayList();
                this.f11743x = new HashMap();
                this.f11744y = new HashMap();
                break;
            case 9:
                this.f11742w = new v.e(0);
                this.f11743x = new SparseArray();
                this.f11744y = new v.g();
                this.f11745z = new v.e(0);
                break;
            case 10:
                this.f11745z = new ArrayDeque();
                this.f11743x = new ArrayDeque();
                this.f11744y = new ArrayDeque();
                break;
            case 11:
                this.f11742w = new s0.d(10);
                this.f11743x = new v.i(0);
                this.f11744y = new ArrayList();
                this.f11745z = new HashSet();
                break;
            case 12:
                Random random = new Random();
                this.f11744y = new HashMap();
                this.f11745z = random;
                this.f11742w = new HashMap();
                this.f11743x = new HashMap();
                break;
            case 26:
                this.f11742w = new w1.t();
                this.f11743x = new w1.t();
                this.f11744y = new w3.a();
                break;
            default:
                this.f11742w = null;
                this.f11743x = null;
                this.f11744y = null;
                this.f11745z = new ArrayDeque();
                break;
        }
    }

    public p(Context context, ActionMode.Callback callback) {
        this.f11741v = 23;
        this.f11743x = context;
        this.f11742w = callback;
        this.f11744y = new ArrayList();
        this.f11745z = new v.i(0);
    }

    public p(y9.z0 z0Var, x1.i iVar, ob.d dVar, x1.i iVar2) {
        Object objM;
        this.f11741v = 28;
        if (z0Var != null) {
            objM = y9.f0.m(z0Var);
        } else {
            c0 c0Var = y9.f0.f14553w;
            objM = y9.z0.f14637z;
        }
        this.f11742w = objM;
        this.f11743x = iVar;
        this.f11744y = dVar;
        this.f11745z = iVar2;
    }

    public p(e0 e0Var, List list) {
        this.f11741v = 6;
        this.f11745z = e0Var;
        this.f11742w = new ue.c();
        this.f11743x = me.x.a();
        this.f11744y = pd.j.O(list);
    }

    public p(j1 j1Var, boolean[] zArr) {
        this.f11741v = 25;
        this.f11742w = j1Var;
        this.f11743x = zArr;
        int i = j1Var.f9468a;
        this.f11744y = new boolean[i];
        this.f11745z = new boolean[i];
    }
}
