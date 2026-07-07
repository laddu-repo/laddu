package j2;

import a2.k0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.databinding.FragmentRecyclerBinding;
import com.playfy.tv.ui.OverlayInsetsLayout;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import gf.f0;
import i4.n1;
import java.util.Iterator;
import java.util.Locale;
import p.q3;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7071x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7072y;

    public /* synthetic */ h(Object obj, int i6) {
        this.f7071x = i6;
        this.f7072y = obj;
    }

    private final void a() {
        int i6;
        String q9;
        TelephonyManager telephonyManager;
        u1.q qVar = (u1.q) this.f7072y;
        u2.f fVar = (u2.f) qVar.f12794a.get();
        if (fVar != null) {
            int b10 = qVar.f12796c.b();
            u2.g gVar = fVar.f12839a;
            synchronized (gVar) {
                int i10 = gVar.f12858n;
                if (i10 != 0 && !gVar.f12850e) {
                    return;
                }
                if (i10 == b10 && gVar.f12859o != null) {
                    return;
                }
                gVar.f12858n = b10;
                if (b10 != 1 && b10 != 0 && b10 != 8) {
                    if (gVar.f12859o == null) {
                        Context context = gVar.f12846a;
                        String str = u1.a0.f12750a;
                        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                q9 = dg.b.q(networkCountryIso);
                                gVar.f12859o = q9;
                            }
                        }
                        q9 = dg.b.q(Locale.getDefault().getCountry());
                        gVar.f12859o = q9;
                    }
                    gVar.f12856l = gVar.a(b10);
                    gVar.f12849d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (gVar.f12852g > 0) {
                        i6 = (int) (elapsedRealtime - gVar.f12853h);
                    } else {
                        i6 = 0;
                    }
                    gVar.b(i6, gVar.f12854i, gVar.f12856l);
                    gVar.f12853h = elapsedRealtime;
                    gVar.f12854i = 0L;
                    gVar.f12855k = 0L;
                    gVar.j = 0L;
                    u2.t tVar = gVar.f12851f;
                    tVar.f12879a.clear();
                    tVar.f12881c = -1;
                    tVar.f12882d = 0;
                    tVar.f12883e = 0;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q3 q3Var;
        boolean z10;
        le.c cVar = null;
        int i6 = 0;
        switch (this.f7071x) {
            case 0:
                i iVar = (i) this.f7072y;
                synchronized (iVar.f7073a) {
                    try {
                        if (!iVar.f7084m) {
                            long j = iVar.f7083l - 1;
                            iVar.f7083l = j;
                            if (j <= 0) {
                                if (j < 0) {
                                    iVar.b(new IllegalStateException());
                                    return;
                                } else {
                                    iVar.a();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                j6.c this$0 = (j6.c) this.f7072y;
                kotlin.jvm.internal.k.e(this$0, "this$0");
                this$0.b();
                return;
            case 2:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.f7072y;
                int i10 = DefaultTimeBar.f1073p0;
                defaultTimeBar.d(false);
                return;
            case 3:
                ((k4.q) this.f7072y).s();
                return;
            case 4:
                ((PlayerView) this.f7072y).invalidate();
                return;
            case 5:
                OverlayInsetsLayout overlayInsetsLayout = (OverlayInsetsLayout) this.f7072y;
                overlayInsetsLayout.f3378y = false;
                overlayInsetsLayout.a(overlayInsetsLayout);
                return;
            case 6:
                ((HandlerThread) this.f7072y).quit();
                return;
            case 7:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f7072y;
                int[] iArr = SwipeRefreshLayout.f1163k0;
                swipeRefreshLayout.l();
                return;
            case 8:
                c6.h hVar = (c6.h) this.f7072y;
                ((n8.g) ((o8.c) hVar.A)).K(new u(hVar, 7));
                return;
            case 9:
                RecyclerView recyclerView = (RecyclerView) this.f7072y;
                int childCount = recyclerView.getChildCount();
                while (i6 < childCount) {
                    i1 I = recyclerView.I(recyclerView.getChildAt(i6));
                    if ((I instanceof gd.m) && (q3Var = ((gd.m) I).f5628u) != null) {
                        q3Var.c();
                    }
                    i6++;
                }
                return;
            case 10:
                FragmentRecyclerBinding fragmentRecyclerBinding = (FragmentRecyclerBinding) this.f7072y;
                int i11 = PlaylistFragment.F0;
                if (!fragmentRecyclerBinding.f3302d.hasFocus()) {
                    fragmentRecyclerBinding.f3302d.requestFocus();
                    return;
                }
                return;
            case 11:
                ((o2.c) this.f7072y).x();
                return;
            case 12:
                a();
                return;
            case 13:
                n1 n1Var = (n1) this.f7072y;
                n1Var.f6464c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) n1Var.f6466e;
                a1.f fVar = sideSheetBehavior.f2728i;
                if (fVar != null && fVar.f()) {
                    n1Var.a(n1Var.f6463b);
                    return;
                } else {
                    if (sideSheetBehavior.f2727h == 2) {
                        sideSheetBehavior.s(n1Var.f6463b);
                        return;
                    }
                    return;
                }
            case 14:
                ((w2.d) this.f7072y).f13617g.m();
                return;
            case 15:
                ((w2.r) this.f7072y).f13695k--;
                return;
            case 16:
                x2.k kVar = (x2.k) this.f7072y;
                Surface surface = kVar.E;
                if (surface != null) {
                    Iterator it = kVar.f14489x.iterator();
                    while (it.hasNext()) {
                        ((k0) it.next()).f295x.z1(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar.D;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.D = null;
                kVar.E = null;
                return;
            case 17:
                x4.x xVar = (x4.x) this.f7072y;
                if (xVar.f971c > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (xVar.f14674o.compareAndSet(false, true) && z10) {
                    f0.w(xVar.f14671l.i(), xVar.f14677r, new x4.a0(xVar, cVar, i6), 2);
                    return;
                }
                return;
            case 18:
                ((za.c) this.f7072y).s(true);
                return;
            case 19:
                za.i iVar2 = (za.i) this.f7072y;
                boolean isPopupShowing = iVar2.f15253h.isPopupShowing();
                iVar2.s(isPopupShowing);
                iVar2.f15257m = isPopupShowing;
                return;
            default:
                ((TextInputLayout) this.f7072y).B.requestLayout();
                return;
        }
    }
}
