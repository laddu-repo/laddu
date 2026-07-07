package u;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import o5.e0;
import s8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a extends FrameLayout {
    public static final int[] C = {R.attr.colorBackground};
    public static final e0 D = new Object();
    public final Rect A;
    public final l B;

    /* renamed from: x */
    public boolean f12716x;

    /* renamed from: y */
    public boolean f12717y;

    /* renamed from: z */
    public final Rect f12718z;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playfy.tv.R.attr.materialCardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f12718z = rect;
        this.A = new Rect();
        l lVar = new l(this, 6);
        this.B = lVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.a.f12312a, com.playfy.tv.R.attr.materialCardViewStyle, com.playfy.tv.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(C);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.playfy.tv.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.playfy.tv.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = obtainStyledAttributes.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = obtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f12716x = obtainStyledAttributes.getBoolean(7, false);
        this.f12717y = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = new b(valueOf, dimension);
        lVar.f12251y = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        D.l(lVar, dimension3);
    }

    public static /* synthetic */ void a(a aVar, int i6, int i10, int i11, int i12) {
        super.setPadding(i6, i10, i11, i12);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.B.f12251y)).f12726h;
    }

    public float getCardElevation() {
        return ((a) this.B.f12252z).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f12718z.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f12718z.left;
    }

    public int getContentPaddingRight() {
        return this.f12718z.right;
    }

    public int getContentPaddingTop() {
        return this.f12718z.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.B.f12251y)).f12723e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f12717y;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.B.f12251y)).f12719a;
    }

    public boolean getUseCompatPadding() {
        return this.f12716x;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
    }

    public void setCardBackgroundColor(int i6) {
        ColorStateList valueOf = ColorStateList.valueOf(i6);
        b bVar = (b) ((Drawable) this.B.f12251y);
        if (valueOf == null) {
            bVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        bVar.f12726h = valueOf;
        bVar.f12720b.setColor(valueOf.getColorForState(bVar.getState(), bVar.f12726h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f3) {
        ((a) this.B.f12252z).setElevation(f3);
    }

    public void setMaxCardElevation(float f3) {
        D.l(this.B, f3);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i6) {
        super.setMinimumHeight(i6);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i6) {
        super.setMinimumWidth(i6);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f12717y) {
            this.f12717y = z10;
            l lVar = this.B;
            D.l(lVar, ((b) ((Drawable) lVar.f12251y)).f12723e);
        }
    }

    public void setRadius(float f3) {
        b bVar = (b) ((Drawable) this.B.f12251y);
        if (f3 == bVar.f12719a) {
            return;
        }
        bVar.f12719a = f3;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f12716x != z10) {
            this.f12716x = z10;
            l lVar = this.B;
            D.l(lVar, ((b) ((Drawable) lVar.f12251y)).f12723e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.B.f12251y);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.f12726h = colorStateList;
        bVar.f12720b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.f12726h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i6, int i10, int i11, int i12) {
    }
}
