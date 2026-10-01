package w3;

import a2.a2;
import j2.u;
import java.util.ArrayDeque;
import u1.a0;
import v3.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i implements v3.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f13792a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13793b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f13794c;

    /* renamed from: d, reason: collision with root package name */
    public g f13795d;

    /* renamed from: e, reason: collision with root package name */
    public long f13796e;

    /* renamed from: f, reason: collision with root package name */
    public long f13797f;

    /* renamed from: g, reason: collision with root package name */
    public long f13798g;

    /* JADX WARN: Type inference failed for: r2v1, types: [w3.h, java.lang.Object] */
    public i() {
        for (int i6 = 0; i6 < 10; i6++) {
            this.f13792a.add(new v3.i());
        }
        this.f13793b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f13793b;
            u uVar = new u(this, 16);
            ?? obj = new Object();
            obj.f13791z = uVar;
            arrayDeque.add(obj);
        }
        this.f13794c = new ArrayDeque();
        this.f13798g = -9223372036854775807L;
    }

    @Override // y1.e
    public final void b(long j) {
        this.f13798g = j;
    }

    @Override // v3.e
    public final void c(long j) {
        this.f13796e = j;
    }

    @Override // y1.e
    public final Object e() {
        boolean z10;
        if (this.f13795d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        ArrayDeque arrayDeque = this.f13792a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f13795d = gVar;
        return gVar;
    }

    @Override // y1.e
    public final void f(Object obj) {
        boolean z10;
        v3.i iVar = (v3.i) obj;
        if (iVar == this.f13795d) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        g gVar = (g) iVar;
        if (!gVar.isEndOfStream()) {
            long j = gVar.B;
            if (j != Long.MIN_VALUE) {
                long j10 = this.f13798g;
                if (j10 != -9223372036854775807L && j < j10) {
                    gVar.clear();
                    this.f13792a.add(gVar);
                    this.f13795d = null;
                }
            }
        }
        long j11 = this.f13797f;
        this.f13797f = 1 + j11;
        gVar.G = j11;
        this.f13794c.add(gVar);
        this.f13795d = null;
    }

    @Override // y1.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f13797f = 0L;
        this.f13796e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f13794c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f13792a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            String str = a0.f12750a;
            gVar.clear();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f13795d;
        if (gVar2 != null) {
            gVar2.clear();
            arrayDeque.add(gVar2);
            this.f13795d = null;
        }
    }

    public abstract a2 g();

    public abstract void h(g gVar);

    @Override // y1.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public j d() {
        ArrayDeque arrayDeque = this.f13793b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f13794c;
            if (!arrayDeque2.isEmpty()) {
                g gVar = (g) arrayDeque2.peek();
                String str = a0.f12750a;
                if (gVar.B <= this.f13796e) {
                    g gVar2 = (g) arrayDeque2.poll();
                    boolean isEndOfStream = gVar2.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f13792a;
                    if (isEndOfStream) {
                        j jVar = (j) arrayDeque.pollFirst();
                        jVar.addFlag(4);
                        gVar2.clear();
                        arrayDeque3.add(gVar2);
                        return jVar;
                    }
                    h(gVar2);
                    if (j()) {
                        a2 g10 = g();
                        j jVar2 = (j) arrayDeque.pollFirst();
                        long j = gVar2.B;
                        jVar2.timeUs = j;
                        jVar2.f13280x = g10;
                        jVar2.f13281y = j;
                        gVar2.clear();
                        arrayDeque3.add(gVar2);
                        return jVar2;
                    }
                    gVar2.clear();
                    arrayDeque3.add(gVar2);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public abstract boolean j();

    @Override // y1.e
    public void a() {
    }
}
