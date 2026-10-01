package w4;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f14003a;

    public s(u uVar) {
        this.f14003a = uVar;
    }

    @Override // w4.v0
    public final void b(RecyclerView recyclerView, int i6, int i10) {
        boolean z10;
        boolean z11;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        u uVar = this.f14003a;
        int i11 = uVar.f14024a;
        int computeVerticalScrollRange = uVar.s.computeVerticalScrollRange();
        int i12 = uVar.f14040r;
        if (computeVerticalScrollRange - i12 > 0 && i12 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        uVar.f14041t = z10;
        int computeHorizontalScrollRange = uVar.s.computeHorizontalScrollRange();
        int i13 = uVar.f14039q;
        if (computeHorizontalScrollRange - i13 > 0 && i13 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        uVar.f14042u = z11;
        boolean z12 = uVar.f14041t;
        if (!z12 && !z11) {
            if (uVar.f14043v != 0) {
                uVar.g(0);
                return;
            }
            return;
        }
        if (z12) {
            float f3 = i12;
            uVar.f14034l = (int) ((((f3 / 2.0f) + computeVerticalScrollOffset) * f3) / computeVerticalScrollRange);
            uVar.f14033k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (uVar.f14042u) {
            float f10 = computeHorizontalScrollOffset;
            float f11 = i13;
            uVar.f14037o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
            uVar.f14036n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = uVar.f14043v;
        if (i14 != 0 && i14 != 1) {
            return;
        }
        uVar.g(1);
    }
}
