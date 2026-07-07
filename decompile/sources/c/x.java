package c;

import androidx.fragment.app.i0;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sb.p f1674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f1675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1676e;

    public x(i0 i0Var, y yVar) {
        de.i.e(i0Var, "onBackPressedCallback");
        boolean z2 = i0Var.f1028b;
        this.f1672a = yVar;
        this.f1673b = z2;
        this.f1675d = i0Var;
        this.f1676e = true;
    }

    public final void a() {
        sb.p pVar = this.f1674c;
        if (pVar == null || !((LinkedHashSet) pVar.f11744y).remove(this)) {
            return;
        }
        h4.e eVar = (h4.e) pVar.f11743x;
        eVar.getClass();
        if (equals(eVar.f)) {
            if (eVar.f6133g == -1) {
                this.f1675d.getClass();
            }
            eVar.f = null;
            eVar.f6133g = 0;
            eVar.f6134h = null;
        }
        eVar.f6131d.remove(this);
        eVar.f6132e.remove(this);
        this.f1674c = null;
        eVar.b();
    }

    public final void b(boolean z2) {
        h4.e eVar;
        this.f1676e = z2;
        boolean z10 = z2 && this.f1675d.f1028b;
        if (this.f1673b == z10) {
            return;
        }
        this.f1673b = z10;
        sb.p pVar = this.f1674c;
        if (pVar == null || (eVar = (h4.e) pVar.f11743x) == null) {
            return;
        }
        eVar.b();
    }
}
