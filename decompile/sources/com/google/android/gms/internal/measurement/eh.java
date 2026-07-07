package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2618a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f2619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Handler f2620c;

    public static z5 a(Object obj) {
        if (obj == null) {
            return z5.f3275b;
        }
        if (obj instanceof String) {
            return new c6((String) obj);
        }
        if (obj instanceof Double) {
            return new m3((Double) obj);
        }
        if (obj instanceof Long) {
            return new m3(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new m3(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new b2((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            m1 m1Var = new m1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m1Var.o(m1Var.m(), a(it.next()));
            }
            return m1Var;
        }
        w5 w5Var = new w5();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            z5 z5VarA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                w5Var.i((String) string, z5VarA);
            }
        }
        return w5Var;
    }

    public static final File b(Uri uri) throws a6.c {
        if (!uri.getScheme().equals("file")) {
            throw new a6.c("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new a6.c("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new a6.c("Did not expect uri to have authority");
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    public static boolean d(Thread thread) {
        if (f2619b == null) {
            f2619b = Looper.getMainLooper().getThread();
        }
        return thread == f2619b;
    }

    public static Handler e() {
        if (f2620c == null) {
            synchronized (f2618a) {
                try {
                    if (f2620c == null) {
                        f2620c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f2620c;
    }

    public static z5 f(ma maVar) {
        if (maVar == null) {
            return z5.f3274a;
        }
        int iC = maVar.C() - 1;
        if (iC == 1) {
            return maVar.w() ? new c6(maVar.x()) : z5.f3280h;
        }
        if (iC == 2) {
            return maVar.A() ? new m3(Double.valueOf(maVar.B())) : new m3(null);
        }
        if (iC == 3) {
            return maVar.y() ? new b2(Boolean.valueOf(maVar.z())) : new b2(null);
        }
        if (iC != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listU = maVar.u();
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(f((ma) it.next()));
        }
        return new a6(maVar.v(), arrayList);
    }

    public static boolean g(byte b9) {
        return b9 > -65;
    }
}
