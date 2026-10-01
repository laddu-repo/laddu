package w4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final q0.l f13849h = new q0.l();

    /* renamed from: a, reason: collision with root package name */
    public final v9.b f13850a;

    /* renamed from: b, reason: collision with root package name */
    public final s8.l f13851b;

    /* renamed from: e, reason: collision with root package name */
    public List f13854e;

    /* renamed from: g, reason: collision with root package name */
    public int f13856g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f13853d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f13855f = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public final q0.l f13852c = f13849h;

    public e(v9.b bVar, s8.l lVar) {
        this.f13850a = bVar;
        this.f13851b = lVar;
    }

    public final void a(Runnable runnable) {
        Iterator it = this.f13853d.iterator();
        while (it.hasNext()) {
            e0 e0Var = ((d0) it.next()).f13848a;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i6 = this.f13856g + 1;
        this.f13856g = i6;
        List list2 = this.f13854e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        v9.b bVar = this.f13850a;
        if (list == null) {
            int size = list2.size();
            this.f13854e = null;
            this.f13855f = Collections.EMPTY_LIST;
            bVar.d(0, size);
            a(runnable);
            return;
        }
        if (list2 == null) {
            this.f13854e = list;
            this.f13855f = Collections.unmodifiableList(list);
            bVar.c(0, list.size());
            a(runnable);
            return;
        }
        ((Executor) this.f13851b.f12251y).execute(new d(this, list2, list, i6, runnable));
    }
}
