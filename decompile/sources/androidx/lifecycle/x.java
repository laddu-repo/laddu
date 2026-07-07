package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {
    public static final x A;
    public static final x B;
    public static final /* synthetic */ x[] C;

    /* renamed from: x, reason: collision with root package name */
    public static final x f991x;

    /* renamed from: y, reason: collision with root package name */
    public static final x f992y;

    /* renamed from: z, reason: collision with root package name */
    public static final x f993z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.x, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f991x = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f992y = r12;
        ?? r32 = new Enum("CREATED", 2);
        f993z = r32;
        ?? r52 = new Enum("STARTED", 3);
        A = r52;
        ?? r72 = new Enum("RESUMED", 4);
        B = r72;
        C = new x[]{r02, r12, r32, r52, r72};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) C.clone();
    }
}
