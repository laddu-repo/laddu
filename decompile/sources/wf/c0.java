package wf;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f14302a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f14303b = new a1("kotlin.time.Instant", uf.e.f13123n);

    @Override // sf.a
    public final Object a(vf.b bVar) {
        int i6;
        ef.h j;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        int i18;
        long j10;
        char charAt;
        char charAt2;
        ef.d dVar = ef.d.f4573z;
        String input = bVar.q();
        kotlin.jvm.internal.k.e(input, "input");
        if (input.length() == 0) {
            j = new e2.u("An empty string is not a valid Instant", input);
        } else {
            char charAt3 = input.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                charAt3 = ' ';
                i6 = 0;
            } else {
                i6 = 1;
            }
            int i19 = i6;
            int i20 = 0;
            while (i19 < input.length() && '0' <= (charAt2 = input.charAt(i19)) && charAt2 < ':') {
                i20 = (i20 * 10) + (input.charAt(i19) - '0');
                i19++;
            }
            int i21 = i19 - i6;
            if (i21 > 10) {
                j = ef.f.k(input, "Expected at most 10 digits for the year number, got " + i21 + " digits");
            } else if (i21 == 10 && kotlin.jvm.internal.k.g(input.charAt(i6), 50) >= 0) {
                j = ef.f.k(input, "Expected at most 9 digits for the year number or year 1000000000, got " + i21 + " digits");
            } else if (i21 < 4) {
                j = ef.f.k(input, "The year number must be padded to 4 digits, got " + i21 + " digits");
            } else if (charAt3 == '+' && i21 == 4) {
                j = ef.f.k(input, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i21 != 4) {
                j = ef.f.k(input, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i20 = -i20;
                }
                int i22 = i19 + 16;
                if (input.length() < i22) {
                    j = ef.f.k(input, "The input string is too short");
                } else {
                    e2.u j11 = ef.f.j(input, "'-'", i19, new cf.p(3));
                    if (j11 == null) {
                        j = ef.f.j(input, "'-'", i19 + 3, new cf.p(4));
                        if (j == null && (j = ef.f.j(input, "'T' or 't'", i19 + 6, new cf.p(5))) == null && (j = ef.f.j(input, "':'", i19 + 9, new cf.p(6))) == null && (j = ef.f.j(input, "':'", i19 + 12, new cf.p(7))) == null) {
                            for (int i23 = 0; i23 < 10; i23++) {
                                j11 = ef.f.j(input, "an ASCII digit", ef.f.f4577b[i23] + i19, new cf.p(8));
                                if (j11 == null) {
                                }
                            }
                            int l10 = ef.f.l(i19 + 1, input);
                            int l11 = ef.f.l(i19 + 4, input);
                            int l12 = ef.f.l(i19 + 7, input);
                            int l13 = ef.f.l(i19 + 10, input);
                            int l14 = ef.f.l(i19 + 13, input);
                            int i24 = i19 + 15;
                            if (input.charAt(i24) == '.') {
                                i24 = i22;
                                int i25 = 0;
                                while (i24 < input.length() && '0' <= (charAt = input.charAt(i24)) && charAt < ':') {
                                    i25 = (i25 * 10) + (input.charAt(i24) - '0');
                                    i24++;
                                }
                                int i26 = i24 - i22;
                                if (1 <= i26 && i26 < 10) {
                                    i10 = i25 * ef.f.f4576a[9 - i26];
                                } else {
                                    j = ef.f.k(input, "1..9 digits are supported for the fraction of the second, got " + i26 + " digits");
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i24 >= input.length()) {
                                j = ef.f.k(input, "The UTC offset at the end of the string is missing");
                            } else {
                                char charAt4 = input.charAt(i24);
                                if (charAt4 != '+' && charAt4 != '-') {
                                    if (charAt4 != 'Z' && charAt4 != 'z') {
                                        j = ef.f.k(input, "Expected the UTC offset at position " + i24 + ", got '" + charAt4 + '\'');
                                    } else {
                                        int i27 = i24 + 1;
                                        if (input.length() == i27) {
                                            i14 = 0;
                                            if (1 > l10) {
                                            }
                                            j = ef.f.k(input, "Expected a month number in 1..12, got " + l10);
                                        } else {
                                            j = ef.f.k(input, "Extra text after the instant at position " + i27);
                                        }
                                    }
                                } else {
                                    int length = input.length() - i24;
                                    if (length > 9) {
                                        j = ef.f.k(input, "The UTC offset string \"" + ef.f.q(16, input.subSequence(i24, input.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        j = ef.f.k(input, "Invalid UTC offset string \"" + input.subSequence(i24, input.length()).toString() + '\"');
                                    } else {
                                        int i28 = 0;
                                        for (int i29 = 2; i28 < i29; i29 = 2) {
                                            int i30 = i24 + ef.f.f4578c[i28];
                                            if (i30 >= input.length()) {
                                                break;
                                            }
                                            if (input.charAt(i30) != ':') {
                                                StringBuilder n10 = h8.c.n(i30, "Expected ':' at index ", ", got '");
                                                n10.append(input.charAt(i30));
                                                n10.append('\'');
                                                j = ef.f.k(input, n10.toString());
                                                break;
                                            }
                                            i28++;
                                        }
                                        int i31 = 0;
                                        while (i31 < 6 && (i15 = ef.f.f4579d[i31] + i24) < input.length()) {
                                            char charAt5 = input.charAt(i15);
                                            int i32 = i31;
                                            if ('0' <= charAt5 && charAt5 < ':') {
                                                i31 = i32 + 1;
                                            } else {
                                                StringBuilder n11 = h8.c.n(i15, "Expected an ASCII digit at index ", ", got '");
                                                n11.append(input.charAt(i15));
                                                n11.append('\'');
                                                j = ef.f.k(input, n11.toString());
                                                break;
                                            }
                                        }
                                        int l15 = ef.f.l(i24 + 1, input);
                                        if (length > 3) {
                                            i11 = ef.f.l(i24 + 4, input);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (length > 6) {
                                            i12 = ef.f.l(i24 + 7, input);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i11 > 59) {
                                            j = ef.f.k(input, "Expected offset-minute-of-hour in 0..59, got " + i11);
                                        } else if (i12 > 59) {
                                            j = ef.f.k(input, "Expected offset-second-of-minute in 0..59, got " + i12);
                                        } else if (l15 > 17 && (l15 != 18 || i11 != 0 || i12 != 0)) {
                                            j = ef.f.k(input, "Expected an offset in -18:00..+18:00, got " + input.subSequence(i24, input.length()).toString());
                                        } else {
                                            int i33 = (i11 * 60) + (l15 * 3600) + i12;
                                            if (charAt4 == '-') {
                                                i13 = -1;
                                            } else {
                                                i13 = 1;
                                            }
                                            i14 = i33 * i13;
                                            if (1 > l10 && l10 < 13) {
                                                if (1 <= l11) {
                                                    int i34 = i20 & 3;
                                                    if (i34 == 0 && (i20 % 100 != 0 || i20 % CommonGatewayClient.CODE_400 == 0)) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (l10 != 2) {
                                                        if (l10 != 4 && l10 != 6 && l10 != 9 && l10 != 11) {
                                                            i16 = 31;
                                                        } else {
                                                            i16 = 30;
                                                        }
                                                    } else if (z10) {
                                                        i16 = 29;
                                                    } else {
                                                        i16 = 28;
                                                    }
                                                    if (l11 <= i16) {
                                                        if (l12 > 23) {
                                                            j = ef.f.k(input, "Expected hour in 0..23, got " + l12);
                                                        } else if (l13 > 59) {
                                                            j = ef.f.k(input, "Expected minute-of-hour in 0..59, got " + l13);
                                                        } else if (l14 > 59) {
                                                            j = ef.f.k(input, "Expected second-of-minute in 0..59, got " + l14);
                                                        } else {
                                                            long j12 = i20;
                                                            long j13 = 365 * j12;
                                                            if (j12 >= 0) {
                                                                i17 = l10;
                                                                i18 = i20;
                                                                j10 = ((j12 + 399) / CommonGatewayClient.CODE_400) + (((3 + j12) / 4) - ((99 + j12) / 100)) + j13;
                                                            } else {
                                                                i17 = l10;
                                                                i18 = i20;
                                                                j10 = j13 - ((j12 / (-400)) + ((j12 / (-4)) - (j12 / (-100))));
                                                            }
                                                            long j14 = j10 + (((r1 * 367) - 362) / 12) + (l11 - 1);
                                                            if (i17 > 2) {
                                                                j14 = (i34 == 0 && (i18 % 100 != 0 || i18 % CommonGatewayClient.CODE_400 == 0)) ? (-1) + j14 : j14 - 2;
                                                            }
                                                            j = new ef.g((((j14 - 719528) * 86400) + (((l13 * 60) + (l12 * 3600)) + l14)) - i14, i10);
                                                        }
                                                    }
                                                }
                                                StringBuilder p10 = r4.a.p(l10, i20, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                p10.append(l11);
                                                j = ef.f.k(input, p10.toString());
                                            } else {
                                                j = ef.f.k(input, "Expected a month number in 1..12, got " + l10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j = j11;
                    break;
                }
            }
        }
        return j.toInstant();
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        ef.d value = (ef.d) obj;
        kotlin.jvm.internal.k.e(value, "value");
        tVar.s(value.toString());
    }

    @Override // sf.a
    public final uf.g d() {
        return f14303b;
    }
}
