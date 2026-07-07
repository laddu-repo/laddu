package i7;

import b7.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6625a;

    /* renamed from: b, reason: collision with root package name */
    public final h7.e f6626b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.a f6627c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6628d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6629e;

    public a(String str, h7.e eVar, h7.a aVar, boolean z10, boolean z11) {
        this.f6625a = str;
        this.f6626b = eVar;
        this.f6627c = aVar;
        this.f6628d = z10;
        this.f6629e = z11;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        return new d7.g(yVar, aVar, this);
    }
}
