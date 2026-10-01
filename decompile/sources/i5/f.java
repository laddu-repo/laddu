package i5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {
    public static final f A;
    public static final f B;
    public static final /* synthetic */ f[] C;

    /* renamed from: x, reason: collision with root package name */
    public static final f f6614x;

    /* renamed from: y, reason: collision with root package name */
    public static final f f6615y;

    /* renamed from: z, reason: collision with root package name */
    public static final f f6616z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i5.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i5.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, i5.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, i5.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, i5.f] */
    static {
        ?? r02 = new Enum("ON_CONFIGURE", 0);
        f6614x = r02;
        ?? r12 = new Enum("ON_CREATE", 1);
        f6615y = r12;
        ?? r32 = new Enum("ON_UPGRADE", 2);
        f6616z = r32;
        ?? r52 = new Enum("ON_DOWNGRADE", 3);
        A = r52;
        ?? r72 = new Enum("ON_OPEN", 4);
        B = r72;
        C = new f[]{r02, r12, r32, r52, r72};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) C.clone();
    }
}
