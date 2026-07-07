package g2;

import android.text.TextUtils;
import db.c1;
import db.i0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r1.k0;
import r1.l0;
import u1.a0;
import u1.y;
import y2.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements y2.o {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f5393i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f5394a;

    /* renamed from: b, reason: collision with root package name */
    public final y f5395b;

    /* renamed from: d, reason: collision with root package name */
    public final v3.k f5397d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5398e;

    /* renamed from: f, reason: collision with root package name */
    public y2.q f5399f;

    /* renamed from: h, reason: collision with root package name */
    public int f5401h;

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f5396c = new u1.t();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f5400g = new byte[1024];

    public t(String str, y yVar, v3.k kVar, boolean z10) {
        this.f5394a = str;
        this.f5395b = yVar;
        this.f5397d = kVar;
        this.f5398e = z10;
    }

    public final f0 b(long j10) {
        f0 A = this.f5399f.A(0, 3);
        r1.p pVar = new r1.p();
        pVar.f11611m = k0.p("text/vtt");
        pVar.f11603d = this.f5394a;
        pVar.f11616r = j10;
        r4.a.v(pVar, A);
        this.f5399f.t();
        return A;
    }

    @Override // y2.o
    public final void c(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // y2.o
    public final boolean f(y2.p pVar) {
        y2.l lVar = (y2.l) pVar;
        lVar.k(this.f5400g, 0, 6, false);
        byte[] bArr = this.f5400g;
        u1.t tVar = this.f5396c;
        tVar.I(6, bArr);
        if (e4.i.a(tVar)) {
            return true;
        }
        lVar.k(this.f5400g, 6, 3, false);
        tVar.I(9, this.f5400g);
        return e4.i.a(tVar);
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = db.k0.f4008y;
        return c1.B;
    }

    @Override // y2.o
    public final int i(y2.p pVar, mc.i iVar) {
        String l10;
        int length;
        this.f5399f.getClass();
        int length2 = (int) pVar.getLength();
        int i6 = this.f5401h;
        byte[] bArr = this.f5400g;
        if (i6 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f5400g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f5400g;
        int i10 = this.f5401h;
        int read = pVar.read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            int i11 = this.f5401h + read;
            this.f5401h = i11;
            if (length2 == -1 || i11 != length2) {
                return 0;
            }
        }
        u1.t tVar = new u1.t(this.f5400g);
        e4.i.d(tVar);
        String l11 = tVar.l(StandardCharsets.UTF_8);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(l11)) {
                if (l11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f5393i.matcher(l11);
                    if (matcher2.find()) {
                        Matcher matcher3 = j.matcher(l11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = e4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = a0.f12750a;
                            j10 = a0.Y(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw l0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(l11));
                        }
                    } else {
                        throw l0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(l11));
                    }
                }
                l11 = tVar.l(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String l12 = tVar.l(StandardCharsets.UTF_8);
                    if (l12 == null) {
                        break;
                    }
                    if (e4.i.f4349a.matcher(l12).matches()) {
                        do {
                            l10 = tVar.l(StandardCharsets.UTF_8);
                            if (l10 != null) {
                            }
                        } while (!l10.isEmpty());
                    } else {
                        Matcher matcher4 = e4.h.f4345a.matcher(l12);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c10 = e4.i.c(group3);
                String str2 = a0.f12750a;
                long b10 = this.f5395b.b(a0.Y((j10 + c10) - j11, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                f0 b11 = b(b10 - c10);
                byte[] bArr3 = this.f5400g;
                int i12 = this.f5401h;
                u1.t tVar2 = this.f5396c;
                tVar2.I(i12, bArr3);
                b11.a(this.f5401h, tVar2);
                b11.c(b10, 1, this.f5401h, 0, null);
                return -1;
            }
        }
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        if (this.f5398e) {
            qVar = new a2.c(qVar, this.f5397d);
        }
        this.f5399f = qVar;
        qVar.n(new a3.b(-9223372036854775807L));
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
