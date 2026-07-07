package jd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f7405a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7406b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7407c;

    public s(String str, int i6, int i10) {
        this.f7405a = i6;
        this.f7406b = i10;
        this.f7407c = str;
    }

    public s(String str, int i6, int i10, int i11, long j) {
        this.f7407c = str;
        this.f7406b = i6;
        this.f7405a = i10;
    }

    public s(String str) {
        this.f7407c = str;
        this.f7405a = a.a.h(str.charAt(3));
        this.f7406b = str.length() - 7;
    }
}
