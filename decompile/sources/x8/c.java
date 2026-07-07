package x8;

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
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import o9.e;
import o9.i;
import o9.k;
import o9.l;
import o9.m;
import p8.f;
import t.d;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double f14264y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f14265z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f14266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f14267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f14268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f14269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14270e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14272h;
    public Drawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f14273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f14274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f14275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f14276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f14277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f14278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f14279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f14280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f14283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f14284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f14287x;

    static {
        f14265z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        int i10 = MaterialCardView.J;
        this.f14267b = new Rect();
        this.f14281r = false;
        this.f14287x = 0.0f;
        this.f14266a = materialCardView;
        i iVar = new i(materialCardView.getContext(), attributeSet, i, i10);
        this.f14268c = iVar;
        iVar.m(materialCardView.getContext());
        iVar.s();
        l lVarG = iVar.f10018w.f10000a.g();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, d.CardView, i, t.c.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(d.CardView_cardCornerRadius)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardCornerRadius, 0.0f);
            lVarG.f10027e = new o9.a(dimension);
            lVarG.f = new o9.a(dimension);
            lVarG.f10028g = new o9.a(dimension);
            lVarG.f10029h = new o9.a(dimension);
        }
        this.f14269d = new i();
        h(lVarG.a());
        this.f14284u = u1.c.E(materialCardView.getContext(), p8.b.motionEasingLinearInterpolator, q8.a.f10944a);
        this.f14285v = u1.c.D(materialCardView.getContext(), p8.b.motionDurationShort2, 300);
        this.f14286w = u1.c.D(materialCardView.getContext(), p8.b.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(com.bumptech.glide.c cVar, float f) {
        if (cVar instanceof k) {
            return (float) ((1.0d - f14264y) * ((double) f));
        }
        if (cVar instanceof e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        com.bumptech.glide.c cVar = this.f14276m.f10034a;
        i iVar = this.f14268c;
        float fB = b(cVar, iVar.k());
        com.bumptech.glide.c cVar2 = this.f14276m.f10035b;
        float[] fArr = iVar.W;
        float fMax = Math.max(fB, b(cVar2, fArr != null ? fArr[0] : iVar.f10018w.f10000a.f.a(iVar.h())));
        com.bumptech.glide.c cVar3 = this.f14276m.f10036c;
        float[] fArr2 = iVar.W;
        float fB2 = b(cVar3, fArr2 != null ? fArr2[1] : iVar.f10018w.f10000a.f10039g.a(iVar.h()));
        com.bumptech.glide.c cVar4 = this.f14276m.f10037d;
        float[] fArr3 = iVar.W;
        return Math.max(fMax, Math.max(fB2, b(cVar4, fArr3 != null ? fArr3[2] : iVar.f10018w.f10000a.f10040h.a(iVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f14278o == null) {
            this.f14280q = new i(this.f14276m);
            this.f14278o = new RippleDrawable(this.f14274k, null, this.f14280q);
        }
        if (this.f14279p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f14278o, this.f14269d, this.f14273j});
            this.f14279p = layerDrawable;
            layerDrawable.setId(2, f.mtrl_card_checked_layer_id);
        }
        return this.f14279p;
    }

    public final b d(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f14266a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new b(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i10) {
        int iCeil;
        int iCeil2;
        int i11;
        int i12;
        if (this.f14279p != null) {
            MaterialCardView materialCardView = this.f14266a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i13 = this.f14271g;
            int i14 = (i13 & 8388613) == 8388613 ? ((i - this.f14270e) - this.f) - iCeil2 : this.f14270e;
            int i15 = (i13 & 80) == 80 ? this.f14270e : ((i10 - this.f14270e) - this.f) - iCeil;
            int i16 = (i13 & 8388613) == 8388613 ? this.f14270e : ((i - this.f14270e) - this.f) - iCeil2;
            int i17 = (i13 & 80) == 80 ? ((i10 - this.f14270e) - this.f) - iCeil : this.f14270e;
            if (materialCardView.getLayoutDirection() == 1) {
                i12 = i16;
                i11 = i14;
            } else {
                i11 = i16;
                i12 = i14;
            }
            this.f14279p.setLayerInset(2, i12, i17, i11, i15);
        }
    }

    public final void f(boolean z2, boolean z10) {
        Drawable drawable = this.f14273j;
        if (drawable != null) {
            if (!z10) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.f14287x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f4 = z2 ? 1.0f - this.f14287x : this.f14287x;
            ValueAnimator valueAnimator = this.f14283t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f14283t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f14287x, f);
            this.f14283t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g4.d(3, this));
            this.f14283t.setInterpolator(this.f14284u);
            this.f14283t.setDuration((long) ((z2 ? this.f14285v : this.f14286w) * f4));
            this.f14283t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f14273j = drawableMutate;
            drawableMutate.setTintList(this.f14275l);
            f(this.f14266a.E, false);
        } else {
            this.f14273j = f14265z;
        }
        LayerDrawable layerDrawable = this.f14279p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.mtrl_card_checked_layer_id, this.f14273j);
        }
    }

    public final void h(m mVar) {
        this.f14276m = mVar;
        i iVar = this.f14268c;
        iVar.setShapeAppearanceModel(mVar);
        iVar.R = !iVar.n();
        i iVar2 = this.f14269d;
        if (iVar2 != null) {
            iVar2.setShapeAppearanceModel(mVar);
        }
        i iVar3 = this.f14280q;
        if (iVar3 != null) {
            iVar3.setShapeAppearanceModel(mVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f14266a;
        return materialCardView.getPreventCornerOverlap() && this.f14268c.n() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f14266a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable drawableC = j() ? c() : this.f14269d;
        this.i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f14266a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f14266a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.f14268c.n()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f14264y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.f14267b;
        materialCardView.f697x.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        p2.c cVar = materialCardView.f699z;
        if (!((CardView) cVar.f10197x).getUseCompatPadding()) {
            cVar.p(0, 0, 0, 0);
            return;
        }
        u.a aVar = (u.a) ((Drawable) cVar.f10196w);
        float f = aVar.f12587e;
        float f4 = aVar.f12583a;
        int iCeil = (int) Math.ceil(u.b.a(f, f4, r1.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(u.b.b(f, f4, r1.getPreventCornerOverlap()));
        cVar.p(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z2 = this.f14281r;
        MaterialCardView materialCardView = this.f14266a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.f14268c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
