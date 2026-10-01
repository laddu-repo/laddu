package d1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ud.c {
    public FileLock A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ w0 D;
    public int E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ue.c f3948y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FileInputStream f3949z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, ud.c cVar) {
        super(cVar);
        this.D = w0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(null, this);
    }
}
