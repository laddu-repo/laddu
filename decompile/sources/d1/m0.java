package d1;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ud.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ n0 B;
    public int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FileOutputStream f3918y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FileOutputStream f3919z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, ud.c cVar) {
        super(cVar);
        this.B = n0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
