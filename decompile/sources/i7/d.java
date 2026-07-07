package i7;

import android.graphics.Path;
import b7.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6632a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f6633b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.a f6634c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.a f6635d;

    /* renamed from: e, reason: collision with root package name */
    public final h7.a f6636e;

    /* renamed from: f, reason: collision with root package name */
    public final h7.a f6637f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6638g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6639h;

    public d(String str, int i6, Path.FillType fillType, h7.a aVar, h7.a aVar2, h7.a aVar3, h7.a aVar4, boolean z10) {
        this.f6632a = i6;
        this.f6633b = fillType;
        this.f6634c = aVar;
        this.f6635d = aVar2;
        this.f6636e = aVar3;
        this.f6637f = aVar4;
        this.f6638g = str;
        this.f6639h = z10;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        return new d7.i(yVar, jVar, aVar, this);
    }
}
