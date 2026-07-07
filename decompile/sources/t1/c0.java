package t1;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final c0 B;
    public final y9.f0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f11950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f11951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f11952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f11953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f11954e;
    public final byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f11955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f11956h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f11957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f11958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f11959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f11960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f11961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f11962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f11963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f11964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f11965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f11966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f11967t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f11968u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f11969v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f11970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f11971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f11972y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f11973z;

    static {
        b0 b0Var = new b0();
        y9.c0 c0Var = y9.f0.f14553w;
        b0Var.f11947z = y9.z0.f14637z;
        B = new c0(b0Var);
        d0.d.p(0, 1, 2, 3, 4);
        d0.d.p(5, 6, 8, 9, 10);
        d0.d.p(11, 12, 13, 14, 15);
        d0.d.p(16, 17, 18, 19, 20);
        d0.d.p(21, 22, 23, 24, 25);
        d0.d.p(26, 27, 28, 29, 30);
        d0.d.p(31, 32, 33, 34, 1000);
    }

    public c0(b0 b0Var) {
        Boolean boolValueOf = b0Var.f11932k;
        Integer numValueOf = b0Var.f11931j;
        Integer numValueOf2 = b0Var.f11946y;
        int i = 1;
        int i10 = 0;
        int i11 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i11 = i;
                }
                numValueOf = Integer.valueOf(i11);
            }
        } else if (numValueOf != null) {
            boolean z2 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z2);
            if (z2 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        i10 = 23;
                        break;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        i10 = 24;
                        break;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i10);
            }
        }
        this.f11950a = b0Var.f11924a;
        this.f11951b = b0Var.f11925b;
        this.f11952c = b0Var.f11926c;
        this.f11953d = b0Var.f11927d;
        this.f11954e = b0Var.f11928e;
        this.f = b0Var.f;
        this.f11955g = b0Var.f11929g;
        this.f11956h = b0Var.f11930h;
        this.i = b0Var.i;
        this.f11957j = numValueOf;
        this.f11958k = boolValueOf;
        Integer num = b0Var.f11933l;
        this.f11959l = num;
        this.f11960m = num;
        this.f11961n = b0Var.f11934m;
        this.f11962o = b0Var.f11935n;
        this.f11963p = b0Var.f11936o;
        this.f11964q = b0Var.f11937p;
        this.f11965r = b0Var.f11938q;
        this.f11966s = b0Var.f11939r;
        this.f11967t = b0Var.f11940s;
        this.f11968u = b0Var.f11941t;
        this.f11969v = b0Var.f11942u;
        this.f11970w = b0Var.f11943v;
        this.f11971x = b0Var.f11944w;
        this.f11972y = b0Var.f11945x;
        this.f11973z = numValueOf2;
        this.A = b0Var.f11947z;
    }

    public final b0 a() {
        b0 b0Var = new b0();
        b0Var.f11924a = this.f11950a;
        b0Var.f11925b = this.f11951b;
        b0Var.f11926c = this.f11952c;
        b0Var.f11927d = this.f11953d;
        b0Var.f11928e = this.f11954e;
        b0Var.f = this.f;
        b0Var.f11929g = this.f11955g;
        b0Var.f11930h = this.f11956h;
        b0Var.i = this.i;
        b0Var.f11931j = this.f11957j;
        b0Var.f11932k = this.f11958k;
        b0Var.f11933l = this.f11960m;
        b0Var.f11934m = this.f11961n;
        b0Var.f11935n = this.f11962o;
        b0Var.f11936o = this.f11963p;
        b0Var.f11937p = this.f11964q;
        b0Var.f11938q = this.f11965r;
        b0Var.f11939r = this.f11966s;
        b0Var.f11940s = this.f11967t;
        b0Var.f11941t = this.f11968u;
        b0Var.f11942u = this.f11969v;
        b0Var.f11943v = this.f11970w;
        b0Var.f11944w = this.f11971x;
        b0Var.f11945x = this.f11972y;
        b0Var.f11946y = this.f11973z;
        b0Var.f11947z = this.A;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Objects.equals(this.f11950a, c0Var.f11950a) && Objects.equals(this.f11951b, c0Var.f11951b) && Objects.equals(this.f11952c, c0Var.f11952c) && Objects.equals(this.f11953d, c0Var.f11953d) && Objects.equals(this.f11954e, c0Var.f11954e) && Arrays.equals(this.f, c0Var.f) && Objects.equals(this.f11955g, c0Var.f11955g) && Objects.equals(this.f11956h, c0Var.f11956h) && Objects.equals(this.i, c0Var.i) && Objects.equals(this.f11957j, c0Var.f11957j) && Objects.equals(this.f11958k, c0Var.f11958k) && Objects.equals(this.f11960m, c0Var.f11960m) && Objects.equals(this.f11961n, c0Var.f11961n) && Objects.equals(this.f11962o, c0Var.f11962o) && Objects.equals(this.f11963p, c0Var.f11963p) && Objects.equals(this.f11964q, c0Var.f11964q) && Objects.equals(this.f11965r, c0Var.f11965r) && Objects.equals(this.f11966s, c0Var.f11966s) && Objects.equals(this.f11967t, c0Var.f11967t) && Objects.equals(this.f11968u, c0Var.f11968u) && Objects.equals(this.f11969v, c0Var.f11969v) && Objects.equals(this.f11970w, c0Var.f11970w) && Objects.equals(this.f11971x, c0Var.f11971x) && Objects.equals(this.f11972y, c0Var.f11972y) && Objects.equals(this.f11973z, c0Var.f11973z) && Objects.equals(this.A, c0Var.A);
    }

    public final int hashCode() {
        return Objects.hash(this.f11950a, this.f11951b, this.f11952c, this.f11953d, null, null, this.f11954e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.f11955g, null, this.f11956h, this.i, this.f11957j, this.f11958k, null, this.f11960m, this.f11961n, this.f11962o, this.f11963p, this.f11964q, this.f11965r, this.f11966s, this.f11967t, this.f11968u, this.f11969v, this.f11970w, this.f11971x, null, this.f11972y, this.f11973z, true, this.A);
    }
}
