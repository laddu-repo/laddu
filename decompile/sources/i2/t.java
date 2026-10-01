package i2;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t1.f0;
import w1.b0;
import w1.y;
import w2.g0;
import y9.c0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements w2.o {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f6453j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f6455b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t3.k f6457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6458e;
    public w2.q f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6460h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f6456c = new w1.t();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f6459g = new byte[1024];

    public t(String str, y yVar, t3.k kVar, boolean z2) {
        this.f6454a = str;
        this.f6455b = yVar;
        this.f6457d = kVar;
        this.f6458e = z2;
    }

    public final g0 b(long j8) {
        g0 g0VarR = this.f.r(0, 3);
        t1.n nVar = new t1.n();
        nVar.f12036m = f0.p("text/vtt");
        nVar.f12029d = this.f6454a;
        nVar.f12041r = j8;
        d0.d.r(nVar, g0VarR);
        this.f.e();
        return g0VarR;
    }

    @Override // w2.o
    public final void c(w2.q qVar) {
        if (this.f6458e) {
            qVar = new c2.b(qVar, this.f6457d);
        }
        this.f = qVar;
        qVar.k(new w2.s(-9223372036854775807L));
    }

    @Override // w2.o
    public final boolean e(w2.p pVar) {
        w2.l lVar = (w2.l) pVar;
        lVar.v(this.f6459g, 0, 6, false);
        byte[] bArr = this.f6459g;
        w1.t tVar = this.f6456c;
        tVar.H(6, bArr);
        if (c4.j.a(tVar)) {
            return true;
        }
        lVar.v(this.f6459g, 6, 3, false);
        tVar.H(9, this.f6459g);
        return c4.j.a(tVar);
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        throw new IllegalStateException();
    }

    @Override // w2.o
    public final int g(w2.p pVar, t1.r rVar) throws t1.g0 {
        String strK;
        this.f.getClass();
        int length = (int) pVar.getLength();
        int i10 = this.f6460h;
        byte[] bArr = this.f6459g;
        if (i10 == bArr.length) {
            this.f6459g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f6459g;
        int i11 = this.f6460h;
        int i12 = pVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f6460h + i12;
            this.f6460h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        w1.t tVar = new w1.t(this.f6459g);
        c4.j.d(tVar);
        String strK2 = tVar.k(StandardCharsets.UTF_8);
        long jU = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strK2)) {
                while (true) {
                    String strK3 = tVar.k(StandardCharsets.UTF_8);
                    if (strK3 == null) {
                        break;
                    }
                    if (c4.j.f2102a.matcher(strK3).matches()) {
                        do {
                            strK = tVar.k(StandardCharsets.UTF_8);
                            if (strK != null) {
                            }
                        } while (!strK.isEmpty());
                    } else {
                        Matcher matcher2 = c4.i.f2098a.matcher(strK3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = c4.j.c(strGroup);
                int i14 = b0.f13686a;
                long jB = this.f6455b.b(b0.U((jU + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                g0 g0VarB = b(jB - jC2);
                byte[] bArr3 = this.f6459g;
                int i15 = this.f6460h;
                w1.t tVar2 = this.f6456c;
                tVar2.H(i15, bArr3);
                g0VarB.d(this.f6460h, tVar2);
                g0VarB.a(jB, 1, this.f6460h, 0, null);
                return -1;
            }
            if (strK2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strK2);
                if (!matcher3.find()) {
                    throw t1.g0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strK2));
                }
                Matcher matcher4 = f6453j.matcher(strK2);
                if (!matcher4.find()) {
                    throw t1.g0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strK2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = c4.j.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j8 = Long.parseLong(strGroup3);
                int i16 = b0.f13686a;
                jU = b0.U(j8, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strK2 = tVar.k(StandardCharsets.UTF_8);
        }
    }

    @Override // w2.o
    public final List h() {
        c0 c0Var = y9.f0.f14553w;
        return z0.f14637z;
    }

    @Override // w2.o
    public final w2.o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
