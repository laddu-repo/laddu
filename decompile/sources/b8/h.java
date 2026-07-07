package b8;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.hardware.display.DisplayManager;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import c6.f0;
import com.google.android.gms.internal.measurement.mb;
import ef.q;
import ef.w;
import ef.z;
import h.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import jf.n;
import k8.g2;
import o8.o;
import org.json.JSONException;
import org.json.JSONObject;
import p4.u;
import p4.v;
import p4.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f1591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f1592b;

    public static boolean B(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static String C(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }

    public static final Object D(u uVar, boolean z2, boolean z10, ce.l lVar) {
        de.i.e(uVar, "db");
        uVar.a();
        uVar.b();
        sd.h hVar = (sd.h) uVar.f10361h.get();
        if (hVar == null) {
            hVar = sd.i.f11797v;
        }
        return com.bumptech.glide.e.q(new t4.c(hVar, uVar, z10, z2, lVar, null));
    }

    public static final Cursor G(u uVar, y yVar) {
        de.i.e(uVar, "db");
        uVar.a();
        uVar.b();
        return uVar.j().e0().l0(yVar);
    }

    public static TypedValue H(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean I(Context context, int i, boolean z2) {
        TypedValue typedValueH = H(context, i);
        return (typedValueH == null || typedValueH.type != 18) ? z2 : typedValueH.data != 0;
    }

    public static TypedValue J(int i, Context context, String str) {
        TypedValue typedValueH = H(context, i);
        if (typedValueH != null) {
            return typedValueH;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void K(String str, boolean z2, z zVar, q qVar, qc.j jVar) {
        try {
            ad.c cVar = new ad.c();
            if (qVar != null) {
                cVar.f481y = qVar.c();
            }
            if (z2) {
                if (zVar == null) {
                    int i = z.f5100a;
                    long j8 = 0;
                    ff.d.a(j8, j8, j8);
                    zVar = new ef.y(null, 0, new byte[0]);
                }
                cVar.q("POST", zVar);
            } else {
                cVar.q("GET", null);
            }
            boolean zContains = str.contains("*gzip");
            if (zContains) {
                str = str.replaceAll("\\*gzip", "");
            }
            cVar.v(str);
            w wVarB = qc.b.b();
            mb mbVar = new mb(cVar);
            wVarB.getClass();
            n nVar = new n(wVarB, mbVar);
            f0 f0Var = new f0();
            f0Var.f2170v = zContains;
            f0Var.f2171w = jVar;
            nVar.e(f0Var);
        } catch (IllegalArgumentException e7) {
            L(jVar, false, e7.getMessage());
        }
    }

    public static void L(qc.j jVar, boolean z2, String str) {
        new Handler(Looper.getMainLooper()).post(new ed.m(jVar, z2, str, 2));
    }

    public static o O(List list) {
        if (list == null || list.isEmpty()) {
            return o(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((o) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        o oVar = new o();
        o8.j jVar = new o8.j(list.size(), oVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            p pVar = o8.i.f9965b;
            oVar2.d(pVar, jVar);
            oVar2.c(pVar, jVar);
            oVar2.a(pVar, jVar);
        }
        return oVar;
    }

    public static o P(o... oVarArr) {
        if (oVarArr.length == 0) {
            return o(Collections.EMPTY_LIST);
        }
        List listAsList = Arrays.asList(oVarArr);
        return (listAsList == null || listAsList.isEmpty()) ? o(Collections.EMPTY_LIST) : O(listAsList).f(o8.i.f9964a, new g2(11, listAsList));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader R() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.h.R():java.lang.ClassLoader");
    }

    public static Object S(o oVar) throws ExecutionException {
        if (oVar.j()) {
            return oVar.h();
        }
        if (oVar.f9985d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(oVar.g());
    }

    public static final void a(Logger logger, hf.a aVar, hf.c cVar, String str) {
        logger.fine(cVar.f6296b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f6290a);
    }

    public static Object b(o oVar) throws InterruptedException {
        t7.y.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        t7.y.h(oVar, "Task must not be null");
        if (oVar.i()) {
            return S(oVar);
        }
        g2 g2Var = new g2(10);
        Executor executor = o8.i.f9965b;
        oVar.d(executor, g2Var);
        oVar.c(executor, g2Var);
        oVar.a(executor, g2Var);
        ((CountDownLatch) g2Var.f7546w).await();
        return S(oVar);
    }

    public static Object c(o oVar, long j8, TimeUnit timeUnit) throws TimeoutException {
        t7.y.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        t7.y.h(oVar, "Task must not be null");
        t7.y.h(timeUnit, "TimeUnit must not be null");
        if (oVar.i()) {
            return S(oVar);
        }
        g2 g2Var = new g2(10);
        Executor executor = o8.i.f9965b;
        oVar.d(executor, g2Var);
        oVar.c(executor, g2Var);
        oVar.a(executor, g2Var);
        if (((CountDownLatch) g2Var.f7546w).await(j8, timeUnit)) {
            return S(oVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static o d(Executor executor, Callable callable) {
        t7.y.h(executor, "Executor must not be null");
        o oVar = new o();
        executor.execute(new o8.m(oVar, callable, false, 1));
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(v4.c cVar, Throwable th) throws Exception {
        if (cVar != 0) {
            if (th != null) {
                try {
                    j4.a.t(cVar);
                    return;
                } catch (Throwable th2) {
                    com.bumptech.glide.e.a(th, th2);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (cVar instanceof ExecutorService) {
                a2.c.z((ExecutorService) cVar);
                return;
            }
            if (cVar instanceof TypedArray) {
                ((TypedArray) cVar).recycle();
                return;
            }
            if (cVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cVar).release();
                return;
            }
            if (cVar instanceof MediaDrm) {
                ((MediaDrm) cVar).release();
            } else if (cVar instanceof DrmManagerClient) {
                ((DrmManagerClient) cVar).release();
            } else {
                if (!(cVar instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) cVar).release();
            }
        }
    }

    public static final void i(ef.p pVar, String str, String str2) {
        de.i.e(str, "name");
        de.i.e(str2, "value");
        ArrayList arrayList = pVar.f5025a;
        arrayList.add(str);
        arrayList.add(ke.h.U(str2).toString());
    }

    public static void j(String str, String str2, Object obj) {
        String strW = w(str);
        if (Log.isLoggable(strW, 3)) {
            Log.d(strW, String.format(str2, obj));
        }
    }

    public static boolean k(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void l(v4.a aVar) throws Exception {
        de.i.e(aVar, "connection");
        qd.c cVarJ = fa.b.j();
        v4.c cVarJ0 = aVar.j0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarJ0.Z()) {
            try {
                cVarJ.add(cVarJ0.n(0));
            } finally {
            }
        }
        h(cVarJ0, null);
        ListIterator listIterator = fa.b.b(cVarJ).listIterator(0);
        while (true) {
            qd.a aVar2 = (qd.a) listIterator;
            if (!aVar2.hasNext()) {
                return;
            }
            String str = (String) aVar2.next();
            if (ke.p.B(str, "room_fts_content_sync_", false)) {
                v.x(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static void m(String str, String str2, Exception exc) {
        String strW = w(str);
        if (Log.isLoggable(strW, 6)) {
            Log.e(strW, str2, exc);
        }
    }

    public static o n(Exception exc) {
        o oVar = new o();
        oVar.n(exc);
        return oVar;
    }

    public static o o(Object obj) {
        o oVar = new o();
        oVar.l(obj);
        return oVar;
    }

    public static final String p(long j8) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j8 <= -999500000 ? j4.a.m(new StringBuilder(), (j8 - ((long) 500000000)) / ((long) 1000000000), " s ") : j8 <= -999500 ? j4.a.m(new StringBuilder(), (j8 - ((long) 500000)) / ((long) 1000000), " ms") : j8 <= 0 ? j4.a.m(new StringBuilder(), (j8 - ((long) 500)) / ((long) 1000), " µs") : j8 < 999500 ? j4.a.m(new StringBuilder(), (j8 + ((long) 500)) / ((long) 1000), " µs") : j8 < 999500000 ? j4.a.m(new StringBuilder(), (j8 + ((long) 500000)) / ((long) 1000000), " ms") : j4.a.m(new StringBuilder(), (j8 + ((long) 500000000)) / ((long) 1000000000), " s ")}, 1));
    }

    public static String q(Context context, String str) {
        return vc.a.h(context) + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(h.j r20, java.lang.String r21, qc.j r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.h.r(h.j, java.lang.String, qc.j, boolean):void");
    }

    public static void s(String str, qc.j jVar) {
        K(str, false, null, null, jVar);
    }

    public static void u(JSONObject jSONObject, qc.j jVar) {
        q qVarD;
        try {
            String string = jSONObject.getString("channel");
            String string2 = jSONObject.getString("playlist");
            if (string2.contains("|")) {
                String[] strArrSplit = string2.split("\\|");
                String str = strArrSplit[0];
                qVarD = q.d(vc.a.g(strArrSplit[1]));
                string2 = str;
            } else {
                qVarD = null;
            }
            K(string2, false, null, qVarD, new androidx.fragment.app.e(13, string, jVar));
        } catch (NullPointerException | JSONException unused) {
            jVar.c("https://error.m3u8", false);
        }
    }

    public static final Object v(h1.b bVar, h1.e eVar, Serializable serializable) {
        de.i.e(bVar, "<this>");
        de.i.e(eVar, "key");
        Object objCopyOf = bVar.f6045a.get(eVar);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
            de.i.d(objCopyOf, "copyOf(this, size)");
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }

    public static String w(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final void x(String str) {
        de.i.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                com.bumptech.glide.d.d(16);
                String string = Integer.toString(cCharAt, 16);
                de.i.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i);
                sb2.append(" in header name: ");
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final void y(String str, String str2) {
        de.i.e(str, "value");
        de.i.e(str2, "name");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                com.bumptech.glide.d.d(16);
                String string = Integer.toString(cCharAt, 16);
                de.i.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i);
                sb2.append(" in ");
                sb2.append(str2);
                sb2.append(" value");
                sb2.append(ff.d.j(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static void z(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (com.bumptech.glide.c.v(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT >= 29) {
            new ed.m(context, z2, new o8.h(), 3).run();
        } else {
            o(null);
        }
    }

    public abstract boolean A();

    public abstract void E(x.g gVar, x.g gVar2);

    public abstract void F(x.g gVar, Thread thread);

    public abstract void M(boolean z2);

    public abstract void N(boolean z2);

    public abstract TransformationMethod Q(TransformationMethod transformationMethod);

    public abstract boolean e(x.h hVar, x.d dVar, x.d dVar2);

    public abstract boolean f(x.h hVar, Object obj, Object obj2);

    public abstract boolean g(x.h hVar, x.g gVar, x.g gVar2);

    public abstract InputFilter[] t(InputFilter[] inputFilterArr);
}
