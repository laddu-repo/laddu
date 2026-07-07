package u1;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] D = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLContext A;
    public EGLSurface B;
    public SurfaceTexture C;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f12776x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f12777y = new int[1];

    /* renamed from: z, reason: collision with root package name */
    public EGLDisplay f12778z;

    public i(Handler handler) {
        this.f12776x = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f12776x.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.C;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
