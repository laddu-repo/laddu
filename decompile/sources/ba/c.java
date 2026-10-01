package ba;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b7.w;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.material.card.MaterialCardView;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import k6.e;
import ua.i;
import ua.k;
import ua.l;
import ua.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f1624y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f1625z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f1626a;

    /* renamed from: c, reason: collision with root package name */
    public final i f1628c;

    /* renamed from: d, reason: collision with root package name */
    public final i f1629d;

    /* renamed from: e, reason: collision with root package name */
    public int f1630e;

    /* renamed from: f, reason: collision with root package name */
    public int f1631f;

    /* renamed from: g, reason: collision with root package name */
    public int f1632g;

    /* renamed from: h, reason: collision with root package name */
    public int f1633h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1634i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1635k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1636l;

    /* renamed from: m, reason: collision with root package name */
    public m f1637m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f1638n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f1639o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f1640p;

    /* renamed from: q, reason: collision with root package name */
    public i f1641q;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f1643t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f1644u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1645v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1646w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1627b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f1642r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f1647x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f1625z = colorDrawable;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f1626a = materialCardView;
        i iVar = new i(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f1628c = iVar;
        iVar.m(materialCardView.getContext());
        iVar.s();
        l g10 = iVar.f13000y.f12978a.g();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, t.a.f12312a, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            g10.f13007e = new ua.a(dimension);
            g10.f13008f = new ua.a(dimension);
            g10.f13009g = new ua.a(dimension);
            g10.f13010h = new ua.a(dimension);
        }
        this.f1629d = new i();
        h(g10.a());
        this.f1644u = j5.u(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, u9.a.f12953a);
        this.f1645v = j5.t(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f1646w = j5.t(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(e eVar, float f3) {
        if (eVar instanceof k) {
            return (float) ((1.0d - f1624y) * f3);
        }
        if (eVar instanceof ua.e) {
            return f3 / 2.0f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float a() {
        float a10;
        float a11;
        float a12;
        e eVar = this.f1637m.f13015a;
        i iVar = this.f1628c;
        float b10 = b(eVar, iVar.k());
        e eVar2 = this.f1637m.f13016b;
        float[] fArr = iVar.Z;
        if (fArr != null) {
            a10 = fArr[0];
        } else {
            a10 = iVar.f13000y.f12978a.f13020f.a(iVar.h());
        }
        float max = Math.max(b10, b(eVar2, a10));
        e eVar3 = this.f1637m.f13017c;
        float[] fArr2 = iVar.Z;
        if (fArr2 != null) {
            a11 = fArr2[1];
        } else {
            a11 = iVar.f13000y.f12978a.f13021g.a(iVar.h());
        }
        float b11 = b(eVar3, a11);
        e eVar4 = this.f1637m.f13018d;
        float[] fArr3 = iVar.Z;
        if (fArr3 != null) {
            a12 = fArr3[2];
        } else {
            a12 = iVar.f13000y.f12978a.f13022h.a(iVar.h());
        }
        return Math.max(max, Math.max(b11, b(eVar4, a12)));
    }

    public final LayerDrawable c() {
        if (this.f1639o == null) {
            this.f1641q = new i(this.f1637m);
            this.f1639o = new RippleDrawable(this.f1635k, null, this.f1641q);
        }
        if (this.f1640p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f1639o, this.f1629d, this.j});
            this.f1640p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f1640p;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.InsetDrawable, ba.b] */
    public final b d(Drawable drawable) {
        int i6;
        int i10;
        float f3;
        MaterialCardView materialCardView = this.f1626a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            boolean i11 = i();
            float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i11) {
                f3 = a();
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int ceil = (int) Math.ceil(maxCardElevation + f3);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f10 = a();
            }
            i6 = (int) Math.ceil(maxCardElevation2 + f10);
            i10 = ceil;
        } else {
            i6 = 0;
            i10 = 0;
        }
        return new InsetDrawable(drawable, i6, i10, i6, i10);
    }

    public final void e(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f3;
        if (this.f1640p != null) {
            MaterialCardView materialCardView = this.f1626a;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                boolean i19 = i();
                float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i19) {
                    f3 = a();
                } else {
                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                i11 = (int) Math.ceil((maxCardElevation + f3) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f10 = a();
                }
                i12 = (int) Math.ceil((maxCardElevation2 + f10) * 2.0f);
            } else {
                i11 = 0;
                i12 = 0;
            }
            int i20 = this.f1632g;
            if ((i20 & 8388613) == 8388613) {
                i13 = ((i6 - this.f1630e) - this.f1631f) - i12;
            } else {
                i13 = this.f1630e;
            }
            if ((i20 & 80) == 80) {
                i14 = this.f1630e;
            } else {
                i14 = ((i10 - this.f1630e) - this.f1631f) - i11;
            }
            int i21 = i14;
            if ((i20 & 8388613) == 8388613) {
                i15 = this.f1630e;
            } else {
                i15 = ((i6 - this.f1630e) - this.f1631f) - i12;
            }
            if ((i20 & 80) == 80) {
                i16 = ((i10 - this.f1630e) - this.f1631f) - i11;
            } else {
                i16 = this.f1630e;
            }
            int i22 = i16;
            if (materialCardView.getLayoutDirection() == 1) {
                i18 = i15;
                i17 = i13;
            } else {
                i17 = i15;
                i18 = i13;
            }
            this.f1640p.setLayerInset(2, i18, i22, i17, i21);
        }
    }

    public final void f(boolean z10, boolean z11) {
        float f3;
        int i6;
        Drawable drawable = this.j;
        if (drawable != null) {
            int i10 = 0;
            float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z11) {
                if (z10) {
                    f10 = 1.0f;
                }
                if (z10) {
                    f3 = 1.0f - this.f1647x;
                } else {
                    f3 = this.f1647x;
                }
                ValueAnimator valueAnimator = this.f1643t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f1643t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1647x, f10);
                this.f1643t = ofFloat;
                ofFloat.addUpdateListener(new w(this, 1));
                this.f1643t.setInterpolator(this.f1644u);
                ValueAnimator valueAnimator2 = this.f1643t;
                if (z10) {
                    i6 = this.f1645v;
                } else {
                    i6 = this.f1646w;
                }
                valueAnimator2.setDuration(i6 * f3);
                this.f1643t.start();
                return;
            }
            if (z10) {
                i10 = 255;
            }
            drawable.setAlpha(i10);
            if (z10) {
                f10 = 1.0f;
            }
            this.f1647x = f10;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = s1.c.A(drawable).mutate();
            this.j = mutate;
            mutate.setTintList(this.f1636l);
            f(this.f1626a.G, false);
        } else {
            this.j = f1625z;
        }
        LayerDrawable layerDrawable = this.f1640p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(m mVar) {
        this.f1637m = mVar;
        i iVar = this.f1628c;
        iVar.setShapeAppearanceModel(mVar);
        iVar.U = !iVar.n();
        i iVar2 = this.f1629d;
        if (iVar2 != null) {
            iVar2.setShapeAppearanceModel(mVar);
        }
        i iVar3 = this.f1641q;
        if (iVar3 != null) {
            iVar3.setShapeAppearanceModel(mVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f1626a;
        if (materialCardView.getPreventCornerOverlap() && this.f1628c.n() && materialCardView.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        View view = this.f1626a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable;
        Drawable drawable2 = this.f1634i;
        if (j()) {
            drawable = c();
        } else {
            drawable = this.f1629d;
        }
        this.f1634i = drawable;
        if (drawable2 != drawable) {
            int i6 = Build.VERSION.SDK_INT;
            MaterialCardView materialCardView = this.f1626a;
            if (i6 >= 23 && (materialCardView.getForeground() instanceof InsetDrawable)) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
            } else {
                materialCardView.setForeground(d(drawable));
            }
        }
    }

    public final void l() {
        float f3;
        MaterialCardView materialCardView = this.f1626a;
        boolean preventCornerOverlap = materialCardView.getPreventCornerOverlap();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if ((preventCornerOverlap && !this.f1628c.n()) || i()) {
            f3 = a();
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f10 = (float) ((1.0d - f1624y) * materialCardView.getCardViewRadius());
        }
        int i6 = (int) (f3 - f10);
        Rect rect = this.f1627b;
        materialCardView.f12718z.set(rect.left + i6, rect.top + i6, rect.right + i6, rect.bottom + i6);
        s8.l lVar = materialCardView.B;
        if (!((u.a) lVar.f12252z).getUseCompatPadding()) {
            lVar.y(0, 0, 0, 0);
            return;
        }
        u.b bVar = (u.b) ((Drawable) lVar.f12251y);
        float f11 = bVar.f12723e;
        float f12 = bVar.f12719a;
        int ceil = (int) Math.ceil(u.c.a(f11, f12, r1.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(u.c.b(f11, f12, r1.getPreventCornerOverlap()));
        lVar.y(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z10 = this.f1642r;
        MaterialCardView materialCardView = this.f1626a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.f1628c));
        }
        materialCardView.setForeground(d(this.f1634i));
    }
}
