package pe;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements qe.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final sd.h f10557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final oe.a f10559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f10560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f10561z;

    public b(Object obj, sd.h hVar, int i, oe.a aVar, int i10) {
        this.f10560y = i10;
        this.f10557v = hVar;
        this.f10558w = i;
        this.f10559x = aVar;
        this.f10561z = obj;
    }

    public final Object a(d dVar, ud.c cVar) throws Throwable {
        cb.e eVar = new cb.e(dVar, this, null, 6);
        re.q qVar = new re.q(cVar, cVar.f());
        Object objT = com.bumptech.glide.e.t(qVar, qVar, eVar);
        return objT == td.a.f12544v ? objT : od.l.f10126a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        sd.i iVar = sd.i.f11797v;
        sd.h hVar = this.f10557v;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i = this.f10558w;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        oe.a aVar = oe.a.f10127v;
        oe.a aVar2 = this.f10559x;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + pd.j.I(arrayList, ", ", null, null, null, 62) + ']';
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    @Override // pe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(pe.d r7, ud.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f10560y
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r7 = r6.a(r7, r8)
            return r7
        La:
            int r0 = r6.f10558w
            r1 = -3
            td.a r2 = td.a.f12544v
            od.l r3 = od.l.f10126a
            if (r0 != r1) goto L7e
            sd.h r0 = r8.f()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            me.q r4 = new me.q
            r5 = 0
            r4.<init>(r5)
            sd.h r5 = r6.f10557v
            java.lang.Object r1 = r5.m(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L32
            sd.h r1 = r0.n0(r5)
            goto L37
        L32:
            r1 = 0
            sd.h r1 = me.x.d(r0, r5, r1)
        L37:
            boolean r4 = de.i.a(r1, r0)
            if (r4 == 0) goto L4d
            java.lang.Object r0 = r6.f10561z
            pe.c r0 = (pe.c) r0
            java.lang.Object r7 = r0.g(r7, r8)
            if (r7 != r2) goto L48
            goto L49
        L48:
            r7 = r3
        L49:
            if (r7 != r2) goto L85
        L4b:
            r3 = r7
            goto L85
        L4d:
            sd.d r4 = sd.d.f11796v
            sd.f r5 = r1.A(r4)
            sd.f r0 = r0.A(r4)
            boolean r0 = de.i.a(r5, r0)
            if (r0 == 0) goto L7e
            sd.h r0 = r8.f()
            boolean r4 = r7 instanceof qe.i
            if (r4 != 0) goto L6b
            pe.o r4 = new pe.o
            r4.<init>(r7, r0)
            r7 = r4
        L6b:
            ac.o r0 = new ac.o
            r4 = 0
            r5 = 14
            r0.<init>(r6, r4, r5)
            java.lang.Object r4 = re.a.k(r1)
            java.lang.Object r7 = qe.b.a(r1, r7, r4, r0, r8)
            if (r7 != r2) goto L85
            goto L4b
        L7e:
            java.lang.Object r7 = r6.a(r7, r8)
            if (r7 != r2) goto L85
            goto L4b
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.b.g(pe.d, ud.c):java.lang.Object");
    }

    public final String toString() {
        switch (this.f10560y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return "block[" + ((cb.e) this.f10561z) + "] -> " + b();
            default:
                return ((c) this.f10561z) + " -> " + b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    @Override // qe.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pe.c y(sd.h r8, int r9, oe.a r10) {
        /*
            r7 = this;
            sd.h r0 = r7.f10557v
            sd.h r3 = r8.n0(r0)
            oe.a r8 = oe.a.f10127v
            oe.a r1 = r7.f10559x
            int r2 = r7.f10558w
            if (r10 == r8) goto L11
            r5 = r10
        Lf:
            r4 = r9
            goto L29
        L11:
            r8 = -3
            if (r2 != r8) goto L15
            goto L27
        L15:
            if (r9 != r8) goto L19
        L17:
            r9 = r2
            goto L27
        L19:
            r8 = -2
            if (r2 != r8) goto L1d
            goto L27
        L1d:
            if (r9 != r8) goto L20
            goto L17
        L20:
            int r9 = r9 + r2
            if (r9 < 0) goto L24
            goto L27
        L24:
            r9 = 2147483647(0x7fffffff, float:NaN)
        L27:
            r5 = r1
            goto Lf
        L29:
            boolean r8 = de.i.a(r3, r0)
            if (r8 == 0) goto L34
            if (r4 != r2) goto L34
            if (r5 != r1) goto L34
            return r7
        L34:
            int r8 = r7.f10560y
            switch(r8) {
                case 0: goto L45;
                default: goto L39;
            }
        L39:
            pe.b r1 = new pe.b
            java.lang.Object r8 = r7.f10561z
            r2 = r8
            pe.c r2 = (pe.c) r2
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            goto L50
        L45:
            pe.b r1 = new pe.b
            java.lang.Object r8 = r7.f10561z
            r2 = r8
            cb.e r2 = (cb.e) r2
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.b.y(sd.h, int, oe.a):pe.c");
    }
}
