package jg;

import ie.j;
import ie.r;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final qg.a f7483a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7484b;

    /* renamed from: c, reason: collision with root package name */
    public final p f7485c;

    /* renamed from: d, reason: collision with root package name */
    public final b f7486d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7487e;

    public a(qg.a scopeQualifier, e eVar, p pVar, b bVar) {
        k.e(scopeQualifier, "scopeQualifier");
        this.f7483a = scopeQualifier;
        this.f7484b = eVar;
        this.f7485c = pVar;
        this.f7486d = bVar;
        this.f7487e = r.f6846x;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            k.c(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
            a aVar = (a) obj;
            if (!this.f7484b.equals(aVar.f7484b) || !k.a(this.f7483a, aVar.f7483a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7483a.hashCode() + (this.f7484b.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Collection, java.lang.Object] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.f7486d);
        sb2.append(": '");
        sb2.append(ug.a.a(this.f7484b));
        sb2.append('\'');
        qg.b bVar = rg.b.f11954e;
        qg.a aVar = this.f7483a;
        if (!k.a(aVar, bVar)) {
            sb2.append(",scope:");
            sb2.append(aVar);
        }
        if (!this.f7487e.isEmpty()) {
            sb2.append(",binds:");
            j.K(this.f7487e, sb2, ",", new cf.p(12), 60);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
