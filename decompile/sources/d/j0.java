package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f3450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f3452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f3453d;

    public j0(g0 g0Var, g0 g0Var2, h0 h0Var, h0 h0Var2) {
        this.f3450a = g0Var;
        this.f3451b = g0Var2;
        this.f3452c = h0Var;
        this.f3453d = h0Var2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f3453d.invoke();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f3452c.invoke();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.k.e(backEvent, "backEvent");
        this.f3451b.invoke(new c(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.k.e(backEvent, "backEvent");
        this.f3450a.invoke(new c(backEvent));
    }
}
