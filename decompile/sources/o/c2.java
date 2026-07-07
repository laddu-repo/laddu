package o;

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

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class c2 implements n.b0 {
    public static final Method V;
    public static final Method W;
    public static final Method X;
    public int A;
    public int B;
    public boolean D;
    public boolean E;
    public boolean F;
    public i5.f I;
    public View J;
    public AdapterView.OnItemClickListener K;
    public AdapterView.OnItemSelectedListener L;
    public final Handler Q;
    public Rect S;
    public boolean T;
    public final x U;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f9127v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ListAdapter f9128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r1 f9129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9130y = -2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9131z = -2;
    public final int C = 1002;
    public int G = 0;
    public final int H = Integer.MAX_VALUE;
    public final z1 M = new z1(this, 1);
    public final b2 N = new b2(this);
    public final a2 O = new a2(this);
    public final z1 P = new z1(this, 0);
    public final Rect R = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                V = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                X = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                W = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public c2(Context context, AttributeSet attributeSet, int i, int i10) {
        int resourceId;
        this.f9127v = context;
        this.Q = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.ListPopupWindow, i, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.B = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.D = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        x xVar = new x(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.j.PopupWindow, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(g.j.PopupWindow_overlapAnchor)) {
            xVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(g.j.PopupWindow_overlapAnchor, false));
        }
        int i11 = g.j.PopupWindow_android_popupBackground;
        xVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(i11) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i11, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(i11) : com.bumptech.glide.c.t(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.U = xVar;
        xVar.setInputMethodMode(1);
    }

    @Override // n.b0
    public final boolean a() {
        return this.U.isShowing();
    }

    public final int b() {
        return this.A;
    }

    @Override // n.b0
    public final void c() {
        int i;
        int iA;
        int paddingBottom;
        r1 r1Var;
        r1 r1Var2 = this.f9129x;
        Context context = this.f9127v;
        int i10 = 1;
        x xVar = this.U;
        if (r1Var2 == null) {
            r1 r1VarQ = q(context, !this.T);
            this.f9129x = r1VarQ;
            r1VarQ.setAdapter(this.f9128w);
            this.f9129x.setOnItemClickListener(this.K);
            this.f9129x.setFocusable(true);
            this.f9129x.setFocusableInTouchMode(true);
            this.f9129x.setOnItemSelectedListener(new mc.o(i10, this));
            this.f9129x.setOnScrollListener(this.O);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.L;
            if (onItemSelectedListener != null) {
                this.f9129x.setOnItemSelectedListener(onItemSelectedListener);
            }
            xVar.setContentView(this.f9129x);
        }
        Drawable background = xVar.getBackground();
        Rect rect = this.R;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i = rect.bottom + i11;
            if (!this.D) {
                this.B = -i11;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z2 = xVar.getInputMethodMode() == 2;
        View view = this.J;
        int i12 = this.B;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = W;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(xVar, view, Integer.valueOf(i12), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = xVar.getMaxAvailableHeight(view, i12);
                }
            } else {
                iA = xVar.getMaxAvailableHeight(view, i12);
            }
        } else {
            iA = x1.a(xVar, view, i12, z2);
        }
        int i13 = this.f9130y;
        if (i13 == -1) {
            paddingBottom = iA + i;
        } else {
            int i14 = this.f9131z;
            int iA2 = this.f9129x.a(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f9129x.getPaddingBottom() + this.f9129x.getPaddingTop() + i : 0);
        }
        boolean z10 = xVar.getInputMethodMode() == 2;
        xVar.setWindowLayoutType(this.C);
        if (xVar.isShowing()) {
            if (this.J.isAttachedToWindow()) {
                int width = this.f9131z;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.J.getWidth();
                }
                if (i13 == -1) {
                    i13 = z10 ? paddingBottom : -1;
                    if (z10) {
                        xVar.setWidth(this.f9131z == -1 ? -1 : 0);
                        xVar.setHeight(0);
                    } else {
                        xVar.setWidth(this.f9131z == -1 ? -1 : 0);
                        xVar.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                xVar.setOutsideTouchable(true);
                int i15 = width;
                View view2 = this.J;
                int i16 = this.A;
                int i17 = this.B;
                int i18 = i15 < 0 ? -1 : i15;
                if (i13 < 0) {
                    i13 = -1;
                }
                xVar.update(view2, i16, i17, i18, i13);
                return;
            }
            return;
        }
        int width2 = this.f9131z;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.J.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        xVar.setWidth(width2);
        xVar.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = V;
            if (method2 != null) {
                try {
                    method2.invoke(xVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            y1.b(xVar, true);
        }
        xVar.setOutsideTouchable(true);
        xVar.setTouchInterceptor(this.N);
        if (this.F) {
            xVar.setOverlapAnchor(this.E);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = X;
            if (method3 != null) {
                try {
                    method3.invoke(xVar, this.S);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            y1.a(xVar, this.S);
        }
        xVar.showAsDropDown(this.J, this.A, this.B, this.G);
        this.f9129x.setSelection(-1);
        if ((!this.T || this.f9129x.isInTouchMode()) && (r1Var = this.f9129x) != null) {
            r1Var.setListSelectionHidden(true);
            r1Var.requestLayout();
        }
        if (this.T) {
            return;
        }
        this.Q.post(this.P);
    }

    public final Drawable d() {
        return this.U.getBackground();
    }

    @Override // n.b0
    public final void dismiss() {
        x xVar = this.U;
        xVar.dismiss();
        xVar.setContentView(null);
        this.f9129x = null;
        this.Q.removeCallbacks(this.M);
    }

    @Override // n.b0
    public final r1 e() {
        return this.f9129x;
    }

    public final void g(Drawable drawable) {
        this.U.setBackgroundDrawable(drawable);
    }

    public final void i(int i) {
        this.B = i;
        this.D = true;
    }

    public final void k(int i) {
        this.A = i;
    }

    public final int m() {
        if (this.D) {
            return this.B;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        i5.f fVar = this.I;
        if (fVar == null) {
            this.I = new i5.f(1, this);
        } else {
            ListAdapter listAdapter2 = this.f9128w;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(fVar);
            }
        }
        this.f9128w = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.I);
        }
        r1 r1Var = this.f9129x;
        if (r1Var != null) {
            r1Var.setAdapter(this.f9128w);
        }
    }

    public r1 q(Context context, boolean z2) {
        return new r1(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.U.getBackground();
        if (background == null) {
            this.f9131z = i;
            return;
        }
        Rect rect = this.R;
        background.getPadding(rect);
        this.f9131z = rect.left + rect.right + i;
    }
}
