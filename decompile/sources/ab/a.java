package ab;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f674a = {R.attr.theme, com.playfy.tv.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f675b = {com.playfy.tv.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i6, int i10) {
        return b(context, attributeSet, i6, i10, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i6, int i10, int[] iArr) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f675b, i6, i10);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i11 = iArr2[0];
        if ((context instanceof c) && ((c) context).f8893a == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 != 0 && !z10) {
            c cVar = new c(context, i11);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i6, i10);
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    iArr3[i12] = obtainStyledAttributes2.getResourceId(i12, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr3[i13];
                if (i14 != 0) {
                    cVar.getTheme().applyStyle(i14, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f674a);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                cVar.getTheme().applyStyle(resourceId, true);
            }
            return cVar;
        }
        return context;
    }
}
