package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import k8.c0;
import p2.c;
import t.b;
import t.d;
import u.a;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] A = {R.attr.colorBackground};
    public static final c0 B = new c0(28);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f698y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f699z;

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((a) ((Drawable) this.f699z.f10196w)).f12589h;
    }

    public float getCardElevation() {
        return ((CardView) this.f699z.f10197x).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f697x.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f697x.left;
    }

    public int getContentPaddingRight() {
        return this.f697x.right;
    }

    public int getContentPaddingTop() {
        return this.f697x.top;
    }

    public float getMaxCardElevation() {
        return ((a) ((Drawable) this.f699z.f10196w)).f12587e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f696w;
    }

    public float getRadius() {
        return ((a) ((Drawable) this.f699z.f10196w)).f12583a;
    }

    public boolean getUseCompatPadding() {
        return this.f695v;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        a aVar = (a) ((Drawable) this.f699z.f10196w);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f12589h = colorStateListValueOf;
        aVar.f12584b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f12589h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f699z.f10197x).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        B.y(this.f699z, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f696w) {
            this.f696w = z2;
            c cVar = this.f699z;
            B.y(cVar, ((a) ((Drawable) cVar.f10196w)).f12587e);
        }
    }

    public void setRadius(float f) {
        a aVar = (a) ((Drawable) this.f699z.f10196w);
        if (f == aVar.f12583a) {
            return;
        }
        aVar.f12583a = f;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f695v != z2) {
            this.f695v = z2;
            c cVar = this.f699z;
            B.y(cVar, ((a) ((Drawable) cVar.f10196w)).f12587e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, t.a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f697x = rect;
        this.f698y = new Rect();
        c cVar = new c(this);
        this.f699z = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.CardView, i, t.c.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(d.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(d.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(A);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(b.cardview_light_background);
            } else {
                color = getResources().getColor(b.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardMaxElevation, 0.0f);
        this.f695v = typedArrayObtainStyledAttributes.getBoolean(d.CardView_cardUseCompatPadding, false);
        this.f696w = typedArrayObtainStyledAttributes.getBoolean(d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        a aVar = new a(colorStateListValueOf, dimension);
        cVar.f10196w = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        B.y(cVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        a aVar = (a) ((Drawable) this.f699z.f10196w);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f12589h = colorStateList;
        aVar.f12584b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f12589h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i10, int i11, int i12) {
    }
}
