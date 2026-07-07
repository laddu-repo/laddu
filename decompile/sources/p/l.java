package p;

import android.os.SystemClock;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements o.w, p8.a, t3.g, u4.a, u2.l, v3.k, w2.f0, y2.q, sd.b {
    @Override // y2.q
    public y2.f0 A(int i6, int i10) {
        return new y2.n();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, v3.m, ic.s] */
    @Override // v3.k
    public v3.m c(r1.q qVar) {
        char c10;
        int i6;
        String str = qVar.f11670n;
        List list = qVar.f11673q;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return new x3.h(list);
                case 1:
                    return new c6.h(13);
                case 2:
                    return new lc.c(4);
                case 3:
                    return new j4.b0(13);
                case 4:
                    return new c4.a(list);
                case 5:
                    return new z3.a(list);
                case 6:
                    ?? obj = new Object();
                    obj.f6781x = new u1.t();
                    obj.f6782y = new u1.t();
                    d4.a aVar = new d4.a();
                    obj.f6783z = aVar;
                    String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
                    String str2 = u1.a0.f12750a;
                    for (String str3 : trim.split("\\r?\\n", -1)) {
                        if (str3.startsWith("palette: ")) {
                            String[] split = str3.substring(9).split(",", -1);
                            aVar.f3783d = new int[split.length];
                            for (int i10 = 0; i10 < split.length; i10++) {
                                int[] iArr = aVar.f3783d;
                                try {
                                    i6 = Integer.parseInt(split[i10].trim(), 16);
                                } catch (RuntimeException unused) {
                                    i6 = 0;
                                }
                                iArr[i10] = i6;
                            }
                        } else if (str3.startsWith("size: ")) {
                            String[] split2 = str3.substring(6).trim().split("x", -1);
                            if (split2.length == 2) {
                                try {
                                    aVar.f3784e = Integer.parseInt(split2[0]);
                                    aVar.f3785f = Integer.parseInt(split2[1]);
                                    aVar.f3781b = true;
                                } catch (RuntimeException e10) {
                                    u1.a.q("VobsubParser", "Parsing IDX failed", e10);
                                }
                            }
                        }
                    }
                    return obj;
                case 7:
                    return new a4.a();
                case '\b':
                    return new b4.e();
            }
        }
        throw new IllegalArgumentException(r4.a.k("Unsupported MIME type: ", str));
    }

    @Override // p8.a
    public long f() {
        return System.currentTimeMillis();
    }

    @Override // v3.k
    public boolean g(r1.q qVar) {
        String str = qVar.f11670n;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override // u2.l
    public void h() {
        synchronized (v2.b.f13257a) {
            Object obj = v2.b.f13258b;
            synchronized (obj) {
                if (v2.b.f13259c) {
                    return;
                }
                long a10 = v2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    v2.b.f13260d = a10;
                    v2.b.f13259c = true;
                }
            }
        }
    }

    @Override // t3.g
    public long j(y2.p pVar) {
        return -1L;
    }

    @Override // t3.g
    public y2.z k() {
        return new a3.b(-9223372036854775807L);
    }

    @Override // v3.k
    public int o(r1.q qVar) {
        String str = qVar.f11670n;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(r4.a.k("Unsupported MIME type: ", str));
    }

    public List r(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (qb.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f11153a;
            if (str != null) {
                bVar = new qb.b(str, bVar.f11154b, bVar.f11155c, bVar.f11156d, bVar.f11157e, new b2.b(20, str, bVar), bVar.f11159g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // o.w
    public boolean v(o.l lVar) {
        return false;
    }

    @Override // w2.f0
    public /* synthetic */ void a() {
    }

    @Override // u4.a
    public void d() {
    }

    @Override // w2.f0
    public /* synthetic */ void l() {
    }

    @Override // w2.f0
    public /* synthetic */ void m() {
    }

    @Override // u2.l
    public void p() {
    }

    @Override // y2.q
    public void t() {
    }

    @Override // w2.f0
    public /* synthetic */ void b(r1.p1 p1Var) {
    }

    @Override // y2.q
    public void n(y2.z zVar) {
    }

    @Override // t3.g
    public void q(long j) {
    }

    @Override // o.w
    public void e(o.l lVar, boolean z10) {
    }

    @Override // u4.a
    public void i(int i6, Object obj) {
    }
}
