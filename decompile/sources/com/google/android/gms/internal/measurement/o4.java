package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2371g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile f4 f2372h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f2373i;

    /* renamed from: a, reason: collision with root package name */
    public final p4 f2374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2375b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2376c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f2377d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2379f;

    static {
        new AtomicReference();
        f2373i = new AtomicInteger();
    }

    public /* synthetic */ o4(p4 p4Var, String str, Object obj, int i6) {
        this.f2379f = i6;
        if (((Uri) p4Var.f2389b) != null) {
            this.f2374a = p4Var;
            this.f2375b = str;
            this.f2376c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public final Object a(Object obj) {
        switch (this.f2379f) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String obj2 = obj.toString();
                String str = this.f2375b;
                StringBuilder sb2 = new StringBuilder(str.length() + 25 + obj2.length());
                sb2.append("Invalid long value for ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(obj2);
                Log.e("PhenotypeFlag", sb2.toString());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (z3.f2544b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (z3.f2545c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String obj3 = obj.toString();
                String str3 = this.f2375b;
                StringBuilder sb3 = new StringBuilder(str3.length() + 28 + obj3.length());
                sb3.append("Invalid boolean value for ");
                sb3.append(str3);
                sb3.append(": ");
                sb3.append(obj3);
                Log.e("PhenotypeFlag", sb3.toString());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String obj4 = obj.toString();
                String str4 = this.f2375b;
                StringBuilder sb4 = new StringBuilder(str4.length() + 27 + obj4.length());
                sb4.append("Invalid double value for ");
                sb4.append(str4);
                sb4.append(": ");
                sb4.append(obj4);
                Log.e("PhenotypeFlag", sb4.toString());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0036, B:18:0x004a, B:21:0x0060, B:23:0x006d, B:25:0x0075, B:27:0x0085, B:29:0x0093, B:32:0x00b8, B:35:0x00c0, B:36:0x00c3, B:37:0x00c7, B:38:0x009c, B:40:0x00a0, B:42:0x00ae, B:44:0x00b4, B:48:0x00cc, B:49:0x00ce, B:52:0x0043, B:54:0x00cf), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0036, B:18:0x004a, B:21:0x0060, B:23:0x006d, B:25:0x0075, B:27:0x0085, B:29:0x0093, B:32:0x00b8, B:35:0x00c0, B:36:0x00c3, B:37:0x00c7, B:38:0x009c, B:40:0x00a0, B:42:0x00ae, B:44:0x00b4, B:48:0x00cc, B:49:0x00ce, B:52:0x0043, B:54:0x00cf), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0036, B:18:0x004a, B:21:0x0060, B:23:0x006d, B:25:0x0075, B:27:0x0085, B:29:0x0093, B:32:0x00b8, B:35:0x00c0, B:36:0x00c3, B:37:0x00c7, B:38:0x009c, B:40:0x00a0, B:42:0x00ae, B:44:0x00b4, B:48:0x00cc, B:49:0x00ce, B:52:0x0043, B:54:0x00cf), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.o4.f2373i
            int r0 = r0.get()
            int r1 = r9.f2377d
            if (r1 >= r0) goto Ld3
            monitor-enter(r9)
            int r1 = r9.f2377d     // Catch: java.lang.Throwable -> L57
            if (r1 >= r0) goto Lcf
            com.google.android.gms.internal.measurement.f4 r1 = com.google.android.gms.internal.measurement.o4.f2372h     // Catch: java.lang.Throwable -> L57
            cb.a r2 = cb.a.f2003x     // Catch: java.lang.Throwable -> L57
            r3 = 0
            if (r1 == 0) goto L5a
            cb.l r4 = r1.f2206b     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L5a
            java.lang.Object r2 = r4.get()     // Catch: java.lang.Throwable -> L57
            cb.g r2 = (cb.g) r2     // Catch: java.lang.Throwable -> L57
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.measurement.h4 r4 = (com.google.android.gms.internal.measurement.h4) r4     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.measurement.p4 r5 = r9.f2374a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.f2389b     // Catch: java.lang.Throwable -> L57
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = r9.f2375b     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L43
            v.l r4 = r4.f2242a     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L57
            v.l r4 = (v.l) r4     // Catch: java.lang.Throwable -> L57
            goto L47
        L43:
            r4.getClass()     // Catch: java.lang.Throwable -> L57
            r4 = r3
        L47:
            if (r4 != 0) goto L4a
            goto L5a
        L4a:
            java.lang.String r5 = ""
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r0 = move-exception
            goto Ld1
        L5a:
            r4 = r3
        L5b:
            if (r1 == 0) goto L5f
            r5 = 1
            goto L60
        L5f:
            r5 = 0
        L60:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            jb.b.i(r6, r5)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.measurement.p4 r5 = r9.f2374a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r5.f2389b     // Catch: java.lang.Throwable -> L57
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto Lcc
            android.content.Context r7 = r1.f2205a     // Catch: java.lang.Throwable -> L57
            boolean r7 = com.google.android.gms.internal.measurement.l4.a(r7, r6)     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L82
            android.content.Context r7 = r1.f2205a     // Catch: java.lang.Throwable -> L57
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.measurement.q4 r8 = com.google.android.gms.internal.measurement.q4.f2397x     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.measurement.g4 r6 = com.google.android.gms.internal.measurement.g4.a(r7, r6, r8)     // Catch: java.lang.Throwable -> L57
            goto L83
        L82:
            r6 = r3
        L83:
            if (r6 == 0) goto L98
            java.lang.String r7 = r9.f2375b     // Catch: java.lang.Throwable -> L57
            java.util.Map r6 = r6.b()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L98
            java.lang.Object r6 = r9.a(r6)     // Catch: java.lang.Throwable -> L57
            goto L99
        L98:
            r6 = r3
        L99:
            if (r6 == 0) goto L9c
            goto Lb8
        L9c:
            boolean r5 = r5.f2388a     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto Lb2
            android.content.Context r1 = r1.f2205a     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.measurement.j4 r1 = com.google.android.gms.internal.measurement.j4.c(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = r9.f2375b     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r1.e(r5)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto Lb2
            java.lang.Object r3 = r9.a(r1)     // Catch: java.lang.Throwable -> L57
        Lb2:
            if (r3 != 0) goto Lb7
            java.lang.Object r6 = r9.f2376c     // Catch: java.lang.Throwable -> L57
            goto Lb8
        Lb7:
            r6 = r3
        Lb8:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto Lc7
            if (r4 != 0) goto Lc3
            java.lang.Object r6 = r9.f2376c     // Catch: java.lang.Throwable -> L57
            goto Lc7
        Lc3:
            java.lang.Object r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L57
        Lc7:
            r9.f2378e = r6     // Catch: java.lang.Throwable -> L57
            r9.f2377d = r0     // Catch: java.lang.Throwable -> L57
            goto Lcf
        Lcc:
            android.content.Context r0 = r1.f2205a     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L57
        Lcf:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L57
            goto Ld3
        Ld1:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L57
            throw r0
        Ld3:
            java.lang.Object r0 = r9.f2378e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o4.b():java.lang.Object");
    }
}
