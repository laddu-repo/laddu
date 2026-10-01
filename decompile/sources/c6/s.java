package c6;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements a6.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f2234e;
    public final Class f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a6.f f2235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f2236h;
    public final a6.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2237j;

    public s(Object obj, a6.f fVar, int i, int i10, Map map, Class cls, Class cls2, a6.i iVar) {
        v6.f.c(obj, "Argument must not be null");
        this.f2231b = obj;
        this.f2235g = fVar;
        this.f2232c = i;
        this.f2233d = i10;
        v6.f.c(map, "Argument must not be null");
        this.f2236h = map;
        v6.f.c(cls, "Resource class must not be null");
        this.f2234e = cls;
        v6.f.c(cls2, "Transcode class must not be null");
        this.f = cls2;
        v6.f.c(iVar, "Argument must not be null");
        this.i = iVar;
    }

    @Override // a6.f
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // a6.f
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f2231b.equals(sVar.f2231b) && this.f2235g.equals(sVar.f2235g) && this.f2233d == sVar.f2233d && this.f2232c == sVar.f2232c && this.f2236h.equals(sVar.f2236h) && this.f2234e.equals(sVar.f2234e) && this.f.equals(sVar.f) && this.i.equals(sVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // a6.f
    public final int hashCode() {
        if (this.f2237j == 0) {
            int iHashCode = this.f2231b.hashCode();
            this.f2237j = iHashCode;
            int iHashCode2 = ((((this.f2235g.hashCode() + (iHashCode * 31)) * 31) + this.f2232c) * 31) + this.f2233d;
            this.f2237j = iHashCode2;
            int iHashCode3 = this.f2236h.hashCode() + (iHashCode2 * 31);
            this.f2237j = iHashCode3;
            int iHashCode4 = this.f2234e.hashCode() + (iHashCode3 * 31);
            this.f2237j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.f2237j = iHashCode5;
            this.f2237j = this.i.f161b.hashCode() + (iHashCode5 * 31);
        }
        return this.f2237j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f2231b + ", width=" + this.f2232c + ", height=" + this.f2233d + ", resourceClass=" + this.f2234e + ", transcodeClass=" + this.f + ", signature=" + this.f2235g + ", hashCode=" + this.f2237j + ", transformations=" + this.f2236h + ", options=" + this.i + '}';
    }
}
