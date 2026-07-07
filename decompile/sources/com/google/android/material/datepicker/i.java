package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import w4.e1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, int i6, int i10) {
        super(i6);
        this.F = mVar;
        this.E = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(e1 e1Var, int[] iArr) {
        int i6 = this.E;
        m mVar = this.F;
        if (i6 == 0) {
            iArr[0] = mVar.G0.getWidth();
            iArr[1] = mVar.G0.getWidth();
        } else {
            iArr[0] = mVar.G0.getHeight();
            iArr[1] = mVar.G0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final void z0(RecyclerView recyclerView, int i6) {
        ca.b bVar = new ca.b(recyclerView.getContext());
        bVar.f13823a = i6;
        A0(bVar);
    }
}
