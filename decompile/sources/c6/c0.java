package c6;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements g, com.bumptech.glide.load.data.c {
    public List A;
    public int B;
    public volatile g6.r C;
    public File D;
    public d0 E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f2150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f2151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2153y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a6.f f2154z;

    public c0(h hVar, j jVar) {
        this.f2151w = hVar;
        this.f2150v = jVar;
    }

    @Override // c6.g
    public final boolean c() {
        List list;
        boolean z2;
        List list2;
        boolean z10;
        ArrayList arrayListA = this.f2151w.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        h hVar = this.f2151w;
        com.bumptech.glide.k kVarB = hVar.f2179c.b();
        Class<?> cls = hVar.f2180d.getClass();
        Class cls2 = hVar.f2182g;
        Class cls3 = hVar.f2185k;
        ob.d dVar = kVarB.f2372h;
        v6.k kVar = (v6.k) ((AtomicReference) dVar.f10105w).getAndSet(null);
        if (kVar == null) {
            kVar = new v6.k(cls, cls2, cls3);
        } else {
            kVar.f13228a = cls;
            kVar.f13229b = cls2;
            kVar.f13230c = cls3;
        }
        synchronized (((v.e) dVar.f10106x)) {
            list = (List) ((v.e) dVar.f10106x).get(kVar);
        }
        ((AtomicReference) dVar.f10105w).set(kVar);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListA2 = kVarB.f2366a.a(cls);
            int size = arrayListA2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA2.get(i);
                i++;
                ArrayList arrayListJ = kVarB.f2368c.j((Class) obj, cls2);
                int size2 = arrayListJ.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayListJ.get(i10);
                    i10++;
                    Class cls4 = (Class) obj2;
                    if (!kVarB.f.k(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z2 = false;
            kVarB.f2372h.i(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        } else {
            z2 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f2151w.f2185k)) {
                return z2;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f2151w.f2180d.getClass() + " to " + this.f2151w.f2185k);
        }
        while (true) {
            List list3 = this.A;
            if (list3 != null && this.B < list3.size()) {
                this.C = null;
                boolean z11 = z2;
                while (!z11 && this.B < this.A.size()) {
                    List list4 = this.A;
                    int i11 = this.B;
                    this.B = i11 + 1;
                    g6.s sVar = (g6.s) list4.get(i11);
                    File file = this.D;
                    h hVar2 = this.f2151w;
                    this.C = sVar.b(file, hVar2.f2181e, hVar2.f, hVar2.i);
                    if (this.C != null && this.f2151w.c(this.C.f5696c.a()) != null) {
                        this.C.f5696c.e(this.f2151w.f2189o, this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f2153y + 1;
            this.f2153y = i12;
            if (i12 >= list2.size()) {
                int i13 = this.f2152x + 1;
                this.f2152x = i13;
                if (i13 >= arrayListA.size()) {
                    return z2;
                }
                this.f2153y = z2 ? 1 : 0;
            }
            a6.f fVar = (a6.f) arrayListA.get(this.f2152x);
            Class cls5 = (Class) list2.get(this.f2153y);
            a6.m mVarE = this.f2151w.e(cls5);
            h hVar3 = this.f2151w;
            this.E = new d0(hVar3.f2179c.f2353a, fVar, hVar3.f2188n, hVar3.f2181e, hVar3.f, mVarE, cls5, hVar3.i);
            File fileG = hVar3.f2183h.a().g(this.E);
            this.D = fileG;
            if (fileG != null) {
                this.f2154z = fVar;
                this.A = this.f2151w.f2179c.b().g(fileG);
                z10 = false;
                this.B = 0;
            } else {
                z10 = false;
            }
            z2 = z10;
        }
    }

    @Override // c6.g
    public final void cancel() {
        g6.r rVar = this.C;
        if (rVar != null) {
            rVar.f5696c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void k(Exception exc) {
        this.f2150v.a(this.E, exc, this.C.f5696c, 4);
    }

    @Override // com.bumptech.glide.load.data.c
    public final void q(Object obj) {
        this.f2150v.b(this.f2154z, obj, this.C.f5696c, 4, this.E);
    }
}
