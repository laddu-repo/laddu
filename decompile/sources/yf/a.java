package yf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements CharSequence {

    /* renamed from: x, reason: collision with root package name */
    public final char[] f15058x;

    /* renamed from: y, reason: collision with root package name */
    public int f15059y;

    public a(char[] cArr) {
        this.f15058x = cArr;
        this.f15059y = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f15058x[i6];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f15059y;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i10) {
        return df.u.y(this.f15058x, i6, Math.min(i10, this.f15059y));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i6 = this.f15059y;
        return df.u.y(this.f15058x, 0, Math.min(i6, i6));
    }
}
