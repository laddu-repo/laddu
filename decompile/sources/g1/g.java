package g1;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import e1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends a8.c {

    /* renamed from: a, reason: collision with root package name */
    public final f f5294a;

    public g(TextView textView) {
        this.f5294a = new f(textView);
    }

    @Override // a8.c
    public final InputFilter[] f(InputFilter[] inputFilterArr) {
        boolean z10;
        if (k.f4160k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f5294a.f(inputFilterArr);
    }

    @Override // a8.c
    public final boolean j() {
        return this.f5294a.f5293c;
    }

    @Override // a8.c
    public final void l(boolean z10) {
        boolean z11;
        if (k.f4160k != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f5294a.l(z10);
    }

    @Override // a8.c
    public final void m(boolean z10) {
        boolean z11;
        f fVar = this.f5294a;
        if (k.f4160k != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f5293c = z10;
        } else {
            fVar.m(z10);
        }
    }

    @Override // a8.c
    public final TransformationMethod t(TransformationMethod transformationMethod) {
        boolean z10;
        if (k.f4160k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return transformationMethod;
        }
        return this.f5294a.t(transformationMethod);
    }
}
