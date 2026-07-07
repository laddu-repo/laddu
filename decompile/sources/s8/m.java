package s8;

import android.os.Bundle;
import android.util.Log;
import c2.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f12253a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.h f12254b = new s9.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f12255c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f12256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12257e;

    public m(int i6, int i10, Bundle bundle, int i11) {
        this.f12257e = i11;
        this.f12253a = i6;
        this.f12255c = i10;
        this.f12256d = bundle;
    }

    public final boolean a() {
        switch (this.f12257e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + rVar.toString());
        }
        this.f12254b.f12263a.l(rVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f12254b.a(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f12255c + " id=" + this.f12253a + " oneWay=" + a() + "}";
    }
}
