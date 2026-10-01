package r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a[] A;

    /* renamed from: x, reason: collision with root package name */
    public static final a f11840x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f11841y;

    /* renamed from: z, reason: collision with root package name */
    public static final a f11842z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r7.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r7.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, r7.a] */
    static {
        ?? r02 = new Enum("READ", 0);
        f11840x = r02;
        ?? r12 = new Enum("WRITE", 1);
        f11841y = r12;
        Enum r32 = new Enum("READ_THEN_REQUEST", 2);
        ?? r52 = new Enum("REQUEST_THEN_READ", 3);
        f11842z = r52;
        A = new a[]{r02, r12, r32, r52};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) A.clone();
    }
}
