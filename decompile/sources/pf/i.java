package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {
    public static final i A;
    public static final /* synthetic */ i[] B;

    /* renamed from: x, reason: collision with root package name */
    public static final i f10779x;

    /* renamed from: y, reason: collision with root package name */
    public static final i f10780y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f10781z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pf.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pf.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, pf.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, pf.i] */
    static {
        ?? r02 = new Enum("SUCCESSFUL", 0);
        f10779x = r02;
        ?? r12 = new Enum("REREGISTER", 1);
        f10780y = r12;
        ?? r32 = new Enum("CANCELLED", 2);
        f10781z = r32;
        ?? r52 = new Enum("ALREADY_SELECTED", 3);
        A = r52;
        B = new i[]{r02, r12, r32, r52};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) B.clone();
    }
}
