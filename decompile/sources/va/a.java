package va;

import a8.e;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13497a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f13498b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i6) {
        this.f13497a = i6;
        this.f13498b = sideSheetBehavior;
    }

    @Override // a8.e
    public final boolean B(View view, float f3) {
        switch (this.f13497a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f13498b;
                float abs = Math.abs((f3 * sideSheetBehavior.f2729k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                    return true;
                }
                return false;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f13498b;
                float abs2 = Math.abs((f3 * sideSheetBehavior2.f2729k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    @Override // a8.e
    public final void D(ViewGroup.MarginLayoutParams marginLayoutParams, int i6, int i10) {
        switch (this.f13497a) {
            case 0:
                if (i6 <= this.f13498b.f2731m) {
                    marginLayoutParams.leftMargin = i10;
                    return;
                }
                return;
            default:
                int i11 = this.f13498b.f2731m;
                if (i6 <= i11) {
                    marginLayoutParams.rightMargin = i11 - i6;
                    return;
                }
                return;
        }
    }

    @Override // a8.e
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f13497a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // a8.e
    public final float d(int i6) {
        switch (this.f13497a) {
            case 0:
                float m9 = m();
                return (i6 - m9) / (l() - m9);
            default:
                float f3 = this.f13498b.f2731m;
                return (f3 - i6) / (f3 - l());
        }
    }

    @Override // a8.e
    public final int l() {
        switch (this.f13497a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f13498b;
                return Math.max(0, sideSheetBehavior.f2732n + sideSheetBehavior.f2733o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f13498b;
                return Math.max(0, (sideSheetBehavior2.f2731m - sideSheetBehavior2.f2730l) - sideSheetBehavior2.f2733o);
        }
    }

    @Override // a8.e
    public final int m() {
        switch (this.f13497a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f13498b;
                return (-sideSheetBehavior.f2730l) - sideSheetBehavior.f2733o;
            default:
                return this.f13498b.f2731m;
        }
    }

    @Override // a8.e
    public final int n() {
        switch (this.f13497a) {
            case 0:
                return this.f13498b.f2733o;
            default:
                return this.f13498b.f2731m;
        }
    }

    @Override // a8.e
    public final int o() {
        switch (this.f13497a) {
            case 0:
                return -this.f13498b.f2730l;
            default:
                return l();
        }
    }

    @Override // a8.e
    public final int p(View view) {
        switch (this.f13497a) {
            case 0:
                return view.getRight() + this.f13498b.f2733o;
            default:
                return view.getLeft() - this.f13498b.f2733o;
        }
    }

    @Override // a8.e
    public final int q(CoordinatorLayout coordinatorLayout) {
        switch (this.f13497a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // a8.e
    public final int r() {
        switch (this.f13497a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // a8.e
    public final boolean s(float f3) {
        switch (this.f13497a) {
            case 0:
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return true;
                }
                return false;
            default:
                if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return true;
                }
                return false;
        }
    }

    @Override // a8.e
    public final boolean t(View view) {
        switch (this.f13497a) {
            case 0:
                if (view.getRight() < (l() - m()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (l() + this.f13498b.f2731m) / 2) {
                    return true;
                }
                return false;
        }
    }

    @Override // a8.e
    public final boolean u(float f3, float f10) {
        switch (this.f13497a) {
            case 0:
                if (Math.abs(f3) > Math.abs(f10) && Math.abs(f3) > UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) {
                    return true;
                }
                return false;
            default:
                if (Math.abs(f3) > Math.abs(f10) && Math.abs(f3) > UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) {
                    return true;
                }
                return false;
        }
    }
}
