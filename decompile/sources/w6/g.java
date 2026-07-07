package w6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: x, reason: collision with root package name */
    public static final g f14131x;

    /* renamed from: y, reason: collision with root package name */
    public static final g f14132y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ g[] f14133z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w6.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w6.g] */
    static {
        ?? r02 = new Enum("FILL", 0);
        f14131x = r02;
        ?? r12 = new Enum("FIT", 1);
        f14132y = r12;
        f14133z = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14133z.clone();
    }
}
