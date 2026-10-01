package r1;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f11342h = new d(0, 0, 1, 1, 0, false);

    /* renamed from: i, reason: collision with root package name */
    public static final String f11343i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11344k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11345l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11346m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f11347n;

    /* renamed from: a, reason: collision with root package name */
    public final int f11348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11349b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11350c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11352e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11353f;

    /* renamed from: g, reason: collision with root package name */
    public p0 f11354g;

    static {
        String str = u1.a0.f12750a;
        f11343i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        f11344k = Integer.toString(2, 36);
        f11345l = Integer.toString(3, 36);
        f11346m = Integer.toString(4, 36);
        f11347n = Integer.toString(5, 36);
    }

    public d(int i6, int i10, int i11, int i12, int i13, boolean z10) {
        this.f11348a = i6;
        this.f11349b = i10;
        this.f11350c = i11;
        this.f11351d = i12;
        this.f11352e = i13;
        this.f11353f = z10;
    }

    public static d a(Bundle bundle) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        String str = f11343i;
        if (bundle.containsKey(str)) {
            i6 = bundle.getInt(str);
        } else {
            i6 = 0;
        }
        String str2 = j;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f11344k;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f11345l;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f11346m;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f11347n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new d(i6, i10, i11, i12, i13, z10);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [r1.p0, java.lang.Object] */
    public final p0 b() {
        if (this.f11354g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f11348a).setFlags(this.f11349b).setUsage(this.f11350c);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                usage.setAllowedCapturePolicy(this.f11351d);
            }
            if (i6 >= 32) {
                usage.setSpatializationBehavior(this.f11352e);
                usage.setIsContentSpatialized(this.f11353f);
            }
            obj.f11625a = usage.build();
            this.f11354g = obj;
        }
        return this.f11354g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f11348a == dVar.f11348a && this.f11349b == dVar.f11349b && this.f11350c == dVar.f11350c && this.f11351d == dVar.f11351d && this.f11352e == dVar.f11352e && this.f11353f == dVar.f11353f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f11348a) * 31) + this.f11349b) * 31) + this.f11350c) * 31) + this.f11351d) * 31) + this.f11352e) * 31) + (this.f11353f ? 1 : 0);
    }
}
