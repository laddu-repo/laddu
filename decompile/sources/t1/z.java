package t1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f12179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f12180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f12181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f12182e;
    public final x f;

    static {
        r rVar = new r();
        y9.c0 c0Var = y9.f0.f14553w;
        y9.z0 z0Var = y9.z0.f14637z;
        List list = Collections.EMPTY_LIST;
        y9.z0 z0Var2 = y9.z0.f14637z;
        g2.t tVar = new g2.t();
        x xVar = x.f12153a;
        rVar.a();
        tVar.a();
        c0 c0Var2 = c0.B;
        d0.d.p(0, 1, 2, 3, 4);
        w1.b0.H(5);
    }

    public z(String str, t tVar, w wVar, v vVar, c0 c0Var, x xVar) {
        this.f12178a = str;
        this.f12179b = wVar;
        this.f12180c = vVar;
        this.f12181d = c0Var;
        this.f12182e = tVar;
        this.f = xVar;
    }

    public static z a(String str) {
        w wVar;
        r rVar = new r();
        o2.p pVar = new o2.p();
        List list = Collections.EMPTY_LIST;
        y9.z0 z0Var = y9.z0.f14637z;
        g2.t tVar = new g2.t();
        x xVar = x.f12153a;
        Uri uri = str == null ? null : Uri.parse(str);
        w1.a.j(((Uri) pVar.f9504x) == null || ((UUID) pVar.f9503w) != null);
        u uVar = null;
        if (uri != null) {
            if (((UUID) pVar.f9503w) != null) {
                uVar = new u(pVar);
            }
            wVar = new w(uri, null, uVar, list, z0Var, -9223372036854775807L);
        } else {
            wVar = null;
        }
        return new z("", new t(rVar), wVar, new v(tVar), c0.B, xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Objects.equals(this.f12178a, zVar.f12178a) && this.f12182e.equals(zVar.f12182e) && Objects.equals(this.f12179b, zVar.f12179b) && this.f12180c.equals(zVar.f12180c) && Objects.equals(this.f12181d, zVar.f12181d) && Objects.equals(this.f, zVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f12178a.hashCode() * 31;
        w wVar = this.f12179b;
        int iHashCode2 = (this.f12181d.hashCode() + ((this.f12182e.hashCode() + ((this.f12180c.hashCode() + ((iHashCode + (wVar != null ? wVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
