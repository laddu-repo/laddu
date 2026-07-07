package d;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3447b;

    public /* synthetic */ i0(Object obj, int i6) {
        this.f3446a = i6;
        this.f3447b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f3446a) {
            case 0:
                ((h0) this.f3447b).invoke();
                return;
            case 1:
                ((i.b0) this.f3447b).C();
                return;
            default:
                ((Runnable) this.f3447b).run();
                return;
        }
    }
}
