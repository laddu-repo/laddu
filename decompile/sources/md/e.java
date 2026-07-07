package md;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends HashMap {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f8656v;

    public e(h hVar) {
        this.f8656v = hVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        this.f8656v.A.put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }
}
