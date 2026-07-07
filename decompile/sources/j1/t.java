package j1;

import android.os.Bundle;
import androidx.lifecycle.d1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f6979a;

    public t(y yVar) {
        this.f6979a = yVar;
    }

    @Override // j1.x
    public final void a() {
        Bundle bundle;
        y yVar = this.f6979a;
        yVar.f7036t0.a();
        d1.d(yVar);
        Bundle bundle2 = yVar.f7042y;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        yVar.f7036t0.b(bundle);
    }
}
