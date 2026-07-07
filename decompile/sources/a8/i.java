package a8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.widget.CompoundButton;
import cf.m;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import kf.n;
import kf.y0;
import kotlin.jvm.internal.x;
import ve.p;
import x4.p0;
import x4.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static Field f625a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f626b;

    public static boolean a(l0.e[] eVarArr, l0.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < eVarArr.length; i6++) {
            l0.e eVar = eVarArr[i6];
            char c10 = eVar.f8067a;
            l0.e eVar2 = eVarArr2[i6];
            if (c10 != eVar2.f8067a || eVar.f8068b.length != eVar2.f8068b.length) {
                return false;
            }
        }
        return true;
    }

    public static byte b(long j) {
        boolean z10;
        if ((j >> 8) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jb.b.c(j, "out of range: %s", z10);
        return (byte) j;
    }

    public static float[] c(float[] fArr, int i6) {
        if (i6 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i6, length);
                float[] fArr2 = new float[i6];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static final n9.j d(w wVar, String[] strArr, ve.l lVar) {
        x4.i j = wVar.j();
        String[] tables = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.k.e(tables, "tables");
        p0 p0Var = j.f14579b;
        he.i g10 = p0Var.g(tables);
        String[] resolvedTableNames = (String[]) g10.f6076x;
        int[] tableIds = (int[]) g10.f6077y;
        kotlin.jvm.internal.k.e(resolvedTableNames, "resolvedTableNames");
        kotlin.jvm.internal.k.e(tableIds, "tableIds");
        return new n9.j(y0.g(new lc.c((p) new n(p0Var, tableIds, resolvedTableNames, (le.c) null)), -1), wVar, lVar, 22);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:35:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:35:0x0098, B:39:0x009e, B:44:0x00b3, B:56:0x00b6), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l0.e[] e(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.i.e(java.lang.String):l0.e[]");
    }

    public static Path f(String str) {
        Path path = new Path();
        try {
            l0.e.b(e(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static l0.e[] g(l0.e[] eVarArr) {
        l0.e[] eVarArr2 = new l0.e[eVarArr.length];
        for (int i6 = 0; i6 < eVarArr.length; i6++) {
            eVarArr2[i6] = new l0.e(eVarArr[i6]);
        }
        return eVarArr2;
    }

    public static Drawable h(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return j4.n.b(compoundButton);
        }
        if (!f626b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f625a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f626b = true;
        }
        Field field = f625a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e11) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                f625a = null;
            }
        }
        return null;
    }

    public static ColorStateList i(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        ColorStateList d10;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (d10 = i0.f.d(context, resourceId)) != null) {
            return d10;
        }
        return typedArray.getColorStateList(i6);
    }

    public static ColorStateList j(Context context, n9.j jVar, int i6) {
        int resourceId;
        ColorStateList d10;
        TypedArray typedArray = (TypedArray) jVar.f9356z;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (d10 = i0.f.d(context, resourceId)) != null) {
            return d10;
        }
        return jVar.t(i6);
    }

    public static int k(Context context, TypedArray typedArray, int i6, int i10) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i6, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i10);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i6, i10);
    }

    public static Drawable l(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        Drawable f3;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (f3 = c9.a.f(context, resourceId)) != null) {
            return f3;
        }
        return typedArray.getDrawable(i6);
    }

    public static final int m(String key, Bundle bundle) {
        kotlin.jvm.internal.k.e(key, "key");
        int i6 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i6 == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            android.support.v4.media.session.b.m(key);
            throw null;
        }
        return i6;
    }

    public static final ArrayList n(String key, Bundle bundle) {
        ArrayList parcelableArrayList;
        kotlin.jvm.internal.k.e(key, "key");
        Class r10 = m.r(x.a(Bundle.class));
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayList = d.k.c(bundle, key, r10);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList(key);
        }
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        android.support.v4.media.session.b.m(key);
        throw null;
    }

    public static boolean o(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final boolean p(String key, Bundle bundle) {
        kotlin.jvm.internal.k.e(key, "key");
        if (bundle.containsKey(key) && bundle.get(key) == null) {
            return true;
        }
        return false;
    }

    public static float q(float f3, float f10, float f11) {
        return (f11 * f10) + ((1.0f - f11) * f3);
    }

    public static void r(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
    }

    public static final je.f s(Bundle bundle) {
        je.f fVar = new je.f(bundle.size());
        for (String str : bundle.keySet()) {
            kotlin.jvm.internal.k.b(str);
            fVar.put(str, bundle.get(str));
        }
        return fVar.b();
    }

    public static int t(int i6) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 != 0) {
                if (i12 == i6) {
                    return i11;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
