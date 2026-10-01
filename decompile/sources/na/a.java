package na;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f9040e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f9041a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f9044d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f9042b = str;
        this.f9043c = i;
        this.f9044d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f9040e.newThread(new androidx.fragment.app.d(28, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f9042b + " Thread #" + this.f9041a.getAndIncrement());
        return threadNewThread;
    }
}
