package ua;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: b, reason: collision with root package name */
    public float f13040b;

    /* renamed from: c, reason: collision with root package name */
    public float f13041c;

    @Override // ua.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f13042a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f13040b, this.f13041c);
        path.transform(matrix);
    }
}
