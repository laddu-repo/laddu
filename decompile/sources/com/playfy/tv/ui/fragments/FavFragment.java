package com.playfy.tv.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import cf.n;
import com.playfy.tv.R;
import fd.d;
import he.a;
import he.g;
import he.m;
import kf.f1;
import kotlin.jvm.internal.k;
import nd.e;
import nd.i;
import od.u;
import w4.e0;
import w4.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FavFragment extends e<Parcelable> {
    public static final /* synthetic */ int D0 = 0;
    public final Object B0 = a.c(g.f6075z, new i(this, new d(this, 3), 1));
    public final m C0 = a.d(new androidx.lifecycle.i(this, 14));

    /* JADX WARN: Type inference failed for: r4v1, types: [he.f, java.lang.Object] */
    @Override // nd.e, j1.y
    public final void B(View view, Bundle bundle) {
        k.e(view, "view");
        super.B(view, bundle);
        ((u) this.B0.getValue()).f10152e.d(j(), new n4.i(new n(this, 14), 2));
    }

    @Override // nd.e
    public final String P() {
        String i6 = i(R.string.favourites);
        k.d(i6, "getString(...)");
        return i6;
    }

    @Override // nd.e
    public final k0 Q() {
        return (e0) this.C0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [he.f, java.lang.Object] */
    @Override // nd.e
    public final void R(String query) {
        k.e(query, "query");
        f1 f1Var = ((u) this.B0.getValue()).f10151d;
        f1Var.getClass();
        f1Var.h(null, query);
    }
}
