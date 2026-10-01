package c3;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import mc.i;
import y2.b0;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1960a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f1961b;

    public a(int i6) {
        this.f1960a = i6;
        switch (i6) {
            case 1:
                this.f1961b = new b0("image/png", 35152, 2);
                return;
            default:
                this.f1961b = new b0("image/bmp", 16973, 2);
                return;
        }
    }

    @Override // y2.o
    public final void a() {
        int i6 = this.f1960a;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        switch (this.f1960a) {
            case 0:
                this.f1961b.c(j, j10);
                return;
            default:
                this.f1961b.c(j, j10);
                return;
        }
    }

    @Override // y2.o
    public final o d() {
        int i6 = this.f1960a;
        return this;
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        switch (this.f1960a) {
            case 0:
                return this.f1961b.f(pVar);
            default:
                return this.f1961b.f(pVar);
        }
    }

    @Override // y2.o
    public final List h() {
        switch (this.f1960a) {
            case 0:
            default:
                i0 i0Var = k0.f4008y;
                return c1.B;
        }
    }

    @Override // y2.o
    public final int i(p pVar, i iVar) {
        switch (this.f1960a) {
            case 0:
                return this.f1961b.i(pVar, iVar);
            default:
                return this.f1961b.i(pVar, iVar);
        }
    }

    @Override // y2.o
    public final void l(q qVar) {
        switch (this.f1960a) {
            case 0:
                this.f1961b.l(qVar);
                return;
            default:
                this.f1961b.l(qVar);
                return;
        }
    }

    private final void b() {
    }

    private final void e() {
    }
}
