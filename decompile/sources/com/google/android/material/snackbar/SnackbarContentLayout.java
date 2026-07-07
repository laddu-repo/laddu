package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import u9.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: x, reason: collision with root package name */
    public TextView f2741x;

    /* renamed from: y, reason: collision with root package name */
    public Button f2742y;

    /* renamed from: z, reason: collision with root package name */
    public int f2743z;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j5.u(context, R.attr.motionEasingEmphasizedInterpolator, a.f12954b);
    }

    public final boolean a(int i6, int i10, int i11) {
        boolean z10;
        if (i6 != getOrientation()) {
            setOrientation(i6);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f2741x.getPaddingTop() == i10 && this.f2741x.getPaddingBottom() == i11) {
            return z10;
        }
        TextView textView = this.f2741x;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f2742y;
    }

    public TextView getMessageView() {
        return this.f2741x;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2741x = (TextView) findViewById(R.id.snackbar_text);
        this.f2742y = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        super.onMeasure(i6, i10);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.f2741x.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f2743z > 0 && this.f2742y.getMeasuredWidth() > this.f2743z) {
                if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z10) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i6, i10);
        }
    }

    public void setMaxInlineActionWidth(int i6) {
        this.f2743z = i6;
    }
}
