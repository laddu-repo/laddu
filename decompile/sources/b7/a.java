package b7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f1481x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f1482y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a[] f1483z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b7.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b7.a] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f1481x = r02;
        ?? r12 = new Enum("ENABLED", 1);
        f1482y = r12;
        f1483z = new a[]{r02, r12, new Enum("DISABLED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1483z.clone();
    }
}
