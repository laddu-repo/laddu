package z6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f14817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ x[] f14818w;

    /* JADX INFO: Fake field, exist only in values array */
    x EF0;

    static {
        x xVar = new x("UNKNOWN", 0);
        x xVar2 = new x("ANDROID_FIREBASE", 1);
        f14817v = xVar2;
        f14818w = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f14818w.clone();
    }
}
