package lf;

import java.util.Arrays;
import kf.x0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {
    public b0 A;

    /* renamed from: x, reason: collision with root package name */
    public d[] f8359x;

    /* renamed from: y, reason: collision with root package name */
    public int f8360y;

    /* renamed from: z, reason: collision with root package name */
    public int f8361z;

    public final d a() {
        d dVar;
        b0 b0Var;
        synchronized (this) {
            try {
                d[] dVarArr = this.f8359x;
                if (dVarArr == null) {
                    dVarArr = c();
                    this.f8359x = dVarArr;
                } else if (this.f8360y >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
                    this.f8359x = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i6 = this.f8361z;
                do {
                    dVar = dVarArr[i6];
                    if (dVar == null) {
                        dVar = b();
                        dVarArr[i6] = dVar;
                    }
                    i6++;
                    if (i6 >= dVarArr.length) {
                        i6 = 0;
                    }
                } while (!dVar.a(this));
                this.f8361z = i6;
                this.f8360y++;
                b0Var = this.A;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b0Var != null) {
            b0Var.v(1);
        }
        return dVar;
    }

    public abstract d b();

    public abstract d[] c();

    public final void d(d dVar) {
        b0 b0Var;
        int i6;
        le.c[] b10;
        synchronized (this) {
            try {
                int i10 = this.f8360y - 1;
                this.f8360y = i10;
                b0Var = this.A;
                if (i10 == 0) {
                    this.f8361z = 0;
                }
                kotlin.jvm.internal.k.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b10 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (le.c cVar : b10) {
            if (cVar != null) {
                cVar.resumeWith(he.y.f6101a);
            }
        }
        if (b0Var != null) {
            b0Var.v(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [lf.b0, kf.x0] */
    public final b0 e() {
        b0 b0Var;
        synchronized (this) {
            b0 b0Var2 = this.A;
            b0Var = b0Var2;
            if (b0Var2 == null) {
                int i6 = this.f8360y;
                ?? x0Var = new x0(1, Integer.MAX_VALUE, jf.a.f7437y);
                x0Var.m(Integer.valueOf(i6));
                this.A = x0Var;
                b0Var = x0Var;
            }
        }
        return b0Var;
    }
}
