package d1;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ud.h implements ce.q {
    public int A;
    public /* synthetic */ Object B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3926z = 1;

    public /* synthetic */ q(int i, sd.c cVar) {
        super(i, cVar);
    }

    @Override // ce.q
    public final Object h(Object obj, Object obj2, Object obj3) {
        switch (this.f3926z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new q((e0) this.B, (sd.c) obj3).o(od.l.f10126a);
            default:
                ((Boolean) obj2).getClass();
                q qVar = new q(3, (sd.c) obj3);
                qVar.B = (g0) obj;
                return qVar.o(od.l.f10126a);
        }
    }

    @Override // ud.a
    public final Object o(Object obj) throws Throwable {
        switch (this.f3926z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.A;
                if (i == 0) {
                    fa.b.z(obj);
                    e0 e0Var = (e0) this.B;
                    this.A = 1;
                    Object objC = e0.c(e0Var, this);
                    td.a aVar = td.a.f12544v;
                    if (objC == aVar) {
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
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                    return obj;
                }
                fa.b.z(obj);
                g0 g0Var = (g0) this.B;
                this.A = 1;
                g0Var.getClass();
                Object objA = g0.a(g0Var, this);
                td.a aVar2 = td.a.f12544v;
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e0 e0Var, sd.c cVar) {
        super(3, cVar);
        this.B = e0Var;
    }
}
