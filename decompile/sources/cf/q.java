package cf;

import java.util.Iterator;
import kotlin.jvm.internal.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements Iterable, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2075x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2076y;

    public /* synthetic */ q(Object obj, int i6) {
        this.f2075x = i6;
        this.f2076y = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2075x) {
            case 0:
                return new df.b((i) this.f2076y);
            case 1:
                return new b(z.e((Object[]) ((androidx.lifecycle.i) this.f2076y).f938y));
            default:
                return new he.p((wf.u) this.f2076y);
        }
    }
}
