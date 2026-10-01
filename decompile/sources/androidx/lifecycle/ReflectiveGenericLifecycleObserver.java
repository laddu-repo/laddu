package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f1175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f1176w;

    public ReflectiveGenericLifecycleObserver(r rVar) {
        this.f1175v = rVar;
        d dVar = d.f1190c;
        Class<?> cls = rVar.getClass();
        b bVar = (b) dVar.f1191a.get(cls);
        this.f1176w = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        HashMap map = this.f1176w.f1181a;
        List list = (List) map.get(mVar);
        r rVar = this.f1175v;
        b.a(list, sVar, mVar, rVar);
        b.a((List) map.get(m.ON_ANY), sVar, mVar, rVar);
    }
}
