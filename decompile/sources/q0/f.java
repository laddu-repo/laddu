package q0;

import j1.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements s0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10810b;

    public /* synthetic */ f(Object obj, int i6) {
        this.f10809a = i6;
        this.f10810b = obj;
    }

    @Override // s0.a
    public final void accept(Object obj) {
        switch (this.f10809a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((f0) this.f10810b).Y(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f10815c) {
                    try {
                        v.l lVar = h.f10816d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f10810b);
                        if (arrayList != null) {
                            lVar.remove((String) this.f10810b);
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                ((s0.a) arrayList.get(i6)).accept(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
