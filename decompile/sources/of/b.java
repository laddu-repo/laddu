package of;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {
    public static final b A;
    public static final b B;
    public static final /* synthetic */ b[] C;

    /* renamed from: x, reason: collision with root package name */
    public static final b f10168x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f10169y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f10170z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, of.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, of.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, of.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, of.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, of.b] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f10168x = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f10169y = r12;
        ?? r32 = new Enum("PARKING", 2);
        f10170z = r32;
        ?? r52 = new Enum("DORMANT", 3);
        A = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        B = r72;
        C = new b[]{r02, r12, r32, r52, r72};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) C.clone();
    }
}
