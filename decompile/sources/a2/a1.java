package a2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f158a;

    /* renamed from: b, reason: collision with root package name */
    public final float f159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f160c;

    public a1(z0 z0Var) {
        this.f158a = z0Var.f509a;
        this.f159b = z0Var.f510b;
        this.f160c = z0Var.f511c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (this.f158a == a1Var.f158a && this.f159b == a1Var.f159b && this.f160c == a1Var.f160c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f158a), Float.valueOf(this.f159b), Long.valueOf(this.f160c));
    }
}
