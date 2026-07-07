package d0;

import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3500a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3501a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3502b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3503b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3504c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3505c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3506d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3507d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3508e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3509e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3510f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3511f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3512g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3513g0;

    /* renamed from: h, reason: collision with root package name */
    public int f3514h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3515h0;

    /* renamed from: i, reason: collision with root package name */
    public int f3516i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3517i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3518j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3519k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3520k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3521l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3522l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3523m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3524m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3525n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3526n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3527o;
    public float o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3528p;

    /* renamed from: p0, reason: collision with root package name */
    public a0.d f3529p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3530q;

    /* renamed from: r, reason: collision with root package name */
    public float f3531r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f3532t;

    /* renamed from: u, reason: collision with root package name */
    public int f3533u;

    /* renamed from: v, reason: collision with root package name */
    public int f3534v;

    /* renamed from: w, reason: collision with root package name */
    public int f3535w;

    /* renamed from: x, reason: collision with root package name */
    public int f3536x;

    /* renamed from: y, reason: collision with root package name */
    public int f3537y;

    /* renamed from: z, reason: collision with root package name */
    public int f3538z;

    public final void a() {
        this.f3507d0 = false;
        this.f3501a0 = true;
        this.f3503b0 = true;
        int i6 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i6 == -2 && this.W) {
            this.f3501a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.X) {
            this.f3503b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i6 == 0 || i6 == -1) {
            this.f3501a0 = false;
            if (i6 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f3503b0 = false;
            if (i10 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f3504c == -1.0f && this.f3500a == -1 && this.f3502b == -1) {
            return;
        }
        this.f3507d0 = true;
        this.f3501a0 = true;
        this.f3503b0 = true;
        if (!(this.f3529p0 instanceof a0.h)) {
            this.f3529p0 = new a0.h();
        }
        ((a0.h) this.f3529p0).S(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.e.resolveLayoutDirection(int):void");
    }
}
