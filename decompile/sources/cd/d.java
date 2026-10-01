package cd;

import a9.g;
import ac.g0;
import ad.e;
import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import d0.h;
import de.i;
import e2.w;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import jd.p;
import k8.k2;
import od.j;
import pd.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {
    public volatile boolean A;
    public volatile boolean B;
    public fd.a C;
    public volatile long D;
    public volatile boolean E;
    public volatile long F;
    public long G;
    public final j H;
    public double I;
    public final h J;
    public final jd.b K;
    public final int L;
    public final g M;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f2299v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jd.e f2300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ab.a f2301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w f2302y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k2 f2303z;

    public d(e eVar, jd.e eVar2, ab.a aVar, w wVar, k2 k2Var) {
        i.e(eVar, "initialDownload");
        i.e(eVar2, "downloader");
        i.e(aVar, "logger");
        this.f2299v = eVar;
        this.f2300w = eVar2;
        this.f2301x = aVar;
        this.f2302y = wVar;
        this.f2303z = k2Var;
        this.D = -1L;
        this.G = -1L;
        this.H = new j(new g0(4, this));
        this.J = new h(1);
        jd.b bVar = new jd.b();
        bVar.f7071w = 1;
        bVar.f7070v = eVar.f483v;
        this.K = bVar;
        this.L = 1;
        this.M = new g(7, this);
    }

    @Override // cd.b
    public final void B() {
        fd.a aVar = this.C;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            aVar.f5384c = true;
        }
        this.A = true;
    }

    @Override // cd.b
    public final void H() {
        fd.a aVar = this.C;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            aVar.f5384c = true;
        }
        this.B = true;
    }

    @Override // cd.b
    public final e I() {
        b().C = this.F;
        b().D = this.D;
        return b();
    }

    public final long a() {
        double d10 = this.I;
        if (d10 < 1.0d) {
            return 0L;
        }
        return (long) Math.ceil(d10);
    }

    public final e b() {
        return (e) this.H.getValue();
    }

    public final ad.c c() {
        LinkedHashMap linkedHashMapU = s.U(this.f2299v.B);
        linkedHashMapU.put("Range", "bytes=" + this.F + "-");
        e eVar = this.f2299v;
        int i = eVar.f483v;
        String str = eVar.f485x;
        String str2 = eVar.f486y;
        Uri uriU = z7.b.u(str2);
        e eVar2 = this.f2299v;
        String str3 = eVar2.I;
        long j8 = eVar2.K;
        return new ad.c(str, linkedHashMapU, str2, uriU, "GET", eVar2.M);
    }

    @Override // cd.b
    public final void c0(fd.a aVar) {
        this.C = aVar;
    }

    public final boolean d() {
        return ((this.F > 0 && this.D > 0) || this.E) && this.F >= this.D;
    }

    public final void e(jd.d dVar) {
        if (this.A || this.B || !d()) {
            return;
        }
        this.D = this.F;
        b().C = this.F;
        b().D = this.D;
        this.K.f7074z = this.F;
        this.K.f7073y = this.D;
        if (this.B || this.A) {
            return;
        }
        fd.a aVar = this.C;
        if (aVar != null) {
            aVar.f(b());
        }
        fd.a aVar2 = this.C;
        if (aVar2 != null) {
            aVar2.b(b(), this.K, this.L);
        }
        b().P = this.G;
        b().Q = a();
        e eVarB = b();
        eVarB.getClass();
        e eVar = new e();
        com.bumptech.glide.e.u(eVarB, eVar);
        fd.a aVar3 = this.C;
        if (aVar3 != null) {
            aVar3.d(b(), b().P, b().Q);
        }
        b().P = -1L;
        b().Q = -1L;
        fd.a aVar4 = this.C;
        if (aVar4 != null) {
            aVar4.a(eVar);
        }
    }

    public final void f(BufferedInputStream bufferedInputStream, p pVar, int i) throws IOException {
        boolean z2;
        long j8 = this.F;
        byte[] bArr = new byte[i];
        long jNanoTime = System.nanoTime();
        long jNanoTime2 = System.nanoTime();
        boolean z10 = false;
        int i10 = bufferedInputStream.read(bArr, 0, i);
        long jNanoTime3 = jNanoTime;
        long jNanoTime4 = jNanoTime2;
        while (!this.A && !this.B && i10 != -1) {
            pVar.l(i10, bArr);
            if (this.B || this.A) {
                z2 = z10;
                jNanoTime4 = jNanoTime4;
            } else {
                long j9 = jNanoTime3;
                this.F += (long) i10;
                b().C = this.F;
                b().D = this.D;
                this.K.f7074z = this.F;
                this.K.f7073y = this.D;
                boolean zA = z7.b.A(jNanoTime4, System.nanoTime(), 1000L);
                long j10 = jNanoTime4;
                if (zA) {
                    this.J.e(this.F - j8);
                    this.I = h.f(this.J);
                    this.G = z7.b.i(this.F, this.D, a());
                    j8 = this.F;
                }
                jNanoTime3 = j9;
                if (z7.b.A(jNanoTime3, System.nanoTime(), 2000L)) {
                    this.K.f7074z = this.F;
                    if (!this.B && !this.A) {
                        fd.a aVar = this.C;
                        if (aVar != null) {
                            aVar.f(b());
                        }
                        fd.a aVar2 = this.C;
                        if (aVar2 != null) {
                            aVar2.b(b(), this.K, this.L);
                        }
                        b().P = this.G;
                        b().Q = a();
                        fd.a aVar3 = this.C;
                        if (aVar3 != null) {
                            aVar3.d(b(), b().P, b().Q);
                        }
                    }
                    jNanoTime3 = System.nanoTime();
                }
                jNanoTime4 = zA ? System.nanoTime() : j10;
                z2 = false;
                i10 = bufferedInputStream.read(bArr, 0, i);
            }
            z10 = z2;
        }
        switch (pVar.f7104v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((FileOutputStream) pVar.f7105w).flush();
                break;
        }
    }

    @Override // cd.b
    public final boolean m0() {
        return this.A;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:214|3|(1:118)(7:7|(3:225|9|(1:13))|19|(1:21)(1:26)|27|229|(6:82|(2:91|92)|(2:99|100)|101|(2:110|111)|112)(18:33|(3:39|40|41)(1:38)|42|(1:44)(1:47)|48|(3:50|(1:52)|53)|54|236|55|(1:81)(6:59|234|60|(4:64|(1:66)|72|(1:74))|75|76)|217|119|(2:142|(1:145))(2:125|(6:129|(1:131)|136|(1:138)|139|(1:141)))|(2:227|147)|(2:215|151)|(2:155|222)|158|195))|113|217|119|(6:121|142|(1:145)|(0)|(0)|(0))(0)|158|195) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0249, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024a, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f1, code lost:
    
        java.lang.Thread.sleep(500);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02fc, code lost:
    
        if (va.t1.i(r23.f2302y.f4711a) == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ff, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0302, code lost:
    
        r23.f2301x.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x030b, code lost:
    
        r2 = zc.b.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x033a, code lost:
    
        b().P = -1;
        b().Q = -1;
        r3 = r23.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0348, code lost:
    
        if (r3 != null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x034a, code lost:
    
        r3.c(b(), r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0353, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0357, code lost:
    
        r23.f2301x.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x035e, code lost:
    
        r23.f2300w.p(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0364, code lost:
    
        r23.f2301x.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x036b, code lost:
    
        r15.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028b A[Catch: all -> 0x0245, Exception -> 0x0249, TryCatch #2 {all -> 0x0245, blocks: (B:119:0x0207, B:121:0x020d, B:123:0x0211, B:125:0x0215, B:127:0x0235, B:129:0x0239, B:131:0x023d, B:136:0x024c, B:138:0x0250, B:139:0x025b, B:141:0x0271, B:142:0x028b, B:145:0x0293, B:159:0x02be, B:161:0x02c2, B:163:0x02c6, B:168:0x02f1, B:169:0x02f4, B:176:0x030b, B:177:0x030d, B:179:0x0336, B:181:0x033a, B:183:0x034a, B:172:0x02ff, B:173:0x0302), top: B:214:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b0 A[Catch: Exception -> 0x02b4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02b4, blocks: (B:155:0x02b0, B:193:0x036b), top: B:223:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c2 A[Catch: all -> 0x0245, TryCatch #2 {all -> 0x0245, blocks: (B:119:0x0207, B:121:0x020d, B:123:0x0211, B:125:0x0215, B:127:0x0235, B:129:0x0239, B:131:0x023d, B:136:0x024c, B:138:0x0250, B:139:0x025b, B:141:0x0271, B:142:0x028b, B:145:0x0293, B:159:0x02be, B:161:0x02c2, B:163:0x02c6, B:168:0x02f1, B:169:0x02f4, B:176:0x030b, B:177:0x030d, B:179:0x0336, B:181:0x033a, B:183:0x034a, B:172:0x02ff, B:173:0x0302), top: B:214:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030b A[Catch: all -> 0x0245, TryCatch #2 {all -> 0x0245, blocks: (B:119:0x0207, B:121:0x020d, B:123:0x0211, B:125:0x0215, B:127:0x0235, B:129:0x0239, B:131:0x023d, B:136:0x024c, B:138:0x0250, B:139:0x025b, B:141:0x0271, B:142:0x028b, B:145:0x0293, B:159:0x02be, B:161:0x02c2, B:163:0x02c6, B:168:0x02f1, B:169:0x02f4, B:176:0x030b, B:177:0x030d, B:179:0x0336, B:181:0x033a, B:183:0x034a, B:172:0x02ff, B:173:0x0302), top: B:214:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0336 A[Catch: all -> 0x0245, TryCatch #2 {all -> 0x0245, blocks: (B:119:0x0207, B:121:0x020d, B:123:0x0211, B:125:0x0215, B:127:0x0235, B:129:0x0239, B:131:0x023d, B:136:0x024c, B:138:0x0250, B:139:0x025b, B:141:0x0271, B:142:0x028b, B:145:0x0293, B:159:0x02be, B:161:0x02c2, B:163:0x02c6, B:168:0x02f1, B:169:0x02f4, B:176:0x030b, B:177:0x030d, B:179:0x0336, B:181:0x033a, B:183:0x034a, B:172:0x02ff, B:173:0x0302), top: B:214:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034a A[Catch: all -> 0x0245, TRY_LEAVE, TryCatch #2 {all -> 0x0245, blocks: (B:119:0x0207, B:121:0x020d, B:123:0x0211, B:125:0x0215, B:127:0x0235, B:129:0x0239, B:131:0x023d, B:136:0x024c, B:138:0x0250, B:139:0x025b, B:141:0x0271, B:142:0x028b, B:145:0x0293, B:159:0x02be, B:161:0x02c2, B:163:0x02c6, B:168:0x02f1, B:169:0x02f4, B:176:0x030b, B:177:0x030d, B:179:0x0336, B:181:0x033a, B:183:0x034a, B:172:0x02ff, B:173:0x0302), top: B:214:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036b A[Catch: Exception -> 0x02b4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02b4, blocks: (B:155:0x02b0, B:193:0x036b), top: B:223:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x038b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0353 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0373 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x035e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x037e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.d.run():void");
    }
}
