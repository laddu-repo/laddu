package e7;

import android.graphics.PointF;
import j1.f0;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f4432i;
    public final PointF j;

    /* renamed from: k, reason: collision with root package name */
    public final i f4433k;

    /* renamed from: l, reason: collision with root package name */
    public final i f4434l;

    /* renamed from: m, reason: collision with root package name */
    public f0 f4435m;

    /* renamed from: n, reason: collision with root package name */
    public f0 f4436n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.f4432i = new PointF();
        this.j = new PointF();
        this.f4433k = iVar;
        this.f4434l = iVar2;
        i(this.f4407d);
    }

    @Override // e7.e
    public final Object e() {
        return l();
    }

    @Override // e7.e
    public final /* bridge */ /* synthetic */ Object f(o7.a aVar, float f3) {
        return l();
    }

    @Override // e7.e
    public final void i(float f3) {
        i iVar = this.f4433k;
        iVar.i(f3);
        i iVar2 = this.f4434l;
        iVar2.i(f3);
        this.f4432i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4404a;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).a();
                i6++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF l() {
        /*
            r12 = this;
            j1.f0 r0 = r12.f4435m
            r1 = 0
            if (r0 == 0) goto L39
            e7.i r0 = r12.f4433k
            e7.b r2 = r0.f4406c
            o7.a r2 = r2.e()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.f10019h
            j1.f0 r4 = r12.f4435m
            float r5 = r2.f10018g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.f10013b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.f10014c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.c()
            float r10 = r0.d()
            float r11 = r0.f4407d
            java.lang.Object r0 = r4.U(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            j1.f0 r2 = r12.f4436n
            if (r2 == 0) goto L71
            e7.i r2 = r12.f4434l
            e7.b r3 = r2.f4406c
            o7.a r3 = r3.e()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.f10019h
            j1.f0 r4 = r12.f4436n
            float r5 = r3.f10018g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.f10013b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.f10014c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.c()
            float r10 = r2.d()
            float r11 = r2.f4407d
            java.lang.Object r1 = r4.U(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            r2 = 0
            android.graphics.PointF r3 = r12.f4432i
            android.graphics.PointF r4 = r12.j
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
        throw new UnsupportedOperationException("Method not decompiled: e7.o.l():android.graphics.PointF");
    }
}
