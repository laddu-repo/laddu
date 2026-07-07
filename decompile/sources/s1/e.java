package s1;

import java.util.Objects;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f11981e = new e(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f11982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11985d;

    public e(int i6, int i10, int i11) {
        int i12;
        this.f11982a = i6;
        this.f11983b = i10;
        this.f11984c = i11;
        if (a0.L(i11)) {
            i12 = a0.s(i11) * i10;
        } else {
            i12 = -1;
        }
        this.f11985d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f11982a == eVar.f11982a && this.f11983b == eVar.f11983b && this.f11984c == eVar.f11984c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11982a), Integer.valueOf(this.f11983b), Integer.valueOf(this.f11984c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11982a + ", channelCount=" + this.f11983b + ", encoding=" + this.f11984c + ']';
    }
}
