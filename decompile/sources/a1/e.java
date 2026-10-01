package a1;

import android.util.Log;
import i4.h0;
import java.util.Date;
import n9.a1;
import nc.m;
import nc.n;
import s9.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f132x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f133y;

    public /* synthetic */ e(int i6, Object obj, Object obj2) {
        this.f132x = i6;
        this.f133y = obj;
    }

    private final void a() {
        boolean a10;
        m mVar = (m) this.f133y;
        synchronized (mVar) {
            a10 = mVar.a();
            if (a10) {
                mVar.j(true);
            }
        }
        if (!a10) {
            return;
        }
        n c10 = mVar.f9660q.c();
        mVar.f9659p.getClass();
        if (new Date(System.currentTimeMillis()).before(c10.f9663b)) {
            mVar.i();
            return;
        }
        cc.d dVar = (cc.d) mVar.f9654k;
        s9.n e10 = dVar.e();
        s9.n d10 = dVar.d();
        s9.n d11 = dg.b.r(e10, d10).d(mVar.f9652h, new h0(mVar, e10, d10, 9));
        dg.b.r(d11).j(mVar.f9652h, new b2.b(17, mVar, d11));
    }

    private final void b() {
        r9.a aVar = (r9.a) this.f133y;
        synchronized (aVar.f11887a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f11889c = 1;
                aVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (((l) this.f133y).f12274z) {
            ((s9.b) ((l) this.f133y).A).b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b3, code lost:
    
        if (r0.K1() >= 242600) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50, types: [sd.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [sd.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, lc.c] */
    /* JADX WARN: Type inference failed for: r2v26, types: [n9.c, n9.z3] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.e.run():void");
    }

    public /* synthetic */ e(Object obj, int i6) {
        this.f132x = i6;
        this.f133y = obj;
    }

    public e(a1 a1Var, boolean z10) {
        this.f132x = 9;
        this.f133y = a1Var;
    }
}
