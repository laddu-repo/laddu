package od;

import android.content.Context;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.google.android.gms.internal.measurement.j5;
import java.util.List;
import java.util.concurrent.CancellationException;
import kd.p0;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z extends ne.j implements ve.p {
    public final /* synthetic */ ve.l A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10161x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10162y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f10163z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(String str, ve.l lVar, le.c cVar, int i6) {
        super(2, cVar);
        this.f10161x = i6;
        this.f10163z = str;
        this.A = lVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f10161x) {
            case 0:
                z zVar = new z(this.f10163z, (cf.p) this.A, cVar, 0);
                zVar.f10162y = obj;
                return zVar;
            case 1:
                z zVar2 = new z(this.f10163z, (cf.p) this.A, cVar, 1);
                zVar2.f10162y = obj;
                return zVar2;
            default:
                z zVar3 = new z(this.f10163z, (e0) this.A, cVar, 2);
                zVar3.f10162y = obj;
                return zVar3;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f10161x) {
            case 0:
                return ((z) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            case 1:
                return ((z) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((z) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f10161x;
        gf.z zVar = gf.z.f5729x;
        ve.l lVar = this.A;
        String str = this.f10163z;
        switch (i6) {
            case 0:
                he.a.f(obj);
                gf.c0 c0Var = (gf.c0) this.f10162y;
                gf.f0.l(c0Var.getCoroutineContext());
                y7.c cVar = new y7.c();
                cVar.c(str);
                cVar.f15008c = 1;
                cVar.b(c0Var.getCoroutineContext().get(zVar));
                cVar.d();
                ((cf.p) lVar).invoke(cVar);
                Context context = p7.a.f10615a;
                Request.Builder builder = cVar.f15009d;
                int i10 = bf.r.f1668c;
                y7.b.a(builder, kotlin.jvm.internal.x.b(j5.m(kotlin.jvm.internal.x.c(p0.class))));
                Response execute = cVar.f15010e.newCall(cVar.a()).execute();
                try {
                    Object a10 = a8.g.g(execute.request()).a(bf.y.e(kotlin.jvm.internal.x.b(j5.m(kotlin.jvm.internal.x.c(p0.class))), false), execute);
                    if (a10 != null) {
                        return (List) a10;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.playfy.tv.models.StreamUrl>");
                } catch (NetException e10) {
                    throw e10;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            case 1:
                he.a.f(obj);
                gf.c0 c0Var2 = (gf.c0) this.f10162y;
                gf.f0.l(c0Var2.getCoroutineContext());
                y7.c cVar2 = new y7.c();
                cVar2.c(str);
                cVar2.f15008c = 1;
                cVar2.b(c0Var2.getCoroutineContext().get(zVar));
                cVar2.d();
                ((cf.p) lVar).invoke(cVar2);
                Context context2 = p7.a.f10615a;
                y7.b.a(cVar2.f15009d, kotlin.jvm.internal.x.c(Response.class));
                Response execute2 = cVar2.f15010e.newCall(cVar2.a()).execute();
                try {
                    Object a11 = a8.g.g(execute2.request()).a(bf.y.e(kotlin.jvm.internal.x.c(Response.class), false), execute2);
                    if (a11 != null) {
                        return (Response) a11;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.Response");
                } catch (NetException e12) {
                    throw e12;
                } catch (CancellationException e13) {
                    throw e13;
                } catch (Throwable th2) {
                    throw new ConvertException(execute2, "An unexpected error occurred in the converter", th2, null, 8, null);
                }
            default:
                he.a.f(obj);
                gf.c0 c0Var3 = (gf.c0) this.f10162y;
                gf.f0.l(c0Var3.getCoroutineContext());
                y7.c cVar3 = new y7.c();
                cVar3.c(str);
                cVar3.f15008c = 1;
                cVar3.b(c0Var3.getCoroutineContext().get(zVar));
                cVar3.d();
                ((e0) lVar).invoke(cVar3);
                Context context3 = p7.a.f10615a;
                y7.b.a(cVar3.f15009d, kotlin.jvm.internal.x.c(Response.class));
                Response execute3 = cVar3.f15010e.newCall(cVar3.a()).execute();
                try {
                    Object a12 = a8.g.g(execute3.request()).a(bf.y.e(kotlin.jvm.internal.x.c(Response.class), false), execute3);
                    if (a12 != null) {
                        return (Response) a12;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.Response");
                } catch (NetException e14) {
                    throw e14;
                } catch (CancellationException e15) {
                    throw e15;
                } catch (Throwable th3) {
                    throw new ConvertException(execute3, "An unexpected error occurred in the converter", th3, null, 8, null);
                }
        }
    }
}
