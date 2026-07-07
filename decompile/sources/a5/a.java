package a5;

import df.m;
import java.util.Locale;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements g5.a {

    /* renamed from: x, reason: collision with root package name */
    public final h5.b f568x;

    public a(h5.b db2) {
        k.e(db2, "db");
        this.f568x = db2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f568x.close();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [a5.f, a5.h] */
    @Override // g5.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final h d0(String sql) {
        String str;
        int i6;
        k.e(sql, "sql");
        h5.b db2 = this.f568x;
        k.e(db2, "db");
        String upperCase = m.n0(sql).toString().toUpperCase(Locale.ROOT);
        k.d(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i10 = -1;
        if (length >= 0) {
            int i11 = 0;
            loop0: while (i11 < length) {
                char charAt = upperCase.charAt(i11);
                if (k.g(charAt, 32) > 0) {
                    if (charAt == '-') {
                        if (upperCase.charAt(i11 + 1) == '-') {
                            i11 = m.P(upperCase, '\n', i11 + 2, 4);
                            if (i11 < 0) {
                                break;
                            }
                        } else {
                            i10 = i11;
                            break;
                        }
                    } else {
                        if (charAt == '/') {
                            int i12 = i11 + 1;
                            if (upperCase.charAt(i12) != '*') {
                            }
                            do {
                                i12 = m.P(upperCase, '*', i12 + 1, 4);
                                if (i12 >= 0) {
                                    i6 = i12 + 1;
                                    if (i6 >= length) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } while (upperCase.charAt(i6) != '/');
                            i11 = i12 + 2;
                        }
                        i10 = i11;
                        break;
                    }
                }
                i11++;
            }
        }
        if (i10 >= 0 && i10 <= upperCase.length()) {
            str = upperCase.substring(i10, Math.min(i10 + 3, upperCase.length()));
            k.d(str, "substring(...)");
        } else {
            str = null;
        }
        if (str == null) {
            return new g(db2, sql);
        }
        int hashCode = str.hashCode();
        if (hashCode == 79487 ? str.equals("PRA") : !(hashCode == 81978 ? !str.equals("SEL") : !(hashCode == 85954 && str.equals("WIT")))) {
            ?? hVar = new h(db2, sql);
            hVar.A = new int[0];
            hVar.B = new long[0];
            hVar.C = new double[0];
            hVar.D = new String[0];
            hVar.E = new byte[0];
            return hVar;
        }
        return new g(db2, sql);
    }
}
