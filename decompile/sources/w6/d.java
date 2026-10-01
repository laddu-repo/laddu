package w6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: x, reason: collision with root package name */
    public static final d f14126x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f14127y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ d[] f14128z;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [w6.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [w6.d, java.lang.Enum] */
    static {
        Enum r02 = new Enum("EXACT", 0);
        ?? r12 = new Enum("INEXACT", 1);
        f14126x = r12;
        ?? r32 = new Enum("AUTOMATIC", 2);
        f14127y = r32;
        f14128z = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14128z.clone();
    }
}
