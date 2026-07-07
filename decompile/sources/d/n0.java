package d;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3462a;

    /* renamed from: b, reason: collision with root package name */
    public final ie.h f3463b = new ie.h();

    /* renamed from: c, reason: collision with root package name */
    public f0 f3464c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3465d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3466e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3467f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3468g;

    public n0(Runnable runnable) {
        OnBackInvokedCallback i0Var;
        this.f3462a = runnable;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            if (i6 >= 34) {
                i0Var = new j0(new g0(this, 0), new g0(this, 1), new h0(this, 0), new h0(this, 1));
            } else {
                i0Var = new i0(new h0(this, 2), 0);
            }
            this.f3465d = i0Var;
        }
    }

    public final void a(androidx.lifecycle.f0 owner, f0 onBackPressedCallback) {
        kotlin.jvm.internal.k.e(owner, "owner");
        kotlin.jvm.internal.k.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.y lifecycle = owner.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.x.f991x) {
            return;
        }
        onBackPressedCallback.f3433b.add(new k0(this, lifecycle, onBackPressedCallback));
        f();
        onBackPressedCallback.f3434c = new m0(0, this, n0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final l0 b(f0 onBackPressedCallback) {
        kotlin.jvm.internal.k.e(onBackPressedCallback, "onBackPressedCallback");
        this.f3463b.addLast(onBackPressedCallback);
        l0 l0Var = new l0(this, onBackPressedCallback);
        onBackPressedCallback.f3433b.add(l0Var);
        f();
        onBackPressedCallback.f3434c = new m0(0, this, n0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        return l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        f0 f0Var;
        f0 f0Var2 = this.f3464c;
        if (f0Var2 == null) {
            ie.h hVar = this.f3463b;
            ListIterator listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    f0Var = listIterator.previous();
                    if (((f0) f0Var).f3432a) {
                        break;
                    }
                } else {
                    f0Var = 0;
                    break;
                }
            }
            f0Var2 = f0Var;
        }
        this.f3464c = null;
        if (f0Var2 != null) {
            f0Var2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        f0 f0Var;
        f0 f0Var2 = this.f3464c;
        if (f0Var2 == null) {
            ie.h hVar = this.f3463b;
            ListIterator listIterator = hVar.listIterator(hVar.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                    f0Var = listIterator.previous();
                    if (((f0) f0Var).f3432a) {
                        break;
                    }
                } else {
                    f0Var = 0;
                    break;
                }
            }
            f0Var2 = f0Var;
        }
        this.f3464c = null;
        if (f0Var2 != null) {
            f0Var2.b();
        } else {
            this.f3462a.run();
        }
    }

    public final void e(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3466e;
        OnBackInvokedCallback onBackInvokedCallback = this.f3465d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z10 && !this.f3467f) {
                k.f(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f3467f = true;
            } else if (!z10 && this.f3467f) {
                k.g(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f3467f = false;
            }
        }
    }

    public final void f() {
        boolean z10 = this.f3468g;
        boolean z11 = false;
        ie.h hVar = this.f3463b;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((f0) it.next()).f3432a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f3468g = z11;
        if (z11 != z10 && Build.VERSION.SDK_INT >= 33) {
            e(z11);
        }
    }
}
