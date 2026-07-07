package jg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: x, reason: collision with root package name */
    public static final b f7488x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f7489y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ b[] f7490z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [jg.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jg.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Singleton", 0);
        f7488x = r02;
        ?? r12 = new Enum("Factory", 1);
        f7489y = r12;
        f7490z = new b[]{r02, r12, new Enum("Scoped", 2)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7490z.clone();
    }
}
