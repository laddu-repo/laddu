package r1;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f11688d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f11689e;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11690b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11691c;

    static {
        String str = u1.a0.f12750a;
        f11688d = Integer.toString(1, 36);
        f11689e = Integer.toString(2, 36);
    }

    public s() {
        this.f11690b = false;
        this.f11691c = false;
    }

    @Override // r1.v0
    public final boolean b() {
        return this.f11690b;
    }

    @Override // r1.v0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(v0.f11719a, 0);
        bundle.putBoolean(f11688d, this.f11690b);
        bundle.putBoolean(f11689e, this.f11691c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f11691c == sVar.f11691c && this.f11690b == sVar.f11690b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f11690b), Boolean.valueOf(this.f11691c));
    }

    public s(boolean z10) {
        this.f11690b = true;
        this.f11691c = z10;
    }
}
