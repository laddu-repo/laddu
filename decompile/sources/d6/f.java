package d6;

import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.b f4344a = new sc.b(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4345b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4346c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4347d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4348e;
    public int f;

    public f(int i) {
        this.f4348e = i;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(int i, Class cls) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void c(int i) {
        while (this.f > i) {
            Object objE0 = this.f4344a.e0();
            v6.f.b(objE0);
            b bVarE = e(objE0.getClass());
            this.f -= bVarE.b() * bVarE.a(objE0);
            b(bVarE.a(objE0), objE0.getClass());
            if (Log.isLoggable(bVarE.c(), 2)) {
                Log.v(bVarE.c(), "evicted: " + bVarE.a(objE0));
            }
        }
    }

    public final synchronized Object d(int i, Class cls) {
        d dVar;
        int i10;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i10 = this.f) != 0 && this.f4348e / i10 < 2 && num.intValue() > i * 8)) {
                e eVar = this.f4345b;
                h hVarE = (h) ((ArrayDeque) eVar.f2053w).poll();
                if (hVarE == null) {
                    hVarE = eVar.E();
                }
                dVar = (d) hVarE;
                dVar.f4341b = i;
                dVar.f4342c = cls;
            } else {
                e eVar2 = this.f4345b;
                int iIntValue = num.intValue();
                h hVarE2 = (h) ((ArrayDeque) eVar2.f2053w).poll();
                if (hVarE2 == null) {
                    hVarE2 = eVar2.E();
                }
                dVar = (d) hVarE2;
                dVar.f4341b = iIntValue;
                dVar.f4342c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f(dVar, cls);
    }

    public final b e(Class cls) {
        b bVar;
        HashMap map = this.f4347d;
        b bVar2 = (b) map.get(cls);
        if (bVar2 != null) {
            return bVar2;
        }
        if (cls.equals(int[].class)) {
            bVar = new b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            bVar = new b(0);
        }
        map.put(cls, bVar);
        return bVar;
    }

    public final Object f(d dVar, Class cls) {
        b bVarE = e(cls);
        Object objX = this.f4344a.X(dVar);
        if (objX != null) {
            this.f -= bVarE.b() * bVarE.a(objX);
            b(bVarE.a(objX), cls);
        }
        if (objX != null) {
            return objX;
        }
        if (Log.isLoggable(bVarE.c(), 2)) {
            Log.v(bVarE.c(), "Allocated " + dVar.f4341b + " bytes");
        }
        int i = dVar.f4341b;
        switch (bVarE.f4335a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public final NavigableMap g(Class cls) {
        HashMap map = this.f4346c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void h(Object obj) {
        Class<?> cls = obj.getClass();
        b bVarE = e(cls);
        int iA = bVarE.a(obj);
        int iB = bVarE.b() * iA;
        if (iB <= this.f4348e / 2) {
            e eVar = this.f4345b;
            h hVarE = (h) ((ArrayDeque) eVar.f2053w).poll();
            if (hVarE == null) {
                hVarE = eVar.E();
            }
            d dVar = (d) hVarE;
            dVar.f4341b = iA;
            dVar.f4342c = cls;
            this.f4344a.c0(dVar, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(dVar.f4341b));
            Integer numValueOf = Integer.valueOf(dVar.f4341b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            c(this.f4348e);
        }
    }

    public final synchronized void i(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                c(this.f4348e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
