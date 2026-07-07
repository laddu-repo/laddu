package com.playfy.tv.ui.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.n;
import com.playfy.tv.R;
import com.playfy.tv.databinding.CatChoseDialogBinding;
import com.playfy.tv.databinding.FragmentRecyclerBinding;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import fd.d;
import fd.w;
import gd.s;
import gf.n1;
import hd.b;
import he.a;
import he.g;
import he.m;
import kd.h0;
import kotlin.jvm.internal.k;
import nd.f;
import nd.l;
import nd.v;
import nd.y;
import nd.z;
import od.i0;
import w4.k0;
import w4.s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PlaylistFragment extends f<h0> {
    public static final /* synthetic */ int F0 = 0;
    public final m C0;
    public final Object D0;
    public final m E0;

    public PlaylistFragment() {
        final int i6 = 0;
        this.C0 = a.d(new ve.a(this) { // from class: nd.n

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlaylistFragment f9710y;

            {
                this.f9710y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i10 = i6;
                PlaylistFragment playlistFragment = this.f9710y;
                switch (i10) {
                    case 0:
                        int i11 = PlaylistFragment.F0;
                        return new v(new l(playlistFragment, 3));
                    default:
                        int i12 = PlaylistFragment.F0;
                        return new gd.s(new l(playlistFragment, 0), new n1(1, playlistFragment.T(), i0.class, "changeFav", "changeFav(Landroid/os/Parcelable;)V", 0, 3));
                }
            }
        });
        m d10 = a.d(new d(this, 4));
        this.D0 = a.c(g.f6075z, new z(this, new y(d10, 0), new y(d10, 1)));
        final int i10 = 1;
        this.E0 = a.d(new ve.a(this) { // from class: nd.n

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ PlaylistFragment f9710y;

            {
                this.f9710y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                int i102 = i10;
                PlaylistFragment playlistFragment = this.f9710y;
                switch (i102) {
                    case 0:
                        int i11 = PlaylistFragment.F0;
                        return new v(new l(playlistFragment, 3));
                    default:
                        int i12 = PlaylistFragment.F0;
                        return new gd.s(new l(playlistFragment, 0), new n1(1, playlistFragment.T(), i0.class, "changeFav", "changeFav(Landroid/os/Parcelable;)V", 0, 3));
                }
            }
        });
    }

    public static final void V(CatChoseDialogBinding catChoseDialogBinding) {
        Editable text = catChoseDialogBinding.f3196e.getText();
        if (text != null) {
            text.clear();
        }
        catChoseDialogBinding.f3198g.setVisibility(8);
        catChoseDialogBinding.f3197f.setImageResource(R.drawable.ic_search);
    }

    @Override // nd.f, nd.e, j1.y
    public final void B(View view, Bundle bundle) {
        k.e(view, "view");
        super.B(view, bundle);
        FragmentRecyclerBinding N = N();
        FragmentRecyclerBinding N2 = N();
        final i iVar = new i(N2, 16);
        ImageButton imageButton = N2.f3300b;
        RecyclerView recyclerView = N2.f3302d;
        imageButton.setNextFocusDownId(recyclerView.getId());
        RecyclerView recyclerView2 = N2.f3303e;
        recyclerView2.setNextFocusDownId(recyclerView.getId());
        ImageButton imageButton2 = N2.f3300b;
        recyclerView.setNextFocusUpId(imageButton2.getId());
        final int i6 = 0;
        imageButton2.setOnKeyListener(new View.OnKeyListener() { // from class: nd.o
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i10, KeyEvent keyEvent) {
                int i11 = i6;
                androidx.lifecycle.i iVar2 = iVar;
                switch (i11) {
                    case 0:
                        int i12 = PlaylistFragment.F0;
                        if (keyEvent.getAction() != 0 || i10 != 20) {
                            return false;
                        }
                        iVar2.invoke();
                        return Boolean.TRUE.booleanValue();
                    default:
                        int i13 = PlaylistFragment.F0;
                        if (keyEvent.getAction() != 0 || i10 != 20) {
                            return false;
                        }
                        iVar2.invoke();
                        return Boolean.TRUE.booleanValue();
                }
            }
        });
        final int i10 = 1;
        recyclerView2.setOnKeyListener(new View.OnKeyListener() { // from class: nd.o
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i102, KeyEvent keyEvent) {
                int i11 = i10;
                androidx.lifecycle.i iVar2 = iVar;
                switch (i11) {
                    case 0:
                        int i12 = PlaylistFragment.F0;
                        if (keyEvent.getAction() != 0 || i102 != 20) {
                            return false;
                        }
                        iVar2.invoke();
                        return Boolean.TRUE.booleanValue();
                    default:
                        int i13 = PlaylistFragment.F0;
                        if (keyEvent.getAction() != 0 || i102 != 20) {
                            return false;
                        }
                        iVar2.invoke();
                        return Boolean.TRUE.booleanValue();
                }
            }
        });
        RecyclerView recyclerView3 = N.f3303e;
        recyclerView3.setAdapter((v) this.C0.getValue());
        LinearLayoutManager linearLayoutManager = null;
        recyclerView3.setItemAnimator(null);
        s0 layoutManager = recyclerView3.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        if (linearLayoutManager != null) {
            linearLayoutManager.b1(0);
        }
        T().f10101g.d(j(), new w(new b(3, N, this), 3));
        T().f10103i.d(j(), new w(new l(this, 2), 3));
        N.f3300b.setOnClickListener(new n(this, 9));
    }

    @Override // nd.e
    public final String P() {
        String i6 = i(R.string.channels);
        k.d(i6, "getString(...)");
        return i6;
    }

    @Override // nd.e
    public final k0 Q() {
        return (s) this.E0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    @Override // nd.f
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final i0 T() {
        return (i0) this.D0.getValue();
    }
}
