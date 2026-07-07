package od;

import com.google.android.gms.internal.measurement.j5;
import he.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 extends ne.j implements ve.p {
    public final /* synthetic */ kd.d0 A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10110x;

    /* renamed from: y, reason: collision with root package name */
    public int f10111y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k0 f10112z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, kd.d0 d0Var, le.c cVar, int i6) {
        super(2, cVar);
        this.f10110x = i6;
        this.f10112z = k0Var;
        this.A = d0Var;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f10110x) {
            case 0:
                return new j0(this.f10112z, this.A, cVar, 0);
            default:
                return new j0(this.f10112z, this.A, cVar, 1);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f10110x) {
            case 0:
                return ((j0) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((j0) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10110x) {
            case 0:
                int i6 = this.f10111y;
                he.y yVar = he.y.f6101a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                final hd.i iVar = this.f10112z.f10116b;
                this.f10111y = 1;
                x4.w wVar = iVar.f6063a;
                final int i10 = 0;
                final kd.d0 d0Var = this.A;
                Object q9 = j5.q(this, new ve.l() { // from class: hd.h
                    @Override // ve.l
                    public final Object invoke(Object obj2) {
                        g5.a _connection = (g5.a) obj2;
                        switch (i10) {
                            case 0:
                                k.e(_connection, "_connection");
                                iVar.f6065c.e(_connection, d0Var);
                                break;
                            default:
                                k.e(_connection, "_connection");
                                iVar.f6064b.f(_connection, d0Var);
                                break;
                        }
                        return y.f6101a;
                    }
                }, wVar, false, true);
                me.a aVar = me.a.f8833x;
                if (q9 != aVar) {
                    q9 = yVar;
                }
                if (q9 == aVar) {
                    return aVar;
                }
                return yVar;
            default:
                int i11 = this.f10111y;
                he.y yVar2 = he.y.f6101a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        he.a.f(obj);
                        return yVar2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                final hd.i iVar2 = this.f10112z.f10116b;
                this.f10111y = 1;
                x4.w wVar2 = iVar2.f6063a;
                final int i12 = 1;
                final kd.d0 d0Var2 = this.A;
                Object q10 = j5.q(this, new ve.l() { // from class: hd.h
                    @Override // ve.l
                    public final Object invoke(Object obj2) {
                        g5.a _connection = (g5.a) obj2;
                        switch (i12) {
                            case 0:
                                k.e(_connection, "_connection");
                                iVar2.f6065c.e(_connection, d0Var2);
                                break;
                            default:
                                k.e(_connection, "_connection");
                                iVar2.f6064b.f(_connection, d0Var2);
                                break;
                        }
                        return y.f6101a;
                    }
                }, wVar2, false, true);
                me.a aVar2 = me.a.f8833x;
                if (q10 != aVar2) {
                    q10 = yVar2;
                }
                if (q10 == aVar2) {
                    return aVar2;
                }
                return yVar2;
        }
    }
}
