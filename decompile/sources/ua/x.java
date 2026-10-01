package ua;

import android.util.StateSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f13049a;

    /* renamed from: b, reason: collision with root package name */
    public m f13050b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f13051c;

    /* renamed from: d, reason: collision with root package name */
    public m[] f13052d;

    /* renamed from: e, reason: collision with root package name */
    public w f13053e;

    /* renamed from: f, reason: collision with root package name */
    public w f13054f;

    /* renamed from: g, reason: collision with root package name */
    public w f13055g;

    /* renamed from: h, reason: collision with root package name */
    public w f13056h;

    public x(m mVar) {
        b();
        a(StateSet.WILD_CARD, mVar);
    }

    public final void a(int[] iArr, m mVar) {
        int i6 = this.f13049a;
        if (i6 == 0 || iArr.length == 0) {
            this.f13050b = mVar;
        }
        int[][] iArr2 = this.f13051c;
        if (i6 >= iArr2.length) {
            int i10 = i6 + 10;
            int[][] iArr3 = new int[i10];
            System.arraycopy(iArr2, 0, iArr3, 0, i6);
            this.f13051c = iArr3;
            m[] mVarArr = new m[i10];
            System.arraycopy(this.f13052d, 0, mVarArr, 0, i6);
            this.f13052d = mVarArr;
        }
        int[][] iArr4 = this.f13051c;
        int i11 = this.f13049a;
        iArr4[i11] = iArr;
        this.f13052d[i11] = mVar;
        this.f13049a = i11 + 1;
    }

    public final void b() {
        this.f13050b = new m();
        this.f13051c = new int[10];
        this.f13052d = new m[10];
    }
}
