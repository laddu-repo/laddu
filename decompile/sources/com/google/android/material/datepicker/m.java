package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m<S> extends w {
    public int A0;
    public b B0;
    public r C0;
    public int D0;
    public c E0;
    public RecyclerView F0;
    public RecyclerView G0;
    public View H0;
    public View I0;
    public View J0;
    public View K0;
    public MaterialButton L0;
    public AccessibilityManager M0;

    public final void N(r rVar) {
        boolean z10;
        v vVar = (v) this.G0.getAdapter();
        int d10 = vVar.A.f2651x.d(rVar);
        AccessibilityManager accessibilityManager = this.M0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.C0 = rVar;
            this.G0.f0(d10);
        } else {
            int d11 = d10 - vVar.A.f2651x.d(this.C0);
            boolean z11 = false;
            if (Math.abs(d11) > 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d11 > 0) {
                z11 = true;
            }
            this.C0 = rVar;
            if (z10 && z11) {
                this.G0.f0(d10 - 3);
                this.G0.post(new g(d10, 0, this));
            } else if (z10) {
                this.G0.f0(d10 + 3);
                this.G0.post(new g(d10, 0, this));
            } else {
                this.G0.post(new g(d10, 0, this));
            }
        }
        P(d10);
    }

    public final void O(int i6) {
        this.D0 = i6;
        if (i6 == 2) {
            this.F0.getLayoutManager().p0(this.C0.f2690z - ((a0) this.F0.getAdapter()).A.B0.f2651x.f2690z);
            this.J0.setVisibility(0);
            this.K0.setVisibility(8);
            this.H0.setVisibility(8);
            this.I0.setVisibility(8);
            return;
        }
        if (i6 == 1) {
            this.J0.setVisibility(8);
            this.K0.setVisibility(0);
            this.H0.setVisibility(0);
            this.I0.setVisibility(0);
            N(this.C0);
        }
    }

    public final void P(int i6) {
        boolean z10;
        View view = this.I0;
        boolean z11 = false;
        if (i6 + 1 < this.G0.getAdapter().a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setEnabled(z10);
        View view2 = this.H0;
        if (i6 - 1 >= 0) {
            z11 = true;
        }
        view2.setEnabled(z11);
    }

    @Override // j1.y
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.D;
        }
        this.A0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.B0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.C0 = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x01bb, code lost:
    
        r13 = new w4.i0();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [w4.p0, java.lang.Object] */
    @Override // j1.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View t(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.t(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // j1.y
    public final void y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.B0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.C0);
    }
}
