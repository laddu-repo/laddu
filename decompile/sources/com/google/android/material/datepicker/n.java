package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import com.playfy.tv.databinding.CatChoseDialogBinding;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import com.playfy.tv.ui.fragments.PlaylistsFragment;
import java.util.List;
import r1.j1;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2671x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2672y;

    public /* synthetic */ n(Object obj, int i6) {
        this.f2671x = i6;
        this.f2672y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = 3;
        Object obj = null;
        final int i10 = 0;
        final int i11 = 1;
        switch (this.f2671x) {
            case 0:
                ((p) this.f2672y).R();
                throw null;
            case 1:
                ((k4.q) this.f2672y).o(!r12.N0);
                return;
            case 2:
                k4.q qVar = ((k4.f) this.f2672y).D;
                u0 u0Var = qVar.M0;
                if (u0Var != null && u0Var.n0(29)) {
                    j1 H0 = qVar.M0.H0();
                    u0 u0Var2 = qVar.M0;
                    String str = u1.a0.f12750a;
                    u0Var2.A0(H0.a().d(1).l(1, false).b());
                    qVar.I.B[1] = qVar.getResources().getString(R.string.exo_track_selection_auto);
                    qVar.N.dismiss();
                    return;
                }
                return;
            case 3:
                k4.k kVar = (k4.k) this.f2672y;
                k4.q qVar2 = kVar.f7649x;
                int b10 = kVar.b();
                View view2 = qVar2.f7670f0;
                if (b10 == 0) {
                    k4.i iVar = qVar2.J;
                    view2.getClass();
                    qVar2.e(iVar, view2);
                    return;
                } else {
                    if (b10 == 1) {
                        k4.f fVar = qVar2.L;
                        view2.getClass();
                        qVar2.e(fVar, view2);
                        return;
                    }
                    qVar2.N.dismiss();
                    return;
                }
            case 4:
                k4.q qVar3 = ((k4.f) this.f2672y).D;
                u0 u0Var3 = qVar3.M0;
                if (u0Var3 != null && u0Var3.n0(29)) {
                    qVar3.M0.A0(qVar3.M0.H0().a().d(3).g().i().k().b());
                    qVar3.N.dismiss();
                    return;
                }
                return;
            case 5:
                k4.v vVar = (k4.v) this.f2672y;
                vVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    vVar.f7717q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        vVar.f7718r.start();
                        return;
                    }
                    return;
                }
            case 6:
                ((androidx.lifecycle.i) ((c6.h) this.f2672y).f1983z).invoke();
                return;
            case 7:
                nd.d dVar = (nd.d) this.f2672y;
                bf.o[] oVarArr = nd.d.D0;
                dVar.P().getData();
                return;
            case 8:
                nd.e eVar = (nd.e) this.f2672y;
                bf.o[] oVarArr2 = nd.e.A0;
                eVar.O();
                return;
            case 9:
                PlaylistFragment playlistFragment = (PlaylistFragment) this.f2672y;
                int i12 = PlaylistFragment.F0;
                final CatChoseDialogBinding inflate = CatChoseDialogBinding.inflate(playlistFragment.e(), null, false);
                ConstraintLayout constraintLayout = inflate.f3192a;
                TextInputLayout textInputLayout = inflate.f3198g;
                FrameLayout frameLayout = inflate.f3193b;
                Object obj2 = playlistFragment.T().f10101g.f973e;
                if (obj2 != o0.f968k) {
                    obj = obj2;
                }
                List list = (List) obj;
                if (list == null) {
                    list = ie.r.f6846x;
                }
                nd.r rVar = new nd.r(list, new nd.l(playlistFragment, 1));
                inflate.f3194c.setAdapter(rVar);
                inflate.f3196e.addTextChangedListener(new nd.x(rVar, inflate));
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: nd.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i13 = i10;
                        CatChoseDialogBinding catChoseDialogBinding = inflate;
                        switch (i13) {
                            case 0:
                                int i14 = PlaylistFragment.F0;
                                TextInputLayout searchLayout = catChoseDialogBinding.f3198g;
                                kotlin.jvm.internal.k.d(searchLayout, "searchLayout");
                                if (searchLayout.getVisibility() == 0) {
                                    PlaylistFragment.V(catChoseDialogBinding);
                                    return;
                                }
                                return;
                            default:
                                int i15 = PlaylistFragment.F0;
                                Editable text = catChoseDialogBinding.f3196e.getText();
                                if (text != null) {
                                    text.clear();
                                    return;
                                }
                                return;
                        }
                    }
                });
                inflate.f3195d.setOnClickListener(new fd.b(13, inflate, inflate));
                textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: nd.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i13 = i11;
                        CatChoseDialogBinding catChoseDialogBinding = inflate;
                        switch (i13) {
                            case 0:
                                int i14 = PlaylistFragment.F0;
                                TextInputLayout searchLayout = catChoseDialogBinding.f3198g;
                                kotlin.jvm.internal.k.d(searchLayout, "searchLayout");
                                if (searchLayout.getVisibility() == 0) {
                                    PlaylistFragment.V(catChoseDialogBinding);
                                    return;
                                }
                                return;
                            default:
                                int i15 = PlaylistFragment.F0;
                                Editable text = catChoseDialogBinding.f3196e.getText();
                                if (text != null) {
                                    text.clear();
                                    return;
                                }
                                return;
                        }
                    }
                });
                textInputLayout.setEndIconVisible(false);
                Context F = playlistFragment.F();
                kotlin.jvm.internal.k.d(constraintLayout, "getRoot(...)");
                i.h e10 = cf.m.e(F, constraintLayout);
                cf.m.a(constraintLayout);
                frameLayout.setOnClickListener(new fd.g(e10, i6));
                rVar.D = new androidx.lifecycle.i(e10, 15);
                e10.show();
                return;
            case 10:
                PlaylistsFragment playlistsFragment = (PlaylistsFragment) this.f2672y;
                bf.o[] oVarArr3 = PlaylistsFragment.D0;
                Context F2 = playlistsFragment.F();
                n9.j jVar = new n9.j(F2, playlistsFragment.N().f3296a);
                new n.h(F2).inflate(R.menu.playlist_menu, (o.l) jVar.f9355y);
                jVar.A = new nd.a0(playlistsFragment);
                o.v vVar2 = (o.v) jVar.f9356z;
                if (!vVar2.b()) {
                    if (vVar2.f9841e != null) {
                        vVar2.d(0, 0, false, false);
                        return;
                    }
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                return;
            case 11:
                za.c cVar = (za.c) this.f2672y;
                EditText editText = cVar.f15240i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    cVar.p();
                    return;
                }
                return;
            case 12:
                ((za.i) this.f2672y).t();
                return;
            default:
                za.s sVar = (za.s) this.f2672y;
                EditText editText2 = sVar.f15306f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = sVar.f15306f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        sVar.f15306f.setTransformationMethod(null);
                    } else {
                        sVar.f15306f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        sVar.f15306f.setSelection(selectionEnd);
                    }
                    sVar.p();
                    return;
                }
                return;
        }
    }
}
