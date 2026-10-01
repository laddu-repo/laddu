package g2;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import r1.k0;
import y2.e0;
import y2.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final r1.q f5353f;

    /* renamed from: g, reason: collision with root package name */
    public static final r1.q f5354g;

    /* renamed from: a, reason: collision with root package name */
    public final f0 f5355a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.q f5356b;

    /* renamed from: c, reason: collision with root package name */
    public r1.q f5357c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5358d;

    /* renamed from: e, reason: collision with root package name */
    public int f5359e;

    static {
        r1.p pVar = new r1.p();
        pVar.f11611m = k0.p("application/id3");
        f5353f = new r1.q(pVar);
        r1.p pVar2 = new r1.p();
        pVar2.f11611m = k0.p("application/x-emsg");
        f5354g = new r1.q(pVar2);
    }

    public o(f0 f0Var, int i6) {
        this.f5355a = f0Var;
        if (i6 != 1) {
            if (i6 == 3) {
                this.f5356b = f5354g;
            } else {
                throw new IllegalArgumentException(h8.c.i(i6, "Unknown metadataType: "));
            }
        } else {
            this.f5356b = f5353f;
        }
        this.f5358d = new byte[0];
        this.f5359e = 0;
    }

    @Override // y2.f0
    public final /* synthetic */ void a(int i6, u1.t tVar) {
        w8.k.a(this, tVar, i6);
    }

    @Override // y2.f0
    public final void b(u1.t tVar, int i6, int i10) {
        int i11 = this.f5359e + i6;
        byte[] bArr = this.f5358d;
        if (bArr.length < i11) {
            this.f5358d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        tVar.i(this.f5358d, this.f5359e, i6);
        this.f5359e += i6;
    }

    @Override // y2.f0
    public final void c(long j, int i6, int i10, int i11, e0 e0Var) {
        this.f5357c.getClass();
        int i12 = this.f5359e - i11;
        u1.t tVar = new u1.t(Arrays.copyOfRange(this.f5358d, i12 - i10, i12));
        byte[] bArr = this.f5358d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f5359e = i11;
        String str = this.f5357c.f11670n;
        r1.q qVar = this.f5356b;
        String str2 = qVar.f11670n;
        String str3 = qVar.f11670n;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f5357c.f11670n)) {
                j3.a x10 = i3.b.x(tVar);
                r1.q a10 = x10.a();
                if (a10 != null && Objects.equals(str3, a10.f11670n)) {
                    byte[] c10 = x10.c();
                    c10.getClass();
                    tVar = new u1.t(c10);
                } else {
                    u1.a.p("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + x10.a());
                    return;
                }
            } else {
                u1.a.p("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f5357c.f11670n);
                return;
            }
        }
        int a11 = tVar.a();
        f0 f0Var = this.f5355a;
        f0Var.a(a11, tVar);
        f0Var.c(j, i6, a11, 0, e0Var);
    }

    @Override // y2.f0
    public final int d(r1.i iVar, int i6, boolean z10) {
        int i10 = this.f5359e + i6;
        byte[] bArr = this.f5358d;
        if (bArr.length < i10) {
            this.f5358d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = iVar.read(this.f5358d, this.f5359e, i6);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f5359e += read;
        return read;
    }

    @Override // y2.f0
    public final int e(r1.i iVar, int i6, boolean z10) {
        return d(iVar, i6, z10);
    }

    @Override // y2.f0
    public final void f(r1.q qVar) {
        this.f5357c = qVar;
        this.f5355a.f(this.f5356b);
    }
}
