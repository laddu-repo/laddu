package d6;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import v6.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f4358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f4359e;
    public static final Bitmap.Config[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f4360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f4361h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4362a = new e(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sc.b f4363b = new sc.b(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4364c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f4358d = configArr;
        f4359e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f4360g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f4361h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(m.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = m.d(config) * i * i10;
        e eVar = this.f4362a;
        h hVarE = (h) ((ArrayDeque) eVar.f2053w).poll();
        if (hVarE == null) {
            hVarE = eVar.E();
        }
        j jVar = (j) hVarE;
        jVar.f4356b = iD;
        jVar.f4357c = config;
        int i11 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = i.f4354a[config.ordinal()];
            configArr = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? new Bitmap.Config[]{config} : f4361h : f4360g : f : f4358d;
        } else {
            configArr = f4359e;
        }
        int length = configArr.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i11];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i11++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                eVar.r(jVar);
                int iIntValue = num.intValue();
                h hVarE2 = (h) ((ArrayDeque) eVar.f2053w).poll();
                if (hVarE2 == null) {
                    hVarE2 = eVar.E();
                }
                jVar = (j) hVarE2;
                jVar.f4356b = iIntValue;
                jVar.f4357c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f4363b.X(jVar);
        if (bitmap != null) {
            a(Integer.valueOf(jVar.f4356b), bitmap);
            bitmap.reconfigure(i, i10, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f4364c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f4362a;
        h hVarE = (h) ((ArrayDeque) eVar.f2053w).poll();
        if (hVarE == null) {
            hVarE = eVar.E();
        }
        j jVar = (j) hVarE;
        jVar.f4356b = iC;
        jVar.f4357c = config;
        this.f4363b.c0(jVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(jVar.f4356b));
        navigableMapD.put(Integer.valueOf(jVar.f4356b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbB = y.e.b("SizeConfigStrategy{groupedMap=");
        sbB.append(this.f4363b);
        sbB.append(", sortedSizes=(");
        HashMap map = this.f4364c;
        for (Map.Entry entry : map.entrySet()) {
            sbB.append(entry.getKey());
            sbB.append('[');
            sbB.append(entry.getValue());
            sbB.append("], ");
        }
        if (!map.isEmpty()) {
            sbB.replace(sbB.length() - 2, sbB.length(), "");
        }
        sbB.append(")}");
        return sbB.toString();
    }
}
