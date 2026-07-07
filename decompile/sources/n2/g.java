package n2;

import java.util.Locale;
import m2.l;
import u1.a0;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public int f8999a;

    /* renamed from: b, reason: collision with root package name */
    public int f9000b;

    /* renamed from: c, reason: collision with root package name */
    public int f9001c;

    /* renamed from: d, reason: collision with root package name */
    public long f9002d;

    /* renamed from: e, reason: collision with root package name */
    public long f9003e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9004f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9005g;

    public g(l lVar) {
        this.f9004f = lVar;
        this.f9002d = -9223372036854775807L;
        this.f9000b = -1;
    }

    @Override // n2.i
    public void c(long j, long j10) {
        this.f9002d = j;
        this.f9003e = j10;
        this.f9001c = 0;
    }

    @Override // n2.i
    public void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 2);
        this.f9005g = A;
        String str = a0.f12750a;
        A.f(((l) this.f9004f).f8518c);
    }

    @Override // n2.i
    public void f(t tVar, long j, int i6, boolean z10) {
        int i10;
        int a10;
        u1.c.h((f0) this.f9005g);
        int i11 = this.f9000b;
        if (i11 != -1 && i6 != (a10 = m2.i.a(i11))) {
            String str = a0.f12750a;
            Locale locale = Locale.US;
            u1.a.p("RtpMpeg4Reader", "Received RTP packet with unexpected sequence number. Expected: " + a10 + "; received: " + i6 + ". Dropping packet.");
        }
        int a11 = tVar.a();
        ((f0) this.f9005g).a(a11, tVar);
        if (this.f9001c == 0) {
            byte[] bArr = tVar.f12811a;
            byte[] bArr2 = {0, 0, 1, -74};
            jb.b.f(bArr, "array");
            int i12 = 0;
            loop0: while (true) {
                if (i12 < bArr.length - 3) {
                    for (int i13 = 0; i13 < 4; i13++) {
                        if (bArr[i12 + i13] != bArr2[i13]) {
                            break;
                        }
                    }
                    break loop0;
                }
                i12 = -1;
                break;
                i12++;
            }
            if (i12 != -1) {
                tVar.K(i12 + 4);
                if ((tVar.h() >> 6) == 0) {
                    i10 = 1;
                    this.f8999a = i10;
                }
            }
            i10 = 0;
            this.f8999a = i10;
        }
        this.f9001c += a11;
        if (z10) {
            if (this.f9002d == -9223372036854775807L) {
                this.f9002d = j;
            }
            ((f0) this.f9005g).c(a8.d.o(this.f9003e, j, this.f9002d, 90000), this.f8999a, this.f9001c, 0, null);
            this.f9001c = 0;
        }
        this.f9000b = i6;
    }

    public g(int i6, int i10, r1.q qVar, int i11, Object obj, long j, long j10) {
        this.f8999a = i6;
        this.f9000b = i10;
        this.f9004f = qVar;
        this.f9001c = i11;
        this.f9005g = obj;
        this.f9002d = j;
        this.f9003e = j10;
    }

    @Override // n2.i
    public void d(long j) {
    }
}
