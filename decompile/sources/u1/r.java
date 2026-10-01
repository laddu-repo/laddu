package u1;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static r f12797f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f12798a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f12799b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12800c;

    /* renamed from: d, reason: collision with root package name */
    public int f12801d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12802e;

    public r(Context context) {
        Executor i6 = a.i();
        this.f12798a = i6;
        this.f12799b = new CopyOnWriteArrayList();
        this.f12800c = new Object();
        this.f12801d = 0;
        i6.execute(new m8.c(9, this, context));
    }

    public static synchronized r a(Context context) {
        r rVar;
        synchronized (r.class) {
            try {
                if (f12797f == null) {
                    f12797f = new r(context);
                }
                rVar = f12797f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public final int b() {
        int i6;
        synchronized (this.f12800c) {
            i6 = this.f12801d;
        }
        return i6;
    }

    public final void c(int i6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12799b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.f12794a.get() == null) {
                copyOnWriteArrayList.remove(qVar);
            }
        }
        synchronized (this.f12800c) {
            try {
                if (this.f12802e && this.f12801d == i6) {
                    return;
                }
                this.f12802e = true;
                this.f12801d = i6;
                Iterator it2 = this.f12799b.iterator();
                while (it2.hasNext()) {
                    q qVar2 = (q) it2.next();
                    qVar2.f12795b.execute(new j2.h(qVar2, 12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
