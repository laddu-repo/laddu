package xf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f14720x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f14721y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a[] f14722z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xf.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, xf.a] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f14720x = r02;
        Enum r12 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r32 = new Enum("POLYMORPHIC", 2);
        f14721y = r32;
        f14722z = new a[]{r02, r12, r32};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14722z.clone();
    }
}
