package androidx.lifecycle;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.google.android.gms.internal.measurement.j5;
import gf.e2;
import gf.t1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z extends ne.j implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f995x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f996y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Object obj2, le.c cVar, int i6) {
        super(2, cVar);
        this.f995x = i6;
        this.f996y = obj;
        this.f997z = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [ne.j, ve.p] */
    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f995x) {
            case 0:
                z zVar = new z((a0) this.f997z, cVar, 0);
                zVar.f996y = obj;
                return zVar;
            case 1:
                z zVar2 = new z((b1.h0) this.f997z, cVar, 1);
                zVar2.f996y = obj;
                return zVar2;
            case 2:
                z zVar3 = new z((ve.l) this.f997z, cVar);
                zVar3.f996y = obj;
                return zVar3;
            case 3:
                return new z((dd.d) this.f996y, (String) this.f997z, cVar, 3);
            case 4:
                z zVar4 = new z((ve.a) this.f997z, cVar, 4);
                zVar4.f996y = obj;
                return zVar4;
            case 5:
                return new z((String) this.f996y, (jd.y) this.f997z, cVar, 5);
            case 6:
                return new z((List) this.f996y, (od.j) this.f997z, cVar, 6);
            case 7:
                z zVar5 = new z((String) this.f997z, cVar, 7);
                zVar5.f996y = obj;
                return zVar5;
            case 8:
                return new z((od.s) this.f996y, (List) this.f997z, cVar, 8);
            case 9:
                z zVar6 = new z((od.r) this.f997z, cVar, 9);
                zVar6.f996y = obj;
                return zVar6;
            case 10:
                z zVar7 = new z((od.r) this.f997z, cVar, 10);
                zVar7.f996y = obj;
                return zVar7;
            case 11:
                z zVar8 = new z((od.e0) this.f997z, cVar, 11);
                zVar8.f996y = obj;
                return zVar8;
            case 12:
                z zVar9 = new z((t4.d) this.f997z, cVar, 12);
                zVar9.f996y = obj;
                return zVar9;
            default:
                z zVar10 = new z((ve.p) this.f997z, cVar);
                zVar10.f996y = obj;
                return zVar10;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f995x) {
            case 0:
                z zVar = (z) create((gf.c0) obj, (le.c) obj2);
                he.y yVar = he.y.f6101a;
                zVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                return ((z) create((b1.h0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 2:
                return ((z) create((a5.c) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 3:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 4:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 5:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 6:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 7:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 8:
                z zVar2 = (z) create((gf.c0) obj, (le.c) obj2);
                he.y yVar2 = he.y.f6101a;
                zVar2.invokeSuspend(yVar2);
                return yVar2;
            case 9:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 10:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 11:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 12:
                ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
                throw null;
            default:
                return ((z) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kf.f1] */
    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        String str;
        gf.q0 b02;
        int i6;
        le.c cVar;
        int size;
        int i10 = this.f995x;
        he.y yVar = he.y.f6101a;
        gf.z zVar = gf.z.f5729x;
        le.c cVar2 = null;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        z10 = false;
        z10 = false;
        int i13 = 1;
        Object obj2 = this.f997z;
        switch (i10) {
            case 0:
                he.a.f(obj);
                gf.c0 c0Var = (gf.c0) this.f996y;
                a0 a0Var = (a0) obj2;
                y yVar2 = a0Var.f880x;
                if (yVar2.b().compareTo(x.f992y) >= 0) {
                    yVar2.a(a0Var);
                } else {
                    gf.f0.h(c0Var.getCoroutineContext(), null);
                }
                return yVar;
            case 1:
                he.a.f(obj);
                b1.h0 h0Var = (b1.h0) this.f996y;
                b1.h0 h0Var2 = (b1.h0) obj2;
                if (!(h0Var2 instanceof b1.c) && !(h0Var2 instanceof b1.j) && h0Var == h0Var2) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                he.a.f(obj);
                a5.c cVar3 = (a5.c) this.f996y;
                kotlin.jvm.internal.k.c(cVar3, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return ((ve.l) obj2).invoke(cVar3.c());
            case 3:
                he.a.f(obj);
                dd.d dVar = (dd.d) this.f996y;
                dVar.f4095b = 3;
                while (dVar.f4095b != 1 && i12 < 3) {
                    dVar.f4097d = (String) obj2;
                    try {
                        SparseArray a10 = dd.d.a(dVar);
                        if (a10 != null) {
                            try {
                                dd.e b10 = s1.c.b(s1.c.m(a10));
                                if (b10 != null) {
                                    str = b10.f4114b;
                                } else {
                                    str = null;
                                }
                                if (!dd.d.b(dVar, str)) {
                                    dVar.f4095b = 1;
                                    return a10;
                                }
                                i12++;
                                dVar.f4095b = 2;
                                Log.e("Kotlin YouTube Extractor", "Extraction failed cause 403 HTTP Error");
                            } catch (IOException e10) {
                                i12++;
                                dVar.f4095b = 2;
                                Log.e("Kotlin YouTube Extractor", "Extraction failed cause 403 HTTP Error", e10);
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception e11) {
                        i12++;
                        dVar.f4095b = 2;
                        Log.e("Kotlin YouTube Extractor", "Extraction failed", e11);
                    }
                }
                return null;
            case 4:
                he.a.f(obj);
                ve.a aVar = (ve.a) obj2;
                try {
                    gf.j1 q9 = gf.f0.q(((gf.c0) this.f996y).getCoroutineContext());
                    e2 e2Var = new e2(q9);
                    if (q9 instanceof t1) {
                        b02 = ((t1) q9).I(true, true, e2Var);
                    } else {
                        b02 = q9.b0(true, true, new gf.n1(1, e2Var, gf.g1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
                    }
                    e2Var.f5664y = b02;
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e2.f5662z;
                    try {
                        do {
                            i6 = atomicIntegerFieldUpdater.get(e2Var);
                            if (i6 != 0) {
                                if (i6 != 2 && i6 != 3) {
                                    e2.c(i6);
                                    throw null;
                                }
                            }
                            return aVar.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(e2Var, i6, 0));
                        return aVar.invoke();
                    } finally {
                        e2Var.b();
                    }
                } catch (InterruptedException e12) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e12);
                }
            case 5:
                jd.y yVar3 = (jd.y) obj2;
                he.a.f(obj);
                String str2 = (String) this.f996y;
                if (!df.m.S(str2)) {
                    if (yVar3 instanceof jd.x) {
                        return new jd.x(cf.m.i(str2, (List) ((jd.x) yVar3).f7412a));
                    }
                    if ((yVar3 instanceof jd.v) || (yVar3 instanceof jd.w)) {
                        return yVar3;
                    }
                    throw new RuntimeException();
                }
                return yVar3;
            case 6:
                he.a.f(obj);
                return cf.l.P(new cf.t(new cf.i(i13, new cf.t(ie.j.C((List) this.f996y), new od.e((od.j) obj2, System.currentTimeMillis()), i13), new od.h(new od.h(new od.g(z10 ? 1 : 0), i13), z10 ? 1 : 0)), od.f.f10078x, i13));
            case 7:
                he.a.f(obj);
                gf.c0 c0Var2 = (gf.c0) this.f996y;
                gf.f0.l(c0Var2.getCoroutineContext());
                y7.c cVar4 = new y7.c();
                cVar4.c((String) obj2);
                cVar4.f15008c = 1;
                cVar4.b(c0Var2.getCoroutineContext().get(zVar));
                cVar4.d();
                Context context = p7.a.f10615a;
                Request.Builder builder = cVar4.f15009d;
                int i14 = bf.r.f1668c;
                y7.b.a(builder, kotlin.jvm.internal.x.b(j5.m(kotlin.jvm.internal.x.c(kd.l.class))));
                Response execute = cVar4.f15010e.newCall(cVar4.a()).execute();
                try {
                    Object a11 = a8.g.g(execute.request()).a(bf.y.e(kotlin.jvm.internal.x.b(j5.m(kotlin.jvm.internal.x.c(kd.l.class))), false), execute);
                    if (a11 != null) {
                        return (List) a11;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.playfy.tv.models.Channel>");
                } catch (NetException e13) {
                    throw e13;
                } catch (CancellationException e14) {
                    throw e14;
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            case 8:
                he.a.f(obj);
                od.s sVar = (od.s) this.f996y;
                ?? r22 = sVar.f10145i;
                List t10 = ie.k.t("All", "Live", "Recent", "Upcoming");
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(ie.l.x(t10, 10));
                for (Object obj3 : t10) {
                    int i15 = i11 + 1;
                    if (i11 >= 0) {
                        String str3 = (String) obj3;
                        if (kotlin.jvm.internal.k.a(str3, "All")) {
                            size = list.size();
                            cVar = cVar2;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : list) {
                                kd.a0 a0Var2 = ((kd.u) obj4).C;
                                le.c cVar5 = cVar2;
                                if (od.s.k(sVar, i11, a0Var2.C, a0Var2.D)) {
                                    arrayList2.add(obj4);
                                }
                                cVar2 = cVar5;
                            }
                            cVar = cVar2;
                            size = arrayList2.size();
                        }
                        arrayList.add(str3 + " (" + size + ")");
                        i11 = i15;
                        cVar2 = cVar;
                    } else {
                        ?? r16 = cVar2;
                        ie.k.w();
                        throw r16;
                    }
                }
                r22.getClass();
                r22.h(cVar2, arrayList);
                return yVar;
            case 9:
                he.a.f(obj);
                gf.c0 c0Var3 = (gf.c0) this.f996y;
                gf.f0.l(c0Var3.getCoroutineContext());
                y7.c cVar6 = new y7.c();
                cVar6.c("cats/live-events.json");
                cVar6.f15008c = 1;
                cVar6.b(c0Var3.getCoroutineContext().get(zVar));
                cVar6.d();
                ((od.r) obj2).invoke(cVar6);
                Context context2 = p7.a.f10615a;
                y7.b.a(cVar6.f15009d, kotlin.jvm.internal.x.c(kd.x.class));
                Response execute2 = cVar6.f15010e.newCall(cVar6.a()).execute();
                try {
                    Object a12 = a8.g.g(execute2.request()).a(bf.y.e(kotlin.jvm.internal.x.c(kd.x.class), false), execute2);
                    if (a12 != null) {
                        return (kd.x) a12;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.playfy.tv.models.Events");
                } catch (NetException e15) {
                    throw e15;
                } catch (CancellationException e16) {
                    throw e16;
                } catch (Throwable th2) {
                    throw new ConvertException(execute2, "An unexpected error occurred in the converter", th2, null, 8, null);
                }
            case 10:
                he.a.f(obj);
                gf.c0 c0Var4 = (gf.c0) this.f996y;
                gf.f0.l(c0Var4.getCoroutineContext());
                y7.c cVar7 = new y7.c();
                cVar7.c("cats/highlights.json");
                cVar7.f15008c = 1;
                cVar7.b(c0Var4.getCoroutineContext().get(zVar));
                cVar7.d();
                ((od.r) obj2).invoke(cVar7);
                Context context3 = p7.a.f10615a;
                y7.b.a(cVar7.f15009d, kotlin.jvm.internal.x.c(kd.x.class));
                Response execute3 = cVar7.f15010e.newCall(cVar7.a()).execute();
                try {
                    Object a13 = a8.g.g(execute3.request()).a(bf.y.e(kotlin.jvm.internal.x.c(kd.x.class), false), execute3);
                    if (a13 != null) {
                        return (kd.x) a13;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.playfy.tv.models.Events");
                } catch (NetException e17) {
                    throw e17;
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Throwable th3) {
                    throw new ConvertException(execute3, "An unexpected error occurred in the converter", th3, null, 8, null);
                }
            case 11:
                he.a.f(obj);
                gf.c0 c0Var5 = (gf.c0) this.f996y;
                gf.f0.l(c0Var5.getCoroutineContext());
                y7.c cVar8 = new y7.c();
                cVar8.c("app.json");
                cVar8.f15008c = 1;
                cVar8.b(c0Var5.getCoroutineContext().get(zVar));
                cVar8.d();
                ((od.e0) obj2).invoke(cVar8);
                Context context4 = p7.a.f10615a;
                y7.b.a(cVar8.f15009d, kotlin.jvm.internal.x.c(kd.f.class));
                Response execute4 = cVar8.f15010e.newCall(cVar8.a()).execute();
                try {
                    Object a14 = a8.g.g(execute4.request()).a(bf.y.e(kotlin.jvm.internal.x.c(kd.f.class), false), execute4);
                    if (a14 != null) {
                        return (kd.f) a14;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.playfy.tv.models.AppData");
                } catch (NetException e19) {
                    throw e19;
                } catch (CancellationException e20) {
                    throw e20;
                } catch (Throwable th4) {
                    throw new ConvertException(execute4, "An unexpected error occurred in the converter", th4, null, 8, null);
                }
            case 12:
                he.a.f(obj);
                throw null;
            default:
                he.a.f(obj);
                le.f fVar = ((gf.c0) this.f996y).getCoroutineContext().get(le.d.f8352x);
                kotlin.jvm.internal.k.b(fVar);
                le.e eVar = (le.e) fVar;
                gf.q a15 = gf.f0.a();
                gf.f0.v(gf.b1.f5652x, eVar, gf.d0.A, new dd.c(a15, (ve.p) obj2, (le.c) null));
                while (a15.E() instanceof gf.d1) {
                    try {
                        return gf.f0.B(eVar, new b(a15, cVar2, 6));
                    } catch (InterruptedException unused) {
                    }
                }
                return a15.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, le.c cVar, int i6) {
        super(2, cVar);
        this.f995x = i6;
        this.f997z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ve.l lVar, le.c cVar) {
        super(2, cVar);
        this.f995x = 2;
        this.f997z = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(ve.p pVar, le.c cVar) {
        super(2, cVar);
        this.f995x = 13;
        this.f997z = (ne.j) pVar;
    }
}
