package f4;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4812b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4813c;

    /* renamed from: d, reason: collision with root package name */
    public int f4814d;

    /* renamed from: e, reason: collision with root package name */
    public String f4815e;

    public h0(int i6, int i10) {
        this(Integer.MIN_VALUE, i6, i10);
    }

    public final void a() {
        int i6;
        int i10 = this.f4814d;
        if (i10 == Integer.MIN_VALUE) {
            i6 = this.f4812b;
        } else {
            i6 = i10 + this.f4813c;
        }
        this.f4814d = i6;
        this.f4815e = this.f4811a + this.f4814d;
    }

    public final void b() {
        if (this.f4814d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public h0(int i6, int i10, int i11) {
        String str;
        if (i6 != Integer.MIN_VALUE) {
            str = i6 + "/";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        this.f4811a = str;
        this.f4812b = i10;
        this.f4813c = i11;
        this.f4814d = Integer.MIN_VALUE;
        this.f4815e = HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
