package q2;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: d, reason: collision with root package name */
    public static final k1 f10907d = new k1(new r1.e1[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f10908e;

    /* renamed from: a, reason: collision with root package name */
    public final int f10909a;

    /* renamed from: b, reason: collision with root package name */
    public final db.c1 f10910b;

    /* renamed from: c, reason: collision with root package name */
    public int f10911c;

    static {
        String str = u1.a0.f12750a;
        f10908e = Integer.toString(0, 36);
    }

    public k1(r1.e1... e1VarArr) {
        db.c1 l10 = db.k0.l(e1VarArr);
        this.f10910b = l10;
        this.f10909a = e1VarArr.length;
        int i6 = 0;
        while (i6 < l10.A) {
            int i10 = i6 + 1;
            for (int i11 = i10; i11 < l10.A; i11++) {
                if (((r1.e1) l10.get(i6)).equals(l10.get(i11))) {
                    u1.a.h("TrackGroupArray", HttpUrl.FRAGMENT_ENCODE_SET, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i6 = i10;
        }
    }

    public final r1.e1 a(int i6) {
        return (r1.e1) this.f10910b.get(i6);
    }

    public final int b(r1.e1 e1Var) {
        int indexOf = this.f10910b.indexOf(e1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class == obj.getClass()) {
                k1 k1Var = (k1) obj;
                if (this.f10909a == k1Var.f10909a && this.f10910b.equals(k1Var.f10910b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f10911c == 0) {
            this.f10911c = this.f10910b.hashCode();
        }
        return this.f10911c;
    }

    public final String toString() {
        return this.f10910b.toString();
    }
}
