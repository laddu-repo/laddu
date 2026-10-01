package cd;

import ac.g0;
import ad.e;
import android.content.ContentResolver;
import android.content.Context;
import com.bumptech.glide.f;
import d0.h;
import de.i;
import e2.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import jd.p;
import k8.k2;
import od.j;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    public final k2 A;
    public volatile boolean B;
    public volatile boolean C;
    public fd.a D;
    public final j E;
    public volatile long F;
    public volatile long G;
    public volatile boolean H;
    public double I;
    public final h J;
    public long K;
    public ExecutorService L;
    public volatile int M;
    public int N;
    public final Object O;
    public volatile Exception P;
    public List Q;
    public p R;
    public int S;
    public final s5.d T;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f2294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jd.e f2295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ab.a f2296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w f2297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f2298z;

    public c(e eVar, jd.e eVar2, ab.a aVar, w wVar, String str, k2 k2Var) {
        i.e(eVar, "initialDownload");
        i.e(eVar2, "downloader");
        i.e(aVar, "logger");
        i.e(str, "fileTempDir");
        this.f2294v = eVar;
        this.f2295w = eVar2;
        this.f2296x = aVar;
        this.f2297y = wVar;
        this.f2298z = str;
        this.A = k2Var;
        this.E = new j(new g0(3, this));
        this.G = -1L;
        this.J = new h(1);
        this.K = -1L;
        this.O = new Object();
        this.Q = pd.p.f10551v;
        this.T = new s5.d(this);
    }

    @Override // cd.b
    public final void B() {
        fd.a aVar = this.D;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            aVar.f5384c = true;
        }
        this.B = true;
    }

    @Override // cd.b
    public final void H() {
        fd.a aVar = this.D;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            aVar.f5384c = true;
        }
        this.C = true;
    }

    @Override // cd.b
    public final e I() {
        d().C = this.F;
        d().D = this.G;
        return d();
    }

    public final void a(ad.c cVar, ArrayList arrayList) throws IOException {
        int i = 0;
        this.M = 0;
        this.N = arrayList.size();
        if (!this.A.u((String) cVar.f481y)) {
            this.A.p((String) cVar.f481y, this.f2294v.J == zc.a.f14872y);
        }
        this.A.D((String) cVar.f481y, d().D);
        k2 k2Var = this.A;
        String str = (String) cVar.f481y;
        ContentResolver contentResolver = ((Context) k2Var.f7602w).getContentResolver();
        i.d(contentResolver, "getContentResolver(...)");
        p pVarN = a.a.n(str, contentResolver);
        this.R = pVarN;
        pVarN.i(0L);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jd.h hVar = (jd.h) obj;
            if (this.B || this.C) {
                return;
            }
            ExecutorService executorService = this.L;
            if (executorService != null) {
                executorService.execute(new androidx.fragment.app.d(4, this, hVar));
            }
        }
    }

    public final long b() {
        double d10 = this.I;
        if (d10 < 1.0d) {
            return 0L;
        }
        return (long) Math.ceil(d10);
    }

    public final fd.a c() {
        return this.D;
    }

    @Override // cd.b
    public final void c0(fd.a aVar) {
        this.D = aVar;
    }

    public final e d() {
        return (e) this.E.getValue();
    }

    public final List e(boolean z2, ad.c cVar) {
        Long lW;
        if (!this.A.u(d().f486y)) {
            f.i(d().f483v, this.f2298z);
        }
        int i = d().f483v;
        String str = this.f2298z;
        i.e(str, "fileTempDir");
        int iLongValue = -1;
        try {
            Long lW2 = z7.b.w(f.v(i, str));
            if (lW2 != null) {
                iLongValue = (int) lW2.longValue();
            }
        } catch (Exception unused) {
        }
        long jLongValue = 0;
        if (!z2 || this.H) {
            if (iLongValue != 1) {
                f.i(d().f483v, this.f2298z);
            }
            f.M(d().f483v, 1, this.f2298z);
            int i10 = d().f483v;
            long j8 = this.G;
            int i11 = d().f483v;
            String str2 = this.f2298z;
            i.e(str2, "fileTempDir");
            try {
                Long lW3 = z7.b.w(f.u(i11, 1, str2));
                if (lW3 != null) {
                    jLongValue = lW3.longValue();
                }
            } catch (Exception unused2) {
            }
            jd.h hVar = new jd.h(i10, 1, 0L, j8, jLongValue);
            this.F += hVar.f7089e;
            return fa.b.s(hVar);
        }
        this.f2295w.S(cVar);
        long j9 = this.G;
        float f = (j9 / 1024.0f) * 1024.0f;
        jd.i iVar = 1024.0f * f >= 1.0f ? new jd.i(6, (long) Math.ceil(r8 / 6)) : f >= 1.0f ? new jd.i(4, (long) Math.ceil(r8 / 4)) : new jd.i(2, j9);
        if (iLongValue != iVar.f7090a) {
            f.i(d().f483v, this.f2298z);
        }
        f.M(d().f483v, iVar.f7090a, this.f2298z);
        ArrayList arrayList = new ArrayList();
        int i12 = iVar.f7090a;
        if (1 > i12) {
            return arrayList;
        }
        long j10 = 0;
        int i13 = 1;
        while (!this.B && !this.C) {
            long j11 = iVar.f7090a == i13 ? this.G : iVar.f7091b + j10;
            int i14 = d().f483v;
            int i15 = d().f483v;
            String str3 = this.f2298z;
            i.e(str3, "fileTempDir");
            try {
                lW = z7.b.w(f.u(i15, i13, str3));
            } catch (Exception unused3) {
            }
            long jLongValue2 = lW != null ? lW.longValue() : 0L;
            jd.h hVar2 = new jd.h(i14, i13, j10, j11, jLongValue2);
            this.F += hVar2.f7089e;
            arrayList.add(hVar2);
            if (i13 == i12) {
                return arrayList;
            }
            i13++;
            j10 = j11;
        }
        return arrayList;
    }

    public final boolean f() {
        return this.C;
    }

    public final void g() {
        synchronized (this.O) {
            this.M++;
        }
    }

    public final boolean h() {
        return ((this.F > 0 && this.G > 0) || this.H) && this.F >= this.G;
    }

    public final void i(jd.d dVar) {
        if (dVar.f7079b && dVar.f7080c == -1) {
            this.H = true;
        }
    }

    public final void j() {
        long j8 = this.F;
        long jNanoTime = System.nanoTime();
        long jNanoTime2 = System.nanoTime();
        while (this.M != this.N && !this.B && !this.C) {
            d().C = this.F;
            d().D = this.G;
            boolean zA = z7.b.A(jNanoTime2, System.nanoTime(), 1000L);
            long j9 = jNanoTime2;
            if (zA) {
                this.J.e(this.F - j8);
                this.I = h.f(this.J);
                this.K = z7.b.i(this.F, this.G, b());
                j8 = this.F;
            }
            if (z7.b.A(jNanoTime, System.nanoTime(), 2000L)) {
                synchronized (this.O) {
                    try {
                        if (!this.B && !this.C) {
                            d().C = this.F;
                            d().D = this.G;
                            fd.a aVar = this.D;
                            if (aVar != null) {
                                aVar.f(d());
                            }
                            d().P = this.K;
                            d().Q = b();
                            fd.a aVar2 = this.D;
                            if (aVar2 != null) {
                                aVar2.d(d(), d().P, d().Q);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                jNanoTime = System.nanoTime();
            }
            jNanoTime2 = zA ? System.nanoTime() : j9;
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
                this.f2296x.getClass();
            }
        }
    }

    @Override // cd.b
    public final boolean m0() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03d1 A[Catch: all -> 0x0049, TryCatch #4 {all -> 0x0049, blocks: (B:3:0x0008, B:5:0x0045, B:11:0x0053, B:14:0x005d, B:17:0x0065, B:19:0x0069, B:21:0x0073, B:24:0x007a, B:25:0x007f, B:26:0x0080, B:27:0x00a4, B:31:0x00b0, B:32:0x00bb, B:34:0x00c1, B:36:0x00ce, B:37:0x00d2, B:39:0x00d8, B:41:0x00de, B:42:0x0101, B:44:0x0107, B:45:0x0137, B:47:0x013d, B:49:0x0143, B:51:0x0157, B:52:0x0160, B:54:0x0167, B:56:0x0175, B:58:0x017b, B:169:0x037e, B:171:0x0384, B:173:0x038a, B:178:0x03b8, B:179:0x03bb, B:187:0x03d1, B:188:0x03d3, B:190:0x03f2, B:192:0x03f8, B:194:0x040c, B:182:0x03c4, B:184:0x03c8, B:63:0x0189, B:65:0x0191, B:66:0x019b, B:100:0x0210, B:102:0x0226, B:104:0x022c, B:106:0x0232, B:108:0x0238, B:110:0x023e, B:111:0x0245, B:113:0x025f, B:114:0x0274, B:116:0x027a, B:118:0x0280, B:120:0x0286, B:122:0x028a, B:123:0x0290, B:125:0x0296, B:126:0x02a0, B:128:0x02a6, B:131:0x02b4, B:133:0x02cb, B:135:0x02d1, B:137:0x02d7, B:139:0x02dd, B:140:0x02e4, B:142:0x02f5, B:144:0x02fb, B:146:0x0324, B:147:0x0337, B:149:0x034b, B:132:0x02b5, B:168:0x037d, B:30:0x00ab, B:70:0x01bb, B:72:0x01c1, B:74:0x01c7, B:77:0x01ce, B:78:0x01d3, B:80:0x01d6, B:82:0x01da, B:84:0x01e0, B:86:0x01e6, B:89:0x01ed, B:90:0x01f4, B:91:0x01f5, B:93:0x01fb, B:95:0x0201, B:98:0x0208, B:99:0x020f), top: B:239:0x0008, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x040c A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #4 {all -> 0x0049, blocks: (B:3:0x0008, B:5:0x0045, B:11:0x0053, B:14:0x005d, B:17:0x0065, B:19:0x0069, B:21:0x0073, B:24:0x007a, B:25:0x007f, B:26:0x0080, B:27:0x00a4, B:31:0x00b0, B:32:0x00bb, B:34:0x00c1, B:36:0x00ce, B:37:0x00d2, B:39:0x00d8, B:41:0x00de, B:42:0x0101, B:44:0x0107, B:45:0x0137, B:47:0x013d, B:49:0x0143, B:51:0x0157, B:52:0x0160, B:54:0x0167, B:56:0x0175, B:58:0x017b, B:169:0x037e, B:171:0x0384, B:173:0x038a, B:178:0x03b8, B:179:0x03bb, B:187:0x03d1, B:188:0x03d3, B:190:0x03f2, B:192:0x03f8, B:194:0x040c, B:182:0x03c4, B:184:0x03c8, B:63:0x0189, B:65:0x0191, B:66:0x019b, B:100:0x0210, B:102:0x0226, B:104:0x022c, B:106:0x0232, B:108:0x0238, B:110:0x023e, B:111:0x0245, B:113:0x025f, B:114:0x0274, B:116:0x027a, B:118:0x0280, B:120:0x0286, B:122:0x028a, B:123:0x0290, B:125:0x0296, B:126:0x02a0, B:128:0x02a6, B:131:0x02b4, B:133:0x02cb, B:135:0x02d1, B:137:0x02d7, B:139:0x02dd, B:140:0x02e4, B:142:0x02f5, B:144:0x02fb, B:146:0x0324, B:147:0x0337, B:149:0x034b, B:132:0x02b5, B:168:0x037d, B:30:0x00ab, B:70:0x01bb, B:72:0x01c1, B:74:0x01c7, B:77:0x01ce, B:78:0x01d3, B:80:0x01d6, B:82:0x01da, B:84:0x01e0, B:86:0x01e6, B:89:0x01ed, B:90:0x01f4, B:91:0x01f5, B:93:0x01fb, B:95:0x0201, B:98:0x0208, B:99:0x020f), top: B:239:0x0008, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0417 A[Catch: Exception -> 0x041b, TRY_LEAVE, TryCatch #10 {Exception -> 0x041b, blocks: (B:195:0x0413, B:197:0x0417), top: B:250:0x0413 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0425 A[Catch: Exception -> 0x0429, TRY_LEAVE, TryCatch #2 {Exception -> 0x0429, blocks: (B:201:0x0421, B:203:0x0425), top: B:235:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0431 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.c.run():void");
    }
}
