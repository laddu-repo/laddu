package p;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m3 implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f10301a;

    /* renamed from: b, reason: collision with root package name */
    public int f10302b;

    /* renamed from: c, reason: collision with root package name */
    public View f10303c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f10304d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f10305e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f10306f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10307g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f10308h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f10309i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f10310k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10311l;

    /* renamed from: m, reason: collision with root package name */
    public j f10312m;

    /* renamed from: n, reason: collision with root package name */
    public int f10313n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f10314o;

    public final void a(int i6) {
        View view;
        Toolbar toolbar = this.f10301a;
        int i10 = this.f10302b ^ i6;
        this.f10302b = i6;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i6 & 4) != 0) {
                    b();
                }
                if ((this.f10302b & 4) != 0) {
                    Drawable drawable = this.f10306f;
                    if (drawable == null) {
                        drawable = this.f10314o;
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
                if ((i6 & 8) != 0) {
                    toolbar.setTitle(this.f10308h);
                    toolbar.setSubtitle(this.f10309i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f10303c) != null) {
                if ((i6 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f10301a;
        if ((this.f10302b & 4) != 0) {
            if (TextUtils.isEmpty(this.j)) {
                toolbar.setNavigationContentDescription(this.f10313n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i6 = this.f10302b;
        if ((i6 & 2) != 0) {
            if ((i6 & 1) != 0) {
                drawable = this.f10305e;
                if (drawable == null) {
                    drawable = this.f10304d;
                }
            } else {
                drawable = this.f10304d;
            }
        } else {
            drawable = null;
        }
        this.f10301a.setLogo(drawable);
    }
}
