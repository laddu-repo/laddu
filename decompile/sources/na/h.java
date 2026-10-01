package na;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Executor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f9059v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ h[] f9060w;

    static {
        h hVar = new h("INSTANCE", 0);
        f9059v = hVar;
        f9060w = new h[]{hVar};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f9060w.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
