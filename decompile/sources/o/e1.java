package o;

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
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f9138l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f9139m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9140a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9141b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9142c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9143d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9144e = -1.0f;
    public int[] f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9145g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f9146h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f9147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b1 f9148k;

    public e1(TextView textView) {
        this.i = textView;
        this.f9147j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9148k = new c1();
        } else {
            this.f9148k = new b1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
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
            ConcurrentHashMap concurrentHashMap = f9139m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f9141b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f9148k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f9138l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f9141b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i) {
            int i12 = (i11 + i) / 2;
            int i13 = this.f[i12];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f9146h;
            if (textPaint == null) {
                this.f9146h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f9146h.set(textView.getPaint());
            this.f9146h.setTextSize(i13);
            StaticLayout staticLayoutA = a1.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.i, this.f9146h, this.f9148k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i = i10;
            }
        }
        return this.f[i10];
    }

    public final boolean f() {
        return j() && this.f9140a != 0;
    }

    public final void g(int i, float f) {
        Context context = this.f9147j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f9141b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f9140a == 1) {
            if (!this.f9145g || this.f.length == 0) {
                int iFloor = ((int) Math.floor((this.f9144e - this.f9143d) / this.f9142c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f9142c) + this.f9143d);
                }
                this.f = b(iArr);
            }
            this.f9141b = true;
        } else {
            this.f9141b = false;
        }
        return this.f9141b;
    }

    public final boolean i() {
        boolean z2 = this.f.length > 0;
        this.f9145g = z2;
        if (z2) {
            this.f9140a = 1;
            this.f9143d = r0[0];
            this.f9144e = r0[r1 - 1];
            this.f9142c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.i instanceof AppCompatEditText);
    }

    public final void k(float f, float f4, float f10) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f4 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f9140a = 1;
        this.f9143d = f;
        this.f9144e = f4;
        this.f9142c = f10;
        this.f9145g = false;
    }
}
