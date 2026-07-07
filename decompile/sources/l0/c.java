package l0;

import android.graphics.Insets;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f8061e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f8062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8063b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8065d;

    public c(int i6, int i10, int i11, int i12) {
        this.f8062a = i6;
        this.f8063b = i10;
        this.f8064c = i11;
        this.f8065d = i12;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f8062a, cVar2.f8062a), Math.max(cVar.f8063b, cVar2.f8063b), Math.max(cVar.f8064c, cVar2.f8064c), Math.max(cVar.f8065d, cVar2.f8065d));
    }

    public static c b(int i6, int i10, int i11, int i12) {
        if (i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f8061e;
        }
        return new c(i6, i10, i11, i12);
    }

    public static c c(Insets insets) {
        int i6;
        int i10;
        int i11;
        int i12;
        i6 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i6, i10, i11, i12);
    }

    public final Insets d() {
        return a.b(this.f8062a, this.f8063b, this.f8064c, this.f8065d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8065d == cVar.f8065d && this.f8062a == cVar.f8062a && this.f8064c == cVar.f8064c && this.f8063b == cVar.f8063b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f8062a * 31) + this.f8063b) * 31) + this.f8064c) * 31) + this.f8065d;
    }

    public final String toString() {
        return "Insets{left=" + this.f8062a + ", top=" + this.f8063b + ", right=" + this.f8064c + ", bottom=" + this.f8065d + '}';
    }
}
