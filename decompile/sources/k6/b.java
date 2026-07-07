package k6;

import android.view.LayoutInflater;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Method f7736a;

    public b(Method method) {
        this.f7736a = method;
    }

    @Override // k6.c
    public final r5.a a(LayoutInflater layoutInflater) {
        Object invoke = this.f7736a.invoke(null, layoutInflater, null, Boolean.FALSE);
        k.c(invoke, "null cannot be cast to non-null type VB of by.kirich1409.viewbindingdelegate.internal.FullInflateViewBinding");
        return (r5.a) invoke;
    }
}
