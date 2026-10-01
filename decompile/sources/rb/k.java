package rb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public static final k f11948x;

    /* renamed from: y, reason: collision with root package name */
    public static final Handler f11949y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ k[] f11950z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rb.k] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f11948x = r02;
        f11950z = new k[]{r02};
        f11949y = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f11950z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f11949y.post(runnable);
    }
}
