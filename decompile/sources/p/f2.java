package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f2 implements o.b0 {
    public static final Method X;
    public static final Method Y;
    public static final Method Z;
    public int C;
    public int D;
    public boolean F;
    public boolean G;
    public boolean H;
    public c2 K;
    public View L;
    public AdapterView.OnItemClickListener M;
    public AdapterView.OnItemSelectedListener N;
    public final Handler S;
    public Rect U;
    public boolean V;
    public final a0 W;

    /* renamed from: x, reason: collision with root package name */
    public final Context f10238x;

    /* renamed from: y, reason: collision with root package name */
    public ListAdapter f10239y;

    /* renamed from: z, reason: collision with root package name */
    public t1 f10240z;
    public final int A = -2;
    public int B = -2;
    public final int E = 1002;
    public int I = 0;
    public final int J = Integer.MAX_VALUE;
    public final b2 O = new b2(this, 1);
    public final e2 P = new e2(this);
    public final d2 Q = new d2(this);
    public final b2 R = new b2(this, 0);
    public final Rect T = new Rect();

    static {
        int i6 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i6 <= 28) {
            try {
                X = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Z = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                Y = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.PopupWindow, p.a0] */
    public f2(Context context, AttributeSet attributeSet, int i6, int i10) {
        Drawable drawable;
        int resourceId;
        this.f10238x = context;
        this.S = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f5746p, i6, 0);
        this.C = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.D = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.F = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i6, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f5749t, i6, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            bf.y.u(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = c9.a.f(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.W = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // o.b0
    public final boolean a() {
        return this.W.isShowing();
    }

    @Override // o.b0
    public final void b() {
        int i6;
        boolean z10;
        int a10;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z11;
        t1 t1Var;
        int i12;
        int i13;
        t1 t1Var2 = this.f10240z;
        Context context = this.f10238x;
        a0 a0Var = this.W;
        if (t1Var2 == null) {
            t1 q9 = q(context, !this.V);
            this.f10240z = q9;
            q9.setAdapter(this.f10239y);
            this.f10240z.setOnItemClickListener(this.M);
            this.f10240z.setFocusable(true);
            this.f10240z.setFocusableInTouchMode(true);
            this.f10240z.setOnItemSelectedListener(new nd.f0(this, 1));
            this.f10240z.setOnScrollListener(this.Q);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                this.f10240z.setOnItemSelectedListener(onItemSelectedListener);
            }
            a0Var.setContentView(this.f10240z);
        }
        Drawable background = a0Var.getBackground();
        Rect rect = this.T;
        int i14 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i6 = rect.bottom + i15;
            if (!this.F) {
                this.D = -i15;
            }
        } else {
            rect.setEmpty();
            i6 = 0;
        }
        if (a0Var.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.L;
        int i16 = this.D;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = Y;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(a0Var, view, Integer.valueOf(i16), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = a0Var.getMaxAvailableHeight(view, i16);
        } else {
            a10 = z1.a(a0Var, view, i16, z10);
        }
        int i17 = this.A;
        if (i17 == -1) {
            i11 = a10 + i6;
        } else {
            int i18 = this.B;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a11 = this.f10240z.a(makeMeasureSpec, a10);
            if (a11 > 0) {
                i10 = this.f10240z.getPaddingBottom() + this.f10240z.getPaddingTop() + i6;
            } else {
                i10 = 0;
            }
            i11 = a11 + i10;
        }
        if (a0Var.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        bf.y.v(a0Var, this.E);
        if (a0Var.isShowing()) {
            if (this.L.isAttachedToWindow()) {
                int i19 = this.B;
                if (i19 == -1) {
                    i19 = -1;
                } else if (i19 == -2) {
                    i19 = this.L.getWidth();
                }
                if (i17 == -1) {
                    if (z11) {
                        i17 = i11;
                    } else {
                        i17 = -1;
                    }
                    if (z11) {
                        if (this.B == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        a0Var.setWidth(i13);
                        a0Var.setHeight(0);
                    } else {
                        if (this.B == -1) {
                            i14 = -1;
                        }
                        a0Var.setWidth(i14);
                        a0Var.setHeight(-1);
                    }
                } else if (i17 == -2) {
                    i17 = i11;
                }
                a0Var.setOutsideTouchable(true);
                int i20 = i19;
                View view2 = this.L;
                int i21 = this.C;
                int i22 = this.D;
                if (i20 < 0) {
                    i12 = -1;
                } else {
                    i12 = i20;
                }
                if (i17 < 0) {
                    i17 = -1;
                }
                a0Var.update(view2, i21, i22, i12, i17);
                return;
            }
            return;
        }
        int i23 = this.B;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.L.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i11;
        }
        a0Var.setWidth(i23);
        a0Var.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = X;
            if (method2 != null) {
                try {
                    method2.invoke(a0Var, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a2.b(a0Var, true);
        }
        a0Var.setOutsideTouchable(true);
        a0Var.setTouchInterceptor(this.P);
        if (this.H) {
            bf.y.u(a0Var, this.G);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = Z;
            if (method3 != null) {
                try {
                    method3.invoke(a0Var, this.U);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            a2.a(a0Var, this.U);
        }
        a0Var.showAsDropDown(this.L, this.C, this.D, this.I);
        this.f10240z.setSelection(-1);
        if ((!this.V || this.f10240z.isInTouchMode()) && (t1Var = this.f10240z) != null) {
            t1Var.setListSelectionHidden(true);
            t1Var.requestLayout();
        }
        if (!this.V) {
            this.S.post(this.R);
        }
    }

    public final int c() {
        return this.C;
    }

    @Override // o.b0
    public final void dismiss() {
        a0 a0Var = this.W;
        a0Var.dismiss();
        a0Var.setContentView(null);
        this.f10240z = null;
        this.S.removeCallbacks(this.O);
    }

    public final void e(int i6) {
        this.C = i6;
    }

    public final Drawable g() {
        return this.W.getBackground();
    }

    @Override // o.b0
    public final t1 h() {
        return this.f10240z;
    }

    public final void j(Drawable drawable) {
        this.W.setBackgroundDrawable(drawable);
    }

    public final void k(int i6) {
        this.D = i6;
        this.F = true;
    }

    public final int o() {
        if (!this.F) {
            return 0;
        }
        return this.D;
    }

    public void p(ListAdapter listAdapter) {
        c2 c2Var = this.K;
        if (c2Var == null) {
            this.K = new c2(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f10239y;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2Var);
            }
        }
        this.f10239y = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.K);
        }
        t1 t1Var = this.f10240z;
        if (t1Var != null) {
            t1Var.setAdapter(this.f10239y);
        }
    }

    public t1 q(Context context, boolean z10) {
        return new t1(context, z10);
    }

    public final void r(int i6) {
        Drawable background = this.W.getBackground();
        if (background != null) {
            Rect rect = this.T;
            background.getPadding(rect);
            this.B = rect.left + rect.right + i6;
            return;
        }
        this.B = i6;
    }
}
