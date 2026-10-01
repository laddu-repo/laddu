package o9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f9992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9993b;

    public b(float f, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f9992a;
            f += ((b) dVar).f9993b;
        }
        this.f9992a = dVar;
        this.f9993b = f;
    }

    @Override // o9.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f9992a.a(rectF) + this.f9993b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9992a.equals(bVar.f9992a) && this.f9993b == bVar.f9993b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9992a, Float.valueOf(this.f9993b)});
    }
}
