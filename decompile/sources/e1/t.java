package e1;

import android.util.SparseArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f4189a;

    /* renamed from: b, reason: collision with root package name */
    public w f4190b;

    public t(int i6) {
        this.f4189a = new SparseArray(i6);
    }

    public final void a(w wVar, int i6, int i10) {
        t tVar;
        int a10 = wVar.a(i6);
        SparseArray sparseArray = this.f4189a;
        if (sparseArray == null) {
            tVar = null;
        } else {
            tVar = (t) sparseArray.get(a10);
        }
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(wVar.a(i6), tVar);
        }
        if (i10 > i6) {
            tVar.a(wVar, i6 + 1, i10);
        } else {
            tVar.f4190b = wVar;
        }
    }
}
