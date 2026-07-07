package x1;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f14092e;

    public c(int i, long j8) {
        super(i, 1);
        this.f14090c = j8;
        this.f14091d = new ArrayList();
        this.f14092e = new ArrayList();
    }

    public final c m(int i) {
        ArrayList arrayList = this.f14092e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f13896b == i) {
                return cVar;
            }
        }
        return null;
    }

    public final d n(int i) {
        ArrayList arrayList = this.f14091d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar.f13896b == i) {
                return dVar;
            }
        }
        return null;
    }

    @Override // w4.b
    public final String toString() {
        return w4.b.b(this.f13896b) + " leaves: " + Arrays.toString(this.f14091d.toArray()) + " containers: " + Arrays.toString(this.f14092e.toArray());
    }
}
