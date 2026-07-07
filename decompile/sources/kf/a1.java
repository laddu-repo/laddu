package kf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: x, reason: collision with root package name */
    public static final a1 f7917x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a1[] f7918y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kf.a1, java.lang.Enum] */
    static {
        ?? r02 = new Enum("START", 0);
        f7917x = r02;
        f7918y = new a1[]{r02, new Enum("STOP", 1), new Enum("STOP_AND_RESET_REPLAY_CACHE", 2)};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f7918y.clone();
    }
}
