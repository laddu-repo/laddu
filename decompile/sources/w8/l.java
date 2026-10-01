package w8;

import android.content.Context;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Looper;
import android.os.Trace;
import androidx.lifecycle.n1;
import androidx.lifecycle.o1;
import androidx.lifecycle.q1;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.o7;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements o1.b, u2.q, e9.c, e9.d, f2.o, h5.c, j2.m, m2.d, n9.w {
    public static final /* synthetic */ l A = new l(20);
    public static final /* synthetic */ l B = new l(21);
    public static final /* synthetic */ l C = new l(22);
    public static final /* synthetic */ l D = new l(23);
    public static final /* synthetic */ l E = new l(24);
    public static final /* synthetic */ l F = new l(25);
    public static final /* synthetic */ l G = new l(26);
    public static final /* synthetic */ l H = new l(27);
    public static final /* synthetic */ l I = new l(28);
    public static final /* synthetic */ l J = new l(29);

    /* renamed from: y, reason: collision with root package name */
    public static l f14208y;

    /* renamed from: z, reason: collision with root package name */
    public static l f14209z;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14210x;

    public /* synthetic */ l(int i6) {
        this.f14210x = i6;
    }

    public static final boolean o(bg.c0 c0Var) {
        bg.c0 c0Var2 = cg.f.f2100e;
        bg.n nVar = c0Var.f1693x;
        int k8 = bg.n.k(nVar, cg.c.f2090a);
        if (k8 == -1) {
            k8 = bg.n.k(c0Var.f1693x, cg.c.f2091b);
        }
        if (k8 != -1) {
            nVar = bg.n.o(nVar, k8 + 1, 0, 2);
        } else if (c0Var.f() != null && nVar.d() == 2) {
            nVar = bg.n.A;
        }
        return !df.u.z(nVar.q(), ".class", true);
    }

    public static o1 p(q1 q1Var, n1 factory) {
        o1.c extras;
        if (q1Var instanceof androidx.lifecycle.s) {
            extras = ((androidx.lifecycle.s) q1Var).getDefaultViewModelCreationExtras();
        } else {
            extras = o1.a.f9847b;
        }
        kotlin.jvm.internal.k.e(factory, "factory");
        kotlin.jvm.internal.k.e(extras, "extras");
        return new o1(q1Var.getViewModelStore(), factory, extras);
    }

    public static MediaCodec r(androidx.lifecycle.d dVar) {
        String str = ((j2.q) dVar.f896a).f7091a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bg.n s(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.l.s(java.lang.String):bg.n");
    }

    public static bg.n t(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i10 = i6 * 2;
                bArr[i6] = (byte) (cg.b.a(str.charAt(i10 + 1)) + (cg.b.a(str.charAt(i10)) << 4));
            }
            return new bg.n(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static bg.n u(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        byte[] bytes = str.getBytes(df.a.f4115a);
        kotlin.jvm.internal.k.d(bytes, "getBytes(...)");
        bg.n nVar = new bg.n(bytes);
        nVar.f1730z = str;
        return nVar;
    }

    public static bg.n v(byte[] bArr) {
        bg.n nVar = bg.n.A;
        int length = bArr.length;
        bg.b.f(bArr.length, 0, length);
        return new bg.n(ie.i.g0(bArr, 0, length));
    }

    public static final boolean w() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // n9.w
    public Object b() {
        switch (this.f14210x) {
            case 20:
                return new Boolean(((Boolean) o7.f2382b.b()).booleanValue());
            case 21:
                return new Boolean(((Boolean) g8.f2238a.b()).booleanValue());
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                List list = n9.e0.f9226a;
                Boolean bool = (Boolean) n9.f2366a.b();
                bool.getClass();
                return bool;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                List list2 = n9.e0.f9226a;
                g7.f2236y.get();
                return (String) i7.f2269e.b();
            case 24:
                List list3 = n9.e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.o0.b()).longValue());
            case 25:
                List list4 = n9.e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.f2293r.b()).longValue());
            case 26:
                List list5 = n9.e0.f9226a;
                g7.f2236y.get();
                return (String) i7.M.b();
            case 27:
                List list6 = n9.e0.f9226a;
                g7.f2236y.get();
                Long l10 = (Long) i7.A.b();
                l10.getClass();
                return l10;
            case 28:
                List list7 = n9.e0.f9226a;
                g7.f2236y.get();
                Long l11 = (Long) i7.L.b();
                l11.getClass();
                return l11;
            default:
                List list8 = n9.e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.O.b()).longValue());
        }
    }

    @Override // e9.c
    public int d(Context context, String str, boolean z10) {
        return e9.e.d(context, str, z10);
    }

    @Override // m2.d
    public m2.e e(int i6) {
        m2.h0 h0Var = new m2.h0();
        h0Var.y(a.a.k(i6 * 2));
        return h0Var;
    }

    @Override // m2.d
    public /* synthetic */ m2.d f() {
        return null;
    }

    @Override // f2.o
    public f2.i g(f2.l lVar, r1.q qVar) {
        if (qVar.f11674r == null) {
            return null;
        }
        return new f2.q(new f2.h(new Exception(), 6001));
    }

    @Override // u2.q
    public Object h(Uri uri, w1.k kVar) {
        return Long.valueOf(u1.a0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // e9.d
    public a3.c i(Context context, String str, e9.c cVar) {
        a3.c cVar2 = new a3.c();
        cVar2.f521a = cVar.m(context, str);
        int i6 = 1;
        int d10 = cVar.d(context, str, true);
        cVar2.f522b = d10;
        int i10 = cVar2.f521a;
        if (i10 == 0) {
            i10 = 0;
            if (d10 == 0) {
                i6 = 0;
                cVar2.f523c = i6;
                return cVar2;
            }
        }
        if (i10 >= d10) {
            i6 = -1;
        }
        cVar2.f523c = i6;
        return cVar2;
    }

    @Override // f2.o
    public /* synthetic */ f2.n j(f2.l lVar, r1.q qVar) {
        return f2.n.f4678i;
    }

    @Override // h5.c
    public h5.d k(a2.c cVar) {
        return new i5.h((Context) cVar.f171y, (String) cVar.f172z, (ca.e) cVar.A, cVar.f170x);
    }

    @Override // f2.o
    public int l(r1.q qVar) {
        if (qVar.f11674r != null) {
            return 1;
        }
        return 0;
    }

    @Override // e9.c
    public int m(Context context, String str) {
        return e9.e.a(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // j2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j2.n q(androidx.lifecycle.d r6) {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = r(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f899d     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f896a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            j2.q r2 = (j2.q) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.f7098h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f897b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f900e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            j1.f0 r1 = new j1.f0     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f901f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            androidx.lifecycle.j1 r6 = (androidx.lifecycle.j1) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.l.q(androidx.lifecycle.d):j2.n");
    }

    public l(Context context) {
        this.f14210x = 2;
    }

    @Override // f2.o
    public /* synthetic */ void a() {
    }

    @Override // f2.o
    public /* synthetic */ void c() {
    }

    @Override // f2.o
    public void n(Looper looper, b2.m mVar) {
    }
}
