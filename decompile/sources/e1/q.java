package e1;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f4174a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f4175b;

    /* renamed from: c, reason: collision with root package name */
    public t f4176c;

    /* renamed from: d, reason: collision with root package name */
    public t f4177d;

    /* renamed from: e, reason: collision with root package name */
    public int f4178e;

    /* renamed from: f, reason: collision with root package name */
    public int f4179f;

    public q(t tVar) {
        this.f4175b = tVar;
        this.f4176c = tVar;
    }

    public final void a() {
        this.f4174a = 1;
        this.f4176c = this.f4175b;
        this.f4179f = 0;
    }

    public final boolean b() {
        f1.a b10 = this.f4176c.f4190b.b();
        int a10 = b10.a(6);
        if ((a10 != 0 && ((ByteBuffer) b10.A).get(a10 + b10.f4630x) != 0) || this.f4178e == 65039) {
            return true;
        }
        return false;
    }
}
