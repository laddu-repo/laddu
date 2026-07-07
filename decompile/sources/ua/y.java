package ua;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.playfy.tv.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f13057a;

    /* renamed from: b, reason: collision with root package name */
    public final m f13058b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f13059c;

    /* renamed from: d, reason: collision with root package name */
    public final m[] f13060d;

    /* renamed from: e, reason: collision with root package name */
    public final w f13061e;

    /* renamed from: f, reason: collision with root package name */
    public final w f13062f;

    /* renamed from: g, reason: collision with root package name */
    public final w f13063g;

    /* renamed from: h, reason: collision with root package name */
    public final w f13064h;

    public y(x xVar) {
        this.f13057a = xVar.f13049a;
        this.f13058b = xVar.f13050b;
        this.f13059c = xVar.f13051c;
        this.f13060d = xVar.f13052d;
        this.f13061e = xVar.f13053e;
        this.f13062f = xVar.f13054f;
        this.f13063g = xVar.f13055g;
        this.f13064h = xVar.f13056h;
    }

    public static void a(x xVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = t9.a.C;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        m a10 = m.a(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i6 = 0;
                        for (int i10 = 0; i10 < attributeCount; i10++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i11 = i6 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i6] = attributeNameResource;
                                i6 = i11;
                            }
                        }
                        xVar.a(StateSet.trimStateSet(iArr2, i6), a10);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ua.x, java.lang.Object] */
    public static y b(Context context, TypedArray typedArray, int i6) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i6, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ?? obj = new Object();
        obj.b();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
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
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            obj.b();
        }
        if (next == 2) {
            if (xml.getName().equals("selector")) {
                a(obj, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            if (obj.f13049a == 0) {
                return null;
            }
            return new y(obj);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final m c() {
        m mVar = this.f13058b;
        w wVar = this.f13064h;
        w wVar2 = this.f13063g;
        w wVar3 = this.f13062f;
        w wVar4 = this.f13061e;
        if (wVar4 == null && wVar3 == null && wVar2 == null && wVar == null) {
            return mVar;
        }
        l g10 = mVar.g();
        if (wVar4 != null) {
            g10.f13007e = wVar4.f13046b;
        }
        if (wVar3 != null) {
            g10.f13008f = wVar3.f13046b;
        }
        if (wVar2 != null) {
            g10.f13010h = wVar2.f13046b;
        }
        if (wVar != null) {
            g10.f13009g = wVar.f13046b;
        }
        return g10.a();
    }

    public final boolean d() {
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        if (this.f13057a > 1 || (((wVar = this.f13061e) != null && wVar.f13045a > 1) || (((wVar2 = this.f13062f) != null && wVar2.f13045a > 1) || (((wVar3 = this.f13063g) != null && wVar3.f13045a > 1) || ((wVar4 = this.f13064h) != null && wVar4.f13045a > 1))))) {
            return true;
        }
        return false;
    }
}
