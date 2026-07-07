package fd;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import com.playfy.tv.activities.FullBannerActivity;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.activities.SplashActivity;
import com.playfy.tv.databinding.CatChoseDialogBinding;
import com.playfy.tv.databinding.MessageLyBinding;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import com.playfy.tv.ui.fragments.SettingsFragment;
import gf.a2;
import gf.o0;
import java.util.List;
import kd.m0;
import kf.f1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5161x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5162y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5163z;

    public /* synthetic */ b(int i6, Object obj, Object obj2) {
        this.f5161x = i6;
        this.f5162y = obj;
        this.f5163z = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f5161x;
        Object obj = this.f5163z;
        Object obj2 = this.f5162y;
        switch (i6) {
            case 0:
                bf.o[] oVarArr = FullBannerActivity.H;
                cf.m.y((FullBannerActivity) obj2, (String) obj, true);
                return;
            case 1:
                bf.o[] oVarArr2 = MainActivity.J;
                ((i.h) obj2).dismiss();
                SharedPreferences.Editor edit = ((SharedPreferences) obj).edit();
                edit.putBoolean("tgd", false);
                edit.apply();
                return;
            case 2:
                bf.o[] oVarArr3 = SplashActivity.K;
                cf.m.y((SplashActivity) obj2, (String) obj, true);
                return;
            case 3:
                SplashActivity splashActivity = (SplashActivity) obj;
                bf.o[] oVarArr4 = SplashActivity.K;
                if (((kotlin.jvm.internal.s) obj2).f8051x) {
                    splashActivity.X();
                    return;
                }
                jd.h hVar = (jd.h) ((f1) splashActivity.T().f7360e.f8014x).getValue();
                if (!kotlin.jvm.internal.k.a(hVar, jd.e.f7378a) && !kotlin.jvm.internal.k.a(hVar, jd.d.f7372a)) {
                    if (kotlin.jvm.internal.k.a(hVar, jd.c.f7369a)) {
                        splashActivity.X();
                        return;
                    } else {
                        if (!kotlin.jvm.internal.k.a(hVar, jd.f.f7379a) && !(hVar instanceof jd.g)) {
                            throw new RuntimeException();
                        }
                        splashActivity.T().b();
                        return;
                    }
                }
                jd.b T = splashActivity.T();
                T.getClass();
                a2 a2Var = T.f7361f;
                if (a2Var == null || !a2Var.isActive()) {
                    T.f7362g = false;
                    T.f7361f = gf.f0.w(gf.f0.b(o0.f5694b), null, new jd.a(T, null), 3);
                    return;
                }
                return;
            case 4:
                gd.c cVar = (gd.c) obj;
                int b10 = ((gd.b) obj2).b();
                if (b10 != -1) {
                    cf.n nVar = (cf.n) cVar.C;
                    kd.i iVar = (kd.i) cVar.h(b10);
                    kotlin.jvm.internal.k.d(iVar, "access$getItem(...)");
                    nVar.invoke(iVar);
                    return;
                }
                return;
            case 5:
                gd.f fVar = (gd.f) obj2;
                fVar.B.invoke(((kd.i) fVar.h(((gd.e) obj).c())).f7861b);
                return;
            case 6:
                gd.m mVar = (gd.m) obj2;
                gd.p pVar = (gd.p) obj;
                int b11 = mVar.b();
                if (b11 != -1) {
                    Object h4 = pVar.h(b11);
                    if (h4 instanceof kd.u) {
                        Context context = mVar.f13897a.getContext();
                        kotlin.jvm.internal.k.d(context, "getContext(...)");
                        kd.u uVar = (kd.u) h4;
                        gd.p.j(pVar, context, String.valueOf(uVar.f7900x), uVar.B, (Parcelable) h4);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                gd.p pVar2 = (gd.p) obj;
                int b12 = ((gd.k) obj2).b();
                if (b12 != -1) {
                    Object h10 = pVar2.h(b12);
                    if (h10 instanceof kd.h0) {
                        nd.c cVar2 = pVar2.B;
                        if (cVar2 != null) {
                            List list = pVar2.A.f13855f;
                            kotlin.jvm.internal.k.d(list, "getCurrentList(...)");
                            List t10 = cf.m.t(list, (Parcelable) h10);
                            cVar2.a(String.valueOf(t10.indexOf(h10)), 0, t10, Boolean.valueOf(pVar2.E), 2);
                            return;
                        }
                        ve.l lVar = pVar2.C;
                        if (lVar != null) {
                            lVar.invoke(h10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                gd.s sVar = (gd.s) obj;
                int b13 = ((gd.r) obj2).b();
                if (b13 != -1) {
                    ve.l lVar2 = sVar.B;
                    kd.h0 h0Var = (kd.h0) sVar.h(b13);
                    kotlin.jvm.internal.k.d(h0Var, "access$getItem(...)");
                    lVar2.invoke(h0Var);
                    return;
                }
                return;
            case 9:
                gd.c cVar3 = (gd.c) obj;
                int b14 = ((gd.a0) obj2).b();
                if (b14 != -1) {
                    kd.j0 j0Var = (kd.j0) cVar3.h(b14);
                    cf.n nVar2 = (cf.n) cVar3.C;
                    kd.i0 type = j0Var.f7872d;
                    if (type == kd.i0.f7867z) {
                        boolean z10 = !j0Var.f7873e;
                        String title = j0Var.f7869a;
                        String str = j0Var.f7870b;
                        Integer num = j0Var.f7871c;
                        boolean z11 = j0Var.f7874f;
                        kotlin.jvm.internal.k.e(title, "title");
                        kotlin.jvm.internal.k.e(type, "type");
                        j0Var = new kd.j0(title, str, num, type, z10, z11);
                    }
                    nVar2.invoke(j0Var);
                    return;
                }
                return;
            case 10:
                cf.m.y(((id.h) obj2).f6829a, ((m0) obj).f7882c, true);
                return;
            case 11:
                Context context2 = ((MessageLyBinding) obj2).f3342a.getContext();
                kotlin.jvm.internal.k.d(context2, "getContext(...)");
                String string = ((SharedPreferences) obj).getString("mu", "https://google.com");
                kotlin.jvm.internal.k.b(string);
                cf.m.y(context2, string, true);
                return;
            case 12:
                int i10 = ((ld.k) obj).f8333a;
                l4.x xVar = (l4.x) ((dc.a) obj2).f4067b;
                l4.u f3 = xVar.f8199b.f();
                if ((f3 == null || f3.f8195y.f9924a != i10) && !xVar.f8199b.l(i10, false)) {
                    xVar.c(i10, null, new l4.z(true, true, R.id.homeFragment, false, true, -1, -1, -1, -1));
                    return;
                }
                return;
            case 13:
                CatChoseDialogBinding catChoseDialogBinding = (CatChoseDialogBinding) obj;
                int i11 = PlaylistFragment.F0;
                TextInputLayout searchLayout = ((CatChoseDialogBinding) obj2).f3198g;
                kotlin.jvm.internal.k.d(searchLayout, "searchLayout");
                if (searchLayout.getVisibility() == 0) {
                    PlaylistFragment.V(catChoseDialogBinding);
                    return;
                }
                TextInputLayout searchLayout2 = catChoseDialogBinding.f3198g;
                kotlin.jvm.internal.k.d(searchLayout2, "searchLayout");
                searchLayout2.setVisibility(0);
                catChoseDialogBinding.f3197f.setImageResource(R.drawable.ic_clear);
                catChoseDialogBinding.f3196e.requestFocus();
                return;
            case 14:
                nd.r rVar = (nd.r) obj2;
                rVar.A.invoke((String) obj);
                androidx.lifecycle.i iVar2 = rVar.D;
                if (iVar2 != null) {
                    iVar2.invoke();
                    return;
                }
                return;
            case 15:
                SettingsFragment settingsFragment = (SettingsFragment) obj2;
                bf.o[] oVarArr5 = SettingsFragment.E0;
                Object systemService = settingsFragment.F().getSystemService("clipboard");
                kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("donation_address", ((kd.r) obj).f7897b));
                Toast.makeText(settingsFragment.F(), "Address copied", 0).show();
                return;
            default:
                l4.x navController = (l4.x) obj2;
                k7.c configuration = (k7.c) obj;
                kotlin.jvm.internal.k.e(navController, "navController");
                kotlin.jvm.internal.k.e(configuration, "configuration");
                navController.f8199b.f();
                navController.d();
                return;
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.s sVar, SplashActivity splashActivity, String str) {
        this.f5161x = 3;
        this.f5162y = sVar;
        this.f5163z = splashActivity;
    }
}
