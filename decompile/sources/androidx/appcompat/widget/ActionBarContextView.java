package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.l;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import o.z;
import p.f;
import p.j;
import p.u3;
import t0.q0;
import t0.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public j A;
    public int B;
    public u0 C;
    public boolean D;
    public boolean E;
    public CharSequence F;
    public CharSequence G;
    public View H;
    public View I;
    public View J;
    public LinearLayout K;
    public TextView L;
    public TextView M;
    public final int N;
    public final int O;
    public boolean P;
    public final int Q;

    /* renamed from: x */
    public final ja.b f751x;

    /* renamed from: y */
    public final Context f752y;

    /* renamed from: z */
    public ActionMenuView f753z;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ja.b] */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        ?? obj = new Object();
        obj.f7319c = this;
        obj.f7317a = false;
        this.f751x = obj;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f752y = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f752y = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f5735d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = c9.a.f(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.N = obtainStyledAttributes.getResourceId(5, 0);
        this.O = obtainStyledAttributes.getResourceId(4, 0);
        this.B = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.Q = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(ActionBarContextView actionBarContextView) {
        super.setVisibility(0);
    }

    public static /* synthetic */ void b(ActionBarContextView actionBarContextView, int i6) {
        super.setVisibility(i6);
    }

    public static int f(View view, int i6, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i10);
        return Math.max(0, i6 - view.getMeasuredWidth());
    }

    public static int g(int i6, int i10, int i11, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z10) {
            view.layout(i6 - measuredWidth, i12, i6, measuredHeight + i12);
        } else {
            view.layout(i6, i12, i6 + measuredWidth, measuredHeight + i12);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(n.a aVar) {
        View view = this.H;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.Q, (ViewGroup) this, false);
            this.H = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.H);
        }
        View findViewById = this.H.findViewById(R.id.action_mode_close_button);
        this.I = findViewById;
        findViewById.setOnClickListener(new l(aVar, 3));
        o.l c10 = aVar.c();
        j jVar = this.A;
        if (jVar != null) {
            jVar.b();
            f fVar = jVar.Q;
            if (fVar != null && fVar.b()) {
                fVar.f9845i.dismiss();
            }
        }
        j jVar2 = new j(getContext());
        this.A = jVar2;
        jVar2.I = true;
        jVar2.J = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c10.b(this.A, this.f752y);
        j jVar3 = this.A;
        z zVar = jVar3.E;
        if (zVar == null) {
            z zVar2 = (z) jVar3.A.inflate(jVar3.C, (ViewGroup) this, false);
            jVar3.E = zVar2;
            zVar2.b(jVar3.f10273z);
            jVar3.g();
        }
        z zVar3 = jVar3.E;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f753z = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f753z, layoutParams);
    }

    public final void d() {
        int i6;
        if (this.K == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.K = linearLayout;
            this.L = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.M = (TextView) this.K.findViewById(R.id.action_bar_subtitle);
            int i10 = this.N;
            if (i10 != 0) {
                this.L.setTextAppearance(getContext(), i10);
            }
            int i11 = this.O;
            if (i11 != 0) {
                this.M.setTextAppearance(getContext(), i11);
            }
        }
        this.L.setText(this.F);
        this.M.setText(this.G);
        boolean isEmpty = TextUtils.isEmpty(this.F);
        boolean isEmpty2 = TextUtils.isEmpty(this.G);
        TextView textView = this.M;
        int i12 = 8;
        if (!isEmpty2) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        textView.setVisibility(i6);
        LinearLayout linearLayout2 = this.K;
        if (!isEmpty || !isEmpty2) {
            i12 = 0;
        }
        linearLayout2.setVisibility(i12);
        if (this.K.getParent() == null) {
            addView(this.K);
        }
    }

    public final void e() {
        removeAllViews();
        this.J = null;
        this.f753z = null;
        this.A = null;
        View view = this.I;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.C != null) {
            return this.f751x.f7318b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.B;
    }

    public CharSequence getSubtitle() {
        return this.G;
    }

    public CharSequence getTitle() {
        return this.F;
    }

    @Override // android.view.View
    /* renamed from: h */
    public final void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            u0 u0Var = this.C;
            if (u0Var != null) {
                u0Var.b();
            }
            super.setVisibility(i6);
        }
    }

    public final u0 i(int i6, long j) {
        u0 u0Var = this.C;
        if (u0Var != null) {
            u0Var.b();
        }
        ja.b bVar = this.f751x;
        if (i6 == 0) {
            if (getVisibility() != 0) {
                setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            u0 a10 = q0.a(this);
            a10.a(1.0f);
            a10.c(j);
            ((ActionBarContextView) bVar.f7319c).C = a10;
            bVar.f7318b = i6;
            a10.d(bVar);
            return a10;
        }
        u0 a11 = q0.a(this);
        a11.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a11.c(j);
        ((ActionBarContextView) bVar.f7319c).C = a11;
        bVar.f7318b = i6;
        a11.d(bVar);
        return a11;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i6;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, h.a.f5732a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        j jVar = this.A;
        if (jVar != null) {
            Configuration configuration2 = jVar.f10272y.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
                if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                    if (i10 >= 360) {
                        i6 = 3;
                    } else {
                        i6 = 2;
                    }
                } else {
                    i6 = 4;
                }
            } else {
                i6 = 5;
            }
            jVar.M = i6;
            o.l lVar = jVar.f10273z;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.A;
        if (jVar != null) {
            jVar.b();
            f fVar = this.A.Q;
            if (fVar != null && fVar.b()) {
                fVar.f9845i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.E = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.E = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12 = u3.f10392a;
        if (getLayoutDirection() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = (i11 - i6) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.H;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
            if (z11) {
                i13 = marginLayoutParams.rightMargin;
            } else {
                i13 = marginLayoutParams.leftMargin;
            }
            if (z11) {
                i14 = marginLayoutParams.leftMargin;
            } else {
                i14 = marginLayoutParams.rightMargin;
            }
            if (z11) {
                i15 = paddingLeft - i13;
            } else {
                i15 = paddingLeft + i13;
            }
            int g10 = g(i15, paddingTop, paddingTop2, this.H, z11) + i15;
            if (z11) {
                i16 = g10 - i14;
            } else {
                i16 = g10 + i14;
            }
            paddingLeft = i16;
        }
        LinearLayout linearLayout = this.K;
        if (linearLayout != null && this.J == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(paddingLeft, paddingTop, paddingTop2, this.K, z11);
        }
        View view2 = this.J;
        if (view2 != null) {
            g(paddingLeft, paddingTop, paddingTop2, view2, z11);
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i11 - i6) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f753z;
        if (actionMenuView != null) {
            g(paddingRight, paddingTop, paddingTop2, actionMenuView, !z11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = 1073741824;
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            if (View.MeasureSpec.getMode(i10) != 0) {
                int size = View.MeasureSpec.getSize(i6);
                int i14 = this.B;
                if (i14 <= 0) {
                    i14 = View.MeasureSpec.getSize(i10);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i15 = i14 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
                View view = this.H;
                if (view != null) {
                    int f3 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
                    paddingLeft = f3 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f753z;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f753z, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.K;
                if (linearLayout != null && this.J == null) {
                    if (this.P) {
                        this.K.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.K.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.K;
                        if (z10) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        linearLayout2.setVisibility(i12);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.J;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i16 = layoutParams.width;
                    if (i16 != -2) {
                        i11 = 1073741824;
                    } else {
                        i11 = Integer.MIN_VALUE;
                    }
                    if (i16 >= 0) {
                        paddingLeft = Math.min(i16, paddingLeft);
                    }
                    int i17 = layoutParams.height;
                    if (i17 == -2) {
                        i13 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        i15 = Math.min(i17, i15);
                    }
                    this.J.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i15, i13));
                }
                if (this.B <= 0) {
                    int childCount = getChildCount();
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i18) {
                            i18 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i18);
                    return;
                }
                setMeasuredDimension(size, i14);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.D = false;
        }
        if (!this.D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    public void setContentHeight(int i6) {
        this.B = i6;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        if (view != null && (linearLayout = this.K) != null) {
            removeView(linearLayout);
            this.K = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.G = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.F = charSequence;
        d();
        q0.s(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.P) {
            requestLayout();
        }
        this.P = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
