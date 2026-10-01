package b9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f1620a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f1621b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f1620a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f1621b.newThread(new b(runnable, 0));
        newThread.setName(this.f1620a);
        return newThread;
    }
}
