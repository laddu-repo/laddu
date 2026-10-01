package w2;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f13623a;

    /* renamed from: b, reason: collision with root package name */
    public long f13624b;

    /* renamed from: c, reason: collision with root package name */
    public long f13625c;

    /* renamed from: d, reason: collision with root package name */
    public long f13626d;

    /* renamed from: e, reason: collision with root package name */
    public long f13627e;

    /* renamed from: f, reason: collision with root package name */
    public long f13628f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f13629g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f13630h;

    public final boolean a() {
        if (this.f13626d > 15 && this.f13630h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j) {
        long j10 = this.f13626d;
        if (j10 == 0) {
            this.f13623a = j;
        } else if (j10 == 1) {
            long j11 = j - this.f13623a;
            this.f13624b = j11;
            this.f13628f = j11;
            this.f13627e = 1L;
        } else {
            long j12 = j - this.f13625c;
            int i6 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.f13624b);
            boolean[] zArr = this.f13629g;
            if (abs <= 1000000) {
                this.f13627e++;
                this.f13628f += j12;
                if (zArr[i6]) {
                    zArr[i6] = false;
                    this.f13630h--;
                }
            } else if (!zArr[i6]) {
                zArr[i6] = true;
                this.f13630h++;
            }
        }
        this.f13626d++;
        this.f13625c = j;
    }

    public final void c() {
        this.f13626d = 0L;
        this.f13627e = 0L;
        this.f13628f = 0L;
        this.f13630h = 0;
        Arrays.fill(this.f13629g, false);
    }
}
