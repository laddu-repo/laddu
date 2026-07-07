package a5;

import ve.l;
import x4.o;
import z4.r;
import z4.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements s, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f571b;

    public /* synthetic */ c(Object obj, int i6) {
        this.f570a = i6;
        this.f571b = obj;
    }

    @Override // x4.o
    public final Object b(String str, l lVar, ne.c cVar) {
        switch (this.f570a) {
            case 0:
                return ((e) this.f571b).b(str, lVar, cVar);
            default:
                return ((r) this.f571b).b(str, lVar, cVar);
        }
    }

    @Override // z4.s
    public final g5.a c() {
        switch (this.f570a) {
            case 0:
                return ((e) this.f571b).f575a;
            default:
                return ((r) this.f571b).f15212a;
        }
    }
}
