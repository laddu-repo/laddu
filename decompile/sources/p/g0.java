package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public final f0 f10244e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f10245f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f10246g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f10247h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10248i;
    public boolean j;

    public g0(f0 f0Var) {
        super(f0Var);
        this.f10246g = null;
        this.f10247h = null;
        this.f10248i = false;
        this.j = false;
        this.f10244e = f0Var;
    }

    @Override // p.b0
    public final void b(AttributeSet attributeSet, int i6) {
        super.b(attributeSet, R.attr.seekBarStyle);
        f0 f0Var = this.f10244e;
        Context context = f0Var.getContext();
        int[] iArr = h.a.f5738g;
        n9.j E = n9.j.E(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) E.f9356z;
        t0.q0.q(f0Var, f0Var.getContext(), iArr, attributeSet, (TypedArray) E.f9356z, R.attr.seekBarStyle);
        Drawable w10 = E.w(0);
        if (w10 != null) {
            f0Var.setThumb(w10);
        }
        Drawable v10 = E.v(1);
        Drawable drawable = this.f10245f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f10245f = v10;
        if (v10 != null) {
            v10.setCallback(f0Var);
            s1.c.w(v10, f0Var.getLayoutDirection());
            if (v10.isStateful()) {
                v10.setState(f0Var.getDrawableState());
            }
            f();
        }
        f0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f10247h = n1.c(typedArray.getInt(3, -1), this.f10247h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f10246g = E.t(2);
            this.f10248i = true;
        }
        E.G();
        f();
    }

    public final void f() {
        Drawable drawable = this.f10245f;
        if (drawable != null) {
            if (this.f10248i || this.j) {
                Drawable A = s1.c.A(drawable.mutate());
                this.f10245f = A;
                if (this.f10248i) {
                    A.setTintList(this.f10246g);
                }
                if (this.j) {
                    this.f10245f.setTintMode(this.f10247h);
                }
                if (this.f10245f.isStateful()) {
                    this.f10245f.setState(this.f10244e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i6;
        if (this.f10245f != null) {
            int max = this.f10244e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f10245f.getIntrinsicWidth();
                int intrinsicHeight = this.f10245f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i6 = intrinsicWidth / 2;
                } else {
                    i6 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f10245f.setBounds(-i6, -i10, i6, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f10245f.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
