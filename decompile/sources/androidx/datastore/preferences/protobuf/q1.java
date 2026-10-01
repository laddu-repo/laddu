package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {
    public static final q1 A;
    public static final q1 B;
    public static final q1 C;
    public static final q1 D;
    public static final /* synthetic */ q1[] E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q1 f838v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q1 f839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q1 f840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q1 f841y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final q1 f842z;

    static {
        q1 q1Var = new q1("INT", 0);
        f838v = q1Var;
        q1 q1Var2 = new q1("LONG", 1);
        f839w = q1Var2;
        q1 q1Var3 = new q1("FLOAT", 2);
        f840x = q1Var3;
        q1 q1Var4 = new q1("DOUBLE", 3);
        f841y = q1Var4;
        q1 q1Var5 = new q1("BOOLEAN", 4);
        f842z = q1Var5;
        q1 q1Var6 = new q1("STRING", 5);
        A = q1Var6;
        g gVar = g.f765x;
        q1 q1Var7 = new q1("BYTE_STRING", 6);
        B = q1Var7;
        q1 q1Var8 = new q1("ENUM", 7);
        C = q1Var8;
        q1 q1Var9 = new q1("MESSAGE", 8);
        D = q1Var9;
        E = new q1[]{q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6, q1Var7, q1Var8, q1Var9};
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) E.clone();
    }
}
