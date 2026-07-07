package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.playfy.tv.R;
import java.util.WeakHashMap;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: x, reason: collision with root package name */
    public boolean f763x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f764y;

    /* renamed from: z, reason: collision with root package name */
    public int f765z;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f765z = -1;
        int[] iArr = h.a.f5741k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        q0.q(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f763x = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f763x);
        }
    }

    private void setStacked(boolean z10) {
        int i6;
        int i10;
        if (this.f764y != z10) {
            if (!z10 || this.f763x) {
                this.f764y = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i6 = 8388613;
                } else {
                    i6 = 80;
                }
                setGravity(i6);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i10 = 8;
                    } else {
                        i10 = 4;
                    }
                    findViewById.setVisibility(i10);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i6);
        int i13 = 0;
        if (this.f763x) {
            if (size > this.f765z && this.f764y) {
                setStacked(false);
            }
            this.f765z = size;
        }
        if (!this.f764y && View.MeasureSpec.getMode(i6) == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            i11 = i6;
            z10 = false;
        }
        super.onMeasure(i11, i10);
        if (this.f763x && !this.f764y && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i6, i10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (i14 < childCount) {
                if (getChildAt(i14).getVisibility() == 0) {
                    break;
                } else {
                    i14++;
                }
            } else {
                i14 = -1;
                break;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f764y) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i15).getVisibility() == 0) {
                        i12 = i15;
                        break;
                    }
                    i15++;
                }
                if (i12 >= 0) {
                    i13 = getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i13 = measuredHeight;
                }
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = q0.f12397a;
        if (getMinimumHeight() != i13) {
            setMinimumHeight(i13);
            if (i10 == 0) {
                super.onMeasure(i6, i10);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f763x != z10) {
            this.f763x = z10;
            if (!z10 && this.f764y) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
