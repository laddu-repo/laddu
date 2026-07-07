package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k3 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f9201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f9202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f9203e;
    public final Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f9205h;
    public final CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f9206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f9207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f9209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f9211o;

    public k3(Toolbar toolbar, boolean z2) {
        int i;
        Drawable drawable;
        int i10 = g.h.abc_action_bar_up_description;
        this.f9210n = 0;
        this.f9199a = toolbar;
        this.f9205h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f9204g = this.f9205h != null;
        this.f = toolbar.getNavigationIcon();
        hd.a aVarI = hd.a.I(toolbar.getContext(), null, g.j.ActionBar, g.a.actionBarStyle);
        TypedArray typedArray = (TypedArray) aVarI.f6280x;
        this.f9211o = aVarI.v(g.j.ActionBar_homeAsUpIndicator);
        if (z2) {
            CharSequence text = typedArray.getText(g.j.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                this.f9204g = true;
                this.f9205h = text;
                if ((this.f9200b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f9204g) {
                        t0.m0.o(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(g.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f9200b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableV = aVarI.v(g.j.ActionBar_logo);
            if (drawableV != null) {
                this.f9203e = drawableV;
                c();
            }
            Drawable drawableV2 = aVarI.v(g.j.ActionBar_icon);
            if (drawableV2 != null) {
                this.f9202d = drawableV2;
                c();
            }
            if (this.f == null && (drawable = this.f9211o) != null) {
                this.f = drawable;
                if ((this.f9200b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(g.j.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(g.j.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f9201c;
                if (view != null && (this.f9200b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f9201c = viewInflate;
                if (viewInflate != null && (this.f9200b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f9200b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(g.j.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(g.j.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(g.j.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.O.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(g.j.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.G = resourceId2;
                z0 z0Var = toolbar.f682w;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(g.j.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.H = resourceId3;
                z0 z0Var2 = toolbar.f683x;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(g.j.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f9211o = toolbar.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.f9200b = i;
        }
        aVarI.K();
        if (i10 != this.f9210n) {
            this.f9210n = i10;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i11 = this.f9210n;
                this.f9206j = i11 != 0 ? toolbar.getContext().getString(i11) : null;
                b();
            }
        }
        this.f9206j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new j3(this));
    }

    public final void a(int i) {
        View view;
        int i10 = this.f9200b ^ i;
        this.f9200b = i;
        if (i10 != 0) {
            int i11 = i10 & 4;
            Toolbar toolbar = this.f9199a;
            if (i11 != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.f9200b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f9211o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f9205h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f9201c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f9200b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f9206j);
            Toolbar toolbar = this.f9199a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f9210n);
            } else {
                toolbar.setNavigationContentDescription(this.f9206j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f9200b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f9203e) == null) {
            drawable = this.f9202d;
        }
        this.f9199a.setLogo(drawable);
    }
}
