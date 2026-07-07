package d7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements h7.e {

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f3850x;

    public c() {
        this.f3850x = new ArrayList();
    }

    @Override // h7.e
    public e7.e G0() {
        ArrayList arrayList = this.f3850x;
        if (((o7.a) arrayList.get(0)).c()) {
            return new e7.j(1, arrayList);
        }
        return new e7.m(arrayList);
    }

    @Override // h7.e
    public List Q0() {
        return this.f3850x;
    }

    @Override // h7.e
    public boolean T0() {
        ArrayList arrayList = this.f3850x;
        if (arrayList.size() != 1 || !((o7.a) arrayList.get(0)).c()) {
            return false;
        }
        return true;
    }

    public void a(Path path) {
        ArrayList arrayList = this.f3850x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            Matrix matrix = n7.i.f9124a;
            if (uVar != null && !uVar.f3963a) {
                n7.i.a(path, uVar.f3966d.l() / 100.0f, uVar.f3967e.l() / 100.0f, uVar.f3968f.l() / 360.0f);
            }
        }
    }

    public c(ArrayList arrayList) {
        this.f3850x = arrayList;
    }
}
