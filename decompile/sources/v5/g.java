package v5;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public static final g f13320x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g[] f13321y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v5.g] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f13320x = r02;
        f13321y = new g[]{r02};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f13321y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.k.e(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
