package d1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ud.h implements ce.p {
    public f1.d A;
    public Object B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ List E;
    public final /* synthetic */ ArrayList F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Iterator f3881z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, sd.c cVar) {
        super(2, cVar);
        this.E = list;
        this.F = arrayList;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        return ((g) l(obj, (sd.c) obj2)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        g gVar = new g(this.E, this.F, cVar);
        gVar.D = obj;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[RETURN] */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.C
            r1 = 2
            r2 = 1
            td.a r3 = td.a.f12544v
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            java.util.Iterator r0 = r10.f3881z
            java.lang.Object r4 = r10.D
            java.util.List r4 = (java.util.List) r4
            fa.b.z(r11)
            goto L3c
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r0 = r10.B
            f1.d r4 = r10.A
            java.util.Iterator r5 = r10.f3881z
            java.lang.Object r6 = r10.D
            java.util.List r6 = (java.util.List) r6
            fa.b.z(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L5e
        L2f:
            fa.b.z(r11)
            java.lang.Object r11 = r10.D
            java.util.List r0 = r10.E
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r4 = r10.F
        L3c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L96
            java.lang.Object r5 = r0.next()
            f1.d r5 = (f1.d) r5
            r10.D = r4
            r10.f3881z = r0
            r10.A = r5
            r10.B = r11
            r10.C = r2
            java.lang.Object r6 = r5.a(r11, r10)
            if (r6 != r3) goto L59
            goto L91
        L59:
            r9 = r0
            r0 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L5e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L94
            d1.f r11 = new d1.f
            r7 = 0
            r8 = 0
            r11.<init>(r6, r8, r7)
            r4.add(r11)
            r10.D = r4
            r10.f3881z = r5
            r10.A = r8
            r10.B = r8
            r10.C = r1
            g1.h r11 = r6.f5129b
            f1.f r7 = new f1.f
            od.j r8 = r6.f5132e
            java.lang.Object r8 = r8.getValue()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.util.Set r6 = r6.f
            r7.<init>(r8, r6)
            java.lang.Object r11 = r11.h(r7, r0, r10)
            if (r11 != r3) goto L92
        L91:
            return r3
        L92:
            r0 = r5
            goto L3c
        L94:
            r11 = r0
            goto L92
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.g.o(java.lang.Object):java.lang.Object");
    }
}
