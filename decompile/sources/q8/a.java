package q8;

import android.util.SparseArray;
import d8.d;
import h8.c;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f11144a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f11145b;

    static {
        HashMap hashMap = new HashMap();
        f11145b = hashMap;
        hashMap.put(d.f3973x, 0);
        hashMap.put(d.f3974y, 1);
        hashMap.put(d.f3975z, 2);
        for (d dVar : hashMap.keySet()) {
            f11144a.append(((Integer) f11145b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f11145b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i6) {
        d dVar = (d) f11144a.get(i6);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i6, "Unknown Priority for value "));
    }
}
