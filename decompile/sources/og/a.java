package og;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f10196x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a[] f10197y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, og.a] */
    static {
        ?? r02 = new Enum("VIEWMODEL_SCOPE_FACTORY", 0);
        f10196x = r02;
        f10197y = new a[]{r02};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10197y.clone();
    }
}
