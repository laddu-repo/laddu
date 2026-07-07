package he;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final me.a f6066a = me.a.f8833x;

    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.k.e(th, "<this>");
        kotlin.jvm.internal.k.e(exception, "exception");
        if (th != exception) {
            Integer num = qe.a.f11210a;
            if (num != null && num.intValue() < 19) {
                Method method = pe.a.f10755a;
                if (method != null) {
                    method.invoke(th, exception);
                    return;
                }
                return;
            }
            th.addSuppressed(exception);
        }
    }

    public static final j b(Throwable exception) {
        kotlin.jvm.internal.k.e(exception, "exception");
        return new j(exception);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [he.f, java.lang.Object, he.l] */
    /* JADX WARN: Type inference failed for: r2v5, types: [he.f, he.z, java.lang.Object] */
    public static f c(g gVar, ve.a aVar) {
        v vVar = v.f6098a;
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.f6102x = aVar;
                    obj.f6103y = vVar;
                    return obj;
                }
                throw new RuntimeException();
            }
            ?? obj2 = new Object();
            obj2.f6081x = aVar;
            obj2.f6082y = vVar;
            return obj2;
        }
        return new m(aVar);
    }

    public static m d(ve.a initializer) {
        kotlin.jvm.internal.k.e(initializer, "initializer");
        return new m(initializer);
    }

    public static String e(Throwable th) {
        kotlin.jvm.internal.k.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.k.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static final void f(Object obj) {
        if (!(obj instanceof j)) {
        } else {
            throw ((j) obj).f6078x;
        }
    }

    public static final String g(int i6, long j) {
        if (j >= 0) {
            a.a.g(i6);
            String l10 = Long.toString(j, i6);
            kotlin.jvm.internal.k.d(l10, "toString(...)");
            return l10;
        }
        long j10 = i6;
        long j11 = ((j >>> 1) / j10) << 1;
        long j12 = j - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        a.a.g(i6);
        String l11 = Long.toString(j11, i6);
        kotlin.jvm.internal.k.d(l11, "toString(...)");
        a.a.g(i6);
        String l12 = Long.toString(j12, i6);
        kotlin.jvm.internal.k.d(l12, "toString(...)");
        return l11.concat(l12);
    }
}
