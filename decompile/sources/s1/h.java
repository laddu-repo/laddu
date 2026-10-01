package s1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h implements g {

    /* renamed from: b, reason: collision with root package name */
    public e f11987b;

    /* renamed from: c, reason: collision with root package name */
    public e f11988c;

    /* renamed from: d, reason: collision with root package name */
    public e f11989d;

    /* renamed from: e, reason: collision with root package name */
    public e f11990e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f11991f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f11992g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11993h;

    public h() {
        ByteBuffer byteBuffer = g.f11986a;
        this.f11991f = byteBuffer;
        this.f11992g = byteBuffer;
        e eVar = e.f11981e;
        this.f11989d = eVar;
        this.f11990e = eVar;
        this.f11987b = eVar;
        this.f11988c = eVar;
    }

    public abstract e a(e eVar);

    @Override // s1.g
    public boolean c() {
        if (this.f11993h && this.f11992g == g.f11986a) {
            return true;
        }
        return false;
    }

    @Override // s1.g
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f11992g;
        this.f11992g = g.f11986a;
        return byteBuffer;
    }

    @Override // s1.g
    public final e e(e eVar) {
        this.f11989d = eVar;
        this.f11990e = a(eVar);
        if (isActive()) {
            return this.f11990e;
        }
        return e.f11981e;
    }

    @Override // s1.g
    public final void flush() {
        this.f11992g = g.f11986a;
        this.f11993h = false;
        this.f11987b = this.f11989d;
        this.f11988c = this.f11990e;
        b();
    }

    @Override // s1.g
    public final void g() {
        this.f11993h = true;
        h();
    }

    @Override // s1.g
    public boolean isActive() {
        if (this.f11990e != e.f11981e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i6) {
        if (this.f11991f.capacity() < i6) {
            this.f11991f = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
        } else {
            this.f11991f.clear();
        }
        ByteBuffer byteBuffer = this.f11991f;
        this.f11992g = byteBuffer;
        return byteBuffer;
    }

    @Override // s1.g
    public final void reset() {
        ByteBuffer byteBuffer = g.f11986a;
        this.f11992g = byteBuffer;
        this.f11993h = false;
        this.f11991f = byteBuffer;
        e eVar = e.f11981e;
        this.f11989d = eVar;
        this.f11990e = eVar;
        this.f11987b = eVar;
        this.f11988c = eVar;
        i();
    }

    public void b() {
    }

    public void h() {
    }

    public void i() {
    }
}
