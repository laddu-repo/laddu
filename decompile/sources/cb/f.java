package cb;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2006a;

    public /* synthetic */ f(String str, boolean z10) {
        this.f2006a = str;
    }

    public static f c(t tVar) {
        String str;
        String str2;
        tVar.L(2);
        int y9 = tVar.y();
        int i6 = y9 >> 1;
        int y10 = ((tVar.y() >> 3) & 31) | ((y9 & 1) << 5);
        if (i6 != 4 && i6 != 5 && i6 != 7 && i6 != 8) {
            if (i6 == 9) {
                str = "dvav";
            } else if (i6 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder b10 = y.e.b(str);
        String str3 = ".";
        if (i6 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        b10.append(str2);
        b10.append(i6);
        if (y10 < 10) {
            str3 = ".0";
        }
        b10.append(str3);
        b10.append(y10);
        return new f(b10.toString(), false);
    }

    public void a(StringBuilder sb2, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f2006a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }

    public f(String str) {
        str.getClass();
        this.f2006a = str;
    }
}
