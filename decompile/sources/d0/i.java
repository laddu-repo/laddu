package d0;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3555a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3556b;

    /* renamed from: c, reason: collision with root package name */
    public int f3557c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3558d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3559e;

    /* renamed from: f, reason: collision with root package name */
    public int f3560f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3561g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f3562h;

    /* renamed from: i, reason: collision with root package name */
    public int f3563i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3564k;

    /* renamed from: l, reason: collision with root package name */
    public int f3565l;

    public final void a(int i6, float f3) {
        int i10 = this.f3560f;
        int[] iArr = this.f3558d;
        if (i10 >= iArr.length) {
            this.f3558d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3559e;
            this.f3559e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f3558d;
        int i11 = this.f3560f;
        iArr2[i11] = i6;
        float[] fArr2 = this.f3559e;
        this.f3560f = i11 + 1;
        fArr2[i11] = f3;
    }

    public final void b(int i6, int i10) {
        int i11 = this.f3557c;
        int[] iArr = this.f3555a;
        if (i11 >= iArr.length) {
            this.f3555a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3556b;
            this.f3556b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3555a;
        int i12 = this.f3557c;
        iArr3[i12] = i6;
        int[] iArr4 = this.f3556b;
        this.f3557c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i6, String str) {
        int i10 = this.f3563i;
        int[] iArr = this.f3561g;
        if (i10 >= iArr.length) {
            this.f3561g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f3562h;
            this.f3562h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3561g;
        int i11 = this.f3563i;
        iArr2[i11] = i6;
        String[] strArr2 = this.f3562h;
        this.f3563i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i6, boolean z10) {
        int i10 = this.f3565l;
        int[] iArr = this.j;
        if (i10 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3564k;
            this.f3564k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i11 = this.f3565l;
        iArr2[i11] = i6;
        boolean[] zArr2 = this.f3564k;
        this.f3565l = i11 + 1;
        zArr2[i11] = z10;
    }
}
