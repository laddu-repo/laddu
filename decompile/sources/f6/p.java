package f6;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import n9.a3;
import n9.h0;
import n9.h3;
import n9.l4;
import n9.m2;
import n9.n1;
import n9.u0;
import n9.x3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5059x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5060y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5061z;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f5059x = i6;
        this.B = obj;
        this.f5060y = obj2;
        this.f5061z = obj3;
        this.A = obj4;
    }

    private final void a() {
        h0 h0Var;
        h3 h3Var = (h3) this.f5060y;
        AtomicReference atomicReference = (AtomicReference) this.f5061z;
        l4 l4Var = (l4) this.A;
        x3 x3Var = (x3) this.B;
        synchronized (atomicReference) {
            try {
                h0Var = h3Var.B;
            } catch (RemoteException e10) {
                u0 u0Var = ((n1) h3Var.f4301y).C;
                n1.g(u0Var);
                u0Var.D.b(e10, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (h0Var == null) {
                u0 u0Var2 = ((n1) h3Var.f4301y).C;
                n1.g(u0Var2);
                u0Var2.D.a("[sgtm] Failed to get upload batches; not connected to service");
            } else {
                h0Var.y(l4Var, x3Var, new a3(h3Var, atomicReference));
                h3Var.q1();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:101|102|(1:104)(5:127|(1:129)(2:131|(1:133))|130|121|122)|105|(2:108|106)|109|110|111|112|(2:115|113)|116|117|(1:119)|120|121|122) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x044f, code lost:
    
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0485, code lost:
    
        r8.r().G.b(r3, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.p.run():void");
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i6, boolean z10) {
        this.f5059x = i6;
        this.f5060y = obj;
        this.f5061z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    public p(m2 m2Var, AtomicReference atomicReference, String str, String str2) {
        this.f5059x = 4;
        this.f5060y = atomicReference;
        this.f5061z = str;
        this.A = str2;
        Objects.requireNonNull(m2Var);
        this.B = m2Var;
    }
}
