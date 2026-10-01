package com.playfy.tv.ui.fragments;

import androidx.lifecycle.l1;
import b1.v;
import com.playfy.tv.R;
import he.a;
import he.f;
import he.g;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import nd.d;
import nd.h;
import od.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HighFragment extends d {
    public final l1 E0;

    public HighFragment() {
        f c10 = a.c(g.f6075z, new v(new v(this, 5), 6));
        this.E0 = new l1(x.a(od.x.class), new nd.g(c10, 2), new h(this, c10, 1), new nd.g(c10, 3));
    }

    @Override // nd.d
    public final String O() {
        String i6 = i(R.string.high);
        k.d(i6, "getString(...)");
        return i6;
    }

    @Override // nd.d
    public final j P() {
        return (od.x) this.E0.getValue();
    }
}
