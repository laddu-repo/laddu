package f8;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: x, reason: collision with root package name */
    public static final w f5148x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w[] f5149y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f8.w, java.lang.Object] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5148x = r02;
        Enum r12 = new Enum("UNMETERED_ONLY", 1);
        Enum r32 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r52 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r72 = new Enum("NEVER", 4);
        Enum r92 = new Enum("UNRECOGNIZED", 5);
        f5149y = new w[]{r02, r12, r32, r52, r72, r92};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r32);
        sparseArray.put(3, r52);
        sparseArray.put(4, r72);
        sparseArray.put(-1, r92);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f5149y.clone();
    }
}
