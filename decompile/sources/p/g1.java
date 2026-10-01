package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f10249l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f10250m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f10251a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10252b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f10253c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f10254d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f10255e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10256f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f10257g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f10258h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10259i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final f1 f10260k;

    public g1(TextView textView) {
        this.f10259i = textView;
        this.j = textView.getContext();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f10260k = new e1();
        } else if (i6 >= 23) {
            this.f10260k = new d1();
        } else {
            this.f10260k = new f1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr) {
                if (i6 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i6)) < 0) {
                    arrayList.add(Integer.valueOf(i6));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f10250m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
                return method;
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (f()) {
            if (this.f10252b) {
                if (this.f10259i.getMeasuredHeight() > 0 && this.f10259i.getMeasuredWidth() > 0) {
                    if (this.f10260k.b(this.f10259i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f10259i.getMeasuredWidth() - this.f10259i.getTotalPaddingLeft()) - this.f10259i.getTotalPaddingRight();
                    }
                    int height = (this.f10259i.getHeight() - this.f10259i.getCompoundPaddingBottom()) - this.f10259i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f10249l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c10 = c(rectF);
                                if (c10 != this.f10259i.getTextSize()) {
                                    g(0, c10);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f10252b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        int i6;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f10256f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f10256f[i13];
                TextView textView = this.f10259i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f10258h;
                if (textPaint == null) {
                    this.f10258h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f10258h.set(textView.getPaint());
                this.f10258h.setTextSize(i14);
                Layout.Alignment alignment = (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
                int round = Math.round(rectF.right);
                int i15 = Build.VERSION.SDK_INT;
                TextView textView2 = this.f10259i;
                if (i15 >= 23) {
                    staticLayout = c1.a(charSequence, alignment, round, maxLines, textView2, this.f10258h, this.f10260k);
                    i6 = maxLines;
                    charSequence2 = charSequence;
                } else {
                    i6 = maxLines;
                    charSequence2 = charSequence;
                    staticLayout = new StaticLayout(charSequence2, this.f10258h, round, alignment, textView2.getLineSpacingMultiplier(), textView2.getLineSpacingExtra(), textView2.getIncludeFontPadding());
                }
                if ((i6 != -1 && (staticLayout.getLineCount() > i6 || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != charSequence2.length())) || staticLayout.getHeight() > rectF.bottom) {
                    i12 = i13 - 1;
                    i10 = i12;
                } else {
                    int i16 = i13 + 1;
                    i12 = i11;
                    i11 = i16;
                }
            }
            return this.f10256f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f10251a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i6, float f3) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i6, f3, resources.getDisplayMetrics());
        TextView textView = this.f10259i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f10252b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f10251a == 1) {
            if (!this.f10257g || this.f10256f.length == 0) {
                int floor = ((int) Math.floor((this.f10255e - this.f10254d) / this.f10253c)) + 1;
                int[] iArr = new int[floor];
                for (int i6 = 0; i6 < floor; i6++) {
                    iArr[i6] = Math.round((i6 * this.f10253c) + this.f10254d);
                }
                this.f10256f = b(iArr);
            }
            this.f10252b = true;
        } else {
            this.f10252b = false;
        }
        return this.f10252b;
    }

    public final boolean i() {
        boolean z10;
        if (this.f10256f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10257g = z10;
        if (z10) {
            this.f10251a = 1;
            this.f10254d = r0[0];
            this.f10255e = r0[r1 - 1];
            this.f10253c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f10259i instanceof v);
    }

    public final void k(float f3, float f10, float f11) {
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f10 > f3) {
                if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f10251a = 1;
                    this.f10254d = f3;
                    this.f10255e = f10;
                    this.f10253c = f11;
                    this.f10257g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
    }
}
