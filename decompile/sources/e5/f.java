package e5;

import android.os.Bundle;
import androidx.lifecycle.x;
import he.i;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final f5.b f4356a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4357b;

    public f(f5.b bVar) {
        this.f4356a = bVar;
        this.f4357b = new e(bVar);
    }

    public final void a() {
        this.f4356a.a();
    }

    public final void b(Bundle bundle) {
        f5.b bVar = this.f4356a;
        g gVar = (g) bVar.f5021d;
        if (!bVar.f5018a) {
            bVar.a();
        }
        if (gVar.getLifecycle().b().compareTo(x.A) < 0) {
            if (!bVar.f5019b) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    if (bundle3 != null) {
                        bundle2 = bundle3;
                    } else {
                        android.support.v4.media.session.b.m("androidx.lifecycle.BundlableSavedStateRegistry.key");
                        throw null;
                    }
                }
                bVar.f5025h = bundle2;
                bVar.f5019b = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + gVar.getLifecycle().b()).toString());
    }

    public final void c(Bundle bundle) {
        f5.b bVar = this.f4356a;
        Bundle b10 = k6.e.b((i[]) Arrays.copyOf(new i[0], 0));
        Bundle bundle2 = (Bundle) bVar.f5025h;
        if (bundle2 != null) {
            b10.putAll(bundle2);
        }
        synchronized (((ua.f) bVar.f5023f)) {
            for (Map.Entry entry : ((LinkedHashMap) bVar.f5024g).entrySet()) {
                c9.a.m(b10, (String) entry.getKey(), ((d) entry.getValue()).a());
            }
        }
        if (!b10.isEmpty()) {
            c9.a.m(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", b10);
        }
    }
}
