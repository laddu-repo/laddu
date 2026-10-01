package mf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.l implements ve.p {
    public static final x A;

    /* renamed from: y, reason: collision with root package name */
    public static final x f8880y;

    /* renamed from: z, reason: collision with root package name */
    public static final x f8881z;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8882x;

    static {
        int i6 = 2;
        f8880y = new x(i6, 0);
        f8881z = new x(i6, 1);
        A = new x(i6, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i6, int i10) {
        super(i6);
        this.f8882x = i10;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i6;
        switch (this.f8882x) {
            case 0:
                le.f fVar = (le.f) obj2;
                if (fVar instanceof y) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i6 = num.intValue();
                    } else {
                        i6 = 1;
                    }
                    if (i6 == 0) {
                        return fVar;
                    }
                    return Integer.valueOf(i6 + 1);
                }
                return obj;
            case 1:
                y yVar = (y) obj;
                le.f fVar2 = (le.f) obj2;
                if (yVar == null) {
                    if (fVar2 instanceof y) {
                        return (y) fVar2;
                    }
                    return null;
                }
                return yVar;
            default:
                b0 b0Var = (b0) obj;
                le.f fVar3 = (le.f) obj2;
                if (fVar3 instanceof y) {
                    y yVar2 = (y) fVar3;
                    Object b10 = yVar2.b(b0Var.f8851a);
                    Object[] objArr = b0Var.f8852b;
                    int i10 = b0Var.f8854d;
                    objArr[i10] = b10;
                    y[] yVarArr = b0Var.f8853c;
                    b0Var.f8854d = i10 + 1;
                    yVarArr[i10] = yVar2;
                }
                return b0Var;
        }
    }
}
