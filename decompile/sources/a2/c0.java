package a2;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.media3.ui.PlayerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f173x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f174y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f175z;

    public /* synthetic */ c0(int i6, Object obj, Object obj2) {
        this.f173x = i6;
        this.f174y = obj;
        this.f175z = obj2;
    }

    private final void a() {
        r1.h0 h0Var;
        float f3;
        r1.d dVar;
        t1.c cVar;
        int i6;
        boolean z10;
        r1.l1 l1Var;
        i4.b0 b0Var = (i4.b0) this.f174y;
        i4.l1 l1Var2 = (i4.l1) this.f175z;
        i4.o0 o0Var = b0Var.f6308h;
        b0Var.f6318t = l1Var2;
        i4.z zVar = new i4.z(b0Var, l1Var2);
        l1Var2.U(zVar);
        b0Var.f6319u = zVar;
        try {
            o0Var.f6475i.k(0, l1Var2);
        } catch (RemoteException e10) {
            u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
        }
        ((j4.u) o0Var.f6476k.f7158x).f7208a.setActive(true);
        r1.n0 S = l1Var2.S();
        i4.r1 f12 = l1Var2.f1();
        r1.t0 e12 = l1Var2.e1();
        r1.t0 e13 = l1Var2.e1();
        r1.o0 d10 = l1Var2.d();
        int x02 = l1Var2.x0();
        boolean F0 = l1Var2.F0();
        r1.p1 y9 = l1Var2.y();
        r1.d1 h12 = l1Var2.h1();
        if (l1Var2.n0(18)) {
            h0Var = l1Var2.h0();
        } else {
            h0Var = r1.h0.K;
        }
        r1.h0 h0Var2 = h0Var;
        if (l1Var2.n0(22)) {
            f3 = l1Var2.getVolume();
        } else {
            f3 = 1.0f;
        }
        if (l1Var2.n0(21)) {
            dVar = l1Var2.C();
        } else {
            dVar = r1.d.f11342h;
        }
        r1.d dVar2 = dVar;
        if (l1Var2.n0(28)) {
            cVar = l1Var2.i0();
        } else {
            cVar = t1.c.f12476d;
        }
        t1.c cVar2 = cVar;
        r1.j deviceInfo = l1Var2.getDeviceInfo();
        if (l1Var2.n0(23)) {
            i6 = l1Var2.f();
        } else {
            i6 = 0;
        }
        if (l1Var2.n0(23) && l1Var2.z0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean m9 = l1Var2.m();
        int v02 = l1Var2.v0();
        int e02 = l1Var2.e0();
        boolean isPlaying = l1Var2.isPlaying();
        boolean a10 = l1Var2.a();
        r1.h0 i12 = l1Var2.i1();
        long R0 = l1Var2.R0();
        long X = l1Var2.X();
        long u3 = l1Var2.u();
        if (l1Var2.n0(30)) {
            l1Var = l1Var2.g0();
        } else {
            l1Var = r1.l1.f11580b;
        }
        b0Var.s = new i4.j1(S, 0, f12, e12, e13, 0, d10, x02, F0, y9, h12, 0, h0Var2, f3, dVar2, cVar2, deviceInfo, i6, z10, m9, 1, v02, e02, isPlaying, a10, i12, R0, X, u3, l1Var, l1Var2.H0());
        b0Var.f(l1Var2.l());
    }

    private final void b() {
        ic.n nVar = (ic.n) this.f174y;
        s9.h hVar = (s9.h) this.f175z;
        try {
            hVar.a(nVar.d());
        } catch (Exception e10) {
            hVar.f12263a.l(e10);
        }
    }

    private final void c() {
        PlayerView.a((PlayerView) this.f174y, (Bitmap) this.f175z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0249 A[Catch: IllegalArgumentException -> 0x00e1, l0 -> 0x00e4, TryCatch #0 {l0 -> 0x00e4, blocks: (B:21:0x00c1, B:24:0x00e7, B:26:0x00ec, B:27:0x00ef, B:29:0x00f7, B:31:0x00fe, B:33:0x010a, B:34:0x010c, B:36:0x012a, B:38:0x014d, B:40:0x0155, B:41:0x0160, B:43:0x015b, B:44:0x0165, B:46:0x0169, B:48:0x016d, B:51:0x0180, B:53:0x0186, B:55:0x0198, B:58:0x019b, B:61:0x01a3, B:62:0x01a9, B:63:0x01aa, B:65:0x01ca, B:66:0x01cd, B:67:0x01d2, B:68:0x01d3, B:71:0x01e1, B:74:0x01ed, B:77:0x0202, B:78:0x0208, B:79:0x0209, B:81:0x0211, B:86:0x0230, B:91:0x0240, B:93:0x0249, B:96:0x025a, B:97:0x0262, B:101:0x022c, B:102:0x0214, B:103:0x0276, B:105:0x027b, B:109:0x028f, B:111:0x0295, B:114:0x02a2, B:116:0x02a9, B:118:0x02c7), top: B:11:0x00af }] */
    /* JADX WARN: Type inference failed for: r0v124, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v145, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v121, types: [com.google.android.gms.internal.measurement.e5] */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v90, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r7v28, types: [db.e0, db.h0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c0.run():void");
    }

    public /* synthetic */ c0(i4.b0 b0Var, i4.s sVar, Runnable runnable) {
        this.f173x = 19;
        this.f174y = b0Var;
        this.f175z = runnable;
    }
}
