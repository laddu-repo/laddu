package te;

import de.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public int A;
    public boolean B;
    public final /* synthetic */ c C;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m f12546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f12547w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f12548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f12550z;

    public a(c cVar, int i) {
        this.C = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f12546v = new m();
        this.f12547w = new p();
        this.f12548x = b.f12554y;
        this.nextParkedWorker = c.F;
        int iNanoTime = (int) System.nanoTime();
        this.A = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = te.m.f12577d.get(r9);
        r0 = te.m.f12576c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (te.m.f12578e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.b(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final te.i a(boolean r12) {
        /*
            r11 = this;
            te.b r0 = r11.f12548x
            te.c r2 = r11.C
            r7 = 0
            r8 = 1
            te.m r9 = r11.f12546v
            te.b r10 = te.b.f12551v
            if (r0 != r10) goto Le
            goto L84
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = te.c.D
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = te.m.f12575b
            java.lang.Object r0 = r12.get(r9)
            te.i r0 = (te.i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f12567w
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = te.m.f12577d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = te.m.f12576c
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = te.m.f12578e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            te.i r1 = r9.b(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            te.f r12 = r2.A
            java.lang.Object r12 = r12.d()
            te.i r12 = (te.i) r12
            if (r12 != 0) goto L71
            te.i r12 = r11.i(r8)
        L71:
            return r12
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = te.c.D
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f12548x = r10
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r2.f12556v
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            te.i r12 = r11.e()
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = te.m.f12575b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            te.i r12 = (te.i) r12
            if (r12 != 0) goto Lac
            te.i r12 = r9.a()
        Lac:
            if (r12 == 0) goto Laf
            return r12
        Laf:
            if (r8 != 0) goto Lbf
            te.i r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lb8:
            te.i r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lbf:
            r12 = 3
            te.i r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.a(boolean):te.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i10 = this.A;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.A = i13;
        int i14 = i - 1;
        return (i14 & i) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.C;
        if (iD == 0) {
            i iVar = (i) cVar.f12560z.d();
            return iVar != null ? iVar : (i) cVar.A.d();
        }
        i iVar2 = (i) cVar.A.d();
        return iVar2 != null ? iVar2 : (i) cVar.f12560z.d();
    }

    public final void f(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.C.f12559y);
        sb2.append("-worker-");
        sb2.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb2.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f12548x;
        boolean z2 = bVar2 == b.f12551v;
        if (z2) {
            c.D.addAndGet(this.C, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f12548x = bVar;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final te.i i(int r26) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.i(int):te.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.run():void");
    }
}
