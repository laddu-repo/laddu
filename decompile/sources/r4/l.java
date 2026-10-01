package r4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ud.h implements ce.l {
    public final /* synthetic */ String A;
    public final /* synthetic */ ce.l B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n f11200z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, String str, ce.l lVar, sd.c cVar) {
        super(1, cVar);
        this.f11200z = nVar;
        this.A = str;
        this.B = lVar;
    }

    @Override // ce.l
    public final Object a(Object obj) {
        String str = this.A;
        ce.l lVar = this.B;
        return new l(this.f11200z, str, lVar, (sd.c) obj).o(od.l.f10126a);
    }

    @Override // ud.a
    public final Object o(Object obj) throws Exception {
        fa.b.z(obj);
        v4.c cVarJ0 = this.f11200z.f11203b.j0(this.A);
        try {
            Object objA = this.B.a(cVarJ0);
            b8.h.h(cVarJ0, null);
            return objA;
        } finally {
        }
    }
}
