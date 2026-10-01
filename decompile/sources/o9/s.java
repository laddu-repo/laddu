package o9;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10058c;

    @Override // o9.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10059a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f10057b, this.f10058c);
        path.transform(matrix);
    }
}
