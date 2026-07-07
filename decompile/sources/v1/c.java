package v1;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ca.e {

    /* renamed from: c, reason: collision with root package name */
    public final long f13189c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13190d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13191e;

    public c(int i6, long j) {
        super(i6, 2);
        this.f13189c = j;
        this.f13190d = new ArrayList();
        this.f13191e = new ArrayList();
    }

    public final c m(int i6) {
        ArrayList arrayList = this.f13191e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f2000b == i6) {
                return cVar;
            }
        }
        return null;
    }

    public final d n(int i6) {
        ArrayList arrayList = this.f13190d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar.f2000b == i6) {
                return dVar;
            }
        }
        return null;
    }

    @Override // ca.e
    public final String toString() {
        return ca.e.b(this.f2000b) + " leaves: " + Arrays.toString(this.f13190d.toArray()) + " containers: " + Arrays.toString(this.f13191e.toArray());
    }
}
