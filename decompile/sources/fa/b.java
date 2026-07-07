package fa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import androidx.emoji2.text.w;
import androidx.emoji2.text.x;
import ef.u;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import ke.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements x0.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static long f5325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Method f5326w;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static qd.c b(qd.c cVar) {
        cVar.f();
        cVar.f10997x = true;
        return cVar.f10996w > 0 ? cVar : qd.c.f10994y;
    }

    public static String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b9 : bArr) {
            int i = (b9 >>> 4) & 15;
            sb2.append((char) ((i < 0 || i >= 10) ? i + 87 : i + 48));
            int i10 = b9 & 15;
            sb2.append((char) ((i10 < 0 || i10 >= 10) ? i10 + 87 : i10 + 48));
        }
        return sb2.toString();
    }

    public static void e(String str, long j8) {
        if (j8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be >= 0");
    }

    public static void f(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final long g(long j8, le.c cVar, le.c cVar2) {
        de.i.e(cVar, "sourceUnit");
        de.i.e(cVar2, "targetUnit");
        return cVar2.f8345v.convert(j8, cVar.f8345v);
    }

    public static x h(Context context) {
        ProviderInfo providerInfo;
        q0.d dVar;
        ApplicationInfo applicationInfo;
        o9.f dVar2 = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.d(2) : new o9.f(2);
        PackageManager packageManager = context.getPackageManager();
        u1.c.g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrJ = dVar2.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrJ) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new q0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new x(new w(context, dVar));
    }

    public static final od.g i(Throwable th) {
        de.i.e(th, "exception");
        return new od.g(th);
    }

    public static qd.c j() {
        return new qd.c(10);
    }

    public static final boolean k(String str, String str2) {
        de.i.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i12 = i11 + 1;
                    if (i11 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i10++;
                    } else if (cCharAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    de.i.d(strSubstring, "substring(...)");
                    return de.i.a(ke.h.U(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String l(Collection collection) {
        de.i.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return ke.j.v(pd.j.I(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static u m(String str) {
        de.i.e(str, "<this>");
        hd.a aVarA = u.f5042c.a(0, str);
        if (aVarA == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        if (((ke.e) aVarA.f6281y) == null) {
            aVarA.f6281y = new ke.e(aVarA);
        }
        ke.e eVar = (ke.e) aVarA.f6281y;
        de.i.b(eVar);
        String str2 = (String) eVar.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        de.i.d(lowerCase, "toLowerCase(...)");
        if (((ke.e) aVarA.f6281y) == null) {
            aVarA.f6281y = new ke.e(aVarA);
        }
        ke.e eVar2 = (ke.e) aVarA.f6281y;
        de.i.b(eVar2);
        String lowerCase2 = ((String) eVar2.get(2)).toLowerCase(locale);
        de.i.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) aVarA.f6279w;
        int i = android.support.v4.media.session.b.P(matcher.start(), matcher.end()).f6283w;
        while (true) {
            int i10 = i + 1;
            if (i10 >= str.length()) {
                return new u(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            hd.a aVarA2 = u.f5043d.a(i10, str);
            if (aVarA2 == null) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i10);
                de.i.d(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                sb2.append(str);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            Matcher matcher2 = (Matcher) aVarA2.f6279w;
            ke.f fVar = (ke.f) aVarA2.f6280x;
            ke.d dVarB = fVar.b(1);
            String str3 = dVarB != null ? dVarB.f7969a : null;
            if (str3 == null) {
                i = android.support.v4.media.session.b.P(matcher2.start(), matcher2.end()).f6283w;
            } else {
                ke.d dVarB2 = fVar.b(2);
                String strSubstring2 = dVarB2 != null ? dVarB2.f7969a : null;
                if (strSubstring2 == null) {
                    ke.d dVarB3 = fVar.b(3);
                    de.i.b(dVarB3);
                    strSubstring2 = dVarB3.f7969a;
                } else {
                    boolean z2 = false;
                    if (strSubstring2.length() > 0 && com.bumptech.glide.d.i(strSubstring2.charAt(0), '\'', false)) {
                        z2 = true;
                    }
                    if (z2 && strSubstring2.length() > 0 && com.bumptech.glide.d.i(strSubstring2.charAt(ke.h.G(strSubstring2)), '\'', false) && strSubstring2.length() > 2) {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                        de.i.d(strSubstring2, "substring(...)");
                    }
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i = android.support.v4.media.session.b.P(matcher2.start(), matcher2.end()).f6283w;
            }
        }
    }

    public static String n(String str, String str2, String str3) throws NoSuchAlgorithmException {
        String str4 = str.split("/")[r10.length - 2];
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long j8 = 77 + jCurrentTimeMillis;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = StandardCharsets.ISO_8859_1;
        byte[] bytes = (jCurrentTimeMillis + str4 + str2 + str3 + j8).getBytes(charset);
        messageDigest.update(bytes, 0, bytes.length);
        c(messageDigest.digest());
        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
        byte[] bytes2 = (str4 + str3 + jCurrentTimeMillis + str2).getBytes(charset);
        messageDigest2.update(bytes2, 0, bytes2.length);
        c(messageDigest2.digest());
        String str5 = str4 + str3 + jCurrentTimeMillis + str2;
        MessageDigest messageDigest3 = MessageDigest.getInstance("SHA-256");
        byte[] bytes3 = str5.getBytes(charset);
        messageDigest3.update(bytes3, 0, bytes3.length);
        return "?token=" + c(messageDigest3.digest()) + "-" + j8 + "-" + jCurrentTimeMillis;
    }

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d5.a.a();
        }
        try {
            if (f5326w == null) {
                f5325v = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f5326w = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f5326w.invoke(null, Long.valueOf(f5325v))).booleanValue();
        } catch (Exception e7) {
            if (!(e7 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e7);
                return false;
            }
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean p(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final String q(Collection collection) {
        return ke.j.v(pd.j.I(collection, ",", null, null, null, 62)) + ke.j.v(" }");
    }

    public static final String r(Collection collection) {
        return ke.j.v(pd.j.I(collection, ",", null, null, null, 62)) + ke.j.v("},");
    }

    public static List s(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        de.i.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static b3.a t(String str) throws ProtocolException {
        int i;
        String strSubstring;
        de.i.e(str, "statusLine");
        boolean zB = p.B(str, "HTTP/1.", false);
        ef.x xVar = ef.x.f5093x;
        ef.x xVar2 = ef.x.f5094y;
        if (zB) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                xVar = xVar2;
            }
        } else if (p.B(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!p.B(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            xVar = xVar2;
        }
        int i10 = i + 3;
        if (str.length() < i10) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i, i10);
        de.i.d(strSubstring2, "substring(...)");
        Integer numC = p.C(strSubstring2);
        if (numC == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numC.intValue();
        if (str.length() <= i10) {
            strSubstring = "";
        } else {
            if (str.charAt(i10) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
            de.i.d(strSubstring, "substring(...)");
        }
        return new b3.a(xVar, iIntValue, strSubstring, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList u(w1.t r30) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.b.u(w1.t):java.util.ArrayList");
    }

    public static boolean y(String str) {
        return str == null || str.isEmpty();
    }

    public static final void z(Object obj) {
        if (obj instanceof od.g) {
            throw ((od.g) obj).f10118v;
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void w();

    public abstract void x();

    public void v() {
    }
}
