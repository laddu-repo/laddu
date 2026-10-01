package e2;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f4253a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4254b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4255c;

    /* renamed from: d, reason: collision with root package name */
    public int f4256d;

    public j(String str, long j, long j10) {
        this.f4255c = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f4253a = j;
        this.f4254b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String n10 = u1.a.n(str, this.f4255c);
        if (jVar != null) {
            long j = jVar.f4254b;
            if (n10.equals(u1.a.n(str, jVar.f4255c))) {
                long j10 = -1;
                long j11 = this.f4254b;
                if (j11 != -1) {
                    long j12 = this.f4253a;
                    jVar2 = null;
                    if (j12 + j11 == jVar.f4253a) {
                        if (j != -1) {
                            j10 = j11 + j;
                        }
                        return new j(n10, j12, j10);
                    }
                } else {
                    jVar2 = null;
                }
                if (j != -1) {
                    long j13 = jVar.f4253a;
                    if (j13 + j == this.f4253a) {
                        if (j11 != -1) {
                            j10 = j + j11;
                        }
                        return new j(n10, j13, j10);
                    }
                    return jVar2;
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f4253a == jVar.f4253a && this.f4254b == jVar.f4254b && this.f4255c.equals(jVar.f4255c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4256d == 0) {
            this.f4256d = this.f4255c.hashCode() + ((((527 + ((int) this.f4253a)) * 31) + ((int) this.f4254b)) * 31);
        }
        return this.f4256d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f4255c);
        sb2.append(", start=");
        sb2.append(this.f4253a);
        sb2.append(", length=");
        return r4.a.m(sb2, this.f4254b, ")");
    }
}
