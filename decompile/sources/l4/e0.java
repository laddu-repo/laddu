package l4;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 extends g0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f8115r;

    public e0(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f8115r = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // l4.g0
    public final Object a(String key, Bundle bundle) {
        kotlin.jvm.internal.k.e(bundle, "bundle");
        kotlin.jvm.internal.k.e(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // l4.g0
    public final String b() {
        return this.f8115r.getName();
    }

    @Override // l4.g0
    public final Object d(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // l4.g0
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r42 = (Serializable[]) obj;
        kotlin.jvm.internal.k.e(key, "key");
        this.f8115r.cast(r42);
        bundle.putSerializable(key, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class.equals(obj.getClass())) {
            return kotlin.jvm.internal.k.a(this.f8115r, ((e0) obj).f8115r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8115r.hashCode();
    }
}
