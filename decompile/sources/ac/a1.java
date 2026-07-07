package ac;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ud.h implements ce.q {
    public /* synthetic */ pe.d A;
    public /* synthetic */ Throwable B;
    public final /* synthetic */ g1 C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f320z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(g1 g1Var, sd.c cVar) {
        super(3, cVar);
        this.C = g1Var;
    }

    @Override // ce.q
    public final Object h(Object obj, Object obj2, Object obj3) {
        a1 a1Var = new a1(this.C, (sd.c) obj3);
        a1Var.A = (pe.d) obj;
        a1Var.B = (Throwable) obj2;
        return a1Var.o(od.l.f10126a);
    }

    @Override // ud.a
    public final Object o(Object obj) {
        int i = this.f320z;
        if (i == 0) {
            fa.b.z(obj);
            pe.d dVar = this.A;
            Throwable th = this.B;
            q0 q0VarA = this.C.f368b.a(null);
            m0 m0Var = new m0(q0VarA, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + q0VarA.f437a);
            this.A = null;
            this.f320z = 1;
            Object objJ = dVar.j(m0Var, this);
            td.a aVar = td.a.f12544v;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fa.b.z(obj);
        }
        return od.l.f10126a;
    }
}
