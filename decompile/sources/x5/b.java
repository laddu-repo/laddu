package x5;

import a6.c;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.j1;
import e6.i;
import f6.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v5.o;
import w5.d;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements d, a6.b, w5.b {
    public static final String F = o.h("GreedyScheduler");
    public final a B;
    public boolean C;
    public Boolean E;

    /* renamed from: x, reason: collision with root package name */
    public final Context f14688x;

    /* renamed from: y, reason: collision with root package name */
    public final l f14689y;

    /* renamed from: z, reason: collision with root package name */
    public final c f14690z;
    public final HashSet A = new HashSet();
    public final Object D = new Object();

    public b(Context context, v5.b bVar, j1 j1Var, l lVar) {
        this.f14688x = context;
        this.f14689y = lVar;
        this.f14690z = new c(context, j1Var, this);
        this.B = new a(this, bVar.f13301e);
    }

    @Override // a6.b
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.f().b(F, r4.a.k("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f14689y.g(str);
        }
    }

    @Override // w5.d
    public final boolean b() {
        return false;
    }

    @Override // w5.b
    public final void c(String str, boolean z10) {
        synchronized (this.D) {
            try {
                Iterator it = this.A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f4371a.equals(str)) {
                        o.f().b(F, "Stopping tracking for " + str, new Throwable[0]);
                        this.A.remove(iVar);
                        this.f14690z.c(this.A);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w5.d
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.E;
        l lVar = this.f14689y;
        if (bool == null) {
            this.E = Boolean.valueOf(h.a(this.f14688x, lVar.f14112b));
        }
        boolean booleanValue = this.E.booleanValue();
        String str2 = F;
        if (!booleanValue) {
            o.f().g(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.C) {
            lVar.f14116f.a(this);
            this.C = true;
        }
        o.f().b(str2, r4.a.k("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.B;
        if (aVar != null && (runnable = (Runnable) aVar.f14687c.remove(str)) != null) {
            ((Handler) aVar.f14686b.f14086x).removeCallbacks(runnable);
        }
        lVar.g(str);
    }

    @Override // a6.b
    public final void e(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) obj;
            o.f().b(F, r4.a.k("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f14689y.f(str, null);
        }
    }

    @Override // w5.d
    public final void f(i... iVarArr) {
        if (this.E == null) {
            this.E = Boolean.valueOf(h.a(this.f14688x, this.f14689y.f14112b));
        }
        if (!this.E.booleanValue()) {
            o.f().g(F, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.C) {
            this.f14689y.f14116f.a(this);
            this.C = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long a10 = iVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (iVar.f4372b == 1) {
                if (currentTimeMillis < a10) {
                    a aVar = this.B;
                    if (aVar != null) {
                        w5.a aVar2 = aVar.f14686b;
                        HashMap hashMap = aVar.f14687c;
                        Runnable runnable = (Runnable) hashMap.remove(iVar.f4371a);
                        if (runnable != null) {
                            ((Handler) aVar2.f14086x).removeCallbacks(runnable);
                        }
                        rb.i iVar2 = new rb.i(aVar, iVar, 15, false);
                        hashMap.put(iVar.f4371a, iVar2);
                        ((Handler) aVar2.f14086x).postDelayed(iVar2, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 23 && iVar.j.f13308c) {
                        o.f().b(F, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (i6 >= 24 && iVar.j.f13313h.f13316a.size() > 0) {
                        o.f().b(F, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f4371a);
                    }
                } else {
                    o.f().b(F, r4.a.k("Starting work for ", iVar.f4371a), new Throwable[0]);
                    this.f14689y.f(iVar.f4371a, null);
                }
            }
        }
        synchronized (this.D) {
            try {
                if (!hashSet.isEmpty()) {
                    o.f().b(F, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.A.addAll(hashSet);
                    this.f14690z.c(this.A);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
