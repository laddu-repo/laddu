package u7;

import he.y;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import okhttp3.Call;
import okhttp3.Interceptor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends l implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Interceptor.Chain f12948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Interceptor.Chain chain) {
        super(0);
        this.f12948x = chain;
    }

    @Override // ve.a
    public final Object invoke() {
        Iterator it = p7.a.f10621g.iterator();
        k.d(it, "NetConfig.runningCalls.iterator()");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else if (call.equals(this.f12948x.call())) {
                it.remove();
                break;
            }
        }
        return y.f6101a;
    }
}
