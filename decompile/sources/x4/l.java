package x4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {
    public static final /* synthetic */ l[] A;

    /* renamed from: x, reason: collision with root package name */
    public static final l f14597x;

    /* renamed from: y, reason: collision with root package name */
    public static final l f14598y;

    /* renamed from: z, reason: collision with root package name */
    public static final l f14599z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x4.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x4.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, x4.l] */
    static {
        ?? r02 = new Enum("NO_OP", 0);
        f14597x = r02;
        ?? r12 = new Enum("ADD", 1);
        f14598y = r12;
        ?? r32 = new Enum("REMOVE", 2);
        f14599z = r32;
        A = new l[]{r02, r12, r32};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) A.clone();
    }
}
