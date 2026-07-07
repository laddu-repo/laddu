package ac;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u implements cc.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f450v;

    public static d1.e0 b(d1.c1 c1Var, s5.d dVar, re.c cVar, ce.a aVar) {
        pd.p pVar = pd.p.f10551v;
        sd.c cVar2 = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new d1.e0(new d1.i0(c1Var, new d1.b0(1, cVar), aVar), fa.b.s(new o(pVar, cVar2, 4)), dVar, cVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new d1.e0(new d1.i0(c1Var, d1.h0.f3885w, aVar), fa.b.s(new o(pVar, cVar2, 4)), dVar, cVar);
        }
    }

    public static void c(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && de.i.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                return;
            } catch (Exception e7) {
                throw new IOException("Failed to create directory: " + parentFile, e7);
            }
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Failed to create directory: " + parentFile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r10 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [nb.d] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(nb.d r9, ud.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ac.z
            if (r0 == 0) goto L13
            r0 = r10
            ac.z r0 = (ac.z) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            ac.z r0 = new ac.z
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f474z
            int r1 = r0.B
            java.lang.String r2 = "FirebaseSessions"
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            td.a r6 = td.a.f12544v
            if (r1 == 0) goto L48
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L36
            java.lang.Object r9 = r0.f473y
            java.lang.String r9 = (java.lang.String) r9
            fa.b.z(r10)     // Catch: java.lang.Exception -> L33
            goto L91
        L33:
            r10 = move-exception
            goto L98
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f473y
            nb.d r9 = (nb.d) r9
            fa.b.z(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L74
        L48:
            fa.b.z(r10)
            r10 = r9
            nb.c r10 = (nb.c) r10     // Catch: java.lang.Exception -> L46
            o8.o r9 = r10.e()     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = "getToken(...)"
            de.i.d(r9, r1)     // Catch: java.lang.Exception -> L70
            r0.f473y = r10     // Catch: java.lang.Exception -> L70
            r0.B = r4     // Catch: java.lang.Exception -> L70
            java.lang.Object r9 = u1.c.c(r9, r0)     // Catch: java.lang.Exception -> L70
            if (r9 != r6) goto L62
            goto L90
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            nb.a r10 = (nb.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f9069a     // Catch: java.lang.Exception -> L46
            de.i.b(r10)     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7b
        L70:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L74:
            java.lang.String r1 = "Error getting authentication token."
            android.util.Log.w(r2, r1, r10)
            r10 = r9
            r9 = r5
        L7b:
            nb.c r10 = (nb.c) r10     // Catch: java.lang.Exception -> L33
            o8.o r10 = r10.d()     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "getId(...)"
            de.i.d(r10, r1)     // Catch: java.lang.Exception -> L33
            r0.f473y = r9     // Catch: java.lang.Exception -> L33
            r0.B = r3     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = u1.c.c(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r6) goto L91
        L90:
            return r6
        L91:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            if (r10 != 0) goto L96
            goto L9d
        L96:
            r5 = r10
            goto L9d
        L98:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r2, r0, r10)
        L9d:
            ac.a0 r10 = new ac.a0
            r10.<init>(r5, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.u.a(nb.d, ud.c):java.lang.Object");
    }

    @Override // nd.a
    public Object get() {
        switch (this.f450v) {
            case 1:
                return k1.f420a;
            default:
                return l1.f422a;
        }
    }
}
