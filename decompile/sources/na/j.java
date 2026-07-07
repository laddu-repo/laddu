package na;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f9066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Handler f9067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j[] f9068x;

    static {
        j jVar = new j("INSTANCE", 0);
        f9066v = jVar;
        f9068x = new j[]{jVar};
        f9067w = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f9068x.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f9067w.post(runnable);
    }
}
