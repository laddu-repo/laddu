package j6;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import bf.o;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final Handler f7235c = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final l f7236a;

    /* renamed from: b, reason: collision with root package name */
    public r5.a f7237b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(ve.l lVar) {
        this.f7236a = (l) lVar;
    }

    public void b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f7237b = null;
            return;
        }
        throw new IllegalStateException("The method must be called on the main thread");
    }

    public abstract f0 c(Object obj);

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.l, ve.l] */
    @Override // j6.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r5.a a(Object obj, o property) {
        k.e(property, "property");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r5.a aVar = this.f7237b;
            if (aVar != null) {
                return aVar;
            }
            if (e(obj)) {
                y lifecycle = c(obj).getLifecycle();
                k.d(lifecycle, "getLifecycleOwner(thisRef).lifecycle");
                x b10 = lifecycle.b();
                x xVar = x.f991x;
                if (b10 != xVar) {
                    y lifecycle2 = c(obj).getLifecycle();
                    k.d(lifecycle2, "getLifecycleOwner(thisRef).lifecycle");
                    x b11 = lifecycle2.b();
                    ?? r32 = this.f7236a;
                    if (b11 == xVar) {
                        this.f7237b = null;
                        Log.w("ViewBindingProperty", "Accessing viewBinding after Lifecycle is destroyed or hasn't been created yet. The instance of viewBinding isn't cached.");
                        return (r5.a) r32.invoke(obj);
                    }
                    r5.a aVar2 = (r5.a) r32.invoke(obj);
                    lifecycle2.a(new a7.c(this, 2));
                    this.f7237b = aVar2;
                    return aVar2;
                }
                throw new IllegalStateException("Accessing viewBinding after Lifecycle is destroyed or hasn't been created yet. The instance of viewBinding isn't cached.");
            }
            throw new IllegalStateException(f(obj).toString());
        }
        throw new IllegalStateException("The method must be called on the main thread. Reason: access to ViewBinding from non UI (Main) thread.");
    }

    public abstract boolean e(Object obj);

    public String f(Object obj) {
        return "Host view isn't ready. LifecycleViewBindingProperty.isViewInitialized return false";
    }
}
