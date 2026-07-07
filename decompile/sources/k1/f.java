package k1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b8.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f7267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f7268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7269e = true;

    public f(TextView textView) {
        this.f7267c = textView;
        this.f7268d = new d(textView);
    }

    @Override // b8.h
    public final boolean A() {
        return this.f7269e;
    }

    @Override // b8.h
    public final void M(boolean z2) {
        if (z2) {
            TextView textView = this.f7267c;
            textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        }
    }

    @Override // b8.h
    public final void N(boolean z2) {
        this.f7269e = z2;
        TextView textView = this.f7267c;
        textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        textView.setFilters(t(textView.getFilters()));
    }

    @Override // b8.h
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return this.f7269e ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f7276v : transformationMethod;
    }

    @Override // b8.h
    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        if (!this.f7269e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
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
            d dVar = this.f7268d;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }
}
