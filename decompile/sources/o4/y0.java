package o4;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Runnable {
    public boolean A;
    public final /* synthetic */ RecyclerView B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public OverScroller f9905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Interpolator f9906y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9907z;

    public y0(RecyclerView recyclerView) {
        this.B = recyclerView;
        b1.d dVar = RecyclerView.f1371d1;
        this.f9906y = dVar;
        this.f9907z = false;
        this.A = false;
        this.f9905x = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i, int i10) {
        RecyclerView recyclerView = this.B;
        recyclerView.setScrollState(2);
        this.f9904w = 0;
        this.f9903v = 0;
        Interpolator interpolator = this.f9906y;
        b1.d dVar = RecyclerView.f1371d1;
        if (interpolator != dVar) {
            this.f9906y = dVar;
            this.f9905x = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f9905x.fling(0, 0, i, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f9907z) {
            this.A = true;
            return;
        }
        RecyclerView recyclerView = this.B;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = t0.m0.f11853a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i10, int i11, Interpolator interpolator) {
        RecyclerView recyclerView = this.B;
        if (i11 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i10);
            boolean z2 = iAbs > iAbs2;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                iAbs = iAbs2;
            }
            i11 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.f1371d1;
        }
        if (this.f9906y != interpolator) {
            this.f9906y = interpolator;
            this.f9905x = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f9904w = 0;
        this.f9903v = 0;
        recyclerView.setScrollState(2);
        this.f9905x.startScroll(0, 0, i, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.B;
        int[] iArr = recyclerView.N0;
        if (recyclerView.I == null) {
            recyclerView.removeCallbacks(this);
            this.f9905x.abortAnimation();
            return;
        }
        this.A = false;
        this.f9907z = true;
        recyclerView.p();
        OverScroller overScroller = this.f9905x;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.f9903v;
            int i14 = currY - this.f9904w;
            this.f9903v = currX;
            this.f9904w = currY;
            int iO = RecyclerView.o(i13, recyclerView.f1377f0, recyclerView.f1379h0, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i14, recyclerView.f1378g0, recyclerView.f1380i0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.N0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.H != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.f0(iO, iO2, iArr);
                int i15 = iArr[0];
                int i16 = iArr[1];
                int i17 = iO - i15;
                int i18 = iO2 - i16;
                u uVar = recyclerView.I.f9767e;
                if (uVar != null && !uVar.f9872d && uVar.f9873e) {
                    int iB = recyclerView.B0.b();
                    if (iB == 0) {
                        uVar.i();
                    } else if (uVar.f9869a >= iB) {
                        uVar.f9869a = iB - 1;
                        uVar.g(i15, i16);
                    } else {
                        uVar.g(i15, i16);
                    }
                }
                i = i17;
                i11 = i15;
                i10 = i18;
                i12 = i16;
            } else {
                i = iO;
                i10 = iO2;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.K.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.N0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i11, i12, i, i10, null, 1, iArr3);
            int i19 = i - iArr[0];
            int i20 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.w(i11, i12);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
            u uVar2 = recyclerView.I.f9767e;
            if ((uVar2 == null || !uVar2.f9872d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i21 = i19 < 0 ? -currVelocity : i19 > 0 ? currVelocity : 0;
                    if (i20 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i20 <= 0) {
                        currVelocity = 0;
                    }
                    if (i21 < 0) {
                        recyclerView.y();
                        if (recyclerView.f1377f0.isFinished()) {
                            recyclerView.f1377f0.onAbsorb(-i21);
                        }
                    } else if (i21 > 0) {
                        recyclerView.z();
                        if (recyclerView.f1379h0.isFinished()) {
                            recyclerView.f1379h0.onAbsorb(i21);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f1378g0.isFinished()) {
                            recyclerView.f1378g0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1380i0.isFinished()) {
                            recyclerView.f1380i0.onAbsorb(currVelocity);
                        }
                    }
                    if (i21 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1370b1) {
                    l lVar = recyclerView.A0;
                    int[] iArr4 = lVar.f9808a;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    lVar.f9811d = 0;
                }
            } else {
                b();
                n nVar = recyclerView.f1401z0;
                if (nVar != null) {
                    nVar.a(recyclerView, i11, i12);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                d0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        u uVar3 = recyclerView.I.f9767e;
        if (uVar3 != null && uVar3.f9872d) {
            uVar3.g(0, 0);
        }
        this.f9907z = false;
        if (!this.A) {
            recyclerView.setScrollState(0);
            recyclerView.n0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = t0.m0.f11853a;
            recyclerView.postOnAnimation(this);
        }
    }
}
