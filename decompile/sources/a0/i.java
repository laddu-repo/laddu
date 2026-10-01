package a0;

import b0.n;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f112q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f113r0 = 0;

    public final void R(int i6, n nVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f113r0; i10++) {
            d dVar = this.f112q0[i10];
            ArrayList arrayList2 = nVar.f1255a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f113r0; i11++) {
            b0.h.b(this.f112q0[i11], i6, arrayList, nVar);
        }
    }

    public void S() {
    }
}
