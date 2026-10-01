package n9;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.playfy.tv.R;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements o2, w0, s9.c, u6.f, v0.g, kf.h {
    public static j B;
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9354x;

    /* renamed from: y, reason: collision with root package name */
    public Object f9355y;

    /* renamed from: z, reason: collision with root package name */
    public Object f9356z;

    public /* synthetic */ j(int i6) {
        this.f9354x = i6;
    }

    public static boolean D(v6.k kVar, Bitmap.Config config) {
        if (a8.b.g(config)) {
            if (kVar.f13391l) {
                x6.a aVar = kVar.f13383c;
                if (aVar instanceof x6.a) {
                    ImageView imageView = aVar.f14692y;
                    if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static j E(Context context, AttributeSet attributeSet, int[] iArr, int i6) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i6, 0));
    }

    public static final void f(j jVar, Network network, boolean z10) {
        boolean z11;
        Network[] allNetworks = ((ConnectivityManager) jVar.f9355y).getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Network network2 = allNetworks[i6];
            if (kotlin.jvm.internal.k.a(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) jVar.f9355y).getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                z12 = true;
                break;
            }
            i6++;
        }
        a7.l lVar = (a7.l) jVar.f9356z;
        synchronized (lVar) {
            try {
                if (((l6.k) lVar.f613x.get()) != null) {
                    lVar.B = z12;
                } else {
                    lVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static v6.f p(v6.k kVar, Throwable th) {
        Drawable b10;
        if (th instanceof v6.n) {
            kVar.getClass();
            v6.c cVar = kVar.C;
            cVar.getClass();
            v6.c cVar2 = a7.d.f593a;
            Integer num = kVar.A;
            cVar.getClass();
            b10 = a7.d.b(kVar, num);
        } else {
            Integer num2 = kVar.A;
            kVar.C.getClass();
            b10 = a7.d.b(kVar, num2);
        }
        return new v6.f(b10, kVar, th);
    }

    public int A() {
        return ((RecyclerView) ((a2.a2) this.f9355y).f162y).getChildCount();
    }

    public void B(View view) {
        ((ArrayList) this.A).add(view);
        a2.a2 a2Var = (a2.a2) this.f9355y;
        w4.i1 J = RecyclerView.J(view);
        if (J != null) {
            View view2 = J.f13897a;
            RecyclerView recyclerView = (RecyclerView) a2Var.f162y;
            int i6 = J.f13912q;
            if (i6 != -1) {
                J.f13911p = i6;
            } else {
                WeakHashMap weakHashMap = t0.q0.f12397a;
                J.f13911p = view2.getImportantForAccessibility();
            }
            if (recyclerView.M()) {
                J.f13912q = 4;
                recyclerView.Q0.add(J);
            } else {
                WeakHashMap weakHashMap2 = t0.q0.f12397a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r1.A != r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r1.A != r11) goto L24;
     */
    /* JADX WARN: Type inference failed for: r11v3, types: [db.e0, db.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(w1.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, q2.s0 r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j.C(w1.h, android.net.Uri, java.util.Map, long, long, q2.s0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0033, code lost:
    
        if (((a7.i) r16.A).a(r18) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v6.o F(v6.k r17, w6.h r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f13387g
            android.graphics.Bitmap$Config r2 = r0.f13385e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = a7.f.f595a
            boolean r1 = ie.i.Z(r1, r2)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L36
        L1a:
            boolean r1 = a8.b.g(r2)
            if (r1 != 0) goto L23
            r1 = r16
            goto L38
        L23:
            boolean r1 = D(r0, r2)
            if (r1 == 0) goto L17
            r1 = r16
            java.lang.Object r3 = r1.A
            a7.i r3 = (a7.i) r3
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L36
            goto L38
        L36:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L38:
            e9.f r3 = r4.f14135a
            w6.b r5 = w6.b.f14124k
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4f
            e9.f r3 = r4.f14136b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L4b
            goto L4f
        L4b:
            w6.g r3 = r0.f13402x
        L4d:
            r5 = r3
            goto L52
        L4f:
            w6.g r3 = w6.g.f14132y
            goto L4d
        L52:
            boolean r3 = r0.f13392m
            if (r3 == 0) goto L65
            java.util.List r3 = r0.f13387g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L65
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L65
            r3 = 1
            r7 = 1
            goto L67
        L65:
            r3 = 0
            r7 = 0
        L67:
            v6.o r3 = new v6.o
            android.content.Context r1 = r0.f13381a
            boolean r6 = a7.d.a(r0)
            boolean r8 = r0.f13393n
            okhttp3.Headers r10 = r0.f13389i
            v6.t r11 = r0.j
            v6.q r12 = r0.f13403y
            v6.b r13 = r0.f13394o
            v6.b r14 = r0.f13395p
            v6.b r15 = r0.f13396q
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j.F(v6.k, w6.h):v6.o");
    }

    public void G() {
        ((TypedArray) this.f9356z).recycle();
    }

    public Object H(kotlin.jvm.internal.e eVar, qg.a scopeQualifier, b4.h hVar) {
        Object obj;
        kotlin.jvm.internal.k.e(scopeQualifier, "scopeQualifier");
        lg.b bVar = (lg.b) ((ConcurrentHashMap) this.f9356z).get(ug.a.a(eVar) + ':' + HttpUrl.FRAGMENT_ENCODE_SET + ':' + scopeQualifier);
        if (bVar != null) {
            obj = bVar.b(hVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public void I(View view) {
        if (((ArrayList) this.A).remove(view)) {
            a2.a2 a2Var = (a2.a2) this.f9355y;
            w4.i1 J = RecyclerView.J(view);
            if (J != null) {
                RecyclerView recyclerView = (RecyclerView) a2Var.f162y;
                int i6 = J.f13911p;
                if (recyclerView.M()) {
                    J.f13912q = i6;
                    recyclerView.Q0.add(J);
                } else {
                    View view2 = J.f13897a;
                    WeakHashMap weakHashMap = t0.q0.f12397a;
                    view2.setImportantForAccessibility(i6);
                }
                J.f13911p = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v6.o J(v6.o r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f13408b
            v6.b r3 = r0.f13420o
            boolean r4 = a8.b.g(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.A
            a7.i r4 = (a7.i) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = 1
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            v6.b r2 = r0.f13420o
            boolean r2 = r2.f13341x
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.f9356z
            a7.l r2 = (a7.l) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L39
            boolean r6 = r2.B     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            if (r6 != 0) goto L3c
            v6.b r3 = v6.b.DISABLED
        L36:
            r21 = r3
            goto L3e
        L39:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            r5 = r4
            goto L36
        L3e:
            if (r5 == 0) goto L6a
            android.content.Context r7 = r0.f13407a
            android.graphics.ColorSpace r9 = r0.f13409c
            w6.h r10 = r0.f13410d
            w6.g r11 = r0.f13411e
            boolean r12 = r0.f13412f
            boolean r13 = r0.f13413g
            boolean r14 = r0.f13414h
            java.lang.String r15 = r0.f13415i
            okhttp3.Headers r2 = r0.j
            v6.t r3 = r0.f13416k
            v6.q r4 = r0.f13417l
            v6.b r5 = r0.f13418m
            v6.b r0 = r0.f13419n
            v6.o r6 = new v6.o
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j.J(v6.o):v6.o");
    }

    public synchronized void K(int i6, int i10, long j, long j10) {
        ((n1) this.f9355y).H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.A;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        s9.n a10 = ((y8.c) this.f9356z).a(new w8.n(0, Arrays.asList(new w8.j(36301, i6, 0, j, j10, null, null, 0, i10))));
        d2.i iVar = new d2.i(this, elapsedRealtime, 5);
        a10.getClass();
        a10.b(s9.i.f12264a, iVar);
    }

    @Override // u6.f
    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9355y;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // v0.g
    public Uri b() {
        return (Uri) this.f9355y;
    }

    @Override // kf.h
    public Object collect(kf.i iVar, le.c cVar) {
        Object collect = ((kf.h) this.f9355y).collect(new kf.z(iVar, (x4.w) this.f9356z, (ve.l) this.A), cVar);
        if (collect == me.a.f8833x) {
            return collect;
        }
        return he.y.f6101a;
    }

    @Override // v0.g
    public Uri d() {
        return (Uri) this.A;
    }

    @Override // v0.g
    public Object e() {
        return null;
    }

    public void g(View view, int i6, boolean z10) {
        int y9;
        RecyclerView recyclerView = (RecyclerView) ((a2.a2) this.f9355y).f162y;
        if (i6 < 0) {
            y9 = recyclerView.getChildCount();
        } else {
            y9 = y(i6);
        }
        ((d2.i) this.f9356z).J(y9, z10);
        if (z10) {
            B(view);
        }
        recyclerView.addView(view, y9);
        RecyclerView.J(view);
    }

    @Override // v0.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f9356z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // n9.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(int r12, java.lang.Throwable r13, byte[] r14) {
        /*
            r11 = this;
            java.lang.Object r14 = r11.f9355y
            n9.m2 r14 = (n9.m2) r14
            r14.d1()
            java.lang.Object r0 = r11.A
            n9.w3 r0 = (n9.w3) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r12 == r1) goto L19
            r1 = 204(0xcc, float:2.86E-43)
            if (r12 == r1) goto L19
            r1 = 304(0x130, float:4.26E-43)
            if (r12 != r1) goto L34
            r12 = 304(0x130, float:4.26E-43)
        L19:
            if (r13 != 0) goto L34
            java.lang.Object r12 = r14.f4301y
            n9.n1 r12 = (n9.n1) r12
            n9.u0 r12 = r12.C
            n9.n1.g(r12)
            n9.s0 r12 = r12.L
            long r1 = r0.f9517x
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r12.b(r13, r1)
            n9.s2 r12 = n9.s2.SUCCESS
            goto L70
        L34:
            java.lang.Object r1 = r14.f4301y
            n9.n1 r1 = (n9.n1) r1
            n9.u0 r1 = r1.C
            n9.n1.g(r1)
            n9.s0 r1 = r1.G
            long r2 = r0.f9517x
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.d(r4, r2, r3, r13)
            n9.d0 r13 = n9.e0.f9273u
            r1 = 0
            java.lang.Object r13 = r13.a(r1)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = ","
            java.lang.String[] r13 = r13.split(r1)
            java.util.List r13 = java.util.Arrays.asList(r13)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            boolean r12 = r13.contains(r12)
            if (r12 == 0) goto L6e
            n9.s2 r12 = n9.s2.BACKOFF
            goto L70
        L6e:
            n9.s2 r12 = n9.s2.FAILURE
        L70:
            java.lang.Object r13 = r11.f9356z
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13
            java.lang.Object r1 = r14.f4301y
            n9.n1 r1 = (n9.n1) r1
            n9.h3 r4 = r1.j()
            n9.d r5 = new n9.d
            long r7 = r0.f9517x
            int r6 = r12.f9479x
            long r9 = r0.C
            r5.<init>(r6, r7, r9)
            r0 = r7
            r4.d1()
            r4.e1()
            r2 = 1
            n9.l4 r2 = r4.t1(r2)
            r6 = r5
            r5 = r2
            d6.b r2 = new d6.b
            r3 = 9
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r4.r1(r2)
            java.lang.Object r14 = r14.f4301y
            n9.n1 r14 = (n9.n1) r14
            n9.u0 r14 = r14.C
            n9.n1.g(r14)
            n9.s0 r14 = r14.L
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "[sgtm] Updated status for row_id"
            r14.c(r0, r12, r1)
            monitor-enter(r13)
            r13.set(r12)     // Catch: java.lang.Throwable -> Lbd
            r13.notifyAll()     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lbd
            return
        Lbd:
            r0 = move-exception
            r12 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lbd
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j.h(int, java.lang.Throwable, byte[]):void");
    }

    public void i(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int y9;
        RecyclerView recyclerView = (RecyclerView) ((a2.a2) this.f9355y).f162y;
        if (i6 < 0) {
            y9 = recyclerView.getChildCount();
        } else {
            y9 = y(i6);
        }
        ((d2.i) this.f9356z).J(y9, z10);
        if (z10) {
            B(view);
        }
        w4.i1 J = RecyclerView.J(view);
        if (J != null) {
            if (!J.k() && !J.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + J + recyclerView.z());
            }
            J.j &= -257;
        }
        recyclerView.attachViewToParent(view, y9, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    @Override // n9.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            int r8 = r7.f9354x
            switch(r8) {
                case 3: goto Lae;
                default: goto L5;
            }
        L5:
            java.lang.Object r8 = r7.f9355y
            n9.f4 r8 = (n9.f4) r8
            long r0 = r8.f9312a
            java.lang.Object r8 = r7.A
            n9.e4 r8 = (n9.e4) r8
            java.lang.Object r12 = r7.f9356z
            java.lang.String r12 = (java.lang.String) r12
            n9.l1 r2 = r8.D()
            r2.d1()
            r8.i0()
            r2 = 0
            if (r11 != 0) goto L27
            byte[] r11 = new byte[r2]     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r0 = move-exception
            r9 = r0
            goto La8
        L27:
            r3 = 200(0xc8, float:2.8E-43)
            if (r9 == r3) goto L31
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 != r3) goto L6c
            r9 = 204(0xcc, float:2.86E-43)
        L31:
            if (r10 != 0) goto L6c
            n9.o r10 = r8.f9303z     // Catch: java.lang.Throwable -> L23
            n9.e4.P(r10)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            r10.k1(r11)     // Catch: java.lang.Throwable -> L23
            n9.u0 r10 = r8.r()     // Catch: java.lang.Throwable -> L23
            n9.s0 r10 = r10.L     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L23
            r10.c(r12, r9, r11)     // Catch: java.lang.Throwable -> L23
            n9.y0 r9 = r8.f9302y     // Catch: java.lang.Throwable -> L23
            n9.e4.P(r9)     // Catch: java.lang.Throwable -> L23
            boolean r9 = r9.x1()     // Catch: java.lang.Throwable -> L23
            if (r9 == 0) goto L68
            n9.o r9 = r8.f9303z     // Catch: java.lang.Throwable -> L23
            n9.e4.P(r9)     // Catch: java.lang.Throwable -> L23
            boolean r9 = r9.j1(r12)     // Catch: java.lang.Throwable -> L23
            if (r9 == 0) goto L68
            r8.o(r12)     // Catch: java.lang.Throwable -> L23
            goto La2
        L68:
            r8.I()     // Catch: java.lang.Throwable -> L23
            goto La2
        L6c:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L23
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L23
            r3.<init>(r11, r4)     // Catch: java.lang.Throwable -> L23
            int r11 = r3.length()     // Catch: java.lang.Throwable -> L23
            r4 = 32
            int r11 = java.lang.Math.min(r4, r11)     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = r3.substring(r2, r11)     // Catch: java.lang.Throwable -> L23
            n9.u0 r3 = r8.r()     // Catch: java.lang.Throwable -> L23
            n9.s0 r3 = r3.I     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L23
            if (r10 != 0) goto L90
            r10 = r11
        L90:
            r3.d(r4, r12, r9, r10)     // Catch: java.lang.Throwable -> L23
            n9.o r9 = r8.f9303z     // Catch: java.lang.Throwable -> L23
            n9.e4.P(r9)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r10 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            r9.p1(r10)     // Catch: java.lang.Throwable -> L23
            r8.I()     // Catch: java.lang.Throwable -> L23
        La2:
            r8.R = r2
            r8.J()
            return
        La8:
            r8.R = r2
            r8.J()
            throw r9
        Lae:
            java.lang.Object r8 = r7.A
            r0 = r8
            n9.e4 r0 = (n9.e4) r0
            java.lang.Object r8 = r7.f9356z
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r7.f9355y
            r6 = r8
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r1 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r0.t(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j.j(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v5.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [e6.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [v5.c, java.lang.Object] */
    public v5.p k() {
        boolean z10;
        UUID uuid = (UUID) this.f9355y;
        e6.i iVar = (e6.i) this.f9356z;
        HashSet hashSet = (HashSet) this.A;
        ?? obj = new Object();
        obj.f13331a = uuid;
        obj.f13332b = iVar;
        obj.f13333c = hashSet;
        v5.c cVar = iVar.j;
        int i6 = Build.VERSION.SDK_INT;
        if ((i6 < 24 || cVar.f13313h.f13316a.size() <= 0) && !cVar.f13309d && !cVar.f13307b && (i6 < 23 || !cVar.f13308c)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (((e6.i) this.f9356z).f4386q && z10) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f9355y = UUID.randomUUID();
        e6.i iVar2 = (e6.i) this.f9356z;
        ?? obj2 = new Object();
        obj2.f4372b = 1;
        v5.f fVar = v5.f.f13318c;
        obj2.f4375e = fVar;
        obj2.f4376f = fVar;
        obj2.j = v5.c.f13305i;
        obj2.f4381l = 1;
        obj2.f4382m = 30000L;
        obj2.f4385p = -1L;
        obj2.f4387r = 1;
        obj2.f4371a = iVar2.f4371a;
        obj2.f4373c = iVar2.f4373c;
        obj2.f4372b = iVar2.f4372b;
        obj2.f4374d = iVar2.f4374d;
        obj2.f4375e = new v5.f(iVar2.f4375e);
        obj2.f4376f = new v5.f(iVar2.f4376f);
        obj2.f4377g = iVar2.f4377g;
        obj2.f4378h = iVar2.f4378h;
        obj2.f4379i = iVar2.f4379i;
        v5.c cVar2 = iVar2.j;
        ?? obj3 = new Object();
        obj3.f13306a = 1;
        obj3.f13311f = -1L;
        obj3.f13312g = -1L;
        obj3.f13313h = new v5.e();
        obj3.f13307b = cVar2.f13307b;
        obj3.f13308c = cVar2.f13308c;
        obj3.f13306a = cVar2.f13306a;
        obj3.f13309d = cVar2.f13309d;
        obj3.f13310e = cVar2.f13310e;
        obj3.f13313h = cVar2.f13313h;
        obj2.j = obj3;
        obj2.f4380k = iVar2.f4380k;
        obj2.f4381l = iVar2.f4381l;
        obj2.f4382m = iVar2.f4382m;
        obj2.f4383n = iVar2.f4383n;
        obj2.f4384o = iVar2.f4384o;
        obj2.f4385p = iVar2.f4385p;
        obj2.f4386q = iVar2.f4386q;
        obj2.f4387r = iVar2.f4387r;
        this.f9356z = obj2;
        obj2.f4371a = ((UUID) this.f9355y).toString();
        return obj;
    }

    public void n(int i6) {
        w4.i1 J;
        int y9 = y(i6);
        ((d2.i) this.f9356z).K(y9);
        RecyclerView recyclerView = (RecyclerView) ((a2.a2) this.f9355y).f162y;
        View childAt = recyclerView.getChildAt(y9);
        if (childAt != null && (J = RecyclerView.J(childAt)) != null) {
            if (J.k() && !J.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + J + recyclerView.z());
            }
            J.a(256);
        }
        recyclerView.detachViewFromParent(y9);
    }

    public void o(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f9355y;
        xb.f fVar = new xb.f(byteArrayOutputStream, hashMap, (HashMap) this.f9356z, (ub.d) this.A);
        ub.d dVar = (ub.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new RuntimeException("No encoder for " + obj.getClass());
        }
    }

    @Override // s9.c
    public void onComplete(Task task) {
        s8.b bVar = (s8.b) this.f9355y;
        String str = (String) this.f9356z;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.A;
        synchronized (bVar.f12227a) {
            bVar.f12227a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public View q(int i6) {
        return ((RecyclerView) ((a2.a2) this.f9355y).f162y).getChildAt(y(i6));
    }

    public int s() {
        return ((RecyclerView) ((a2.a2) this.f9355y).f162y).getChildCount() - ((ArrayList) this.A).size();
    }

    @Override // u6.f
    public void shutdown() {
        ((ConnectivityManager) this.f9355y).unregisterNetworkCallback((c6.e) this.A);
    }

    public ColorStateList t(int i6) {
        int resourceId;
        ColorStateList d10;
        TypedArray typedArray = (TypedArray) this.f9356z;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (d10 = i0.f.d((Context) this.f9355y, resourceId)) != null) {
            return d10;
        }
        return typedArray.getColorStateList(i6);
    }

    public String toString() {
        switch (this.f9354x) {
            case 17:
                return ((d2.i) this.f9356z).toString() + ", hidden list:" + ((ArrayList) this.A).size();
            default:
                return super.toString();
        }
    }

    public long u() {
        y2.l lVar = (y2.l) this.A;
        if (lVar != null) {
            return lVar.A;
        }
        return -1L;
    }

    public Drawable v(int i6) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f9356z;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0) {
            return c9.a.f((Context) this.f9355y, resourceId);
        }
        return typedArray.getDrawable(i6);
    }

    public Drawable w(int i6) {
        int resourceId;
        Drawable g10;
        if (((TypedArray) this.f9356z).hasValue(i6) && (resourceId = ((TypedArray) this.f9356z).getResourceId(i6, 0)) != 0) {
            p.t a10 = p.t.a();
            Context context = (Context) this.f9355y;
            synchronized (a10) {
                g10 = a10.f10386a.g(context, resourceId, true);
            }
            return g10;
        }
        return null;
    }

    public Typeface x(int i6, int i10, p.s0 s0Var) {
        int resourceId = ((TypedArray) this.f9356z).getResourceId(i6, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.A) == null) {
                this.A = new TypedValue();
            }
            Context context = (Context) this.f9355y;
            TypedValue typedValue = (TypedValue) this.A;
            ThreadLocal threadLocal = k0.l.f7568a;
            if (context.isRestricted()) {
                return null;
            }
            return k0.l.b(context, resourceId, typedValue, i10, s0Var, true, false);
        }
        return null;
    }

    public int y(int i6) {
        d2.i iVar = (d2.i) this.f9356z;
        if (i6 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((a2.a2) this.f9355y).f162y).getChildCount();
        int i10 = i6;
        while (i10 < childCount) {
            int G = i6 - (i10 - iVar.G(i10));
            if (G == 0) {
                while (iVar.I(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += G;
        }
        return -1;
    }

    public View z(int i6) {
        return ((RecyclerView) ((a2.a2) this.f9355y).f162y).getChildAt(i6);
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i6) {
        this.f9354x = i6;
        this.f9355y = obj;
        this.f9356z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ j(e4 e4Var, String str, Object obj, int i6) {
        this.f9354x = i6;
        this.f9356z = str;
        this.f9355y = obj;
        this.A = e4Var;
    }

    public j(Context context, n1 n1Var) {
        this.f9354x = 1;
        this.A = new AtomicLong(-1L);
        this.f9356z = new y8.c(context, y8.c.f15013i, new w8.o("measurement:api"), u8.b.f12950b);
        this.f9355y = n1Var;
    }

    public j(Set set, String str, String str2) {
        this.f9354x = 19;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        Map map = Collections.EMPTY_MAP;
        this.f9356z = str2;
        this.A = p9.a.f10624a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f9355y = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw r4.a.i(it);
    }

    public j(l6.k kVar, a7.l lVar) {
        Object e2Var;
        this.f9354x = 16;
        this.f9355y = kVar;
        this.f9356z = lVar;
        int i6 = Build.VERSION.SDK_INT;
        int i10 = 2;
        if (i6 < 26) {
            boolean z10 = a7.a.f587a;
        } else if (!a7.a.f587a) {
            if (i6 != 26 && i6 != 27) {
                e2Var = new a2.e2(i10, true);
            } else {
                e2Var = new Object();
            }
            this.A = e2Var;
        }
        e2Var = new a2.e2(i10, false);
        this.A = e2Var;
    }

    @Override // v0.g
    public void c() {
    }

    public j(b4.h hVar) {
        this.f9354x = 10;
        this.f9355y = hVar;
        this.f9356z = new ConcurrentHashMap();
        this.A = new ConcurrentHashMap();
    }

    public j(a2.a2 a2Var) {
        this.f9354x = 17;
        this.f9355y = a2Var;
        this.f9356z = new d2.i();
        this.A = new ArrayList();
    }

    public j(y2.r rVar) {
        this.f9354x = 8;
        this.f9355y = rVar;
    }

    public j(Context context, TypedArray typedArray) {
        this.f9354x = 7;
        this.f9355y = context;
        this.f9356z = typedArray;
    }

    public j(ConnectivityManager connectivityManager, a7.l lVar) {
        this.f9354x = 12;
        this.f9355y = connectivityManager;
        this.f9356z = lVar;
        c6.e eVar = new c6.e(this, 1);
        this.A = eVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), eVar);
    }

    public j(Context context, FloatingActionButton floatingActionButton) {
        this.f9354x = 6;
        o.l lVar = new o.l(context);
        this.f9355y = lVar;
        lVar.f9780e = new k7.d(this, 22);
        o.v vVar = new o.v(context, lVar, floatingActionButton, false, R.attr.popupMenuStyle, 0);
        this.f9356z = vVar;
        vVar.f9842f = 0;
        vVar.j = new o.u(this, 1);
    }

    public j(Class cls) {
        this.f9354x = 14;
        HashSet hashSet = new HashSet();
        this.A = hashSet;
        this.f9355y = UUID.randomUUID();
        this.f9356z = new e6.i(((UUID) this.f9355y).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((e6.i) this.f9356z).f4374d = OverwritingInputMerger.class.getName();
    }

    public j() {
        this.f9354x = 15;
        List list = Collections.EMPTY_LIST;
        this.f9355y = list;
        this.f9356z = list;
    }
}
