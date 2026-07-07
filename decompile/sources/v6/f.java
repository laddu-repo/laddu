package v6;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f13357a;

    /* renamed from: b, reason: collision with root package name */
    public final k f13358b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f13359c;

    public f(Drawable drawable, k kVar, Throwable th) {
        this.f13357a = drawable;
        this.f13358b = kVar;
        this.f13359c = th;
    }

    @Override // v6.l
    public final Drawable a() {
        return this.f13357a;
    }

    @Override // v6.l
    public final k b() {
        return this.f13358b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (kotlin.jvm.internal.k.a(this.f13357a, fVar.f13357a) && kotlin.jvm.internal.k.a(this.f13358b, fVar.f13358b) && kotlin.jvm.internal.k.a(this.f13359c, fVar.f13359c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        Drawable drawable = this.f13357a;
        if (drawable != null) {
            i6 = drawable.hashCode();
        } else {
            i6 = 0;
        }
        return this.f13359c.hashCode() + ((this.f13358b.hashCode() + (i6 * 31)) * 31);
    }
}
