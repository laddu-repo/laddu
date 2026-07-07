package i7;

import b7.y;
import d7.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6688b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.a f6689c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6690d;

    public n(String str, int i6, h7.a aVar, boolean z10) {
        this.f6687a = str;
        this.f6688b = i6;
        this.f6689c = aVar;
        this.f6690d = z10;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        return new s(yVar, aVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f6687a + ", index=" + this.f6688b + '}';
    }
}
