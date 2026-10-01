package i7;

import b7.y;
import d7.t;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6691a;

    /* renamed from: b, reason: collision with root package name */
    public final h7.b f6692b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6693c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.a f6694d;

    /* renamed from: e, reason: collision with root package name */
    public final h7.a f6695e;

    /* renamed from: f, reason: collision with root package name */
    public final h7.b f6696f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6697g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6698h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6699i;
    public final boolean j;

    public o(String str, h7.b bVar, ArrayList arrayList, h7.a aVar, h7.a aVar2, h7.b bVar2, int i6, int i10, float f3, boolean z10) {
        this.f6691a = str;
        this.f6692b = bVar;
        this.f6693c = arrayList;
        this.f6694d = aVar;
        this.f6695e = aVar2;
        this.f6696f = bVar2;
        this.f6697g = i6;
        this.f6698h = i10;
        this.f6699i = f3;
        this.j = z10;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        return new t(yVar, aVar, this);
    }
}
