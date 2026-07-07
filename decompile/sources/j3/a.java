package j3;

import java.util.Arrays;
import java.util.Objects;
import r1.g0;
import r1.i0;
import r1.k0;
import r1.p;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: g, reason: collision with root package name */
    public static final q f7146g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f7147h;

    /* renamed from: a, reason: collision with root package name */
    public final String f7148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7149b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7150c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7151d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7152e;

    /* renamed from: f, reason: collision with root package name */
    public int f7153f;

    static {
        p pVar = new p();
        pVar.f11611m = k0.p("application/id3");
        f7146g = new q(pVar);
        p pVar2 = new p();
        pVar2.f11611m = k0.p("application/x-scte35");
        f7147h = new q(pVar2);
    }

    public a(String str, String str2, long j, long j10, byte[] bArr) {
        this.f7148a = str;
        this.f7149b = str2;
        this.f7150c = j;
        this.f7151d = j10;
        this.f7152e = bArr;
    }

    @Override // r1.i0
    public final q a() {
        String str = this.f7148a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f7147h;
            case 1:
            case 2:
                return f7146g;
            default:
                return null;
        }
    }

    @Override // r1.i0
    public final byte[] c() {
        if (a() != null) {
            return this.f7152e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7150c == aVar.f7150c && this.f7151d == aVar.f7151d && Objects.equals(this.f7148a, aVar.f7148a) && Objects.equals(this.f7149b, aVar.f7149b) && Arrays.equals(this.f7152e, aVar.f7152e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        if (this.f7153f == 0) {
            int i10 = 0;
            String str = this.f7148a;
            if (str != null) {
                i6 = str.hashCode();
            } else {
                i6 = 0;
            }
            int i11 = (527 + i6) * 31;
            String str2 = this.f7149b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            int i12 = (i11 + i10) * 31;
            long j = this.f7150c;
            int i13 = (i12 + ((int) (j ^ (j >>> 32)))) * 31;
            long j10 = this.f7151d;
            this.f7153f = Arrays.hashCode(this.f7152e) + ((i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f7153f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f7148a + ", id=" + this.f7151d + ", durationMs=" + this.f7150c + ", value=" + this.f7149b;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
