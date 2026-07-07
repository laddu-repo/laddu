package p5;

import android.R;
import android.animation.PropertyValuesHolder;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.InflateException;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10514a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10515b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10516c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10517d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10518e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f10519f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f10520g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f10521h = {R.attr.ordering};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f10522i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f10523k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x039c, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03a7, code lost:
    
        if (r1 >= r3) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03a9, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03b7, code lost:
    
        if (r32 != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03b9, code lost:
    
        r31.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03bc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03bd, code lost:
    
        r31.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03c0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0398, code lost:
    
        if (r31 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x039a, code lost:
    
        if (r10 == null) goto L213;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0370 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0374  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i6, int i10, int i11, String str) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        f fVar;
        int i14;
        int i15;
        int i16;
        float f3;
        PropertyValuesHolder ofFloat;
        float f10;
        float f11;
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = peekValue.type;
        } else {
            i12 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = peekValue2.type;
        } else {
            i13 = 0;
        }
        if (i6 == 4) {
            if ((z10 && c(i12)) || (z11 && c(i13))) {
                i6 = 3;
            } else {
                i6 = 0;
            }
        }
        if (i6 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i6 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            l0.e[] e10 = a8.i.e(string);
            l0.e[] e11 = a8.i.e(string2);
            if (e10 != null || e11 != null) {
                if (e10 != null) {
                    ka.f fVar2 = new ka.f(1);
                    if (e11 != null) {
                        if (a8.i.a(e10, e11)) {
                            return PropertyValuesHolder.ofObject(str, fVar2, e10, e11);
                        }
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                    return PropertyValuesHolder.ofObject(str, fVar2, e10);
                }
                if (e11 != null) {
                    return PropertyValuesHolder.ofObject(str, new ka.f(1), e11);
                }
            }
            return null;
        }
        if (i6 == 3) {
            fVar = f.f10531a;
        } else {
            fVar = null;
        }
        if (z12) {
            if (z10) {
                if (i12 == 5) {
                    f10 = typedArray.getDimension(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    f10 = typedArray.getFloat(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (z11) {
                    if (i13 == 5) {
                        f11 = typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        f11 = typedArray.getFloat(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10, f11);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10);
                }
            } else {
                if (i13 == 5) {
                    f3 = typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    f3 = typedArray.getFloat(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f3);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i12 == 5) {
                i15 = (int) typedArray.getDimension(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else if (c(i12)) {
                i15 = typedArray.getColor(i10, 0);
            } else {
                i15 = typedArray.getInt(i10, 0);
            }
            if (z11) {
                if (i13 == 5) {
                    i16 = (int) typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else if (c(i13)) {
                    i16 = typedArray.getColor(i11, 0);
                } else {
                    i16 = typedArray.getInt(i11, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15, i16);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
            }
        } else if (z11) {
            if (i13 == 5) {
                i14 = (int) typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else if (c(i13)) {
                i14 = typedArray.getColor(i11, 0);
            } else {
                i14 = typedArray.getInt(i11, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i6) {
        if (i6 >= 28 && i6 <= 31) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.ValueAnimator d(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23, android.animation.ObjectAnimator r24, org.xmlpull.v1.XmlPullParser r25) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.a.d(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ObjectAnimator, org.xmlpull.v1.XmlPullParser):android.animation.ValueAnimator");
    }
}
