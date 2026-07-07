package y2;

import db.c1;
import db.i0;
import db.k0;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements r {
    public static final int[] B = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final y1.c C = new y1.c(new u2.i(3));
    public static final y1.c D = new y1.c(new u2.i(4));
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public c1 f14926x;

    /* renamed from: z, reason: collision with root package name */
    public p.l f14928z = new Object();

    /* renamed from: y, reason: collision with root package name */
    public boolean f14927y = true;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // y2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized y2.o[] a(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            int[] r1 = y2.m.B     // Catch: java.lang.Throwable -> L2f
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r8 == 0) goto L23
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2f
            goto L24
        L23:
            r8 = 0
        L24:
            int r8 = a8.d.g(r8)     // Catch: java.lang.Throwable -> L2f
            r4 = -1
            if (r8 == r4) goto L31
            r6.b(r8, r0)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r7 = move-exception
            goto L55
        L31:
            int r7 = a8.d.h(r7)     // Catch: java.lang.Throwable -> L2f
            if (r7 == r4) goto L3c
            if (r7 == r8) goto L3c
            r6.b(r7, r0)     // Catch: java.lang.Throwable -> L2f
        L3c:
            r4 = 0
        L3d:
            if (r4 >= r2) goto L4b
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L2f
            if (r5 == r8) goto L48
            if (r5 == r7) goto L48
            r6.b(r5, r0)     // Catch: java.lang.Throwable -> L2f
        L48:
            int r4 = r4 + 1
            goto L3d
        L4b:
            y2.o[] r7 = new y2.o[r3]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r7 = r0.toArray(r7)     // Catch: java.lang.Throwable -> L2f
            y2.o[] r7 = (y2.o[]) r7     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r6)
            return r7
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.m.a(android.net.Uri, java.util.Map):y2.o[]");
    }

    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, g4.d] */
    public final void b(int i6, ArrayList arrayList) {
        int i10;
        int i11 = 2;
        int i12 = 0;
        switch (i6) {
            case 0:
                arrayList.add(new f4.a());
                return;
            case 1:
                arrayList.add(new f4.c());
                return;
            case 2:
                arrayList.add(new f4.d(0));
                return;
            case 3:
                arrayList.add(new z2.a());
                return;
            case 4:
                o b10 = C.b(0);
                if (b10 != null) {
                    arrayList.add(b10);
                    return;
                } else {
                    arrayList.add(new d3.b());
                    return;
                }
            case 5:
                arrayList.add(new e3.b());
                return;
            case 6:
                p.l lVar = this.f14928z;
                if (this.f14927y) {
                    i11 = 0;
                }
                arrayList.add(new q3.d(lVar, i11));
                return;
            case 7:
                arrayList.add(new r3.d(0));
                return;
            case 8:
                p.l lVar2 = this.f14928z;
                if (this.f14927y) {
                    i10 = 0;
                } else {
                    i10 = 32;
                }
                i0 i0Var = k0.f4008y;
                arrayList.add(new s3.j(lVar2, i10, null, null, c1.B, null));
                p.l lVar3 = this.f14928z;
                if (!this.f14927y) {
                    i12 = 16;
                }
                arrayList.add(new s3.m(lVar3, i12));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new f4.a0());
                return;
            case 11:
                if (this.f14926x == null) {
                    i0 i0Var2 = k0.f4008y;
                    this.f14926x = c1.B;
                }
                arrayList.add(new f4.f0(1, !this.f14927y ? 1 : 0, this.f14928z, new u1.y(0L), new f4.f(0, this.f14926x)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f5444c = 0;
                obj.f5445d = -1L;
                obj.f5447f = -1;
                obj.f5448g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new g3.a(this.A));
                return;
            case 15:
                o b11 = D.b(new Object[0]);
                if (b11 != null) {
                    arrayList.add(b11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new a3.d(!this.f14927y ? 1 : 0, this.f14928z));
                return;
            case 17:
                arrayList.add(new c3.a(1));
                return;
            case 18:
                arrayList.add(new b3.a(2));
                return;
            case 19:
                arrayList.add(new c3.a(0));
                return;
            case 20:
                arrayList.add(new b3.a(1));
                return;
            case 21:
                arrayList.add(new b3.a(0));
                return;
        }
    }
}
