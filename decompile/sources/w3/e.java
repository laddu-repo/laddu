package w3;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    /* renamed from: v, reason: collision with root package name */
    public static final int f13758v = c(2, 2, 2, 0);

    /* renamed from: w, reason: collision with root package name */
    public static final int f13759w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f13760x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f13761y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f13762z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13763a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f13764b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f13765c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13766d;

    /* renamed from: e, reason: collision with root package name */
    public int f13767e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13768f;

    /* renamed from: g, reason: collision with root package name */
    public int f13769g;

    /* renamed from: h, reason: collision with root package name */
    public int f13770h;

    /* renamed from: i, reason: collision with root package name */
    public int f13771i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f13772k;

    /* renamed from: l, reason: collision with root package name */
    public int f13773l;

    /* renamed from: m, reason: collision with root package name */
    public int f13774m;

    /* renamed from: n, reason: collision with root package name */
    public int f13775n;

    /* renamed from: o, reason: collision with root package name */
    public int f13776o;

    /* renamed from: p, reason: collision with root package name */
    public int f13777p;

    /* renamed from: q, reason: collision with root package name */
    public int f13778q;

    /* renamed from: r, reason: collision with root package name */
    public int f13779r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f13780t;

    /* renamed from: u, reason: collision with root package name */
    public int f13781u;

    static {
        int c10 = c(0, 0, 0, 0);
        f13759w = c10;
        int c11 = c(0, 0, 0, 3);
        f13760x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f13761y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f13762z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c10, c11, c10, c10, c11, c10, c10};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            u1.c.c(r4, r0)
            u1.c.c(r5, r0)
            u1.c.c(r6, r0)
            u1.c.c(r7, r0)
            r0 = 1
            r1 = 255(0xff, float:3.57E-43)
            r2 = 0
            if (r7 == 0) goto L1b
            if (r7 == r0) goto L1b
            r3 = 2
            if (r7 == r3) goto L20
            r3 = 3
            if (r7 == r3) goto L1e
        L1b:
            r7 = 255(0xff, float:3.57E-43)
            goto L22
        L1e:
            r7 = 0
            goto L22
        L20:
            r7 = 127(0x7f, float:1.78E-43)
        L22:
            if (r4 <= r0) goto L27
            r4 = 255(0xff, float:3.57E-43)
            goto L28
        L27:
            r4 = 0
        L28:
            if (r5 <= r0) goto L2d
            r5 = 255(0xff, float:3.57E-43)
            goto L2e
        L2d:
            r5 = 0
        L2e:
            if (r6 <= r0) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f13764b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f13763a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f13776o != -1) {
                this.f13776o = 0;
            }
            if (this.f13777p != -1) {
                this.f13777p = 0;
            }
            if (this.f13778q != -1) {
                this.f13778q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.f13781u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13764b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f13776o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f13776o, length, 33);
            }
            if (this.f13777p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13777p, length, 33);
            }
            if (this.f13778q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13779r), this.f13778q, length, 33);
            }
            if (this.s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13780t), this.s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f13763a.clear();
        this.f13764b.clear();
        this.f13776o = -1;
        this.f13777p = -1;
        this.f13778q = -1;
        this.s = -1;
        this.f13781u = 0;
        this.f13765c = false;
        this.f13766d = false;
        this.f13767e = 4;
        this.f13768f = false;
        this.f13769g = 0;
        this.f13770h = 0;
        this.f13771i = 0;
        this.j = 15;
        this.f13772k = 0;
        this.f13773l = 0;
        this.f13774m = 0;
        int i6 = f13759w;
        this.f13775n = i6;
        this.f13779r = f13758v;
        this.f13780t = i6;
    }

    public final void e(boolean z10, boolean z11) {
        int i6 = this.f13776o;
        SpannableStringBuilder spannableStringBuilder = this.f13764b;
        if (i6 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f13776o, spannableStringBuilder.length(), 33);
                this.f13776o = -1;
            }
        } else if (z10) {
            this.f13776o = spannableStringBuilder.length();
        }
        if (this.f13777p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13777p, spannableStringBuilder.length(), 33);
                this.f13777p = -1;
                return;
            }
            return;
        }
        if (z11) {
            this.f13777p = spannableStringBuilder.length();
        }
    }

    public final void f(int i6, int i10) {
        int i11 = this.f13778q;
        SpannableStringBuilder spannableStringBuilder = this.f13764b;
        if (i11 != -1 && this.f13779r != i6) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13779r), this.f13778q, spannableStringBuilder.length(), 33);
        }
        if (i6 != f13758v) {
            this.f13778q = spannableStringBuilder.length();
            this.f13779r = i6;
        }
        if (this.s != -1 && this.f13780t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13780t), this.s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f13759w) {
            this.s = spannableStringBuilder.length();
            this.f13780t = i10;
        }
    }
}
