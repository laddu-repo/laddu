package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import o.o;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.n1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f8928e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f8929f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f8930a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8931b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8932c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8933d;

    static {
        Class[] clsArr = {Context.class};
        f8928e = clsArr;
        f8929f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f8932c = context;
        Object[] objArr = {context};
        this.f8930a = objArr;
        this.f8931b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i6;
        XmlPullParser xmlPullParser2;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i6 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                if (eventType != i6) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z12 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            gVar.f8905b = 0;
                            gVar.f8906c = 0;
                            gVar.f8907d = 0;
                            gVar.f8908e = 0;
                            gVar.f8909f = true;
                            gVar.f8910g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.f8911h) {
                                o oVar = gVar.f8927z;
                                if (oVar != null && oVar.f9826b.hasSubMenu()) {
                                    gVar.f8911h = true;
                                    gVar.b(gVar.f8904a.addSubMenu(gVar.f8905b, gVar.f8912i, gVar.j, gVar.f8913k).getItem());
                                } else {
                                    gVar.f8911h = true;
                                    gVar.b(gVar.f8904a.add(gVar.f8905b, gVar.f8912i, gVar.j, gVar.f8913k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z11 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i6 = 2;
                    }
                    xmlPullParser2 = xmlPullParser;
                    eventType = xmlPullParser2.next();
                    i6 = 2;
                } else {
                    if (!z12) {
                        String name3 = xmlPullParser.getName();
                        boolean equals = name3.equals("group");
                        Context context = this.f8932c;
                        if (equals) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f5747q);
                            gVar.f8905b = obtainStyledAttributes.getResourceId(1, 0);
                            gVar.f8906c = obtainStyledAttributes.getInt(3, 0);
                            gVar.f8907d = obtainStyledAttributes.getInt(4, 0);
                            gVar.f8908e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f8909f = obtainStyledAttributes.getBoolean(2, true);
                            gVar.f8910g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f5748r);
                                gVar.f8912i = obtainStyledAttributes2.getResourceId(2, 0);
                                gVar.j = (obtainStyledAttributes2.getInt(5, gVar.f8906c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.f8907d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                gVar.f8913k = obtainStyledAttributes2.getText(7);
                                gVar.f8914l = obtainStyledAttributes2.getText(8);
                                gVar.f8915m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f8916n = charAt;
                                gVar.f8917o = obtainStyledAttributes2.getInt(16, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f8918p = charAt2;
                                gVar.f8919q = obtainStyledAttributes2.getInt(20, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    gVar.f8920r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f8920r = gVar.f8908e;
                                }
                                gVar.s = obtainStyledAttributes2.getBoolean(3, false);
                                gVar.f8921t = obtainStyledAttributes2.getBoolean(4, gVar.f8909f);
                                gVar.f8922u = obtainStyledAttributes2.getBoolean(1, gVar.f8910g);
                                gVar.f8923v = obtainStyledAttributes2.getInt(21, -1);
                                gVar.f8926y = obtainStyledAttributes2.getString(12);
                                gVar.f8924w = obtainStyledAttributes2.getResourceId(13, 0);
                                gVar.f8925x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && gVar.f8924w == 0 && gVar.f8925x == null) {
                                    gVar.f8927z = (o) gVar.a(string3, f8929f, this.f8931b);
                                } else {
                                    if (z10) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f8927z = null;
                                }
                                gVar.A = obtainStyledAttributes2.getText(17);
                                gVar.B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    gVar.D = n1.c(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                                } else {
                                    gVar.D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = i0.f.d(context, resourceId)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    gVar.C = colorStateList;
                                } else {
                                    gVar.C = null;
                                }
                                obtainStyledAttributes2.recycle();
                                gVar.f8911h = false;
                                xmlPullParser2 = xmlPullParser;
                            } else if (name3.equals("menu")) {
                                gVar.f8911h = true;
                                SubMenu addSubMenu = gVar.f8904a.addSubMenu(gVar.f8905b, gVar.f8912i, gVar.j, gVar.f8913k);
                                gVar.b(addSubMenu.getItem());
                                xmlPullParser2 = xmlPullParser;
                                b(xmlPullParser2, attributeSet, addSubMenu);
                            } else {
                                xmlPullParser2 = xmlPullParser;
                                str = name3;
                                z12 = true;
                            }
                            eventType = xmlPullParser2.next();
                            i6 = 2;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    eventType = xmlPullParser2.next();
                    i6 = 2;
                }
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i6, Menu menu) {
        if (!(menu instanceof o.l)) {
            super.inflate(i6, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            try {
                xmlResourceParser = this.f8932c.getResources().getLayout(i6);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof o.l) {
                    o.l lVar = (o.l) menu;
                    if (!lVar.f9790p) {
                        lVar.w();
                        z10 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z10) {
                    ((o.l) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((o.l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
