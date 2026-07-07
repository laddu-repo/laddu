package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends w1 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ View H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.H = actionMenuItemView;
    }

    @Override // p.w1
    public final b0 b() {
        p.f fVar;
        switch (this.G) {
            case 0:
                c cVar = ((ActionMenuItemView) this.H).J;
                if (cVar != null && (fVar = ((p.g) cVar).f10243a.Q) != null) {
                    return fVar.a();
                }
                return null;
            default:
                p.f fVar2 = ((p.i) this.H).A.P;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    @Override // p.w1
    public final boolean c() {
        b0 b10;
        switch (this.G) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.H;
                k kVar = actionMenuItemView.H;
                if (kVar != null && kVar.c(actionMenuItemView.E) && (b10 = b()) != null && b10.a()) {
                    return true;
                }
                return false;
            default:
                ((p.i) this.H).A.l();
                return true;
        }
    }

    @Override // p.w1
    public boolean d() {
        switch (this.G) {
            case 1:
                p.j jVar = ((p.i) this.H).A;
                if (jVar.R != null) {
                    return false;
                }
                jVar.b();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p.i iVar, p.i iVar2) {
        super(iVar2);
        this.H = iVar;
    }
}
