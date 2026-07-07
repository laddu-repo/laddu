package d1;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ud.h implements ce.p {
    public int A;
    public final /* synthetic */ e0 B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(e0 e0Var, sd.c cVar, int i) {
        super(2, cVar);
        this.f3922z = i;
        this.B = e0Var;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f3922z) {
        }
        return ((n) l((me.v) obj, (sd.c) obj2)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f3922z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new n(this.B, cVar, 0);
            case 1:
                return new n(this.B, cVar, 1);
            default:
                return new n(this.B, cVar, 2);
        }
    }

    @Override // ud.a
    public final Object o(Object obj) throws Throwable {
        switch (this.f3922z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.A;
                if (i == 0) {
                    fa.b.z(obj);
                    this.A = 1;
                    Object objE = e0.e(this.B, this);
                    td.a aVar = td.a.f12544v;
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                }
                return od.l.f10126a;
            case 1:
                int i10 = this.A;
                od.l lVar = od.l.f10126a;
                e0 e0Var = this.B;
                td.a aVar2 = td.a.f12544v;
                if (i10 == 0) {
                    fa.b.z(obj);
                    sb.p pVar = e0Var.i;
                    this.A = 1;
                    Object objA0 = ((me.n) pVar.f11743x).a0(this);
                    if (objA0 != aVar2) {
                        objA0 = lVar;
                    }
                    if (objA0 != aVar2) {
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                    return lVar;
                }
                fa.b.z(obj);
                pe.c cVarC = e0Var.h().c();
                boolean z2 = cVarC instanceof qe.d;
                sd.i iVar = sd.i.f11797v;
                oe.a aVar3 = oe.a.f10128w;
                pe.c cVarY = z2 ? ((qe.d) cVarC).y(iVar, 0, aVar3) : new pe.b(cVarC, iVar, 0, aVar3, 1);
                ac.b1 b1Var = new ac.b1(2, e0Var);
                this.A = 2;
                if (cVarY.g(b1Var, this) != aVar2) {
                    return lVar;
                }
                return aVar2;
            default:
                e0 e0Var2 = this.B;
                s5.d dVar = e0Var2.f3870h;
                int i11 = this.A;
                td.a aVar4 = td.a.f12544v;
                try {
                    if (i11 == 0) {
                        fa.b.z(obj);
                        if (dVar.x() instanceof o0) {
                            return dVar.x();
                        }
                        this.A = 1;
                        if (e0Var2.i(this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fa.b.z(obj);
                            return (i1) obj;
                        }
                        fa.b.z(obj);
                    }
                    this.A = 2;
                    obj = e0.f(e0Var2, false, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    return (i1) obj;
                } catch (Throwable th) {
                    return new a1(th, -1);
                }
        }
    }
}
