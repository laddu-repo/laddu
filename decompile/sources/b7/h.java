package b7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {
    public static final h A;
    public static final h B;
    public static final h C;
    public static final /* synthetic */ h[] D;

    /* renamed from: x, reason: collision with root package name */
    public static final h f1533x;

    /* renamed from: y, reason: collision with root package name */
    public static final h f1534y;

    /* renamed from: z, reason: collision with root package name */
    public static final h f1535z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [b7.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [b7.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b7.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b7.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [b7.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [b7.h, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SET_ANIMATION", 0);
        f1533x = r02;
        ?? r12 = new Enum("SET_PROGRESS", 1);
        f1534y = r12;
        ?? r32 = new Enum("SET_REPEAT_MODE", 2);
        f1535z = r32;
        ?? r52 = new Enum("SET_REPEAT_COUNT", 3);
        A = r52;
        ?? r72 = new Enum("SET_IMAGE_ASSETS", 4);
        B = r72;
        ?? r92 = new Enum("PLAY_OPTION", 5);
        C = r92;
        D = new h[]{r02, r12, r32, r52, r72, r92};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) D.clone();
    }
}
