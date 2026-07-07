package ya;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import ma.n;
import t0.j0;
import t0.q0;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends LinearLayout {
    public static final /* synthetic */ int I = 0;
    public View A;
    public w9.a B;
    public View C;
    public TextView D;
    public ImageView E;
    public Drawable F;
    public int G;
    public final /* synthetic */ TabLayout H;

    /* renamed from: x, reason: collision with root package name */
    public g f15043x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f15044y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f15045z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLayout tabLayout, Context context) {
        super(context);
        lc.c cVar;
        this.H = tabLayout;
        this.G = 2;
        e(context);
        setPaddingRelative(tabLayout.B, tabLayout.C, tabLayout.D, tabLayout.E);
        setGravity(17);
        setOrientation(!tabLayout.f2748d0 ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 24) {
            cVar = new lc.c(p0.b.e(context2));
        } else {
            cVar = new lc.c((Object) null);
        }
        WeakHashMap weakHashMap = q0.f12397a;
        if (i6 >= 24) {
            j0.a(this, j2.e.j((PointerIcon) cVar.f8328x));
        }
    }

    private w9.a getBadge() {
        return this.B;
    }

    private w9.a getOrCreateBadge() {
        if (this.B == null) {
            this.B = new w9.a(getContext());
        }
        b();
        w9.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.B != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.A;
            if (view != null) {
                w9.a aVar = this.B;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.A = null;
            }
        }
    }

    public final void b() {
        if (this.B != null) {
            if (this.C != null) {
                a();
                return;
            }
            TextView textView = this.f15044y;
            if (textView != null && this.f15043x != null) {
                if (this.A != textView) {
                    a();
                    TextView textView2 = this.f15044y;
                    if (this.B != null && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        w9.a aVar = this.B;
                        Rect rect = new Rect();
                        textView2.getDrawingRect(rect);
                        aVar.setBounds(rect);
                        aVar.i(textView2, null);
                        if (aVar.d() != null) {
                            aVar.d().setForeground(aVar);
                        } else {
                            textView2.getOverlay().add(aVar);
                        }
                        this.A = textView2;
                        return;
                    }
                    return;
                }
                c(textView);
                return;
            }
            a();
        }
    }

    public final void c(View view) {
        w9.a aVar = this.B;
        if (aVar != null && view == this.A) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(view, null);
        }
    }

    public final void d() {
        boolean z10;
        f();
        g gVar = this.f15043x;
        if (gVar != null) {
            TabLayout tabLayout = gVar.f15036d;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == gVar.f15034b) {
                    z10 = true;
                    setSelected(z10);
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        z10 = false;
        setSelected(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.F;
        if (drawable != null && drawable.isStateful()) {
            z10 = this.F.setState(drawableState);
        } else {
            z10 = false;
        }
        if (z10) {
            invalidate();
            this.H.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, ya.j] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.graphics.drawable.RippleDrawable] */
    public final void e(Context context) {
        TabLayout tabLayout = this.H;
        int i6 = tabLayout.Q;
        GradientDrawable gradientDrawable = null;
        if (i6 != 0) {
            Drawable f3 = c9.a.f(context, i6);
            this.F = f3;
            if (f3 != null && f3.isStateful()) {
                this.F.setState(getDrawableState());
            }
        } else {
            this.F = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (tabLayout.K != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.K;
            int a10 = sa.b.a(colorStateList, sa.b.f12283c);
            int[] iArr = sa.b.f12282b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{sa.b.f12284d, iArr, StateSet.NOTHING}, new int[]{a10, sa.b.a(colorStateList, iArr), sa.b.a(colorStateList, sa.b.f12281a)});
            boolean z10 = tabLayout.f2752h0;
            if (z10) {
                gradientDrawable2 = null;
            }
            if (!z10) {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable2, gradientDrawable);
        }
        setBackground(gradientDrawable2);
        tabLayout.invalidate();
    }

    public final void f() {
        View view;
        int i6;
        ViewParent parent;
        g gVar = this.f15043x;
        if (gVar != null) {
            view = gVar.f15035c;
        } else {
            view = null;
        }
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.C;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.C);
                }
                addView(view);
            }
            this.C = view;
            TextView textView = this.f15044y;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f15045z;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f15045z.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.D = textView2;
            if (textView2 != null) {
                this.G = textView2.getMaxLines();
            }
            this.E = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.C;
            if (view3 != null) {
                removeView(view3);
                this.C = null;
            }
            this.D = null;
            this.E = null;
        }
        if (this.C == null) {
            if (this.f15045z == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.playfy.tv.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f15045z = imageView2;
                addView(imageView2, 0);
            }
            if (this.f15044y == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.playfy.tv.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f15044y = textView3;
                addView(textView3);
                this.G = this.f15044y.getMaxLines();
            }
            TextView textView4 = this.f15044y;
            TabLayout tabLayout = this.H;
            c9.a.t(textView4, tabLayout.F);
            if (isSelected() && (i6 = tabLayout.H) != -1) {
                c9.a.t(this.f15044y, i6);
            } else {
                c9.a.t(this.f15044y, tabLayout.G);
            }
            ColorStateList colorStateList = tabLayout.I;
            if (colorStateList != null) {
                this.f15044y.setTextColor(colorStateList);
            }
            g(this.f15044y, this.f15045z, true);
            b();
            ImageView imageView3 = this.f15045z;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new i(this, imageView3));
            }
            TextView textView5 = this.f15044y;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new i(this, textView5));
            }
        } else {
            TextView textView6 = this.D;
            if (textView6 != null || this.E != null) {
                g(textView6, this.E, false);
            }
        }
        if (gVar != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
    }

    public final void g(TextView textView, ImageView imageView, boolean z10) {
        CharSequence charSequence;
        boolean z11;
        int i6;
        CharSequence charSequence2;
        int i10;
        g gVar = this.f15043x;
        CharSequence charSequence3 = null;
        if (gVar != null) {
            charSequence = gVar.f15033a;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (!isEmpty) {
                this.f15043x.getClass();
                z11 = true;
            } else {
                z11 = false;
            }
            if (!isEmpty) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            textView.setText(charSequence2);
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z11 = false;
        }
        if (z10 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z11 && imageView.getVisibility() == 0) {
                i6 = (int) n.d(getContext(), 8);
            } else {
                i6 = 0;
            }
            if (this.H.f2748d0) {
                if (i6 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i6);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i6 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i6;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (!isEmpty) {
                charSequence3 = charSequence;
            }
            e9.f.i(this, charSequence3);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f15044y, this.f15045z, this.C};
        int i6 = 0;
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                if (z10) {
                    i10 = Math.min(i10, view.getTop());
                } else {
                    i10 = view.getTop();
                }
                if (z10) {
                    i6 = Math.max(i6, view.getBottom());
                } else {
                    i6 = view.getBottom();
                }
                z10 = true;
            }
        }
        return i6 - i10;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f15044y, this.f15045z, this.C};
        int i6 = 0;
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                if (z10) {
                    i10 = Math.min(i10, view.getLeft());
                } else {
                    i10 = view.getLeft();
                }
                if (z10) {
                    i6 = Math.max(i6, view.getRight());
                } else {
                    i6 = view.getRight();
                }
                z10 = true;
            }
        }
        return i6 - i10;
    }

    public g getTab() {
        return this.f15043x;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w9.a aVar = this.B;
        if (aVar != null && aVar.isVisible()) {
            w9.a aVar2 = this.B;
            w9.c cVar = aVar2.B;
            CharSequence charSequence = null;
            if (aVar2.isVisible()) {
                w9.b bVar = cVar.f14245b;
                if (bVar.G != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    charSequence = bVar.L;
                    if (charSequence == null) {
                        charSequence = aVar2.B.f14245b.G;
                    }
                } else if (aVar2.g()) {
                    if (bVar.N != 0 && (context = (Context) aVar2.f14236x.get()) != null) {
                        if (aVar2.E != -2) {
                            int e10 = aVar2.e();
                            int i6 = aVar2.E;
                            if (e10 > i6) {
                                charSequence = context.getString(bVar.O, Integer.valueOf(i6));
                            }
                        }
                        charSequence = context.getResources().getQuantityString(bVar.N, aVar2.e(), Integer.valueOf(aVar2.e()));
                    }
                } else {
                    charSequence = bVar.M;
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) r.w(0, 1, this.f15043x.f15034b, 1, isSelected()).f12916y);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) u0.b.f12733e.f12740a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.playfy.tv.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int size = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        TabLayout tabLayout = this.H;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i6 = View.MeasureSpec.makeMeasureSpec(tabLayout.R, Integer.MIN_VALUE);
        }
        super.onMeasure(i6, i10);
        if (this.f15044y != null) {
            float f3 = tabLayout.N;
            if (isSelected() && tabLayout.H != -1) {
                f3 = tabLayout.O;
            }
            int i11 = this.G;
            ImageView imageView = this.f15045z;
            if (imageView != null && imageView.getVisibility() == 0) {
                i11 = 1;
            } else {
                TextView textView = this.f15044y;
                if (textView != null && textView.getLineCount() > 1) {
                    f3 = tabLayout.P;
                }
            }
            float textSize = this.f15044y.getTextSize();
            int lineCount = this.f15044y.getLineCount();
            int maxLines = this.f15044y.getMaxLines();
            if (f3 != textSize || (maxLines >= 0 && i11 != maxLines)) {
                if (tabLayout.f2747c0 == 1 && f3 > textSize && lineCount == 1) {
                    Layout layout = this.f15044y.getLayout();
                    if (layout != null) {
                        if ((f3 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f15044y.setTextSize(0, f3);
                this.f15044y.setMaxLines(i11);
                super.onMeasure(i6, i10);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f15043x != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            g gVar = this.f15043x;
            TabLayout tabLayout = gVar.f15036d;
            if (tabLayout != null) {
                tabLayout.f(gVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        isSelected();
        super.setSelected(z10);
        TextView textView = this.f15044y;
        if (textView != null) {
            textView.setSelected(z10);
        }
        ImageView imageView = this.f15045z;
        if (imageView != null) {
            imageView.setSelected(z10);
        }
        View view = this.C;
        if (view != null) {
            view.setSelected(z10);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.f15043x) {
            this.f15043x = gVar;
            d();
        }
    }
}
