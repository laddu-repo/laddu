package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f14403a;

    /* renamed from: b, reason: collision with root package name */
    public final he.m f14404b;

    public v(String str, Enum[] enumArr) {
        this.f14403a = enumArr;
        this.f14404b = he.a.d(new fd.j(4, this, str));
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        int k8 = bVar.k(d());
        Enum[] enumArr = this.f14403a;
        if (k8 >= 0 && k8 < enumArr.length) {
            return enumArr[k8];
        }
        throw new IllegalArgumentException(k8 + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        Enum value = (Enum) obj;
        kotlin.jvm.internal.k.e(value, "value");
        Enum[] enumArr = this.f14403a;
        int n02 = ie.i.n0(enumArr, value);
        if (n02 != -1) {
            uf.g enumDescriptor = d();
            tVar.getClass();
            kotlin.jvm.internal.k.e(enumDescriptor, "enumDescriptor");
            tVar.s(enumDescriptor.f(n02));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(d().a());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(enumArr);
        kotlin.jvm.internal.k.d(arrays, "toString(...)");
        sb2.append(arrays);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // sf.a
    public final uf.g d() {
        return (uf.g) this.f14404b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
