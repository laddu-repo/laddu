package ec;

import cc.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f4558d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f4559e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f4560a;

    /* renamed from: b, reason: collision with root package name */
    public long f4561b;

    /* renamed from: c, reason: collision with root package name */
    public int f4562c;

    public d() {
        if (l.f14209z == null) {
            Pattern pattern = k.f2044c;
            l.f14209z = new l(12);
        }
        l lVar = l.f14209z;
        if (k.f2045d == null) {
            k.f2045d = new k(lVar);
        }
        this.f4560a = k.f2045d;
    }

    public final synchronized long a(int i6) {
        boolean z10;
        if (i6 != 429 && (i6 < 500 || i6 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return f4558d;
        }
        double pow = Math.pow(2.0d, this.f4562c);
        this.f4560a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f4559e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f4562c != 0) {
            this.f4560a.f2046a.getClass();
            if (System.currentTimeMillis() <= this.f4561b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f4562c = 0;
    }

    public final synchronized void d(int i6) {
        if ((i6 < 200 || i6 >= 300) && i6 != 401 && i6 != 404) {
            this.f4562c++;
            long a10 = a(i6);
            this.f4560a.f2046a.getClass();
            this.f4561b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
