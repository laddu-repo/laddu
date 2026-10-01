package i4;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6511d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f6512e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f6513f;

    /* renamed from: a, reason: collision with root package name */
    public final int f6514a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6515b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f6516c;

    static {
        String str = u1.a0.f12750a;
        f6511d = Integer.toString(0, 36);
        f6512e = Integer.toString(1, 36);
        f6513f = Integer.toString(2, 36);
    }

    public q1(int i6) {
        this(i6, "no error message provided", Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6511d, this.f6514a);
        bundle.putString(f6512e, this.f6515b);
        Bundle bundle2 = this.f6516c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f6513f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (this.f6514a == q1Var.f6514a && Objects.equals(this.f6515b, q1Var.f6515b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6514a), this.f6515b);
    }

    public q1(int i6, String str, Bundle bundle) {
        boolean z10 = true;
        if (i6 >= 0 && i6 != 1) {
            z10 = false;
        }
        u1.c.b(z10);
        this.f6514a = i6;
        this.f6515b = str;
        this.f6516c = bundle;
    }
}
