package com.playfy.tv.activities;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.l1;
import androidx.lifecycle.y;
import androidx.navigation.fragment.NavHostFragment;
import bf.o;
import cf.m;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.databinding.ActivityMainBinding;
import com.playfy.tv.databinding.DialogTgJoinBinding;
import com.playfy.tv.databinding.LayoutCustomBottomNavBinding;
import com.playfy.tv.databinding.TvTopLyBinding;
import com.unity3d.ads.metadata.MediationMetaData;
import d.n0;
import d.o0;
import fd.i;
import fd.n;
import fd.r;
import fd.z;
import he.g;
import i.j;
import id.f;
import id.h;
import ie.t;
import ie.w;
import j6.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import jb.b;
import k7.c;
import kd.m0;
import kf.f1;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import l4.l;
import l4.u;
import nd.d;
import nd.e;
import od.s;
import okhttp3.HttpUrl;
import t0.f0;
import t0.h0;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MainActivity extends j {
    public static final /* synthetic */ o[] J;
    public final a D;
    public final l1 E;
    public MenuItem F;
    public SearchView G;
    public dc.a H;
    public final Object I;

    static {
        q qVar = new q(MainActivity.class, "binding", "getBinding()Lcom/playfy/tv/databinding/ActivityMainBinding;");
        x.f8056a.getClass();
        J = new o[]{qVar};
    }

    public MainActivity() {
        super(R.layout.activity_main);
        this.D = b.s(this, ActivityMainBinding.class);
        this.E = new l1(x.a(s.class), new r(this, 2), new r(this, 1), new r(this, 3));
        this.I = he.a.c(g.f6073x, new r(this, 0));
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [he.f, java.lang.Object] */
    public static void W(MainActivity mainActivity, String slug, int i6, List list, boolean z10, int i10) {
        String string;
        CharSequence charSequence;
        u f3 = mainActivity.U().f8199b.f();
        if (f3 == null || (charSequence = f3.A) == null || (string = charSequence.toString()) == null) {
            string = mainActivity.getString(R.string.app_name);
            k.d(string, "getString(...)");
        }
        mainActivity.getClass();
        ?? r12 = mainActivity.I;
        k.e(slug, "slug");
        Bundle b10 = new z(slug, i10, i6, z10, (Parcelable[]) list.toArray(new Parcelable[0]), null, null, null, 224).b();
        String lowerCase = string.toLowerCase(Locale.ROOT);
        k.d(lowerCase, "toLowerCase(...)");
        String F = df.u.F(lowerCase, " ", "-");
        if (z10 && ((h) r12.getValue()).b(2, F)) {
            SponsorActivity.O.getClass();
            Intent intent = new Intent(mainActivity, (Class<?>) SponsorActivity.class);
            intent.putExtra("sn", 2);
            intent.putExtra(MediationMetaData.KEY_NAME, F);
            intent.putExtra("args", b10);
            intent.addFlags(268435456);
            mainActivity.startActivity(intent);
            return;
        }
        h hVar = (h) r12.getValue();
        y lifecycle = mainActivity.getLifecycle();
        fd.j jVar = new fd.j(0, mainActivity, b10);
        Context context = hVar.f6829a;
        k.e(lifecycle, "lifecycle");
        m0 m0Var = (m0) ie.j.H(hVar.f6831c.f7843d);
        if (m0Var != null) {
            Object systemService = context.getSystemService("uimode");
            k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() == 4 || m0Var.f7880a <= 0 || !hVar.c(string, m0Var.f7883d, 0, false)) {
                m0Var = null;
            }
            m0 m0Var2 = m0Var;
            if (m0Var2 != null) {
                lifecycle.a(new f(new Object(), lifecycle, hVar, string, jVar));
                m.y(context, m0Var2.f7882c, true);
                return;
            }
        }
        jVar.invoke();
    }

    public final ActivityMainBinding T() {
        return (ActivityMainBinding) this.D.a(this, J[0]);
    }

    public final l4.x U() {
        j1.y D = z().D(T().f3147c.getId());
        k.c(D, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) D).N();
    }

    public final boolean V() {
        Object systemService = getSystemService("uimode");
        k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public final void X(boolean z10) {
        int i6;
        TvTopLyBinding tvTopLyBinding = T().f3151g;
        LinearLayout linearLayout = tvTopLyBinding.f3369i;
        TextInputLayout textInputLayout = tvTopLyBinding.f3366f;
        int i10 = 8;
        if (!z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        linearLayout.setVisibility(i6);
        if (z10) {
            i10 = 0;
        }
        textInputLayout.setVisibility(i10);
        if (!z10) {
            tvTopLyBinding.f3368h.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            textInputLayout.clearFocus();
        }
    }

    public final void Y(String query) {
        j1.y D = z().D(T().f3147c.getId());
        k.c(D, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        List m9 = ((NavHostFragment) D).c().f6945c.m();
        k.d(m9, "getFragments(...)");
        j1.y yVar = (j1.y) ie.j.I(0, m9);
        if (yVar != null) {
            if (yVar instanceof d) {
                k.e(query, "query");
                f1 f1Var = ((d) yVar).P().f10107d;
                String lowerCase = query.toLowerCase(Locale.ROOT);
                k.d(lowerCase, "toLowerCase(...)");
                f1Var.getClass();
                f1Var.h(null, lowerCase);
                return;
            }
            if (yVar instanceof e) {
                ((e) yVar).R(query);
            }
        }
    }

    public final void Z() {
        FrameLayout.LayoutParams layoutParams;
        int i6;
        FrameLayout frameLayout = T().f3145a.f3328a;
        k.d(frameLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int i10 = 0;
        if (frameLayout.getVisibility() == 0) {
            int height = frameLayout.getHeight();
            if (layoutParams != null) {
                i6 = layoutParams.topMargin;
            } else {
                i6 = 0;
            }
            int i11 = height + i6;
            if (layoutParams != null) {
                i10 = layoutParams.bottomMargin;
            }
            i10 += i11;
        }
        T().f3148d.setBottomOverlayHeight(i10);
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [fd.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, dc.a] */
    @Override // i.j, d.q, h0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View view;
        SearchView searchView;
        boolean z10;
        super.onCreate(bundle);
        final int i6 = 4;
        final int i10 = 3;
        final int i11 = 2;
        final int i12 = 1;
        final int i13 = 0;
        if (V()) {
            T().f3150f.setVisibility(8);
            FrameLayout frameLayout = T().f3145a.f3328a;
            k.d(frameLayout, "getRoot(...)");
            frameLayout.setVisibility(8);
            T().f3152h.setVisibility(0);
            T().f3151g.f3368h.addTextChangedListener(new fd.q(this, i13));
            TvTopLyBinding tvTopLyBinding = T().f3151g;
            tvTopLyBinding.f3365e.setOnClickListener(new View.OnClickListener(this) { // from class: fd.k

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ MainActivity f5198y;

                {
                    this.f5198y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = i13;
                    MainActivity mainActivity = this.f5198y;
                    switch (i14) {
                        case 0:
                            bf.o[] oVarArr = MainActivity.J;
                            mainActivity.X(true);
                            return;
                        case 1:
                            bf.o[] oVarArr2 = MainActivity.J;
                            l4.u f3 = mainActivity.U().f8199b.f();
                            if (f3 == null || f3.f8195y.f9924a != R.id.homeFragment) {
                                mainActivity.U().f8199b.l(R.id.homeFragment, false);
                                return;
                            }
                            return;
                        case 2:
                            bf.o[] oVarArr3 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.catsFragment, false)) {
                                mainActivity.U().c(R.id.catsFragment, null, null);
                                return;
                            }
                            return;
                        case 3:
                            bf.o[] oVarArr4 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.highFragment, false)) {
                                mainActivity.U().c(R.id.highFragment, null, null);
                                return;
                            }
                            return;
                        case 4:
                            bf.o[] oVarArr5 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.settingsFragment, false)) {
                                mainActivity.U().c(R.id.settingsFragment, null, null);
                                return;
                            }
                            return;
                        default:
                            bf.o[] oVarArr6 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.favFragment, false)) {
                                mainActivity.U().c(R.id.action_global_favFragment, null, null);
                                return;
                            }
                            return;
                    }
                }
            });
            tvTopLyBinding.f3362b.setOnClickListener(new View.OnClickListener(this) { // from class: fd.k

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ MainActivity f5198y;

                {
                    this.f5198y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = i12;
                    MainActivity mainActivity = this.f5198y;
                    switch (i14) {
                        case 0:
                            bf.o[] oVarArr = MainActivity.J;
                            mainActivity.X(true);
                            return;
                        case 1:
                            bf.o[] oVarArr2 = MainActivity.J;
                            l4.u f3 = mainActivity.U().f8199b.f();
                            if (f3 == null || f3.f8195y.f9924a != R.id.homeFragment) {
                                mainActivity.U().f8199b.l(R.id.homeFragment, false);
                                return;
                            }
                            return;
                        case 2:
                            bf.o[] oVarArr3 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.catsFragment, false)) {
                                mainActivity.U().c(R.id.catsFragment, null, null);
                                return;
                            }
                            return;
                        case 3:
                            bf.o[] oVarArr4 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.highFragment, false)) {
                                mainActivity.U().c(R.id.highFragment, null, null);
                                return;
                            }
                            return;
                        case 4:
                            bf.o[] oVarArr5 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.settingsFragment, false)) {
                                mainActivity.U().c(R.id.settingsFragment, null, null);
                                return;
                            }
                            return;
                        default:
                            bf.o[] oVarArr6 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.favFragment, false)) {
                                mainActivity.U().c(R.id.action_global_favFragment, null, null);
                                return;
                            }
                            return;
                    }
                }
            });
            tvTopLyBinding.f3361a.setOnClickListener(new View.OnClickListener(this) { // from class: fd.k

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ MainActivity f5198y;

                {
                    this.f5198y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = i11;
                    MainActivity mainActivity = this.f5198y;
                    switch (i14) {
                        case 0:
                            bf.o[] oVarArr = MainActivity.J;
                            mainActivity.X(true);
                            return;
                        case 1:
                            bf.o[] oVarArr2 = MainActivity.J;
                            l4.u f3 = mainActivity.U().f8199b.f();
                            if (f3 == null || f3.f8195y.f9924a != R.id.homeFragment) {
                                mainActivity.U().f8199b.l(R.id.homeFragment, false);
                                return;
                            }
                            return;
                        case 2:
                            bf.o[] oVarArr3 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.catsFragment, false)) {
                                mainActivity.U().c(R.id.catsFragment, null, null);
                                return;
                            }
                            return;
                        case 3:
                            bf.o[] oVarArr4 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.highFragment, false)) {
                                mainActivity.U().c(R.id.highFragment, null, null);
                                return;
                            }
                            return;
                        case 4:
                            bf.o[] oVarArr5 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.settingsFragment, false)) {
                                mainActivity.U().c(R.id.settingsFragment, null, null);
                                return;
                            }
                            return;
                        default:
                            bf.o[] oVarArr6 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.favFragment, false)) {
                                mainActivity.U().c(R.id.action_global_favFragment, null, null);
                                return;
                            }
                            return;
                    }
                }
            });
            tvTopLyBinding.f3364d.setOnClickListener(new View.OnClickListener(this) { // from class: fd.k

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ MainActivity f5198y;

                {
                    this.f5198y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = i10;
                    MainActivity mainActivity = this.f5198y;
                    switch (i14) {
                        case 0:
                            bf.o[] oVarArr = MainActivity.J;
                            mainActivity.X(true);
                            return;
                        case 1:
                            bf.o[] oVarArr2 = MainActivity.J;
                            l4.u f3 = mainActivity.U().f8199b.f();
                            if (f3 == null || f3.f8195y.f9924a != R.id.homeFragment) {
                                mainActivity.U().f8199b.l(R.id.homeFragment, false);
                                return;
                            }
                            return;
                        case 2:
                            bf.o[] oVarArr3 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.catsFragment, false)) {
                                mainActivity.U().c(R.id.catsFragment, null, null);
                                return;
                            }
                            return;
                        case 3:
                            bf.o[] oVarArr4 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.highFragment, false)) {
                                mainActivity.U().c(R.id.highFragment, null, null);
                                return;
                            }
                            return;
                        case 4:
                            bf.o[] oVarArr5 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.settingsFragment, false)) {
                                mainActivity.U().c(R.id.settingsFragment, null, null);
                                return;
                            }
                            return;
                        default:
                            bf.o[] oVarArr6 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.favFragment, false)) {
                                mainActivity.U().c(R.id.action_global_favFragment, null, null);
                                return;
                            }
                            return;
                    }
                }
            });
            tvTopLyBinding.f3367g.setOnClickListener(new View.OnClickListener(this) { // from class: fd.k

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ MainActivity f5198y;

                {
                    this.f5198y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i14 = i6;
                    MainActivity mainActivity = this.f5198y;
                    switch (i14) {
                        case 0:
                            bf.o[] oVarArr = MainActivity.J;
                            mainActivity.X(true);
                            return;
                        case 1:
                            bf.o[] oVarArr2 = MainActivity.J;
                            l4.u f3 = mainActivity.U().f8199b.f();
                            if (f3 == null || f3.f8195y.f9924a != R.id.homeFragment) {
                                mainActivity.U().f8199b.l(R.id.homeFragment, false);
                                return;
                            }
                            return;
                        case 2:
                            bf.o[] oVarArr3 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.catsFragment, false)) {
                                mainActivity.U().c(R.id.catsFragment, null, null);
                                return;
                            }
                            return;
                        case 3:
                            bf.o[] oVarArr4 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.highFragment, false)) {
                                mainActivity.U().c(R.id.highFragment, null, null);
                                return;
                            }
                            return;
                        case 4:
                            bf.o[] oVarArr5 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.settingsFragment, false)) {
                                mainActivity.U().c(R.id.settingsFragment, null, null);
                                return;
                            }
                            return;
                        default:
                            bf.o[] oVarArr6 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.favFragment, false)) {
                                mainActivity.U().c(R.id.action_global_favFragment, null, null);
                                return;
                            }
                            return;
                    }
                }
            });
            final int i14 = 5;
            tvTopLyBinding.f3363c.setOnClickListener(new View.OnClickListener(this) { // from class: fd.k

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ MainActivity f5198y;

                {
                    this.f5198y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i142 = i14;
                    MainActivity mainActivity = this.f5198y;
                    switch (i142) {
                        case 0:
                            bf.o[] oVarArr = MainActivity.J;
                            mainActivity.X(true);
                            return;
                        case 1:
                            bf.o[] oVarArr2 = MainActivity.J;
                            l4.u f3 = mainActivity.U().f8199b.f();
                            if (f3 == null || f3.f8195y.f9924a != R.id.homeFragment) {
                                mainActivity.U().f8199b.l(R.id.homeFragment, false);
                                return;
                            }
                            return;
                        case 2:
                            bf.o[] oVarArr3 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.catsFragment, false)) {
                                mainActivity.U().c(R.id.catsFragment, null, null);
                                return;
                            }
                            return;
                        case 3:
                            bf.o[] oVarArr4 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.highFragment, false)) {
                                mainActivity.U().c(R.id.highFragment, null, null);
                                return;
                            }
                            return;
                        case 4:
                            bf.o[] oVarArr5 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.settingsFragment, false)) {
                                mainActivity.U().c(R.id.settingsFragment, null, null);
                                return;
                            }
                            return;
                        default:
                            bf.o[] oVarArr6 = MainActivity.J;
                            if (!mainActivity.U().f8199b.l(R.id.favFragment, false)) {
                                mainActivity.U().c(R.id.action_global_favFragment, null, null);
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            T().f3150f.setVisibility(0);
            FrameLayout frameLayout2 = T().f3145a.f3328a;
            k.d(frameLayout2, "getRoot(...)");
            frameLayout2.setVisibility(0);
            T().f3152h.setVisibility(8);
            FrameLayout frameLayout3 = T().f3145a.f3328a;
            k.d(frameLayout3, "getRoot(...)");
            if (frameLayout3.isLaidOut() && !frameLayout3.isLayoutRequested()) {
                Z();
            } else {
                frameLayout3.addOnLayoutChangeListener(new n(this, 0));
            }
            T().f3145a.f3328a.addOnLayoutChangeListener(new ca.a(this, i12));
            FrameLayout frameLayout4 = T().f3146b;
            i iVar = new i(this);
            WeakHashMap weakHashMap = q0.f12397a;
            h0.l(frameLayout4, iVar);
            f0.c(T().f3146b);
            Set s02 = ie.i.s0(new Integer[]{Integer.valueOf(R.id.homeFragment), Integer.valueOf(R.id.catsFragment), Integer.valueOf(R.id.highFragment), Integer.valueOf(R.id.settingsFragment)});
            HashSet hashSet = new HashSet();
            hashSet.addAll(s02);
            c cVar = new c(hashSet, (fd.o) new Object());
            m.E(T().f3149e, U(), cVar);
            j1.y D = z().D(R.id.nav_host_fragment_activity_main);
            k.c(D, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            l4.x navController = ((NavHostFragment) D).N();
            LayoutCustomBottomNavBinding layoutCustomBottomNavBinding = T().f3145a;
            k.e(navController, "navController");
            ArrayList arrayList = new ArrayList();
            MaterialToolbar materialToolbar = T().f3149e;
            LinearLayout linearLayout = layoutCustomBottomNavBinding.f3340n;
            ImageView imageView = layoutCustomBottomNavBinding.f3331d;
            TextView textView = layoutCustomBottomNavBinding.f3335h;
            t tVar = t.f6848x;
            arrayList.add(new ld.k(R.id.homeFragment, tVar, linearLayout, imageView, textView));
            arrayList.add(new ld.k(R.id.catsFragment, ie.i.s0(new Integer[]{Integer.valueOf(R.id.channelsFragment), Integer.valueOf(R.id.playlist_nav), Integer.valueOf(R.id.playlistFragment)}), layoutCustomBottomNavBinding.f3338l, layoutCustomBottomNavBinding.f3329b, layoutCustomBottomNavBinding.f3333f));
            arrayList.add(new ld.k(R.id.highFragment, tVar, layoutCustomBottomNavBinding.f3339m, layoutCustomBottomNavBinding.f3330c, layoutCustomBottomNavBinding.f3334g));
            arrayList.add(new ld.k(R.id.settingsFragment, tVar, layoutCustomBottomNavBinding.f3341o, layoutCustomBottomNavBinding.f3332e, layoutCustomBottomNavBinding.f3336i));
            if (!arrayList.isEmpty()) {
                List<ld.k> Z = ie.j.Z(arrayList);
                final ?? obj = new Object();
                obj.f4067b = navController;
                obj.f4068c = layoutCustomBottomNavBinding;
                obj.f4066a = R.color.white;
                obj.f4069d = Z;
                obj.f4070e = he.a.d(new ve.a() { // from class: ld.j
                    @Override // ve.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext(), R.color.nav_active));
                            case 1:
                                dc.a aVar = obj;
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) aVar.f4068c).f3328a.getContext(), aVar.f4066a));
                            case 2:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_active);
                            case 3:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_inactive);
                            default:
                                List list = (List) obj.f4069d;
                                int w10 = w.w(ie.l.x(list, 10));
                                if (w10 < 16) {
                                    w10 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w10);
                                for (Object obj2 : list) {
                                    linkedHashMap.put(Integer.valueOf(((k) obj2).f8333a), obj2);
                                }
                                return linkedHashMap;
                        }
                    }
                });
                obj.f4071f = he.a.d(new ve.a() { // from class: ld.j
                    @Override // ve.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext(), R.color.nav_active));
                            case 1:
                                dc.a aVar = obj;
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) aVar.f4068c).f3328a.getContext(), aVar.f4066a));
                            case 2:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_active);
                            case 3:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_inactive);
                            default:
                                List list = (List) obj.f4069d;
                                int w10 = w.w(ie.l.x(list, 10));
                                if (w10 < 16) {
                                    w10 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w10);
                                for (Object obj2 : list) {
                                    linkedHashMap.put(Integer.valueOf(((k) obj2).f8333a), obj2);
                                }
                                return linkedHashMap;
                        }
                    }
                });
                he.a.d(new ve.a() { // from class: ld.j
                    @Override // ve.a
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext(), R.color.nav_active));
                            case 1:
                                dc.a aVar = obj;
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) aVar.f4068c).f3328a.getContext(), aVar.f4066a));
                            case 2:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_active);
                            case 3:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_inactive);
                            default:
                                List list = (List) obj.f4069d;
                                int w10 = w.w(ie.l.x(list, 10));
                                if (w10 < 16) {
                                    w10 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w10);
                                for (Object obj2 : list) {
                                    linkedHashMap.put(Integer.valueOf(((k) obj2).f8333a), obj2);
                                }
                                return linkedHashMap;
                        }
                    }
                });
                he.a.d(new ve.a() { // from class: ld.j
                    @Override // ve.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext(), R.color.nav_active));
                            case 1:
                                dc.a aVar = obj;
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) aVar.f4068c).f3328a.getContext(), aVar.f4066a));
                            case 2:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_active);
                            case 3:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_inactive);
                            default:
                                List list = (List) obj.f4069d;
                                int w10 = w.w(ie.l.x(list, 10));
                                if (w10 < 16) {
                                    w10 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w10);
                                for (Object obj2 : list) {
                                    linkedHashMap.put(Integer.valueOf(((k) obj2).f8333a), obj2);
                                }
                                return linkedHashMap;
                        }
                    }
                });
                he.a.d(new ve.a() { // from class: ld.j
                    @Override // ve.a
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext(), R.color.nav_active));
                            case 1:
                                dc.a aVar = obj;
                                return Integer.valueOf(i0.f.c(((LayoutCustomBottomNavBinding) aVar.f4068c).f3328a.getContext(), aVar.f4066a));
                            case 2:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_active);
                            case 3:
                                return ((LayoutCustomBottomNavBinding) obj.f4068c).f3328a.getContext().getDrawable(R.drawable.bg_tab_inactive);
                            default:
                                List list = (List) obj.f4069d;
                                int w10 = w.w(ie.l.x(list, 10));
                                if (w10 < 16) {
                                    w10 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w10);
                                for (Object obj2 : list) {
                                    linkedHashMap.put(Integer.valueOf(((k) obj2).f8333a), obj2);
                                }
                                return linkedHashMap;
                        }
                    }
                });
                l lVar = new l() { // from class: fd.l
                    @Override // l4.l
                    public final void a(l4.x xVar, l4.u destination, Bundle bundle2) {
                        int i15 = i12;
                        Object obj2 = obj;
                        switch (i15) {
                            case 0:
                                MainActivity mainActivity = (MainActivity) obj2;
                                bf.o[] oVarArr = MainActivity.J;
                                kotlin.jvm.internal.k.e(destination, "<unused var>");
                                mainActivity.Y(HttpUrl.FRAGMENT_ENCODE_SET);
                                if (mainActivity.V()) {
                                    mainActivity.X(false);
                                    return;
                                }
                                SearchView searchView2 = mainActivity.G;
                                if (searchView2 != null) {
                                    SearchView.SearchAutoComplete searchAutoComplete = searchView2.M;
                                    searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                                    searchAutoComplete.setSelection(searchAutoComplete.length());
                                    searchView2.f791x0 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                SearchView searchView3 = mainActivity.G;
                                if (searchView3 != null) {
                                    searchView3.clearFocus();
                                }
                                MenuItem menuItem = mainActivity.F;
                                if (menuItem != null) {
                                    menuItem.collapseActionView();
                                    return;
                                }
                                return;
                            default:
                                kotlin.jvm.internal.k.e(destination, "destination");
                                dc.a.b((dc.a) obj2, destination);
                                return;
                        }
                    }
                };
                obj.f4072g = lVar;
                if (materialToolbar != null) {
                    m.E(materialToolbar, navController, cVar);
                }
                navController.a(lVar);
                for (ld.k kVar : Z) {
                    kVar.f8335c.setOnClickListener(new fd.b(12, (Object) obj, kVar));
                }
                u f3 = ((l4.x) obj.f4067b).f8199b.f();
                if (f3 != null) {
                    dc.a.b(obj, f3);
                }
                this.H = obj;
                T().f3149e.setOnMenuItemClickListener(new i(this));
                MenuItem findItem = T().f3149e.getMenu().findItem(R.id.item_search);
                this.F = findItem;
                if (findItem != null) {
                    view = findItem.getActionView();
                } else {
                    view = null;
                }
                if (view instanceof SearchView) {
                    searchView = (SearchView) view;
                } else {
                    searchView = null;
                }
                this.G = searchView;
                if (searchView != null) {
                    searchView.setOnQueryTextListener(new k7.d(this, 8));
                }
                if (!isFinishing() && !isDestroyed()) {
                    SharedPreferences sharedPreferences = (SharedPreferences) a8.b.f(this).a(x.a(SharedPreferences.class), null);
                    if (sharedPreferences.getBoolean("tgd", true)) {
                        l1 l1Var = this.E;
                        Boolean bool = (Boolean) ((s) l1Var.getValue()).f10143g.b("tg");
                        if (bool != null) {
                            z10 = bool.booleanValue();
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            ((s) l1Var.getValue()).f10143g.c("tg", Boolean.TRUE);
                            DialogTgJoinBinding inflate = DialogTgJoinBinding.inflate(getLayoutInflater(), null, false);
                            LinearLayout linearLayout2 = inflate.f3242a;
                            k.d(linearLayout2, "getRoot(...)");
                            i.h e10 = m.e(this, linearLayout2);
                            e10.setOnDismissListener(new fd.m(this, i13));
                            inflate.f3243b.setOnClickListener(new fd.g(e10, i12));
                            inflate.f3246e.setOnClickListener(new fd.g(e10, i13));
                            inflate.f3245d.setOnClickListener(new fd.h(e10, this, sharedPreferences, i13));
                            inflate.f3244c.setOnClickListener(new fd.b(i12, e10, sharedPreferences));
                            e10.show();
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("CustomBottomNavManager: add at least one tab via addTab()");
            }
        }
        U().a(new l() { // from class: fd.l
            @Override // l4.l
            public final void a(l4.x xVar, l4.u destination, Bundle bundle2) {
                int i15 = i13;
                Object obj2 = this;
                switch (i15) {
                    case 0:
                        MainActivity mainActivity = (MainActivity) obj2;
                        bf.o[] oVarArr = MainActivity.J;
                        kotlin.jvm.internal.k.e(destination, "<unused var>");
                        mainActivity.Y(HttpUrl.FRAGMENT_ENCODE_SET);
                        if (mainActivity.V()) {
                            mainActivity.X(false);
                            return;
                        }
                        SearchView searchView2 = mainActivity.G;
                        if (searchView2 != null) {
                            SearchView.SearchAutoComplete searchAutoComplete = searchView2.M;
                            searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                            searchAutoComplete.setSelection(searchAutoComplete.length());
                            searchView2.f791x0 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        SearchView searchView3 = mainActivity.G;
                        if (searchView3 != null) {
                            searchView3.clearFocus();
                        }
                        MenuItem menuItem = mainActivity.F;
                        if (menuItem != null) {
                            menuItem.collapseActionView();
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.internal.k.e(destination, "destination");
                        dc.a.b((dc.a) obj2, destination);
                        return;
                }
            }
        });
        Object obj2 = new Object();
        Object obj3 = new Object();
        n0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        fd.f fVar = new fd.f(this, obj3, obj2, i13);
        k.e(onBackPressedDispatcher, "<this>");
        onBackPressedDispatcher.a(this, new o0(fVar));
    }

    @Override // i.j, android.app.Activity
    public final void onDestroy() {
        dc.a aVar = this.H;
        if (aVar != null) {
            l4.x xVar = (l4.x) aVar.f4067b;
            fd.l listener = (fd.l) aVar.f4072g;
            xVar.getClass();
            k.e(listener, "listener");
            o4.h hVar = xVar.f8199b;
            hVar.getClass();
            hVar.f9912o.remove(listener);
        }
        super.onDestroy();
    }
}
