package sa;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.mb;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k8.z;
import va.a0;
import va.b0;
import va.h1;
import va.i0;
import va.j0;
import va.k0;
import va.k1;
import va.l1;
import va.m0;
import va.m1;
import va.m2;
import va.n1;
import va.n2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f11627r = new g(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Charset f11628s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2.p f11630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2.c f11631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ya.c f11632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ta.c f11633e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ya.c f11634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ed.g f11635h;
    public final ua.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pa.b f11636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qa.a f11637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f11638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mb f11639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f11640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o8.h f11641o = new o8.h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o8.h f11642p = new o8.h();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o8.h f11643q = new o8.h();

    public l(Context context, v vVar, o2.p pVar, ya.c cVar, p2.c cVar2, ed.g gVar, ya.c cVar3, ua.e eVar, mb mbVar, pa.b bVar, qa.a aVar, i iVar, ta.c cVar4) {
        new AtomicBoolean(false);
        this.f11629a = context;
        this.f = vVar;
        this.f11630b = pVar;
        this.f11634g = cVar;
        this.f11631c = cVar2;
        this.f11635h = gVar;
        this.f11632d = cVar3;
        this.i = eVar;
        this.f11636j = bVar;
        this.f11637k = aVar;
        this.f11638l = iVar;
        this.f11639m = mbVar;
        this.f11633e = cVar4;
    }

    public static o8.o a(l lVar) {
        o8.o oVarD;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ya.c.e(((File) lVar.f11634g.f14650x).listFiles(f11627r))) {
            try {
                long j8 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    oVarD = b8.h.o(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    oVarD = b8.h.d(new ScheduledThreadPoolExecutor(1), new k(lVar, j8));
                }
                arrayList.add(oVarD);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return b8.h.O(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05c0  */
    /* JADX WARN: Type inference failed for: r0v6, types: [sa.i] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r33, ab.f r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.l.b(boolean, ab.f, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strK = d0.d.k("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
        Locale locale = Locale.US;
        v vVar = this.f;
        ed.g gVar = this.f11635h;
        l1 l1Var = new l1(vVar.f11687c, (String) gVar.f, (String) gVar.f4889g, vVar.c().f11599a, d0.d.c(((String) gVar.f4887d) != null ? 4 : 1), (p2.c) gVar.f4890h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(f.g());
        Context context = this.f11629a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        e eVar = e.f11608v;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            e eVar2 = (e) e.f11609w.get(str8.toLowerCase(locale));
            if (eVar2 != null) {
                eVar = eVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = eVar.ordinal();
        String str9 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = f.a(context);
        boolean zF = f.f();
        int iC = f.c();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.f11636j.d(str, jCurrentTimeMillis, new k1(l1Var, n1Var, new m1(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            ya.c cVar = this.f11632d;
            synchronized (((String) cVar.f14648v)) {
                cVar.f14648v = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i = 4;
                ((ta.c) cVar.f14650x).f12521b.a(new e2.v(cVar, str, ((ua.d) ((AtomicMarkableReference) ((c2.b) cVar.f14651y).f1686w).getReference()).a(), ((jf.u) cVar.A).a(), 5));
            }
        }
        ua.e eVar3 = this.i;
        ((ua.c) eVar3.f12910w).b();
        eVar3.f12910w = ua.e.f12908x;
        if (str != null) {
            eVar3.f12910w = new ua.l(((ya.c) eVar3.f12909v).b(str, "userlog"));
        }
        this.f11638l.a(str);
        mb mbVar = this.f11639m;
        r rVar = (r) mbVar.f2888b;
        Charset charset = n2.f13460a;
        a0 a0Var = new a0();
        a0Var.f13249a = "20.0.6";
        ed.g gVar2 = rVar.f11671c;
        String str12 = (String) gVar2.f4884a;
        if (str12 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a0Var.f13250b = str12;
        v vVar2 = rVar.f11670b;
        String str13 = vVar2.c().f11599a;
        if (str13 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a0Var.f13252d = str13;
        a0Var.f13253e = vVar2.c().f11600b;
        a0Var.f = vVar2.c().f11601c;
        String str14 = (String) gVar2.f;
        if (str14 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a0Var.f13255h = str14;
        String str15 = (String) gVar2.f4889g;
        if (str15 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a0Var.i = str15;
        a0Var.f13251c = i;
        a0Var.f13259m = (byte) (a0Var.f13259m | 1);
        i0 i0Var = new i0();
        i0Var.f = false;
        byte b9 = (byte) (i0Var.f13377m | 2);
        i0Var.f13370d = jCurrentTimeMillis;
        i0Var.f13377m = (byte) (b9 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        i0Var.f13368b = str;
        String str16 = r.f11668g;
        if (str16 == null) {
            throw new NullPointerException("Null generator");
        }
        i0Var.f13367a = str16;
        String str17 = vVar2.f11687c;
        if (str17 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str18 = vVar2.c().f11599a;
        p2.c cVar2 = (p2.c) gVar2.f4890h;
        if (((g2.u) cVar2.f10197x) == null) {
            cVar2.f10197x = new g2.u(cVar2);
        }
        g2.u uVar = (g2.u) cVar2.f10197x;
        String str19 = uVar.f5482b;
        if (uVar == null) {
            cVar2.f10197x = new g2.u(cVar2);
        }
        i0Var.f13372g = new k0(str17, str14, str15, str18, str19, ((g2.u) cVar2.f10197x).f5483c);
        h1 h1Var = new h1();
        h1Var.f13354a = 3;
        h1Var.f13358e = (byte) (h1Var.f13358e | 1);
        if (str6 == null) {
            throw new NullPointerException("Null version");
        }
        h1Var.f13355b = str6;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        h1Var.f13356c = str2;
        h1Var.f13357d = f.g();
        h1Var.f13358e = (byte) (h1Var.f13358e | 2);
        i0Var.i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) r.f.get(str8.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = f.a(rVar.f11669a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = f.f();
        int iC2 = f.c();
        m0 m0Var = new m0();
        m0Var.f13434a = iIntValue;
        byte b10 = (byte) (m0Var.f13441j | 1);
        m0Var.f13441j = b10;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        m0Var.f13435b = str5;
        m0Var.f13436c = iAvailableProcessors2;
        m0Var.f13437d = jA2;
        m0Var.f13438e = blockCount2;
        m0Var.f = zF2;
        m0Var.f13439g = iC2;
        m0Var.f13441j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m0Var.f13440h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m0Var.i = str21;
        i0Var.f13374j = m0Var.a();
        i0Var.f13376l = 3;
        i0Var.f13377m = (byte) (i0Var.f13377m | 4);
        a0Var.f13256j = i0Var.a();
        b0 b0VarA = a0Var.a();
        ya.c cVar3 = ((ya.a) mbVar.f2889c).f14644b;
        m2 m2Var = b0VarA.f13281k;
        if (m2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((j0) m2Var).f13394b;
        try {
            ya.a.f14641g.getClass();
            ya.a.f(cVar3.b(str22, "report"), wa.c.f13948a.u(b0VarA));
            File fileB = cVar3.b(str22, "start-time");
            long j8 = ((j0) m2Var).f13396d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), ya.a.f14640e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j8 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e7) {
            String strK2 = d0.d.k("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strK2, e7);
            }
        }
    }

    public final boolean d(ab.f fVar) {
        ta.c.a();
        s sVar = this.f11640n;
        if (sVar != null && sVar.f11678e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, fVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e7) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e7);
            return false;
        }
    }

    public final String e() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Context context = this.f11629a;
        int iD = f.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f11628s), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = resourceAsStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArray, 0);
                resourceAsStream.close();
                return strEncodeToString;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            resourceAsStream.close();
            throw th;
        }
    }

    public final void f() {
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.f11632d.f(strE);
                } catch (IllegalArgumentException e7) {
                    Context context = this.f11629a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e7;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final void g(o8.o oVar) {
        o8.o oVar2;
        o8.o oVarA;
        o8.h hVar = this.f11641o;
        ya.c cVar = ((ya.a) this.f11639m.f2889c).f14644b;
        if (ya.c.e(((File) cVar.f14652z).listFiles()).isEmpty() && ya.c.e(((File) cVar.A).listFiles()).isEmpty() && ya.c.e(((File) cVar.B).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            hVar.c(Boolean.FALSE);
            return;
        }
        pa.d dVar = pa.d.f10448a;
        dVar.e("Crash reports are available to be sent.");
        o2.p pVar = this.f11630b;
        if (pVar.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            hVar.c(Boolean.FALSE);
            oVarA = b8.h.o(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.e("Notifying that unsent reports are available.");
            hVar.c(Boolean.TRUE);
            synchronized (pVar.f9504x) {
                oVar2 = ((o8.h) pVar.f9505y).f9963a;
            }
            z zVar = new z(26);
            oVar2.getClass();
            a7.s sVar = o8.i.f9964a;
            o8.o oVar3 = new o8.o();
            oVar2.f9983b.h(new o8.l(sVar, zVar, oVar3));
            oVar2.q();
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            oVarA = ta.a.a(oVar3, this.f11642p.f9963a);
        }
        oVarA.k(this.f11633e.f12520a, new ob.d(this, oVar, false, 10));
    }
}
