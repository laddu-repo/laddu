package ed;

import android.os.Handler;
import e2.v;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements zc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab.f f4919a;

    public o(ab.f fVar) {
        this.f4919a = fVar;
    }

    @Override // zc.e
    public final void a(ad.e eVar, jd.b bVar, int i) {
        de.i.e(eVar, "download");
        de.i.e(bVar, "downloadBlock");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            eVar2.a(eVar, bVar, i);
                        }
                    }
                }
                if (!((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).A(eVar.f487z, eVar, jd.o.C);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.e
    public final void b(ad.e eVar) {
        de.i.e(eVar, "download");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            ((Handler) fVar.f299b).post(new j(eVar2, eVar, 2));
                        }
                    }
                }
                if (((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).J(eVar.f487z, eVar, jd.o.f7099v);
                } else {
                    ((hd.a) fVar.f298a).A(eVar.f487z, eVar, jd.o.f7099v);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
                List list = (List) ((LinkedHashMap) fVar.f304h).get(Integer.valueOf(eVar.f483v));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (((WeakReference) it5.next()).get() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.e
    public final void c(ad.e eVar, boolean z2) {
        de.i.e(eVar, "download");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            ((Handler) fVar.f299b).post(new m(eVar2, eVar, z2, 0));
                        }
                    }
                }
                if (((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).J(eVar.f487z, eVar, jd.o.f7100w);
                } else {
                    ((hd.a) fVar.f298a).A(eVar.f487z, eVar, jd.o.f7100w);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
                List list = (List) ((LinkedHashMap) fVar.f304h).get(Integer.valueOf(eVar.f483v));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (((WeakReference) it5.next()).get() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.e
    public final void d(ad.e eVar) {
        de.i.e(eVar, "download");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            ((Handler) fVar.f299b).post(new j(eVar2, eVar, 0));
                        }
                    }
                }
                if (((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).J(eVar.f487z, eVar, jd.o.f7102y);
                } else {
                    ((hd.a) fVar.f298a).A(eVar.f487z, eVar, jd.o.f7102y);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
                List list = (List) ((LinkedHashMap) fVar.f304h).get(Integer.valueOf(eVar.f483v));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (((WeakReference) it5.next()).get() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.e
    public final void e(final ad.e eVar, final long j8, final long j9) {
        de.i.e(eVar, "download");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                ((Handler) fVar.f303g).post(new l(fVar, eVar, 2));
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        final zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            ((Handler) fVar.f299b).post(new Runnable() { // from class: ed.n
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eVar2.e(eVar, j8, j9);
                                }
                            });
                        }
                    }
                }
                if (((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).J(eVar.f487z, eVar, jd.o.f7103z);
                } else {
                    ((hd.a) fVar.f298a).A(eVar.f487z, eVar, jd.o.f7103z);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
                List list = (List) ((LinkedHashMap) fVar.f304h).get(Integer.valueOf(eVar.f483v));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (((WeakReference) it5.next()).get() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.e
    public final void f(ad.e eVar) {
        de.i.e(eVar, "download");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                ((Handler) fVar.f303g).post(new l(fVar, eVar, 1));
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            ((Handler) fVar.f299b).post(new j(eVar2, eVar, 1));
                        }
                    }
                }
                if (((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).J(eVar.f487z, eVar, jd.o.A);
                } else {
                    ((hd.a) fVar.f298a).A(eVar.f487z, eVar, jd.o.A);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
                List list = (List) ((LinkedHashMap) fVar.f304h).get(Integer.valueOf(eVar.f483v));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (((WeakReference) it5.next()).get() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.e
    public final void g(ad.e eVar, List list, int i) {
        de.i.e(eVar, "download");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                ((Handler) fVar.f303g).post(new l(fVar, eVar, 3));
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            ((Handler) fVar.f299b).post(new k(eVar2, eVar, list, i));
                        }
                    }
                }
                if (((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).J(eVar.f487z, eVar, jd.o.f7101x);
                } else {
                    ((hd.a) fVar.f298a).A(eVar.f487z, eVar, jd.o.f7101x);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
                List list2 = (List) ((LinkedHashMap) fVar.f304h).get(Integer.valueOf(eVar.f483v));
                if (list2 != null) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        if (((WeakReference) it5.next()).get() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.e
    public final void h(ad.e eVar, zc.b bVar, Throwable th) {
        de.i.e(eVar, "download");
        de.i.e(bVar, "error");
        ab.f fVar = this.f4919a;
        synchronized (fVar.f300c) {
            try {
                ((Handler) fVar.f303g).post(new l(fVar, eVar, 0));
                Iterator it = ((LinkedHashMap) fVar.f301d).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        zc.e eVar2 = (zc.e) ((WeakReference) it2.next()).get();
                        if (eVar2 == null) {
                            it2.remove();
                        } else {
                            ad.e eVar3 = eVar;
                            zc.b bVar2 = bVar;
                            Throwable th2 = th;
                            ((Handler) fVar.f299b).post(new v(eVar2, eVar3, bVar2, th2, 1));
                            eVar = eVar3;
                            bVar = bVar2;
                            th = th2;
                        }
                    }
                }
                ad.e eVar4 = eVar;
                if (((LinkedHashMap) fVar.f302e).isEmpty()) {
                    ((hd.a) fVar.f298a).J(eVar4.f487z, eVar4, jd.o.B);
                } else {
                    ((hd.a) fVar.f298a).A(eVar4.f487z, eVar4, jd.o.B);
                    Iterator it3 = ((LinkedHashMap) fVar.f302e).values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            if (((WeakReference) it4.next()).get() != null) {
                                throw new ClassCastException();
                            }
                            it4.remove();
                        }
                    }
                }
                List list = (List) ((LinkedHashMap) fVar.f304h).get(Integer.valueOf(eVar4.f483v));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (((WeakReference) it5.next()).get() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
