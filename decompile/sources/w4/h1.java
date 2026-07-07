package w4;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 implements Runnable {
    public Interpolator A;
    public boolean B;
    public boolean C;
    public final /* synthetic */ RecyclerView D;

    /* renamed from: x, reason: collision with root package name */
    public int f13883x;

    /* renamed from: y, reason: collision with root package name */
    public int f13884y;

    /* renamed from: z, reason: collision with root package name */
    public OverScroller f13885z;

    public h1(RecyclerView recyclerView) {
        this.D = recyclerView;
        a1.d dVar = RecyclerView.c1;
        this.A = dVar;
        this.B = false;
        this.C = false;
        this.f13885z = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i6, int i10) {
        RecyclerView recyclerView = this.D;
        recyclerView.setScrollState(2);
        this.f13884y = 0;
        this.f13883x = 0;
        Interpolator interpolator = this.A;
        a1.d dVar = RecyclerView.c1;
        if (interpolator != dVar) {
            this.A = dVar;
            this.f13885z = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f13885z.fling(0, 0, i6, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.B) {
            this.C = true;
            return;
        }
        RecyclerView recyclerView = this.D;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = t0.q0.f12397a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i6, int i10, int i11, Interpolator interpolator) {
        boolean z10;
        int height;
        RecyclerView recyclerView = this.D;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i6);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z10) {
                abs = abs2;
            }
            i11 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.c1;
        }
        if (this.A != interpolator) {
            this.A = interpolator;
            this.f13885z = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f13884y = 0;
        this.f13883x = 0;
        recyclerView.setScrollState(2);
        this.f13885z.startScroll(0, 0, i6, i10, i12);
        if (Build.VERSION.SDK_INT < 23) {
            this.f13885z.computeScrollOffset();
        }
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        RecyclerView recyclerView = this.D;
        int[] iArr = recyclerView.P0;
        if (recyclerView.K == null) {
            recyclerView.removeCallbacks(this);
            this.f13885z.abortAnimation();
            return;
        }
        this.C = false;
        this.B = true;
        recyclerView.n();
        OverScroller overScroller = this.f13885z;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f13883x;
            int i15 = currY - this.f13884y;
            this.f13883x = currX;
            this.f13884y = currY;
            int m9 = RecyclerView.m(i14, recyclerView.f1129h0, recyclerView.f1131j0, recyclerView.getWidth());
            int m10 = RecyclerView.m(i15, recyclerView.f1130i0, recyclerView.f1132k0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.P0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.s(m9, m10, 1, iArr2, null)) {
                m9 -= iArr[0];
                m10 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(m9, m10);
            }
            if (recyclerView.J != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.e0(m9, m10, iArr);
                int i16 = iArr[0];
                int i17 = iArr[1];
                int i18 = m9 - i16;
                int i19 = m10 - i17;
                c0 c0Var = recyclerView.K.f14008e;
                if (c0Var != null && !c0Var.f13826d && c0Var.f13827e) {
                    int b10 = recyclerView.D0.b();
                    if (b10 == 0) {
                        c0Var.i();
                    } else if (c0Var.f13823a >= b10) {
                        c0Var.f13823a = b10 - 1;
                        c0Var.g(i16, i17);
                    } else {
                        c0Var.g(i16, i17);
                    }
                }
                i6 = i18;
                i11 = i16;
                i10 = i19;
                i12 = i17;
            } else {
                i6 = m9;
                i10 = m10;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.M.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.P0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.t(i11, i12, i6, i10, null, 1, iArr3);
            int i20 = i6 - iArr[0];
            int i21 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.u(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!overScroller.isFinished() && ((!z10 && i20 == 0) || (!z11 && i21 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            c0 c0Var2 = recyclerView.K.f14008e;
            if ((c0Var2 == null || !c0Var2.f13826d) && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i20 < 0) {
                        i13 = -currVelocity;
                    } else if (i20 > 0) {
                        i13 = currVelocity;
                    } else {
                        i13 = 0;
                    }
                    if (i21 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i21 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.w();
                        if (recyclerView.f1129h0.isFinished()) {
                            recyclerView.f1129h0.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.x();
                        if (recyclerView.f1131j0.isFinished()) {
                            recyclerView.f1131j0.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.y();
                        if (recyclerView.f1130i0.isFinished()) {
                            recyclerView.f1130i0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.v();
                        if (recyclerView.f1132k0.isFinished()) {
                            recyclerView.f1132k0.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = t0.q0.f12397a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1119a1) {
                    v.h hVar = recyclerView.C0;
                    int[] iArr4 = hVar.f13158c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    hVar.f13159d = 0;
                }
            } else {
                b();
                w wVar = recyclerView.B0;
                if (wVar != null) {
                    wVar.a(recyclerView, i11, i12);
                }
            }
        }
        c0 c0Var3 = recyclerView.K.f14008e;
        if (c0Var3 != null && c0Var3.f13826d) {
            c0Var3.g(0, 0);
        }
        this.B = false;
        if (this.C) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = t0.q0.f12397a;
            recyclerView.postOnAnimation(this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.k0(1);
        }
    }
}
