package w2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends Surface {
    public static int A;
    public static boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13675x;

    /* renamed from: y, reason: collision with root package name */
    public final l f13676y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13677z;

    public m(l lVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f13676y = lVar;
        this.f13675x = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039 A[Catch: j -> 0x0045, TRY_LEAVE, TryCatch #0 {j -> 0x0045, blocks: (B:3:0x0001, B:7:0x0039, B:16:0x000d, B:18:0x0017, B:22:0x0024, B:25:0x0031), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: u1.j -> L45
            r2 = 24
            if (r1 >= r2) goto L9
        L7:
            r5 = 0
            goto L37
        L9:
            r2 = 26
            if (r1 >= r2) goto L22
            java.lang.String r3 = "samsung"
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch: u1.j -> L45
            boolean r3 = r3.equals(r4)     // Catch: u1.j -> L45
            if (r3 != 0) goto L7
            java.lang.String r3 = "XT1650"
            java.lang.String r4 = android.os.Build.MODEL     // Catch: u1.j -> L45
            boolean r3 = r3.equals(r4)     // Catch: u1.j -> L45
            if (r3 == 0) goto L22
            goto L7
        L22:
            if (r1 >= r2) goto L31
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: u1.j -> L45
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r1)     // Catch: u1.j -> L45
            if (r5 != 0) goto L31
            goto L7
        L31:
            java.lang.String r5 = "EGL_EXT_protected_content"
            boolean r5 = u1.a.l(r5)     // Catch: u1.j -> L45
        L37:
            if (r5 == 0) goto L47
            java.lang.String r5 = "EGL_KHR_surfaceless_context"
            boolean r5 = u1.a.l(r5)     // Catch: u1.j -> L45
            if (r5 == 0) goto L43
            r5 = 1
            return r5
        L43:
            r5 = 2
            return r5
        L45:
            r5 = move-exception
            goto L48
        L47:
            return r0
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to determine secure mode due to GL error: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "PlaceholderSurface"
            u1.a.g(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.m.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (m.class) {
            try {
                z10 = true;
                if (!B) {
                    A = a(context);
                    B = true;
                }
                if (A == 0) {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f13676y) {
            try {
                if (!this.f13677z) {
                    l lVar = this.f13676y;
                    lVar.f13673y.getClass();
                    lVar.f13673y.sendEmptyMessage(2);
                    this.f13677z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
