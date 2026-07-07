package m2;

import android.os.SystemClock;
import com.unity3d.services.core.device.MimeTypes;
import db.c1;
import db.k0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements y2.o {

    /* renamed from: a, reason: collision with root package name */
    public final n2.i f8479a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.t f8480b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f8481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8482d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8483e;

    /* renamed from: f, reason: collision with root package name */
    public final k f8484f;

    /* renamed from: g, reason: collision with root package name */
    public y2.q f8485g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8486h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f8487i;
    public volatile int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8488k;

    /* renamed from: l, reason: collision with root package name */
    public long f8489l;

    /* renamed from: m, reason: collision with root package name */
    public long f8490m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public g(l lVar, int i6) {
        char c10;
        n2.i dVar;
        n2.i iVar;
        this.f8482d = i6;
        String str = lVar.f8518c.f11670n;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\r';
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
                dVar = new n2.d(lVar, 0);
                iVar = dVar;
                break;
            case 1:
                dVar = new n2.e(lVar, 1);
                iVar = dVar;
                break;
            case 2:
            case '\b':
                dVar = new n2.c(lVar);
                iVar = dVar;
                break;
            case 3:
                if (lVar.f8520e.equals("MP4A-LATM")) {
                    dVar = new n2.f(lVar);
                } else {
                    dVar = new n2.a(lVar);
                }
                iVar = dVar;
                break;
            case 4:
                dVar = new n2.b(lVar);
                iVar = dVar;
                break;
            case 5:
            case '\f':
            case '\r':
                dVar = new n2.j(lVar);
                iVar = dVar;
                break;
            case 6:
                dVar = new n2.g(lVar);
                iVar = dVar;
                break;
            case 7:
                dVar = new n2.e(lVar, 0);
                iVar = dVar;
                break;
            case '\t':
                dVar = new n2.h(lVar);
                iVar = dVar;
                break;
            case '\n':
                dVar = new n2.k(lVar);
                iVar = dVar;
                break;
            case 11:
                dVar = new n2.d(lVar, 1);
                iVar = dVar;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f8479a = iVar;
        this.f8480b = new u1.t(65507);
        this.f8481c = new u1.t();
        this.f8483e = new Object();
        this.f8484f = new k();
        this.f8487i = -9223372036854775807L;
        this.j = -1;
        this.f8489l = -9223372036854775807L;
        this.f8490m = -9223372036854775807L;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        synchronized (this.f8483e) {
            try {
                if (!this.f8488k) {
                    this.f8488k = true;
                }
                this.f8489l = j;
                this.f8490m = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.o
    public final boolean f(y2.p pVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // y2.o
    public final List h() {
        db.i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, m2.h] */
    @Override // y2.o
    public final int i(y2.p pVar, mc.i iVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f8485g.getClass();
        int read = pVar.read(this.f8480b.f12811a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f8480b.K(0);
        this.f8480b.J(read);
        u1.t tVar = this.f8480b;
        byte[] bArr = i.f8501g;
        i iVar2 = null;
        if (tVar.a() >= 12) {
            int y9 = tVar.y();
            byte b10 = (byte) (y9 >> 6);
            byte b11 = (byte) (y9 & 15);
            if (((y9 >> 4) & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (b10 == 2) {
                int y10 = tVar.y();
                if (((y10 >> 7) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                byte b12 = (byte) (y10 & 127);
                int E = tVar.E();
                long A = tVar.A();
                int k8 = tVar.k();
                if (b11 > 0) {
                    byte[] bArr2 = new byte[b11 * 4];
                    for (int i6 = 0; i6 < b11; i6++) {
                        tVar.i(bArr2, i6 * 4, 4);
                    }
                }
                if (z10) {
                    tVar.L(2);
                    short v10 = tVar.v();
                    if (v10 != 0) {
                        tVar.L(v10 * 4);
                    }
                }
                byte[] bArr3 = new byte[tVar.a()];
                tVar.i(bArr3, 0, tVar.a());
                ?? obj = new Object();
                obj.f8500f = bArr;
                obj.f8495a = z11;
                obj.f8496b = b12;
                if (E >= 0 && E <= 65535) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u1.c.b(z12);
                obj.f8497c = 65535 & E;
                obj.f8498d = A;
                obj.f8499e = k8;
                obj.f8500f = bArr3;
                iVar2 = new i(obj);
            }
        }
        if (iVar2 == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - 30;
        this.f8484f.c(iVar2, elapsedRealtime);
        i d10 = this.f8484f.d(j);
        if (d10 == null) {
            return 0;
        }
        if (!this.f8486h) {
            if (this.f8487i == -9223372036854775807L) {
                this.f8487i = d10.f8505d;
            }
            if (this.j == -1) {
                this.j = d10.f8504c;
            }
            this.f8479a.d(this.f8487i);
            this.f8486h = true;
        }
        synchronized (this.f8483e) {
            try {
                if (this.f8488k) {
                    if (this.f8489l != -9223372036854775807L && this.f8490m != -9223372036854775807L) {
                        this.f8484f.e();
                        this.f8479a.c(this.f8489l, this.f8490m);
                        this.f8488k = false;
                        this.f8489l = -9223372036854775807L;
                        this.f8490m = -9223372036854775807L;
                    }
                } else {
                    do {
                        u1.t tVar2 = this.f8481c;
                        byte[] bArr4 = d10.f8507f;
                        tVar2.getClass();
                        tVar2.I(bArr4.length, bArr4);
                        this.f8479a.f(this.f8481c, d10.f8505d, d10.f8504c, d10.f8502a);
                        d10 = this.f8484f.d(j);
                    } while (d10 != null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        this.f8479a.e(qVar, this.f8482d);
        qVar.t();
        qVar.n(new a3.b(-9223372036854775807L));
        this.f8485g = qVar;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
