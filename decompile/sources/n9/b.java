package n9;

import com.google.android.gms.internal.measurement.m5;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9173a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9174b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f9175c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f9176d;

    /* renamed from: e, reason: collision with root package name */
    public Long f9177e;

    /* renamed from: f, reason: collision with root package name */
    public Long f9178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f9180h;

    /* renamed from: i, reason: collision with root package name */
    public final m5 f9181i;

    public b(c cVar, String str, int i6, m5 m5Var, int i10) {
        this.f9179g = i10;
        this.f9180h = cVar;
        this.f9173a = str;
        this.f9174b = i6;
        this.f9181i = m5Var;
    }

    public static Boolean c(Boolean bool, boolean z10) {
        boolean z11;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.x1 x1Var, u0 u0Var) {
        String r10;
        List u3;
        String str2;
        int i6;
        w8.x.g(x1Var);
        if (str != null && x1Var.p() && x1Var.x() != 1 && (x1Var.x() != 7 ? x1Var.q() : x1Var.v() != 0)) {
            int x10 = x1Var.x();
            boolean t10 = x1Var.t();
            if (!t10 && x10 != 2 && x10 != 7) {
                r10 = x1Var.r().toUpperCase(Locale.ENGLISH);
            } else {
                r10 = x1Var.r();
            }
            if (x1Var.v() == 0) {
                u3 = null;
            } else {
                u3 = x1Var.u();
                if (!t10) {
                    ArrayList arrayList = new ArrayList(u3.size());
                    Iterator it = u3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    u3 = Collections.unmodifiableList(arrayList);
                }
            }
            if (x10 == 2) {
                str2 = r10;
            } else {
                str2 = null;
            }
            if (x10 != 7 ? r10 != null : u3 != null && !u3.isEmpty()) {
                if (!t10 && x10 != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (x10 - 1) {
                    case 1:
                        if (str2 != null) {
                            if (true != t10) {
                                i6 = 66;
                            } else {
                                i6 = 0;
                            }
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, i6).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (u0Var != null) {
                                    u0Var.G.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(r10));
                    case 3:
                        return Boolean.valueOf(str.endsWith(r10));
                    case 4:
                        return Boolean.valueOf(str.contains(r10));
                    case 5:
                        return Boolean.valueOf(str.equals(r10));
                    case 6:
                        if (u3 != null) {
                            return Boolean.valueOf(u3.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.u1 u1Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        w8.x.g(u1Var);
        if (u1Var.p()) {
            boolean z10 = true;
            if (u1Var.z() != 1 && (u1Var.z() != 5 ? u1Var.s() : u1Var.u() && u1Var.w())) {
                int z11 = u1Var.z();
                try {
                    if (u1Var.z() == 5) {
                        if (y0.J1(u1Var.v()) && y0.J1(u1Var.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(u1Var.v());
                            bigDecimal4 = new BigDecimal(u1Var.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (y0.J1(u1Var.t())) {
                        bigDecimal2 = new BigDecimal(u1Var.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (z11 != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i6 = z11 - 1;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 == 4 && bigDecimal3 != null) {
                                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                            z10 = false;
                                        }
                                        return Boolean.valueOf(z10);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d10 != 0.0d) {
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                                            z10 = false;
                                        }
                                        return Boolean.valueOf(z10);
                                    }
                                    if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                        z10 = false;
                                    }
                                    return Boolean.valueOf(z10);
                                }
                            } else if (bigDecimal2 != null) {
                                if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                                    z10 = false;
                                }
                                return Boolean.valueOf(z10);
                            }
                        } else if (bigDecimal2 != null) {
                            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cf A[EDGE_INSN: B:160:0x03cf->B:52:0x03cf BREAK  A[LOOP:3: B:132:0x0247->B:157:0x0247], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.c3 r24, long r25, n9.s r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.c3, long, n9.s, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.Long r15, java.lang.Long r16, com.google.android.gms.internal.measurement.t3 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.b(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.t3, boolean):boolean");
    }
}
