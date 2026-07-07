package t8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static j f12646c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12647a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f12648b;

    public j(Context context) {
        this.f12647a = context.getApplicationContext();
    }

    public static j a(Context context) {
        x.g(context);
        synchronized (j.class) {
            try {
                if (f12646c == null) {
                    r.a(context);
                    f12646c = new j(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12646c;
    }

    public static final o c(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            p pVar = new p(packageInfo.signatures[0].toByteArray());
            for (int i6 = 0; i6 < oVarArr.length; i6++) {
                if (oVarArr[i6].equals(pVar)) {
                    return oVarArr[i6];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = 1
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            t8.o[] r4 = t8.q.f12659a
            t8.o r4 = c(r2, r4)
            goto L45
        L39:
            t8.o[] r4 = t8.q.f12659a
            r4 = r4[r1]
            t8.o[] r5 = new t8.o[r0]
            r5[r1] = r4
            t8.o r4 = c(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.j.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01d0 A[LOOP:0: B:6:0x001a->B:12:0x01d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01e3 A[EDGE_INSN: B:13:0x01e3->B:14:0x01e3 BREAK  A[LOOP:0: B:6:0x001a->B:12:0x01d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r18) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.j.b(int):boolean");
    }
}
