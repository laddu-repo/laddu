package i7;

import android.graphics.Path;
import b7.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6678a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f6679b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6680c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.a f6681d;

    /* renamed from: e, reason: collision with root package name */
    public final h7.a f6682e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6683f;

    public l(String str, boolean z10, Path.FillType fillType, h7.a aVar, h7.a aVar2, boolean z11) {
        this.f6680c = str;
        this.f6678a = z10;
        this.f6679b = fillType;
        this.f6681d = aVar;
        this.f6682e = aVar2;
        this.f6683f = z11;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        return new d7.h(yVar, aVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f6678a + '}';
    }
}
