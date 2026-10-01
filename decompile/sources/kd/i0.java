package kd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 {
    public static final i0 A;
    public static final i0 B;
    public static final /* synthetic */ i0[] C;

    /* renamed from: x, reason: collision with root package name */
    public static final i0 f7865x;

    /* renamed from: y, reason: collision with root package name */
    public static final i0 f7866y;

    /* renamed from: z, reason: collision with root package name */
    public static final i0 f7867z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kd.i0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kd.i0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, kd.i0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, kd.i0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, kd.i0] */
    static {
        ?? r02 = new Enum("HEADER", 0);
        f7865x = r02;
        ?? r12 = new Enum("NORMAL", 1);
        f7866y = r12;
        ?? r32 = new Enum("SWITCH", 2);
        f7867z = r32;
        ?? r52 = new Enum("EXTERNAL", 3);
        A = r52;
        ?? r72 = new Enum("EXIT", 4);
        B = r72;
        C = new i0[]{r02, r12, r32, r52, r72};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) C.clone();
    }
}
