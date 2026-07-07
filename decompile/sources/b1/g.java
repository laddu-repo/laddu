package b1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends ne.j implements ve.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ List C;
    public final /* synthetic */ ArrayList D;

    /* renamed from: x, reason: collision with root package name */
    public Iterator f1294x;

    /* renamed from: y, reason: collision with root package name */
    public d f1295y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1296z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, le.c cVar) {
        super(2, cVar);
        this.C = list;
        this.D = arrayList;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        g gVar = new g(this.C, this.D, cVar);
        gVar.B = obj;
        return gVar;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create(obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A
            r1 = 2
            r2 = 1
            me.a r3 = me.a.f8833x
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            java.util.Iterator r0 = r9.f1294x
            java.lang.Object r4 = r9.B
            java.util.List r4 = (java.util.List) r4
            he.a.f(r10)
            goto L3c
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r0 = r9.f1296z
            b1.d r4 = r9.f1295y
            java.util.Iterator r5 = r9.f1294x
            java.lang.Object r6 = r9.B
            java.util.List r6 = (java.util.List) r6
            he.a.f(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L5e
        L2f:
            he.a.f(r10)
            java.lang.Object r10 = r9.B
            java.util.List r0 = r9.C
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r4 = r9.D
        L3c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r0.next()
            b1.d r5 = (b1.d) r5
            r9.B = r4
            r9.f1294x = r0
            r9.f1295y = r5
            r9.f1296z = r10
            r9.A = r2
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r3) goto L59
            goto L7f
        L59:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L5e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L82
            b1.f r10 = new b1.f
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.B = r4
            r9.f1294x = r5
            r9.f1295y = r7
            r9.f1296z = r7
            r9.A = r1
            java.lang.Object r10 = r6.migrate(r0, r9)
            if (r10 != r3) goto L80
        L7f:
            return r3
        L80:
            r0 = r5
            goto L3c
        L82:
            r10 = r0
            goto L80
        L84:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
