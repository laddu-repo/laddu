package pe;

import me.v0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ud.c {
    public z A;
    public v0 B;
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ x E;
    public int F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f10598y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f10599z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, ud.c cVar) {
        super(cVar);
        this.E = xVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        this.E.g(null, this);
        return td.a.f12544v;
    }
}
