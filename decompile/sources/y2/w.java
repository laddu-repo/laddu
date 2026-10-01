package y2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final j2.y f14960a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.y f14961b;

    /* renamed from: c, reason: collision with root package name */
    public long f14962c;

    public w(long j, long[] jArr, long[] jArr2) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i6 = length + 1;
            j2.y yVar = new j2.y(i6);
            this.f14960a = yVar;
            j2.y yVar2 = new j2.y(i6);
            this.f14961b = yVar2;
            yVar.e(0L);
            yVar2.e(0L);
        } else {
            this.f14960a = new j2.y(length);
            this.f14961b = new j2.y(length);
        }
        this.f14960a.f(jArr);
        this.f14961b.f(jArr2);
        this.f14962c = j;
    }

    @Override // y2.z
    public final boolean g() {
        if (this.f14961b.f7144y > 0) {
            return true;
        }
        return false;
    }

    @Override // y2.z
    public final y j(long j) {
        j2.y yVar = this.f14961b;
        if (yVar.f7144y == 0) {
            a0 a0Var = a0.f14849c;
            return new y(a0Var, a0Var);
        }
        int b10 = u1.a0.b(yVar, j);
        long k8 = yVar.k(b10);
        j2.y yVar2 = this.f14960a;
        a0 a0Var2 = new a0(k8, yVar2.k(b10));
        if (k8 != j && b10 != yVar.f7144y - 1) {
            int i6 = b10 + 1;
            return new y(a0Var2, new a0(yVar.k(i6), yVar2.k(i6)));
        }
        return new y(a0Var2, a0Var2);
    }

    @Override // y2.z
    public final long m() {
        return this.f14962c;
    }
}
