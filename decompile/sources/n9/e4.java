package n9;

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
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v5;
import com.unity3d.services.UnityAdsConstants;
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
import java.nio.charset.Charset;
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
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e4 implements v1 {

    /* renamed from: h0, reason: collision with root package name */
    public static volatile e4 f9293h0;
    public a1 A;
    public u3 B;
    public c C;
    public final y0 D;
    public y0 E;
    public j3 F;
    public lc.c H;
    public final n1 I;
    public boolean K;
    public long L;
    public ArrayList M;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public FileLock T;
    public FileChannel U;
    public ArrayList V;
    public ArrayList W;
    public final HashMap Y;
    public final HashMap Z;

    /* renamed from: a0, reason: collision with root package name */
    public final HashMap f9294a0;

    /* renamed from: c0, reason: collision with root package name */
    public u2 f9296c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f9297d0;

    /* renamed from: e0, reason: collision with root package name */
    public n3 f9298e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f9299f0;

    /* renamed from: x, reason: collision with root package name */
    public final h1 f9301x;

    /* renamed from: y, reason: collision with root package name */
    public final y0 f9302y;

    /* renamed from: z, reason: collision with root package name */
    public o f9303z;
    public final AtomicBoolean J = new AtomicBoolean(false);
    public final LinkedList N = new LinkedList();

    /* renamed from: b0, reason: collision with root package name */
    public final HashMap f9295b0 = new HashMap();

    /* renamed from: g0, reason: collision with root package name */
    public final k7.c f9300g0 = new k7.c(this, 19);
    public long X = -1;
    public final b4 G = new v3(this);

    /* JADX WARN: Type inference failed for: r0v7, types: [n9.v3, n9.b4] */
    public e4(c9.b bVar) {
        this.I = n1.m(bVar.f1989a, null, null);
        y0 y0Var = new y0(this, 2);
        y0Var.f1();
        this.D = y0Var;
        y0 y0Var2 = new y0(this, 0);
        y0Var2.f1();
        this.f9302y = y0Var2;
        h1 h1Var = new h1(this);
        h1Var.f1();
        this.f9301x = h1Var;
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f9294a0 = new HashMap();
        D().m1(new a1.e(13, this, bVar));
    }

    public static String H(String str, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    if (!((List) entry.getValue()).isEmpty()) {
                        return (String) ((List) entry.getValue()).get(0);
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean N(l4 l4Var) {
        if (!TextUtils.isEmpty(l4Var.f9387y)) {
            return true;
        }
        return false;
    }

    public static final void O(com.google.android.gms.internal.measurement.j3 j3Var) {
        j3Var.b();
        ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).h0(Long.MAX_VALUE);
        j3Var.b();
        ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).i0(Long.MIN_VALUE);
        for (int i6 = 0; i6 < j3Var.V(); i6++) {
            com.google.android.gms.internal.measurement.c3 T1 = ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).T1(i6);
            if (T1.u() < ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).a2()) {
                long u3 = T1.u();
                j3Var.b();
                ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).h0(u3);
            }
            if (T1.u() > ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).c2()) {
                long u10 = T1.u();
                j3Var.b();
                ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).i0(u10);
            }
        }
    }

    public static final void P(z3 z3Var) {
        if (z3Var != null) {
            if (z3Var.A) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(z3Var.getClass())));
            }
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static final Boolean R(l4 l4Var) {
        Boolean bool = l4Var.M;
        String str = l4Var.Z;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((w1) k7.d.W(str).f7747y).ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return Boolean.FALSE;
                    }
                } else {
                    return Boolean.TRUE;
                }
            } else {
                return null;
            }
        }
        return bool;
    }

    public static final void a0(com.google.android.gms.internal.measurement.b3 b3Var, int i6, String str) {
        List h4 = b3Var.h();
        for (int i10 = 0; i10 < h4.size(); i10++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.f3) h4.get(i10)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.e3 B = com.google.android.gms.internal.measurement.f3.B();
        B.h("_err");
        B.j(i6);
        com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) B.e();
        com.google.android.gms.internal.measurement.e3 B2 = com.google.android.gms.internal.measurement.f3.B();
        B2.h("_ev");
        B2.i(str);
        com.google.android.gms.internal.measurement.f3 f3Var2 = (com.google.android.gms.internal.measurement.f3) B2.e();
        b3Var.j(f3Var);
        b3Var.j(f3Var2);
    }

    public static e4 x(Context context) {
        w8.x.g(context);
        w8.x.g(context.getApplicationContext());
        if (f9293h0 == null) {
            synchronized (e4.class) {
                try {
                    if (f9293h0 == null) {
                        f9293h0 = new e4(new c9.b(context, 1));
                    }
                } finally {
                }
            }
        }
        return f9293h0;
    }

    public static final void y(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        List h4 = b3Var.h();
        for (int i6 = 0; i6 < h4.size(); i6++) {
            if (str.equals(((com.google.android.gms.internal.measurement.f3) h4.get(i6)).q())) {
                b3Var.b();
                ((com.google.android.gms.internal.measurement.c3) b3Var.f2337y).E(i6);
                return;
            }
        }
    }

    public final HashMap A(com.google.android.gms.internal.measurement.c3 c3Var) {
        Serializable s12;
        HashMap hashMap = new HashMap();
        g0();
        HashMap hashMap2 = new HashMap();
        for (com.google.android.gms.internal.measurement.f3 f3Var : c3Var.p()) {
            if (f3Var.q().startsWith("gad_") && (s12 = y0.s1(f3Var)) != null) {
                hashMap2.put(f3Var.q(), s12);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void B() {
        D().d1();
        if (!this.N.isEmpty()) {
            if (this.f9298e0 == null) {
                this.f9298e0 = new n3(this, this.I, 2);
            }
            if (this.f9298e0.f9427c != 0) {
                return;
            }
            D0().getClass();
            long max = Math.max(0L, ((Integer) e0.C0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.f9299f0));
            r().L.b(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
            if (this.f9298e0 == null) {
                this.f9298e0 = new n3(this, this.I, 2);
            }
            this.f9298e0.b(max);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0538 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0258 A[Catch: all -> 0x011e, TRY_ENTER, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c0 A[EDGE_INSN: B:185:0x02c0->B:186:0x02c0 BREAK  A[LOOP:9: B:172:0x024a->B:179:0x02b9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f0 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034d A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03bb A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03f1 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0410 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0c4d A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0c94 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0cb7 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0220 A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x042b A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04f8 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x058e A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0017, B:5:0x002f, B:7:0x0038, B:8:0x0057, B:11:0x0073, B:14:0x00a1, B:16:0x00de, B:19:0x00f7, B:21:0x0101, B:24:0x06be, B:25:0x012f, B:28:0x0141, B:30:0x0147, B:34:0x018b, B:36:0x019d, B:39:0x01c4, B:41:0x01ce, B:43:0x01de, B:45:0x01ec, B:47:0x01fc, B:49:0x0207, B:54:0x020a, B:56:0x0220, B:63:0x042b, B:64:0x0437, B:67:0x0441, B:71:0x0464, B:72:0x0453, B:81:0x04ec, B:83:0x04f8, B:86:0x0509, B:88:0x051a, B:90:0x0526, B:92:0x0584, B:94:0x058e, B:95:0x059a, B:97:0x05a4, B:99:0x05b4, B:101:0x05be, B:102:0x05d1, B:104:0x05d7, B:105:0x05f0, B:107:0x05f6, B:109:0x0614, B:111:0x0622, B:113:0x0649, B:114:0x0628, B:116:0x0634, B:120:0x0650, B:121:0x066d, B:123:0x0673, B:126:0x0686, B:131:0x0693, B:133:0x069a, B:135:0x06a8, B:140:0x0538, B:142:0x0544, B:145:0x0557, B:147:0x0568, B:149:0x0574, B:151:0x046c, B:153:0x0478, B:155:0x0484, B:159:0x04cf, B:160:0x04a7, B:163:0x04b9, B:165:0x04bf, B:167:0x04c9, B:172:0x024a, B:175:0x0258, B:177:0x0266, B:179:0x02b9, B:180:0x0289, B:182:0x0299, B:189:0x02c6, B:191:0x02f0, B:192:0x0318, B:194:0x034d, B:195:0x0353, B:198:0x035f, B:200:0x0394, B:201:0x03b1, B:203:0x03bb, B:205:0x03c9, B:207:0x03dc, B:208:0x03d1, B:216:0x03e3, B:219:0x03f1, B:220:0x0410, B:222:0x0151, B:224:0x015e, B:226:0x016c, B:228:0x0172, B:231:0x017d, B:236:0x06d6, B:238:0x06e8, B:240:0x06f1, B:242:0x0721, B:243:0x06f9, B:245:0x0702, B:247:0x0708, B:249:0x0714, B:251:0x071c, B:258:0x0724, B:259:0x0730, B:262:0x0738, B:265:0x074a, B:266:0x0755, B:268:0x075d, B:269:0x078b, B:271:0x07a7, B:272:0x07bc, B:274:0x07d8, B:275:0x07ed, B:277:0x083a, B:279:0x0840, B:280:0x086b, B:282:0x0873, B:283:0x0891, B:285:0x0897, B:286:0x08ab, B:288:0x08c2, B:290:0x08d3, B:292:0x08e5, B:295:0x08f0, B:297:0x08f6, B:298:0x090c, B:300:0x0912, B:304:0x0922, B:306:0x093e, B:309:0x095a, B:311:0x0981, B:312:0x0acb, B:314:0x0adb, B:315:0x099a, B:317:0x09ae, B:318:0x09cb, B:320:0x09f2, B:322:0x0a24, B:324:0x0a31, B:326:0x0a47, B:327:0x0a64, B:329:0x0a8b, B:331:0x0abd, B:338:0x0ae3, B:340:0x0b40, B:341:0x0b53, B:344:0x0b5b, B:347:0x0b7a, B:349:0x0b93, B:351:0x0ba8, B:353:0x0bad, B:355:0x0bb1, B:357:0x0bb5, B:359:0x0bbf, B:360:0x0bc8, B:362:0x0bcc, B:364:0x0bd2, B:365:0x0bdd, B:366:0x0beb, B:369:0x0e4a, B:373:0x0bf2, B:438:0x0c0e, B:376:0x0c2b, B:378:0x0c4d, B:379:0x0c55, B:381:0x0c5b, B:384:0x0c6d, B:389:0x0c94, B:390:0x0cb7, B:392:0x0cc3, B:394:0x0cdb, B:395:0x0d1e, B:400:0x0d3a, B:402:0x0d45, B:404:0x0d49, B:406:0x0d4d, B:408:0x0d51, B:409:0x0d5d, B:410:0x0d62, B:412:0x0d68, B:414:0x0d7e, B:415:0x0d83, B:417:0x0e47, B:419:0x0dc1, B:421:0x0dc5, B:424:0x0dd9, B:426:0x0df5, B:427:0x0dfc, B:430:0x0e3b, B:431:0x0dca, B:436:0x0c7e, B:441:0x0c14, B:443:0x0e50, B:445:0x0e5a, B:446:0x0e6e, B:447:0x0e76, B:449:0x0e7c, B:451:0x0e90, B:453:0x0ea2, B:454:0x0f51, B:456:0x0f57, B:458:0x0f6c, B:461:0x0f73, B:462:0x0fb6, B:463:0x0f82, B:465:0x0f90, B:466:0x0f9d, B:467:0x0fc5, B:471:0x0ebd, B:473:0x0ec3, B:475:0x0ed3, B:476:0x0eda, B:481:0x0ef0, B:482:0x0ef7, B:484:0x0f42, B:485:0x0f49, B:486:0x0f46, B:487:0x0ef4, B:489:0x0ed7, B:490:0x0850, B:492:0x0856, B:494:0x085c, B:495:0x07ea, B:496:0x07b9, B:497:0x0762, B:499:0x0768, B:503:0x0fe0), top: B:2:0x0017, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(java.lang.String r48, long r49) {
        /*
            Method dump skipped, instructions count: 4088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.C(java.lang.String, long):boolean");
    }

    @Override // n9.v1
    public final l1 D() {
        n1 n1Var = this.I;
        w8.x.g(n1Var);
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        return l1Var;
    }

    @Override // n9.v1
    public final a9.a D0() {
        n1 n1Var = this.I;
        w8.x.g(n1Var);
        return n1Var.H;
    }

    public final void E(com.google.android.gms.internal.measurement.j3 j3Var, long j, boolean z10) {
        String str;
        h4 h4Var;
        String str2;
        Object obj;
        if (true != z10) {
            str = "_lte";
        } else {
            str = "_se";
        }
        String str3 = str;
        o oVar = this.f9303z;
        P(oVar);
        h4 Z1 = oVar.Z1(j3Var.o(), str3);
        if (Z1 != null && (obj = Z1.f9344e) != null) {
            String o10 = j3Var.o();
            D0().getClass();
            h4Var = new h4(o10, "auto", str3, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        } else {
            String o11 = j3Var.o();
            D0().getClass();
            h4Var = new h4(o11, "auto", str3, System.currentTimeMillis(), Long.valueOf(j));
        }
        com.google.android.gms.internal.measurement.s3 A = com.google.android.gms.internal.measurement.t3.A();
        A.b();
        ((com.google.android.gms.internal.measurement.t3) A.f2337y).C(str3);
        D0().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        A.b();
        ((com.google.android.gms.internal.measurement.t3) A.f2337y).B(currentTimeMillis);
        Object obj2 = h4Var.f9344e;
        long longValue = ((Long) obj2).longValue();
        A.b();
        ((com.google.android.gms.internal.measurement.t3) A.f2337y).F(longValue);
        com.google.android.gms.internal.measurement.t3 t3Var = (com.google.android.gms.internal.measurement.t3) A.e();
        int R1 = y0.R1(j3Var, str3);
        if (R1 >= 0) {
            j3Var.b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).c0(R1, t3Var);
        } else {
            j3Var.b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).d0(t3Var);
        }
        if (j > 0) {
            o oVar2 = this.f9303z;
            P(oVar2);
            oVar2.Y1(h4Var);
            if (true != z10) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            r().L.c(str2, obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean F(com.google.android.gms.internal.measurement.b3 b3Var, com.google.android.gms.internal.measurement.b3 b3Var2) {
        String s;
        w8.x.b("_e".equals(b3Var.l()));
        g0();
        com.google.android.gms.internal.measurement.f3 l12 = y0.l1((com.google.android.gms.internal.measurement.c3) b3Var.e(), "_sc");
        String str = null;
        if (l12 == null) {
            s = null;
        } else {
            s = l12.s();
        }
        g0();
        com.google.android.gms.internal.measurement.f3 l13 = y0.l1((com.google.android.gms.internal.measurement.c3) b3Var2.e(), "_pc");
        if (l13 != null) {
            str = l13.s();
        }
        if (str != null && str.equals(s)) {
            w8.x.b("_e".equals(b3Var.l()));
            g0();
            com.google.android.gms.internal.measurement.f3 l14 = y0.l1((com.google.android.gms.internal.measurement.c3) b3Var.e(), "_et");
            if (l14 != null && l14.t() && l14.u() > 0) {
                long u3 = l14.u();
                g0();
                com.google.android.gms.internal.measurement.f3 l15 = y0.l1((com.google.android.gms.internal.measurement.c3) b3Var2.e(), "_et");
                if (l15 != null && l15.u() > 0) {
                    u3 += l15.u();
                }
                g0();
                y0.j1(b3Var2, "_et", Long.valueOf(u3));
                g0();
                y0.j1(b3Var, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean G() {
        D().d1();
        i0();
        o oVar = this.f9303z;
        P(oVar);
        if (oVar.z1("select count(1) > 0 from raw_events", null) == 0) {
            o oVar2 = this.f9303z;
            P(oVar2);
            if (!TextUtils.isEmpty(oVar2.l1())) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.I():void");
    }

    public final void J() {
        D().d1();
        if (!this.Q && !this.R && !this.S) {
            r().L.a("Stopping uploading service(s)");
            ArrayList arrayList = this.M;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ((Runnable) obj).run();
            }
            ArrayList arrayList2 = this.M;
            w8.x.g(arrayList2);
            arrayList2.clear();
            return;
        }
        r().L.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.Q), Boolean.valueOf(this.R), Boolean.valueOf(this.S));
    }

    public final Boolean K(z0 z0Var) {
        try {
            long P = z0Var.P();
            n1 n1Var = this.I;
            if (P != -2147483648L) {
                if (z0Var.P() == c9.c.a(n1Var.f9413x).b(0, z0Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c9.c.a(n1Var.f9413x).b(0, z0Var.D()).versionName;
                String N = z0Var.N();
                if (N != null && N.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final l4 L(String str) {
        o oVar = this.f9303z;
        P(oVar);
        z0 h22 = oVar.h2(str);
        if (h22 != null) {
            n1 n1Var = h22.f9545a;
            if (!TextUtils.isEmpty(h22.N())) {
                Boolean K = K(h22);
                if (K != null && !K.booleanValue()) {
                    r().D.b(u0.l1(str), "App version does not match; dropping. appId");
                    return null;
                }
                String G = h22.G();
                String N = h22.N();
                long P = h22.P();
                l1 l1Var = n1Var.D;
                n1.g(l1Var);
                l1Var.d1();
                String str2 = h22.f9555l;
                l1 l1Var2 = n1Var.D;
                n1.g(l1Var2);
                l1Var2.d1();
                long j = h22.f9556m;
                l1 l1Var3 = n1Var.D;
                n1.g(l1Var3);
                l1Var3.d1();
                long j10 = h22.f9557n;
                l1 l1Var4 = n1Var.D;
                n1.g(l1Var4);
                l1Var4.d1();
                boolean z10 = h22.f9558o;
                String J = h22.J();
                l1 l1Var5 = n1Var.D;
                n1.g(l1Var5);
                l1Var5.d1();
                boolean z11 = h22.f9559p;
                Boolean w10 = h22.w();
                long b10 = h22.b();
                l1 l1Var6 = n1Var.D;
                n1.g(l1Var6);
                l1Var6.d1();
                ArrayList arrayList = h22.s;
                String g10 = a(str).g();
                boolean y9 = h22.y();
                l1 l1Var7 = n1Var.D;
                n1.g(l1Var7);
                l1Var7.d1();
                long j11 = h22.f9564v;
                int i6 = a(str).f9571b;
                String str3 = l0(str).f9440b;
                l1 l1Var8 = n1Var.D;
                n1.g(l1Var8);
                l1Var8.d1();
                int i10 = h22.f9566x;
                l1 l1Var9 = n1Var.D;
                n1.g(l1Var9);
                l1Var9.d1();
                return new l4(str, G, N, P, str2, j, j10, (String) null, z10, false, J, 0L, 0, z11, false, w10, b10, (List) arrayList, g10, HttpUrl.FRAGMENT_ENCODE_SET, (String) null, y9, j11, i6, str3, i10, h22.B, h22.C(), h22.s(), 0L, h22.t());
            }
        }
        r().K.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean M(String str, String str2) {
        o oVar = this.f9303z;
        P(oVar);
        s D1 = oVar.D1("events", str, str2);
        if (D1 != null && D1.f9461c >= 1) {
            return false;
        }
        return true;
    }

    @Override // n9.v1
    public final w8.l Q() {
        return this.I.f9415z;
    }

    public final void S(g4 g4Var, l4 l4Var) {
        String str;
        long O1;
        long j;
        int i6;
        int i10;
        D().d1();
        i0();
        boolean N = N(l4Var);
        String str2 = l4Var.f9386x;
        if (N) {
            if (!l4Var.E) {
                Y(l4Var);
                return;
            }
            j4 h02 = h0();
            String str3 = g4Var.f9332y;
            int j22 = h02.j2(str3);
            k7.c cVar = this.f9300g0;
            if (j22 != 0) {
                h0();
                b0();
                String i12 = j4.i1(str3, true, 24);
                if (str3 != null) {
                    i10 = str3.length();
                } else {
                    i10 = 0;
                }
                h0();
                j4.t1(cVar, l4Var.f9386x, j22, "_ev", i12, i10);
                return;
            }
            int q12 = h0().q1(g4Var.a(), str3);
            if (q12 != 0) {
                h0();
                b0();
                String i13 = j4.i1(str3, true, 24);
                Object a10 = g4Var.a();
                if (a10 == null || (!(a10 instanceof String) && !(a10 instanceof CharSequence))) {
                    i6 = 0;
                } else {
                    i6 = a10.toString().length();
                }
                h0();
                j4.t1(cVar, l4Var.f9386x, q12, "_ev", i13, i6);
                return;
            }
            Object r12 = h0().r1(g4Var.a(), str3);
            if (r12 != null) {
                if (!"_sid".equals(str3)) {
                    str = "_sid";
                } else {
                    long j10 = g4Var.f9333z;
                    String str4 = g4Var.C;
                    w8.x.g(str2);
                    o oVar = this.f9303z;
                    P(oVar);
                    h4 Z1 = oVar.Z1(str2, "_sno");
                    if (Z1 != null) {
                        Object obj = Z1.f9344e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            S(new g4(j10, Long.valueOf(j + 1), "_sno", str4), l4Var);
                        }
                    }
                    if (Z1 != null) {
                        r().G.b(Z1.f9344e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    o oVar2 = this.f9303z;
                    P(oVar2);
                    s D1 = oVar2.D1("events", str2, "_s");
                    if (D1 == null) {
                        str = "_sid";
                        j = 0;
                    } else {
                        s0 s0Var = r().L;
                        str = "_sid";
                        long j11 = D1.f9461c;
                        s0Var.b(Long.valueOf(j11), "Backfill the session number. Last used session number");
                        j = j11;
                    }
                    S(new g4(j10, Long.valueOf(j + 1), "_sno", str4), l4Var);
                }
                w8.x.g(str2);
                String str5 = g4Var.C;
                w8.x.g(str5);
                h4 h4Var = new h4(str2, str5, str3, g4Var.f9333z, r12);
                s0 s0Var2 = r().L;
                n1 n1Var = this.I;
                p0 p0Var = n1Var.G;
                String str6 = h4Var.f9342c;
                s0Var2.c(p0Var.c(str6), r12, "Setting user property");
                o oVar3 = this.f9303z;
                P(oVar3);
                oVar3.R1();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = h4Var.f9344e;
                    if (equals) {
                        o oVar4 = this.f9303z;
                        P(oVar4);
                        h4 Z12 = oVar4.Z1(str2, "_id");
                        if (Z12 != null && !obj2.equals(Z12.f9344e)) {
                            o oVar5 = this.f9303z;
                            P(oVar5);
                            oVar5.X1(str2, "_lair");
                        }
                    }
                    Y(l4Var);
                    o oVar6 = this.f9303z;
                    P(oVar6);
                    boolean Y1 = oVar6.Y1(h4Var);
                    if (str.equals(str3)) {
                        y0 y0Var = this.D;
                        P(y0Var);
                        String str7 = l4Var.R;
                        if (TextUtils.isEmpty(str7)) {
                            O1 = 0;
                        } else {
                            O1 = y0Var.O1(str7.getBytes(Charset.forName("UTF-8")));
                        }
                        o oVar7 = this.f9303z;
                        P(oVar7);
                        z0 h22 = oVar7.h2(str2);
                        if (h22 != null) {
                            h22.A(O1);
                            if (h22.o()) {
                                o oVar8 = this.f9303z;
                                P(oVar8);
                                oVar8.i2(h22, false);
                            }
                        }
                    }
                    o oVar9 = this.f9303z;
                    P(oVar9);
                    oVar9.S1();
                    if (!Y1) {
                        r().D.c(n1Var.G.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        h0();
                        j4.t1(cVar, str2, 9, null, null, 0);
                    }
                    o oVar10 = this.f9303z;
                    P(oVar10);
                    oVar10.T1();
                } catch (Throwable th) {
                    o oVar11 = this.f9303z;
                    P(oVar11);
                    oVar11.T1();
                    throw th;
                }
            }
        }
    }

    public final void T(String str, l4 l4Var) {
        long j;
        D().d1();
        i0();
        boolean N = N(l4Var);
        String str2 = l4Var.f9386x;
        if (!N) {
            return;
        }
        if (!l4Var.E) {
            Y(l4Var);
            return;
        }
        Boolean R = R(l4Var);
        if ("_npa".equals(str) && R != null) {
            r().K.a("Falling back to manifest metadata value for ad personalization");
            D0().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (true != R.booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            S(new g4(currentTimeMillis, Long.valueOf(j), "_npa", "auto"), l4Var);
            return;
        }
        s0 s0Var = r().K;
        n1 n1Var = this.I;
        s0Var.b(n1Var.G.c(str), "Removing user property");
        o oVar = this.f9303z;
        P(oVar);
        oVar.R1();
        try {
            Y(l4Var);
            if ("_id".equals(str)) {
                o oVar2 = this.f9303z;
                P(oVar2);
                w8.x.g(str2);
                oVar2.X1(str2, "_lair");
            }
            o oVar3 = this.f9303z;
            P(oVar3);
            w8.x.g(str2);
            oVar3.X1(str2, str);
            o oVar4 = this.f9303z;
            P(oVar4);
            oVar4.S1();
            r().K.b(n1Var.G.c(str), "User property removed");
            o oVar5 = this.f9303z;
            P(oVar5);
            oVar5.T1();
        } catch (Throwable th) {
            o oVar6 = this.f9303z;
            P(oVar6);
            oVar6.T1();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:73|74|(2:76|(8:78|(3:80|(2:82|(1:84))(1:104)|103)(1:105)|85|(1:87)(1:102)|88|89|90|(4:92|(1:94)(1:98)|95|(1:97))))|106|89|90|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0345, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0346, code lost:
    
        r2.r().D.c(n9.u0.l1(r3), r0, "Application info is null, first open report might be inaccurate. appId");
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e2 A[Catch: all -> 0x02c6, TryCatch #3 {all -> 0x02c6, blocks: (B:60:0x0291, B:62:0x02af, B:67:0x0377, B:68:0x037a, B:69:0x0406, B:74:0x02c9, B:76:0x02e8, B:78:0x02f0, B:80:0x02f6, B:84:0x0308, B:85:0x031a, B:88:0x0326, B:90:0x0339, B:101:0x0346, B:92:0x0358, B:94:0x0360, B:95:0x0368, B:97:0x036e, B:104:0x0313, B:109:0x02d6, B:152:0x0393, B:154:0x03c7, B:155:0x03ca, B:156:0x03e2, B:158:0x03ea), top: B:45:0x0138, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x012c A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x014f, B:120:0x0195, B:160:0x012c, B:161:0x0114, B:162:0x00f5, B:166:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0114 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x014f, B:120:0x0195, B:160:0x012c, B:161:0x0114, B:162:0x00f5, B:166:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x014f, B:120:0x0195, B:160:0x012c, B:161:0x0114, B:162:0x00f5, B:166:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x014f, B:120:0x0195, B:160:0x012c, B:161:0x0114, B:162:0x00f5, B:166:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x014f, B:120:0x0195, B:160:0x012c, B:161:0x0114, B:162:0x00f5, B:166:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0289 A[Catch: all -> 0x01db, TryCatch #5 {all -> 0x01db, blocks: (B:116:0x0175, B:118:0x0181, B:55:0x025e, B:57:0x0289, B:58:0x028c, B:124:0x01a7, B:126:0x01cf, B:127:0x01e0, B:129:0x01e7, B:131:0x01ed, B:133:0x01f7, B:135:0x01fd, B:137:0x0203, B:139:0x0209, B:141:0x020e, B:144:0x0227, B:149:0x022b, B:150:0x023c, B:151:0x0247, B:54:0x0252), top: B:115:0x0175, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02af A[Catch: all -> 0x02c6, TRY_LEAVE, TryCatch #3 {all -> 0x02c6, blocks: (B:60:0x0291, B:62:0x02af, B:67:0x0377, B:68:0x037a, B:69:0x0406, B:74:0x02c9, B:76:0x02e8, B:78:0x02f0, B:80:0x02f6, B:84:0x0308, B:85:0x031a, B:88:0x0326, B:90:0x0339, B:101:0x0346, B:92:0x0358, B:94:0x0360, B:95:0x0368, B:97:0x036e, B:104:0x0313, B:109:0x02d6, B:152:0x0393, B:154:0x03c7, B:155:0x03ca, B:156:0x03e2, B:158:0x03ea), top: B:45:0x0138, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0377 A[Catch: all -> 0x02c6, TryCatch #3 {all -> 0x02c6, blocks: (B:60:0x0291, B:62:0x02af, B:67:0x0377, B:68:0x037a, B:69:0x0406, B:74:0x02c9, B:76:0x02e8, B:78:0x02f0, B:80:0x02f6, B:84:0x0308, B:85:0x031a, B:88:0x0326, B:90:0x0339, B:101:0x0346, B:92:0x0358, B:94:0x0360, B:95:0x0368, B:97:0x036e, B:104:0x0313, B:109:0x02d6, B:152:0x0393, B:154:0x03c7, B:155:0x03ca, B:156:0x03e2, B:158:0x03ea), top: B:45:0x0138, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0358 A[Catch: all -> 0x02c6, TryCatch #3 {all -> 0x02c6, blocks: (B:60:0x0291, B:62:0x02af, B:67:0x0377, B:68:0x037a, B:69:0x0406, B:74:0x02c9, B:76:0x02e8, B:78:0x02f0, B:80:0x02f6, B:84:0x0308, B:85:0x031a, B:88:0x0326, B:90:0x0339, B:101:0x0346, B:92:0x0358, B:94:0x0360, B:95:0x0368, B:97:0x036e, B:104:0x0313, B:109:0x02d6, B:152:0x0393, B:154:0x03c7, B:155:0x03ca, B:156:0x03e2, B:158:0x03ea), top: B:45:0x0138, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [n9.l4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [n9.e4] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [n9.e4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(n9.l4 r32) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.U(n9.l4):void");
    }

    public final void V(e eVar, l4 l4Var) {
        v vVar;
        w8.x.d(eVar.f9223x);
        w8.x.g(eVar.f9224y);
        w8.x.g(eVar.f9225z);
        w8.x.d(eVar.f9225z.f9332y);
        D().d1();
        i0();
        if (!N(l4Var)) {
            return;
        }
        if (!l4Var.E) {
            Y(l4Var);
            return;
        }
        e eVar2 = new e(eVar);
        boolean z10 = false;
        eVar2.B = false;
        o oVar = this.f9303z;
        P(oVar);
        oVar.R1();
        try {
            o oVar2 = this.f9303z;
            P(oVar2);
            String str = eVar2.f9223x;
            w8.x.g(str);
            e d22 = oVar2.d2(str, eVar2.f9225z.f9332y);
            n1 n1Var = this.I;
            if (d22 != null && !d22.f9224y.equals(eVar2.f9224y)) {
                r().G.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", n1Var.G.c(eVar2.f9225z.f9332y), eVar2.f9224y, d22.f9224y);
            }
            if (d22 != null && d22.B) {
                eVar2.f9224y = d22.f9224y;
                eVar2.A = d22.A;
                eVar2.E = d22.E;
                eVar2.C = d22.C;
                eVar2.F = d22.F;
                eVar2.B = true;
                g4 g4Var = eVar2.f9225z;
                eVar2.f9225z = new g4(d22.f9225z.f9333z, g4Var.a(), g4Var.f9332y, d22.f9225z.C);
            } else if (TextUtils.isEmpty(eVar2.C)) {
                g4 g4Var2 = eVar2.f9225z;
                eVar2.f9225z = new g4(eVar2.A, g4Var2.a(), g4Var2.f9332y, eVar2.f9225z.C);
                eVar2.B = true;
                z10 = true;
            }
            if (eVar2.B) {
                g4 g4Var3 = eVar2.f9225z;
                String str2 = eVar2.f9223x;
                w8.x.g(str2);
                String str3 = eVar2.f9224y;
                String str4 = g4Var3.f9332y;
                long j = g4Var3.f9333z;
                Object a10 = g4Var3.a();
                w8.x.g(a10);
                h4 h4Var = new h4(str2, str3, str4, j, a10);
                Object obj = h4Var.f9344e;
                String str5 = h4Var.f9342c;
                o oVar3 = this.f9303z;
                P(oVar3);
                if (oVar3.Y1(h4Var)) {
                    r().K.d("User property updated immediately", eVar2.f9223x, n1Var.G.c(str5), obj);
                } else {
                    r().D.d("(2)Too many active user properties, ignoring", u0.l1(eVar2.f9223x), n1Var.G.c(str5), obj);
                }
                if (z10 && (vVar = eVar2.F) != null) {
                    g(new v(vVar, eVar2.A), l4Var);
                }
            }
            o oVar4 = this.f9303z;
            P(oVar4);
            if (oVar4.c2(eVar2)) {
                r().K.d("Conditional property added", eVar2.f9223x, n1Var.G.c(eVar2.f9225z.f9332y), eVar2.f9225z.a());
            } else {
                r().D.d("Too many conditional properties, ignoring", u0.l1(eVar2.f9223x), n1Var.G.c(eVar2.f9225z.f9332y), eVar2.f9225z.a());
            }
            o oVar5 = this.f9303z;
            P(oVar5);
            oVar5.S1();
            o oVar6 = this.f9303z;
            P(oVar6);
            oVar6.T1();
        } catch (Throwable th) {
            o oVar7 = this.f9303z;
            P(oVar7);
            oVar7.T1();
            throw th;
        }
    }

    public final void W(e eVar, l4 l4Var) {
        Bundle bundle;
        w8.x.d(eVar.f9223x);
        w8.x.g(eVar.f9225z);
        w8.x.d(eVar.f9225z.f9332y);
        D().d1();
        i0();
        if (!N(l4Var)) {
            return;
        }
        if (!l4Var.E) {
            Y(l4Var);
            return;
        }
        o oVar = this.f9303z;
        P(oVar);
        oVar.R1();
        try {
            Y(l4Var);
            String str = eVar.f9223x;
            w8.x.g(str);
            o oVar2 = this.f9303z;
            P(oVar2);
            e d22 = oVar2.d2(str, eVar.f9225z.f9332y);
            n1 n1Var = this.I;
            if (d22 != null) {
                r().K.c(eVar.f9223x, n1Var.G.c(eVar.f9225z.f9332y), "Removing conditional user property");
                o oVar3 = this.f9303z;
                P(oVar3);
                oVar3.e2(str, eVar.f9225z.f9332y);
                if (d22.B) {
                    o oVar4 = this.f9303z;
                    P(oVar4);
                    oVar4.X1(str, eVar.f9225z.f9332y);
                }
                v vVar = eVar.H;
                if (vVar != null) {
                    u uVar = vVar.f9501y;
                    if (uVar != null) {
                        bundle = uVar.d();
                    } else {
                        bundle = null;
                    }
                    v G1 = h0().G1(vVar.f9500x, bundle, d22.f9224y, vVar.A, true);
                    w8.x.g(G1);
                    g(G1, l4Var);
                }
            } else {
                r().G.c(u0.l1(eVar.f9223x), n1Var.G.c(eVar.f9225z.f9332y), "Conditional user property doesn't exist");
            }
            o oVar5 = this.f9303z;
            P(oVar5);
            oVar5.S1();
            o oVar6 = this.f9303z;
            P(oVar6);
            oVar6.T1();
        } catch (Throwable th) {
            o oVar7 = this.f9303z;
            P(oVar7);
            oVar7.T1();
            throw th;
        }
    }

    public final void X(l4 l4Var, long j) {
        boolean z10;
        o oVar = this.f9303z;
        P(oVar);
        String str = l4Var.f9386x;
        w8.x.g(str);
        z0 h22 = oVar.h2(str);
        if (h22 != null) {
            h0();
            String str2 = l4Var.f9387y;
            String G = h22.G();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(G);
            if (!isEmpty && !isEmpty2) {
                w8.x.g(str2);
                if (!str2.equals(G)) {
                    r().G.b(u0.l1(h22.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    o oVar2 = this.f9303z;
                    P(oVar2);
                    n1 n1Var = (n1) oVar2.f4301y;
                    String D = h22.D();
                    oVar2.e1();
                    oVar2.d1();
                    w8.x.d(D);
                    try {
                        SQLiteDatabase U1 = oVar2.U1();
                        String[] strArr = {D};
                        int delete = U1.delete("events", "app_id=?", strArr) + U1.delete("user_attributes", "app_id=?", strArr) + U1.delete("conditional_properties", "app_id=?", strArr) + U1.delete("apps", "app_id=?", strArr) + U1.delete("raw_events", "app_id=?", strArr) + U1.delete("raw_events_metadata", "app_id=?", strArr) + U1.delete("event_filters", "app_id=?", strArr) + U1.delete("property_filters", "app_id=?", strArr) + U1.delete("audience_filter_values", "app_id=?", strArr) + U1.delete("consent_settings", "app_id=?", strArr) + U1.delete("default_event_params", "app_id=?", strArr) + U1.delete("trigger_uris", "app_id=?", strArr);
                        if (n1Var.A.n1(null, e0.f9253j1)) {
                            delete += U1.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            u0 u0Var = n1Var.C;
                            n1.g(u0Var);
                            u0Var.L.c(D, Integer.valueOf(delete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e10) {
                        u0 u0Var2 = n1Var.C;
                        n1.g(u0Var2);
                        u0Var2.D.c(u0.l1(D), e10, "Error deleting application data. appId, error");
                    }
                    h22 = null;
                }
            }
        }
        if (h22 != null) {
            boolean z11 = true;
            if (h22.P() != -2147483648L && h22.P() != l4Var.G) {
                z10 = true;
            } else {
                z10 = false;
            }
            String N = h22.N();
            if (h22.P() != -2147483648L || N == null || N.equals(l4Var.f9388z)) {
                z11 = false;
            }
            if (z11 | z10) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", N);
                v vVar = new v("_au", new u(bundle), "auto", j);
                if (b0().n1(null, e0.f9239e1)) {
                    d(vVar, l4Var);
                } else {
                    e(vVar, l4Var);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.z0 Y(n9.l4 r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.Y(n9.l4):n9.z0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List Z(Bundle bundle, l4 l4Var) {
        int[] iArr;
        D().d1();
        t8.a();
        g b02 = b0();
        String str = l4Var.f9386x;
        if (b02.n1(str, e0.Q0) && str != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        int i6 = 0;
                        while (i6 < intArray.length) {
                            o oVar = this.f9303z;
                            P(oVar);
                            n1 n1Var = (n1) oVar.f4301y;
                            int i10 = intArray[i6];
                            long j = longArray[i6];
                            w8.x.d(str);
                            oVar.d1();
                            oVar.e1();
                            try {
                                iArr = intArray;
                                try {
                                    int delete = oVar.U1().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j)});
                                    u0 u0Var = n1Var.C;
                                    n1.g(u0Var);
                                    s0 s0Var = u0Var.L;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 46);
                                    sb2.append("Pruned ");
                                    sb2.append(delete);
                                    sb2.append(" trigger URIs. appId, source, timestamp");
                                    s0Var.d(sb2.toString(), str, Integer.valueOf(i10), Long.valueOf(j));
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    u0 u0Var2 = n1Var.C;
                                    n1.g(u0Var2);
                                    u0Var2.D.c(u0.l1(str), e, "Error pruning trigger URIs. appId");
                                    i6++;
                                    intArray = iArr;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                iArr = intArray;
                            }
                            i6++;
                            intArray = iArr;
                        }
                    } else {
                        r().D.a("Uri sources and timestamps do not match");
                    }
                }
            }
            o oVar2 = this.f9303z;
            P(oVar2);
            String str2 = l4Var.f9386x;
            w8.x.d(str2);
            oVar2.d1();
            oVar2.e1();
            ?? arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                try {
                    cursor = oVar2.U1().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                        do {
                            String string = cursor.getString(0);
                            if (string == null) {
                                string = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            arrayList.add(new t3(cursor.getInt(2), string, cursor.getLong(1)));
                        } while (cursor.moveToNext());
                    }
                } catch (SQLiteException e12) {
                    u0 u0Var3 = ((n1) oVar2.f4301y).C;
                    n1.g(u0Var3);
                    u0Var3.D.c(u0.l1(str2), e12, "Error querying trigger uris. appId");
                    arrayList = Collections.EMPTY_LIST;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return new ArrayList();
    }

    public final z1 a(String str) {
        z1 z1Var = z1.f9569c;
        D().d1();
        i0();
        HashMap hashMap = this.Y;
        z1 z1Var2 = (z1) hashMap.get(str);
        if (z1Var2 == null) {
            o oVar = this.f9303z;
            P(oVar);
            z1Var2 = oVar.y1(str);
            if (z1Var2 == null) {
                z1Var2 = z1.f9569c;
            }
            D().d1();
            i0();
            hashMap.put(str, z1Var2);
            o oVar2 = this.f9303z;
            P(oVar2);
            oVar2.K1(str, z1Var2);
        }
        return z1Var2;
    }

    public final long b() {
        D0().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        j3 j3Var = this.F;
        j3Var.e1();
        j3Var.d1();
        a2.d2 d2Var = j3Var.H;
        long c10 = d2Var.c();
        if (c10 == 0) {
            n1.e(((n1) j3Var.f4301y).F);
            c10 = r2.b2().nextInt(86400000) + 1;
            d2Var.h(c10);
        }
        return ((((currentTimeMillis + c10) / 1000) / 60) / 60) / 24;
    }

    public final g b0() {
        n1 n1Var = this.I;
        w8.x.g(n1Var);
        return n1Var.A;
    }

    public final void c(String str, v vVar) {
        o oVar = this.f9303z;
        P(oVar);
        z0 h22 = oVar.h2(str);
        if (h22 != null) {
            n1 n1Var = h22.f9545a;
            if (!TextUtils.isEmpty(h22.N())) {
                Boolean K = K(h22);
                if (K == null) {
                    if (!"_ui".equals(vVar.f9500x)) {
                        r().G.b(u0.l1(str), "Could not find package. appId");
                    }
                } else if (!K.booleanValue()) {
                    r().D.b(u0.l1(str), "App version does not match; dropping event. appId");
                    return;
                }
                String G = h22.G();
                String N = h22.N();
                long P = h22.P();
                l1 l1Var = n1Var.D;
                n1.g(l1Var);
                l1Var.d1();
                String str2 = h22.f9555l;
                l1 l1Var2 = n1Var.D;
                n1.g(l1Var2);
                l1Var2.d1();
                long j = h22.f9556m;
                l1 l1Var3 = n1Var.D;
                n1.g(l1Var3);
                l1Var3.d1();
                long j10 = h22.f9557n;
                l1 l1Var4 = n1Var.D;
                n1.g(l1Var4);
                l1Var4.d1();
                boolean z10 = h22.f9558o;
                String J = h22.J();
                l1 l1Var5 = n1Var.D;
                n1.g(l1Var5);
                l1Var5.d1();
                boolean z11 = h22.f9559p;
                Boolean w10 = h22.w();
                long b10 = h22.b();
                l1 l1Var6 = n1Var.D;
                n1.g(l1Var6);
                l1Var6.d1();
                ArrayList arrayList = h22.s;
                String g10 = a(str).g();
                boolean y9 = h22.y();
                l1 l1Var7 = n1Var.D;
                n1.g(l1Var7);
                l1Var7.d1();
                long j11 = h22.f9564v;
                int i6 = a(str).f9571b;
                String str3 = l0(str).f9440b;
                l1 l1Var8 = n1Var.D;
                n1.g(l1Var8);
                l1Var8.d1();
                int i10 = h22.f9566x;
                l1 l1Var9 = n1Var.D;
                n1.g(l1Var9);
                l1Var9.d1();
                d(vVar, new l4(str, G, N, P, str2, j, j10, (String) null, z10, false, J, 0L, 0, z11, false, w10, b10, (List) arrayList, g10, HttpUrl.FRAGMENT_ENCODE_SET, (String) null, y9, j11, i6, str3, i10, h22.B, h22.C(), h22.s(), 0L, h22.t()));
                return;
            }
        }
        r().K.b(str, "No app data available; dropping event");
    }

    public final h1 c0() {
        h1 h1Var = this.f9301x;
        P(h1Var);
        return h1Var;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:37:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(n9.v r11, n9.l4 r12) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.d(n9.v, n9.l4):void");
    }

    public final o d0() {
        o oVar = this.f9303z;
        P(oVar);
        return oVar;
    }

    public final void e(v vVar, l4 l4Var) {
        u2 u2Var;
        v vVar2;
        List g22;
        n1 n1Var;
        List g23;
        List<e> g24;
        String str;
        w8.x.g(l4Var);
        String str2 = l4Var.f9386x;
        w8.x.d(str2);
        D().d1();
        i0();
        long j = vVar.A;
        v0 b10 = v0.b(vVar);
        D().d1();
        if (this.f9296c0 == null || (str = this.f9297d0) == null || !str.equals(str2)) {
            u2Var = null;
        } else {
            u2Var = this.f9296c0;
        }
        j4.V1(u2Var, (Bundle) b10.f9507e, false);
        v c10 = b10.c();
        g0();
        if (TextUtils.isEmpty(l4Var.f9387y)) {
            return;
        }
        if (!l4Var.E) {
            Y(l4Var);
            return;
        }
        List list = l4Var.O;
        if (list != null) {
            String str3 = c10.f9500x;
            if (list.contains(str3)) {
                Bundle d10 = c10.f9501y.d();
                d10.putLong("ga_safelisted", 1L);
                vVar2 = new v(str3, new u(d10), c10.f9502z, c10.A);
            } else {
                r().K.d("Dropping non-safelisted event. appId, event name, origin", str2, c10.f9500x, c10.f9502z);
                return;
            }
        } else {
            vVar2 = c10;
        }
        o oVar = this.f9303z;
        P(oVar);
        oVar.R1();
        try {
            String str4 = vVar2.f9500x;
            if ("_s".equals(str4)) {
                o oVar2 = this.f9303z;
                P(oVar2);
                if (!oVar2.s1(str2, "_s") && vVar2.f9501y.f9492x.getLong("_sid") != 0) {
                    o oVar3 = this.f9303z;
                    P(oVar3);
                    if (!oVar3.s1(str2, "_f")) {
                        o oVar4 = this.f9303z;
                        P(oVar4);
                        if (!oVar4.s1(str2, "_v")) {
                            o oVar5 = this.f9303z;
                            P(oVar5);
                            D0().getClass();
                            oVar5.x1(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", f(str2, vVar2));
                        }
                    }
                    o oVar6 = this.f9303z;
                    P(oVar6);
                    oVar6.x1(str2, null, "_sid", f(str2, vVar2));
                }
            }
            o oVar7 = this.f9303z;
            P(oVar7);
            w8.x.d(str2);
            oVar7.d1();
            oVar7.e1();
            if (j < 0) {
                u0 u0Var = ((n1) oVar7.f4301y).C;
                n1.g(u0Var);
                u0Var.G.c(u0.l1(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                g22 = Collections.EMPTY_LIST;
            } else {
                g22 = oVar7.g2("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = g22.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                n1Var = this.I;
                if (!hasNext) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar != null) {
                    r().L.d("User property timed out", eVar.f9223x, n1Var.G.c(eVar.f9225z.f9332y), eVar.f9225z.a());
                    v vVar3 = eVar.D;
                    if (vVar3 != null) {
                        g(new v(vVar3, j), l4Var);
                    }
                    o oVar8 = this.f9303z;
                    P(oVar8);
                    oVar8.e2(str2, eVar.f9225z.f9332y);
                }
            }
            o oVar9 = this.f9303z;
            P(oVar9);
            w8.x.d(str2);
            oVar9.d1();
            oVar9.e1();
            if (j < 0) {
                u0 u0Var2 = ((n1) oVar9.f4301y).C;
                n1.g(u0Var2);
                u0Var2.G.c(u0.l1(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                g23 = Collections.EMPTY_LIST;
            } else {
                g23 = oVar9.g2("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(g23.size());
            Iterator it2 = g23.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 != null) {
                    Iterator it3 = it2;
                    r().L.d("User property expired", eVar2.f9223x, n1Var.G.c(eVar2.f9225z.f9332y), eVar2.f9225z.a());
                    o oVar10 = this.f9303z;
                    P(oVar10);
                    oVar10.X1(str2, eVar2.f9225z.f9332y);
                    v vVar4 = eVar2.H;
                    if (vVar4 != null) {
                        arrayList.add(vVar4);
                    }
                    o oVar11 = this.f9303z;
                    P(oVar11);
                    oVar11.e2(str2, eVar2.f9225z.f9332y);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                g(new v((v) obj, j), l4Var);
            }
            o oVar12 = this.f9303z;
            P(oVar12);
            w8.x.d(str2);
            w8.x.d(str4);
            oVar12.d1();
            oVar12.e1();
            if (j < 0) {
                n1 n1Var2 = (n1) oVar12.f4301y;
                u0 u0Var3 = n1Var2.C;
                n1.g(u0Var3);
                u0Var3.G.d("Invalid time querying triggered conditional properties", u0.l1(str2), n1Var2.G.a(str4), Long.valueOf(j));
                g24 = Collections.EMPTY_LIST;
            } else {
                g24 = oVar12.g2("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(g24.size());
            for (e eVar3 : g24) {
                if (eVar3 != null) {
                    g4 g4Var = eVar3.f9225z;
                    String str5 = eVar3.f9223x;
                    w8.x.g(str5);
                    String str6 = eVar3.f9224y;
                    String str7 = g4Var.f9332y;
                    Object a10 = g4Var.a();
                    w8.x.g(a10);
                    h4 h4Var = new h4(str5, str6, str7, j, a10);
                    Object obj2 = h4Var.f9344e;
                    String str8 = h4Var.f9342c;
                    o oVar13 = this.f9303z;
                    P(oVar13);
                    if (oVar13.Y1(h4Var)) {
                        r().L.d("User property triggered", eVar3.f9223x, n1Var.G.c(str8), obj2);
                    } else {
                        r().D.d("Too many active user properties, ignoring", u0.l1(eVar3.f9223x), n1Var.G.c(str8), obj2);
                    }
                    v vVar5 = eVar3.F;
                    if (vVar5 != null) {
                        arrayList2.add(vVar5);
                    }
                    eVar3.f9225z = new g4(h4Var);
                    eVar3.B = true;
                    o oVar14 = this.f9303z;
                    P(oVar14);
                    oVar14.c2(eVar3);
                }
            }
            g(vVar2, l4Var);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                g(new v((v) obj3, j), l4Var);
            }
            o oVar15 = this.f9303z;
            P(oVar15);
            oVar15.S1();
            o oVar16 = this.f9303z;
            P(oVar16);
            oVar16.T1();
        } catch (Throwable th) {
            o oVar17 = this.f9303z;
            P(oVar17);
            oVar17.T1();
            throw th;
        }
    }

    public final a1 e0() {
        a1 a1Var = this.A;
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final Bundle f(String str, v vVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", vVar.f9501y.f9492x.getLong("_sid"));
        o oVar = this.f9303z;
        P(oVar);
        h4 Z1 = oVar.Z1(str, "_sno");
        if (Z1 != null) {
            Object obj = Z1.f9344e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final c f0() {
        c cVar = this.C;
        P(cVar);
        return cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:146|(42:148|(1:152)|153|(1:155)(1:349)|156|(1:158)(15:320|(1:322)(1:348)|323|(1:325)(1:347)|326|(1:328)(1:346)|329|(1:331)(1:345)|332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)(1:342)|341)|159|(1:161)|162|(1:164)(1:319)|(1:318)(34:168|(2:169|(3:171|(3:173|174|(2:176|(2:178|180)(1:309))(1:311))(1:315)|310)(2:316|317))|181|(1:183)|(1:186)|187|(1:189)|190|(5:193|194|(1:196)(1:305)|197|(4:199|(1:201)|202|(2:208|(29:210|(1:212)(1:304)|213|(1:215)|216|217|(2:219|(1:221)(2:222|223))|224|(7:226|227|228|229|(1:231)|232|233)(1:303)|234|(1:238)|239|(1:241)|242|(6:245|(2:247|(5:249|(1:251)(1:258)|252|(2:254|255)(1:257)|256))|259|260|256|243)|261|262|263|264|265|(2:266|(2:268|(1:270)(1:285))(3:286|287|(1:292)(1:291)))|271|272|273|274|(1:276)(2:281|282)|277|278|279))))|308|217|(0)|224|(0)(0)|234|(2:236|238)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|184|(0)|187|(0)|190|(5:193|194|(0)(0)|197|(0))|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279))|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:391|(2:393|(12:395|396|397|(8:399|58|(0)(0)|61|62|(0)(0)|68|69)|57|58|(0)(0)|61|62|(0)(0)|68|69))|400|401|402|403|404|396|397|(0)|57|58|(0)(0)|61|62|(0)(0)|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(73:(2:71|(3:73|(1:75)|76))|77|(2:79|(3:81|(1:83)|84))|85|86|(1:88)|89|(2:93|(1:95))|96|(2:102|(2:104|105))|108|109|110|111|112|(1:114)|115|(2:117|(2:121|122)(1:120))(1:356)|123|124|(1:126)|127|(1:129)(1:355)|130|(1:132)(1:354)|133|(1:135)(1:353)|136|(1:138)(1:352)|139|140|(1:142)(1:351)|143|144|(2:146|(42:148|(1:152)|153|(1:155)(1:349)|156|(1:158)(15:320|(1:322)(1:348)|323|(1:325)(1:347)|326|(1:328)(1:346)|329|(1:331)(1:345)|332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)(1:342)|341)|159|(1:161)|162|(1:164)(1:319)|(1:318)(34:168|(2:169|(3:171|(3:173|174|(2:176|(2:178|180)(1:309))(1:311))(1:315)|310)(2:316|317))|181|(1:183)|(1:186)|187|(1:189)|190|(5:193|194|(1:196)(1:305)|197|(4:199|(1:201)|202|(2:208|(29:210|(1:212)(1:304)|213|(1:215)|216|217|(2:219|(1:221)(2:222|223))|224|(7:226|227|228|229|(1:231)|232|233)(1:303)|234|(1:238)|239|(1:241)|242|(6:245|(2:247|(5:249|(1:251)(1:258)|252|(2:254|255)(1:257)|256))|259|260|256|243)|261|262|263|264|265|(2:266|(2:268|(1:270)(1:285))(3:286|287|(1:292)(1:291)))|271|272|273|274|(1:276)(2:281|282)|277|278|279))))|308|217|(0)|224|(0)(0)|234|(2:236|238)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|184|(0)|187|(0)|190|(5:193|194|(0)(0)|197|(0))|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279))|350|159|(0)|162|(0)(0)|(1:166)|318|184|(0)|187|(0)|190|(0)|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279) */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0c42, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0c49, code lost:
    
        ((n9.n1) r1.f4301y).r().h1().c(n9.u0.l1((java.lang.String) r3.f3737d), r0, "Error storing raw event. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0c63, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0c80, code lost:
    
        r5.r().h1().c(n9.u0.l1(r4.o()), r0, "Data loss. Failed to insert raw event metadata. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x02fe, code lost:
    
        ((n9.n1) r10.f4301y).r().h1().c(n9.u0.l1(r13), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07c0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07ea A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0890 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08a0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08c4 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08dc A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09b6 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09d6 A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a47 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a65 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a7e A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b84 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0c2c A[Catch: all -> 0x0a04, SQLiteException -> 0x0c42, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0c42, blocks: (B:274:0x0c1b, B:276:0x0c2c), top: B:273:0x0c1b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0b92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08c9 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ed A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(n9.v r60, n9.l4 r61) {
        /*
            Method dump skipped, instructions count: 3278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.g(n9.v, n9.l4):void");
    }

    public final y0 g0() {
        y0 y0Var = this.D;
        P(y0Var);
        return y0Var;
    }

    public final void h(z0 z0Var, com.google.android.gms.internal.measurement.j3 j3Var) {
        k7.c cVar;
        com.google.android.gms.internal.measurement.t3 t3Var;
        boolean z10;
        h hVar;
        D().d1();
        i0();
        String B0 = ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).B0();
        EnumMap enumMap = new EnumMap(y1.class);
        int length = B0.length();
        int length2 = y1.values().length;
        h hVar2 = h.UNSET;
        if (length >= length2 && B0.charAt(0) == '1') {
            y1[] values = y1.values();
            int length3 = values.length;
            int i6 = 0;
            int i10 = 1;
            while (i6 < length3) {
                y1 y1Var = values[i6];
                int i11 = i10 + 1;
                char charAt = B0.charAt(i10);
                h[] values2 = h.values();
                int length4 = values2.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length4) {
                        hVar = values2[i12];
                        if (hVar.f9336x == charAt) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        hVar = hVar2;
                        break;
                    }
                }
                enumMap.put((EnumMap) y1Var, (y1) hVar);
                i6++;
                i10 = i11;
            }
            cVar = new k7.c(enumMap);
        } else {
            cVar = new k7.c(17);
        }
        String D = z0Var.D();
        D().d1();
        i0();
        z1 a10 = a(D);
        EnumMap enumMap2 = a10.f9570a;
        y1 y1Var2 = y1.AD_STORAGE;
        w1 w1Var = (w1) enumMap2.get(y1Var2);
        w1 w1Var2 = w1.UNINITIALIZED;
        if (w1Var == null) {
            w1Var = w1Var2;
        }
        int i13 = a10.f9571b;
        int ordinal = w1Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                cVar.J(y1Var2, hVar4);
            } else {
                cVar.I(y1Var2, i13);
            }
        } else {
            cVar.J(y1Var2, hVar3);
        }
        y1 y1Var3 = y1.ANALYTICS_STORAGE;
        w1 w1Var3 = (w1) enumMap2.get(y1Var3);
        if (w1Var3 != null) {
            w1Var2 = w1Var3;
        }
        int ordinal2 = w1Var2.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2 && ordinal2 != 3) {
                cVar.J(y1Var3, hVar4);
            } else {
                cVar.I(y1Var3, i13);
            }
        } else {
            cVar.J(y1Var3, hVar3);
        }
        String D2 = z0Var.D();
        D().d1();
        i0();
        q n02 = n0(D2, l0(D2), a(D2), cVar);
        String str = n02.f9442d;
        Boolean bool = n02.f9441c;
        w8.x.g(bool);
        boolean booleanValue = bool.booleanValue();
        j3Var.b();
        ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).f1(booleanValue);
        if (!TextUtils.isEmpty(str)) {
            j3Var.b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).g1(str);
        }
        D().d1();
        i0();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                t3Var = (com.google.android.gms.internal.measurement.t3) it.next();
                if ("_npa".equals(t3Var.r())) {
                    break;
                }
            } else {
                t3Var = null;
                break;
            }
        }
        if (t3Var != null) {
            EnumMap enumMap3 = (EnumMap) cVar.f7745y;
            y1 y1Var4 = y1.AD_PERSONALIZATION;
            h hVar5 = (h) enumMap3.get(y1Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                o oVar = this.f9303z;
                P(oVar);
                h4 Z1 = oVar.Z1(z0Var.D(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (Z1 != null) {
                    String str2 = Z1.f9341b;
                    if ("tcf".equals(str2)) {
                        cVar.J(y1Var4, h.TCF);
                    } else if ("app".equals(str2)) {
                        cVar.J(y1Var4, hVar7);
                    } else {
                        cVar.J(y1Var4, hVar6);
                    }
                } else {
                    Boolean w10 = z0Var.w();
                    if (w10 != null && ((!w10.booleanValue() || t3Var.v() == 1) && (w10.booleanValue() || t3Var.v() == 0))) {
                        cVar.J(y1Var4, hVar6);
                    } else {
                        cVar.J(y1Var4, hVar7);
                    }
                }
            }
        } else {
            int z11 = z(z0Var.D(), cVar);
            com.google.android.gms.internal.measurement.s3 A = com.google.android.gms.internal.measurement.t3.A();
            A.b();
            ((com.google.android.gms.internal.measurement.t3) A.f2337y).C("_npa");
            D0().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            A.b();
            ((com.google.android.gms.internal.measurement.t3) A.f2337y).B(currentTimeMillis);
            A.b();
            ((com.google.android.gms.internal.measurement.t3) A.f2337y).F(z11);
            com.google.android.gms.internal.measurement.t3 t3Var2 = (com.google.android.gms.internal.measurement.t3) A.e();
            j3Var.b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).d0(t3Var2);
            r().L.c("non_personalized_ads(_npa)", Integer.valueOf(z11), "Setting user property");
        }
        String cVar2 = cVar.toString();
        j3Var.b();
        ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).e1(cVar2);
        String D3 = z0Var.D();
        h1 h1Var = this.f9301x;
        h1Var.d1();
        h1Var.j1(D3);
        com.google.android.gms.internal.measurement.b2 y12 = h1Var.y1(D3);
        if (y12 != null && y12.s() && !y12.t()) {
            z10 = false;
        } else {
            z10 = true;
        }
        List U = j3Var.U();
        for (int i14 = 0; i14 < U.size(); i14++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.c3) U.get(i14)).s())) {
                com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) ((com.google.android.gms.internal.measurement.c3) U.get(i14)).i();
                List h4 = b3Var.h();
                int i15 = 0;
                while (true) {
                    if (i15 >= h4.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.f3) h4.get(i15)).q())) {
                        String s = ((com.google.android.gms.internal.measurement.f3) h4.get(i15)).s();
                        if (z10 && s.length() > 4) {
                            char[] charArray = s.toCharArray();
                            int i16 = 1;
                            while (true) {
                                if (i16 < 64) {
                                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16)) {
                                        break;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i16 = 0;
                                    break;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16 | 1);
                            s = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.e3 B = com.google.android.gms.internal.measurement.f3.B();
                        B.h("_tcfd");
                        B.i(s);
                        b3Var.b();
                        ((com.google.android.gms.internal.measurement.c3) b3Var.f2337y).A(i15, (com.google.android.gms.internal.measurement.f3) B.e());
                    } else {
                        i15++;
                    }
                }
                j3Var.X(i14, b3Var);
                return;
            }
        }
    }

    public final j4 h0() {
        n1 n1Var = this.I;
        w8.x.g(n1Var);
        j4 j4Var = n1Var.F;
        n1.e(j4Var);
        return j4Var;
    }

    public final void i(z0 z0Var, com.google.android.gms.internal.measurement.j3 j3Var) {
        boolean z10;
        Serializable s12;
        Serializable s13;
        Object s14;
        Object s15;
        Serializable s16;
        D().d1();
        i0();
        com.google.android.gms.internal.measurement.m2 O = com.google.android.gms.internal.measurement.p2.O();
        n1 n1Var = z0Var.f9545a;
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.d1();
        byte[] bArr = z0Var.H;
        if (bArr != null) {
            try {
                O = (com.google.android.gms.internal.measurement.m2) y0.Q1(O, bArr);
            } catch (v5 unused) {
                r().G.b(u0.l1(z0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = j3Var.U().iterator();
        while (true) {
            Serializable serializable = null;
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) it.next();
            if (c3Var.s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.f3 l12 = y0.l1(c3Var, "gclid");
                if (l12 == null) {
                    s12 = null;
                } else {
                    s12 = y0.s1(l12);
                }
                Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
                if (s12 == null) {
                    s12 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String str = (String) s12;
                com.google.android.gms.internal.measurement.f3 l13 = y0.l1(c3Var, "gbraid");
                if (l13 == null) {
                    s13 = null;
                } else {
                    s13 = y0.s1(l13);
                }
                if (s13 == null) {
                    s13 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String str2 = (String) s13;
                com.google.android.gms.internal.measurement.f3 l14 = y0.l1(c3Var, "gad_source");
                if (l14 == null) {
                    s14 = null;
                } else {
                    s14 = y0.s1(l14);
                }
                if (s14 != null) {
                    obj = s14;
                }
                String str3 = (String) obj;
                String[] split = ((String) e0.f9251i1.a(null)).split(",");
                g0();
                HashMap hashMap = new HashMap();
                for (com.google.android.gms.internal.measurement.f3 f3Var : c3Var.p()) {
                    if (Arrays.asList(split).contains(f3Var.q()) && (s16 = y0.s1(f3Var)) != null) {
                        hashMap.put(f3Var.q(), s16);
                    }
                }
                if (!hashMap.isEmpty()) {
                    Object obj2 = 0L;
                    com.google.android.gms.internal.measurement.f3 l15 = y0.l1(c3Var, "click_timestamp");
                    if (l15 == null) {
                        s15 = null;
                    } else {
                        s15 = y0.s1(l15);
                    }
                    if (s15 != null) {
                        obj2 = s15;
                    }
                    long longValue = ((Long) obj2).longValue();
                    if (longValue <= 0) {
                        longValue = c3Var.u();
                    }
                    com.google.android.gms.internal.measurement.f3 l16 = y0.l1(c3Var, "_cis");
                    if (l16 != null) {
                        serializable = y0.s1(l16);
                    }
                    if ("referrer API v2".equals(serializable)) {
                        if (longValue > ((com.google.android.gms.internal.measurement.p2) O.f2337y).N()) {
                            if (str.isEmpty()) {
                                O.b();
                                ((com.google.android.gms.internal.measurement.p2) O.f2337y).q();
                            } else {
                                O.b();
                                ((com.google.android.gms.internal.measurement.p2) O.f2337y).p(str);
                            }
                            if (str2.isEmpty()) {
                                O.b();
                                ((com.google.android.gms.internal.measurement.p2) O.f2337y).s();
                            } else {
                                O.b();
                                ((com.google.android.gms.internal.measurement.p2) O.f2337y).r(str2);
                            }
                            if (str3.isEmpty()) {
                                O.b();
                                ((com.google.android.gms.internal.measurement.p2) O.f2337y).u();
                            } else {
                                O.b();
                                ((com.google.android.gms.internal.measurement.p2) O.f2337y).t(str3);
                            }
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).v(longValue);
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).x().clear();
                            HashMap A = A(c3Var);
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).x().putAll(A);
                        }
                    } else if (longValue > ((com.google.android.gms.internal.measurement.p2) O.f2337y).F()) {
                        if (str.isEmpty()) {
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).R();
                        } else {
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).Q(str);
                        }
                        if (str2.isEmpty()) {
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).T();
                        } else {
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).S(str2);
                        }
                        if (str3.isEmpty()) {
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).V();
                        } else {
                            O.b();
                            ((com.google.android.gms.internal.measurement.p2) O.f2337y).U(str3);
                        }
                        O.b();
                        ((com.google.android.gms.internal.measurement.p2) O.f2337y).W(longValue);
                        O.b();
                        ((com.google.android.gms.internal.measurement.p2) O.f2337y).w().clear();
                        HashMap A2 = A(c3Var);
                        O.b();
                        ((com.google.android.gms.internal.measurement.p2) O.f2337y).w().putAll(A2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.p2) O.e()).equals(com.google.android.gms.internal.measurement.p2.P())) {
            com.google.android.gms.internal.measurement.p2 p2Var = (com.google.android.gms.internal.measurement.p2) O.e();
            j3Var.b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).k1(p2Var);
        }
        byte[] a10 = ((com.google.android.gms.internal.measurement.p2) O.e()).a();
        l1 l1Var2 = n1Var.D;
        n1.g(l1Var2);
        l1Var2.d1();
        boolean z11 = z0Var.Q;
        if (z0Var.H != a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        z0Var.Q = z11 | z10;
        z0Var.H = a10;
        if (z0Var.o()) {
            o oVar = this.f9303z;
            P(oVar);
            oVar.i2(z0Var, false);
        }
        if (b0().n1(null, e0.f9248h1)) {
            o oVar2 = this.f9303z;
            P(oVar2);
            oVar2.X1(z0Var.D(), "_lgclid");
        }
    }

    public final void i0() {
        if (this.J.get()) {
        } else {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final String j(z1 z1Var) {
        if (z1Var.i(y1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            h0().b2().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    public final void j0(l4 l4Var) {
        D().d1();
        i0();
        String str = l4Var.f9386x;
        w8.x.d(str);
        z1 c10 = z1.c(l4Var.U, l4Var.P);
        a(str);
        r().L.c(str, c10, "Setting storage consent for package");
        D().d1();
        i0();
        this.Y.put(str, c10);
        o oVar = this.f9303z;
        P(oVar);
        oVar.K1(str, c10);
    }

    public final void k(ArrayList arrayList) {
        w8.x.b(!arrayList.isEmpty());
        if (this.V != null) {
            r().D.a("Set uploading progress before finishing the previous upload");
        } else {
            this.V = new ArrayList(arrayList);
        }
    }

    public final void k0(l4 l4Var) {
        boolean z10;
        D().d1();
        i0();
        String str = l4Var.f9386x;
        w8.x.d(str);
        q b10 = q.b(l4Var.V);
        r().L.c(str, b10, "Setting DMA consent for package");
        D().d1();
        i0();
        w1 a10 = q.c(100, m0(str)).a();
        this.Z.put(str, b10);
        o oVar = this.f9303z;
        P(oVar);
        w8.x.g(str);
        w8.x.g(b10);
        oVar.d1();
        oVar.e1();
        z1 y12 = oVar.y1(str);
        z1 z1Var = z1.f9569c;
        if (y12 == z1Var) {
            oVar.K1(str, z1Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b10.f9440b);
        oVar.C1(contentValues);
        w1 a11 = q.c(100, m0(str)).a();
        D().d1();
        i0();
        boolean z11 = true;
        w1 w1Var = w1.GRANTED;
        w1 w1Var2 = w1.DENIED;
        if (a10 == w1Var2 && a11 == w1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a10 != w1Var || a11 != w1Var2) {
            z11 = false;
        }
        if (!z10 && !z11) {
            return;
        }
        r().L.b(str, "Generated _dcu event for");
        Bundle bundle = new Bundle();
        o oVar2 = this.f9303z;
        P(oVar2);
        if (oVar2.j2(b(), str, false, false, false, false).f9368f < b0().l1(str, e0.f9262n0)) {
            bundle.putLong("_r", 1L);
            o oVar3 = this.f9303z;
            P(oVar3);
            r().L.c(str, Long.valueOf(oVar3.j2(b(), str, false, false, true, false).f9368f), "_dcu realtime event count");
        }
        this.f9300g0.c(str, "_dcu", bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [n9.e4] */
    /* JADX WARN: Type inference failed for: r1v11, types: [long] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.l():void");
    }

    public final q l0(String str) {
        D().d1();
        i0();
        HashMap hashMap = this.Z;
        q qVar = (q) hashMap.get(str);
        if (qVar == null) {
            o oVar = this.f9303z;
            P(oVar);
            w8.x.g(str);
            oVar.d1();
            oVar.e1();
            q b10 = q.b(oVar.B1("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
            hashMap.put(str, b10);
            return b10;
        }
        return qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:386:0x0225, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07fc A[EDGE_INSN: B:165:0x07fc->B:166:0x07fc BREAK  A[LOOP:4: B:104:0x0653->B:133:0x07ee], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05aa  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r22v1 */
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
    /* JADX WARN: Type inference failed for: r22v46 */
    /* JADX WARN: Type inference failed for: r22v47 */
    /* JADX WARN: Type inference failed for: r33v0, types: [n9.e4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.String r34, long r35) {
        /*
            Method dump skipped, instructions count: 2797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.m(java.lang.String, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle m0(String str) {
        String str2;
        int i6;
        String str3;
        D().d1();
        i0();
        h1 h1Var = this.f9301x;
        P(h1Var);
        if (h1Var.y1(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        z1 a10 = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = a10.f9570a.entrySet().iterator();
        while (true) {
            str2 = "denied";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((w1) entry.getValue()).ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    str2 = "granted";
                } else {
                    str2 = null;
                }
            }
            if (str2 != null) {
                bundle2.putString(((y1) entry.getKey()).f9536x, str2);
            }
        }
        bundle.putAll(bundle2);
        q n02 = n0(str, l0(str), a10, new k7.c(17));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : n02.f9443e.entrySet()) {
            int ordinal2 = ((w1) entry2.getValue()).ordinal();
            if (ordinal2 == 2) {
                str3 = "denied";
            } else if (ordinal2 == 3) {
                str3 = "granted";
            } else {
                str3 = null;
            }
            if (str3 != null) {
                bundle3.putString(((y1) entry2.getKey()).f9536x, str3);
            }
        }
        Boolean bool = n02.f9441c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = n02.f9442d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        o oVar = this.f9303z;
        P(oVar);
        h4 Z1 = oVar.Z1(str, "_npa");
        if (Z1 != null) {
            i6 = Z1.f9344e.equals(1L);
        } else {
            i6 = z(str, new k7.c(17));
        }
        if (1 != i6) {
            str2 = "granted";
        }
        bundle.putString("ad_personalization", str2);
        return bundle;
    }

    public final boolean n(String str, String str2) {
        o oVar = this.f9303z;
        P(oVar);
        z0 h22 = oVar.h2(str);
        HashMap hashMap = this.f9295b0;
        if (h22 != null && h0().E1(str, h22.C())) {
            hashMap.remove(str2);
            return true;
        }
        d4 d4Var = (d4) hashMap.get(str2);
        if (d4Var != null) {
            d4Var.f9220a.D0().getClass();
            if (System.currentTimeMillis() < d4Var.f9222c) {
                return false;
            }
        }
        return true;
    }

    public final q n0(String str, q qVar, z1 z1Var, k7.c cVar) {
        y1 y1Var;
        boolean z10;
        w1 h12;
        h1 h1Var = this.f9301x;
        P(h1Var);
        com.google.android.gms.internal.measurement.b2 y12 = h1Var.y1(str);
        int i6 = 90;
        w1 w1Var = w1.DENIED;
        y1 y1Var2 = y1.AD_USER_DATA;
        if (y12 == null) {
            if (qVar.a() == w1Var) {
                i6 = qVar.f9439a;
                cVar.I(y1Var2, i6);
            } else {
                cVar.J(y1Var2, h.FAILSAFE);
            }
            return new q(Boolean.FALSE, i6, Boolean.TRUE, "-");
        }
        w1 a10 = qVar.a();
        boolean z11 = false;
        w1 w1Var2 = w1.GRANTED;
        if (a10 != w1Var2 && a10 != w1Var) {
            w1 w1Var3 = w1.POLICY;
            w1 w1Var4 = w1.UNINITIALIZED;
            if (a10 == w1Var3 && (h12 = h1Var.h1(str, y1Var2)) != w1Var4) {
                cVar.J(y1Var2, h.REMOTE_ENFORCED_DEFAULT);
                a10 = h12;
            } else {
                h1Var.d1();
                h1Var.j1(str);
                com.google.android.gms.internal.measurement.b2 y13 = h1Var.y1(str);
                if (y13 != null) {
                    for (com.google.android.gms.internal.measurement.z1 z1Var2 : y13.q()) {
                        if (y1Var2 == h1.o1(z1Var2.p())) {
                            y1Var = h1.o1(z1Var2.q());
                            break;
                        }
                    }
                }
                y1Var = null;
                EnumMap enumMap = z1Var.f9570a;
                y1 y1Var3 = y1.AD_STORAGE;
                w1 w1Var5 = (w1) enumMap.get(y1Var3);
                if (w1Var5 != null) {
                    w1Var4 = w1Var5;
                }
                if (w1Var4 == w1Var2 || w1Var4 == w1Var) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (y1Var == y1Var3 && z10) {
                    cVar.J(y1Var2, h.REMOTE_DELEGATION);
                    a10 = w1Var4;
                } else {
                    cVar.J(y1Var2, h.REMOTE_DEFAULT);
                    if (true != h1Var.x1(str, y1Var2)) {
                        a10 = w1Var;
                    } else {
                        a10 = w1Var2;
                    }
                }
            }
        } else {
            i6 = qVar.f9439a;
            cVar.I(y1Var2, i6);
        }
        h1Var.d1();
        h1Var.j1(str);
        com.google.android.gms.internal.measurement.b2 y14 = h1Var.y1(str);
        if (y14 == null || !y14.s() || y14.t()) {
            z11 = true;
        }
        P(h1Var);
        h1Var.d1();
        h1Var.j1(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.b2 y15 = h1Var.y1(str);
        if (y15 != null) {
            Iterator it = y15.r().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.a2) it.next()).p());
            }
        }
        if (a10 != w1Var && !treeSet.isEmpty()) {
            Boolean bool = Boolean.TRUE;
            Boolean valueOf = Boolean.valueOf(z11);
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (z11) {
                str2 = TextUtils.join(HttpUrl.FRAGMENT_ENCODE_SET, treeSet);
            }
            return new q(bool, i6, valueOf, str2);
        }
        return new q(Boolean.FALSE, i6, Boolean.valueOf(z11), "-");
    }

    public final void o(String str) {
        f4 f4Var;
        D().d1();
        i0();
        this.S = true;
        try {
            n1 n1Var = this.I;
            n1Var.getClass();
            Boolean bool = n1Var.j().C;
            if (bool == null) {
                r().G.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                r().D.a("Upload called in the client side when service should be used");
            } else if (this.L > 0) {
                I();
            } else {
                y0 y0Var = this.f9302y;
                P(y0Var);
                if (!y0Var.x1()) {
                    r().L.a("Network not connected, ignoring upload request");
                    I();
                } else {
                    o oVar = this.f9303z;
                    P(oVar);
                    if (!oVar.j1(str)) {
                        r().L.b(str, "[sgtm] Upload queue has no batches for appId");
                    } else {
                        o oVar2 = this.f9303z;
                        P(oVar2);
                        w8.x.d(str);
                        oVar2.d1();
                        oVar2.e1();
                        List i12 = oVar2.i1(str, x3.a(t2.GOOGLE_SIGNAL), 1);
                        if (i12.isEmpty()) {
                            f4Var = null;
                        } else {
                            f4Var = (f4) i12.get(0);
                        }
                        if (f4Var != null) {
                            com.google.android.gms.internal.measurement.i3 i3Var = f4Var.f9313b;
                            r().L.d("[sgtm] Uploading data from upload queue. appId, type, url", str, f4Var.f9316e, f4Var.f9314c);
                            byte[] a10 = i3Var.a();
                            if (Log.isLoggable(r().n1(), 2)) {
                                y0 y0Var2 = this.D;
                                P(y0Var2);
                                r().L.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(a10.length), y0Var2.G1(i3Var));
                            }
                            a4 a4Var = new a4(f4Var.f9314c, f4Var.f9315d, f4Var.f9316e, null);
                            this.R = true;
                            y0 y0Var3 = this.f9302y;
                            P(y0Var3);
                            y0Var3.C1(str, a4Var, i3Var, new j(this, str, (Object) f4Var, 4));
                        }
                    }
                }
            }
            this.S = false;
            J();
        } catch (Throwable th) {
            this.S = false;
            J();
            throw th;
        }
    }

    @Override // n9.v1
    public final Context o0() {
        return this.I.f9413x;
    }

    public final void p(String str, boolean z10, Long l10, Long l11) {
        boolean z11;
        o oVar = this.f9303z;
        P(oVar);
        z0 h22 = oVar.h2(str);
        if (h22 != null) {
            n1 n1Var = h22.f9545a;
            l1 l1Var = n1Var.D;
            n1.g(l1Var);
            l1Var.d1();
            boolean z12 = h22.Q;
            if (h22.f9567y != z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            h22.Q = z12 | z11;
            h22.f9567y = z10;
            l1 l1Var2 = n1Var.D;
            n1.g(l1Var2);
            l1Var2.d1();
            h22.Q |= !Objects.equals(h22.f9568z, l10);
            h22.f9568z = l10;
            l1 l1Var3 = n1Var.D;
            n1.g(l1Var3);
            l1Var3.d1();
            h22.Q |= !Objects.equals(h22.A, l11);
            h22.A = l11;
            if (h22.o()) {
                o oVar2 = this.f9303z;
                P(oVar2);
                oVar2.i2(h22, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.google.android.gms.internal.measurement.j3 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.q(com.google.android.gms.internal.measurement.j3, java.lang.String):void");
    }

    @Override // n9.v1
    public final u0 r() {
        n1 n1Var = this.I;
        w8.x.g(n1Var);
        u0 u0Var = n1Var.C;
        n1.g(u0Var);
        return u0Var;
    }

    public final void s(String str, com.google.android.gms.internal.measurement.e3 e3Var, Bundle bundle, String str2) {
        int max;
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (!j4.C1(((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).q()) && !j4.C1(str)) {
            g b02 = b0();
            b02.getClass();
            max = Math.max(Math.min(b02.l1(str2, e0.f9250i0), UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE), 100);
        } else {
            g b03 = b0();
            b03.getClass();
            max = Math.max(Math.max(Math.min(b03.l1(str2, e0.f9250i0), UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE), 100), 256);
        }
        long j = max;
        long codePointCount = ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).s().codePointCount(0, ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).s().length());
        h0();
        String q9 = ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).q();
        b0();
        String i12 = j4.i1(q9, true, 40);
        if (codePointCount > j && !unmodifiableList.contains(((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).q())) {
            if ("_ev".equals(((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).q())) {
                h0();
                String s = ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).s();
                g b04 = b0();
                b04.getClass();
                bundle.putString("_ev", j4.i1(s, true, Math.max(Math.max(Math.min(b04.l1(str2, e0.f9250i0), UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE), 100), 256)));
                return;
            }
            r().I.c(i12, Long.valueOf(codePointCount), "Param value is too long; discarded. Name, value length");
            if (bundle.getLong("_err") == 0) {
                bundle.putLong("_err", 4L);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", i12);
                    bundle.putLong("_el", codePointCount);
                }
            }
            bundle.remove(((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).q());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r20 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.t(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [v.l] */
    /* JADX WARN: Type inference failed for: r3v12, types: [v.l] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    public final void u(z0 z0Var) {
        Map map;
        Map map2;
        D().d1();
        if (TextUtils.isEmpty(z0Var.G())) {
            String D = z0Var.D();
            w8.x.g(D);
            v(D, 204, null, null, null);
            return;
        }
        String D2 = z0Var.D();
        w8.x.g(D2);
        r().L.b(D2, "Fetching remote configuration");
        h1 h1Var = this.f9301x;
        P(h1Var);
        com.google.android.gms.internal.measurement.g2 p12 = h1Var.p1(D2);
        P(h1Var);
        h1Var.d1();
        String str = (String) h1Var.K.get(D2);
        if (p12 != null) {
            if (!TextUtils.isEmpty(str)) {
                ?? lVar = new v.l(0);
                lVar.put("If-Modified-Since", str);
                map2 = lVar;
            } else {
                map2 = null;
            }
            P(h1Var);
            h1Var.d1();
            String str2 = (String) h1Var.L.get(D2);
            ?? r32 = map2;
            Map map3 = map2;
            if (!TextUtils.isEmpty(str2)) {
                if (map2 == null) {
                    r32 = new v.l(0);
                }
                r32.put("If-None-Match", str2);
                map3 = r32;
            }
            map = map3;
        } else {
            map = null;
        }
        this.Q = true;
        y0 y0Var = this.f9302y;
        P(y0Var);
        k7.d dVar = new k7.d(this, 19);
        n1 n1Var = (n1) y0Var.f4301y;
        y0Var.d1();
        y0Var.e1();
        b4 b4Var = y0Var.f9511z.G;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) e0.f9240f.a(null)).encodedAuthority((String) e0.f9243g.a(null)).path("config/app/".concat(String.valueOf(z0Var.G()))).appendQueryParameter("platform", "android");
        ((n1) b4Var.f4301y).A.i1();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(130000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            l1 l1Var = n1Var.D;
            n1.g(l1Var);
            l1Var.p1(new x0(y0Var, z0Var.D(), url, (byte[]) null, map, dVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.c(u0.l1(z0Var.D()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x015e, B:23:0x006d, B:27:0x00c9, B:28:0x00b7, B:29:0x00ce, B:33:0x00df, B:34:0x00f5, B:36:0x010d, B:37:0x0128, B:39:0x0131, B:41:0x0137, B:42:0x013b, B:44:0x0144, B:46:0x0153, B:47:0x015b, B:48:0x0119, B:49:0x00e6, B:51:0x00ef), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x015e, B:23:0x006d, B:27:0x00c9, B:28:0x00b7, B:29:0x00ce, B:33:0x00df, B:34:0x00f5, B:36:0x010d, B:37:0x0128, B:39:0x0131, B:41:0x0137, B:42:0x013b, B:44:0x0144, B:46:0x0153, B:47:0x015b, B:48:0x0119, B:49:0x00e6, B:51:0x00ef), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x015e, B:23:0x006d, B:27:0x00c9, B:28:0x00b7, B:29:0x00ce, B:33:0x00df, B:34:0x00f5, B:36:0x010d, B:37:0x0128, B:39:0x0131, B:41:0x0137, B:42:0x013b, B:44:0x0144, B:46:0x0153, B:47:0x015b, B:48:0x0119, B:49:0x00e6, B:51:0x00ef), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x015e, B:23:0x006d, B:27:0x00c9, B:28:0x00b7, B:29:0x00ce, B:33:0x00df, B:34:0x00f5, B:36:0x010d, B:37:0x0128, B:39:0x0131, B:41:0x0137, B:42:0x013b, B:44:0x0144, B:46:0x0153, B:47:0x015b, B:48:0x0119, B:49:0x00e6, B:51:0x00ef), top: B:4:0x0030, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e4.v(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void w() {
        D().d1();
        i0();
        if (!this.K) {
            this.K = true;
            D().d1();
            FileLock fileLock = this.T;
            n1 n1Var = this.I;
            if (fileLock != null && fileLock.isValid()) {
                r().L.a("Storage concurrent access okay");
            } else {
                ((n1) this.f9303z.f4301y).getClass();
                try {
                    FileChannel channel = new RandomAccessFile(new File(new File(n1Var.f9413x.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                    this.U = channel;
                    FileLock tryLock = channel.tryLock();
                    this.T = tryLock;
                    if (tryLock != null) {
                        r().L.a("Storage concurrent access okay");
                    } else {
                        r().D.a("Storage concurrent data access panic");
                        return;
                    }
                } catch (FileNotFoundException e10) {
                    r().D.b(e10, "Failed to acquire storage lock");
                    return;
                } catch (IOException e11) {
                    r().D.b(e11, "Failed to access storage lock file");
                    return;
                } catch (OverlappingFileLockException e12) {
                    r().G.b(e12, "Storage lock already acquired");
                    return;
                }
            }
            FileChannel fileChannel = this.U;
            D().d1();
            int i6 = 0;
            if (fileChannel != null && fileChannel.isOpen()) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read != 4) {
                        if (read != -1) {
                            r().G.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                        }
                    } else {
                        allocate.flip();
                        i6 = allocate.getInt();
                    }
                } catch (IOException e13) {
                    r().D.b(e13, "Failed to read from channel");
                }
            } else {
                r().D.a("Bad channel to read from");
            }
            m0 l10 = n1Var.l();
            l10.e1();
            int i10 = l10.C;
            D().d1();
            if (i6 > i10) {
                r().D.c(Integer.valueOf(i6), Integer.valueOf(i10), "Panic: can't downgrade version. Previous, current version");
                return;
            }
            if (i6 < i10) {
                FileChannel fileChannel2 = this.U;
                D().d1();
                if (fileChannel2 != null && fileChannel2.isOpen()) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(i10);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            r().D.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                        }
                        r().L.c(Integer.valueOf(i6), Integer.valueOf(i10), "Storage version upgraded. Previous, current version");
                        return;
                    } catch (IOException e14) {
                        r().D.b(e14, "Failed to write to channel");
                    }
                } else {
                    r().D.a("Bad channel to read from");
                }
                r().D.c(Integer.valueOf(i6), Integer.valueOf(i10), "Storage version upgrade failed. Previous, current version");
            }
        }
    }

    public final int z(String str, k7.c cVar) {
        w1 h12;
        h1 h1Var = this.f9301x;
        com.google.android.gms.internal.measurement.b2 y12 = h1Var.y1(str);
        y1 y1Var = y1.AD_PERSONALIZATION;
        if (y12 == null) {
            cVar.J(y1Var, h.FAILSAFE);
            return 1;
        }
        o oVar = this.f9303z;
        P(oVar);
        z0 h22 = oVar.h2(str);
        if (h22 != null && ((w1) k7.d.W(h22.s()).f7747y) == w1.POLICY && (h12 = h1Var.h1(str, y1Var)) != w1.UNINITIALIZED) {
            cVar.J(y1Var, h.REMOTE_ENFORCED_DEFAULT);
            if (h12 == w1.GRANTED) {
                return 0;
            }
        } else {
            cVar.J(y1Var, h.REMOTE_DEFAULT);
            if (h1Var.x1(str, y1Var)) {
                return 0;
            }
        }
        return 1;
    }
}
