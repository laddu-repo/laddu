package w4;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l1 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13939a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f13940b;

    public l1(i0 i0Var) {
        this.f13940b = i0Var;
    }

    @Override // w4.v0
    public final void a(RecyclerView recyclerView, int i6) {
        if (i6 == 0 && this.f13939a) {
            this.f13939a = false;
            this.f13940b.f();
        }
    }

    @Override // w4.v0
    public final void b(RecyclerView recyclerView, int i6, int i10) {
        if (i6 == 0 && i10 == 0) {
            return;
        }
        this.f13939a = true;
    }
}
