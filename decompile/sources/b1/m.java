package b1;

import android.view.LayoutInflater;
import gf.j0;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.l implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1310x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1311y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1312z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i6, Object obj, Object obj2) {
        super(1);
        this.f1310x = i6;
        this.f1311y = obj;
        this.f1312z = obj2;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        he.y yVar;
        Throwable th;
        int i6 = this.f1310x;
        he.y yVar2 = he.y.f6101a;
        Object obj2 = this.f1312z;
        Object obj3 = this.f1311y;
        switch (i6) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((r) obj3).invoke(th2);
                jf.h hVar = (jf.h) ((c6.h) obj2).f1983z;
                hVar.l(th2, false);
                do {
                    Object g10 = hVar.g();
                    if (g10 instanceof jf.n) {
                        g10 = null;
                    }
                    if (g10 == null) {
                        yVar = null;
                    } else {
                        p pVar = (p) g10;
                        if (pVar instanceof o) {
                            gf.q qVar = ((o) pVar).f1315b;
                            if (th2 == null) {
                                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                th = th2;
                            }
                            qVar.getClass();
                            qVar.K(new gf.t(th, false));
                        }
                        yVar = yVar2;
                    }
                } while (yVar != null);
                return yVar2;
            case 1:
                ((hf.d) obj3).f6106y.removeCallbacks((hb.s) obj2);
                return yVar2;
            case 2:
                d.q it = (d.q) obj;
                kotlin.jvm.internal.k.e(it, "it");
                LinkedHashMap linkedHashMap = k6.f.f7737a;
                k6.c a10 = k6.f.a((Class) obj3);
                LayoutInflater layoutInflater = ((i.j) obj2).getLayoutInflater();
                kotlin.jvm.internal.k.d(layoutInflater, "layoutInflater");
                return a10.a(layoutInflater);
            default:
                Throwable th3 = (Throwable) obj;
                x.h hVar2 = (x.h) obj3;
                if (th3 != null) {
                    if (th3 instanceof CancellationException) {
                        hVar2.f14451d = true;
                        x.j jVar = hVar2.f14449b;
                        if (jVar != null && jVar.f14453y.cancel(true)) {
                            hVar2.f14448a = null;
                            hVar2.f14449b = null;
                            hVar2.f14450c = null;
                        }
                    } else {
                        hVar2.f14451d = true;
                        x.j jVar2 = hVar2.f14449b;
                        if (jVar2 != null && jVar2.f14453y.k(th3)) {
                            hVar2.f14448a = null;
                            hVar2.f14449b = null;
                            hVar2.f14450c = null;
                        }
                    }
                } else {
                    Object z10 = ((j0) obj2).z();
                    hVar2.f14451d = true;
                    x.j jVar3 = hVar2.f14449b;
                    if (jVar3 != null && jVar3.f14453y.j(z10)) {
                        hVar2.f14448a = null;
                        hVar2.f14449b = null;
                        hVar2.f14450c = null;
                    }
                }
                return yVar2;
        }
    }
}
