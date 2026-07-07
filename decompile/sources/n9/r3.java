package n9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r3 {

    /* renamed from: x, reason: collision with root package name */
    public static final r3 f9456x;

    /* renamed from: y, reason: collision with root package name */
    public static final r3 f9457y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ r3[] f9458z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n9.r3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, n9.r3] */
    static {
        ?? r02 = new Enum("CONSENT", 0);
        f9456x = r02;
        Enum r12 = new Enum("LEGITIMATE_INTEREST", 1);
        Enum r32 = new Enum("FLEXIBLE_CONSENT", 2);
        ?? r52 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f9457y = r52;
        f9458z = new r3[]{r02, r12, r32, r52};
    }

    public static r3[] values() {
        return (r3[]) f9458z.clone();
    }
}
