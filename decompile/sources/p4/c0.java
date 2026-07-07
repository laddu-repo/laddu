package p4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c0 f10289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c0 f10290w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c0[] f10291x;

    static {
        c0 c0Var = new c0("DEFERRED", 0);
        f10289v = c0Var;
        c0 c0Var2 = new c0("IMMEDIATE", 1);
        f10290w = c0Var2;
        f10291x = new c0[]{c0Var, c0Var2, new c0("EXCLUSIVE", 2)};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f10291x.clone();
    }
}
