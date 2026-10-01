package t4;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.z;
import gf.f0;
import he.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f12608a;

    public d(MeasurementManager mMeasurementManager) {
        k.e(mMeasurementManager, "mMeasurementManager");
        this.f12608a = mMeasurementManager;
    }

    public static Object b(d dVar, a aVar, le.c cVar) {
        new gf.k(1, a8.c.i(cVar)).s();
        MeasurementManager measurementManager = dVar.f12608a;
        throw null;
    }

    public static Object d(d dVar, le.c cVar) {
        gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        dVar.f12608a.getMeasurementApiStatus(new q.a(1), new p0.c(kVar));
        return kVar.r();
    }

    public static Object g(d dVar, Uri uri, InputEvent inputEvent, le.c cVar) {
        gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        dVar.f12608a.registerSource(uri, inputEvent, new q.a(1), new p0.c(kVar));
        Object r10 = kVar.r();
        if (r10 == me.a.f8833x) {
            return r10;
        }
        return y.f6101a;
    }

    public static Object h(d dVar, e eVar, le.c cVar) {
        Object j = f0.j(new z(dVar, null, 12), cVar);
        if (j == me.a.f8833x) {
            return j;
        }
        return y.f6101a;
    }

    public static Object j(d dVar, Uri uri, le.c cVar) {
        gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        dVar.f12608a.registerTrigger(uri, new q.a(1), new p0.c(kVar));
        Object r10 = kVar.r();
        if (r10 == me.a.f8833x) {
            return r10;
        }
        return y.f6101a;
    }

    public static Object l(d dVar, f fVar, le.c cVar) {
        new gf.k(1, a8.c.i(cVar)).s();
        MeasurementManager measurementManager = dVar.f12608a;
        throw null;
    }

    public static Object n(d dVar, g gVar, le.c cVar) {
        new gf.k(1, a8.c.i(cVar)).s();
        MeasurementManager measurementManager = dVar.f12608a;
        throw null;
    }

    public Object a(a aVar, le.c cVar) {
        return b(this, aVar, cVar);
    }

    public Object c(le.c cVar) {
        return d(this, cVar);
    }

    public Object e(Uri uri, InputEvent inputEvent, le.c cVar) {
        return g(this, uri, inputEvent, cVar);
    }

    public Object f(e eVar, le.c cVar) {
        return h(this, eVar, cVar);
    }

    public Object i(Uri uri, le.c cVar) {
        return j(this, uri, cVar);
    }

    public Object k(f fVar, le.c cVar) {
        return l(this, fVar, cVar);
    }

    public Object m(g gVar, le.c cVar) {
        return n(this, gVar, cVar);
    }
}
