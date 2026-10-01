package t1;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f12003d = new i0(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12006c;

    static {
        w1.b0.H(0);
        w1.b0.H(1);
    }

    public i0(float f, float f4) {
        w1.a.d(f > 0.0f);
        w1.a.d(f4 > 0.0f);
        this.f12004a = f;
        this.f12005b = f4;
        this.f12006c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f12004a == i0Var.f12004a && this.f12005b == i0Var.f12005b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f12005b) + ((Float.floatToRawIntBits(this.f12004a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f12004a), Float.valueOf(this.f12005b)};
        int i = w1.b0.f13686a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
