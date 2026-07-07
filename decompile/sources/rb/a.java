package rb;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f11924e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f11925a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f11926b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11927c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f11928d;

    public a(String str, int i6, StrictMode.ThreadPolicy threadPolicy) {
        this.f11926b = str;
        this.f11927c = i6;
        this.f11928d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f11924e.newThread(new m8.c(5, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f11926b + " Thread #" + this.f11925a.getAndIncrement());
        return newThread;
    }
}
