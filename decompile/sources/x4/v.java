package x4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v {
    public static final /* synthetic */ v[] A;

    /* renamed from: x, reason: collision with root package name */
    public static final v f14658x;

    /* renamed from: y, reason: collision with root package name */
    public static final v f14659y;

    /* renamed from: z, reason: collision with root package name */
    public static final v f14660z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x4.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x4.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [x4.v, java.lang.Enum] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f14658x = r02;
        ?? r12 = new Enum("TRUNCATE", 1);
        f14659y = r12;
        ?? r32 = new Enum("WRITE_AHEAD_LOGGING", 2);
        f14660z = r32;
        A = new v[]{r02, r12, r32};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) A.clone();
    }
}
