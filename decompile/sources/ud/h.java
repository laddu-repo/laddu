package ud;

import de.i;
import de.q;
import de.r;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends c implements de.g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12981y;

    public h(int i, sd.c cVar) {
        super(cVar);
        this.f12981y = i;
    }

    @Override // de.g
    public final int d() {
        return this.f12981y;
    }

    @Override // ud.a
    public final String toString() {
        if (this.f12975v != null) {
            return super.toString();
        }
        q.f4523a.getClass();
        String strA = r.a(this);
        i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
