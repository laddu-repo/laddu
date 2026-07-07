package androidx.emoji2.text;

import c2.o1;
import c2.r0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f937w;

    public /* synthetic */ v(int i, Object obj) {
        this.f936v = i;
        this.f937w = obj;
    }

    private final void a() {
        o1 o1Var = (o1) this.f937w;
        try {
            synchronized (o1Var) {
            }
            try {
                o1Var.f1875a.c(o1Var.f1877c, o1Var.f1878d);
            } finally {
                o1Var.a(true);
            }
        } catch (c2.o e7) {
            w1.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0114 A[LOOP:0: B:27:0x0059->B:76:0x0114, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118 A[EDGE_INSN: B:94:0x0118->B:77:0x0118 BREAK  A[LOOP:0: B:27:0x0059->B:76:0x0114], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.v.b():void");
    }

    private final void c() {
        gd.a aVar = (gd.a) this.f937w;
        synchronized (aVar.f5830a) {
            try {
                Iterator it = aVar.f5830a.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.v.run():void");
    }

    public /* synthetic */ v(r0 r0Var, o1 o1Var) {
        this.f936v = 8;
        this.f937w = o1Var;
    }

    public /* synthetic */ v(gd.a aVar, List list, jd.o oVar, ad.e eVar) {
        this.f936v = 22;
        this.f937w = aVar;
    }
}
