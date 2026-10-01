package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class dg implements yg {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final dg f2579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final UUID f2580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f2581x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f2582y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Thread f2583z;

    public dg(String str, dg dgVar, xg xgVar) {
        str.getClass();
        this.f2582y = str;
        this.f2579v = dgVar;
        this.f2580w = dgVar.f2580w;
        this.f2581x = dgVar.f2581x;
        this.f2583z = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xg xgVarB = jg.b();
        yg ygVar = xgVarB.f3233b;
        String str = this.f2582y;
        if (ygVar == null) {
            throw new ig(d0.d.n(new StringBuilder(String.valueOf(str).length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == ygVar) {
            jg.a(xgVarB, ((dg) ygVar).f2579v);
            this.f2583z = null;
            return;
        }
        String str2 = ((dg) ygVar).f2582y;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length() + 1);
        j4.a.s(sb2, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb2.append(".");
        throw new ig(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r15 = ((com.google.android.gms.internal.measurement.wg) r1.f935g).f3209d;
        r16 = r6;
        r6 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r15.containsKey(r6) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        ((com.google.android.gms.internal.measurement.wg) r1.f935g).f3209d.put(r6, new com.google.android.gms.internal.measurement.wg(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r14 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        r14.f3208c = (com.google.android.gms.internal.measurement.wg) r1.f935g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00de, code lost:
    
        if (r14 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        r14.f3208c = (com.google.android.gms.internal.measurement.wg) r1.f935g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        r1.f931b = r7;
        r1.f932c++;
        r1.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.dg.toString():java.lang.String");
    }

    public dg(String str, UUID uuid, String str2, xg xgVar) {
        str.getClass();
        this.f2582y = str;
        this.f2579v = null;
        this.f2580w = uuid;
        this.f2581x = str2;
        xgVar.getClass();
        this.f2583z = Thread.currentThread();
    }
}
