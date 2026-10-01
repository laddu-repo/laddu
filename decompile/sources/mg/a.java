package mg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {
    public static final a A;
    public static final a B;
    public static final /* synthetic */ a[] C;

    /* renamed from: x, reason: collision with root package name */
    public static final a f8887x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f8888y;

    /* renamed from: z, reason: collision with root package name */
    public static final a f8889z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mg.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mg.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, mg.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, mg.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, mg.a] */
    static {
        ?? r02 = new Enum("DEBUG", 0);
        f8887x = r02;
        ?? r12 = new Enum("INFO", 1);
        f8888y = r12;
        ?? r32 = new Enum("WARNING", 2);
        f8889z = r32;
        ?? r52 = new Enum("ERROR", 3);
        A = r52;
        ?? r72 = new Enum("NONE", 4);
        B = r72;
        C = new a[]{r02, r12, r32, r52, r72};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) C.clone();
    }
}
