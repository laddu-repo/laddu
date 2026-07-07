package i7;

import b7.y;
import d7.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6700a;

    /* renamed from: b, reason: collision with root package name */
    public final h7.b f6701b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.b f6702c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.b f6703d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6704e;

    public p(String str, int i6, h7.b bVar, h7.b bVar2, h7.b bVar3, boolean z10) {
        this.f6700a = i6;
        this.f6701b = bVar;
        this.f6702c = bVar2;
        this.f6703d = bVar3;
        this.f6704e = z10;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        return new u(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f6701b + ", end: " + this.f6702c + ", offset: " + this.f6703d + "}";
    }
}
