package androidx.lifecycle;

import androidx.work.CoroutineWorker;
import com.google.android.gms.internal.measurement.j5;
import com.unity3d.services.core.di.ServiceProvider;
import gf.a2;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends ne.j implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f884x;

    /* renamed from: y, reason: collision with root package name */
    public int f885y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f886z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, le.c cVar, int i6) {
        super(2, cVar);
        this.f884x = i6;
        this.f886z = obj;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f884x) {
            case 0:
                return new b((d) this.f886z, cVar, 0);
            case 1:
                return new b((kf.h) this.f886z, cVar, 1);
            case 2:
                return new b((od.i0) this.f886z, cVar, 2);
            case 3:
                return new b((s4.a) this.f886z, cVar, 3);
            case 4:
                return new b((CoroutineWorker) this.f886z, cVar, 4);
            case 5:
                return new b((x4.p0) this.f886z, cVar, 5);
            default:
                return new b((gf.q) this.f886z, cVar, 6);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f884x) {
            case 0:
                return ((b) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            case 1:
                return ((b) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            case 2:
                return ((b) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            case 3:
                return ((b) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            case 4:
                return ((b) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            case 5:
                return ((b) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((b) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f884x) {
            case 0:
                d dVar = (d) this.f886z;
                int i6 = this.f885y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    dVar.getClass();
                    this.f885y = 1;
                    Object k8 = gf.f0.k(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, this);
                    me.a aVar = me.a.f8833x;
                    if (k8 == aVar) {
                        return aVar;
                    }
                }
                if (((k) dVar.f896a).f971c <= 0) {
                    a2 a2Var = (a2) dVar.f900e;
                    if (a2Var != null) {
                        a2Var.d(null);
                    }
                    dVar.f900e = null;
                }
                return he.y.f6101a;
            case 1:
                int i10 = this.f885y;
                he.y yVar = he.y.f6101a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        he.a.f(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                kf.h hVar = (kf.h) this.f886z;
                this.f885y = 1;
                Object collect = hVar.collect(lf.t.f8392x, this);
                me.a aVar2 = me.a.f8833x;
                if (collect != aVar2) {
                    collect = yVar;
                }
                if (collect == aVar2) {
                    return aVar2;
                }
                return yVar;
            case 2:
                int i11 = this.f885y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    pd.b bVar = ((od.i0) this.f886z).f10097c;
                    this.f885y = 1;
                    obj = j5.q(this, new od.e0(3), bVar.f10752a, true, false);
                    me.a aVar3 = me.a.f8833x;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                Iterable iterable = (Iterable) obj;
                int w10 = ie.w.w(ie.l.x(iterable, 10));
                if (w10 < 16) {
                    w10 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(w10);
                for (Object obj2 : iterable) {
                    linkedHashMap.put(((kd.h0) obj2).A, obj2);
                }
                return linkedHashMap;
            case 3:
                int i12 = this.f885y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                t4.d dVar2 = ((s4.a) this.f886z).f12185a;
                this.f885y = 1;
                Object c10 = dVar2.c(this);
                me.a aVar4 = me.a.f8833x;
                if (c10 == aVar4) {
                    return aVar4;
                }
                return c10;
            case 4:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f886z;
                int i13 = this.f885y;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            he.a.f(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        he.a.f(obj);
                        this.f885y = 1;
                        obj = coroutineWorker.doWork(this);
                        me.a aVar5 = me.a.f8833x;
                        if (obj == aVar5) {
                            return aVar5;
                        }
                    }
                    coroutineWorker.getFuture$work_runtime_ktx_release().i((v5.n) obj);
                } catch (Throwable th) {
                    coroutineWorker.getFuture$work_runtime_ktx_release().j(th);
                }
                return he.y.f6101a;
            case 5:
                int i14 = this.f885y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    x4.p0 p0Var = (x4.p0) this.f886z;
                    this.f885y = 1;
                    Object f3 = p0Var.f(this);
                    me.a aVar6 = me.a.f8833x;
                    if (f3 == aVar6) {
                        return aVar6;
                    }
                }
                return he.y.f6101a;
            default:
                int i15 = this.f885y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                gf.q qVar = (gf.q) this.f886z;
                this.f885y = 1;
                Object p10 = qVar.p(this);
                me.a aVar7 = me.a.f8833x;
                if (p10 == aVar7) {
                    return aVar7;
                }
                return p10;
        }
    }
}
