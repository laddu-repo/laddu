package l4;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends g0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f8114r;

    public d0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }
        this.f8114r = cls;
    }

    @Override // l4.g0
    public final Object a(String key, Bundle bundle) {
        kotlin.jvm.internal.k.e(bundle, "bundle");
        kotlin.jvm.internal.k.e(key, "key");
        return bundle.get(key);
    }

    @Override // l4.g0
    public final String b() {
        return this.f8114r.getName();
    }

    @Override // l4.g0
    public final Object d(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // l4.g0
    public final void e(Bundle bundle, String key, Object obj) {
        kotlin.jvm.internal.k.e(key, "key");
        this.f8114r.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(key, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class.equals(obj.getClass())) {
            return kotlin.jvm.internal.k.a(this.f8114r, ((d0) obj).f8114r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8114r.hashCode();
    }
}
