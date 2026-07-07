package r1;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y0 extends v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f11759d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f11760e;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11761b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11762c;

    static {
        String str = u1.a0.f12750a;
        f11759d = Integer.toString(1, 36);
        f11760e = Integer.toString(2, 36);
    }

    public y0() {
        this.f11761b = false;
        this.f11762c = false;
    }

    @Override // r1.v0
    public final boolean b() {
        return this.f11761b;
    }

    @Override // r1.v0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(v0.f11719a, 3);
        bundle.putBoolean(f11759d, this.f11761b);
        bundle.putBoolean(f11760e, this.f11762c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f11762c == y0Var.f11762c && this.f11761b == y0Var.f11761b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f11761b), Boolean.valueOf(this.f11762c));
    }

    public y0(boolean z10) {
        this.f11761b = true;
        this.f11762c = z10;
    }
}
