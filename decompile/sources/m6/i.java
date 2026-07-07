package m6;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f8664a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8665b;

    public i(Drawable drawable, boolean z10) {
        this.f8664a = drawable;
        this.f8665b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (kotlin.jvm.internal.k.a(this.f8664a, iVar.f8664a) && this.f8665b == iVar.f8665b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f8664a.hashCode() * 31;
        if (this.f8665b) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return hashCode + i6;
    }
}
