package com.playfy.tv.ui.fragments;

import androidx.lifecycle.l1;
import b1.v;
import cf.n;
import com.playfy.tv.R;
import gd.c;
import he.a;
import he.g;
import kd.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import nd.f;
import nd.h;
import od.o;
import w4.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CatsFragment extends f<i> {
    public static final /* synthetic */ int E0 = 0;
    public final l1 C0;
    public final c D0;

    public CatsFragment() {
        he.f c10 = a.c(g.f6075z, new v(new v(this, 3), 4));
        this.C0 = new l1(x.a(o.class), new nd.g(c10, 0), new h(this, c10, 0), new nd.g(c10, 1));
        this.D0 = new c(new n(this, 13));
    }

    @Override // nd.e
    public final String P() {
        String i6 = i(R.string.categories);
        k.d(i6, "getString(...)");
        return i6;
    }

    @Override // nd.e
    public final k0 Q() {
        return this.D0;
    }

    @Override // nd.f
    public final od.n T() {
        return (o) this.C0.getValue();
    }
}
