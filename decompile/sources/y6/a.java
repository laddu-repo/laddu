package y6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f15003x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f15004y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a[] f15005z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y6.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, y6.a] */
    static {
        ?? r02 = new Enum("UNCHANGED", 0);
        f15003x = r02;
        Enum r12 = new Enum("TRANSLUCENT", 1);
        ?? r32 = new Enum("OPAQUE", 2);
        f15004y = r32;
        f15005z = new a[]{r02, r12, r32};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15005z.clone();
    }
}
