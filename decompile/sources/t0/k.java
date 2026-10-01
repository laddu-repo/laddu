package t0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f11841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f11842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f11843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f11845e;

    public k(ViewGroup viewGroup) {
        this.f11843c = viewGroup;
    }

    public final boolean a(float f, float f4, boolean z2) {
        ViewParent viewParentE;
        if (this.f11844d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f11843c, f, f4, z2);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e7);
            }
        }
        return false;
    }

    public final boolean b(float f, float f4) {
        ViewParent viewParentE;
        if (this.f11844d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f11843c, f, f4);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e7);
            }
        }
        return false;
    }

    public final boolean c(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f11844d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f11843c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f11845e == null) {
                this.f11845e = new int[2];
            }
            iArr3 = this.f11845e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof l) {
            ((l) viewParentE).c(viewGroup, i, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i, i10, iArr3);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e7);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f11844d && (viewParentE = e(i13)) != null) {
            if (i != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f11843c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f11845e == null) {
                        this.f11845e = new int[2];
                    }
                    int[] iArr4 = this.f11845e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof m) {
                    ((m) viewParentE).d(viewGroup, i, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof l) {
                        ((l) viewParentE).e(viewGroup, i, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i, i10, i11, i12);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e7);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f11841a;
        }
        if (i != 1) {
            return null;
        }
        return this.f11842b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i10) {
        boolean zOnStartNestedScroll;
        if (!f(i10)) {
            if (this.f11844d) {
                View view = this.f11843c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof l;
                    if (z2) {
                        zOnStartNestedScroll = ((l) parent).f(view2, view, i, i10);
                    } else if (i10 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i10 == 0) {
                            this.f11841a = parent;
                        } else if (i10 == 1) {
                            this.f11842b = parent;
                        }
                        if (z2) {
                            ((l) parent).a(view2, view, i, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z2 = viewParentE instanceof l;
            ViewGroup viewGroup = this.f11843c;
            if (z2) {
                ((l) viewParentE).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e7);
                }
            }
            if (i == 0) {
                this.f11841a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f11842b = null;
            }
        }
    }
}
