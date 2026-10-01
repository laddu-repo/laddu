package ke;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends pd.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ hd.a f7971v;

    public e(hd.a aVar) {
        this.f7971v = aVar;
    }

    @Override // pd.a
    public final int a() {
        return ((Matcher) this.f7971v.f6279w).groupCount() + 1;
    }

    @Override // pd.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.f7971v.f6279w).group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // pd.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // pd.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
