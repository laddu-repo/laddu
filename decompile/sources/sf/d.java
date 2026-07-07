package sf;

import androidx.lifecycle.i;
import cf.m;
import kotlin.jvm.internal.k;
import yf.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f12310a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12311b = he.a.c(he.g.f6074y, new i(this, 22));

    public d(kotlin.jvm.internal.e eVar) {
        this.f12310a = eVar;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        vf.a h4 = bVar.h(d());
        String str = null;
        while (true) {
            int b10 = h4.b(d());
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(b10);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    m.j(this, h4, str);
                    throw null;
                }
                str = h4.p(d(), b10);
            } else {
                throw new IllegalArgumentException(r4.a.k("Polymorphic value has not been read for class ", str).toString());
            }
        }
    }

    @Override // sf.a
    public final void c(t tVar, Object value) {
        k.e(value, "value");
        m.k(this, tVar, value);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    @Override // sf.a
    public final uf.g d() {
        return (uf.g) this.f12311b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f12310a + ')';
    }
}
