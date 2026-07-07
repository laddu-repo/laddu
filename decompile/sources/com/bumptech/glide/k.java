package com.bumptech.glide;

import ef.p;
import g6.s;
import g6.t;
import g6.u;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f2366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f2367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2.c f2368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l5.c f2369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f2370e;
    public final md.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final md.c f2371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ob.d f2372h = new ob.d(6);
    public final q6.b i = new q6.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hd.a f2373j;

    public k() {
        hd.a aVar = new hd.a(new s0.e(20), new w2.f(), new w.b(), 28, false);
        this.f2373j = aVar;
        this.f2366a = new v(aVar);
        this.f2367b = new p(1);
        this.f2368c = new p2.c(7);
        this.f2369d = new l5.c(1);
        this.f2370e = new com.bumptech.glide.load.data.h();
        this.f = new md.c(1);
        this.f2371g = new md.c(4);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        p2.c cVar = this.f2368c;
        synchronized (cVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) cVar.f10196w);
                ((ArrayList) cVar.f10196w).clear();
                int size = arrayList.size();
                int i = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ArrayList) cVar.f10196w).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) cVar.f10196w).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, a6.b bVar) {
        p pVar = this.f2367b;
        synchronized (pVar) {
            pVar.f5025a.add(new q6.a(cls, bVar));
        }
    }

    public final void b(Class cls, a6.l lVar) {
        l5.c cVar = this.f2369d;
        synchronized (cVar) {
            cVar.f8180a.add(new q6.d(cls, lVar));
        }
    }

    public final void c(Class cls, Class cls2, t tVar) {
        v vVar = this.f2366a;
        synchronized (vVar) {
            vVar.f5698a.a(cls, cls2, tVar);
            ((HashMap) vVar.f5699b.f11492w).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, a6.k kVar) {
        p2.c cVar = this.f2368c;
        synchronized (cVar) {
            cVar.i(str).add(new q6.c(cls, cls2, kVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        Class cls4 = cls;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListJ = this.f2368c.j(cls4, cls2);
        int size = arrayListJ.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            Class cls5 = (Class) arrayListJ.get(i);
            ArrayList arrayListK = this.f.k(cls5, cls3);
            int size2 = arrayListK.size();
            int i11 = 0;
            while (i11 < size2) {
                int i12 = i11 + 1;
                Class cls6 = (Class) arrayListK.get(i11);
                p2.c cVar = this.f2368c;
                synchronized (cVar) {
                    arrayList = new ArrayList();
                    ArrayList arrayList3 = (ArrayList) cVar.f10196w;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj = arrayList3.get(i13);
                        i13++;
                        ArrayList arrayList4 = arrayList3;
                        String str = (String) obj;
                        int i14 = size3;
                        List list = (List) ((HashMap) cVar.f10197x).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                q6.c cVar2 = (q6.c) it.next();
                                Iterator it2 = it;
                                if (cVar2.f10886a.isAssignableFrom(cls4) && cls5.isAssignableFrom(cVar2.f10887b)) {
                                    arrayList.add(cVar2.f10888c);
                                }
                                it = it2;
                            }
                        }
                        size3 = i14;
                        arrayList3 = arrayList4;
                    }
                }
                arrayList2.add(new c6.k(cls4, cls5, cls6, arrayList, this.f.g(cls5, cls6), this.f2373j));
                cls4 = cls;
                i11 = i12;
            }
            cls4 = cls;
            i = i10;
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        md.c cVar = this.f2371g;
        synchronized (cVar) {
            arrayList = cVar.f8645w;
        }
        if (arrayList.isEmpty()) {
            throw new j("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        v vVar = this.f2366a;
        vVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (vVar) {
            u uVar = (u) ((HashMap) vVar.f5699b.f11492w).get(cls);
            listUnmodifiableList = uVar == null ? null : uVar.f5697a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(vVar.f5698a.c(cls));
                if (((u) ((HashMap) vVar.f5699b.f11492w).put(cls, new u(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new j("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            s sVar = (s) listUnmodifiableList.get(i);
            if (sVar.a(obj)) {
                if (z2) {
                    arrayList = new ArrayList(size - i);
                    z2 = false;
                }
                arrayList.add(sVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new j("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.f h(Object obj) {
        com.bumptech.glide.load.data.f fVarB;
        com.bumptech.glide.load.data.h hVar = this.f2370e;
        synchronized (hVar) {
            try {
                v6.f.b(obj);
                com.bumptech.glide.load.data.e eVar = (com.bumptech.glide.load.data.e) ((HashMap) hVar.f2386w).get(obj.getClass());
                if (eVar == null) {
                    Iterator it = ((HashMap) hVar.f2386w).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.e eVar2 = (com.bumptech.glide.load.data.e) it.next();
                        if (eVar2.a().isAssignableFrom(obj.getClass())) {
                            eVar = eVar2;
                            break;
                        }
                    }
                }
                if (eVar == null) {
                    eVar = com.bumptech.glide.load.data.h.f2384x;
                }
                fVarB = eVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVarB;
    }

    public final void i(a6.e eVar) {
        md.c cVar = this.f2371g;
        synchronized (cVar) {
            cVar.f8645w.add(eVar);
        }
    }

    public final void j(com.bumptech.glide.load.data.e eVar) {
        com.bumptech.glide.load.data.h hVar = this.f2370e;
        synchronized (hVar) {
            ((HashMap) hVar.f2386w).put(eVar.a(), eVar);
        }
    }

    public final void k(Class cls, Class cls2, o6.a aVar) {
        md.c cVar = this.f;
        synchronized (cVar) {
            cVar.f8645w.add(new o6.b(cls, cls2, aVar));
        }
    }
}
