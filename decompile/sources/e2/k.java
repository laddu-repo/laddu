package e2;

import db.k0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends m implements d2.h {
    public final n E;

    public k(r1.q qVar, k0 k0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(qVar, k0Var, nVar, arrayList, list, list2);
        this.E = nVar;
    }

    @Override // d2.h
    public final long B() {
        return this.E.f4260d;
    }

    @Override // d2.h
    public final long E(long j) {
        return this.E.d(j);
    }

    @Override // d2.h
    public final long F(long j, long j10) {
        return this.E.b(j, j10);
    }

    @Override // e2.m
    public final String a() {
        return null;
    }

    @Override // d2.h
    public final long b(long j) {
        return this.E.g(j);
    }

    @Override // d2.h
    public final long c(long j, long j10) {
        return this.E.e(j, j10);
    }

    @Override // e2.m
    public final j e() {
        return null;
    }

    @Override // d2.h
    public final long f(long j, long j10) {
        return this.E.c(j, j10);
    }

    @Override // d2.h
    public final long g(long j, long j10) {
        n nVar = this.E;
        if (nVar.f4262f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j, j10) + nVar.c(j, j10);
        return (nVar.e(b10, j) + nVar.g(b10)) - nVar.f4265i;
    }

    @Override // d2.h
    public final j h(long j) {
        return this.E.h(this, j);
    }

    @Override // d2.h
    public final long s(long j, long j10) {
        return this.E.f(j, j10);
    }

    @Override // d2.h
    public final boolean x() {
        return this.E.i();
    }

    @Override // e2.m
    public final d2.h d() {
        return this;
    }
}
