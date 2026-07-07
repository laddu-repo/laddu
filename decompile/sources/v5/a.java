package v5;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13295a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13296b;

    public a(boolean z10) {
        this.f13296b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f13296b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder b10 = y.e.b(str);
        b10.append(this.f13295a.incrementAndGet());
        return new Thread(runnable, b10.toString());
    }
}
