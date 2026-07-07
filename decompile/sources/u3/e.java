package u3;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f12843v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f12845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f12846y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f12847z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12848a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f12849b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12852e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12854h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12866u;

    static {
        int iC = c(0, 0, 0, 0);
        f12844w = iC;
        int iC2 = c(0, 0, 0, 3);
        f12845x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f12846y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f12847z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            w1.a.g(r4, r0)
            w1.a.g(r5, r0)
            w1.a.g(r6, r0)
            w1.a.g(r7, r0)
            r0 = 1
            r1 = 255(0xff, float:3.57E-43)
            r2 = 0
            if (r7 == 0) goto L1b
            if (r7 == r0) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r1
            goto L21
        L1d:
            r7 = r2
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r0) goto L25
            r4 = r1
            goto L26
        L25:
            r4 = r2
        L26:
            if (r5 <= r0) goto L2a
            r5 = r1
            goto L2b
        L2a:
            r5 = r2
        L2b:
            if (r6 <= r0) goto L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f12849b;
        if (c10 != '\n') {
            spannableStringBuilder.append(c10);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f12848a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f12860o != -1) {
            this.f12860o = 0;
        }
        if (this.f12861p != -1) {
            this.f12861p = 0;
        }
        if (this.f12862q != -1) {
            this.f12862q = 0;
        }
        if (this.f12864s != -1) {
            this.f12864s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f12855j && arrayList.size() < 15) {
                this.f12866u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12849b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f12860o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f12860o, length, 33);
            }
            if (this.f12861p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f12861p, length, 33);
            }
            if (this.f12862q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12863r), this.f12862q, length, 33);
            }
            if (this.f12864s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12865t), this.f12864s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f12848a.clear();
        this.f12849b.clear();
        this.f12860o = -1;
        this.f12861p = -1;
        this.f12862q = -1;
        this.f12864s = -1;
        this.f12866u = 0;
        this.f12850c = false;
        this.f12851d = false;
        this.f12852e = 4;
        this.f = false;
        this.f12853g = 0;
        this.f12854h = 0;
        this.i = 0;
        this.f12855j = 15;
        this.f12856k = 0;
        this.f12857l = 0;
        this.f12858m = 0;
        int i = f12844w;
        this.f12859n = i;
        this.f12863r = f12843v;
        this.f12865t = i;
    }

    public final void e(boolean z2, boolean z10) {
        int i = this.f12860o;
        SpannableStringBuilder spannableStringBuilder = this.f12849b;
        if (i != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f12860o, spannableStringBuilder.length(), 33);
                this.f12860o = -1;
            }
        } else if (z2) {
            this.f12860o = spannableStringBuilder.length();
        }
        if (this.f12861p == -1) {
            if (z10) {
                this.f12861p = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f12861p, spannableStringBuilder.length(), 33);
            this.f12861p = -1;
        }
    }

    public final void f(int i, int i10) {
        int i11 = this.f12862q;
        SpannableStringBuilder spannableStringBuilder = this.f12849b;
        if (i11 != -1 && this.f12863r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12863r), this.f12862q, spannableStringBuilder.length(), 33);
        }
        if (i != f12843v) {
            this.f12862q = spannableStringBuilder.length();
            this.f12863r = i;
        }
        if (this.f12864s != -1 && this.f12865t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12865t), this.f12864s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f12844w) {
            this.f12864s = spannableStringBuilder.length();
            this.f12865t = i10;
        }
    }
}
