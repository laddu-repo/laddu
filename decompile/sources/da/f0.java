package da;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Executor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f0 f4407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f0[] f4408w;

    static {
        f0 f0Var = new f0("INSTANCE", 0);
        f4407v = f0Var;
        f4408w = new f0[]{f0Var};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f4408w.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
