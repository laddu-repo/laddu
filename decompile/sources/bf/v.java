package bf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements ParameterizedType, Type {

    /* renamed from: x, reason: collision with root package name */
    public final Class f1675x;

    /* renamed from: y, reason: collision with root package name */
    public final Type f1676y;

    /* renamed from: z, reason: collision with root package name */
    public final Type[] f1677z;

    public v(Class cls, Type type, ArrayList arrayList) {
        this.f1675x = cls;
        this.f1676y = type;
        this.f1677z = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (kotlin.jvm.internal.k.a(this.f1675x, parameterizedType.getRawType()) && kotlin.jvm.internal.k.a(this.f1676y, parameterizedType.getOwnerType()) && Arrays.equals(this.f1677z, parameterizedType.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f1677z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f1676y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f1675x;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f1675x;
        Type type = this.f1676y;
        if (type != null) {
            sb2.append(y.b(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(y.b(cls));
        }
        Type[] typeArr = this.f1677z;
        if (typeArr.length != 0) {
            ie.i.o0(typeArr, sb2, ", ", "<", ">", "...", u.f1674x);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f1675x.hashCode();
        Type type = this.f1676y;
        if (type != null) {
            i6 = type.hashCode();
        } else {
            i6 = 0;
        }
        return (hashCode ^ i6) ^ Arrays.hashCode(this.f1677z);
    }

    public final String toString() {
        return getTypeName();
    }
}
