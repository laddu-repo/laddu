package f5;

import android.util.Log;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.w;
import ie.j;
import j1.y;
import java.util.ArrayList;
import kf.f1;
import kotlin.jvm.internal.k;
import l4.h;
import n4.f;
import o4.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5016x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5017y;

    public /* synthetic */ a(Object obj, int i6) {
        this.f5016x = i6;
        this.f5017y = obj;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(f0 f0Var, w wVar) {
        switch (this.f5016x) {
            case 0:
                b bVar = (b) this.f5017y;
                if (wVar == w.ON_START) {
                    bVar.f5020c = true;
                    return;
                } else {
                    if (wVar == w.ON_STOP) {
                        bVar.f5020c = false;
                        return;
                    }
                    return;
                }
            case 1:
                f fVar = (f) this.f5017y;
                if (wVar == w.ON_DESTROY) {
                    y yVar = (y) f0Var;
                    Object obj = null;
                    for (Object obj2 : (Iterable) ((f1) fVar.b().f8153f.f8014x).getValue()) {
                        if (k.a(((h) obj2).C, yVar.Y)) {
                            obj = obj2;
                        }
                    }
                    h hVar = (h) obj;
                    if (hVar != null) {
                        if (f.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + hVar + " due to fragment " + f0Var + " lifecycle reaching DESTROYED");
                        }
                        fVar.b().c(hVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                o4.h hVar2 = (o4.h) this.f5017y;
                hVar2.f9913p = wVar.a();
                if (hVar2.f9901c != null) {
                    ArrayList a02 = j.a0(hVar2.f9904f);
                    int size = a02.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj3 = a02.get(i6);
                        i6++;
                        h hVar3 = (h) obj3;
                        hVar3.getClass();
                        c cVar = hVar3.E;
                        cVar.getClass();
                        cVar.f9876a.A = wVar.a();
                        cVar.f9879d = wVar.a();
                        cVar.b();
                    }
                    return;
                }
                return;
        }
    }
}
