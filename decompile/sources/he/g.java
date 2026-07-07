package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ g[] A;

    /* renamed from: x, reason: collision with root package name */
    public static final g f6073x;

    /* renamed from: y, reason: collision with root package name */
    public static final g f6074y;

    /* renamed from: z, reason: collision with root package name */
    public static final g f6075z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, he.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, he.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, he.g] */
    static {
        ?? r02 = new Enum("SYNCHRONIZED", 0);
        f6073x = r02;
        ?? r12 = new Enum("PUBLICATION", 1);
        f6074y = r12;
        ?? r32 = new Enum("NONE", 2);
        f6075z = r32;
        A = new g[]{r02, r12, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) A.clone();
    }
}
