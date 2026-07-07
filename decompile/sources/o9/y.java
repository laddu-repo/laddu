package o9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f10073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[][] f10074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m[] f10075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f10076e;
    public final x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f10077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f10078h;

    public y(ef.r rVar) {
        this.f10072a = rVar.f5029b;
        this.f10073b = (m) rVar.f5030c;
        this.f10074c = (int[][]) rVar.f5031d;
        this.f10075d = (m[]) rVar.f5032e;
        this.f10076e = (x) rVar.f;
        this.f = (x) rVar.f5033g;
        this.f10077g = (x) rVar.f5034h;
        this.f10078h = (x) rVar.i;
    }

    public static void a(ef.r rVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, p8.l.MaterialShape) : theme.obtainStyledAttributes(attributeSet, p8.l.MaterialShape, 0, 0);
                m mVarA = m.a(context, typedArrayObtainAttributes.getResourceId(p8.l.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(p8.l.MaterialShape_shapeAppearanceOverlay, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != p8.b.shapeAppearance && attributeNameResource != p8.b.shapeAppearanceOverlay) {
                        int i11 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i11;
                    }
                }
                rVar.a(StateSet.trimStateSet(iArr, i), mVarA);
            }
        }
    }

    public static y b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ef.r rVar = new ef.r(1);
        rVar.d();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            rVar.d();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                a(rVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            if (rVar.f5029b == 0) {
                return null;
            }
            return new y(rVar);
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final m c() {
        m mVar = this.f10073b;
        x xVar = this.f10078h;
        x xVar2 = this.f10077g;
        x xVar3 = this.f;
        x xVar4 = this.f10076e;
        if (xVar4 == null && xVar3 == null && xVar2 == null && xVar == null) {
            return mVar;
        }
        l lVarG = mVar.g();
        if (xVar4 != null) {
            lVarG.f10027e = xVar4.f10069b;
        }
        if (xVar3 != null) {
            lVarG.f = xVar3.f10069b;
        }
        if (xVar2 != null) {
            lVarG.f10029h = xVar2.f10069b;
        }
        if (xVar != null) {
            lVarG.f10028g = xVar.f10069b;
        }
        return lVarG.a();
    }

    public final boolean d() {
        x xVar;
        x xVar2;
        x xVar3;
        x xVar4;
        return this.f10072a > 1 || ((xVar = this.f10076e) != null && xVar.f10068a > 1) || (((xVar2 = this.f) != null && xVar2.f10068a > 1) || (((xVar3 = this.f10077g) != null && xVar3.f10068a > 1) || ((xVar4 = this.f10078h) != null && xVar4.f10068a > 1)));
    }
}
