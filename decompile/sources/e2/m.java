package e2;

import db.k0;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m {
    public final List A;
    public final List B;
    public final List C;
    public final j D;

    /* renamed from: x, reason: collision with root package name */
    public final r1.q f4257x;

    /* renamed from: y, reason: collision with root package name */
    public final k0 f4258y;

    /* renamed from: z, reason: collision with root package name */
    public final long f4259z;

    public m(r1.q qVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        u1.c.b(!list.isEmpty());
        this.f4257x = qVar;
        this.f4258y = k0.k(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.A = unmodifiableList;
        this.B = list3;
        this.C = list4;
        this.D = sVar.a(this);
        long j = sVar.f4274c;
        long j10 = sVar.f4273b;
        String str = a0.f12750a;
        this.f4259z = a0.Y(j, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract d2.h d();

    public abstract j e();
}
