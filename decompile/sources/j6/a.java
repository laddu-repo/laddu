package j6;

import androidx.lifecycle.f0;
import d.q;
import j1.r;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7230d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7231e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(boolean z10, l lVar, int i6) {
        super(lVar);
        this.f7230d = i6;
        this.f7231e = z10;
    }

    @Override // j6.c
    public final f0 c(Object obj) {
        switch (this.f7230d) {
            case 0:
                return (q) obj;
            default:
                r rVar = (r) obj;
                if (rVar.f7024g0 != null) {
                    try {
                        return rVar.j();
                    } catch (IllegalStateException unused) {
                        throw new IllegalStateException("Fragment doesn't have a view associated with it or the view has been destroyed");
                    }
                }
                return rVar;
        }
    }

    @Override // j6.c
    public final boolean e(Object obj) {
        switch (this.f7230d) {
            case 0:
                q qVar = (q) obj;
                if (this.f7231e && qVar.getWindow() == null) {
                    return false;
                }
                return true;
            default:
                r rVar = (r) obj;
                if (!this.f7231e || (!rVar.G0 ? rVar.f7024g0 != null : rVar.K0 != null)) {
                    return true;
                }
                return false;
        }
    }
}
