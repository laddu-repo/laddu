package xf;

import com.google.android.gms.internal.measurement.a4;
import java.util.Map;
import wf.h1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f14753a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x f14754b = x.f14750b;

    @Override // sf.a
    public final Object a(vf.b bVar) {
        a8.c.b(bVar);
        return new w((Map) a4.a(h1.f14332a, m.f14740a).i(bVar));
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        w value = (w) obj;
        kotlin.jvm.internal.k.e(value, "value");
        a8.c.a(tVar);
        a4.a(h1.f14332a, m.f14740a).c(tVar, value);
    }

    @Override // sf.a
    public final uf.g d() {
        return f14754b;
    }
}
