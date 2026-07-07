package d0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c extends View {
    public a0.i A;
    public String B;
    public String C;
    public HashMap D;

    /* renamed from: x, reason: collision with root package name */
    public int[] f3496x;

    /* renamed from: y, reason: collision with root package name */
    public int f3497y;

    /* renamed from: z, reason: collision with root package name */
    public Context f3498z;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f3498z
            if (r6 == 0) goto L9e
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto L9e
        Lc:
            if (r0 != 0) goto L10
            goto L9e
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L24
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L25
        L24:
            r1 = r2
        L25:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L50
            if (r1 == 0) goto L50
            boolean r3 = r4.a.w(r6)
            if (r3 == 0) goto L44
            java.util.HashMap r3 = r1.J
            if (r3 == 0) goto L44
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L44
            java.util.HashMap r3 = r1.J
            java.lang.Object r3 = r3.get(r6)
            goto L45
        L44:
            r3 = r2
        L45:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L50
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 != 0) goto L59
            if (r1 == 0) goto L59
            int r3 = r5.f(r1, r6)
        L59:
            if (r3 != 0) goto L67
            java.lang.Class<d0.r> r1 = d0.r.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L66
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L66
            goto L67
        L66:
        L67:
            if (r3 != 0) goto L77
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L77:
            if (r3 == 0) goto L86
            java.util.HashMap r0 = r5.D
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto L9e
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.c.a(java.lang.String):void");
    }

    public final void b(int i6) {
        if (i6 == getId()) {
            return;
        }
        int i10 = this.f3497y + 1;
        int[] iArr = this.f3496x;
        if (i10 > iArr.length) {
            this.f3496x = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3496x;
        int i11 = this.f3497y;
        iArr2[i11] = i6;
        this.f3497y = i11 + 1;
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.f3498z != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = constraintLayout.getChildAt(i6);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i6 = 0; i6 < this.f3497y; i6++) {
            View view = (View) constraintLayout.f843x.get(this.f3496x[i6]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f3498z.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = constraintLayout.getChildAt(i6);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f3645b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.B = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.C = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3496x, this.f3497y);
    }

    public abstract void h(a0.d dVar, boolean z10);

    public final void i() {
        if (this.A != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof e) {
                ((e) layoutParams).f3529p0 = this.A;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.B;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.C;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.B = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f3497y = 0;
        while (true) {
            int indexOf = str.indexOf(44, i6);
            if (indexOf == -1) {
                a(str.substring(i6));
                return;
            } else {
                a(str.substring(i6, indexOf));
                i6 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.C = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f3497y = 0;
        while (true) {
            int indexOf = str.indexOf(44, i6);
            if (indexOf == -1) {
                c(str.substring(i6));
                return;
            } else {
                c(str.substring(i6, indexOf));
                i6 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.B = null;
        this.f3497y = 0;
        for (int i6 : iArr) {
            b(i6);
        }
    }

    @Override // android.view.View
    public final void setTag(int i6, Object obj) {
        super.setTag(i6, obj);
        if (obj == null && this.B == null) {
            b(i6);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
