package d1;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd.h f3952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f3953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.b f3954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3956e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue.c f3957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final od.j f3958h;
    public final od.j i;

    public w0(sd.h hVar, File file) {
        de.i.e(hVar, "context");
        de.i.e(file, "file");
        this.f3952a = hVar;
        this.f3953b = file;
        Object obj = z0.f3969b;
        this.f3954c = new pe.b(new cb.e(file, (sd.c) null, 3), sd.i.f11797v, -2, oe.a.f10127v, 0);
        this.f3955d = ".lock";
        this.f3956e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.f3957g = new ue.c();
        this.f3958h = new od.j(new t0(this, 1));
        this.i = new od.j(new t0(this, 0));
    }

    public static final void f(w0 w0Var, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[Catch: all -> 0x00be, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00be, blocks: (B:42:0x00ba, B:56:0x00d7, B:57:0x00da), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #7 {all -> 0x00be, blocks: (B:42:0x00ba, B:56:0x00d7, B:57:0x00da), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v20, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    @Override // d1.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ce.l r9, ud.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.w0.a(ce.l, ud.c):java.lang.Object");
    }

    @Override // d1.p0
    public final Object b(ud.c cVar) {
        od.j jVar = this.i;
        if (jVar.a()) {
            return new Integer(d1.f3860b.nativeGetCounterValue(((d1) jVar.getValue()).f3861a));
        }
        return me.x.s(this.f3952a, new s0(this, null, 0), cVar);
    }

    @Override // d1.p0
    public final pe.c c() {
        return this.f3954c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Type inference failed for: r2v0, types: [ce.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d1.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    @Override // d1.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ce.p r19, ud.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.w0.d(ce.p, ud.c):java.lang.Object");
    }

    @Override // d1.p0
    public final Object e(d0 d0Var) {
        od.j jVar = this.i;
        if (jVar.a()) {
            return new Integer(d1.f3860b.nativeIncrementAndGetCounterValue(((d1) jVar.getValue()).f3861a));
        }
        return me.x.s(this.f3952a, new s0(this, null, 1), d0Var);
    }
}
