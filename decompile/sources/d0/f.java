package d0;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3539a;

    /* renamed from: b, reason: collision with root package name */
    public int f3540b;

    /* renamed from: c, reason: collision with root package name */
    public int f3541c;

    /* renamed from: d, reason: collision with root package name */
    public int f3542d;

    /* renamed from: e, reason: collision with root package name */
    public int f3543e;

    /* renamed from: f, reason: collision with root package name */
    public int f3544f;

    /* renamed from: g, reason: collision with root package name */
    public int f3545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f3546h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f3546h = constraintLayout;
        this.f3539a = constraintLayout2;
    }

    public static boolean a(int i6, int i10, int i11) {
        if (i6 != i10) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i11 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void b(a0.d dVar, b0.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i6;
        int i10;
        int i11;
        int measuredWidth;
        int baseline;
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i13;
        boolean z21;
        boolean z22;
        int i14;
        if (dVar != null) {
            a0.c cVar = dVar.K;
            a0.c cVar2 = dVar.I;
            if (dVar.f43g0 == 8) {
                bVar.f1220e = 0;
                bVar.f1221f = 0;
                bVar.f1222g = 0;
                return;
            }
            if (dVar.T != null) {
                t tVar = ConstraintLayout.M;
                int i15 = bVar.f1216a;
                int i16 = bVar.f1217b;
                int i17 = bVar.f1218c;
                int i18 = bVar.f1219d;
                int i19 = this.f3540b + this.f3541c;
                int i20 = this.f3542d;
                View view = dVar.f41f0;
                int c10 = y.e.c(i15);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                makeMeasureSpec = 0;
                            } else {
                                int i21 = this.f3544f;
                                if (cVar2 != null) {
                                    i14 = cVar2.f27g;
                                } else {
                                    i14 = 0;
                                }
                                if (cVar != null) {
                                    i14 += cVar.f27g;
                                }
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i21, i20 + i14, -1);
                            }
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3544f, i20, -2);
                            if (dVar.f61r == 1) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            int i22 = bVar.j;
                            if (i22 == 1 || i22 == 2) {
                                if (view.getMeasuredHeight() == dVar.k()) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                if (bVar.j == 2 || !z21 || ((z21 && z22) || dVar.A())) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3544f, i20, -2);
                    }
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                }
                int c11 = y.e.c(i16);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                makeMeasureSpec2 = 0;
                            } else {
                                int i23 = this.f3545g;
                                if (cVar2 != null) {
                                    i13 = dVar.J.f27g;
                                } else {
                                    i13 = 0;
                                }
                                if (cVar != null) {
                                    i13 += dVar.L.f27g;
                                }
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i23, i19 + i13, -1);
                            }
                        } else {
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3545g, i19, -2);
                            if (dVar.s == 1) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            int i24 = bVar.j;
                            if (i24 == 1 || i24 == 2) {
                                if (view.getMeasuredWidth() == dVar.q()) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (bVar.j == 2 || !z19 || ((z19 && z20) || dVar.B())) {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                                }
                            }
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3545g, i19, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                }
                a0.e eVar = (a0.e) dVar.T;
                ConstraintLayout constraintLayout = this.f3546h;
                if (eVar != null && a0.j.c(constraintLayout.F, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f31a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.H, makeMeasureSpec2, dVar.k())) {
                    bVar.f1220e = dVar.q();
                    bVar.f1221f = dVar.k();
                    bVar.f1222g = dVar.f31a0;
                    return;
                }
                if (i15 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i16 == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i16 != 4 && i16 != 1) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (i15 != 4 && i15 != 1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z10 && dVar.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z11 && dVar.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (view == null) {
                    return;
                }
                e eVar2 = (e) view.getLayoutParams();
                int i25 = bVar.j;
                if (i25 != 1 && i25 != 2 && z10 && dVar.f61r == 0 && z11 && dVar.s == 0) {
                    measuredWidth = 0;
                    baseline = 0;
                    i12 = -1;
                    i10 = 0;
                } else {
                    if ((view instanceof u) && (dVar instanceof a0.g)) {
                        ((u) view).j((a0.g) dVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    dVar.G = makeMeasureSpec;
                    dVar.H = makeMeasureSpec2;
                    dVar.f42g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i26 = dVar.f63u;
                    if (i26 > 0) {
                        i6 = Math.max(i26, measuredWidth2);
                    } else {
                        i6 = measuredWidth2;
                    }
                    int i27 = dVar.f64v;
                    if (i27 > 0) {
                        i6 = Math.min(i27, i6);
                    }
                    int i28 = dVar.f66x;
                    if (i28 > 0) {
                        i10 = Math.max(i28, measuredHeight);
                    } else {
                        i10 = measuredHeight;
                    }
                    int i29 = makeMeasureSpec2;
                    int i30 = dVar.f67y;
                    if (i30 > 0) {
                        i10 = Math.min(i30, i10);
                    }
                    if (!a0.j.c(constraintLayout.F, 1)) {
                        if (z14 && z12) {
                            i6 = (int) ((i10 * dVar.W) + 0.5f);
                        } else if (z15 && z13) {
                            i10 = (int) ((i6 / dVar.W) + 0.5f);
                        }
                    }
                    if (measuredWidth2 == i6 && measuredHeight == i10) {
                        baseline = baseline2;
                        measuredWidth = i6;
                    } else {
                        if (measuredWidth2 != i6) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                        }
                        if (measuredHeight != i10) {
                            i11 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                        } else {
                            i11 = i29;
                        }
                        view.measure(makeMeasureSpec, i11);
                        dVar.G = makeMeasureSpec;
                        dVar.H = i11;
                        dVar.f42g = false;
                        measuredWidth = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i10 = measuredHeight2;
                    }
                    i12 = -1;
                }
                if (baseline != i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (measuredWidth == bVar.f1218c && i10 == bVar.f1219d) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                bVar.f1224i = z17;
                if (eVar2.f3505c0) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                if (z18 && baseline != -1 && dVar.f31a0 != baseline) {
                    bVar.f1224i = true;
                }
                bVar.f1220e = measuredWidth;
                bVar.f1221f = i10;
                bVar.f1223h = z18;
                bVar.f1222g = baseline;
            }
        }
    }
}
