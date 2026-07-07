package r1;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final z f11763f = new z(new e2.t());

    /* renamed from: g, reason: collision with root package name */
    public static final String f11764g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f11765h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f11766i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11767k;

    /* renamed from: a, reason: collision with root package name */
    public final long f11768a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11769b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11770c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11771d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11772e;

    static {
        String str = u1.a0.f12750a;
        f11764g = Integer.toString(0, 36);
        f11765h = Integer.toString(1, 36);
        f11766i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        f11767k = Integer.toString(4, 36);
    }

    public z(e2.t tVar) {
        long j10 = tVar.f4275a;
        long j11 = tVar.f4276b;
        long j12 = tVar.f4277c;
        float f3 = tVar.f4278d;
        float f10 = tVar.f4279e;
        this.f11768a = j10;
        this.f11769b = j11;
        this.f11770c = j12;
        this.f11771d = f3;
        this.f11772e = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e2.t] */
    public final e2.t a() {
        ?? obj = new Object();
        obj.f4275a = this.f11768a;
        obj.f4276b = this.f11769b;
        obj.f4277c = this.f11770c;
        obj.f4278d = this.f11771d;
        obj.f4279e = this.f11772e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        z zVar = f11763f;
        long j10 = zVar.f11768a;
        long j11 = this.f11768a;
        if (j11 != j10) {
            bundle.putLong(f11764g, j11);
        }
        long j12 = zVar.f11769b;
        long j13 = this.f11769b;
        if (j13 != j12) {
            bundle.putLong(f11765h, j13);
        }
        long j14 = zVar.f11770c;
        long j15 = this.f11770c;
        if (j15 != j14) {
            bundle.putLong(f11766i, j15);
        }
        float f3 = zVar.f11771d;
        float f10 = this.f11771d;
        if (f10 != f3) {
            bundle.putFloat(j, f10);
        }
        float f11 = zVar.f11772e;
        float f12 = this.f11772e;
        if (f12 != f11) {
            bundle.putFloat(f11767k, f12);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f11768a == zVar.f11768a && this.f11769b == zVar.f11769b && this.f11770c == zVar.f11770c && this.f11771d == zVar.f11771d && this.f11772e == zVar.f11772e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        long j10 = this.f11768a;
        long j11 = this.f11769b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f11770c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        int i12 = 0;
        float f3 = this.f11771d;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i6 = Float.floatToIntBits(f3);
        } else {
            i6 = 0;
        }
        int i13 = (i11 + i6) * 31;
        float f10 = this.f11772e;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
