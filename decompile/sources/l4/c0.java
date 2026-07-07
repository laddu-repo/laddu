package l4;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends g0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f8112r;

    public c0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.f8112r = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
    }

    @Override // l4.g0
    public final Object a(String key, Bundle bundle) {
        kotlin.jvm.internal.k.e(bundle, "bundle");
        kotlin.jvm.internal.k.e(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // l4.g0
    public final String b() {
        return this.f8112r.getName();
    }

    @Override // l4.g0
    public final Object d(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // l4.g0
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        kotlin.jvm.internal.k.e(key, "key");
        this.f8112r.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class.equals(obj.getClass())) {
            return kotlin.jvm.internal.k.a(this.f8112r, ((c0) obj).f8112r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8112r.hashCode();
    }
}
