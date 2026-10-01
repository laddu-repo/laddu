package k5;

import a8.f;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.playfy.tv.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f7730d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7731e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f7734c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7733b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7732a = new HashMap();

    public a(Context context) {
        this.f7734c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f7730d == null) {
            synchronized (f7731e) {
                try {
                    if (f7730d == null) {
                        f7730d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f7730d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f7734c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f7733b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f7732a;
        if (f.S()) {
            try {
                f.F(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> dependencies = bVar.dependencies();
                    if (!dependencies.isEmpty()) {
                        for (Class cls2 : dependencies) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.create(this.f7734c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
