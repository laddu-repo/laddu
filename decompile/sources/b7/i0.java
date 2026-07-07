package b7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 {
    public static final /* synthetic */ i0[] A;

    /* renamed from: x, reason: collision with root package name */
    public static final i0 f1539x;

    /* renamed from: y, reason: collision with root package name */
    public static final i0 f1540y;

    /* renamed from: z, reason: collision with root package name */
    public static final i0 f1541z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b7.i0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b7.i0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, b7.i0] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f1539x = r02;
        ?? r12 = new Enum("HARDWARE", 1);
        f1540y = r12;
        ?? r32 = new Enum("SOFTWARE", 2);
        f1541z = r32;
        A = new i0[]{r02, r12, r32};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) A.clone();
    }
}
