package k1;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b8.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f7270c;

    public g(TextView textView) {
        this.f7270c = new f(textView);
    }

    @Override // b8.h
    public final boolean A() {
        return this.f7270c.f7269e;
    }

    @Override // b8.h
    public final void M(boolean z2) {
        if (m.f912k != null) {
            this.f7270c.M(z2);
        }
    }

    @Override // b8.h
    public final void N(boolean z2) {
        f fVar = this.f7270c;
        if (m.f912k != null) {
            fVar.N(z2);
        } else {
            fVar.f7269e = z2;
        }
    }

    @Override // b8.h
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return !(m.f912k != null) ? transformationMethod : this.f7270c.Q(transformationMethod);
    }

    @Override // b8.h
    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        return !(m.f912k != null) ? inputFilterArr : this.f7270c.t(inputFilterArr);
    }
}
