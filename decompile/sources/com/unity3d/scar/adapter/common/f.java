package com.unity3d.scar.adapter.common;

import android.util.Pair;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public Object f3395a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f3396b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3397c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3398d;

    public f(c cVar) {
        this.f3396b = new ConcurrentHashMap();
        this.f3398d = cVar;
    }

    public static int j(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw l0.b(null, e10);
            }
        }
        return -1;
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw l0.b(null, e10);
            }
        }
        return j;
    }

    public static int l(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw l0.b(null, e10);
            }
        }
        throw new e3.d(str, 1);
    }

    public abstract Object e();

    public Object f(String str) {
        LinkedList linkedList = (LinkedList) this.f3398d;
        for (int i6 = 0; i6 < linkedList.size(); i6++) {
            Pair pair = (Pair) linkedList.get(i6);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
        }
        f fVar = (f) this.f3397c;
        if (fVar == null) {
            return null;
        }
        return fVar.f(str);
    }

    public boolean g(String str) {
        return false;
    }

    public Object h(XmlPullParser xmlPullParser) {
        boolean z10 = false;
        int i6 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            f fVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType != 2) {
                if (eventType != 3) {
                    if (eventType == 4 && z10 && i6 == 0) {
                        n(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i6 > 0) {
                    i6--;
                } else {
                    String name = xmlPullParser.getName();
                    i(xmlPullParser);
                    if (!g(name)) {
                        return e();
                    }
                }
            } else {
                String name2 = xmlPullParser.getName();
                if (((String) this.f3396b).equals(name2)) {
                    m(xmlPullParser);
                    z10 = true;
                } else if (z10) {
                    if (i6 > 0) {
                        i6++;
                    } else if (g(name2)) {
                        m(xmlPullParser);
                    } else {
                        String str = (String) this.f3395a;
                        if ("QualityLevel".equals(name2)) {
                            fVar = new f(this, str, "QualityLevel");
                        } else if ("Protection".equals(name2)) {
                            fVar = new f(this, str, "Protection");
                        } else if ("StreamIndex".equals(name2)) {
                            fVar = new p2.g(this, str);
                        }
                        if (fVar == null) {
                            i6 = 1;
                        } else {
                            d(fVar.h(xmlPullParser));
                        }
                    }
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void m(XmlPullParser xmlPullParser);

    public void o(Object obj, String str) {
        ((LinkedList) this.f3398d).add(Pair.create(str, obj));
    }

    public f(f fVar, String str, String str2) {
        this.f3397c = fVar;
        this.f3395a = str;
        this.f3396b = str2;
        this.f3398d = new LinkedList();
    }

    public void d(Object obj) {
    }

    public void i(XmlPullParser xmlPullParser) {
    }

    public void n(XmlPullParser xmlPullParser) {
    }
}
