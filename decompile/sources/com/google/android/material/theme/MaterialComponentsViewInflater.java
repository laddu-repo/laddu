package com.google.android.material.theme;

import a8.i;
import ab.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.playfy.tv.R;
import da.b;
import i.f0;
import ma.n;
import p.b1;
import p.c0;
import p.o;
import p.p;
import p.q;
import za.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends f0 {
    @Override // i.f0
    public final o a(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    @Override // i.f0
    public final p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // i.f0
    public final q c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.CompoundButton, qa.a, p.c0, android.view.View] */
    @Override // i.f0
    public final c0 d(Context context, AttributeSet attributeSet) {
        ?? c0Var = new c0(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0Var.getContext();
        TypedArray f3 = n.f(context2, attributeSet, t9.a.B, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f3.hasValue(0)) {
            c0Var.setButtonTintList(i.i(context2, f3, 0));
        }
        c0Var.C = f3.getBoolean(1, false);
        f3.recycle();
        return c0Var;
    }

    @Override // i.f0
    public final b1 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
