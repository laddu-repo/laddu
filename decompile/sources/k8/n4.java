package k8;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.ha;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.r9;
import com.google.android.gms.internal.measurement.t9;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.x9;
import com.google.android.gms.internal.measurement.y9;
import com.google.android.gms.internal.measurement.z9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n4 implements z1 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static volatile n4 f7650f0;
    public c A;
    public final p4 B;
    public z0 C;
    public r3 D;
    public f1 F;
    public final p1 G;
    public boolean I;
    public long J;
    public ArrayList K;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public FileLock R;
    public FileChannel S;
    public ArrayList T;
    public ArrayList U;
    public final HashMap W;
    public final HashMap X;
    public final HashMap Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public c3 f7651a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f7652b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public v3 f7653c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f7654d0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j1 f7656v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z0 f7657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n f7658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b1 f7659y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c4 f7660z;
    public final AtomicBoolean H = new AtomicBoolean(false);
    public final LinkedList L = new LinkedList();
    public final HashMap Z = new HashMap();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final k4 f7655e0 = new k4(this);
    public long V = -1;
    public final j4 E = new j4(this);

    public n4(androidx.emoji2.text.p pVar) {
        this.G = p1.r(pVar.f926a, null, null, null);
        p4 p4Var = new p4(this);
        p4Var.F();
        this.B = p4Var;
        z0 z0Var = new z0(this, 0);
        z0Var.F();
        this.f7657w = z0Var;
        j1 j1Var = new j1(this);
        j1Var.F();
        this.f7656v = j1Var;
        this.W = new HashMap();
        this.X = new HashMap();
        this.Y = new HashMap();
        d().M(new androidx.fragment.app.m(this, pVar));
    }

    public static n4 C(Context context) {
        t7.y.g(context);
        t7.y.g(context.getApplicationContext());
        if (f7650f0 == null) {
            synchronized (n4.class) {
                try {
                    if (f7650f0 == null) {
                        f7650f0 = new n4(new androidx.emoji2.text.p(context, 1));
                    }
                } finally {
                }
            }
        }
        return f7650f0;
    }

    public static final void D(q9 q9Var, int i, String str) {
        List listH = q9Var.h();
        for (int i10 = 0; i10 < listH.size(); i10++) {
            if ("_err".equals(((u9) listH.get(i10)).v())) {
                return;
            }
        }
        t9 t9VarG = u9.G();
        t9VarG.h("_err");
        t9VarG.j(i);
        u9 u9Var = (u9) t9VarG.e();
        t9 t9VarG2 = u9.G();
        t9VarG2.h("_ev");
        t9VarG2.i(str);
        u9 u9Var2 = (u9) t9VarG2.e();
        q9Var.k(u9Var);
        q9Var.k(u9Var2);
    }

    public static final void E(q9 q9Var, String str) {
        List listH = q9Var.h();
        for (int i = 0; i < listH.size(); i++) {
            if (str.equals(((u9) listH.get(i)).v())) {
                q9Var.m(i);
                return;
            }
        }
    }

    public static final boolean S(v4 v4Var) {
        return !TextUtils.isEmpty(v4Var.f7806w);
    }

    public static final void T(h4 h4Var) {
        if (h4Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!h4Var.f7570y) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(h4Var.getClass())));
        }
    }

    public static final Boolean U(v4 v4Var) {
        Boolean bool = v4Var.K;
        String str = v4Var.X;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((a2) s5.c.L(str).f11492w).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public final void A(a1 a1Var) {
        v.e eVar;
        v.e eVar2;
        d().D();
        if (TextUtils.isEmpty(a1Var.H())) {
            String strE = a1Var.E();
            t7.y.g(strE);
            B(strE, 204, null, null, null);
            return;
        }
        String strE2 = a1Var.E();
        t7.y.g(strE2);
        c().J.b(strE2, "Fetching remote configuration");
        j1 j1Var = this.f7656v;
        T(j1Var);
        v8 v8VarP = j1Var.P(strE2);
        T(j1Var);
        j1Var.D();
        String str = (String) j1Var.J.get(strE2);
        if (v8VarP != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new v.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            T(j1Var);
            j1Var.D();
            String str2 = (String) j1Var.K.get(strE2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new v.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.O = true;
        z0 z0Var = this.f7657w;
        T(z0Var);
        z7.a aVar = new z7.a(this);
        p1 p1Var = (p1) z0Var.f2053w;
        z0Var.D();
        z0Var.E();
        j4 j4Var = z0Var.f7447x.E;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) f0.f.a(null)).encodedAuthority((String) f0.f7494g.a(null)).path("config/app/".concat(String.valueOf(a1Var.H()))).appendQueryParameter("platform", "android");
        ((p1) j4Var.f2053w).f7695y.J();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            n1Var.P(new y0(z0Var, a1Var.E(), url, (byte[]) null, eVar, aVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.c(v0.L(a1Var.E()), string, "Failed to parse config URL. Not fetching. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0045, B:21:0x0063, B:58:0x0177, B:29:0x0080, B:34:0x00dc, B:33:0x00ca, B:35:0x00e1, B:39:0x00f8, B:43:0x010e, B:45:0x0126, B:47:0x0141, B:49:0x014a, B:51:0x0150, B:52:0x0154, B:54:0x015d, B:56:0x016c, B:57:0x0174, B:46:0x0132, B:40:0x00ff, B:42:0x0108), top: B:66:0x0045, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.B(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final int F(String str, a9.g gVar) {
        a2 a2VarH;
        j1 j1Var = this.f7656v;
        q8 q8VarZ = j1Var.Z(str);
        c2 c2Var = c2.f7425z;
        if (q8VarZ == null) {
            gVar.F(c2Var, h.FAILSAFE);
            return 1;
        }
        n nVar = this.f7658x;
        T(nVar);
        a1 a1VarH0 = nVar.H0(str);
        if (a1VarH0 == null || ((a2) s5.c.L(a1VarH0.s()).f11492w) != a2.f7374x || (a2VarH = j1Var.H(str, c2Var)) == a2.f7373w) {
            gVar.F(c2Var, h.REMOTE_DEFAULT);
            if (j1Var.Y(str, c2Var)) {
                return 0;
            }
        } else {
            gVar.F(c2Var, h.REMOTE_ENFORCED_DEFAULT);
            if (a2VarH == a2.f7376z) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(r9 r9Var) {
        Serializable serializableV;
        HashMap map = new HashMap();
        j0();
        HashMap map2 = new HashMap();
        for (u9 u9Var : r9Var.w()) {
            if (u9Var.v().startsWith("gad_") && (serializableV = p4.V(u9Var)) != null) {
                map2.put(u9Var.v(), serializableV);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        d().D();
        if (this.L.isEmpty()) {
            return;
        }
        if (this.f7653c0 == null) {
            this.f7653c0 = new v3(this, this.G, 2);
        }
        if (this.f7653c0.f7664c != 0) {
            return;
        }
        g().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) f0.B0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.f7654d0));
        c().J.b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.f7653c0 == null) {
            this.f7653c0 = new v3(this, this.G, 2);
        }
        this.f7653c0.b(jMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x049b A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ba A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ea A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0606 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x061b A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0789 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b5b A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b8f A[PHI: r13
  0x0b8f: PHI (r13v11 long) = (r13v10 long), (r13v36 long) binds: [B:343:0x0b59, B:523:0x0b8f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0ba7 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0bca A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0289 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029e A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02db A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #1 {all -> 0x0125, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00e5, B:20:0x00fe, B:22:0x0108, B:227:0x074f, B:26:0x0135, B:29:0x014b, B:31:0x0151, B:33:0x0157, B:35:0x016a, B:39:0x0177, B:41:0x0182, B:43:0x0190, B:45:0x0196, B:49:0x01a1, B:50:0x01af, B:52:0x01c1, B:55:0x01e1, B:57:0x01e7, B:59:0x01f7, B:61:0x0205, B:63:0x0215, B:64:0x0220, B:65:0x0223, B:67:0x0230, B:69:0x023a, B:70:0x024a, B:72:0x0269, B:74:0x0273, B:76:0x0289, B:77:0x0293, B:80:0x029e, B:81:0x02a8, B:84:0x02b0, B:87:0x02c1, B:88:0x02c4, B:90:0x02db, B:141:0x04d5, B:142:0x04d8, B:144:0x04e4, B:147:0x04f5, B:149:0x0506, B:151:0x0512, B:184:0x05dd, B:186:0x05ea, B:188:0x05f0, B:190:0x05f6, B:192:0x0606, B:193:0x0609, B:194:0x0615, B:196:0x061b, B:197:0x0627, B:199:0x062d, B:201:0x063d, B:203:0x0647, B:204:0x065c, B:206:0x0662, B:207:0x067d, B:209:0x0683, B:210:0x06a1, B:211:0x06ae, B:215:0x06d7, B:212:0x06b4, B:214:0x06c2, B:216:0x06df, B:217:0x06fe, B:219:0x0704, B:221:0x0717, B:222:0x0724, B:224:0x072b, B:226:0x073b, B:155:0x0535, B:157:0x0545, B:160:0x0558, B:162:0x056a, B:164:0x0576, B:167:0x058a, B:170:0x0598, B:172:0x05a2, B:174:0x05ac, B:177:0x05b7, B:179:0x05bd, B:181:0x05cd, B:182:0x05d8, B:98:0x0301, B:101:0x030b, B:103:0x0319, B:107:0x036a, B:104:0x033b, B:106:0x0349, B:110:0x0371, B:113:0x03a4, B:114:0x03cc, B:116:0x0401, B:118:0x0407, B:121:0x0413, B:123:0x0448, B:124:0x0465, B:126:0x046b, B:128:0x0479, B:132:0x048d, B:129:0x0481, B:135:0x0494, B:138:0x049b, B:139:0x04ba, B:230:0x0766, B:232:0x0778, B:234:0x0781, B:245:0x07b3, B:235:0x0789, B:237:0x0792, B:239:0x0798, B:242:0x07a4, B:244:0x07ae, B:246:0x07b6, B:247:0x07c2, B:250:0x07ca, B:252:0x07dc, B:253:0x07e7, B:255:0x07ef, B:259:0x081e, B:261:0x083a, B:263:0x084f, B:265:0x086b, B:267:0x0880, B:268:0x089c, B:270:0x08a2, B:272:0x08ba, B:273:0x08c8, B:275:0x08d8, B:276:0x08e6, B:277:0x08e9, B:279:0x0933, B:281:0x0939, B:287:0x0964, B:289:0x096c, B:290:0x098a, B:292:0x0990, B:293:0x09a4, B:295:0x09bb, B:297:0x09d5, B:299:0x09e7, B:301:0x09f1, B:302:0x09f4, B:304:0x0a4f, B:305:0x0a62, B:308:0x0a6a, B:311:0x0a89, B:313:0x0aa2, B:315:0x0ab7, B:317:0x0abc, B:319:0x0ac0, B:321:0x0ac4, B:323:0x0ace, B:325:0x0ad7, B:327:0x0adb, B:329:0x0ae1, B:331:0x0aec, B:333:0x0afa, B:400:0x0d5b, B:335:0x0b02, B:337:0x0b1e, B:342:0x0b3b, B:344:0x0b5b, B:345:0x0b63, B:347:0x0b69, B:349:0x0b7b, B:355:0x0b91, B:357:0x0ba7, B:358:0x0bca, B:360:0x0bd6, B:362:0x0bec, B:363:0x0c2c, B:369:0x0c48, B:371:0x0c53, B:373:0x0c57, B:375:0x0c5b, B:377:0x0c5f, B:378:0x0c6b, B:379:0x0c70, B:381:0x0c76, B:383:0x0c8c, B:384:0x0c91, B:399:0x0d58, B:386:0x0cd0, B:388:0x0cd4, B:392:0x0ce8, B:394:0x0d04, B:395:0x0d0b, B:398:0x0d4c, B:389:0x0cd9, B:340:0x0b24, B:401:0x0d61, B:403:0x0d6b, B:404:0x0d7f, B:405:0x0d87, B:407:0x0d8d, B:408:0x0da1, B:410:0x0db3, B:430:0x0e66, B:432:0x0e6c, B:434:0x0e83, B:437:0x0e8e, B:439:0x0e98, B:441:0x0ebf, B:443:0x0ecf, B:444:0x0ed9, B:446:0x0ee7, B:447:0x0ef1, B:448:0x0efc, B:450:0x0f0e, B:453:0x0f15, B:458:0x0f58, B:454:0x0f24, B:456:0x0f32, B:457:0x0f3f, B:459:0x0f67, B:460:0x0f7a, B:464:0x0f9a, B:463:0x0f85, B:411:0x0dce, B:413:0x0dd4, B:415:0x0de6, B:417:0x0ded, B:423:0x0e05, B:425:0x0e0c, B:427:0x0e57, B:429:0x0e5e, B:428:0x0e5b, B:424:0x0e09, B:416:0x0dea, B:282:0x0949, B:284:0x094f, B:286:0x0955, B:266:0x087d, B:262:0x084c, B:256:0x07f5, B:258:0x07fb, B:465:0x0fa3), top: B:473:0x0019, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(java.lang.String r47, long r48) {
        /*
            Method dump skipped, instruction units count: 4027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.I(java.lang.String, long):boolean");
    }

    public final void J(y9 y9Var, long j8, boolean z2) {
        r4 r4Var;
        Object obj;
        String str = true != z2 ? "_lte" : "_se";
        n nVar = this.f7658x;
        T(nVar);
        r4 r4VarZ0 = nVar.z0(y9Var.o(), str);
        if (r4VarZ0 == null || (obj = r4VarZ0.f7741e) == null) {
            String strO = y9Var.o();
            g().getClass();
            r4Var = new r4(strO, "auto", str, System.currentTimeMillis(), Long.valueOf(j8));
        } else {
            String strO2 = y9Var.o();
            g().getClass();
            r4Var = new r4(strO2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j8));
        }
        ha haVarF = ia.F();
        haVarF.b();
        ((ia) haVarF.f2653w).H(str);
        g().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        haVarF.b();
        ((ia) haVarF.f2653w).G(jCurrentTimeMillis);
        Object obj2 = r4Var.f7741e;
        long jLongValue = ((Long) obj2).longValue();
        haVarF.b();
        ((ia) haVarF.f2653w).K(jLongValue);
        ia iaVar = (ia) haVarF.e();
        int iP0 = p4.p0(y9Var, str);
        if (iP0 >= 0) {
            y9Var.b();
            ((z9) y9Var.f2653w).h0(iP0, iaVar);
        } else {
            y9Var.b();
            ((z9) y9Var.f2653w).i0(iaVar);
        }
        if (j8 > 0) {
            n nVar2 = this.f7658x;
            T(nVar2);
            nVar2.y0(r4Var);
            c().J.c(true != z2 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean K(q9 q9Var, q9 q9Var2) {
        t7.y.b("_e".equals(q9Var.n()));
        j0();
        u9 u9VarN = p4.N((r9) q9Var.e(), "_sc");
        String strX = u9VarN == null ? null : u9VarN.x();
        j0();
        u9 u9VarN2 = p4.N((r9) q9Var2.e(), "_pc");
        String strX2 = u9VarN2 != null ? u9VarN2.x() : null;
        if (strX2 == null || !strX2.equals(strX)) {
            return false;
        }
        t7.y.b("_e".equals(q9Var.n()));
        j0();
        u9 u9VarN3 = p4.N((r9) q9Var.e(), "_et");
        if (u9VarN3 == null || !u9VarN3.y() || u9VarN3.z() <= 0) {
            return true;
        }
        long jZ = u9VarN3.z();
        j0();
        u9 u9VarN4 = p4.N((r9) q9Var2.e(), "_et");
        if (u9VarN4 != null && u9VarN4.z() > 0) {
            jZ += u9VarN4.z();
        }
        j0();
        p4.L(q9Var2, "_et", Long.valueOf(jZ));
        j0();
        p4.L(q9Var, "_fr", 1L);
        return true;
    }

    public final void L(q9 q9Var, String str, String str2) {
        ArrayList arrayList = new ArrayList(q9Var.h());
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (str.equals(((u9) arrayList.get(i)).v())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        double D = q9Var.j(i).D() * 1000000.0d;
        if (D == 0.0d) {
            D = q9Var.j(i).z() * 1000000.0d;
        }
        if (D > 9.223372036854776E18d || D < -9.223372036854776E18d) {
            c().E.c(v0.L(str2), Double.valueOf(D), d0.d.l("Data lost. Purchase ", str, " is too big. appId"));
            return;
        }
        q9Var.m(i);
        t9 t9VarG = u9.G();
        t9VarG.h(str);
        t9VarG.j(Math.round(D));
        q9Var.k((u9) t9VarG.e());
    }

    public final boolean M() {
        d().D();
        l0();
        n nVar = this.f7658x;
        T(nVar);
        if (nVar.Z("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        n nVar2 = this.f7658x;
        T(nVar2);
        return !TextUtils.isEmpty(nVar2.L());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.N():void");
    }

    public final void O() {
        d().D();
        if (this.O || this.P || this.Q) {
            c().J.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.O), Boolean.valueOf(this.P), Boolean.valueOf(this.Q));
            return;
        }
        c().J.a("Stopping uploading service(s)");
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.K;
        t7.y.g(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(a1 a1Var) {
        try {
            long jQ = a1Var.Q();
            p1 p1Var = this.G;
            if (jQ != -2147483648L) {
                if (a1Var.Q() == z7.c.a(p1Var.f7692v).c(0, a1Var.E()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = z7.c.a(p1Var.f7692v).c(0, a1Var.E()).versionName;
                String strO = a1Var.O();
                if (strO != null && strO.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final v4 Q(String str) {
        n nVar = this.f7658x;
        T(nVar);
        a1 a1VarH0 = nVar.H0(str);
        if (a1VarH0 != null) {
            p1 p1Var = a1VarH0.f7349a;
            if (!TextUtils.isEmpty(a1VarH0.O())) {
                Boolean boolP = P(a1VarH0);
                if (boolP != null && !boolP.booleanValue()) {
                    c().B.b(v0.L(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strH = a1VarH0.H();
                String strO = a1VarH0.O();
                long jQ = a1VarH0.Q();
                n1 n1Var = p1Var.B;
                p1.l(n1Var);
                n1Var.D();
                String str2 = a1VarH0.f7358l;
                n1 n1Var2 = p1Var.B;
                p1.l(n1Var2);
                n1Var2.D();
                long j8 = a1VarH0.f7359m;
                n1 n1Var3 = p1Var.B;
                p1.l(n1Var3);
                n1Var3.D();
                long j9 = a1VarH0.f7360n;
                n1 n1Var4 = p1Var.B;
                p1.l(n1Var4);
                n1Var4.D();
                boolean z2 = a1VarH0.f7361o;
                String strK = a1VarH0.K();
                n1 n1Var5 = p1Var.B;
                p1.l(n1Var5);
                n1Var5.D();
                boolean z10 = a1VarH0.f7362p;
                Boolean boolX = a1VarH0.x();
                long jB = a1VarH0.b();
                n1 n1Var6 = p1Var.B;
                p1.l(n1Var6);
                n1Var6.D();
                ArrayList arrayList = a1VarH0.f7365s;
                String strG = b(str).g();
                boolean z11 = a1VarH0.z();
                n1 n1Var7 = p1Var.B;
                p1.l(n1Var7);
                n1Var7.D();
                long j10 = a1VarH0.f7368v;
                int i = b(str).f7441b;
                String str3 = o0(str).f7685b;
                n1 n1Var8 = p1Var.B;
                p1.l(n1Var8);
                n1Var8.D();
                int i10 = a1VarH0.f7370x;
                n1 n1Var9 = p1Var.B;
                p1.l(n1Var9);
                n1Var9.D();
                return new v4(str, strH, strO, jQ, str2, j8, j9, (String) null, z2, false, strK, 0L, 0, z10, false, boolX, jB, (List) arrayList, strG, "", (String) null, z11, j10, i, str3, i10, a1VarH0.B, a1VarH0.D(), a1VarH0.s(), 0L, a1VarH0.t(), 0L);
            }
        }
        c().I.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        n nVar = this.f7658x;
        T(nVar);
        s sVarD0 = nVar.d0("events", str, str2);
        return sVarD0 == null || sVarD0.f7744c < 1;
    }

    public final void V() {
        d().D();
        l0();
        if (this.I) {
            return;
        }
        this.I = true;
        d().D();
        FileLock fileLock = this.R;
        p1 p1Var = this.G;
        if (fileLock == null || !fileLock.isValid()) {
            ((p1) this.f7658x.f2053w).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(p1Var.f7692v.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.S = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.R = fileLockTryLock;
                if (fileLockTryLock == null) {
                    c().B.a("Storage concurrent data access panic");
                    return;
                }
                c().J.a("Storage concurrent access okay");
            } catch (FileNotFoundException e7) {
                c().B.b(e7, "Failed to acquire storage lock");
                return;
            } catch (IOException e10) {
                c().B.b(e10, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e11) {
                c().E.b(e11, "Storage lock already acquired");
                return;
            }
        } else {
            c().J.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.S;
        d().D();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            c().B.a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i10 = fileChannel.read(byteBufferAllocate);
                if (i10 == 4) {
                    byteBufferAllocate.flip();
                    i = byteBufferAllocate.getInt();
                } else if (i10 != -1) {
                    c().E.b(Integer.valueOf(i10), "Unexpected data length. Bytes read");
                }
            } catch (IOException e12) {
                c().B.b(e12, "Failed to read from channel");
            }
        }
        n0 n0VarQ = p1Var.q();
        n0VarQ.E();
        int i11 = n0VarQ.A;
        d().D();
        if (i > i11) {
            c().B.c(Integer.valueOf(i), Integer.valueOf(i11), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i < i11) {
            FileChannel fileChannel2 = this.S;
            d().D();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                c().B.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i11);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        c().B.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    c().J.c(Integer.valueOf(i), Integer.valueOf(i11), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e13) {
                    c().B.b(e13, "Failed to write to channel");
                }
            }
            c().B.c(Integer.valueOf(i), Integer.valueOf(i11), "Storage version upgrade failed. Previous, current version");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(k8.q4 r24, k8.v4 r25) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.W(k8.q4, k8.v4):void");
    }

    public final void X(String str, v4 v4Var) {
        d().D();
        l0();
        boolean zS = S(v4Var);
        String str2 = v4Var.f7805v;
        if (zS) {
            if (!v4Var.C) {
                c0(v4Var);
                return;
            }
            Boolean boolU = U(v4Var);
            if ("_npa".equals(str) && boolU != null) {
                c().I.a("Falling back to manifest metadata value for ad personalization");
                g().getClass();
                W(new q4(System.currentTimeMillis(), Long.valueOf(true != boolU.booleanValue() ? 0L : 1L), "_npa", "auto"), v4Var);
                return;
            }
            t0 t0Var = c().I;
            p1 p1Var = this.G;
            t0Var.b(p1Var.E.c(str), "Removing user property");
            n nVar = this.f7658x;
            T(nVar);
            nVar.r0();
            try {
                c0(v4Var);
                if ("_id".equals(str)) {
                    n nVar2 = this.f7658x;
                    T(nVar2);
                    t7.y.g(str2);
                    nVar2.x0(str2, "_lair");
                }
                n nVar3 = this.f7658x;
                T(nVar3);
                t7.y.g(str2);
                nVar3.x0(str2, str);
                n nVar4 = this.f7658x;
                T(nVar4);
                nVar4.s0();
                c().I.b(p1Var.E.c(str), "User property removed");
                n nVar5 = this.f7658x;
                T(nVar5);
                nVar5.t0();
            } catch (Throwable th) {
                n nVar6 = this.f7658x;
                T(nVar6);
                nVar6.t0();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043c A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0156, B:65:0x0171, B:68:0x018a, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0156, B:65:0x0171, B:68:0x018a, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0156, B:65:0x0171, B:68:0x018a, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0156, B:65:0x0171, B:68:0x018a, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0156, B:65:0x0171, B:68:0x018a, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #2 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0156, B:65:0x0171, B:68:0x018a, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x029a, B:107:0x02c6, B:108:0x02c9, B:110:0x02ea, B:151:0x03b2, B:152:0x03b5, B:160:0x0461, B:113:0x0301, B:118:0x0320, B:120:0x0328, B:122:0x032e, B:126:0x0341, B:130:0x0354, B:134:0x0360, B:137:0x0374, B:142:0x0393, B:144:0x039b, B:146:0x03a3, B:148:0x03a9, B:140:0x0381, B:128:0x034c, B:116:0x030e, B:77:0x01e6, B:79:0x0210, B:80:0x021c, B:82:0x0223, B:84:0x0229, B:86:0x0233, B:88:0x0239, B:90:0x023f, B:92:0x0245, B:93:0x024a, B:99:0x0263, B:101:0x0267, B:102:0x0278, B:103:0x0283, B:104:0x028e, B:153:0x03de, B:155:0x0413, B:156:0x0416, B:157:0x043c, B:159:0x0443, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:169:0x00dc, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(k8.v4 r37) {
        /*
            Method dump skipped, instruction units count: 1147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.Y(k8.v4):void");
    }

    public final void Z(e eVar, v4 v4Var) {
        v vVar;
        t7.y.d(eVar.f7448v);
        t7.y.g(eVar.f7449w);
        t7.y.g(eVar.f7450x);
        t7.y.d(eVar.f7450x.f7721w);
        d().D();
        l0();
        if (S(v4Var)) {
            if (!v4Var.C) {
                c0(v4Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z2 = false;
            eVar2.f7452z = false;
            n nVar = this.f7658x;
            T(nVar);
            nVar.r0();
            try {
                n nVar2 = this.f7658x;
                T(nVar2);
                String str = eVar2.f7448v;
                t7.y.g(str);
                e eVarD0 = nVar2.D0(str, eVar2.f7450x.f7721w);
                p1 p1Var = this.G;
                if (eVarD0 != null && !eVarD0.f7449w.equals(eVar2.f7449w)) {
                    c().E.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", p1Var.E.c(eVar2.f7450x.f7721w), eVar2.f7449w, eVarD0.f7449w);
                }
                if (eVarD0 != null && eVarD0.f7452z) {
                    eVar2.f7449w = eVarD0.f7449w;
                    eVar2.f7451y = eVarD0.f7451y;
                    eVar2.C = eVarD0.C;
                    eVar2.A = eVarD0.A;
                    eVar2.D = eVarD0.D;
                    eVar2.f7452z = true;
                    q4 q4Var = eVar2.f7450x;
                    eVar2.f7450x = new q4(eVarD0.f7450x.f7722x, q4Var.a(), q4Var.f7721w, eVarD0.f7450x.A);
                } else if (TextUtils.isEmpty(eVar2.A)) {
                    q4 q4Var2 = eVar2.f7450x;
                    eVar2.f7450x = new q4(eVar2.f7451y, q4Var2.a(), q4Var2.f7721w, eVar2.f7450x.A);
                    eVar2.f7452z = true;
                    z2 = true;
                }
                if (eVar2.f7452z) {
                    q4 q4Var3 = eVar2.f7450x;
                    String str2 = eVar2.f7448v;
                    t7.y.g(str2);
                    String str3 = eVar2.f7449w;
                    String str4 = q4Var3.f7721w;
                    long j8 = q4Var3.f7722x;
                    Object objA = q4Var3.a();
                    t7.y.g(objA);
                    r4 r4Var = new r4(str2, str3, str4, j8, objA);
                    Object obj = r4Var.f7741e;
                    String str5 = r4Var.f7739c;
                    n nVar3 = this.f7658x;
                    T(nVar3);
                    if (nVar3.y0(r4Var)) {
                        c().I.d("User property updated immediately", eVar2.f7448v, p1Var.E.c(str5), obj);
                    } else {
                        c().B.d("(2)Too many active user properties, ignoring", v0.L(eVar2.f7448v), p1Var.E.c(str5), obj);
                    }
                    if (z2 && (vVar = eVar2.D) != null) {
                        l(new v(vVar, eVar2.f7451y, 0L), v4Var);
                    }
                }
                n nVar4 = this.f7658x;
                T(nVar4);
                if (nVar4.C0(eVar2)) {
                    c().I.d("Conditional property added", eVar2.f7448v, p1Var.E.c(eVar2.f7450x.f7721w), eVar2.f7450x.a());
                } else {
                    c().B.d("Too many conditional properties, ignoring", v0.L(eVar2.f7448v), p1Var.E.c(eVar2.f7450x.f7721w), eVar2.f7450x.a());
                }
                n nVar5 = this.f7658x;
                T(nVar5);
                nVar5.s0();
                n nVar6 = this.f7658x;
                T(nVar6);
                nVar6.t0();
            } catch (Throwable th) {
                n nVar7 = this.f7658x;
                T(nVar7);
                nVar7.t0();
                throw th;
            }
        }
    }

    @Override // k8.z1
    public final oa.b a() {
        return this.G.f7694x;
    }

    public final void a0(e eVar, v4 v4Var) {
        t7.y.d(eVar.f7448v);
        t7.y.g(eVar.f7450x);
        t7.y.d(eVar.f7450x.f7721w);
        d().D();
        l0();
        if (S(v4Var)) {
            if (!v4Var.C) {
                c0(v4Var);
                return;
            }
            n nVar = this.f7658x;
            T(nVar);
            nVar.r0();
            try {
                c0(v4Var);
                String str = eVar.f7448v;
                t7.y.g(str);
                n nVar2 = this.f7658x;
                T(nVar2);
                e eVarD0 = nVar2.D0(str, eVar.f7450x.f7721w);
                p1 p1Var = this.G;
                if (eVarD0 != null) {
                    c().I.c(eVar.f7448v, p1Var.E.c(eVar.f7450x.f7721w), "Removing conditional user property");
                    n nVar3 = this.f7658x;
                    T(nVar3);
                    nVar3.E0(str, eVar.f7450x.f7721w);
                    if (eVarD0.f7452z) {
                        n nVar4 = this.f7658x;
                        T(nVar4);
                        nVar4.x0(str, eVar.f7450x.f7721w);
                    }
                    v vVar = eVar.F;
                    if (vVar != null) {
                        u uVar = vVar.f7792w;
                        v vVarL0 = k0().l0(vVar.f7791v, uVar != null ? uVar.d() : null, eVarD0.f7449w, vVar.f7794y, vVar.f7795z, true);
                        t7.y.g(vVarL0);
                        l(vVarL0, v4Var);
                    }
                } else {
                    c().E.c(v0.L(eVar.f7448v), p1Var.E.c(eVar.f7450x.f7721w), "Conditional user property doesn't exist");
                }
                n nVar5 = this.f7658x;
                T(nVar5);
                nVar5.s0();
                n nVar6 = this.f7658x;
                T(nVar6);
                nVar6.t0();
            } catch (Throwable th) {
                n nVar7 = this.f7658x;
                T(nVar7);
                nVar7.t0();
                throw th;
            }
        }
    }

    public final d2 b(String str) {
        d2 d2Var = d2.f7439c;
        d().D();
        l0();
        HashMap map = this.W;
        d2 d2VarX = (d2) map.get(str);
        if (d2VarX == null) {
            n nVar = this.f7658x;
            T(nVar);
            d2VarX = nVar.X(str);
            if (d2VarX == null) {
                d2VarX = d2.f7439c;
            }
            d().D();
            l0();
            map.put(str, d2VarX);
            n nVar2 = this.f7658x;
            T(nVar2);
            nVar2.j0(str, d2VarX);
        }
        return d2VarX;
    }

    public final void b0(v4 v4Var, long j8) throws Throwable {
        n nVar = this.f7658x;
        T(nVar);
        String str = v4Var.f7805v;
        t7.y.g(str);
        a1 a1VarH0 = nVar.H0(str);
        if (a1VarH0 != null) {
            k0();
            String str2 = v4Var.f7806w;
            String strH = a1VarH0.H();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strH);
            if (!zIsEmpty && !zIsEmpty2) {
                t7.y.g(str2);
                if (!str2.equals(strH)) {
                    c().E.b(v0.L(a1VarH0.E()), "New GMP App Id passed in. Removing cached database data. appId");
                    n nVar2 = this.f7658x;
                    T(nVar2);
                    p1 p1Var = (p1) nVar2.f2053w;
                    String strE = a1VarH0.E();
                    nVar2.E();
                    nVar2.D();
                    t7.y.d(strE);
                    try {
                        SQLiteDatabase sQLiteDatabaseU0 = nVar2.u0();
                        String[] strArr = {strE};
                        int iDelete = sQLiteDatabaseU0.delete("events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseU0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseU0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseU0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseU0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseU0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseU0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseU0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseU0.delete("diagnostic_signals", "app_id=?", strArr);
                        if (p1Var.f7695y.O(null, f0.f7489d1)) {
                            iDelete += sQLiteDatabaseU0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            v0 v0Var = p1Var.A;
                            p1.l(v0Var);
                            v0Var.J.c(strE, Integer.valueOf(iDelete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e7) {
                        v0 v0Var2 = p1Var.A;
                        p1.l(v0Var2);
                        v0Var2.B.c(v0.L(strE), e7, "Error deleting application data. appId, error");
                    }
                    a1VarH0 = null;
                }
            }
        }
        if (a1VarH0 != null) {
            boolean z2 = (a1VarH0.Q() == -2147483648L || a1VarH0.Q() == v4Var.E) ? false : true;
            String strO = a1VarH0.O();
            if (z2 || ((a1VarH0.Q() != -2147483648L || strO == null || strO.equals(v4Var.f7807x)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strO);
                v vVar = new v("_au", new u(bundle), "auto", j8, 0L);
                if (e0().O(null, f0.Y0)) {
                    i(vVar, v4Var);
                } else {
                    j(vVar, v4Var);
                }
            }
        }
    }

    @Override // k8.z1
    public final v0 c() {
        p1 p1Var = this.G;
        t7.y.g(p1Var);
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        return v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.a1 c0(k8.v4 r13) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.c0(k8.v4):k8.a1");
    }

    @Override // k8.z1
    public final n1 d() {
        p1 p1Var = this.G;
        t7.y.g(p1Var);
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        return n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, v4 v4Var) {
        int[] iArr;
        d().D();
        com.google.android.gms.internal.measurement.t4.a();
        g gVarE0 = e0();
        String str = v4Var.f7805v;
        if (!gVarE0.O(str, f0.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    c().B.a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        n nVar = this.f7658x;
                        T(nVar);
                        p1 p1Var = (p1) nVar.f2053w;
                        int i10 = intArray[i];
                        long j8 = longArray[i];
                        t7.y.d(str);
                        nVar.D();
                        nVar.E();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = nVar.u0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j8)});
                                v0 v0Var = p1Var.A;
                                p1.l(v0Var);
                                t0 t0Var = v0Var.J;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb2.append("Pruned ");
                                sb2.append(iDelete);
                                sb2.append(" trigger URIs. appId, source, timestamp");
                                t0Var.d(sb2.toString(), str, Integer.valueOf(i10), Long.valueOf(j8));
                            } catch (SQLiteException e7) {
                                e = e7;
                                v0 v0Var2 = p1Var.A;
                                p1.l(v0Var2);
                                v0Var2.B.c(v0.L(str), e, "Error pruning trigger URIs. appId");
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        n nVar2 = this.f7658x;
        T(nVar2);
        String str2 = v4Var.f7805v;
        t7.y.d(str2);
        nVar2.D();
        nVar2.E();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = nVar2.u0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new b4(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e11) {
                v0 v0Var3 = ((p1) nVar2.f2053w).A;
                p1.l(v0Var3);
                v0Var3.B.c(v0.L(str2), e11, "Error querying trigger uris. appId");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @Override // k8.z1
    public final Context e() {
        return this.G.f7692v;
    }

    public final g e0() {
        p1 p1Var = this.G;
        t7.y.g(p1Var);
        return p1Var.f7695y;
    }

    public final long f() {
        g().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r3 r3Var = this.D;
        r3Var.E();
        r3Var.D();
        c2.v1 v1Var = r3Var.F;
        long jG = v1Var.g();
        if (jG == 0) {
            t4 t4Var = ((p1) r3Var.f2053w).D;
            p1.j(t4Var);
            jG = ((long) t4Var.D0().nextInt(86400000)) + 1;
            v1Var.h(jG);
        }
        return ((((jCurrentTimeMillis + jG) / 1000) / 60) / 60) / 24;
    }

    public final j1 f0() {
        j1 j1Var = this.f7656v;
        T(j1Var);
        return j1Var;
    }

    @Override // k8.z1
    public final x7.a g() {
        p1 p1Var = this.G;
        t7.y.g(p1Var);
        return p1Var.F;
    }

    public final n g0() {
        n nVar = this.f7658x;
        T(nVar);
        return nVar;
    }

    public final void h(String str, v vVar) {
        n nVar = this.f7658x;
        T(nVar);
        a1 a1VarH0 = nVar.H0(str);
        if (a1VarH0 != null) {
            p1 p1Var = a1VarH0.f7349a;
            if (!TextUtils.isEmpty(a1VarH0.O())) {
                Boolean boolP = P(a1VarH0);
                if (boolP == null) {
                    if (!"_ui".equals(vVar.f7791v)) {
                        c().E.b(v0.L(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    c().B.b(v0.L(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strH = a1VarH0.H();
                String strO = a1VarH0.O();
                long jQ = a1VarH0.Q();
                n1 n1Var = p1Var.B;
                p1.l(n1Var);
                n1Var.D();
                String str2 = a1VarH0.f7358l;
                n1 n1Var2 = p1Var.B;
                p1.l(n1Var2);
                n1Var2.D();
                long j8 = a1VarH0.f7359m;
                n1 n1Var3 = p1Var.B;
                p1.l(n1Var3);
                n1Var3.D();
                long j9 = a1VarH0.f7360n;
                n1 n1Var4 = p1Var.B;
                p1.l(n1Var4);
                n1Var4.D();
                boolean z2 = a1VarH0.f7361o;
                String strK = a1VarH0.K();
                n1 n1Var5 = p1Var.B;
                p1.l(n1Var5);
                n1Var5.D();
                boolean z10 = a1VarH0.f7362p;
                Boolean boolX = a1VarH0.x();
                long jB = a1VarH0.b();
                n1 n1Var6 = p1Var.B;
                p1.l(n1Var6);
                n1Var6.D();
                ArrayList arrayList = a1VarH0.f7365s;
                String strG = b(str).g();
                boolean z11 = a1VarH0.z();
                n1 n1Var7 = p1Var.B;
                p1.l(n1Var7);
                n1Var7.D();
                long j10 = a1VarH0.f7368v;
                int i = b(str).f7441b;
                String str3 = o0(str).f7685b;
                n1 n1Var8 = p1Var.B;
                p1.l(n1Var8);
                n1Var8.D();
                int i10 = a1VarH0.f7370x;
                n1 n1Var9 = p1Var.B;
                p1.l(n1Var9);
                n1Var9.D();
                i(vVar, new v4(str, strH, strO, jQ, str2, j8, j9, (String) null, z2, false, strK, 0L, 0, z10, false, boolX, jB, (List) arrayList, strG, "", (String) null, z11, j10, i, str3, i10, a1VarH0.B, a1VarH0.D(), a1VarH0.s(), 0L, a1VarH0.t(), 0L));
                return;
            }
        }
        c().I.b(str, "No app data available; dropping event");
    }

    public final b1 h0() {
        b1 b1Var = this.f7659y;
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007d: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:126), block:B:18:0x007d */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(k8.v r11, k8.v4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.i(k8.v, k8.v4):void");
    }

    public final c i0() {
        c cVar = this.A;
        T(cVar);
        return cVar;
    }

    public final void j(v vVar, v4 v4Var) {
        List listG0;
        p1 p1Var;
        List listG02;
        List listG03;
        Iterator it;
        String str;
        t7.y.g(v4Var);
        String str2 = v4Var.f7805v;
        t7.y.d(str2);
        d().D();
        l0();
        long j8 = vVar.f7794y;
        long j9 = vVar.f7795z;
        w0 w0VarA = w0.a(vVar);
        d().D();
        c3 c3Var = this.f7651a0;
        if (c3Var == null || (str = this.f7652b0) == null || !str.equals(str2)) {
            c3Var = null;
        }
        t4.A0(c3Var, w0VarA.f7814e, false);
        v vVarB = w0VarA.b();
        j0();
        if (TextUtils.isEmpty(v4Var.f7806w)) {
            return;
        }
        if (!v4Var.C) {
            c0(v4Var);
            return;
        }
        List list = v4Var.M;
        if (list != null) {
            String str3 = vVarB.f7791v;
            if (!list.contains(str3)) {
                c().I.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, vVarB.f7793x);
                return;
            } else {
                Bundle bundleD = vVarB.f7792w.d();
                bundleD.putLong("ga_safelisted", 1L);
                vVarB = new v(str3, new u(bundleD), vVarB.f7793x, vVarB.f7794y, vVarB.f7795z);
            }
        }
        n nVar = this.f7658x;
        T(nVar);
        nVar.r0();
        try {
            String str4 = vVarB.f7791v;
            if ("_s".equals(str4)) {
                n nVar2 = this.f7658x;
                T(nVar2);
                if (!nVar2.S(str2, "_s") && vVarB.f7792w.f7778v.getLong("_sid") != 0) {
                    n nVar3 = this.f7658x;
                    T(nVar3);
                    if (nVar3.S(str2, "_f")) {
                        n nVar4 = this.f7658x;
                        T(nVar4);
                        nVar4.W(str2, null, "_sid", k(str2, vVarB));
                    } else {
                        n nVar5 = this.f7658x;
                        T(nVar5);
                        if (nVar5.S(str2, "_v")) {
                            n nVar42 = this.f7658x;
                            T(nVar42);
                            nVar42.W(str2, null, "_sid", k(str2, vVarB));
                        } else {
                            n nVar6 = this.f7658x;
                            T(nVar6);
                            g().getClass();
                            nVar6.W(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(str2, vVarB));
                        }
                    }
                }
            }
            n nVar7 = this.f7658x;
            T(nVar7);
            t7.y.d(str2);
            nVar7.D();
            nVar7.E();
            int i = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
            if (i < 0) {
                v0 v0Var = ((p1) nVar7.f2053w).A;
                p1.l(v0Var);
                v0Var.E.c(v0.L(str2), Long.valueOf(j8), "Invalid time querying timed out conditional properties");
                listG0 = Collections.EMPTY_LIST;
            } else {
                listG0 = nVar7.G0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j8)});
            }
            Iterator it2 = listG0.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                p1Var = this.G;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it2.next();
                if (eVar != null) {
                    Iterator it3 = it2;
                    c().J.d("User property timed out", eVar.f7448v, p1Var.E.c(eVar.f7450x.f7721w), eVar.f7450x.a());
                    v vVar2 = eVar.B;
                    if (vVar2 != null) {
                        l(new v(vVar2, j8, j9), v4Var);
                    }
                    n nVar8 = this.f7658x;
                    T(nVar8);
                    nVar8.E0(str2, eVar.f7450x.f7721w);
                    it2 = it3;
                }
            }
            n nVar9 = this.f7658x;
            T(nVar9);
            t7.y.d(str2);
            nVar9.D();
            nVar9.E();
            if (i < 0) {
                v0 v0Var2 = ((p1) nVar9.f2053w).A;
                p1.l(v0Var2);
                v0Var2.E.c(v0.L(str2), Long.valueOf(j8), "Invalid time querying expired conditional properties");
                listG02 = Collections.EMPTY_LIST;
            } else {
                listG02 = nVar9.G0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j8)});
            }
            ArrayList arrayList = new ArrayList(listG02.size());
            Iterator it4 = listG02.iterator();
            while (it4.hasNext()) {
                e eVar2 = (e) it4.next();
                if (eVar2 != null) {
                    Iterator it5 = it4;
                    int i10 = i;
                    long j10 = j8;
                    c().J.d("User property expired", eVar2.f7448v, p1Var.E.c(eVar2.f7450x.f7721w), eVar2.f7450x.a());
                    n nVar10 = this.f7658x;
                    T(nVar10);
                    nVar10.x0(str2, eVar2.f7450x.f7721w);
                    v vVar3 = eVar2.F;
                    if (vVar3 != null) {
                        arrayList.add(vVar3);
                    }
                    n nVar11 = this.f7658x;
                    T(nVar11);
                    nVar11.E0(str2, eVar2.f7450x.f7721w);
                    it4 = it5;
                    i = i10;
                    j8 = j10;
                }
            }
            int i11 = i;
            long j11 = j8;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                long j12 = j11;
                l(new v((v) obj, j12, j9), v4Var);
                j11 = j12;
                j9 = j9;
            }
            long j13 = j9;
            long j14 = j11;
            n nVar12 = this.f7658x;
            T(nVar12);
            t7.y.d(str2);
            t7.y.d(str4);
            nVar12.D();
            nVar12.E();
            if (i11 < 0) {
                p1 p1Var2 = (p1) nVar12.f2053w;
                v0 v0Var3 = p1Var2.A;
                p1.l(v0Var3);
                v0Var3.E.d("Invalid time querying triggered conditional properties", v0.L(str2), p1Var2.E.a(str4), Long.valueOf(j14));
                listG03 = Collections.EMPTY_LIST;
            } else {
                listG03 = nVar12.G0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j14)});
            }
            ArrayList arrayList2 = new ArrayList(listG03.size());
            Iterator it6 = listG03.iterator();
            while (it6.hasNext()) {
                e eVar3 = (e) it6.next();
                if (eVar3 != null) {
                    q4 q4Var = eVar3.f7450x;
                    String str5 = eVar3.f7448v;
                    t7.y.g(str5);
                    long j15 = j14;
                    String str6 = eVar3.f7449w;
                    String str7 = q4Var.f7721w;
                    Object objA = q4Var.a();
                    t7.y.g(objA);
                    r4 r4Var = new r4(str5, str6, str7, j15, objA);
                    j14 = j15;
                    Object obj2 = r4Var.f7741e;
                    String str8 = r4Var.f7739c;
                    n nVar13 = this.f7658x;
                    T(nVar13);
                    if (nVar13.y0(r4Var)) {
                        it = it6;
                        c().J.d("User property triggered", eVar3.f7448v, p1Var.E.c(str8), obj2);
                    } else {
                        it = it6;
                        c().B.d("Too many active user properties, ignoring", v0.L(eVar3.f7448v), p1Var.E.c(str8), obj2);
                    }
                    v vVar4 = eVar3.D;
                    if (vVar4 != null) {
                        arrayList2.add(vVar4);
                    }
                    eVar3.f7450x = new q4(r4Var);
                    eVar3.f7452z = true;
                    n nVar14 = this.f7658x;
                    T(nVar14);
                    nVar14.C0(eVar3);
                    it6 = it;
                }
            }
            l(vVarB, v4Var);
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj3 = arrayList2.get(i13);
                i13++;
                long j16 = j13;
                l(new v((v) obj3, j14, j16), v4Var);
                j13 = j16;
            }
            n nVar15 = this.f7658x;
            T(nVar15);
            nVar15.s0();
            n nVar16 = this.f7658x;
            T(nVar16);
            nVar16.t0();
        } catch (Throwable th) {
            n nVar17 = this.f7658x;
            T(nVar17);
            nVar17.t0();
            throw th;
        }
    }

    public final p4 j0() {
        p4 p4Var = this.B;
        T(p4Var);
        return p4Var;
    }

    public final Bundle k(String str, v vVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", vVar.f7792w.f7778v.getLong("_sid"));
        n nVar = this.f7658x;
        T(nVar);
        r4 r4VarZ0 = nVar.z0(str, "_sno");
        if (r4VarZ0 != null) {
            Object obj = r4VarZ0.f7741e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final t4 k0() {
        p1 p1Var = this.G;
        t7.y.g(p1Var);
        t4 t4Var = p1Var.D;
        p1.j(t4Var);
        return t4Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:73|(4:75|(0)(1:78)|85|(1:87)(1:88))|77|79|341|80|84|85|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e5, code lost:
    
        ((k8.p1) r10.f2053w).c().H().c(k8.v0.L(r11), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03d1 A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:37:0x01a1, B:40:0x01b0, B:42:0x01b8, B:48:0x01c7, B:90:0x0356, B:99:0x038e, B:101:0x03d1, B:103:0x03d6, B:104:0x03ed, B:106:0x03f8, B:108:0x0412, B:110:0x0418, B:111:0x042f, B:114:0x044c, B:118:0x046b, B:119:0x0482, B:120:0x048b, B:123:0x04a8, B:124:0x04bc, B:126:0x04c4, B:128:0x04ce, B:130:0x04d4, B:131:0x04db, B:132:0x04e8, B:138:0x052d, B:139:0x0542, B:141:0x0571, B:144:0x059b, B:146:0x05a5, B:150:0x05f2, B:152:0x061d, B:154:0x064a, B:155:0x064d, B:157:0x0655, B:158:0x0658, B:160:0x0660, B:161:0x0663, B:163:0x066b, B:164:0x066e, B:166:0x0677, B:167:0x067b, B:169:0x0689, B:170:0x068c, B:173:0x06bd, B:175:0x06cf, B:179:0x06e4, B:184:0x06f2, B:217:0x0774, B:219:0x077a, B:220:0x077d, B:222:0x0795, B:223:0x079f, B:225:0x07ac, B:227:0x07b6, B:228:0x07b9, B:237:0x07ee, B:187:0x06fb, B:191:0x070d, B:195:0x071c, B:199:0x072b, B:203:0x073a, B:207:0x0749, B:211:0x0756, B:215:0x0765, B:151:0x060d, B:135:0x0512, B:93:0x0368, B:94:0x0374, B:96:0x037a, B:98:0x0388, B:53:0x01e5, B:56:0x01f7, B:58:0x020c, B:64:0x0224, B:69:0x0254, B:71:0x025a, B:73:0x0268, B:75:0x0276, B:78:0x0289, B:85:0x0310, B:87:0x031a, B:79:0x02b9, B:80:0x02d2, B:84:0x02fa, B:83:0x02e5, B:67:0x0230, B:68:0x024e), top: B:340:0x01a1, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x08c1 A[Catch: all -> 0x0853, TryCatch #1 {all -> 0x0853, blocks: (B:230:0x07cd, B:232:0x07d1, B:235:0x07e3, B:238:0x07f7, B:240:0x0801, B:242:0x080d, B:244:0x0817, B:246:0x0825, B:248:0x083f, B:252:0x085a, B:254:0x0868, B:255:0x0871, B:257:0x087e, B:259:0x08c1, B:262:0x08cc, B:263:0x08d6, B:264:0x08d7, B:266:0x08e1), top: B:339:0x07cd }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08e1 A[Catch: all -> 0x0853, TRY_LEAVE, TryCatch #1 {all -> 0x0853, blocks: (B:230:0x07cd, B:232:0x07d1, B:235:0x07e3, B:238:0x07f7, B:240:0x0801, B:242:0x080d, B:244:0x0817, B:246:0x0825, B:248:0x083f, B:252:0x085a, B:254:0x0868, B:255:0x0871, B:257:0x087e, B:259:0x08c1, B:262:0x08cc, B:263:0x08d6, B:264:0x08d7, B:266:0x08e1), top: B:339:0x07cd }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x096a A[Catch: all -> 0x090b, TryCatch #6 {all -> 0x090b, blocks: (B:268:0x08e8, B:270:0x08ff, B:274:0x090e, B:276:0x0944, B:278:0x094c, B:280:0x0956, B:281:0x0960, B:283:0x096a, B:284:0x0974, B:285:0x097d, B:287:0x0983, B:289:0x09cd, B:291:0x09df, B:295:0x09fa, B:297:0x0a0a, B:294:0x09ee, B:301:0x0a1d, B:302:0x0a5f, B:303:0x0a6a, B:304:0x0a7f, B:306:0x0a85, B:315:0x0acc, B:316:0x0b1f, B:318:0x0b30, B:332:0x0b97, B:323:0x0b4a, B:324:0x0b4d, B:309:0x0a92, B:311:0x0ab8, B:329:0x0b68, B:330:0x0b81, B:331:0x0b82), top: B:347:0x08e8, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0983 A[Catch: all -> 0x090b, TryCatch #6 {all -> 0x090b, blocks: (B:268:0x08e8, B:270:0x08ff, B:274:0x090e, B:276:0x0944, B:278:0x094c, B:280:0x0956, B:281:0x0960, B:283:0x096a, B:284:0x0974, B:285:0x097d, B:287:0x0983, B:289:0x09cd, B:291:0x09df, B:295:0x09fa, B:297:0x0a0a, B:294:0x09ee, B:301:0x0a1d, B:302:0x0a5f, B:303:0x0a6a, B:304:0x0a7f, B:306:0x0a85, B:315:0x0acc, B:316:0x0b1f, B:318:0x0b30, B:332:0x0b97, B:323:0x0b4a, B:324:0x0b4d, B:309:0x0a92, B:311:0x0ab8, B:329:0x0b68, B:330:0x0b81, B:331:0x0b82), top: B:347:0x08e8, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a85 A[Catch: all -> 0x090b, TryCatch #6 {all -> 0x090b, blocks: (B:268:0x08e8, B:270:0x08ff, B:274:0x090e, B:276:0x0944, B:278:0x094c, B:280:0x0956, B:281:0x0960, B:283:0x096a, B:284:0x0974, B:285:0x097d, B:287:0x0983, B:289:0x09cd, B:291:0x09df, B:295:0x09fa, B:297:0x0a0a, B:294:0x09ee, B:301:0x0a1d, B:302:0x0a5f, B:303:0x0a6a, B:304:0x0a7f, B:306:0x0a85, B:315:0x0acc, B:316:0x0b1f, B:318:0x0b30, B:332:0x0b97, B:323:0x0b4a, B:324:0x0b4d, B:309:0x0a92, B:311:0x0ab8, B:329:0x0b68, B:330:0x0b81, B:331:0x0b82), top: B:347:0x08e8, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b30 A[Catch: all -> 0x090b, SQLiteException -> 0x0b46, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0b46, blocks: (B:316:0x0b1f, B:318:0x0b30), top: B:345:0x0b1f, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0a92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031a A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:37:0x01a1, B:40:0x01b0, B:42:0x01b8, B:48:0x01c7, B:90:0x0356, B:99:0x038e, B:101:0x03d1, B:103:0x03d6, B:104:0x03ed, B:106:0x03f8, B:108:0x0412, B:110:0x0418, B:111:0x042f, B:114:0x044c, B:118:0x046b, B:119:0x0482, B:120:0x048b, B:123:0x04a8, B:124:0x04bc, B:126:0x04c4, B:128:0x04ce, B:130:0x04d4, B:131:0x04db, B:132:0x04e8, B:138:0x052d, B:139:0x0542, B:141:0x0571, B:144:0x059b, B:146:0x05a5, B:150:0x05f2, B:152:0x061d, B:154:0x064a, B:155:0x064d, B:157:0x0655, B:158:0x0658, B:160:0x0660, B:161:0x0663, B:163:0x066b, B:164:0x066e, B:166:0x0677, B:167:0x067b, B:169:0x0689, B:170:0x068c, B:173:0x06bd, B:175:0x06cf, B:179:0x06e4, B:184:0x06f2, B:217:0x0774, B:219:0x077a, B:220:0x077d, B:222:0x0795, B:223:0x079f, B:225:0x07ac, B:227:0x07b6, B:228:0x07b9, B:237:0x07ee, B:187:0x06fb, B:191:0x070d, B:195:0x071c, B:199:0x072b, B:203:0x073a, B:207:0x0749, B:211:0x0756, B:215:0x0765, B:151:0x060d, B:135:0x0512, B:93:0x0368, B:94:0x0374, B:96:0x037a, B:98:0x0388, B:53:0x01e5, B:56:0x01f7, B:58:0x020c, B:64:0x0224, B:69:0x0254, B:71:0x025a, B:73:0x0268, B:75:0x0276, B:78:0x0289, B:85:0x0310, B:87:0x031a, B:79:0x02b9, B:80:0x02d2, B:84:0x02fa, B:83:0x02e5, B:67:0x0230, B:68:0x024e), top: B:340:0x01a1, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0368 A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:37:0x01a1, B:40:0x01b0, B:42:0x01b8, B:48:0x01c7, B:90:0x0356, B:99:0x038e, B:101:0x03d1, B:103:0x03d6, B:104:0x03ed, B:106:0x03f8, B:108:0x0412, B:110:0x0418, B:111:0x042f, B:114:0x044c, B:118:0x046b, B:119:0x0482, B:120:0x048b, B:123:0x04a8, B:124:0x04bc, B:126:0x04c4, B:128:0x04ce, B:130:0x04d4, B:131:0x04db, B:132:0x04e8, B:138:0x052d, B:139:0x0542, B:141:0x0571, B:144:0x059b, B:146:0x05a5, B:150:0x05f2, B:152:0x061d, B:154:0x064a, B:155:0x064d, B:157:0x0655, B:158:0x0658, B:160:0x0660, B:161:0x0663, B:163:0x066b, B:164:0x066e, B:166:0x0677, B:167:0x067b, B:169:0x0689, B:170:0x068c, B:173:0x06bd, B:175:0x06cf, B:179:0x06e4, B:184:0x06f2, B:217:0x0774, B:219:0x077a, B:220:0x077d, B:222:0x0795, B:223:0x079f, B:225:0x07ac, B:227:0x07b6, B:228:0x07b9, B:237:0x07ee, B:187:0x06fb, B:191:0x070d, B:195:0x071c, B:199:0x072b, B:203:0x073a, B:207:0x0749, B:211:0x0756, B:215:0x0765, B:151:0x060d, B:135:0x0512, B:93:0x0368, B:94:0x0374, B:96:0x037a, B:98:0x0388, B:53:0x01e5, B:56:0x01f7, B:58:0x020c, B:64:0x0224, B:69:0x0254, B:71:0x025a, B:73:0x0268, B:75:0x0276, B:78:0x0289, B:85:0x0310, B:87:0x031a, B:79:0x02b9, B:80:0x02d2, B:84:0x02fa, B:83:0x02e5, B:67:0x0230, B:68:0x024e), top: B:340:0x01a1, inners: #3, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(k8.v r42, k8.v4 r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.l(k8.v, k8.v4):void");
    }

    public final void l0() {
        if (!this.H.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void m(a1 a1Var, y9 y9Var) {
        a9.g gVar;
        ia iaVar;
        h hVar;
        d().D();
        l0();
        String strG0 = ((z9) y9Var.f2653w).G0();
        EnumMap enumMap = new EnumMap(c2.class);
        int length = strG0.length();
        int length2 = c2.values().length;
        h hVar2 = h.UNSET;
        int i = 0;
        if (length < length2 || strG0.charAt(0) != '1') {
            gVar = new a9.g(28);
        } else {
            c2[] c2VarArrValues = c2.values();
            int length3 = c2VarArrValues.length;
            int i10 = 0;
            int i11 = 1;
            while (i10 < length3) {
                c2 c2Var = c2VarArrValues[i10];
                int i12 = i11 + 1;
                char cCharAt = strG0.charAt(i11);
                h[] hVarArrValues = h.values();
                int length4 = hVarArrValues.length;
                int i13 = i;
                while (true) {
                    if (i13 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = hVarArrValues[i13];
                    if (hVar.f7557v == cCharAt) {
                        break;
                    } else {
                        i13++;
                    }
                }
                enumMap.put(c2Var, hVar);
                i10++;
                i11 = i12;
                i = 0;
            }
            gVar = new a9.g(enumMap);
        }
        String strE = a1Var.E();
        d().D();
        l0();
        d2 d2VarB = b(strE);
        EnumMap enumMap2 = d2VarB.f7440a;
        c2 c2Var2 = c2.f7422w;
        a2 a2Var = (a2) enumMap2.get(c2Var2);
        a2 a2Var2 = a2.f7373w;
        if (a2Var == null) {
            a2Var = a2Var2;
        }
        int i14 = d2VarB.f7441b;
        int iOrdinal = a2Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (iOrdinal == 1) {
            gVar.F(c2Var2, hVar3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            gVar.E(c2Var2, i14);
        } else {
            gVar.F(c2Var2, hVar4);
        }
        c2 c2Var3 = c2.f7423x;
        a2 a2Var3 = (a2) enumMap2.get(c2Var3);
        if (a2Var3 != null) {
            a2Var2 = a2Var3;
        }
        int iOrdinal2 = a2Var2.ordinal();
        if (iOrdinal2 == 1) {
            gVar.F(c2Var3, hVar3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            gVar.E(c2Var3, i14);
        } else {
            gVar.F(c2Var3, hVar4);
        }
        String strE2 = a1Var.E();
        d().D();
        l0();
        p pVarQ0 = q0(strE2, o0(strE2), b(strE2), gVar);
        String str = pVarQ0.f7687d;
        Boolean bool = pVarQ0.f7686c;
        t7.y.g(bool);
        boolean zBooleanValue = bool.booleanValue();
        y9Var.b();
        ((z9) y9Var.f2653w).k1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            y9Var.b();
            ((z9) y9Var.f2653w).l1(str);
        }
        d().D();
        l0();
        Iterator it = Collections.unmodifiableList(((z9) y9Var.f2653w).a2()).iterator();
        while (true) {
            if (it.hasNext()) {
                iaVar = (ia) it.next();
                if ("_npa".equals(iaVar.w())) {
                    break;
                }
            } else {
                iaVar = null;
                break;
            }
        }
        if (iaVar != null) {
            EnumMap enumMap3 = (EnumMap) gVar.f273w;
            c2 c2Var4 = c2.f7425z;
            h hVar5 = (h) enumMap3.get(c2Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                n nVar = this.f7658x;
                T(nVar);
                r4 r4VarZ0 = nVar.z0(a1Var.E(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (r4VarZ0 != null) {
                    String str2 = r4VarZ0.f7738b;
                    if ("tcf".equals(str2)) {
                        gVar.F(c2Var4, h.TCF);
                    } else if ("app".equals(str2)) {
                        gVar.F(c2Var4, hVar7);
                    } else {
                        gVar.F(c2Var4, hVar6);
                    }
                } else {
                    Boolean boolX = a1Var.x();
                    if (boolX == null || ((boolX.booleanValue() && iaVar.A() != 1) || !(boolX.booleanValue() || iaVar.A() == 0))) {
                        gVar.F(c2Var4, hVar7);
                    } else {
                        gVar.F(c2Var4, hVar6);
                    }
                }
            }
        } else {
            int iF = F(a1Var.E(), gVar);
            ha haVarF = ia.F();
            haVarF.b();
            ((ia) haVarF.f2653w).H("_npa");
            g().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            haVarF.b();
            ((ia) haVarF.f2653w).G(jCurrentTimeMillis);
            haVarF.b();
            ((ia) haVarF.f2653w).K(iF);
            ia iaVar2 = (ia) haVarF.e();
            y9Var.b();
            ((z9) y9Var.f2653w).i0(iaVar2);
            c().J.c("non_personalized_ads(_npa)", Integer.valueOf(iF), "Setting user property");
        }
        String string = gVar.toString();
        y9Var.b();
        ((z9) y9Var.f2653w).j1(string);
        String strE3 = a1Var.E();
        j1 j1Var = this.f7656v;
        j1Var.D();
        j1Var.J(strE3);
        q8 q8VarZ = j1Var.Z(strE3);
        boolean z2 = q8VarZ == null || !q8VarZ.x() || q8VarZ.y();
        List listU = y9Var.U();
        for (int i15 = 0; i15 < listU.size(); i15++) {
            if ("_tcf".equals(((r9) listU.get(i15)).z())) {
                q9 q9Var = (q9) ((r9) listU.get(i15)).l();
                List listH = q9Var.h();
                int i16 = 0;
                while (true) {
                    if (i16 >= listH.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((u9) listH.get(i16)).v())) {
                        String strX = ((u9) listH.get(i16)).x();
                        if (z2 && strX.length() > 4) {
                            char[] charArray = strX.toCharArray();
                            int i17 = 1;
                            while (true) {
                                if (i17 >= 64) {
                                    i17 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17 | 1);
                            strX = String.valueOf(charArray);
                        }
                        t9 t9VarG = u9.G();
                        t9VarG.h("_tcfd");
                        t9VarG.i(strX);
                        q9Var.b();
                        ((r9) q9Var.f2653w).L(i16, (u9) t9VarG.e());
                    } else {
                        i16++;
                    }
                }
                y9Var.W(i15, q9Var);
                return;
            }
        }
    }

    public final void m0(v4 v4Var) {
        d().D();
        l0();
        String str = v4Var.f7805v;
        t7.y.d(str);
        d2 d2VarC = d2.c(v4Var.S, v4Var.N);
        b(str);
        c().J.c(str, d2VarC, "Setting storage consent for package");
        d().D();
        l0();
        this.W.put(str, d2VarC);
        n nVar = this.f7658x;
        T(nVar);
        nVar.j0(str, d2VarC);
    }

    public final void n(a1 a1Var, y9 y9Var) {
        Serializable serializableV;
        d().D();
        l0();
        b9 b9VarZ = e9.Z();
        p1 p1Var = a1Var.f7349a;
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.D();
        byte[] bArr = a1Var.H;
        if (bArr != null) {
            try {
                b9VarZ = (b9) p4.o0(b9VarZ, bArr);
            } catch (com.google.android.gms.internal.measurement.u1 unused) {
                c().E.b(v0.L(a1Var.E()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = y9Var.U().iterator();
        while (it.hasNext()) {
            r9 r9Var = (r9) it.next();
            if (r9Var.z().equals("_cmp")) {
                u9 u9VarN = p4.N(r9Var, "gclid");
                Serializable serializableV2 = u9VarN == null ? null : p4.V(u9VarN);
                if (serializableV2 == null) {
                    serializableV2 = "";
                }
                String str = (String) serializableV2;
                u9 u9VarN2 = p4.N(r9Var, "gbraid");
                Serializable serializableV3 = u9VarN2 == null ? null : p4.V(u9VarN2);
                if (serializableV3 == null) {
                    serializableV3 = "";
                }
                String str2 = (String) serializableV3;
                u9 u9VarN3 = p4.N(r9Var, "gad_source");
                Serializable serializableV4 = u9VarN3 == null ? null : p4.V(u9VarN3);
                if (serializableV4 == null) {
                    serializableV4 = "";
                }
                String str3 = (String) serializableV4;
                u9 u9VarN4 = p4.N(r9Var, "deep_link_url");
                Serializable serializableV5 = u9VarN4 == null ? null : p4.V(u9VarN4);
                String str4 = (String) (serializableV5 != null ? serializableV5 : "");
                String[] strArrSplit = ((String) f0.c1.a(null)).split(",");
                j0();
                HashMap map = new HashMap();
                for (u9 u9Var : r9Var.w()) {
                    Iterator it2 = it;
                    if (Arrays.asList(strArrSplit).contains(u9Var.v()) && (serializableV = p4.V(u9Var)) != null) {
                        map.put(u9Var.v(), serializableV);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (!map.isEmpty()) {
                    u9 u9VarN5 = p4.N(r9Var, "click_timestamp");
                    Serializable serializableV6 = u9VarN5 == null ? null : p4.V(u9VarN5);
                    long jLongValue = ((Long) (serializableV6 != null ? serializableV6 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = r9Var.B();
                    }
                    long j8 = jLongValue;
                    u9 u9VarN6 = p4.N(r9Var, "_cis");
                    if ("referrer API v2".equals(u9VarN6 == null ? null : p4.V(u9VarN6))) {
                        if (j8 > ((e9) b9VarZ.f2653w).W()) {
                            if (str.isEmpty()) {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).x();
                            } else {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).w(str);
                            }
                            if (str2.isEmpty()) {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).z();
                            } else {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).y(str2);
                            }
                            if (str3.isEmpty()) {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).B();
                            } else {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).A(str3);
                            }
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).C(j8);
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).E().clear();
                            HashMap mapG = G(r9Var);
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).E().putAll(mapG);
                        }
                    } else if (j8 > ((e9) b9VarZ.f2653w).O()) {
                        if (str.isEmpty()) {
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).c0();
                        } else {
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).b0(str);
                        }
                        if (str2.isEmpty()) {
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).e0();
                        } else {
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).d0(str2);
                        }
                        if (str3.isEmpty()) {
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).u();
                        } else {
                            b9VarZ.b();
                            ((e9) b9VarZ.f2653w).f0(str3);
                        }
                        if (e0().O(null, f0.f7484b1)) {
                            if (str4.isEmpty()) {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).G();
                            } else {
                                b9VarZ.b();
                                ((e9) b9VarZ.f2653w).F(str4);
                            }
                        }
                        b9VarZ.b();
                        ((e9) b9VarZ.f2653w).v(j8);
                        b9VarZ.b();
                        ((e9) b9VarZ.f2653w).D().clear();
                        HashMap mapG2 = G(r9Var);
                        b9VarZ.b();
                        ((e9) b9VarZ.f2653w).D().putAll(mapG2);
                    }
                }
                it = it3;
            }
        }
        if (!((e9) b9VarZ.e()).equals(e9.a0())) {
            e9 e9Var = (e9) b9VarZ.e();
            y9Var.b();
            ((z9) y9Var.f2653w).p1(e9Var);
        }
        byte[] bArrA = ((e9) b9VarZ.e()).a();
        n1 n1Var2 = p1Var.B;
        p1.l(n1Var2);
        n1Var2.D();
        a1Var.R |= a1Var.H != bArrA;
        a1Var.H = bArrA;
        if (a1Var.o()) {
            n nVar = this.f7658x;
            T(nVar);
            nVar.I0(a1Var, false);
        }
        if (e0().O(null, f0.f7484b1)) {
            for (int i = 0; i < y9Var.V(); i++) {
                r9 r9VarZ1 = ((z9) y9Var.f2653w).Z1(i);
                if ("_cmp".equals(r9VarZ1.z())) {
                    q9 q9Var = (q9) r9VarZ1.l();
                    List listH = q9Var.h();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= listH.size()) {
                            break;
                        }
                        if ("deep_link_url".equals(((u9) listH.get(i10)).v())) {
                            q9Var.m(i10);
                            y9Var.W(i, q9Var);
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        if (e0().O(null, f0.f7481a1)) {
            n nVar2 = this.f7658x;
            T(nVar2);
            nVar2.x0(a1Var.E(), "_lgclid");
        }
    }

    public final void n0(v4 v4Var) {
        d().D();
        l0();
        String str = v4Var.f7805v;
        t7.y.d(str);
        p pVarB = p.b(v4Var.T);
        c().J.c(str, pVarB, "Setting DMA consent for package");
        d().D();
        l0();
        a2 a2VarA = p.c(100, p0(str)).a();
        this.X.put(str, pVarB);
        n nVar = this.f7658x;
        T(nVar);
        t7.y.g(str);
        t7.y.g(pVarB);
        nVar.D();
        nVar.E();
        d2 d2VarX = nVar.X(str);
        d2 d2Var = d2.f7439c;
        if (d2VarX == d2Var) {
            nVar.j0(str, d2Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", pVarB.f7685b);
        nVar.c0(contentValues);
        a2 a2VarA2 = p.c(100, p0(str)).a();
        d().D();
        l0();
        a2 a2Var = a2.f7376z;
        a2 a2Var2 = a2.f7375y;
        boolean z2 = a2VarA == a2Var2 && a2VarA2 == a2Var;
        boolean z10 = a2VarA == a2Var && a2VarA2 == a2Var2;
        if (z2 || z10) {
            c().J.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            n nVar2 = this.f7658x;
            T(nVar2);
            if (nVar2.J0(f(), str, false, false, false, false).f < e0().M(str, f0.f7511m0)) {
                bundle.putLong("_r", 1L);
                n nVar3 = this.f7658x;
                T(nVar3);
                c().J.c(str, Long.valueOf(nVar3.J0(f(), str, false, false, true, false).f), "_dcu realtime event count");
            }
            this.f7655e0.b(str, "_dcu", bundle);
        }
    }

    public final String o(d2 d2Var) {
        if (!d2Var.i(c2.f7423x)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().D0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final p o0(String str) {
        d().D();
        l0();
        HashMap map = this.X;
        p pVar = (p) map.get(str);
        if (pVar != null) {
            return pVar;
        }
        n nVar = this.f7658x;
        T(nVar);
        t7.y.g(str);
        nVar.D();
        nVar.E();
        p pVarB = p.b(nVar.b0("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, pVarB);
        return pVarB;
    }

    public final void p(ArrayList arrayList) {
        t7.y.b(!arrayList.isEmpty());
        if (this.T != null) {
            c().B.a("Set uploading progress before finishing the previous upload");
        } else {
            this.T = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle p0(String str) {
        d().D();
        l0();
        j1 j1Var = this.f7656v;
        T(j1Var);
        if (j1Var.Z(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        d2 d2VarB = b(str);
        Bundle bundle2 = new Bundle();
        Iterator it = d2VarB.f7440a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((a2) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((c2) entry.getKey()).f7426v, str2);
            }
        }
        bundle.putAll(bundle2);
        p pVarQ0 = q0(str, o0(str), d2VarB, new a9.g(28));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : pVarQ0.f7688e.entrySet()) {
            int iOrdinal2 = ((a2) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((c2) entry2.getKey()).f7426v, str3);
            }
        }
        Boolean bool = pVarQ0.f7686c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = pVarQ0.f7687d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        n nVar = this.f7658x;
        T(nVar);
        r4 r4VarZ0 = nVar.z0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (r4VarZ0 != null ? r4VarZ0.f7741e.equals(1L) : F(str, new a9.g(28))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [k8.n4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
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
    public final void q() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.q():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.p q0(java.lang.String r12, k8.p r13, k8.d2 r14, a9.g r15) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.q0(java.lang.String, k8.p, k8.d2, a9.g):k8.p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r22 r24
  0x006f: PHI (r0v115 java.util.List) = (r0v8 java.util.List), (r0v137 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r11v48 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v50 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r22v28 ??) = (r22v40 ??), (r22v41 ??) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r24v7 long) = (r24v2 long), (r24v8 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x08aa A[LOOP:7: B:345:0x08a4->B:347:0x08aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x07fc A[EDGE_INSN: B:447:0x07fc->B:317:0x07fc BREAK  A[LOOP:4: B:263:0x0653->B:316:0x07ee], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0861 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33 */
    /* JADX WARN: Type inference failed for: r22v34 */
    /* JADX WARN: Type inference failed for: r22v35 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r22v42 */
    /* JADX WARN: Type inference failed for: r22v43 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v45 */
    /* JADX WARN: Type inference failed for: r22v46 */
    /* JADX WARN: Type inference failed for: r22v47 */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, k8.n4] */
    /* JADX WARN: Type inference failed for: r8v62, types: [k8.d4] */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.lang.String r34, long r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.r(java.lang.String, long):void");
    }

    public final boolean s(String str, String str2) {
        n nVar = this.f7658x;
        T(nVar);
        a1 a1VarH0 = nVar.H0(str);
        HashMap map = this.Z;
        if (a1VarH0 != null && k0().j0(str, a1VarH0.D())) {
            map.remove(str2);
            return true;
        }
        m4 m4Var = (m4) map.get(str2);
        if (m4Var != null) {
            m4Var.f7635a.g().getClass();
            if (System.currentTimeMillis() < m4Var.f7637c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        n4 n4Var;
        Throwable th;
        Boolean bool;
        d().D();
        l0();
        this.Q = true;
        try {
            p1 p1Var = this.G;
            p1Var.getClass();
            bool = p1Var.o().A;
        } catch (Throwable th2) {
            th = th2;
            n4Var = this;
        }
        try {
            if (bool == null) {
                c().E.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                c().B.a("Upload called in the client side when service should be used");
            } else if (this.J > 0) {
                N();
            } else {
                z0 z0Var = this.f7657w;
                T(z0Var);
                if (z0Var.H()) {
                    n nVar = this.f7658x;
                    T(nVar);
                    if (nVar.J(str)) {
                        n nVar2 = this.f7658x;
                        T(nVar2);
                        t7.y.d(str);
                        nVar2.D();
                        nVar2.E();
                        List listI = nVar2.I(str, f4.a(b3.f7404x), 1);
                        o4 o4Var = listI.isEmpty() ? null : (o4) listI.get(0);
                        if (o4Var != null) {
                            x9 x9Var = o4Var.f7678b;
                            c().J.d("[sgtm] Uploading data from upload queue. appId, type, url", str, o4Var.f7681e, o4Var.f7679c);
                            byte[] bArrA = x9Var.a();
                            if (Log.isLoggable(c().N(), 2)) {
                                p4 p4Var = this.B;
                                T(p4Var);
                                c().J.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), p4Var.e0(x9Var));
                            }
                            i4 i4Var = new i4(o4Var.f7679c, o4Var.f7680d, o4Var.f7681e, null);
                            this.P = true;
                            z0 z0Var2 = this.f7657w;
                            T(z0Var2);
                            n4Var = this;
                            try {
                                z0Var2.K(str, i4Var, x9Var, new hd.a(n4Var, str, o4Var, 14, false));
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                n4Var.Q = false;
                                O();
                                throw th;
                            }
                        }
                        n4Var.Q = false;
                        O();
                    }
                    c().J.b(str, "[sgtm] Upload queue has no batches for appId");
                } else {
                    c().J.a("Network not connected, ignoring upload request");
                    N();
                }
            }
            n4Var = this;
            n4Var.Q = false;
            O();
        } catch (Throwable th4) {
            th = th4;
            n4Var = this;
            n4Var.Q = false;
            O();
            throw th;
        }
    }

    public final void u(String str, boolean z2, Long l10, Long l11) {
        n nVar = this.f7658x;
        T(nVar);
        a1 a1VarH0 = nVar.H0(str);
        if (a1VarH0 != null) {
            p1 p1Var = a1VarH0.f7349a;
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            n1Var.D();
            a1VarH0.R |= a1VarH0.f7371y != z2;
            a1VarH0.f7371y = z2;
            n1 n1Var2 = p1Var.B;
            p1.l(n1Var2);
            n1Var2.D();
            a1VarH0.R |= !Objects.equals(a1VarH0.f7372z, l10);
            a1VarH0.f7372z = l10;
            n1 n1Var3 = p1Var.B;
            p1.l(n1Var3);
            n1Var3.D();
            a1VarH0.R |= !Objects.equals(a1VarH0.A, l11);
            a1VarH0.A = l11;
            if (a1VarH0.o()) {
                n nVar2 = this.f7658x;
                T(nVar2);
                nVar2.I0(a1VarH0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.google.android.gms.internal.measurement.y9 r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.v(com.google.android.gms.internal.measurement.y9, java.lang.String):void");
    }

    public final void w(y9 y9Var, e6.c cVar) {
        String strB0;
        String strB02;
        for (int i = 0; i < y9Var.V(); i++) {
            q9 q9Var = (q9) ((z9) y9Var.f2653w).Z1(i).l();
            Iterator it = q9Var.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((u9) it.next()).v())) {
                    if (((z9) cVar.f4847w).L0() >= e0().M(((z9) cVar.f4847w).u(), f0.f7509l0)) {
                        int iM = e0().M(((z9) cVar.f4847w).u(), f0.f7534y0);
                        LinkedList linkedList = this.L;
                        p4 p4Var = this.B;
                        if (iM > 0) {
                            n nVar = this.f7658x;
                            T(nVar);
                            if (nVar.J0(f(), ((z9) cVar.f4847w).u(), false, false, false, true).f7587g > iM) {
                                t9 t9VarG = u9.G();
                                t9VarG.h("_tnr");
                                t9VarG.j(1L);
                                q9Var.k((u9) t9VarG.e());
                            } else {
                                if (e0().O(((z9) cVar.f4847w).u(), f0.R0)) {
                                    strB02 = k0().B0();
                                    t9 t9VarG2 = u9.G();
                                    t9VarG2.h("_tu");
                                    t9VarG2.i(strB02);
                                    q9Var.k((u9) t9VarG2.e());
                                } else {
                                    strB02 = null;
                                }
                                t9 t9VarG3 = u9.G();
                                t9VarG3.h("_tr");
                                t9VarG3.j(1L);
                                q9Var.k((u9) t9VarG3.e());
                                T(p4Var);
                                b4 b4VarC0 = p4Var.c0(((z9) cVar.f4847w).u(), y9Var, q9Var, strB02);
                                if (b4VarC0 != null) {
                                    c().J.c(((z9) cVar.f4847w).u(), b4VarC0.f7408v, "Generated trigger URI. appId, uri");
                                    n nVar2 = this.f7658x;
                                    T(nVar2);
                                    nVar2.Y(((z9) cVar.f4847w).u(), b4VarC0);
                                    if (!linkedList.contains(((z9) cVar.f4847w).u())) {
                                        linkedList.add(((z9) cVar.f4847w).u());
                                    }
                                }
                            }
                        } else {
                            if (e0().O(((z9) cVar.f4847w).u(), f0.R0)) {
                                strB0 = k0().B0();
                                t9 t9VarG4 = u9.G();
                                t9VarG4.h("_tu");
                                t9VarG4.i(strB0);
                                q9Var.k((u9) t9VarG4.e());
                            } else {
                                strB0 = null;
                            }
                            t9 t9VarG5 = u9.G();
                            t9VarG5.h("_tr");
                            t9VarG5.j(1L);
                            q9Var.k((u9) t9VarG5.e());
                            T(p4Var);
                            b4 b4VarC02 = p4Var.c0(((z9) cVar.f4847w).u(), y9Var, q9Var, strB0);
                            if (b4VarC02 != null) {
                                c().J.c(((z9) cVar.f4847w).u(), b4VarC02.f7408v, "Generated trigger URI. appId, uri");
                                n nVar3 = this.f7658x;
                                T(nVar3);
                                nVar3.Y(((z9) cVar.f4847w).u(), b4VarC02);
                                if (!linkedList.contains(((z9) cVar.f4847w).u())) {
                                    linkedList.add(((z9) cVar.f4847w).u());
                                }
                            }
                        }
                    }
                    r9 r9Var = (r9) q9Var.e();
                    y9Var.b();
                    ((z9) y9Var.f2653w).c0(i, r9Var);
                }
            }
        }
    }

    public final void x(String str, t9 t9Var, Bundle bundle, String str2) {
        int I;
        List listG = e0().O(str2, f0.f7484b1) ? x7.b.g("_o", "_sn", "_sc", "_si", "deep_link_url") : x7.b.g("_o", "_sn", "_sc", "_si");
        if (t4.i0(((u9) t9Var.f2653w).v()) || t4.i0(str)) {
            I = e0().I(str2, true);
        } else {
            g gVarE0 = e0();
            gVarE0.getClass();
            I = Math.max(Math.min(gVarE0.M(str2, f0.f7498h0), 500), 100);
        }
        long j8 = I;
        long jCodePointCount = ((u9) t9Var.f2653w).x().codePointCount(0, ((u9) t9Var.f2653w).x().length());
        k0();
        String strV = ((u9) t9Var.f2653w).v();
        e0();
        String strK = t4.K(strV, true, 40);
        if (jCodePointCount <= j8 || listG.contains(((u9) t9Var.f2653w).v())) {
            return;
        }
        if ("_ev".equals(((u9) t9Var.f2653w).v())) {
            k0();
            bundle.putString("_ev", t4.K(((u9) t9Var.f2653w).x(), true, e0().I(str2, true)));
            return;
        }
        c().G.c(strK, Long.valueOf(jCodePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strK);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((u9) t9Var.f2653w).v());
    }

    public final boolean y(q9 q9Var) {
        ArrayList arrayList = new ArrayList(q9Var.h());
        int i = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("value".equals(((u9) arrayList.get(i11)).v())) {
                i = i11;
            } else if ("currency".equals(((u9) arrayList.get(i11)).v())) {
                i10 = i11;
            }
        }
        if (i == -1) {
            if (!e0().O(null, f0.f7496g1) || !"_iap".equals(q9Var.n())) {
                return true;
            }
            E(q9Var, "_c");
            D(q9Var, 18, "value");
            return false;
        }
        if (!((u9) arrayList.get(i)).y() && !((u9) arrayList.get(i)).C()) {
            c().G.a("Value must be specified with a numeric type.");
            q9Var.m(i);
            E(q9Var, "_c");
            D(q9Var, 18, "value");
            return false;
        }
        if (i10 != -1) {
            String strX = ((u9) arrayList.get(i10)).x();
            if (strX.length() == 3) {
                int iCharCount = 0;
                while (iCharCount < strX.length()) {
                    int iCodePointAt = strX.codePointAt(iCharCount);
                    if (Character.isLetter(iCodePointAt)) {
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return true;
            }
        }
        c().G.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
        q9Var.m(i);
        E(q9Var, "_c");
        D(q9Var, 19, "currency");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0169 A[EDGE_INSN: B:108:0x0169->B:55:0x0169 BREAK  A[LOOP:0: B:36:0x010b->B:110:0x010b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:10:0x002a, B:11:0x0034, B:19:0x0048, B:24:0x0098, B:23:0x0086, B:25:0x00a5, B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0233, B:85:0x0246, B:87:0x0251, B:95:0x0270, B:89:0x0257, B:91:0x0260, B:93:0x0266, B:94:0x026a, B:96:0x0273, B:97:0x027b, B:33:0x00ef, B:98:0x027c), top: B:104:0x0015, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[Catch: all -> 0x0018, PHI: r0
  0x00a5: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:12:0x003b, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:10:0x002a, B:11:0x0034, B:19:0x0048, B:24:0x0098, B:23:0x0086, B:25:0x00a5, B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0233, B:85:0x0246, B:87:0x0251, B:95:0x0270, B:89:0x0257, B:91:0x0260, B:93:0x0266, B:94:0x026a, B:96:0x0273, B:97:0x027b, B:33:0x00ef, B:98:0x027c), top: B:104:0x0015, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0233, B:85:0x0246, B:87:0x0251, B:95:0x0270, B:89:0x0257, B:91:0x0260, B:93:0x0266, B:94:0x026a, B:96:0x0273, B:97:0x027b, B:33:0x00ef), top: B:107:0x00ba, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0233, B:85:0x0246, B:87:0x0251, B:95:0x0270, B:89:0x0257, B:91:0x0260, B:93:0x0266, B:94:0x026a, B:96:0x0273, B:97:0x027b, B:33:0x00ef), top: B:107:0x00ba, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[Catch: all -> 0x0166, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:72:0x0208, B:73:0x0210, B:76:0x021f, B:78:0x0223, B:81:0x022a, B:82:0x022b), top: B:103:0x0102, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174 A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:72:0x0208, B:73:0x0210, B:76:0x021f, B:78:0x0223, B:81:0x022a, B:82:0x022b), top: B:103:0x0102, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce A[Catch: all -> 0x0166, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:72:0x0208, B:73:0x0210, B:76:0x021f, B:78:0x0223, B:81:0x022a, B:82:0x022b), top: B:103:0x0102, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0208 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #0 {all -> 0x0166, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:42:0x0129, B:44:0x0135, B:45:0x0137, B:49:0x014e, B:51:0x0158, B:55:0x0169, B:56:0x016e, B:58:0x0174, B:60:0x0187, B:62:0x019e, B:63:0x01a0, B:65:0x01b2, B:67:0x01ce, B:69:0x01f2, B:70:0x0201, B:72:0x0208, B:73:0x0210, B:76:0x021f, B:78:0x0223, B:81:0x022a, B:82:0x022b), top: B:103:0x0102, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0246 A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0233, B:85:0x0246, B:87:0x0251, B:95:0x0270, B:89:0x0257, B:91:0x0260, B:93:0x0266, B:94:0x026a, B:96:0x0273, B:97:0x027b, B:33:0x00ef), top: B:107:0x00ba, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0257 A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:83:0x0233, B:85:0x0246, B:87:0x0251, B:95:0x0270, B:89:0x0257, B:91:0x0260, B:93:0x0266, B:94:0x026a, B:96:0x0273, B:97:0x027b, B:33:0x00ef), top: B:107:0x00ba, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List r23, java.util.Map r24) {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n4.z(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List, java.util.Map):void");
    }
}
