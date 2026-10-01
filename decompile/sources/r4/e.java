package r4;

import k8.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ud.c {
    public Object A;
    public de.p B;
    public sd.h C;
    public de.p D;
    public b0 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ f G;
    public int H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f11182z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ud.c cVar) {
        super(cVar);
        this.G = fVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.w(false, null, this);
    }
}
