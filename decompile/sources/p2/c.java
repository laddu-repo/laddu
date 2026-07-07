package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r1.q;
import r1.x0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10475b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10476c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10477d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10478e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f10479f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10480g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10481h;

    public c(int i6, int i10, long j, long j10, int i11, boolean z10, a aVar, b[] bVarArr) {
        this.f10474a = i6;
        this.f10475b = i10;
        this.f10480g = j;
        this.f10481h = j10;
        this.f10476c = i11;
        this.f10477d = z10;
        this.f10478e = aVar;
        this.f10479f = bVarArr;
    }

    @Override // l2.a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            x0 x0Var = (x0) arrayList.get(i6);
            b bVar2 = this.f10479f[x0Var.f11742y];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((q[]) arrayList3.toArray(new q[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[x0Var.f11743z]);
            i6++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((q[]) arrayList3.toArray(new q[0])));
        }
        b[] bVarArr = (b[]) arrayList2.toArray(new b[0]);
        return new c(this.f10474a, this.f10475b, this.f10480g, this.f10481h, this.f10476c, this.f10477d, this.f10478e, bVarArr);
    }
}
