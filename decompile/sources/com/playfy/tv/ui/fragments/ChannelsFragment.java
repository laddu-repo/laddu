package com.playfy.tv.ui.fragments;

import com.playfy.tv.R;
import fd.d;
import gd.p;
import he.a;
import he.g;
import he.m;
import kd.l;
import kotlin.jvm.internal.k;
import nd.f;
import nd.i;
import od.n;
import od.q;
import w4.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ChannelsFragment extends f<l> {
    public static final /* synthetic */ int E0 = 0;
    public final Object C0 = a.c(g.f6075z, new i(this, new d(this, 2), 0));
    public final m D0 = a.d(new androidx.lifecycle.i(this, 13));

    @Override // nd.e
    public final String P() {
        String i6 = i(R.string.channels);
        k.d(i6, "getString(...)");
        return i6;
    }

    @Override // nd.e
    public final k0 Q() {
        return (p) this.D0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    @Override // nd.f
    public final n T() {
        return (q) this.C0.getValue();
    }
}
