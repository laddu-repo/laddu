package ac;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d1 f342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d1 f343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d1[] f344x;

    static {
        d1 d1Var = new d1("GENERAL", 0);
        f342v = d1Var;
        d1 d1Var2 = new d1("FALLBACK", 1);
        f343w = d1Var2;
        f344x = new d1[]{d1Var, d1Var2};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f344x.clone();
    }
}
