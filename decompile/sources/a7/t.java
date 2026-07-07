package a7;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements x6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f224c;

    public t(Set set, k kVar, v vVar) {
        this.f222a = set;
        this.f223b = kVar;
        this.f224c = vVar;
    }

    public final ad.c a(String str, x6.c cVar, x6.e eVar) {
        Set set = this.f222a;
        if (set.contains(cVar)) {
            return new ad.c(this.f223b, str, cVar, eVar, this.f224c, 1);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
