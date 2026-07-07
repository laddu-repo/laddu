package r4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k8.g1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements v4.a, ue.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v4.a f11189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ue.a f11190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public sd.h f11191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Throwable f11192y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g1 f11193z;

    public h(v4.a aVar) {
        ue.c cVar = new ue.c();
        de.i.e(aVar, "delegate");
        this.f11189v = aVar;
        this.f11190w = cVar;
        this.f11193z = new g1(this);
    }

    @Override // ue.a
    public final Object a(ud.c cVar) {
        return this.f11190w.a(cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        g1 g1Var = this.f11193z;
        if (g1Var != null) {
            g1Var.n(-1);
        }
        this.f11189v.close();
    }

    @Override // v4.a
    public final boolean f() {
        return this.f11189v.f();
    }

    @Override // ue.a
    public final void i(Object obj) {
        this.f11190w.i(null);
    }

    @Override // v4.a
    public final v4.c j0(String str) {
        de.i.e(str, "sql");
        g1 g1Var = this.f11193z;
        if (g1Var == null) {
            return this.f11189v.j0(str);
        }
        Object objH = g1Var.h(str);
        de.i.b(objH);
        return new g((v4.c) objH);
    }

    public final void l(StringBuilder sb2) {
        List listS;
        Iterable iterableS;
        int i;
        if (this.f11191x == null && this.f11192y == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
        } else {
            sb2.append("\t\tStatus: Acquired connection");
            sb2.append('\n');
            sd.h hVar = this.f11191x;
            if (hVar != null) {
                sb2.append("\t\tCoroutine: " + hVar);
                sb2.append('\n');
            }
            Throwable th = this.f11192y;
            if (th != null) {
                sb2.append("\t\tAcquired:");
                sb2.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                de.i.d(string, "toString(...)");
                ke.c cVar = new ke.c(string);
                if (cVar.hasNext()) {
                    Object next = cVar.next();
                    if (cVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (cVar.hasNext()) {
                            arrayList.add(cVar.next());
                        }
                        listS = arrayList;
                    } else {
                        listS = fa.b.s(next);
                    }
                } else {
                    listS = pd.p.f10551v;
                }
                int size = listS.size() - 1;
                if (size <= 0) {
                    iterableS = pd.p.f10551v;
                } else if (size == 1) {
                    iterableS = fa.b.s(pd.j.J(listS));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (listS instanceof RandomAccess) {
                        int size2 = listS.size();
                        for (int i10 = 1; i10 < size2; i10++) {
                            arrayList2.add(listS.get(i10));
                        }
                    } else {
                        ListIterator listIterator = listS.listIterator(1);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableS = arrayList2;
                }
                Iterator it = iterableS.iterator();
                while (it.hasNext()) {
                    sb2.append("\t\t" + ((String) it.next()));
                    sb2.append('\n');
                }
            }
        }
        if (this.f11193z != null) {
            StringBuilder sb3 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            g1 g1Var = this.f11193z;
            synchronized (((w.b) g1Var.f9750g)) {
                i = g1Var.f9747c;
            }
            sb3.append(i);
            sb2.append(sb3.toString());
            sb2.append('\n');
        }
    }

    public final String toString() {
        return this.f11189v.toString();
    }
}
