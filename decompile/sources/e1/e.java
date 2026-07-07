package e1;

import android.os.Build;
import androidx.lifecycle.j1;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends a8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f4153a;

    public e(f fVar) {
        this.f4153a = fVar;
    }

    @Override // a8.e
    public final void v(Throwable th) {
        this.f4153a.f4154a.d(th);
    }

    @Override // a8.e
    public final void w(ic.s sVar) {
        Set<int[]> P;
        f fVar = this.f4153a;
        fVar.f4156c = sVar;
        ic.s sVar2 = fVar.f4156c;
        k kVar = fVar.f4154a;
        ua.f fVar2 = kVar.f4167g;
        d dVar = kVar.f4169i;
        if (Build.VERSION.SDK_INT >= 34) {
            P = n.a();
        } else {
            P = a8.f.P();
        }
        fVar.f4155b = new j1(sVar2, fVar2, dVar, P);
        k kVar2 = fVar.f4154a;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.f4161a.writeLock().lock();
        try {
            kVar2.f4163c = 1;
            arrayList.addAll(kVar2.f4162b);
            kVar2.f4162b.clear();
            kVar2.f4161a.writeLock().unlock();
            kVar2.f4164d.post(new com.google.android.material.datepicker.g(arrayList, kVar2.f4163c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.f4161a.writeLock().unlock();
            throw th;
        }
    }
}
