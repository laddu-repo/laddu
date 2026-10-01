package l4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends f0 {
    public final Class s;

    public b0(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // l4.f0, l4.g0
    public final String b() {
        return this.s.getName();
    }

    @Override // l4.f0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String value) {
        Object obj;
        kotlin.jvm.internal.k.e(value, "value");
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        kotlin.jvm.internal.k.d(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                obj = enumConstants[i6];
                if (df.u.A(((Enum) obj).name(), value, true)) {
                    break;
                }
                i6++;
            } else {
                obj = null;
                break;
            }
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder q9 = r4.a.q("Enum value ", value, " not found for type ");
        q9.append(cls.getName());
        q9.append('.');
        throw new IllegalArgumentException(q9.toString());
    }
}
