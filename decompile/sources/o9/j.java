package o9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10022a;

    public j(float f) {
        this.f10022a = f;
    }

    @Override // o9.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f10022a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f10022a == ((j) obj).f10022a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10022a)});
    }

    public final String toString() {
        return j4.a.l((int) (this.f10022a * 100.0f), "%", new StringBuilder());
    }
}
