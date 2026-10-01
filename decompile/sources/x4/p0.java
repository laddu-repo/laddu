package x4;

import gf.n1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f14619l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final w f14620a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14621b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14622c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14623d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f14624e;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f14626g;

    /* renamed from: h, reason: collision with root package name */
    public final a2.c f14627h;

    /* renamed from: i, reason: collision with root package name */
    public final w4.q0 f14628i;
    public final AtomicBoolean j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public ve.a f14629k = new d.a0(21);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f14625f = new LinkedHashMap();

    public p0(w wVar, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z10, n1 n1Var) {
        String str;
        this.f14620a = wVar;
        this.f14621b = hashMap;
        this.f14622c = hashMap2;
        this.f14623d = z10;
        this.f14624e = n1Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = strArr[i6];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.k.d(lowerCase, "toLowerCase(...)");
            this.f14625f.put(lowerCase, Integer.valueOf(i6));
            String str3 = (String) this.f14621b.get(strArr[i6]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                kotlin.jvm.internal.k.d(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i6] = lowerCase;
        }
        this.f14626g = strArr2;
        for (Map.Entry entry : this.f14621b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            kotlin.jvm.internal.k.d(lowerCase2, "toLowerCase(...)");
            if (this.f14625f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.k.d(lowerCase3, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f14625f;
                linkedHashMap.put(lowerCase3, ie.w.u(lowerCase2, linkedHashMap));
            }
        }
        this.f14627h = new a2.c(this.f14626g.length);
        this.f14628i = new w4.q0(this.f14626g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(x4.p0 r4, x4.o r5, ne.c r6) {
        /*
            boolean r0 = r6 instanceof x4.h0
            if (r0 == 0) goto L13
            r0 = r6
            x4.h0 r0 = (x4.h0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            x4.h0 r0 = new x4.h0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f14576y
            int r6 = r0.A
            r1 = 2
            r2 = 1
            me.a r3 = me.a.f8833x
            if (r6 == 0) goto L3e
            if (r6 == r2) goto L36
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.f14575x
            java.util.Set r5 = (java.util.Set) r5
            he.a.f(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.f14575x
            x4.o r5 = (x4.o) r5
            he.a.f(r4)
            goto L54
        L3e:
            he.a.f(r4)
            od.e0 r4 = new od.e0
            r6 = 6
            r4.<init>(r6)
            r0.f14575x = r5
            r0.A = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L68
        L54:
            java.util.Set r4 = (java.util.Set) r4
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L69
            r0.f14575x = r4
            r0.A = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = x4.c.d(r5, r6, r0)
            if (r5 != r3) goto L69
        L68:
            return r3
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.p0.a(x4.p0, x4.o, ne.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #0 {all -> 0x008e, blocks: (B:13:0x007b, B:15:0x0083, B:32:0x0046, B:36:0x0053, B:40:0x0065), top: B:31:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(x4.p0 r8, ne.c r9) {
        /*
            x4.w r0 = r8.f14620a
            boolean r1 = r9 instanceof x4.j0
            if (r1 == 0) goto L15
            r1 = r9
            x4.j0 r1 = (x4.j0) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            x4.j0 r1 = new x4.j0
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f14592z
            int r2 = r1.B
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            y1.c r8 = r1.f14591y
            x4.p0 r0 = r1.f14590x
            he.a.f(r9)     // Catch: java.lang.Throwable -> L2f
            r7 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            goto L7b
        L2f:
            r9 = move-exception
            goto L97
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            he.a.f(r9)
            y1.c r9 = r0.f14667g
            boolean r2 = r9.a()
            ie.t r4 = ie.t.f6848x
            if (r2 == 0) goto L9b
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.j     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            boolean r2 = r2.compareAndSet(r3, r5)     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L53
            r9.d()
            return r4
        L53:
            ve.a r2 = r8.f14629k     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L65
            r9.d()
            return r4
        L65:
            x4.k0 r2 = new x4.k0     // Catch: java.lang.Throwable -> L8e
            r4 = 0
            r6 = 1
            r2.<init>(r8, r4, r6)     // Catch: java.lang.Throwable -> L8e
            r1.f14590x = r8     // Catch: java.lang.Throwable -> L8e
            r1.f14591y = r9     // Catch: java.lang.Throwable -> L8e
            r1.B = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.s(r5, r2, r1)     // Catch: java.lang.Throwable -> L8e
            me.a r1 = me.a.f8833x
            if (r0 != r1) goto L7b
            return r1
        L7b:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L93
            w4.q0 r1 = r8.f14628i     // Catch: java.lang.Throwable -> L8e
            r1.e(r0)     // Catch: java.lang.Throwable -> L8e
            gf.n1 r8 = r8.f14624e     // Catch: java.lang.Throwable -> L8e
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L8e
            goto L93
        L8e:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L97
        L93:
            r9.d()
            return r0
        L97:
            r8.d()
            throw r9
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.p0.b(x4.p0, ne.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        if (x4.c.d(r6, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [x4.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00db -> B:11:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(x4.p0 r12, x4.g0 r13, int r14, ne.c r15) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.p0.c(x4.p0, x4.g0, int, ne.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v4, types: [x4.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0080 -> B:10:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(x4.p0 r6, x4.g0 r7, int r8, ne.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof x4.m0
            if (r0 == 0) goto L16
            r0 = r9
            x4.m0 r0 = (x4.m0) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.E = r1
            goto L1b
        L16:
            x4.m0 r0 = new x4.m0
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.C
            int r1 = r0.E
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r6 = r0.B
            int r7 = r0.A
            java.lang.String[] r8 = r0.f14608z
            java.lang.String r1 = r0.f14607y
            x4.o r3 = r0.f14606x
            he.a.f(r9)
            r9 = r8
            r8 = r3
            goto L83
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            he.a.f(r9)
            java.lang.String[] r6 = r6.f14626g
            r6 = r6[r8]
            java.lang.String[] r8 = x4.p0.f14619l
            r9 = 0
            r1 = 3
            r1 = r6
            r9 = r8
            r6 = 3
            r8 = r7
            r7 = 0
        L4c:
            if (r7 >= r6) goto L85
            r3 = r9[r7]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = w8.k.b(r5, r4, r3)
            r0.f14606x = r8
            r0.f14607y = r1
            r0.f14608z = r9
            r0.A = r7
            r0.B = r6
            r0.E = r2
            java.lang.Object r3 = x4.c.d(r8, r3, r0)
            me.a r4 = me.a.f8833x
            if (r3 != r4) goto L83
            return r4
        L83:
            int r7 = r7 + r2
            goto L4c
        L85:
            he.y r6 = he.y.f6101a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.p0.d(x4.p0, x4.g0, int, ne.c):java.lang.Object");
    }

    public final void e(ve.a onRefreshScheduled, ve.a onRefreshCompleted) {
        kotlin.jvm.internal.k.e(onRefreshScheduled, "onRefreshScheduled");
        kotlin.jvm.internal.k.e(onRefreshCompleted, "onRefreshCompleted");
        if (this.j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            gf.f0.w(this.f14620a.i(), new gf.b0("Room Invalidation Tracker Refresh"), new androidx.lifecycle.c(this, onRefreshCompleted, null, 18, false), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ne.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof x4.n0
            if (r0 == 0) goto L13
            r0 = r7
            x4.n0 r0 = (x4.n0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            x4.n0 r0 = new x4.n0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14614y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            y1.c r0 = r0.f14613x
            he.a.f(r7)     // Catch: java.lang.Throwable -> L27
            goto L54
        L27:
            r7 = move-exception
            goto L5a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            he.a.f(r7)
            x4.w r7 = r6.f14620a
            y1.c r1 = r7.f14667g
            boolean r3 = r1.a()
            if (r3 == 0) goto L5e
            x4.k0 r3 = new x4.k0     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r5 = 2
            r3.<init>(r6, r4, r5)     // Catch: java.lang.Throwable -> L58
            r0.f14613x = r1     // Catch: java.lang.Throwable -> L58
            r0.A = r2     // Catch: java.lang.Throwable -> L58
            r2 = 0
            java.lang.Object r7 = r7.s(r2, r3, r0)     // Catch: java.lang.Throwable -> L58
            me.a r0 = me.a.f8833x
            if (r7 != r0) goto L53
            return r0
        L53:
            r0 = r1
        L54:
            r0.d()
            goto L5e
        L58:
            r7 = move-exception
            r0 = r1
        L5a:
            r0.d()
            throw r7
        L5e:
            he.y r7 = he.y.f6101a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.p0.f(ne.c):java.lang.Object");
    }

    public final he.i g(String[] strArr) {
        je.i iVar = new je.i();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.k.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f14622c.get(lowerCase);
            if (set != null) {
                iVar.addAll(set);
            } else {
                iVar.add(str);
            }
        }
        String[] strArr2 = (String[]) android.support.v4.media.session.b.c(iVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = strArr2[i6];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.k.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) this.f14625f.get(lowerCase2);
            if (num != null) {
                iArr[i6] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
        }
        return new he.i(strArr2, iArr);
    }
}
