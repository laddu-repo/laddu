package b1;

import gf.i1;
import gf.j1;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kf.f1;
import kf.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 implements h {
    public static final LinkedHashSet j = new LinkedHashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f1297k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.l f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1299b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1300c;

    /* renamed from: d, reason: collision with root package name */
    public final lc.c f1301d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1302e = ".tmp";

    /* renamed from: f, reason: collision with root package name */
    public final he.m f1303f = he.a.d(new v(this, 0));

    /* renamed from: g, reason: collision with root package name */
    public final f1 f1304g = y0.c(i0.f1307a);

    /* renamed from: h, reason: collision with root package name */
    public List f1305h;

    /* renamed from: i, reason: collision with root package name */
    public final c6.h f1306i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [c6.h, java.lang.Object] */
    public g0(ve.a aVar, l lVar, List list, b bVar, gf.c0 c0Var) {
        this.f1298a = (kotlin.jvm.internal.l) aVar;
        this.f1299b = lVar;
        this.f1300c = bVar;
        le.c cVar = null;
        this.f1301d = new lc.c((ve.p) new s(this, cVar, 1));
        this.f1305h = ie.j.Z(list);
        r rVar = new r(this, 0);
        s sVar = new s(this, cVar, 0);
        ?? obj = new Object();
        obj.f1981x = c0Var;
        obj.f1982y = sVar;
        obj.f1983z = a.a.a(Integer.MAX_VALUE, 6, null);
        obj.A = new AtomicInteger(0);
        j1 j1Var = (j1) c0Var.getCoroutineContext().get(i1.f5682x);
        if (j1Var != null) {
            j1Var.y(new m(0, rVar, obj));
        }
        this.f1306i = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r8 != r5) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r1v10, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(b1.g0 r8, b1.o r9, ne.c r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.a(b1.g0, b1.o, ne.c):java.lang.Object");
    }

    public final File b() {
        return (File) this.f1303f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v8, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ne.c r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.c(ne.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ne.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b1.a0
            if (r0 == 0) goto L13
            r0 = r5
            b1.a0 r0 = (b1.a0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            b1.a0 r0 = new b1.a0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1270y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            b1.g0 r0 = r0.f1269x
            he.a.f(r5)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            he.a.f(r5)
            r0.f1269x = r4     // Catch: java.lang.Throwable -> L44
            r0.A = r2     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L44
            me.a r0 = me.a.f8833x
            if (r5 != r0) goto L41
            return r0
        L41:
            he.y r5 = he.y.f6101a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            kf.f1 r0 = r0.f1304g
            b1.k r1 = new b1.k
            r1.<init>(r5)
            r0.getClass()
            r2 = 0
            r0.h(r2, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.d(ne.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(ne.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b1.b0
            if (r0 == 0) goto L13
            r0 = r5
            b1.b0 r0 = (b1.b0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            b1.b0 r0 = new b1.b0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1273y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            b1.g0 r0 = r0.f1272x
            he.a.f(r5)     // Catch: java.lang.Throwable -> L27
            goto L51
        L27:
            r5 = move-exception
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            he.a.f(r5)
            r0.f1272x = r4     // Catch: java.lang.Throwable -> L41
            r0.A = r2     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L41
            me.a r0 = me.a.f8833x
            if (r5 != r0) goto L51
            return r0
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            kf.f1 r0 = r0.f1304g
            b1.k r1 = new b1.k
            r1.<init>(r5)
            r0.getClass()
            r5 = 0
            r0.h(r5, r1)
        L51:
            he.y r5 = he.y.f6101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.e(ne.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r0v11, types: [b1.g0] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b1.c0, le.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [b1.g0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v9, types: [b1.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ne.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b1.c0
            if (r0 == 0) goto L13
            r0 = r5
            b1.c0 r0 = (b1.c0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            b1.c0 r0 = new b1.c0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1279z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.io.FileInputStream r1 = r0.f1278y
            b1.g0 r0 = r0.f1277x
            he.a.f(r5)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r5 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            he.a.f(r5)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L60
            java.io.File r5 = r4.b()     // Catch: java.io.FileNotFoundException -> L60
            r1.<init>(r5)     // Catch: java.io.FileNotFoundException -> L60
            b1.l r5 = r4.f1299b     // Catch: java.lang.Throwable -> L58
            r0.f1277x = r4     // Catch: java.lang.Throwable -> L58
            r0.f1278y = r1     // Catch: java.lang.Throwable -> L58
            r0.B = r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r5 = r5.readFrom(r1, r0)     // Catch: java.lang.Throwable -> L58
            me.a r0 = me.a.f8833x
            if (r5 != r0) goto L50
            return r0
        L50:
            r0 = r4
        L51:
            r2 = 0
            jb.b.j(r1, r2)     // Catch: java.io.FileNotFoundException -> L56
            return r5
        L56:
            r5 = move-exception
            goto L62
        L58:
            r5 = move-exception
            r0 = r4
        L5a:
            throw r5     // Catch: java.lang.Throwable -> L5b
        L5b:
            r2 = move-exception
            jb.b.j(r1, r5)     // Catch: java.io.FileNotFoundException -> L56
            throw r2     // Catch: java.io.FileNotFoundException -> L56
        L60:
            r5 = move-exception
            r0 = r4
        L62:
            java.io.File r1 = r0.b()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L73
            b1.l r5 = r0.f1299b
            java.lang.Object r5 = r5.getDefaultValue()
            return r5
        L73:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.f(ne.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(ne.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b1.d0
            if (r0 == 0) goto L13
            r0 = r8
            b1.d0 r0 = (b1.d0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            b1.d0 r0 = new b1.d0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f1282z
            int r1 = r0.B
            r2 = 3
            r3 = 2
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r1 == 0) goto L53
            if (r1 == r4) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r1 = r0.f1281y
            java.lang.Object r0 = r0.f1280x
            b1.a r0 = (b1.a) r0
            he.a.f(r8)     // Catch: java.io.IOException -> L33
            return r1
        L33:
            r8 = move-exception
            goto L87
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r1 = r0.f1281y
            b1.a r1 = (b1.a) r1
            java.lang.Object r3 = r0.f1280x
            b1.g0 r3 = (b1.g0) r3
            he.a.f(r8)
            goto L77
        L49:
            java.lang.Object r1 = r0.f1280x
            b1.g0 r1 = (b1.g0) r1
            he.a.f(r8)     // Catch: b1.a -> L51
            return r8
        L51:
            r8 = move-exception
            goto L64
        L53:
            he.a.f(r8)
            r0.f1280x = r7     // Catch: b1.a -> L62
            r0.B = r4     // Catch: b1.a -> L62
            java.lang.Object r8 = r7.f(r0)     // Catch: b1.a -> L62
            if (r8 != r5) goto L61
            goto L83
        L61:
            return r8
        L62:
            r8 = move-exception
            r1 = r7
        L64:
            b1.b r4 = r1.f1300c
            r0.f1280x = r1
            r0.f1281y = r8
            r0.B = r3
            java.lang.Object r3 = r4.a(r8)
            if (r3 != r5) goto L73
            goto L83
        L73:
            r6 = r1
            r1 = r8
            r8 = r3
            r3 = r6
        L77:
            r0.f1280x = r1     // Catch: java.io.IOException -> L85
            r0.f1281y = r8     // Catch: java.io.IOException -> L85
            r0.B = r2     // Catch: java.io.IOException -> L85
            java.lang.Object r0 = r3.j(r8, r0)     // Catch: java.io.IOException -> L85
            if (r0 != r5) goto L84
        L83:
            return r5
        L84:
            return r8
        L85:
            r8 = move-exception
            r0 = r1
        L87:
            he.a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.g(ne.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(ve.p r11, le.h r12, ne.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof b1.e0
            if (r0 == 0) goto L13
            r0 = r13
            b1.e0 r0 = (b1.e0) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            b1.e0 r0 = new b1.e0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.A
            int r1 = r0.C
            java.lang.String r2 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            me.a r7 = me.a.f8833x
            if (r1 == 0) goto L47
            if (r1 == r5) goto L3b
            if (r1 != r4) goto L33
            java.lang.Object r11 = r0.f1287y
            b1.g0 r12 = r0.f1286x
            he.a.f(r13)
            goto La1
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r0.f1288z
            java.lang.Object r12 = r0.f1287y
            b1.c r12 = (b1.c) r12
            b1.g0 r1 = r0.f1286x
            he.a.f(r13)
            goto L7b
        L47:
            he.a.f(r13)
            kf.f1 r13 = r10.f1304g
            java.lang.Object r13 = r13.getValue()
            b1.c r13 = (b1.c) r13
            java.lang.Object r1 = r13.f1275a
            if (r1 == 0) goto L5b
            int r1 = r1.hashCode()
            goto L5c
        L5b:
            r1 = 0
        L5c:
            int r8 = r13.f1276b
            if (r1 != r8) goto Lbb
            java.lang.Object r1 = r13.f1275a
            androidx.lifecycle.c r8 = new androidx.lifecycle.c
            r9 = 4
            r8.<init>(r11, r1, r6, r9)
            r0.f1286x = r10
            r0.f1287y = r13
            r0.f1288z = r1
            r0.C = r5
            java.lang.Object r11 = gf.f0.J(r12, r8, r0)
            if (r11 != r7) goto L77
            goto L9e
        L77:
            r12 = r13
            r13 = r11
            r11 = r1
            r1 = r10
        L7b:
            java.lang.Object r5 = r12.f1275a
            if (r5 == 0) goto L84
            int r5 = r5.hashCode()
            goto L85
        L84:
            r5 = 0
        L85:
            int r12 = r12.f1276b
            if (r5 != r12) goto Lb5
            boolean r12 = kotlin.jvm.internal.k.a(r11, r13)
            if (r12 == 0) goto L90
            return r11
        L90:
            r0.f1286x = r1
            r0.f1287y = r13
            r0.f1288z = r6
            r0.C = r4
            java.lang.Object r11 = r1.j(r13, r0)
            if (r11 != r7) goto L9f
        L9e:
            return r7
        L9f:
            r11 = r13
            r12 = r1
        La1:
            kf.f1 r12 = r12.f1304g
            b1.c r13 = new b1.c
            if (r11 == 0) goto Lab
            int r3 = r11.hashCode()
        Lab:
            r13.<init>(r11, r3)
            r12.getClass()
            r12.h(r6, r13)
            return r11
        Lb5:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        Lbb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.h(ve.p, le.h, ne.c):java.lang.Object");
    }

    public final Object i(ve.p pVar, le.c cVar) {
        gf.q a10 = gf.f0.a();
        this.f1306i.u(new o(pVar, a10, (h0) this.f1304g.getValue(), cVar.getContext()));
        return a10.p(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[Catch: IOException -> 0x00c4, TRY_ENTER, TryCatch #1 {IOException -> 0x00c4, blocks: (B:15:0x009d, B:20:0x00ad, B:21:0x00c3, B:28:0x00cb, B:29:0x00ce, B:25:0x00c9), top: B:7:0x001f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r7, ne.c r8) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g0.j(java.lang.Object, ne.c):java.lang.Object");
    }
}
