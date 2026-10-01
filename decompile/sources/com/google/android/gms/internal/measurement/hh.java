package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class hh implements gh, rh {
    public static final String i = new String();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Level f2698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lh f2700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oh f2701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wh f2702e;
    public g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f2703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p6 f2704h;

    public hh(p6 p6Var, Level level) {
        Objects.requireNonNull(p6Var);
        this.f2704h = p6Var;
        d.f2554a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f2700c = null;
        this.f2701d = null;
        this.f2702e = null;
        this.f = null;
        this.f2703g = null;
        eh.c(level, "level");
        this.f2698a = level;
        this.f2699b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.rh
    public final rh a(Throwable th) {
        sh shVar = kh.f2835a;
        eh.c(shVar, "metadata key");
        if (th != null) {
            e(shVar, th);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.rh
    public final rh b() {
        nh nhVar = new nh();
        nhVar.f2936b = 0;
        if (this.f2701d == null) {
            this.f2701d = nhVar;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.google.android.gms.internal.measurement.wh] */
    /* JADX WARN: Type inference failed for: r10v22, types: [com.google.android.gms.internal.measurement.xh] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.measurement.hh] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.measurement.wh] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [com.google.android.gms.internal.measurement.wh] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // com.google.android.gms.internal.measurement.rh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hh.c(java.lang.String, java.lang.Object[]):void");
    }

    public final jb d() {
        lh lhVar = this.f2700c;
        return lhVar != null ? lhVar : gi.f2668e;
    }

    public final void e(sh shVar, Object obj) {
        if (this.f2700c == null) {
            lh lhVar = new lh();
            lhVar.f2870e = new Object[8];
            lhVar.f = 0;
            this.f2700c = lhVar;
        }
        this.f2700c.w(shVar, obj);
    }
}
