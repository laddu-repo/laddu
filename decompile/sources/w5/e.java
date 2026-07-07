package w5;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14090a = o.h("Schedulers");

    public static void a(v5.b bVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            e6.j y9 = workDatabase.y();
            workDatabase.c();
            try {
                int i6 = bVar.f13304h;
                if (Build.VERSION.SDK_INT == 23) {
                    i6 /= 2;
                }
                ArrayList b10 = y9.b(i6);
                ArrayList a10 = y9.a();
                if (b10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = b10.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = b10.get(i10);
                        i10++;
                        y9.i(((e6.i) obj).f4371a, currentTimeMillis);
                    }
                }
                workDatabase.r();
                workDatabase.h();
                if (b10.size() > 0) {
                    e6.i[] iVarArr = (e6.i[]) b10.toArray(new e6.i[b10.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (dVar.b()) {
                            dVar.f(iVarArr);
                        }
                    }
                }
                if (a10.size() > 0) {
                    e6.i[] iVarArr2 = (e6.i[]) a10.toArray(new e6.i[a10.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        d dVar2 = (d) it2.next();
                        if (!dVar2.b()) {
                            dVar2.f(iVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.h();
                throw th;
            }
        }
    }
}
