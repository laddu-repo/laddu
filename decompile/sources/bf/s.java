package bf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: x, reason: collision with root package name */
    public static final s f1671x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ s[] f1672y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bf.s] */
    static {
        ?? r02 = new Enum("INVARIANT", 0);
        f1671x = r02;
        f1672y = new s[]{r02, new Enum("IN", 1), new Enum("OUT", 2)};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f1672y.clone();
    }
}
