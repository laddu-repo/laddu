package ke;

import ac.t;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends pd.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ hd.a f7972v;

    public f(hd.a aVar) {
        this.f7972v = aVar;
    }

    @Override // pd.a
    public final int a() {
        return ((Matcher) this.f7972v.f6279w).groupCount() + 1;
    }

    public final d b(int i) {
        Matcher matcher = (Matcher) this.f7972v.f6279w;
        he.c cVarP = android.support.v4.media.session.b.P(matcher.start(i), matcher.end(i));
        if (cVarP.f6282v < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        de.i.d(strGroup, "group(...)");
        return new d(strGroup, cVarP);
    }

    @Override // pd.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof d) {
            return super.contains((d) obj);
        }
        return false;
    }

    @Override // pd.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new je.j(new je.d(new je.h(2, new he.c(0, size() - 1, 1)), new t(4, this), 1));
    }
}
