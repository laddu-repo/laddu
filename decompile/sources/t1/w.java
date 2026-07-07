package t1;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f12129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f12131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y9.f0 f12133e;
    public final long f;

    static {
        d0.d.p(0, 1, 2, 3, 4);
        w1.b0.H(5);
        w1.b0.H(6);
        w1.b0.H(7);
    }

    public w(Uri uri, String str, u uVar, List list, y9.f0 f0Var, long j8) {
        this.f12129a = uri;
        this.f12130b = f0.p(str);
        this.f12131c = uVar;
        this.f12132d = list;
        this.f12133e = f0Var;
        y9.b0 b0VarJ = y9.f0.j();
        for (int i = 0; i < f0Var.size(); i++) {
            ((y) f0Var.get(i)).getClass();
            b0VarJ.a(new y());
        }
        b0VarJ.g();
        this.f = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f12129a.equals(wVar.f12129a) && Objects.equals(this.f12130b, wVar.f12130b) && Objects.equals(this.f12131c, wVar.f12131c) && this.f12132d.equals(wVar.f12132d) && this.f12133e.equals(wVar.f12133e) && this.f == wVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f12129a.hashCode() * 31;
        String str = this.f12130b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.f12131c;
        return (int) ((((long) ((this.f12133e.hashCode() + ((this.f12132d.hashCode() + ((iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 961)) * 961)) * 31)) * 31) + this.f);
    }
}
