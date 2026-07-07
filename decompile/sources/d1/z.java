package d1;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z extends ud.c {
    public Serializable A;
    public de.p B;
    public boolean C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ e0 F;
    public int G;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3967y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f3968z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, ud.c cVar) {
        super(cVar);
        this.F = e0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return e0.g(this.F, false, this);
    }
}
