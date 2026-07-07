package qf;

import he.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends l implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11211x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f11212y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i6) {
        super(1);
        this.f11211x = i6;
        this.f11212y = dVar;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        switch (this.f11211x) {
            case 0:
                this.f11212y.f(null);
                return y.f6101a;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.E;
                d dVar = this.f11212y;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.f(null);
                return y.f6101a;
        }
    }
}
