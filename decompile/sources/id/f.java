package id;

import androidx.lifecycle.f0;
import androidx.lifecycle.l;
import androidx.lifecycle.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements l {
    public final /* synthetic */ String A;
    public final /* synthetic */ fd.j B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f6824x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f6825y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h f6826z;

    public f(s sVar, y yVar, h hVar, String str, fd.j jVar) {
        this.f6824x = sVar;
        this.f6825y = yVar;
        this.f6826z = hVar;
        this.A = str;
        this.B = jVar;
    }

    @Override // androidx.lifecycle.l
    public final void S(f0 owner) {
        k.e(owner, "owner");
    }

    @Override // androidx.lifecycle.l
    public final void d(f0 owner) {
        k.e(owner, "owner");
        s sVar = this.f6824x;
        if (sVar.f8051x) {
            sVar.f8051x = false;
            this.f6825y.c(this);
            this.f6826z.e(0, this.A);
            this.B.invoke();
        }
    }

    @Override // androidx.lifecycle.l
    public final /* bridge */ void f(f0 f0Var) {
        r4.a.b(f0Var);
    }

    @Override // androidx.lifecycle.l
    public final void l(f0 f0Var) {
        this.f6824x.f8051x = true;
    }

    @Override // androidx.lifecycle.l
    public final /* bridge */ void K(f0 f0Var) {
    }

    @Override // androidx.lifecycle.l
    public final /* bridge */ void y(f0 f0Var) {
    }
}
