package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class di {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f2586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final di f2587e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2590c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        f2586d = jCharAt;
        f2587e = new di(0, -1, -1);
    }

    public di(int i, int i10, int i11) {
        this.f2588a = i;
        this.f2589b = i10;
        this.f2590c = i11;
    }

    public static int e(int i, int i10, String str) {
        if (i == i10) {
            throw a5.d.c(i - 1, "missing precision", str);
        }
        int i11 = 0;
        for (int i12 = i; i12 < i10; i12++) {
            char cCharAt = (char) (str.charAt(i12) - '0');
            if (cCharAt >= '\n') {
                throw a5.d.c(i12, "invalid precision character", str);
            }
            i11 = (i11 * 10) + cCharAt;
            if (i11 > 999999) {
                throw a5.d.b(i, i10, "precision too large", str);
            }
        }
        if (i11 != 0) {
            return i11;
        }
        if (i10 == i + 1) {
            return 0;
        }
        throw a5.d.b(i, i10, "invalid precision", str);
    }

    public final boolean a() {
        return this == f2587e;
    }

    public final boolean b(int i, boolean z2) {
        int i10;
        if (a()) {
            return true;
        }
        int i11 = ~i;
        int i12 = this.f2588a;
        if ((i11 & i12) != 0) {
            return false;
        }
        if ((!z2 && this.f2590c != -1) || (i12 & 9) == 9 || (i10 = i12 & 96) == 96) {
            return false;
        }
        return i10 == 0 || this.f2589b != -1;
    }

    public final boolean c() {
        return (this.f2588a & 128) != 0;
    }

    public final void d(StringBuilder sb2) {
        if (a()) {
            return;
        }
        int i = 0;
        while (true) {
            int i10 = this.f2588a & (-129);
            int i11 = 1 << i;
            if (i11 > i10) {
                break;
            }
            if ((i10 & i11) != 0) {
                sb2.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i12 = this.f2589b;
        if (i12 != -1) {
            sb2.append(i12);
        }
        int i13 = this.f2590c;
        if (i13 != -1) {
            sb2.append('.');
            sb2.append(i13);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof di) {
            di diVar = (di) obj;
            if (diVar.f2588a == this.f2588a && diVar.f2589b == this.f2589b && diVar.f2590c == this.f2590c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2588a * 31) + this.f2589b) * 31) + this.f2590c;
    }
}
