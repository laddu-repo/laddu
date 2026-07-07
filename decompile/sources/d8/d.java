package d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ d[] A;

    /* renamed from: x, reason: collision with root package name */
    public static final d f3973x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f3974y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f3975z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d8.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d8.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, d8.d] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f3973x = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f3974y = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f3975z = r32;
        A = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) A.clone();
    }
}
