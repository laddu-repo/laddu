package k8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z3 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z3 f7860v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z3 f7861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ z3[] f7862x;

    static {
        z3 z3Var = new z3("CONSENT", 0);
        f7860v = z3Var;
        z3 z3Var2 = new z3("LEGITIMATE_INTEREST", 1);
        z3 z3Var3 = new z3("FLEXIBLE_CONSENT", 2);
        z3 z3Var4 = new z3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f7861w = z3Var4;
        f7862x = new z3[]{z3Var, z3Var2, z3Var3, z3Var4};
    }

    public static z3[] values() {
        return (z3[]) f7862x.clone();
    }
}
