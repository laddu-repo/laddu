package k1;

import android.util.Log;
import j1.p0;
import j1.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7583a = b.f7582a;

    public static b a(y yVar) {
        while (yVar != null) {
            if (yVar.m()) {
                yVar.g();
            }
            yVar = yVar.V;
        }
        return f7583a;
    }

    public static void b(a aVar) {
        if (p0.L(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f7581x.getClass().getName()), aVar);
        }
    }

    public static final void c(y fragment, String previousFragmentId) {
        k.e(fragment, "fragment");
        k.e(previousFragmentId, "previousFragmentId");
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }
}
