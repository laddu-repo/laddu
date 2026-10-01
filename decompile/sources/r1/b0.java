package r1;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f11307d = new b0(new n9.j(9));

    /* renamed from: e, reason: collision with root package name */
    public static final String f11308e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11309f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f11310g;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11312b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11313c;

    static {
        String str = u1.a0.f12750a;
        f11308e = Integer.toString(0, 36);
        f11309f = Integer.toString(1, 36);
        f11310g = Integer.toString(2, 36);
    }

    public b0(n9.j jVar) {
        this.f11311a = (Uri) jVar.f9355y;
        this.f11312b = (String) jVar.f9356z;
        this.f11313c = (Bundle) jVar.A;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (Objects.equals(this.f11311a, b0Var.f11311a) && Objects.equals(this.f11312b, b0Var.f11312b)) {
            if (this.f11313c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (b0Var.f11313c == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i6 = 0;
        Uri uri = this.f11311a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f11312b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.f11313c != null) {
            i6 = 1;
        }
        return i11 + i6;
    }
}
