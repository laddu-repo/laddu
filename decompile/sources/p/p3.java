package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.playfy.tv.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static p3 H;
    public static p3 I;
    public final o3 A;
    public final o3 B;
    public int C;
    public int D;
    public q3 E;
    public boolean F;
    public boolean G;

    /* renamed from: x, reason: collision with root package name */
    public final View f10353x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f10354y;

    /* renamed from: z, reason: collision with root package name */
    public final int f10355z;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.o3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.o3] */
    public p3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i6 = 0;
        this.A = new Runnable(this) { // from class: p.o3

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ p3 f10337y;

            {
                this.f10337y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f10337y.c(false);
                        return;
                    default:
                        this.f10337y.a();
                        return;
                }
            }
        };
        final int i10 = 1;
        this.B = new Runnable(this) { // from class: p.o3

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ p3 f10337y;

            {
                this.f10337y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f10337y.c(false);
                        return;
                    default:
                        this.f10337y.a();
                        return;
                }
            }
        };
        this.f10353x = view;
        this.f10354y = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = t0.r0.f12405a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = j0.a.k(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f10355z = scaledTouchSlop;
        this.G = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p3 p3Var) {
        p3 p3Var2 = H;
        if (p3Var2 != null) {
            p3Var2.f10353x.removeCallbacks(p3Var2.A);
        }
        H = p3Var;
        if (p3Var != null) {
            p3Var.f10353x.postDelayed(p3Var.A, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p3 p3Var = I;
        View view = this.f10353x;
        if (p3Var == this) {
            I = null;
            q3 q3Var = this.E;
            if (q3Var != null) {
                View view2 = (View) q3Var.f10363y;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q3Var.f10362x).getSystemService("window")).removeView(view2);
                }
                this.E = null;
                this.G = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (H == this) {
            b(null);
        }
        view.removeCallbacks(this.B);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [p.q3, java.lang.Object] */
    public final void c(boolean z10) {
        int height;
        int i6;
        int i10;
        int i11;
        boolean z11;
        int i12;
        char c10;
        int i13;
        long longPressTimeout;
        long j;
        long j10;
        View view = this.f10353x;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        p3 p3Var = I;
        if (p3Var != null) {
            p3Var.a();
        }
        I = this;
        this.F = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.A = layoutParams;
        obj.B = new Rect();
        obj.C = new int[2];
        obj.D = new int[2];
        obj.f10362x = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f10363y = inflate;
        obj.f10364z = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(q3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
        View view2 = (View) obj.f10363y;
        Context context2 = (Context) obj.f10362x;
        this.E = obj;
        int i14 = this.C;
        int i15 = this.D;
        boolean z12 = this.F;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.A;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f10364z).setText(this.f10354y);
        int[] iArr = (int[]) obj.D;
        int[] iArr2 = (int[]) obj.C;
        Rect rect = (Rect) obj.B;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i14 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i15 + dimensionPixelOffset2;
            i6 = i15 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z12) {
            i10 = R.dimen.tooltip_y_offset_touch;
        } else {
            i10 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i16 = i14;
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                }
                if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                }
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                c10 = 1;
                i11 = i6;
                z11 = z12;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i13 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i13 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i13, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i11 = i6;
                z11 = z12;
                i12 = 0;
                c10 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i17 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i17;
            iArr2[c10] = iArr2[c10] - iArr[c10];
            layoutParams2.x = (i17 + i16) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i18 = iArr2[c10];
            int i19 = ((i18 + i11) - dimensionPixelOffset3) - measuredHeight;
            int i20 = i18 + height + dimensionPixelOffset3;
            if (z11) {
                if (i19 >= 0) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i20;
                }
            } else if (measuredHeight + i20 <= rect.height()) {
                layoutParams2.y = i20;
            } else {
                layoutParams2.y = i19;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.F) {
            j10 = 2500;
        } else {
            WeakHashMap weakHashMap = t0.q0.f12397a;
            if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j10 = j - longPressTimeout;
        }
        o3 o3Var = this.B;
        view.removeCallbacks(o3Var);
        view.postDelayed(o3Var, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.D) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            p.q3 r4 = r3.E
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.F
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f10353x
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.G = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            p.q3 r4 = r3.E
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.G
            if (r1 != 0) goto L66
            int r1 = r3.C
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f10355z
            if (r1 > r2) goto L66
            int r1 = r3.D
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.C = r4
            r3.D = r5
            r3.G = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.C = view.getWidth() / 2;
        this.D = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
