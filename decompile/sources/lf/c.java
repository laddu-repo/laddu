package lf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public static final le.c[] f8362a = new le.c[0];

    /* renamed from: b */
    public static final h5.a f8363b = new h5.a("NULL", 1);

    /* renamed from: c */
    public static final h5.a f8364c = new h5.a("UNINITIALIZED", 1);

    /* renamed from: d */
    public static final h5.a f8365d = new h5.a("DONE", 1);

    public static /* synthetic */ kf.h a(r rVar, le.h hVar, int i6, jf.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            hVar = le.i.f8353x;
        }
        if ((i10 & 2) != 0) {
            i6 = -3;
        }
        if ((i10 & 4) != 0) {
            aVar = jf.a.f7436x;
        }
        return rVar.r(hVar, i6, aVar);
    }

    public static final Object b(le.h hVar, Object obj, Object obj2, ve.p pVar, le.c frame) {
        Object invoke;
        Object m9 = mf.a.m(hVar, obj2);
        try {
            a0 a0Var = new a0(frame, hVar);
            if (!r4.a.w(pVar)) {
                invoke = a8.c.u(pVar, obj, a0Var);
            } else {
                kotlin.jvm.internal.z.c(2, pVar);
                invoke = pVar.invoke(obj, a0Var);
            }
            mf.a.g(hVar, m9);
            if (invoke == me.a.f8833x) {
                kotlin.jvm.internal.k.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            mf.a.g(hVar, m9);
            throw th;
        }
    }
}
