package ua;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f13045a;

    /* renamed from: b, reason: collision with root package name */
    public d f13046b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f13047c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    public d[] f13048d = new d[10];

    public static w b(d dVar) {
        w wVar = new w();
        wVar.a(StateSet.WILD_CARD, dVar);
        return wVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i6 = this.f13045a;
        if (i6 == 0 || iArr.length == 0) {
            this.f13046b = dVar;
        }
        int[][] iArr2 = this.f13047c;
        if (i6 >= iArr2.length) {
            int i10 = i6 + 10;
            int[][] iArr3 = new int[i10];
            System.arraycopy(iArr2, 0, iArr3, 0, i6);
            this.f13047c = iArr3;
            d[] dVarArr = new d[i10];
            System.arraycopy(this.f13048d, 0, dVarArr, 0, i6);
            this.f13048d = dVarArr;
        }
        int[][] iArr4 = this.f13047c;
        int i11 = this.f13045a;
        iArr4[i11] = iArr;
        this.f13048d[i11] = dVar;
        this.f13045a = i11 + 1;
    }

    public final d c(int[] iArr) {
        int i6;
        int[][] iArr2 = this.f13047c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = -1;
            if (i11 < this.f13045a) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f13047c;
            while (true) {
                if (i10 >= this.f13045a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i10], iArr3)) {
                    i6 = i10;
                    break;
                }
                i10++;
            }
            i11 = i6;
        }
        if (i11 < 0) {
            return this.f13046b;
        }
        return this.f13048d[i11];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = t9.a.J;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        d d10 = m.d(obtainStyledAttributes, 5, new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i6 = 0;
                        for (int i10 = 0; i10 < attributeCount; i10++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i11 = i6 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i6] = attributeNameResource;
                                i6 = i11;
                            }
                        }
                        a(StateSet.trimStateSet(iArr2, i6), d10);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
