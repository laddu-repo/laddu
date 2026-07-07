package x4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: x, reason: collision with root package name */
    public static final f0 f14568x;

    /* renamed from: y, reason: collision with root package name */
    public static final f0 f14569y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f0[] f14570z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x4.f0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x4.f0] */
    static {
        ?? r02 = new Enum("DEFERRED", 0);
        f14568x = r02;
        ?? r12 = new Enum("IMMEDIATE", 1);
        f14569y = r12;
        f14570z = new f0[]{r02, r12, new Enum("EXCLUSIVE", 2)};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f14570z.clone();
    }
}
