package e1;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4150b;

    public /* synthetic */ a(String str, int i6) {
        this.f4149a = i6;
        this.f4150b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4149a) {
            case 0:
                Thread thread = new Thread(runnable, this.f4150b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f4150b);
        }
    }
}
