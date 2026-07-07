package m5;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends e {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f8481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f8482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f8483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p2.c f8484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p2.c f8485n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.f8481j = new PointF();
        this.f8482k = iVar;
        this.f8483l = iVar2;
        i(this.f8458d);
    }

    @Override // m5.e
    public final Object e() {
        return l();
    }

    @Override // m5.e
    public final /* bridge */ /* synthetic */ Object f(w5.a aVar, float f) {
        return l();
    }

    @Override // m5.e
    public final void i(float f) {
        i iVar = this.f8482k;
        iVar.i(f);
        i iVar2 = this.f8483l;
        iVar2.i(f);
        this.i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8455a;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).b();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF l() {
        /*
            r12 = this;
            p2.c r0 = r12.f8484m
            r1 = 0
            if (r0 == 0) goto L39
            m5.i r0 = r12.f8482k
            m5.b r2 = r0.f8457c
            w5.a r2 = r2.i()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.f13903h
            p2.c r4 = r12.f8484m
            float r5 = r2.f13902g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.f13898b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.f13899c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.c()
            float r10 = r0.d()
            float r11 = r0.f8458d
            java.lang.Object r0 = r4.m(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            p2.c r2 = r12.f8485n
            if (r2 == 0) goto L71
            m5.i r2 = r12.f8483l
            m5.b r3 = r2.f8457c
            w5.a r3 = r3.i()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.f13903h
            p2.c r4 = r12.f8485n
            float r5 = r3.f13902g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.f13898b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.f13899c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.c()
            float r10 = r2.d()
            float r11 = r2.f8458d
            java.lang.Object r1 = r4.m(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            r2 = 0
            android.graphics.PointF r3 = r12.i
            android.graphics.PointF r4 = r12.f8481j
            if (r0 != 0) goto L7e
            float r0 = r3.x
            r4.set(r0, r2)
            goto L85
        L7e:
            float r0 = r0.floatValue()
            r4.set(r0, r2)
        L85:
            if (r1 != 0) goto L8f
            float r0 = r4.x
            float r1 = r3.y
            r4.set(r0, r1)
            return r4
        L8f:
            float r0 = r4.x
            float r1 = r1.floatValue()
            r4.set(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.o.l():android.graphics.PointF");
    }
}
