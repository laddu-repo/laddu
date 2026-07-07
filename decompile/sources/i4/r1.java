package i4;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: k, reason: collision with root package name */
    public static final r1.t0 f6519k;

    /* renamed from: l, reason: collision with root package name */
    public static final r1 f6520l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f6521m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f6522n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f6523o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f6524p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f6525q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f6526r;
    public static final String s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f6527t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f6528u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f6529v;

    /* renamed from: a, reason: collision with root package name */
    public final r1.t0 f6530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6531b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6532c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6533d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6534e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6535f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6536g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6537h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6538i;
    public final long j;

    static {
        r1.t0 t0Var = new r1.t0(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f6519k = t0Var;
        f6520l = new r1(t0Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = u1.a0.f12750a;
        f6521m = Integer.toString(0, 36);
        f6522n = Integer.toString(1, 36);
        f6523o = Integer.toString(2, 36);
        f6524p = Integer.toString(3, 36);
        f6525q = Integer.toString(4, 36);
        f6526r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        f6527t = Integer.toString(7, 36);
        f6528u = Integer.toString(8, 36);
        f6529v = Integer.toString(9, 36);
    }

    public r1(r1.t0 t0Var, boolean z10, long j, long j10, long j11, int i6, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (t0Var.f11709h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.b(z10 == z11);
        this.f6530a = t0Var;
        this.f6531b = z10;
        this.f6532c = j;
        this.f6533d = j10;
        this.f6534e = j11;
        this.f6535f = i6;
        this.f6536g = j12;
        this.f6537h = j13;
        this.f6538i = j14;
        this.j = j15;
    }

    public final r1 a(boolean z10, boolean z11) {
        boolean z12;
        long j;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (z10 && z11) {
            return this;
        }
        r1.t0 b10 = this.f6530a.b(z10, z11);
        int i6 = 0;
        if (z10 && this.f6531b) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            j = this.f6533d;
        } else {
            j = -9223372036854775807L;
        }
        if (z10) {
            j10 = this.f6534e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i6 = this.f6535f;
        }
        if (z10) {
            j11 = this.f6536g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.f6537h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f6538i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new r1(b10, z12, this.f6532c, j, j10, i6, j11, j15, j13, j14);
    }

    public final Bundle b(int i6) {
        Bundle bundle = new Bundle();
        r1.t0 t0Var = this.f6530a;
        if (i6 < 3 || !f6519k.a(t0Var)) {
            bundle.putBundle(f6521m, t0Var.c(i6));
        }
        boolean z10 = this.f6531b;
        if (z10) {
            bundle.putBoolean(f6522n, z10);
        }
        long j = this.f6532c;
        if (j != -9223372036854775807L) {
            bundle.putLong(f6523o, j);
        }
        long j10 = this.f6533d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f6524p, j10);
        }
        long j11 = this.f6534e;
        if (i6 < 3 || j11 != 0) {
            bundle.putLong(f6525q, j11);
        }
        int i10 = this.f6535f;
        if (i10 != 0) {
            bundle.putInt(f6526r, i10);
        }
        long j12 = this.f6536g;
        if (j12 != 0) {
            bundle.putLong(s, j12);
        }
        long j13 = this.f6537h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f6527t, j13);
        }
        long j14 = this.f6538i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f6528u, j14);
        }
        long j15 = this.j;
        if (i6 >= 3 && j15 == 0) {
            return bundle;
        }
        bundle.putLong(f6529v, j15);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f6532c == r1Var.f6532c && this.f6530a.equals(r1Var.f6530a) && this.f6531b == r1Var.f6531b && this.f6533d == r1Var.f6533d && this.f6534e == r1Var.f6534e && this.f6535f == r1Var.f6535f && this.f6536g == r1Var.f6536g && this.f6537h == r1Var.f6537h && this.f6538i == r1Var.f6538i && this.j == r1Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6530a, Boolean.valueOf(this.f6531b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        r1.t0 t0Var = this.f6530a;
        sb2.append(t0Var.f11703b);
        sb2.append(", periodIndex=");
        sb2.append(t0Var.f11706e);
        sb2.append(", positionMs=");
        sb2.append(t0Var.f11707f);
        sb2.append(", contentPositionMs=");
        sb2.append(t0Var.f11708g);
        sb2.append(", adGroupIndex=");
        sb2.append(t0Var.f11709h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(t0Var.f11710i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f6531b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f6532c);
        sb2.append(", durationMs=");
        sb2.append(this.f6533d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f6534e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f6535f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f6536g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.f6537h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f6538i);
        sb2.append(", contentBufferedPositionMs=");
        return r4.a.m(sb2, this.j, "}");
    }
}
