package o9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f10069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f10070c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f10071d = new d[10];

    public static x b(d dVar) {
        x xVar = new x();
        xVar.a(StateSet.WILD_CARD, dVar);
        return xVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i = this.f10068a;
        if (i == 0 || iArr.length == 0) {
            this.f10069b = dVar;
        }
        int[][] iArr2 = this.f10070c;
        if (i >= iArr2.length) {
            int i10 = i + 10;
            int[][] iArr3 = new int[i10][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f10070c = iArr3;
            d[] dVarArr = new d[i10];
            System.arraycopy(this.f10071d, 0, dVarArr, 0, i);
            this.f10071d = dVarArr;
        }
        int[][] iArr4 = this.f10070c;
        int i11 = this.f10068a;
        iArr4[i11] = iArr;
        this.f10071d[i11] = dVar;
        this.f10068a = i11 + 1;
    }

    public final d c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f10070c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = -1;
            if (i11 >= this.f10068a) {
                i11 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                break;
            }
            i11++;
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f10070c;
            while (true) {
                if (i10 >= this.f10068a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i10], iArr3)) {
                    i = i10;
                    break;
                }
                i10++;
            }
            i11 = i;
        }
        return i11 < 0 ? this.f10069b : this.f10071d[i11];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, p8.l.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, p8.l.ShapeAppearance, 0, 0);
                d dVarD = m.d(typedArrayObtainAttributes, p8.l.ShapeAppearance_cornerSize, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != p8.b.cornerSize) {
                        int i11 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i11;
                    }
                }
                a(StateSet.trimStateSet(iArr, i), dVarD);
            }
        }
    }
}
