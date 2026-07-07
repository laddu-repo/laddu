package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 implements e5.d {

    /* renamed from: a, reason: collision with root package name */
    public final e5.e f908a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f909b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f910c;

    /* renamed from: d, reason: collision with root package name */
    public final he.m f911d;

    public e1(e5.e savedStateRegistry, q1 q1Var) {
        kotlin.jvm.internal.k.e(savedStateRegistry, "savedStateRegistry");
        this.f908a = savedStateRegistry;
        this.f911d = he.a.d(new i(q1Var, 1));
    }

    @Override // e5.d
    public final Bundle a() {
        Bundle b10 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
        Bundle bundle = this.f910c;
        if (bundle != null) {
            b10.putAll(bundle);
        }
        for (Map.Entry entry : ((f1) this.f911d.getValue()).f914b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((d.i) ((a1) entry.getValue()).f883b.f1470y).a();
            if (!a10.isEmpty()) {
                c9.a.m(b10, str, a10);
            }
        }
        this.f909b = false;
        return b10;
    }

    public final void b() {
        if (!this.f909b) {
            Bundle a10 = this.f908a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle b10 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
            Bundle bundle = this.f910c;
            if (bundle != null) {
                b10.putAll(bundle);
            }
            if (a10 != null) {
                b10.putAll(a10);
            }
            this.f910c = b10;
            this.f909b = true;
        }
    }
}
