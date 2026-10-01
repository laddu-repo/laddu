package i4;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final p1 f6502e;

    /* renamed from: f, reason: collision with root package name */
    public static final r1.q0 f6503f;

    /* renamed from: a, reason: collision with root package name */
    public final p1 f6504a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.q0 f6505b;

    /* renamed from: c, reason: collision with root package name */
    public final db.k0 f6506c;

    /* renamed from: d, reason: collision with root package name */
    public final db.k0 f6507d;

    static {
        HashSet hashSet = new HashSet();
        db.c1 c1Var = o1.f6487d;
        for (int i6 = 0; i6 < c1Var.A; i6++) {
            hashSet.add(new o1(((Integer) c1Var.get(i6)).intValue()));
        }
        f6502e = new p1(hashSet);
        HashSet hashSet2 = new HashSet();
        db.c1 c1Var2 = o1.f6488e;
        for (int i10 = 0; i10 < c1Var2.A; i10++) {
            hashSet2.add(new o1(((Integer) c1Var2.get(i10)).intValue()));
        }
        for (int i11 = 0; i11 < c1Var.A; i11++) {
            hashSet2.add(new o1(((Integer) c1Var.get(i11)).intValue()));
        }
        new p1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i12 : r1.p0.f11624b) {
            u1.c.g(!false);
            sparseBooleanArray.append(i12, true);
        }
        u1.c.g(!false);
        f6503f = new r1.q0(new r1.o(sparseBooleanArray));
    }

    public q(p1 p1Var, r1.q0 q0Var, db.k0 k0Var, db.k0 k0Var2) {
        this.f6504a = p1Var;
        this.f6505b = q0Var;
        this.f6506c = k0Var;
        this.f6507d = k0Var2;
    }
}
