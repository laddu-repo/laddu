package o9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f10033m = new j(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.bumptech.glide.c f10034a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.c f10035b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.c f10036c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.c f10037d = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f10038e = new a(0.0f);
    public d f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f10039g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f10040h = new a(0.0f);
    public f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f10041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f10042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f10043l;

    public m() {
        int i = 0;
        this.i = new f(i);
        this.f10041j = new f(i);
        this.f10042k = new f(i);
        this.f10043l = new f(i);
    }

    public static l a(Context context, int i, int i10) {
        return b(context, i, i10, new a(0));
    }

    public static l b(Context context, int i, int i10, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i10 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i10, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(p8.l.ShapeAppearance);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(p8.l.ShapeAppearance_cornerFamily, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(p8.l.ShapeAppearance_cornerFamilyTopLeft, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(p8.l.ShapeAppearance_cornerFamilyTopRight, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(p8.l.ShapeAppearance_cornerFamilyBottomRight, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(p8.l.ShapeAppearance_cornerFamilyBottomLeft, i11);
            d dVarD = d(typedArrayObtainStyledAttributes, p8.l.ShapeAppearance_cornerSize, dVar);
            d dVarD2 = d(typedArrayObtainStyledAttributes, p8.l.ShapeAppearance_cornerSizeTopLeft, dVarD);
            d dVarD3 = d(typedArrayObtainStyledAttributes, p8.l.ShapeAppearance_cornerSizeTopRight, dVarD);
            d dVarD4 = d(typedArrayObtainStyledAttributes, p8.l.ShapeAppearance_cornerSizeBottomRight, dVarD);
            d dVarD5 = d(typedArrayObtainStyledAttributes, p8.l.ShapeAppearance_cornerSizeBottomLeft, dVarD);
            l lVar = new l();
            lVar.f10023a = com.bumptech.glide.d.g(i12);
            lVar.f10027e = dVarD2;
            lVar.f10024b = com.bumptech.glide.d.g(i13);
            lVar.f = dVarD3;
            lVar.f10025c = com.bumptech.glide.d.g(i14);
            lVar.f10028g = dVarD4;
            lVar.f10026d = com.bumptech.glide.d.g(i15);
            lVar.f10029h = dVarD5;
            return lVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static l c(Context context, AttributeSet attributeSet, int i, int i10) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p8.l.MaterialShape, i, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p8.l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(p8.l.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        return (this.f10035b instanceof k) && (this.f10034a instanceof k) && (this.f10036c instanceof k) && (this.f10037d instanceof k);
    }

    public final boolean f(RectF rectF) {
        boolean z2 = this.f10043l.getClass().equals(f.class) && this.f10041j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.f10042k.getClass().equals(f.class);
        float fA = this.f10038e.a(rectF);
        return z2 && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f10040h.a(rectF) > fA ? 1 : (this.f10040h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f10039g.a(rectF) > fA ? 1 : (this.f10039g.a(rectF) == fA ? 0 : -1)) == 0) && e();
    }

    public final l g() {
        l lVar = new l();
        lVar.f10023a = this.f10034a;
        lVar.f10024b = this.f10035b;
        lVar.f10025c = this.f10036c;
        lVar.f10026d = this.f10037d;
        lVar.f10027e = this.f10038e;
        lVar.f = this.f;
        lVar.f10028g = this.f10039g;
        lVar.f10029h = this.f10040h;
        lVar.i = this.i;
        lVar.f10030j = this.f10041j;
        lVar.f10031k = this.f10042k;
        lVar.f10032l = this.f10043l;
        return lVar;
    }

    public final String toString() {
        return "[" + this.f10038e + ", " + this.f + ", " + this.f10039g + ", " + this.f10040h + "]";
    }
}
