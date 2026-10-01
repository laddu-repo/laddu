package wf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 extends n {

    /* renamed from: b, reason: collision with root package name */
    public final bf.d f14304b;

    /* renamed from: c, reason: collision with root package name */
    public final b f14305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(bf.d dVar, sf.a eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.k.e(eSerializer, "eSerializer");
        this.f14304b = dVar;
        uf.g elementDesc = eSerializer.d();
        kotlin.jvm.internal.k.e(elementDesc, "elementDesc");
        this.f14305c = new b(elementDesc, 0);
    }

    @Override // sf.a
    public final uf.g d() {
        return this.f14305c;
    }

    @Override // wf.a
    public final Object e() {
        return new ArrayList();
    }

    @Override // wf.a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.k.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.k.e(objArr, "<this>");
        return kotlin.jvm.internal.z.e(objArr);
    }

    @Override // wf.a
    public final int h(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.k.e(objArr, "<this>");
        return objArr.length;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        kotlin.jvm.internal.k.e(null, "<this>");
        ie.i.X(null);
        throw null;
    }

    @Override // wf.a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.k.e(arrayList, "<this>");
        bf.d eClass = this.f14304b;
        kotlin.jvm.internal.k.e(eClass, "eClass");
        Object newInstance = Array.newInstance((Class<?>) cf.m.r(eClass), arrayList.size());
        kotlin.jvm.internal.k.c(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        kotlin.jvm.internal.k.d(array, "toArray(...)");
        return array;
    }

    @Override // wf.n
    public final void m(int i6, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.k.e(arrayList, "<this>");
        arrayList.add(i6, obj2);
    }
}
