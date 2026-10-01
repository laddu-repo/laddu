package m6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: x, reason: collision with root package name */
    public static final m f8669x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ m[] f8670y;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m6.m] */
    static {
        Enum r02 = new Enum("IGNORE", 0);
        ?? r12 = new Enum("RESPECT_PERFORMANCE", 1);
        f8669x = r12;
        f8670y = new m[]{r02, r12, new Enum("RESPECT_ALL", 2)};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f8670y.clone();
    }
}
