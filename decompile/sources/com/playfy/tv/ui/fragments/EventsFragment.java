package com.playfy.tv.ui.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.l1;
import com.playfy.tv.R;
import kotlin.jvm.internal.x;
import nd.d;
import nd.k;
import od.j;
import od.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EventsFragment extends d {
    public final l1 E0 = new l1(x.a(s.class), new k(this, 0), new k(this, 2), new k(this, 1));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, w4.v0] */
    @Override // nd.d, j1.y
    public final void B(View view, Bundle bundle) {
        kotlin.jvm.internal.k.e(view, "view");
        super.B(view, bundle);
        N().f3294e.h(new Object());
    }

    @Override // nd.d
    public final String O() {
        String i6 = i(R.string.live_events);
        kotlin.jvm.internal.k.d(i6, "getString(...)");
        return i6;
    }

    @Override // nd.d
    public final j P() {
        return (s) this.E0.getValue();
    }
}
