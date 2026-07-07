package a6;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kb.e f156e = new kb.e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f160d;

    public h(String str, Object obj, g gVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f159c = str;
        this.f157a = obj;
        this.f158b = gVar;
    }

    public static h a(Object obj, String str) {
        return new h(str, obj, f156e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f159c.equals(((h) obj).f159c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f159c.hashCode();
    }

    public final String toString() {
        return j4.a.n(new StringBuilder("Option{key='"), this.f159c, "'}");
    }
}
