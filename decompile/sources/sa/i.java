package sa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2.p f11618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f11619b;

    public i(o2.p pVar, ya.c cVar) {
        this.f11618a = pVar;
        this.f11619b = new h(cVar);
    }

    public final void a(String str) {
        h hVar = this.f11619b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f11616b, str)) {
                h.a(hVar.f11615a, str, hVar.f11617c);
                hVar.f11616b = str;
            }
        }
    }
}
