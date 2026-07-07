package c6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f2225v;

    public p(ArrayList arrayList) {
        this.f2225v = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2225v.iterator();
    }
}
