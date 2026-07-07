package com.playfy.tv.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bf.o;
import com.google.android.material.datepicker.n;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import com.playfy.tv.databinding.DialogPlaylistEditorBinding;
import com.playfy.tv.databinding.FragmentPlaylistsBinding;
import com.playfy.tv.databinding.PlaylistInputBinding;
import df.u;
import fd.d;
import g.b;
import he.a;
import he.g;
import he.m;
import i.h;
import j1.s;
import j1.v;
import j1.y;
import j6.c;
import java.util.concurrent.atomic.AtomicReference;
import k6.e;
import kd.d0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import nd.a0;
import nd.b0;
import nd.i;
import od.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PlaylistsFragment extends y {
    public static final /* synthetic */ o[] D0;
    public final Object A0;
    public final m B0;
    public final s C0;

    /* renamed from: z0, reason: collision with root package name */
    public final c f3380z0;

    static {
        q qVar = new q(PlaylistsFragment.class, "binding", "getBinding()Lcom/playfy/tv/databinding/FragmentPlaylistsBinding;");
        x.f8056a.getClass();
        D0 = new o[]{qVar};
    }

    public PlaylistsFragment() {
        super(R.layout.fragment_playlists);
        this.f3380z0 = e.o(this, FragmentPlaylistsBinding.class);
        this.A0 = a.c(g.f6075z, new i(this, new d(this, 5), 2));
        this.B0 = a.d(new androidx.lifecycle.i(this, 17));
        b bVar = new b(2);
        a0 a0Var = new a0(this);
        k7.d dVar = new k7.d(this, 12);
        if (this.f7040x <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            v vVar = new v(this, dVar, atomicReference, bVar, a0Var);
            if (this.f7040x >= 0) {
                vVar.a();
            } else {
                this.f7039w0.add(vVar);
            }
            this.C0 = new s(atomicReference);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [he.f, java.lang.Object] */
    @Override // j1.y
    public final void B(View view, Bundle bundle) {
        k.e(view, "view");
        N().f3297b.setText(h().getString(R.string.empty_error, "Playlists"));
        FragmentPlaylistsBinding N = N();
        N.f3296a.setOnClickListener(new n(this, 10));
        N.f3298c.setAdapter((gd.x) this.B0.getValue());
        ((k0) this.A0.getValue()).f10117c.d(j(), new n4.i(new b0(this, 0), 3));
    }

    public final FragmentPlaylistsBinding N() {
        return (FragmentPlaylistsBinding) this.f3380z0.a(this, D0[0]);
    }

    public final void O(boolean z10, d0 d0Var) {
        String str;
        int i6;
        int i10;
        DialogPlaylistEditorBinding inflate = DialogPlaylistEditorBinding.inflate(e(), null, false);
        LinearLayout linearLayout = inflate.f3237d;
        PlaylistInputBinding playlistInputBinding = inflate.f3238e;
        TextInputLayout textInputLayout = playlistInputBinding.f3344a;
        TextInputEditText textInputEditText = playlistInputBinding.f3345b;
        TextInputEditText textInputEditText2 = playlistInputBinding.f3347d;
        TextView textView = inflate.f3241h;
        if (z10) {
            str = "Enter";
        } else {
            str = "Update";
        }
        boolean z11 = true;
        textView.setText(h().getString(R.string.playlist_details, str));
        TextView textView2 = inflate.f3240g;
        if (z10) {
            i6 = R.string.add;
        } else {
            i6 = R.string.update_txt;
        }
        textView2.setText(i6);
        if (!z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        String str2 = d0Var.f7846b;
        String str3 = d0Var.f7847c;
        textInputEditText2.setText(str2);
        Context F = F();
        cf.m.C(F, textInputEditText2, playlistInputBinding.f3346c);
        cf.m.C(F, textInputEditText, textInputLayout);
        if (str3.length() != 0 && (!URLUtil.isValidUrl(str3) || !u.H(str3, "http", false))) {
            z11 = false;
        }
        textInputEditText.setEnabled(z11);
        textInputLayout.setEndIconVisible(textInputEditText.isEnabled());
        if (!textInputEditText.isEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 20; i11++) {
                sb2.append("*");
            }
            str3 = sb2.toString();
        }
        textInputEditText.setText(str3);
        Context F2 = F();
        ConstraintLayout constraintLayout = inflate.f3234a;
        k.d(constraintLayout, "getRoot(...)");
        h e10 = cf.m.e(F2, constraintLayout);
        inflate.f3236c.setOnClickListener(new fd.g(e10, 4));
        inflate.f3235b.setOnClickListener(new fd.g(e10, 5));
        linearLayout.setOnClickListener(new fd.h(this, d0Var, e10));
        inflate.f3239f.setOnClickListener(new k4.o(playlistInputBinding, this, d0Var, e10, 1));
        e10.show();
    }
}
