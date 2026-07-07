package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f5678a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [hf.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [gf.g0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [gf.k0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [gf.g0] */
    static {
        String str;
        boolean z10;
        ?? r02;
        int i6 = mf.w.f8879a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z11 = false;
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (!z10) {
            r02 = g0.F;
        } else {
            of.e eVar = o0.f5693a;
            r02 = mf.o.f8875a;
            hf.d dVar = r02.A;
            if (r02 != 0) {
                z11 = true;
            }
            if (!z11) {
                r02 = g0.F;
            }
        }
        f5678a = r02;
    }
}
