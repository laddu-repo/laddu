package k0;

import a2.o0;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f7544a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f7545b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f7546c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f7547d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7548e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f7549f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f7550g;

    public static b2.k b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i6) {
        b2.k kVar;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i6, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new b2.k((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                kVar = b2.k.f(typedArray.getResources(), typedArray.getResourceId(i6, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                kVar = null;
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return new b2.k((Shader) null, (ColorStateList) null, 0);
    }

    public static String c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i6) {
        if (!d(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i6);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int e(float f3) {
        float f10;
        boolean z10;
        float f11;
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f12 = (f3 + 16.0f) / 116.0f;
        if (f3 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f3 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z10) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f7546c;
        return l0.b.a(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float f(int i6) {
        float pow;
        float f3 = i6 / 255.0f;
        if (f3 <= 0.04045f) {
            pow = f3 / 12.92f;
        } else {
            pow = (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k0.d j(android.content.res.XmlResourceParser r24, android.content.res.Resources r25) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.j(android.content.res.XmlResourceParser, android.content.res.Resources):k0.d");
    }

    public static List k(Resources resources, int i6) {
        if (i6 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i6);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void l(Resources.Theme theme) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            k.a(theme);
            return;
        }
        if (i6 >= 23) {
            synchronized (f7548e) {
                if (!f7550g) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        f7549f = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e10) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                    }
                    f7550g = true;
                }
                Method method = f7549f;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                        f7549f = null;
                    }
                }
            }
        }
    }

    public static void m(XmlPullParser xmlPullParser) {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i6--;
                }
            } else {
                i6++;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i6) {
        new Handler(Looper.getMainLooper()).post(new o0(i6, 2, this));
    }

    public abstract void h(int i6);

    public abstract void i(Typeface typeface);
}
