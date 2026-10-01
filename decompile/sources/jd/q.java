package jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: x, reason: collision with root package name */
    public static final q f7399x;

    /* renamed from: y, reason: collision with root package name */
    public static final q f7400y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ q[] f7401z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jd.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jd.q] */
    static {
        ?? r02 = new Enum("JSON", 0);
        f7399x = r02;
        ?? r12 = new Enum("TEXT", 1);
        f7400y = r12;
        f7401z = new q[]{r02, r12};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f7401z.clone();
    }
}
