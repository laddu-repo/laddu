package bc;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ud.c {
    public d A;
    public Map B;
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ c E;
    public int F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f1602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Iterator f1603z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ud.c cVar2) {
        super(cVar2);
        this.E = cVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(this);
    }
}
