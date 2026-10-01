package m2;

import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f8501g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f8503b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8504c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8505d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8506e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f8507f;

    public i(h hVar) {
        this.f8502a = hVar.f8495a;
        this.f8503b = hVar.f8496b;
        this.f8504c = hVar.f8497c;
        this.f8505d = hVar.f8498d;
        this.f8506e = hVar.f8499e;
        this.f8507f = hVar.f8500f;
    }

    public static int a(int i6) {
        return lg.c.m(i6 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f8503b == iVar.f8503b && this.f8504c == iVar.f8504c && this.f8502a == iVar.f8502a && this.f8505d == iVar.f8505d && this.f8506e == iVar.f8506e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = (((((527 + this.f8503b) * 31) + this.f8504c) * 31) + (this.f8502a ? 1 : 0)) * 31;
        long j = this.f8505d;
        return ((i6 + ((int) (j ^ (j >>> 32)))) * 31) + this.f8506e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f8503b), Integer.valueOf(this.f8504c), Long.valueOf(this.f8505d), Integer.valueOf(this.f8506e), Boolean.valueOf(this.f8502a)};
        String str = u1.a0.f12750a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
