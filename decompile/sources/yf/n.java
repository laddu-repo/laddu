package yf;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o5.e0;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import w4.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f15077a = new Object();

    public static final l a(Number number, String str) {
        return new l("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str, -1)), 1);
    }

    public static final l b(int i6, String message, CharSequence input) {
        kotlin.jvm.internal.k.e(message, "message");
        kotlin.jvm.internal.k.e(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) j(input, i6));
        kotlin.jvm.internal.k.e(message2, "message");
        if (i6 >= 0) {
            message2 = "Unexpected JSON token at offset " + i6 + ": " + message2;
        }
        return new l(message2, 0);
    }

    public static final uf.g c(uf.g gVar, e0 module) {
        kotlin.jvm.internal.k.e(gVar, "<this>");
        kotlin.jvm.internal.k.e(module, "module");
        if (kotlin.jvm.internal.k.a(gVar.getKind(), uf.i.f13134f)) {
            s1.c.n(gVar);
            return gVar;
        }
        if (gVar.isInline()) {
            return c(gVar.h(0), module);
        }
        return gVar;
    }

    public static final byte d(char c10) {
        if (c10 < '~') {
            return g.f15067b[c10];
        }
        return (byte) 0;
    }

    public static final String e(uf.g gVar, xf.c json) {
        kotlin.jvm.internal.k.e(gVar, "<this>");
        kotlin.jvm.internal.k.e(json, "json");
        for (Annotation annotation : gVar.getAnnotations()) {
            if (annotation instanceof xf.h) {
                return ((xf.h) annotation).discriminator();
            }
        }
        return HandleInvocationsFromAdViewer.KEY_AD_TYPE;
    }

    public static final Object f(xf.c json, wf.c cVar, q0 q0Var) {
        kotlin.jvm.internal.k.e(json, "json");
        r rVar = new r(q0Var, f.f15065c.b(Http2.INITIAL_MAX_FRAME_SIZE));
        try {
            Object c10 = new s(json, x.f15107z, rVar, (wf.b) cVar.f14301c).c(cVar);
            rVar.o();
            return c10;
        } finally {
            rVar.H();
        }
    }

    public static final int g(uf.g descriptor, xf.c json, String name) {
        Object obj;
        kotlin.jvm.internal.k.e(descriptor, "<this>");
        kotlin.jvm.internal.k.e(json, "json");
        kotlin.jvm.internal.k.e(name, "name");
        k(descriptor, json);
        int d10 = descriptor.d(name);
        if (d10 != -3) {
            return d10;
        }
        w8.e eVar = json.f14728c;
        fd.j jVar = new fd.j(5, descriptor, json);
        eVar.getClass();
        eVar.getClass();
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) eVar.f14155x).get(descriptor);
        o oVar = f15077a;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(oVar);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = jVar.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) eVar.f14155x;
            Object obj3 = concurrentHashMap.get(descriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, obj3);
            }
            ((Map) obj3).put(oVar, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(name);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final boolean h(uf.g gVar, xf.c json) {
        kotlin.jvm.internal.k.e(gVar, "<this>");
        kotlin.jvm.internal.k.e(json, "json");
        if (!json.f14726a.f14736b) {
            List annotations = gVar.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                Iterator it = annotations.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof xf.o) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void i(y2.j jVar, String str) {
        jVar.p(jVar.f14913b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence j(CharSequence charSequence, int i6) {
        String str;
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i6 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i10 = i6 - 30;
                int i11 = i6 + 30;
                if (i10 > 0) {
                    str = ".....";
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (i11 >= charSequence.length()) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                StringBuilder b10 = y.e.b(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length2 = charSequence.length();
                if (i11 > length2) {
                    i11 = length2;
                }
                b10.append(charSequence.subSequence(i10, i11).toString());
                b10.append(str2);
                return b10.toString();
            }
        }
        return charSequence;
    }

    public static final void k(uf.g gVar, xf.c json) {
        kotlin.jvm.internal.k.e(gVar, "<this>");
        kotlin.jvm.internal.k.e(json, "json");
        kotlin.jvm.internal.k.a(gVar.getKind(), uf.j.f13136f);
    }

    public static final x l(uf.g desc, xf.c cVar) {
        kotlin.jvm.internal.k.e(cVar, "<this>");
        kotlin.jvm.internal.k.e(desc, "desc");
        a8.a kind = desc.getKind();
        if (kind instanceof uf.d) {
            return x.C;
        }
        if (kotlin.jvm.internal.k.a(kind, uf.j.f13137g)) {
            return x.A;
        }
        if (kotlin.jvm.internal.k.a(kind, uf.j.f13138h)) {
            uf.g c10 = c(desc.h(0), cVar.f14727b);
            a8.a kind2 = c10.getKind();
            if (!(kind2 instanceof uf.f) && !kotlin.jvm.internal.k.a(kind2, uf.i.f13135g)) {
                throw new l("Value of type '" + c10.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + c10.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
            }
            return x.B;
        }
        return x.f15107z;
    }

    public static final void m(y2.j jVar, Number number) {
        y2.j.q(jVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String n(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        if (b10 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
