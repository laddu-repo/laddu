package v5;

import android.net.Uri;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13315b;

    public d(boolean z10, Uri uri) {
        this.f13314a = uri;
        this.f13315b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f13315b == dVar.f13315b && this.f13314a.equals(dVar.f13314a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13314a.hashCode() * 31) + (this.f13315b ? 1 : 0);
    }
}
