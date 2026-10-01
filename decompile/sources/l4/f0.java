package l4;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f0 extends g0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f8119r;

    public f0(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.f8119r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // l4.g0
    public final Object a(String key, Bundle bundle) {
        kotlin.jvm.internal.k.e(bundle, "bundle");
        kotlin.jvm.internal.k.e(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // l4.g0
    public String b() {
        return this.f8119r.getName();
    }

    @Override // l4.g0
    public final void e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        kotlin.jvm.internal.k.e(key, "key");
        kotlin.jvm.internal.k.e(value, "value");
        this.f8119r.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        return kotlin.jvm.internal.k.a(this.f8119r, ((f0) obj).f8119r);
    }

    @Override // l4.g0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f8119r.hashCode();
    }

    public f0(int i6, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f8119r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
