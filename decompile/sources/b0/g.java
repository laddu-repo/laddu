package b0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f1247m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f1240e = 2;
        } else {
            this.f1240e = 3;
        }
    }

    @Override // b0.f
    public final void d(int i6) {
        if (!this.j) {
            this.j = true;
            this.f1242g = i6;
            ArrayList arrayList = this.f1245k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }
}
