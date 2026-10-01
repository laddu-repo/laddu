package yf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15060a;

    static {
        Object b10;
        int i6;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                b10 = df.t.w(property);
            } else {
                b10 = null;
            }
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (!(b10 instanceof he.j)) {
            obj = b10;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = 2097152;
        }
        f15060a = i6;
    }
}
