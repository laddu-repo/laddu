package ef;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f5018d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5020c;

    static {
        ke.g gVar = u.f5042c;
        f5018d = fa.b.m("application/x-www-form-urlencoded");
    }

    public n(ArrayList arrayList, ArrayList arrayList2) {
        de.i.e(arrayList, "encodedNames");
        de.i.e(arrayList2, "encodedValues");
        this.f5019b = ff.f.i(arrayList);
        this.f5020c = ff.f.i(arrayList2);
    }

    @Override // ef.z
    public final long a() {
        return e(null, true);
    }

    @Override // ef.z
    public final u b() {
        return f5018d;
    }

    @Override // ef.z
    public final void d(vf.m mVar) throws EOFException {
        e(mVar, false);
    }

    public final long e(vf.m mVar, boolean z2) throws EOFException {
        vf.c cVar;
        if (z2) {
            cVar = new vf.c();
        } else {
            de.i.b(mVar);
            cVar = mVar.f13628w;
        }
        List list = this.f5019b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.p0(38);
            }
            cVar.v0((String) list.get(i));
            cVar.p0(61);
            cVar.v0((String) this.f5020c.get(i));
        }
        if (!z2) {
            return 0L;
        }
        long j8 = cVar.f13603w;
        cVar.a();
        return j8;
    }
}
