package h2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5864b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5865c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5866d;

    public d(String str, double d10) {
        this.f5863a = str;
        this.f5864b = 2;
        this.f5865c = d10;
        this.f5866d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f5864b == dVar.f5864b && Double.compare(this.f5865c, dVar.f5865c) == 0 && Objects.equals(this.f5863a, dVar.f5863a) && Objects.equals(this.f5866d, dVar.f5866d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f5863a, Integer.valueOf(this.f5864b), Double.valueOf(this.f5865c), this.f5866d);
    }

    public d(int i6, String str, String str2) {
        boolean z10 = true;
        if (i6 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        u1.c.g(z10);
        this.f5863a = str;
        this.f5864b = i6;
        this.f5866d = str2;
        this.f5865c = 0.0d;
    }
}
