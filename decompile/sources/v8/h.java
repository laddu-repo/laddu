package v8;

import com.google.android.gms.internal.measurement.h0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f13450a;

    public h(d dVar) {
        this.f13450a = dVar;
    }

    @Override // v8.b
    public final void a(boolean z10) {
        h0 h0Var = this.f13450a.J;
        h0Var.sendMessage(h0Var.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
