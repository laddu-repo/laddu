package u1;

import a2.l1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.p4;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final v f12784a;

    /* renamed from: b, reason: collision with root package name */
    public final x f12785b;

    /* renamed from: c, reason: collision with root package name */
    public final m f12786c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f12787d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f12788e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f12789f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12790g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12791h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12792i;

    public o(Looper looper, v vVar, m mVar) {
        this(new CopyOnWriteArraySet(), looper, vVar, mVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f12790g) {
            try {
                if (this.f12791h) {
                    return;
                }
                this.f12787d.add(new n(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f12789f;
        if (!arrayDeque.isEmpty()) {
            x xVar = this.f12785b;
            if (!xVar.f12820a.hasMessages(1)) {
                xVar.getClass();
                w b10 = x.b();
                Message obtainMessage = xVar.f12820a.obtainMessage(1);
                b10.f12818a = obtainMessage;
                Handler handler = xVar.f12820a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f12788e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i6, l lVar) {
        f();
        this.f12789f.add(new l1(new CopyOnWriteArraySet(this.f12787d), i6, lVar, 4));
    }

    public final void d() {
        f();
        synchronized (this.f12790g) {
            this.f12791h = true;
        }
        Iterator it = this.f12787d.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            m mVar = this.f12786c;
            nVar.f12783d = true;
            if (nVar.f12782c) {
                nVar.f12782c = false;
                mVar.g(nVar.f12780a, nVar.f12781b.c());
            }
        }
        this.f12787d.clear();
    }

    public final void e(int i6, l lVar) {
        c(i6, lVar);
        b();
    }

    public final void f() {
        boolean z10;
        if (!this.f12792i) {
            return;
        }
        if (Thread.currentThread() == this.f12785b.f12820a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.g(z10);
    }

    public o(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, v vVar, m mVar, boolean z10) {
        this.f12784a = vVar;
        this.f12787d = copyOnWriteArraySet;
        this.f12786c = mVar;
        this.f12790g = new Object();
        this.f12788e = new ArrayDeque();
        this.f12789f = new ArrayDeque();
        this.f12785b = vVar.a(looper, new Handler.Callback() { // from class: u1.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                o oVar = o.this;
                Iterator it = oVar.f12787d.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    m mVar2 = oVar.f12786c;
                    if (!nVar.f12783d && nVar.f12782c) {
                        r1.o c10 = nVar.f12781b.c();
                        nVar.f12781b = new p4();
                        nVar.f12782c = false;
                        mVar2.g(nVar.f12780a, c10);
                    }
                    if (oVar.f12785b.f12820a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f12792i = z10;
    }
}
