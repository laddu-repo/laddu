package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ oe.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final u Companion;
    public static final w ON_ANY;
    public static final w ON_CREATE;
    public static final w ON_DESTROY;
    public static final w ON_PAUSE;
    public static final w ON_RESUME;
    public static final w ON_START;
    public static final w ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.lifecycle.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.lifecycle.w, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r32 = new Enum("ON_RESUME", 2);
        ON_RESUME = r32;
        ?? r52 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r52;
        ?? r72 = new Enum("ON_STOP", 4);
        ON_STOP = r72;
        ?? r92 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r92;
        ?? r11 = new Enum("ON_ANY", 6);
        ON_ANY = r11;
        w[] wVarArr = {r02, r12, r32, r52, r72, r92, r11};
        $VALUES = wVarArr;
        $ENTRIES = new oe.b(wVarArr);
        Companion = new Object();
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final x a() {
        switch (v.f987a[ordinal()]) {
            case 1:
            case 2:
                return x.f993z;
            case 3:
            case 4:
                return x.A;
            case 5:
                return x.B;
            case 6:
                return x.f991x;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new RuntimeException();
        }
    }
}
