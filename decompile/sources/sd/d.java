package sd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {
    public static final d A;
    public static final /* synthetic */ d[] B;

    /* renamed from: x, reason: collision with root package name */
    public static final d f12292x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f12293y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f12294z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [sd.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sd.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [sd.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [sd.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNSPECIFIED", 0);
        f12292x = r02;
        ?? r12 = new Enum("INTERSTITIAL", 1);
        f12293y = r12;
        ?? r32 = new Enum("REWARDED", 2);
        f12294z = r32;
        ?? r52 = new Enum("BANNER", 3);
        A = r52;
        B = new d[]{r02, r12, r32, r52};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) B.clone();
    }
}
