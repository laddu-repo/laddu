package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import k4.a;
import k4.a0;
import k4.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x, reason: collision with root package name */
    public final b f1070x;

    /* renamed from: y, reason: collision with root package name */
    public float f1071y;

    /* renamed from: z, reason: collision with root package name */
    public int f1072z;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1072z = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a0.f7593a, 0, 0);
            try {
                this.f1072z = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f1070x = new b(this);
    }

    public int getResizeMode() {
        return this.f1072z;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        float f3;
        float f10;
        super.onMeasure(i6, i10);
        if (this.f1071y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f1071y / (f11 / f12)) - 1.0f;
            float abs = Math.abs(f13);
            b bVar = this.f1070x;
            if (abs <= 0.01f) {
                if (!bVar.f7598y) {
                    bVar.f7598y = true;
                    ((AspectRatioFrameLayout) bVar.f7599z).post(bVar);
                    return;
                }
                return;
            }
            int i11 = this.f1072z;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 4) {
                            if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f3 = this.f1071y;
                            } else {
                                f10 = this.f1071y;
                            }
                        }
                    } else {
                        f3 = this.f1071y;
                    }
                    measuredWidth = (int) (f12 * f3);
                } else {
                    f10 = this.f1071y;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f10 = this.f1071y;
                measuredHeight = (int) (f11 / f10);
            } else {
                f3 = this.f1071y;
                measuredWidth = (int) (f12 * f3);
            }
            if (!bVar.f7598y) {
                bVar.f7598y = true;
                ((AspectRatioFrameLayout) bVar.f7599z).post(bVar);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f3) {
        if (this.f1071y != f3) {
            this.f1071y = f3;
            requestLayout();
        }
    }

    public void setResizeMode(int i6) {
        if (this.f1072z != i6) {
            this.f1072z = i6;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
