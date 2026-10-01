package g6;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f5708e = new c(6);
    public static final c0 f = new c0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd.a f5712d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5709a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f5711c = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5710b = f5708e;

    public y(hd.a aVar) {
        this.f5712d = aVar;
    }

    public final synchronized void a(Class cls, Class cls2, t tVar) {
        x xVar = new x(cls, cls2, tVar);
        ArrayList arrayList = this.f5709a;
        arrayList.add(arrayList.size(), xVar);
    }

    public final synchronized s b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f5709a;
            int size = arrayList2.size();
            boolean z2 = false;
            int i = 0;
            while (true) {
                boolean z10 = true;
                if (i >= size) {
                    break;
                }
                Object obj = arrayList2.get(i);
                i++;
                x xVar = (x) obj;
                if (this.f5711c.contains(xVar)) {
                    z2 = true;
                } else {
                    if (!xVar.f5705a.isAssignableFrom(cls) || !xVar.f5706b.isAssignableFrom(cls2)) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f5711c.add(xVar);
                        arrayList.add(xVar.f5707c.a(this));
                        this.f5711c.remove(xVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f5710b;
                hd.a aVar = this.f5712d;
                cVar.getClass();
                return new b(2, arrayList, aVar);
            }
            if (arrayList.size() == 1) {
                return (s) arrayList.get(0);
            }
            if (z2) {
                return f;
            }
            throw new com.bumptech.glide.j("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f5711c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f5709a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                x xVar = (x) obj;
                if (!this.f5711c.contains(xVar) && xVar.f5705a.isAssignableFrom(cls)) {
                    this.f5711c.add(xVar);
                    arrayList.add(xVar.f5707c.a(this));
                    this.f5711c.remove(xVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5709a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            x xVar = (x) obj;
            if (!arrayList.contains(xVar.f5706b) && xVar.f5705a.isAssignableFrom(cls)) {
                arrayList.add(xVar.f5706b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f5709a.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar.f5705a.isAssignableFrom(i.class) && xVar.f5706b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(xVar.f5707c);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList f(z5.b bVar) {
        ArrayList arrayListE;
        arrayListE = e();
        a(i.class, InputStream.class, bVar);
        return arrayListE;
    }
}
