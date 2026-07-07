package a2;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d2 implements b1 {
    public final Object A;
    public Object B;

    /* renamed from: x, reason: collision with root package name */
    public long f206x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f207y;

    /* renamed from: z, reason: collision with root package name */
    public long f208z;

    public d2(n9.c1 c1Var, String str, long j) {
        Objects.requireNonNull(c1Var);
        this.B = c1Var;
        w8.x.d(str);
        this.A = str;
        this.f206x = j;
    }

    public void a(long j) {
        this.f206x = j;
        if (this.f207y) {
            ((u1.v) this.A).getClass();
            this.f208z = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (!this.f207y) {
            ((u1.v) this.A).getClass();
            this.f208z = SystemClock.elapsedRealtime();
            this.f207y = true;
        }
    }

    public long c() {
        if (!this.f207y) {
            this.f207y = true;
            n9.c1 c1Var = (n9.c1) this.B;
            this.f208z = c1Var.h1().getLong((String) this.A, this.f206x);
        }
        return this.f208z;
    }

    @Override // a2.b1
    public r1.o0 d() {
        return (r1.o0) this.B;
    }

    @Override // a2.b1
    public void e(r1.o0 o0Var) {
        if (this.f207y) {
            a(f());
        }
        this.B = o0Var;
    }

    @Override // a2.b1
    public long f() {
        long j;
        long j10 = this.f206x;
        if (this.f207y) {
            ((u1.v) this.A).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f208z;
            if (((r1.o0) this.B).f11596a == 1.0f) {
                j = u1.a0.Q(elapsedRealtime);
            } else {
                j = elapsedRealtime * r4.f11598c;
            }
            return j + j10;
        }
        return j10;
    }

    @Override // a2.b1
    public /* synthetic */ boolean g() {
        return false;
    }

    public void h(long j) {
        SharedPreferences.Editor edit = ((n9.c1) this.B).h1().edit();
        edit.putLong((String) this.A, j);
        edit.apply();
        this.f208z = j;
    }

    public d2(u1.v vVar) {
        this.A = vVar;
        this.B = r1.o0.f11593d;
    }
}
