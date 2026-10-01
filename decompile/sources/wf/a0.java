package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends w0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14294l;

    public a0(String str, b0 b0Var) {
        super(str, b0Var, 1);
        this.f14294l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [he.f, java.lang.Object] */
    @Override // wf.w0
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                uf.g gVar = (uf.g) obj;
                if (this.f14411a.equals(gVar.a())) {
                    a0 a0Var = (a0) obj;
                    if (a0Var.f14294l && Arrays.equals((uf.g[]) this.j.getValue(), (uf.g[]) a0Var.j.getValue())) {
                        int e10 = gVar.e();
                        int i6 = this.f14413c;
                        if (i6 == e10) {
                            for (int i10 = 0; i10 < i6; i10++) {
                                if (kotlin.jvm.internal.k.a(h(i10).a(), gVar.h(i10).a()) && kotlin.jvm.internal.k.a(h(i10).getKind(), gVar.h(i10).getKind())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // wf.w0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // wf.w0, uf.g
    public final boolean isInline() {
        return this.f14294l;
    }
}
