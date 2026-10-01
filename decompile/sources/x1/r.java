package x1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f14153w = -9223372036854775807L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f14152v = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f14153w, ((r) obj).f14153w);
    }
}
