package xg;

import a8.g;
import androidx.lifecycle.k1;
import androidx.lifecycle.n1;
import b4.h;
import ie.i;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import ua.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final e f14756a;

    /* renamed from: b, reason: collision with root package name */
    public final tg.a f14757b;

    public b(e eVar, tg.a scope) {
        k.e(scope, "scope");
        this.f14756a = eVar;
        this.f14757b = scope;
    }

    @Override // androidx.lifecycle.n1
    public final k1 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.n1
    public final k1 b(e eVar, o1.e eVar2) {
        a aVar = new a(eVar2);
        tg.a aVar2 = this.f14757b;
        h hVar = aVar2.f12713e;
        rg.a aVar3 = (rg.a) hVar.f1470y;
        k.e(aVar3, "<this>");
        Object obj = aVar3.f11953a.get(og.a.f10196x);
        if (obj == null) {
            obj = null;
        }
        boolean a10 = k.a(obj, Boolean.TRUE);
        e eVar3 = this.f14756a;
        if (!a10) {
            return (k1) aVar2.a(eVar3, aVar);
        }
        String scopeId = eVar.c() + '-' + g.j();
        qg.c cVar = new qg.c(eVar);
        qg.c cVar2 = yg.a.f15110a;
        k.e(scopeId, "scopeId");
        rg.b bVar = (rg.b) hVar.B;
        ConcurrentHashMap concurrentHashMap = bVar.f11957c;
        h hVar2 = bVar.f11955a;
        f fVar = (f) hVar2.f1471z;
        fVar.r("| (+) Scope - id:'" + scopeId + "' q:'" + cVar + '\'');
        Set set = bVar.f11956b;
        if (!set.contains(cVar)) {
            fVar.r("| Scope '" + cVar + "' not defined. Creating it ...");
            set.add(cVar);
        }
        if (!concurrentHashMap.containsKey(scopeId)) {
            tg.a aVar4 = new tg.a(cVar, scopeId, cVar2, hVar2, 4);
            tg.a[] aVarArr = {bVar.f11958d};
            if (!aVar4.f12711c) {
                aVar4.f12714f.addAll(0, i.q0(aVarArr));
                concurrentHashMap.put(scopeId, aVar4);
                k1 k1Var = (k1) aVar4.a(eVar3, aVar);
                c cVar3 = new c(scopeId, hVar);
                p1.b bVar2 = k1Var.f954a;
                if (bVar2 != null) {
                    bVar2.a(cVar3);
                }
                return k1Var;
            }
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        String s = "Scope with id '" + scopeId + "' is already created";
        k.e(s, "s");
        throw new Exception(s);
    }

    @Override // androidx.lifecycle.n1
    public final k1 c(Class cls, o1.e eVar) {
        a(cls);
        throw null;
    }
}
