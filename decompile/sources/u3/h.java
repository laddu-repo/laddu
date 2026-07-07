package u3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends t3.i implements Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12881w;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (isEndOfStream() != hVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j8 = this.timeUs - hVar.timeUs;
        if (j8 == 0) {
            j8 = this.f12881w - hVar.f12881w;
            if (j8 == 0) {
                return 0;
            }
        }
        return j8 > 0 ? 1 : -1;
    }
}
