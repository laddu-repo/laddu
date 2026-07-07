package e2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4213d;

    public b(String str, String str2, int i6, int i10) {
        this.f4210a = str;
        this.f4211b = str2;
        this.f4212c = i6;
        this.f4213d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4212c == bVar.f4212c && this.f4213d == bVar.f4213d && Objects.equals(this.f4210a, bVar.f4210a) && Objects.equals(this.f4211b, bVar.f4211b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f4210a, this.f4211b, Integer.valueOf(this.f4212c), Integer.valueOf(this.f4213d));
    }
}
