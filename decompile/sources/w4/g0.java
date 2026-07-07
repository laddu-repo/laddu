package w4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 extends e1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(s0 s0Var, int i6) {
        super(s0Var);
        this.f13876d = i6;
    }

    @Override // e1.g
    public final int d(View view) {
        int right;
        int i6;
        switch (this.f13876d) {
            case 0:
                t0 t0Var = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                right = view.getRight() + ((t0) view.getLayoutParams()).f14021b.right;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var).rightMargin;
                break;
            default:
                t0 t0Var2 = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                right = view.getBottom() + ((t0) view.getLayoutParams()).f14021b.bottom;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var2).bottomMargin;
                break;
        }
        return right + i6;
    }

    @Override // e1.g
    public final int e(View view) {
        int A;
        int i6;
        switch (this.f13876d) {
            case 0:
                t0 t0Var = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                A = s0.A(view) + ((ViewGroup.MarginLayoutParams) t0Var).leftMargin;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var).rightMargin;
                break;
            default:
                t0 t0Var2 = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                A = s0.z(view) + ((ViewGroup.MarginLayoutParams) t0Var2).topMargin;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var2).bottomMargin;
                break;
        }
        return A + i6;
    }

    @Override // e1.g
    public final int f(View view) {
        int z10;
        int i6;
        switch (this.f13876d) {
            case 0:
                t0 t0Var = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                z10 = s0.z(view) + ((ViewGroup.MarginLayoutParams) t0Var).topMargin;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var).bottomMargin;
                break;
            default:
                t0 t0Var2 = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                z10 = s0.A(view) + ((ViewGroup.MarginLayoutParams) t0Var2).leftMargin;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var2).rightMargin;
                break;
        }
        return z10 + i6;
    }

    @Override // e1.g
    public final int g(View view) {
        int left;
        int i6;
        switch (this.f13876d) {
            case 0:
                t0 t0Var = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                left = view.getLeft() - ((t0) view.getLayoutParams()).f14021b.left;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var).leftMargin;
                break;
            default:
                t0 t0Var2 = (t0) view.getLayoutParams();
                ((s0) this.f4158b).getClass();
                left = view.getTop() - ((t0) view.getLayoutParams()).f14021b.top;
                i6 = ((ViewGroup.MarginLayoutParams) t0Var2).topMargin;
                break;
        }
        return left - i6;
    }

    @Override // e1.g
    public final int h() {
        switch (this.f13876d) {
            case 0:
                return ((s0) this.f4158b).f14016n;
            default:
                return ((s0) this.f4158b).f14017o;
        }
    }

    @Override // e1.g
    public final int i() {
        int i6;
        int F;
        switch (this.f13876d) {
            case 0:
                s0 s0Var = (s0) this.f4158b;
                i6 = s0Var.f14016n;
                F = s0Var.F();
                break;
            default:
                s0 s0Var2 = (s0) this.f4158b;
                i6 = s0Var2.f14017o;
                F = s0Var2.D();
                break;
        }
        return i6 - F;
    }

    @Override // e1.g
    public final int j() {
        switch (this.f13876d) {
            case 0:
                return ((s0) this.f4158b).F();
            default:
                return ((s0) this.f4158b).D();
        }
    }

    @Override // e1.g
    public final int k() {
        switch (this.f13876d) {
            case 0:
                return ((s0) this.f4158b).f14014l;
            default:
                return ((s0) this.f4158b).f14015m;
        }
    }

    @Override // e1.g
    public final int l() {
        switch (this.f13876d) {
            case 0:
                return ((s0) this.f4158b).f14015m;
            default:
                return ((s0) this.f4158b).f14014l;
        }
    }

    @Override // e1.g
    public final int m() {
        switch (this.f13876d) {
            case 0:
                return ((s0) this.f4158b).E();
            default:
                return ((s0) this.f4158b).G();
        }
    }

    @Override // e1.g
    public final int n() {
        int E;
        int F;
        switch (this.f13876d) {
            case 0:
                s0 s0Var = (s0) this.f4158b;
                E = s0Var.f14016n - s0Var.E();
                F = s0Var.F();
                break;
            default:
                s0 s0Var2 = (s0) this.f4158b;
                E = s0Var2.f14017o - s0Var2.G();
                F = s0Var2.D();
                break;
        }
        return E - F;
    }

    @Override // e1.g
    public final int o(View view) {
        switch (this.f13876d) {
            case 0:
                s0 s0Var = (s0) this.f4158b;
                Rect rect = (Rect) this.f4159c;
                s0Var.K(rect, view);
                return rect.right;
            default:
                s0 s0Var2 = (s0) this.f4158b;
                Rect rect2 = (Rect) this.f4159c;
                s0Var2.K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // e1.g
    public final int p(View view) {
        switch (this.f13876d) {
            case 0:
                s0 s0Var = (s0) this.f4158b;
                Rect rect = (Rect) this.f4159c;
                s0Var.K(rect, view);
                return rect.left;
            default:
                s0 s0Var2 = (s0) this.f4158b;
                Rect rect2 = (Rect) this.f4159c;
                s0Var2.K(rect2, view);
                return rect2.top;
        }
    }

    @Override // e1.g
    public final void q(int i6) {
        switch (this.f13876d) {
            case 0:
                ((s0) this.f4158b).O(i6);
                return;
            default:
                ((s0) this.f4158b).P(i6);
                return;
        }
    }
}
