package p4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.k4;
import me.y0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f10325k = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f10329d;
    public final String[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f10331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k4 f10332h;
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ce.a f10333j = new ac.j0(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f10330e = new LinkedHashMap();

    public l0(u uVar, HashMap map, HashMap map2, String[] strArr, boolean z2, y0 y0Var) {
        String lowerCase;
        this.f10326a = uVar;
        this.f10327b = map;
        this.f10328c = z2;
        this.f10329d = y0Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            de.i.d(lowerCase2, "toLowerCase(...)");
            this.f10330e.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f10327b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                de.i.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f = strArr2;
        for (Map.Entry entry : this.f10327b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            de.i.d(lowerCase3, "toLowerCase(...)");
            if (this.f10330e.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                de.i.d(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f10330e;
                linkedHashMap.put(lowerCase4, pd.s.Q(linkedHashMap, lowerCase3));
            }
        }
        this.f10331g = new k(this.f.length);
        int length2 = this.f.length;
        k4 k4Var = new k4();
        k4Var.f7607v = new pe.x(new int[length2]);
        this.f10332h = k4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(p4.l0 r4, p4.m r5, ud.c r6) {
        /*
            boolean r0 = r6 instanceof p4.e0
            if (r0 == 0) goto L13
            r0 = r6
            p4.e0 r0 = (p4.e0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            p4.e0 r0 = new p4.e0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f10295z
            int r6 = r0.B
            r1 = 2
            r2 = 1
            td.a r3 = td.a.f12544v
            if (r6 == 0) goto L3e
            if (r6 == r2) goto L36
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.f10294y
            java.util.Set r5 = (java.util.Set) r5
            fa.b.z(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.f10294y
            p4.m r5 = (p4.m) r5
            fa.b.z(r4)
            goto L54
        L3e:
            fa.b.z(r4)
            ac.r r4 = new ac.r
            r6 = 4
            r4.<init>(r6)
            r0.f10294y = r5
            r0.B = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.c(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L68
        L54:
            java.util.Set r4 = (java.util.Set) r4
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L69
            r0.f10294y = r4
            r0.B = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = android.support.v4.media.session.b.m(r5, r6, r0)
            if (r5 != r3) goto L69
        L68:
            return r3
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.l0.a(p4.l0, p4.m, ud.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(p4.l0 r8, ud.c r9) throws java.lang.Throwable {
        /*
            p4.u r0 = r8.f10326a
            boolean r1 = r9 instanceof p4.f0
            if (r1 == 0) goto L15
            r1 = r9
            p4.f0 r1 = (p4.f0) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            p4.f0 r1 = new p4.f0
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f10299z
            int r2 = r1.B
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            hd.a r0 = r1.f10298y
            fa.b.z(r9)     // Catch: java.lang.Throwable -> L29
            goto L7f
        L29:
            r8 = move-exception
            goto L9f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            fa.b.z(r9)
            hd.a r9 = r0.f
            boolean r2 = r9.n()
            pd.r r4 = pd.r.f10553v
            if (r2 == 0) goto La3
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.i     // Catch: java.lang.Throwable -> L9d
            r5 = 0
            boolean r2 = r2.compareAndSet(r3, r5)     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L4e
            r9.P()
            return r4
        L4e:
            ce.a r2 = r8.f10333j     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L9d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L9d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L60
            r9.P()
            return r4
        L60:
            p4.g0 r2 = new p4.g0     // Catch: java.lang.Throwable -> L9d
            r4 = 1
            r6 = 0
            r2.<init>(r8, r6, r4)     // Catch: java.lang.Throwable -> L9d
            r1.f10298y = r9     // Catch: java.lang.Throwable -> L9d
            r1.B = r3     // Catch: java.lang.Throwable -> L9d
            b0.e r0 = r0.f10358d     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L95
            java.lang.Object r0 = r0.f     // Catch: java.lang.Throwable -> L9d
            r4.b r0 = (r4.b) r0     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r0.w(r5, r2, r1)     // Catch: java.lang.Throwable -> L9d
            td.a r1 = td.a.f12544v
            if (r0 != r1) goto L7c
            return r1
        L7c:
            r7 = r0
            r0 = r9
            r9 = r7
        L7f:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L29
            boolean r1 = r9.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L91
            k8.k4 r1 = r8.f10332h     // Catch: java.lang.Throwable -> L29
            r1.u(r9)     // Catch: java.lang.Throwable -> L29
            me.y0 r8 = r8.f10329d     // Catch: java.lang.Throwable -> L29
            r8.a(r9)     // Catch: java.lang.Throwable -> L29
        L91:
            r0.P()
            return r9
        L95:
            java.lang.String r8 = "connectionManager"
            de.i.i(r8)     // Catch: java.lang.Throwable -> L9d
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9b:
            r0 = r9
            goto L9f
        L9d:
            r8 = move-exception
            goto L9b
        L9f:
            r0.P()
            throw r8
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.l0.b(p4.l0, ud.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d6 -> B:28:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(p4.l0 r12, p4.d0 r13, int r14, ud.c r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.l0.c(p4.l0, p4.d0, int, ud.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008d -> B:19:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(p4.l0 r7, p4.d0 r8, int r9, ud.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof p4.i0
            if (r0 == 0) goto L16
            r0 = r10
            p4.i0 r0 = (p4.i0) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.F = r1
            goto L1b
        L16:
            p4.i0 r0 = new p4.i0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.D
            int r1 = r0.F
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r7 = r0.C
            int r8 = r0.B
            java.lang.String[] r9 = r0.A
            java.lang.String r1 = r0.f10312z
            p4.m r3 = r0.f10311y
            fa.b.z(r10)
            r10 = r9
            r9 = r3
            goto L90
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            fa.b.z(r10)
            java.lang.String[] r7 = r7.f
            r7 = r7[r9]
            java.lang.String[] r9 = p4.l0.f10325k
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4e:
            if (r8 >= r7) goto L92
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.f10311y = r9
            r0.f10312z = r1
            r0.A = r10
            r0.B = r8
            r0.C = r7
            r0.F = r2
            java.lang.Object r3 = android.support.v4.media.session.b.m(r9, r3, r0)
            td.a r4 = td.a.f12544v
            if (r3 != r4) goto L90
            return r4
        L90:
            int r8 = r8 + r2
            goto L4e
        L92:
            od.l r7 = od.l.f10126a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.l0.d(p4.l0, p4.d0, int, ud.c):java.lang.Object");
    }

    public final void e(ce.a aVar, ce.a aVar2) {
        de.i.e(aVar, "onRefreshScheduled");
        de.i.e(aVar2, "onRefreshCompleted");
        if (this.i.compareAndSet(false, true)) {
            aVar.b();
            re.c cVar = this.f10326a.f10355a;
            sd.c cVar2 = null;
            if (cVar != null) {
                me.x.k(cVar, new me.u(), new ac.o(this, aVar2, cVar2, 12), 2);
            } else {
                de.i.i("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ud.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p4.j0
            if (r0 == 0) goto L13
            r0 = r7
            p4.j0 r0 = (p4.j0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            p4.j0 r0 = new p4.j0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f10318z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            hd.a r0 = r0.f10317y
            fa.b.z(r7)     // Catch: java.lang.Throwable -> L27
            goto L5c
        L27:
            r7 = move-exception
            goto L6a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            fa.b.z(r7)
            p4.u r7 = r6.f10326a
            hd.a r1 = r7.f
            boolean r3 = r1.n()
            if (r3 == 0) goto L6e
            cb.e r3 = new cb.e     // Catch: java.lang.Throwable -> L68
            r4 = 5
            r5 = 0
            r3.<init>(r6, r5, r4)     // Catch: java.lang.Throwable -> L68
            r0.f10317y = r1     // Catch: java.lang.Throwable -> L68
            r0.B = r2     // Catch: java.lang.Throwable -> L68
            b0.e r7 = r7.f10358d     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L60
            java.lang.Object r7 = r7.f     // Catch: java.lang.Throwable -> L68
            r4.b r7 = (r4.b) r7     // Catch: java.lang.Throwable -> L68
            r2 = 0
            java.lang.Object r7 = r7.w(r2, r3, r0)     // Catch: java.lang.Throwable -> L68
            td.a r0 = td.a.f12544v
            if (r7 != r0) goto L5b
            return r0
        L5b:
            r0 = r1
        L5c:
            r0.P()
            goto L6e
        L60:
            java.lang.String r7 = "connectionManager"
            de.i.i(r7)     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L66:
            r0 = r1
            goto L6a
        L68:
            r7 = move-exception
            goto L66
        L6a:
            r0.P()
            throw r7
        L6e:
            od.l r7 = od.l.f10126a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.l0.f(ud.c):java.lang.Object");
    }
}
