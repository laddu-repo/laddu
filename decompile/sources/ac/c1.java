package ac;

import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends ud.h implements ce.p {
    public int A;
    public final /* synthetic */ g1 B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f335z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(g1 g1Var, sd.c cVar, int i) {
        super(2, cVar);
        this.f335z = i;
        this.B = g1Var;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        me.v vVar = (me.v) obj;
        sd.c cVar = (sd.c) obj2;
        switch (this.f335z) {
        }
        return ((c1) l(vVar, cVar)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f335z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new c1(this.B, cVar, 0);
            default:
                return new c1(this.B, cVar, 1);
        }
    }

    @Override // ud.a
    public final Object o(Object obj) {
        switch (this.f335z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.A;
                if (i == 0) {
                    fa.b.z(obj);
                    g1 g1Var = this.B;
                    p2.c cVar = new p2.c(4, g1Var.f371e.b(), new a1(g1Var, null));
                    b1 b1Var = new b1(0, g1Var);
                    this.A = 1;
                    Object objG = cVar.g(b1Var, this);
                    td.a aVar = td.a.f12544v;
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                }
                return od.l.f10126a;
            default:
                int i10 = this.A;
                sd.c cVar2 = null;
                g1 g1Var2 = this.B;
                try {
                    if (i10 == 0) {
                        fa.b.z(obj);
                        d1.h hVar = g1Var2.f371e;
                        e1 e1Var = new e1(g1Var2, cVar2, 0);
                        this.A = 1;
                        Object objA = hVar.a(e1Var, this);
                        td.a aVar2 = td.a.f12544v;
                        if (objA == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fa.b.z(obj);
                    }
                    break;
                } catch (Exception e7) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e7.getMessage());
                    m0 m0Var = g1Var2.f373h;
                    if (m0Var == null) {
                        de.i.i("localSessionData");
                        throw null;
                    }
                    g1Var2.f373h = m0.a(m0Var, null, g1Var2.f370d.a(), null, 5);
                }
                return od.l.f10126a;
        }
    }
}
