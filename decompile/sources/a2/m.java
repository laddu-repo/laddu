package a2;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements b1 {
    public final Object A;
    public Object B;
    public Object C;

    /* renamed from: x, reason: collision with root package name */
    public boolean f314x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f315y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f316z;

    public m(w0 w0Var, u1.v vVar) {
        this.A = w0Var;
        this.f316z = new d2(vVar);
        this.f314x = true;
    }

    public void a(g gVar) {
        b1 b1Var;
        b1 i6 = gVar.i();
        if (i6 != null && i6 != (b1Var = (b1) this.C)) {
            if (b1Var == null) {
                this.C = i6;
                this.B = gVar;
                i6.e((r1.o0) ((d2) this.f316z).B);
                return;
            }
            throw new q(2, new IllegalStateException("Multiple renderer media clocks enabled."), UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        }
    }

    @Override // a2.b1
    public r1.o0 d() {
        b1 b1Var = (b1) this.C;
        if (b1Var != null) {
            return b1Var.d();
        }
        return (r1.o0) ((d2) this.f316z).B;
    }

    @Override // a2.b1
    public void e(r1.o0 o0Var) {
        b1 b1Var = (b1) this.C;
        if (b1Var != null) {
            b1Var.e(o0Var);
            o0Var = ((b1) this.C).d();
        }
        ((d2) this.f316z).e(o0Var);
    }

    @Override // a2.b1
    public long f() {
        if (this.f314x) {
            return ((d2) this.f316z).f();
        }
        b1 b1Var = (b1) this.C;
        b1Var.getClass();
        return b1Var.f();
    }

    @Override // a2.b1
    public boolean g() {
        if (this.f314x) {
            ((d2) this.f316z).getClass();
            return false;
        }
        b1 b1Var = (b1) this.C;
        b1Var.getClass();
        return b1Var.g();
    }

    public m(Context context, w2.w wVar) {
        this.f316z = context.getApplicationContext();
        this.A = wVar;
        this.C = u1.v.f12817a;
    }
}
