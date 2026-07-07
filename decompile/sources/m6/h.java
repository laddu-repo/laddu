package m6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {
    public static final h A;
    public static final /* synthetic */ h[] B;

    /* renamed from: x, reason: collision with root package name */
    public static final h f8661x;

    /* renamed from: y, reason: collision with root package name */
    public static final h f8662y;

    /* renamed from: z, reason: collision with root package name */
    public static final h f8663z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m6.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m6.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [m6.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [m6.h, java.lang.Enum] */
    static {
        ?? r02 = new Enum("MEMORY_CACHE", 0);
        f8661x = r02;
        ?? r12 = new Enum("MEMORY", 1);
        f8662y = r12;
        ?? r32 = new Enum("DISK", 2);
        f8663z = r32;
        ?? r52 = new Enum("NETWORK", 3);
        A = r52;
        B = new h[]{r02, r12, r32, r52};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) B.clone();
    }
}
