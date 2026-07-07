package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: x, reason: collision with root package name */
    public c f11237x;

    /* renamed from: y, reason: collision with root package name */
    public c f11238y;

    /* renamed from: z, reason: collision with root package name */
    public final WeakHashMap f11239z = new WeakHashMap();
    public int A = 0;

    public c a(Object obj) {
        c cVar = this.f11237x;
        while (cVar != null && !cVar.f11231x.equals(obj)) {
            cVar = cVar.f11233z;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a10 = a(obj);
        if (a10 == null) {
            return null;
        }
        this.A--;
        WeakHashMap weakHashMap = this.f11239z;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a10);
            }
        }
        c cVar = a10.A;
        if (cVar != null) {
            cVar.f11233z = a10.f11233z;
        } else {
            this.f11237x = a10.f11233z;
        }
        c cVar2 = a10.f11233z;
        if (cVar2 != null) {
            cVar2.A = cVar;
        } else {
            this.f11238y = cVar;
        }
        a10.f11233z = null;
        a10.A = null;
        return a10.f11232y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((r.b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof r.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r.f r7 = (r.f) r7
            int r1 = r6.A
            int r3 = r7.A
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            r.b r3 = (r.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            r.b r4 = (r.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            r.b r7 = (r.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i6 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i6 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i6;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f11237x, this.f11238y, 0);
        this.f11239z.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb2.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
