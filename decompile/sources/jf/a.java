package jf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a[] A;

    /* renamed from: x, reason: collision with root package name */
    public static final a f7436x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f7437y;

    /* renamed from: z, reason: collision with root package name */
    public static final a f7438z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jf.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jf.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, jf.a] */
    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f7436x = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f7437y = r12;
        ?? r32 = new Enum("DROP_LATEST", 2);
        f7438z = r32;
        A = new a[]{r02, r12, r32};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) A.clone();
    }
}
