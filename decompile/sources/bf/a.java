package bf;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements GenericArrayType, Type {

    /* renamed from: x, reason: collision with root package name */
    public final Type f1666x;

    public a(Type elementType) {
        kotlin.jvm.internal.k.e(elementType, "elementType");
        this.f1666x = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (kotlin.jvm.internal.k.a(this.f1666x, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f1666x;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return y.b(this.f1666x) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.f1666x.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
