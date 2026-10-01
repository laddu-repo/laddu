package v9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.c;
import p8.b;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f13243a = {R.attr.theme, g.a.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f13244b = {b.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i10) {
        return b(context, attributeSet, i, i10, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i10, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13244b, i, i10);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i11 = iArr2[0];
        boolean z2 = (context instanceof c) && ((c) context).f8366a == i11;
        if (i11 == 0 || z2) {
            return context;
        }
        c cVar = new c(context, i11);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i10);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr3[i12] = typedArrayObtainStyledAttributes2.getResourceId(i12, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr3[i13];
            if (i14 != 0) {
                cVar.getTheme().applyStyle(i14, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f13243a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            cVar.getTheme().applyStyle(resourceId, true);
        }
        return cVar;
    }
}
