package pf;

import gf.f0;
import hb.s;
import he.y;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import ve.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a extends j implements q {

    /* renamed from: x, reason: collision with root package name */
    public static final a f10756x = new j(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j = bVar.f10757a;
        y yVar = y.f6101a;
        if (j <= 0) {
            ((e) fVar).B = yVar;
            return yVar;
        }
        s sVar = new s(27, fVar, bVar);
        k.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        le.h hVar = eVar.f10770x;
        eVar.f10772z = f0.o(hVar).S(j, sVar, hVar);
        return yVar;
    }
}
