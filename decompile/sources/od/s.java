package od;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.j1;
import gf.o0;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kf.f1;
import kf.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends j {

    /* renamed from: g, reason: collision with root package name */
    public final a1 f10143g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f10144h;

    /* renamed from: i, reason: collision with root package name */
    public final f1 f10145i;
    public final androidx.lifecycle.k j;

    public s(a1 savedStateHandle) {
        kotlin.jvm.internal.k.e(savedStateHandle, "savedStateHandle");
        this.f10143g = savedStateHandle;
        this.f10144h = y0.c(0);
        f1 c10 = y0.c(ie.r.f6846x);
        this.f10145i = c10;
        this.j = d1.a(c10);
    }

    public static final boolean k(s sVar, int i6, String str, String str2) {
        Date parse = sVar.i().parse(str);
        Date parse2 = sVar.i().parse(str2);
        if (parse != null && parse2 != null) {
            long time = parse.getTime();
            long time2 = parse2.getTime();
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (i6 == 1 ? !(time > currentTimeMillis || currentTimeMillis > time2) : !(i6 == 2 ? timeInMillis > time2 || time2 > timeInMillis2 || currentTimeMillis <= time2 : i6 != 3 || time <= currentTimeMillis)) {
                return true;
            }
        }
        return false;
    }

    @Override // od.j
    public final kf.h f(j1 j1Var) {
        return new j1(j1Var, this.f10144h, new c(this, (le.c) null));
    }

    @Override // od.j
    public final Object g(List list, kf.n nVar) {
        Object J = gf.f0.J(o0.f5694b, new androidx.lifecycle.z(this, list, null, 8), nVar);
        if (J == me.a.f8833x) {
            return J;
        }
        return he.y.f6101a;
    }

    @Override // od.j
    public final w7.b j(gf.c0 c0Var, r7.a aVar) {
        kotlin.jvm.internal.k.e(c0Var, "<this>");
        return new w7.b(gf.f0.g(c0Var, o0.f5694b.plus(gf.f0.e()), new androidx.lifecycle.z(new r(aVar, 0), null, 9), 2));
    }
}
