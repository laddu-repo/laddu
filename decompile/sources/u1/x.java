package u1;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f12819b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12820a;

    public x(Handler handler) {
        this.f12820a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w b() {
        w wVar;
        ArrayList arrayList = f12819b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    wVar = new Object();
                } else {
                    wVar = (w) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public final w a(int i6, Object obj) {
        w b10 = b();
        b10.f12818a = this.f12820a.obtainMessage(i6, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f12820a.post(runnable);
    }

    public final void d(int i6) {
        boolean z10;
        if (i6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.b(z10);
        this.f12820a.removeMessages(i6);
    }

    public final boolean e(int i6) {
        return this.f12820a.sendEmptyMessage(i6);
    }
}
