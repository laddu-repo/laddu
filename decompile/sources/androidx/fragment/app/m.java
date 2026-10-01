package androidx.fragment.app;

import android.util.Log;
import java.util.Objects;
import k8.n4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f1051w;

    public /* synthetic */ m(int i, Object obj) {
        this.f1050v = i;
        this.f1051w = obj;
    }

    private final void a() {
        n8.a aVar = (n8.a) this.f1051w;
        synchronized (aVar.f9018a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f9025j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.f9020c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        o8.l lVar = (o8.l) this.f1051w;
        synchronized (lVar.f9977x) {
            try {
                o8.b bVar = (o8.b) lVar.f9978y;
                if (bVar != null) {
                    bVar.m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.run():void");
    }

    public m(k8.b1 b1Var, boolean z2) {
        this.f1050v = 11;
        this.f1051w = b1Var;
    }

    public m(n4 n4Var, androidx.emoji2.text.p pVar) {
        this.f1050v = 15;
        this.f1051w = n4Var;
    }

    public m(s7.h hVar, c6.i iVar) {
        this.f1050v = 29;
        Objects.requireNonNull(hVar);
        this.f1051w = iVar;
    }

    public m(s7.r rVar) {
        this.f1050v = 28;
        Objects.requireNonNull(rVar);
        this.f1051w = rVar;
    }
}
