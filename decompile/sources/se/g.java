package se;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: x, reason: collision with root package name */
    public static final g f12304x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g[] f12305y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, se.g] */
    static {
        ?? r02 = new Enum("TOP_DOWN", 0);
        f12304x = r02;
        f12305y = new g[]{r02, new Enum("BOTTOM_UP", 1)};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f12305y.clone();
    }
}
