package p6;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f10592a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10593b;

    /* renamed from: c, reason: collision with root package name */
    public final m6.h f10594c;

    public d(Drawable drawable, boolean z10, m6.h hVar) {
        this.f10592a = drawable;
        this.f10593b = z10;
        this.f10594c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (kotlin.jvm.internal.k.a(this.f10592a, dVar.f10592a) && this.f10593b == dVar.f10593b && this.f10594c == dVar.f10594c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f10592a.hashCode() * 31;
        if (this.f10593b) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return this.f10594c.hashCode() + ((hashCode + i6) * 31);
    }
}
