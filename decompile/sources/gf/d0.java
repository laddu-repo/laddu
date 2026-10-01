package gf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 A;
    public static final /* synthetic */ d0[] B;

    /* renamed from: x, reason: collision with root package name */
    public static final d0 f5655x;

    /* renamed from: y, reason: collision with root package name */
    public static final d0 f5656y;

    /* renamed from: z, reason: collision with root package name */
    public static final d0 f5657z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [gf.d0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gf.d0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gf.d0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [gf.d0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5655x = r02;
        ?? r12 = new Enum("LAZY", 1);
        f5656y = r12;
        ?? r32 = new Enum("ATOMIC", 2);
        f5657z = r32;
        ?? r52 = new Enum("UNDISPATCHED", 3);
        A = r52;
        B = new d0[]{r02, r12, r32, r52};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) B.clone();
    }
}
