package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.l implements ve.p {

    /* renamed from: y, reason: collision with root package name */
    public static final v f5715y;

    /* renamed from: z, reason: collision with root package name */
    public static final v f5716z;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5717x;

    static {
        int i6 = 2;
        f5715y = new v(i6, 0);
        f5716z = new v(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i6, int i10) {
        super(i6);
        this.f5717x = i10;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5717x) {
            case 0:
                return ((le.h) obj).plus((le.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((le.h) obj).plus((le.f) obj2);
        }
    }
}
