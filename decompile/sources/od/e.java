package od;

import java.util.Date;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f10075x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f10076y;

    public e(j jVar, long j) {
        this.f10075x = jVar;
        this.f10076y = j;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        int i6;
        kd.u channel = (kd.u) obj;
        kotlin.jvm.internal.k.e(channel, "channel");
        kd.a0 a0Var = channel.C;
        j jVar = this.f10075x;
        Date parse = jVar.i().parse(a0Var.C);
        kotlin.jvm.internal.k.b(parse);
        Date parse2 = jVar.i().parse(a0Var.D);
        kotlin.jvm.internal.k.b(parse2);
        long time = parse.getTime();
        long time2 = parse2.getTime();
        long j = this.f10076y;
        if (j <= time2 && time <= j) {
            i6 = 2;
        } else if (j < parse.getTime()) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        return new he.i(channel, new a(Integer.valueOf(a0Var.E), Integer.valueOf(i6), Long.valueOf(parse.getTime() - j), parse));
    }
}
