package y2;

import java.util.ArrayList;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14874c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14875d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14876e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14877f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14878g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14879h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14880i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14881k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14882l;

    public d(ArrayList arrayList, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f3, String str) {
        this.f14872a = arrayList;
        this.f14873b = i6;
        this.f14874c = i10;
        this.f14875d = i11;
        this.f14876e = i12;
        this.f14877f = i13;
        this.f14878g = i14;
        this.f14879h = i15;
        this.f14880i = i16;
        this.j = i17;
        this.f14881k = f3;
        this.f14882l = str;
    }

    public static d a(u1.t tVar) {
        String str;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f3;
        try {
            tVar.L(4);
            int y9 = (tVar.y() & 3) + 1;
            if (y9 != 3) {
                ArrayList arrayList = new ArrayList();
                int y10 = tVar.y() & 31;
                for (int i17 = 0; i17 < y10; i17++) {
                    int E = tVar.E();
                    int i18 = tVar.f12812b;
                    tVar.L(E);
                    byte[] bArr = tVar.f12811a;
                    byte[] bArr2 = new byte[E + 4];
                    System.arraycopy(u1.d.f12764a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i18, bArr2, 4, E);
                    arrayList.add(bArr2);
                }
                int y11 = tVar.y();
                for (int i19 = 0; i19 < y11; i19++) {
                    int E2 = tVar.E();
                    int i20 = tVar.f12812b;
                    tVar.L(E2);
                    byte[] bArr3 = tVar.f12811a;
                    byte[] bArr4 = new byte[E2 + 4];
                    System.arraycopy(u1.d.f12764a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i20, bArr4, 4, E2);
                    arrayList.add(bArr4);
                }
                if (y10 > 0) {
                    v1.n j = v1.o.j((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                    int i21 = j.f13234e;
                    int i22 = j.f13235f;
                    int i23 = j.f13237h + 8;
                    int i24 = j.f13238i + 8;
                    int i25 = j.f13244p;
                    int i26 = j.f13245q;
                    int i27 = j.f13246r;
                    int i28 = j.s;
                    float f10 = j.f13236g;
                    str = u1.d.a(j.f13230a, j.f13231b, j.f13232c);
                    i14 = i26;
                    i15 = i27;
                    i16 = i28;
                    f3 = f10;
                    i10 = i22;
                    i11 = i23;
                    i12 = i24;
                    i13 = i25;
                    i6 = i21;
                } else {
                    str = null;
                    i6 = -1;
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    i15 = -1;
                    i16 = 16;
                    f3 = 1.0f;
                }
                return new d(arrayList, y9, i6, i10, i11, i12, i13, i14, i15, i16, f3, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw l0.a(e10, "Error parsing AVC config");
        }
    }
}
