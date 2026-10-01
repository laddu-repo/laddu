package g1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends a8.c {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5291a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5292b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5293c = true;

    public f(TextView textView) {
        this.f5291a = textView;
        this.f5292b = new d(textView);
    }

    @Override // a8.c
    public final InputFilter[] f(InputFilter[] inputFilterArr) {
        if (!this.f5293c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i6 = 0; i6 < inputFilterArr.length; i6++) {
                InputFilter inputFilter = inputFilterArr[i6];
                if (inputFilter instanceof d) {
                    sparseArray.put(i6, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f5292b;
            if (i12 < length2) {
                if (inputFilterArr[i12] == dVar) {
                    return inputFilterArr;
                }
                i12++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // a8.c
    public final boolean j() {
        return this.f5293c;
    }

    @Override // a8.c
    public final void l(boolean z10) {
        if (z10) {
            TextView textView = this.f5291a;
            textView.setTransformationMethod(t(textView.getTransformationMethod()));
        }
    }

    @Override // a8.c
    public final void m(boolean z10) {
        this.f5293c = z10;
        TextView textView = this.f5291a;
        textView.setTransformationMethod(t(textView.getTransformationMethod()));
        textView.setFilters(f(textView.getFilters()));
    }

    @Override // a8.c
    public final TransformationMethod t(TransformationMethod transformationMethod) {
        if (this.f5293c) {
            if (transformationMethod instanceof j) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new j(transformationMethod);
        }
        if (transformationMethod instanceof j) {
            return ((j) transformationMethod).f5300x;
        }
        return transformationMethod;
    }
}
