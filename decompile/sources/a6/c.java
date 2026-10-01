package a6;

import android.content.Context;
import c6.f;
import c6.g;
import c6.h;
import java.util.ArrayList;
import java.util.Collection;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements b6.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f583d = o.h("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f584a;

    /* renamed from: b, reason: collision with root package name */
    public final b6.c[] f585b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f586c;

    public c(Context context, h6.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f584a = bVar;
        this.f585b = new b6.c[]{new b6.a((c6.a) h.p(applicationContext, aVar).f1981x, 0), new b6.a((c6.b) h.p(applicationContext, aVar).f1982y, 1), new b6.a((g) h.p(applicationContext, aVar).A, 4), new b6.a((f) h.p(applicationContext, aVar).f1983z, 2), new b6.a((f) h.p(applicationContext, aVar).f1983z, 3), new b6.c((f) h.p(applicationContext, aVar).f1983z), new b6.c((f) h.p(applicationContext, aVar).f1983z)};
        this.f586c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f586c) {
            try {
                for (b6.c cVar : this.f585b) {
                    Object obj = cVar.f1476b;
                    if (obj != null && cVar.b(obj) && cVar.f1475a.contains(str)) {
                        o.f().b(f583d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.f586c) {
            try {
                b bVar = this.f584a;
                if (bVar != null) {
                    bVar.a(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.f586c) {
            try {
                for (b6.c cVar : this.f585b) {
                    if (cVar.f1478d != null) {
                        cVar.f1478d = null;
                        cVar.d(null, cVar.f1476b);
                    }
                }
                for (b6.c cVar2 : this.f585b) {
                    cVar2.c(collection);
                }
                for (b6.c cVar3 : this.f585b) {
                    if (cVar3.f1478d != this) {
                        cVar3.f1478d = this;
                        cVar3.d(this, cVar3.f1476b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f586c) {
            try {
                for (b6.c cVar : this.f585b) {
                    ArrayList arrayList = cVar.f1475a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f1477c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
