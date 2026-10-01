package g1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import e1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: x, reason: collision with root package name */
    public final TransformationMethod f5300x;

    public j(TransformationMethod transformationMethod) {
        this.f5300x = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f5300x;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && k.a().b() == 1) {
            k a10 = k.a();
            a10.getClass();
            return a10.e(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i6, Rect rect) {
        TransformationMethod transformationMethod = this.f5300x;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i6, rect);
        }
    }
}
