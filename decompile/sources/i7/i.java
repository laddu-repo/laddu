package i7;

import b7.y;
import d7.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6668a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f6669b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.b f6670c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6671d;

    /* renamed from: e, reason: collision with root package name */
    public final h7.e f6672e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6673f;

    public i(String str, h7.b bVar, h7.b bVar2, h7.d dVar, boolean z10) {
        this.f6669b = str;
        this.f6670c = bVar;
        this.f6672e = bVar2;
        this.f6673f = dVar;
        this.f6671d = z10;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        switch (this.f6668a) {
            case 0:
                return new d7.p(yVar, aVar, this);
            default:
                return new q(yVar, aVar, this);
        }
    }

    public String toString() {
        switch (this.f6668a) {
            case 0:
                return "RectangleShape{position=" + this.f6672e + ", size=" + ((h7.e) this.f6673f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, h7.e eVar, h7.a aVar, h7.b bVar, boolean z10) {
        this.f6669b = str;
        this.f6672e = eVar;
        this.f6673f = aVar;
        this.f6670c = bVar;
        this.f6671d = z10;
    }
}
