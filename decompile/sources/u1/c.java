package u1;

import a2.c1;
import android.media.MediaFormat;
import android.os.Bundle;
import db.h0;
import db.k0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i6, int i10) {
        if (i6 >= 0 && i6 < i10) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void d(c1 c1Var) {
        c1Var.getClass();
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void f(String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void g(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void h(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static db.c1 j(cb.e eVar, ArrayList arrayList) {
        h0 j = k0.j();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            Bundle bundle = (Bundle) arrayList.get(i6);
            bundle.getClass();
            j.a(eVar.apply(bundle));
        }
        return j.g();
    }

    public static String k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            if (xmlPullParser.getAttributeName(i6).equals(str)) {
                return xmlPullParser.getAttributeValue(i6);
            }
        }
        return null;
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static void n(MediaFormat mediaFormat, String str, int i6) {
        if (i6 != -1) {
            mediaFormat.setInteger(str, i6);
        }
    }

    public static void o(MediaFormat mediaFormat, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            mediaFormat.setByteBuffer(h8.c.i(i6, "csd-"), ByteBuffer.wrap((byte[]) list.get(i6)));
        }
    }

    public static ArrayList p(Collection collection, cb.e eVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) eVar.apply(it.next()));
        }
        return arrayList;
    }
}
