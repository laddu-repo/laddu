package c4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import db.c1;
import db.i0;
import db.k0;
import h8.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import okhttp3.HttpUrl;
import t1.b;
import u1.a0;
import u1.g;
import u1.t;
import v3.d;
import v3.l;
import v3.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements m {
    public final int A;
    public final String B;
    public final float C;
    public final int D;

    /* renamed from: x, reason: collision with root package name */
    public final t f1962x = new t();

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1963y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1964z;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f1964z = bArr[24];
            this.A = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.B = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i6 = bArr[25] * 20;
            this.D = i6;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f1963y = z10;
            if (z10) {
                this.C = a0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
                return;
            } else {
                this.C = 0.85f;
                return;
            }
        }
        this.f1964z = 0;
        this.A = -1;
        this.B = "sans-serif";
        this.f1963y = false;
        this.C = 0.85f;
        this.D = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i6, int i10, int i11, int i12, int i13) {
        if (i6 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i6 >>> 8) | ((i6 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i6, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (i6 != i10) {
            int i14 = i13 | 33;
            boolean z12 = true;
            if ((i6 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i6 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            if ((i6 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    @Override // v3.m
    public final int B() {
        return 2;
    }

    @Override // v3.m
    public final /* synthetic */ d g(byte[] bArr, int i6, int i10) {
        return c.a(this, bArr, i10);
    }

    @Override // v3.m
    public final void o(byte[] bArr, int i6, int i10, l lVar, g gVar) {
        boolean z10;
        String w10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        t tVar = this.f1962x;
        tVar.I(i6 + i10, bArr);
        tVar.K(i6);
        int i12 = 1;
        int i13 = 2;
        if (tVar.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        int E = tVar.E();
        if (E == 0) {
            w10 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            int i14 = tVar.f12812b;
            Charset G = tVar.G();
            int i15 = E - (tVar.f12812b - i14);
            if (G == null) {
                G = StandardCharsets.UTF_8;
            }
            w10 = tVar.w(i15, G);
        }
        if (w10.isEmpty()) {
            i0 i0Var = k0.f4008y;
            gVar.accept(new v3.a(-9223372036854775807L, -9223372036854775807L, c1.B));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w10);
        b(spannableStringBuilder, this.f1964z, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.A, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.B;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f3 = this.C;
        while (tVar.a() >= 8) {
            int i16 = tVar.f12812b;
            int k8 = tVar.k();
            int k9 = tVar.k();
            if (k9 == 1937013100) {
                if (tVar.a() >= i13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u1.c.b(z12);
                int E2 = tVar.E();
                int i17 = 0;
                while (i17 < E2) {
                    if (tVar.a() >= 12) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    u1.c.b(z13);
                    int E3 = tVar.E();
                    int E4 = tVar.E();
                    tVar.L(i13);
                    int i18 = i17;
                    int y9 = tVar.y();
                    tVar.L(i12);
                    int k10 = tVar.k();
                    if (E4 > spannableStringBuilder.length()) {
                        StringBuilder n10 = c.n(E4, "Truncating styl end (", ") to cueText.length() (");
                        n10.append(spannableStringBuilder.length());
                        n10.append(").");
                        u1.a.p("Tx3gParser", n10.toString());
                        E4 = spannableStringBuilder.length();
                    }
                    if (E3 >= E4) {
                        u1.a.p("Tx3gParser", "Ignoring styl with start (" + E3 + ") >= end (" + E4 + ").");
                        i11 = i18;
                    } else {
                        i11 = i18;
                        int i19 = E4;
                        b(spannableStringBuilder, y9, this.f1964z, E3, i19, 0);
                        a(spannableStringBuilder, k10, this.A, E3, i19, 0);
                    }
                    i17 = i11 + 1;
                    i12 = 1;
                    i13 = 2;
                }
            } else if (k9 == 1952608120 && this.f1963y) {
                if (tVar.a() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u1.c.b(z11);
                f3 = a0.h(tVar.E() / this.D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
                tVar.K(i16 + k8);
                i12 = 1;
                i13 = 2;
            }
            tVar.K(i16 + k8);
            i12 = 1;
            i13 = 2;
        }
        gVar.accept(new v3.a(-9223372036854775807L, -9223372036854775807L, k0.o(new b(spannableStringBuilder, null, null, null, f3, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0))));
    }

    @Override // v3.m
    public final /* synthetic */ void reset() {
    }
}
