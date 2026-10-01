package com.google.android.material.internal;

import aa.h;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import ma.b;
import p.x;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class CheckableImageButton extends x implements Checkable {
    public static final int[] D = {R.attr.state_checked};
    public boolean A;
    public boolean B;
    public boolean C;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playfy.tv.R.attr.imageButtonStyle);
        this.B = true;
        this.C = true;
        q0.r(this, new h(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        if (this.A) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i6 + 1), D);
        }
        return super.onCreateDrawableState(i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f15113x);
        setChecked(bVar.f8728z);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [z0.b, android.os.Parcelable, ma.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new z0.b(super.onSaveInstanceState());
        bVar.f8728z = this.A;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.B && this.A != z10) {
            this.A = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.C = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.C) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A);
    }
}
