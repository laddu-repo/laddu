package j5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h0 f6838v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h0 f6839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h0 f6840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ h0[] f6841y;

    static {
        h0 h0Var = new h0("AUTOMATIC", 0);
        f6838v = h0Var;
        h0 h0Var2 = new h0("HARDWARE", 1);
        f6839w = h0Var2;
        h0 h0Var3 = new h0("SOFTWARE", 2);
        f6840x = h0Var3;
        f6841y = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f6841y.clone();
    }
}
