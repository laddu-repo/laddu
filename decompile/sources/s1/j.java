package s1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    public int f12015b;

    /* renamed from: c, reason: collision with root package name */
    public float f12016c;

    /* renamed from: d, reason: collision with root package name */
    public float f12017d;

    /* renamed from: e, reason: collision with root package name */
    public e f12018e;

    /* renamed from: f, reason: collision with root package name */
    public e f12019f;

    /* renamed from: g, reason: collision with root package name */
    public e f12020g;

    /* renamed from: h, reason: collision with root package name */
    public e f12021h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12022i;
    public i j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f12023k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f12024l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f12025m;

    /* renamed from: n, reason: collision with root package name */
    public long f12026n;

    /* renamed from: o, reason: collision with root package name */
    public long f12027o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12028p;

    @Override // s1.g
    public final boolean c() {
        boolean z10;
        if (this.f12028p) {
            i iVar = this.j;
            if (iVar != null) {
                if (iVar.f12005m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.g(z10);
                if (iVar.f12005m * iVar.f11995b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // s1.g
    public final ByteBuffer d() {
        boolean z10;
        i iVar = this.j;
        if (iVar != null) {
            int i6 = iVar.f11995b;
            boolean z11 = true;
            if (iVar.f12005m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            int i10 = iVar.f12005m * i6 * 2;
            if (i10 > 0) {
                if (this.f12023k.capacity() < i10) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                    this.f12023k = order;
                    this.f12024l = order.asShortBuffer();
                } else {
                    this.f12023k.clear();
                    this.f12024l.clear();
                }
                ShortBuffer shortBuffer = this.f12024l;
                if (iVar.f12005m < 0) {
                    z11 = false;
                }
                u1.c.g(z11);
                int min = Math.min(shortBuffer.remaining() / i6, iVar.f12005m);
                int i11 = min * i6;
                shortBuffer.put(iVar.f12004l, 0, i11);
                int i12 = iVar.f12005m - min;
                iVar.f12005m = i12;
                short[] sArr = iVar.f12004l;
                System.arraycopy(sArr, i11, sArr, 0, i12 * i6);
                this.f12027o += i10;
                this.f12023k.limit(i10);
                this.f12025m = this.f12023k;
            }
        }
        ByteBuffer byteBuffer = this.f12025m;
        this.f12025m = g.f11986a;
        return byteBuffer;
    }

    @Override // s1.g
    public final e e(e eVar) {
        if (eVar.f11984c == 2) {
            int i6 = this.f12015b;
            if (i6 == -1) {
                i6 = eVar.f11982a;
            }
            this.f12018e = eVar;
            e eVar2 = new e(i6, eVar.f11983b, 2);
            this.f12019f = eVar2;
            this.f12022i = true;
            return eVar2;
        }
        throw new f(eVar);
    }

    @Override // s1.g
    public final void f(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        i iVar = this.j;
        iVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f12026n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i6 = iVar.f11995b;
        int i10 = remaining2 / i6;
        short[] c10 = iVar.c(iVar.j, iVar.f12003k, i10);
        iVar.j = c10;
        asShortBuffer.get(c10, iVar.f12003k * i6, ((i10 * i6) * 2) / 2);
        iVar.f12003k += i10;
        iVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // s1.g
    public final void flush() {
        if (isActive()) {
            e eVar = this.f12018e;
            this.f12020g = eVar;
            e eVar2 = this.f12019f;
            this.f12021h = eVar2;
            if (this.f12022i) {
                this.j = new i(eVar.f11982a, eVar.f11983b, this.f12016c, this.f12017d, eVar2.f11982a);
            } else {
                i iVar = this.j;
                if (iVar != null) {
                    iVar.f12003k = 0;
                    iVar.f12005m = 0;
                    iVar.f12007o = 0;
                    iVar.f12008p = 0;
                    iVar.f12009q = 0;
                    iVar.f12010r = 0;
                    iVar.s = 0;
                    iVar.f12011t = 0;
                    iVar.f12012u = 0;
                    iVar.f12013v = 0;
                    iVar.f12014w = 0.0d;
                }
            }
        }
        this.f12025m = g.f11986a;
        this.f12026n = 0L;
        this.f12027o = 0L;
        this.f12028p = false;
    }

    @Override // s1.g
    public final void g() {
        i iVar = this.j;
        if (iVar != null) {
            int i6 = iVar.f12003k;
            float f3 = iVar.f11996c;
            float f10 = iVar.f11997d;
            double d10 = f3 / f10;
            int i10 = iVar.f12005m + ((int) (((((((i6 - r6) / d10) + iVar.f12010r) + iVar.f12014w) + iVar.f12007o) / (iVar.f11998e * f10)) + 0.5d));
            iVar.f12014w = 0.0d;
            short[] sArr = iVar.j;
            int i11 = iVar.f12001h * 2;
            iVar.j = iVar.c(sArr, i6, i11 + i6);
            int i12 = 0;
            while (true) {
                int i13 = iVar.f11995b;
                if (i12 >= i11 * i13) {
                    break;
                }
                iVar.j[(i13 * i6) + i12] = 0;
                i12++;
            }
            iVar.f12003k = i11 + iVar.f12003k;
            iVar.f();
            if (iVar.f12005m > i10) {
                iVar.f12005m = Math.max(i10, 0);
            }
            iVar.f12003k = 0;
            iVar.f12010r = 0;
            iVar.f12007o = 0;
        }
        this.f12028p = true;
    }

    @Override // s1.g
    public final boolean isActive() {
        if (this.f12019f.f11982a != -1) {
            if (Math.abs(this.f12016c - 1.0f) >= 1.0E-4f || Math.abs(this.f12017d - 1.0f) >= 1.0E-4f || this.f12019f.f11982a != this.f12018e.f11982a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // s1.g
    public final void reset() {
        this.f12016c = 1.0f;
        this.f12017d = 1.0f;
        e eVar = e.f11981e;
        this.f12018e = eVar;
        this.f12019f = eVar;
        this.f12020g = eVar;
        this.f12021h = eVar;
        ByteBuffer byteBuffer = g.f11986a;
        this.f12023k = byteBuffer;
        this.f12024l = byteBuffer.asShortBuffer();
        this.f12025m = byteBuffer;
        this.f12015b = -1;
        this.f12022i = false;
        this.j = null;
        this.f12026n = 0L;
        this.f12027o = 0L;
        this.f12028p = false;
    }
}
