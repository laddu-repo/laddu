package n9;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9324b;

    public /* synthetic */ g1(Object obj, int i6) {
        this.f9323a = i6;
        this.f9324b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [u5.o, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9323a) {
            case 0:
                return new com.google.android.gms.internal.measurement.m4(((h1) this.f9324b).I);
            case 1:
                t1 t1Var = (t1) this.f9324b;
                t1Var.f9483e.w();
                y0 y0Var = t1Var.f9483e.E;
                e4.P(y0Var);
                y0Var.d1();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) this.f9324b;
                ?? obj = new Object();
                obj.f12911a = jsReplyProxyBoundaryInterface;
                return obj;
        }
    }

    public g1(t1 t1Var, v vVar, String str) {
        this.f9323a = 1;
        this.f9324b = t1Var;
    }
}
