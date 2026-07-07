package b1;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kf.f1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.l implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1319x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1320y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Class cls) {
        super(1);
        this.f1319x = 1;
        j6.d dVar = j6.d.f7238x;
        this.f1320y = cls;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        MeasurementManager measurementManager;
        switch (this.f1319x) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    f1 f1Var = ((g0) this.f1320y).f1304g;
                    j jVar = new j(th);
                    f1Var.getClass();
                    f1Var.h(null, jVar);
                }
                Object obj2 = g0.f1297k;
                g0 g0Var = (g0) this.f1320y;
                synchronized (obj2) {
                    g0.j.remove(g0Var.b().getAbsolutePath());
                }
                return he.y.f6101a;
            case 1:
                d.q activity = (d.q) obj;
                kotlin.jvm.internal.k.e(activity, "activity");
                LinkedHashMap linkedHashMap = k6.f.f7737a;
                Class cls = (Class) this.f1320y;
                LinkedHashMap linkedHashMap2 = k6.f.f7738b;
                Object obj3 = linkedHashMap2.get(cls);
                if (obj3 == null) {
                    obj3 = new k6.a(cls);
                    linkedHashMap2.put(cls, obj3);
                }
                Object invoke = ((k6.a) obj3).f7735a.invoke(null, (View) j6.d.f7238x.invoke(activity));
                kotlin.jvm.internal.k.c(invoke, "null cannot be cast to non-null type VB of by.kirich1409.viewbindingdelegate.internal.BindViewBinding");
                return (r5.a) invoke;
            case 2:
                gf.k kVar = (gf.k) this.f1320y;
                he.y yVar = he.y.f6101a;
                kVar.resumeWith(yVar);
                return yVar;
            case 3:
                ((qf.i) this.f1320y).c();
                return he.y.f6101a;
            case 4:
                Context it = (Context) obj;
                kotlin.jvm.internal.k.e(it, "it");
                Context context = (Context) this.f1320y;
                kotlin.jvm.internal.k.e(context, "context");
                measurementManager = MeasurementManager.get(context);
                kotlin.jvm.internal.k.d(measurementManager, "get(context)");
                return new t4.d(measurementManager);
            case 5:
                Throwable th2 = (Throwable) obj;
                v5.j jVar2 = (v5.j) this.f1320y;
                if (th2 == null) {
                    if (!jVar2.f13326x.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    jVar2.f13326x.cancel(true);
                } else {
                    g6.j jVar3 = jVar2.f13326x;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    jVar3.j(th2);
                }
                return he.y.f6101a;
            default:
                ((z7.b) this.f1320y).getClass();
                return he.y.f6101a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, int i6) {
        super(1);
        this.f1319x = i6;
        this.f1320y = obj;
    }
}
