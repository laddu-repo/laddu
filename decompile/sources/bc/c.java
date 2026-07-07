package bc;

import de.i;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1604a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f1605b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f1605b;
        i.d(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0098 -> B:21:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ud.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof bc.b
            if (r0 == 0) goto L13
            r0 = r10
            bc.b r0 = (bc.b) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            bc.b r0 = new bc.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.D
            int r1 = r0.F
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r1 = r0.C
            java.util.Map r3 = r0.B
            bc.d r4 = r0.A
            java.util.Iterator r5 = r0.f1603z
            java.util.Map r6 = r0.f1602y
            fa.b.z(r10)
            goto L99
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            fa.b.z(r10)
            java.lang.String r10 = "dependencies"
            java.util.Map r1 = bc.c.f1605b
            de.i.d(r1, r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r3 = r1.size()
            int r3 = pd.s.R(r3)
            r10.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r3 = r10
            r5 = r1
        L58:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Lc4
            java.lang.Object r10 = r5.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r4 = r10.getKey()
            bc.d r4 = (bc.d) r4
            java.lang.Object r10 = r10.getValue()
            bc.a r10 = (bc.a) r10
            ac.g0 r6 = new ac.g0
            r7 = 1
            r6.<init>(r7, r10)
            r0.f1602y = r3
            r0.f1603z = r5
            r0.A = r4
            r0.B = r3
            r0.C = r1
            r0.F = r2
            d1.p r10 = new d1.p
            r7 = 0
            r8 = 3
            r10.<init>(r6, r7, r8)
            sd.i r6 = sd.i.f11797v
            java.lang.Object r10 = me.x.s(r6, r10, r0)
            td.a r6 = td.a.f12544v
            if (r10 != r6) goto L98
            return r6
        L98:
            r6 = r3
        L99:
            java.lang.String r10 = "subscriberName"
            de.i.e(r4, r10)
            bc.a r10 = a(r4)
            sa.i r10 = r10.f1601b
            if (r10 == 0) goto Lab
            r3.put(r1, r10)
            r3 = r6
            goto L58
        Lab:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Subscriber "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " has not been registered."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lc4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.c.b(ud.c):java.lang.Object");
    }
}
