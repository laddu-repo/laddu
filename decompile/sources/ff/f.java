package ff;

import de.i;
import ef.b0;
import ef.q;
import ef.s;
import ef.w;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ke.h;
import ke.p;
import vf.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f5401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5402b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        i.b(timeZone);
        f5401a = timeZone;
        String strP = h.P(w.class.getName(), "okhttp3.");
        if (p.x(strP, "Client")) {
            strP = strP.substring(0, strP.length() - 6);
            i.d(strP, "substring(...)");
        }
        f5402b = strP;
    }

    public static final boolean a(s sVar, s sVar2) {
        i.e(sVar, "<this>");
        i.e(sVar2, "other");
        return i.a(sVar.f5038d, sVar2.f5038d) && sVar.f5039e == sVar2.f5039e && i.a(sVar.f5035a, sVar2.f5035a);
    }

    public static final void b(Socket socket) {
        i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e10) {
            if (!i.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final String c(String str, Object... objArr) {
        i.e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long d(b0 b0Var) {
        String strA = b0Var.A.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = d.f5397a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset e(vf.e eVar, Charset charset) {
        i.e(eVar, "<this>");
        i.e(charset, "default");
        int iD0 = eVar.d0(d.f5398b);
        if (iD0 == -1) {
            return charset;
        }
        if (iD0 == 0) {
            return ke.a.f7954a;
        }
        if (iD0 == 1) {
            return ke.a.f7955b;
        }
        if (iD0 == 2) {
            Charset charset2 = ke.a.f7954a;
            Charset charset3 = ke.a.f7957d;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            i.d(charsetForName, "forName(...)");
            ke.a.f7957d = charsetForName;
            return charsetForName;
        }
        if (iD0 == 3) {
            return ke.a.f7956c;
        }
        if (iD0 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = ke.a.f7954a;
        Charset charset5 = ke.a.f7958e;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        i.d(charsetForName2, "forName(...)");
        ke.a.f7958e = charsetForName2;
        return charsetForName2;
    }

    public static final boolean f(t tVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = tVar.g().e() ? tVar.g().c() - jNanoTime : Long.MAX_VALUE;
        tVar.g().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            vf.c cVar = new vf.c();
            while (tVar.V(8192L, cVar) != -1) {
                cVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                tVar.g().a();
                return true;
            }
            tVar.g().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                tVar.g().a();
                return false;
            }
            tVar.g().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                tVar.g().a();
            } else {
                tVar.g().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final q g(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mf.d dVar = (mf.d) it.next();
            vf.f fVar = dVar.f8769a;
            vf.f fVar2 = dVar.f8770b;
            String strJ = fVar.j();
            String strJ2 = fVar2.j();
            arrayList.add(strJ);
            arrayList.add(h.U(strJ2).toString());
        }
        return new q((String[]) arrayList.toArray(new String[0]));
    }

    public static final String h(s sVar, boolean z2) {
        i.e(sVar, "<this>");
        int i = sVar.f5039e;
        String str = sVar.f5038d;
        if (h.E(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z2) {
            String str2 = sVar.f5035a;
            i.e(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List i(List list) {
        i.e(list, "<this>");
        if (list.isEmpty()) {
            return pd.p.f10551v;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            i.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        i.d(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(pd.i.W(array));
        i.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return pd.p.f10551v;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            i.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(pd.i.W((Object[]) objArr.clone()));
        i.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
