package wf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14300b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f14301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sf.a element, int i6) {
        super(element);
        this.f14300b = i6;
        switch (i6) {
            case 1:
                super(element);
                uf.g elementDesc = element.d();
                kotlin.jvm.internal.k.e(elementDesc, "elementDesc");
                this.f14301c = new b(elementDesc, 2);
                return;
            default:
                kotlin.jvm.internal.k.e(element, "element");
                uf.g elementDesc2 = element.d();
                kotlin.jvm.internal.k.e(elementDesc2, "elementDesc");
                this.f14301c = new b(elementDesc2, 1);
                return;
        }
    }

    @Override // sf.a
    public final uf.g d() {
        switch (this.f14300b) {
            case 0:
                return (b) this.f14301c;
            default:
                return (b) this.f14301c;
        }
    }

    @Override // wf.a
    public final Object e() {
        switch (this.f14300b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // wf.a
    public final int f(Object obj) {
        switch (this.f14300b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.k.e(arrayList, "<this>");
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.k.e(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.k.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // wf.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.k.e(collection, "<this>");
        return collection.size();
    }

    @Override // wf.a
    public final Object k(Object obj) {
        switch (this.f14300b) {
            case 0:
                kotlin.jvm.internal.k.e(null, "<this>");
                return new ArrayList((Collection) null);
            default:
                kotlin.jvm.internal.k.e(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // wf.a
    public final Object l(Object obj) {
        switch (this.f14300b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.k.e(arrayList, "<this>");
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.k.e(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // wf.n
    public final void m(int i6, Object obj, Object obj2) {
        switch (this.f14300b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.k.e(arrayList, "<this>");
                arrayList.add(i6, obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.k.e(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                return;
        }
    }
}
