package w2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends HandlerThread implements Handler.Callback {
    public RuntimeException A;
    public m B;

    /* renamed from: x, reason: collision with root package name */
    public u1.i f13672x;

    /* renamed from: y, reason: collision with root package name */
    public Handler f13673y;

    /* renamed from: z, reason: collision with root package name */
    public Error f13674z;

    public final void a(int i6) {
        boolean z10;
        boolean z11;
        int[] iArr;
        boolean z12;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z13;
        this.f13672x.getClass();
        u1.i iVar = this.f13672x;
        int[] iArr3 = iVar.f12777y;
        boolean z14 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.a.d("eglGetDisplay failed", z10);
        int[] iArr4 = new int[2];
        u1.a.d("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr4, 0, iArr4, 1));
        iVar.f12778z = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr5 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, u1.i.D, 0, eGLConfigArr, 0, 1, iArr5, 0);
        if (eglChooseConfig && iArr5[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr5[0]), eGLConfigArr[0]};
        String str = u1.a0.f12750a;
        u1.a.d(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = iVar.f12778z;
        if (i6 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        u1.a.d("eglCreateContext failed", z12);
        iVar.A = eglCreateContext;
        EGLDisplay eGLDisplay2 = iVar.f12778z;
        if (i6 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i6 == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            u1.a.d("eglCreatePbufferSurface failed", z13);
        }
        u1.a.d("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        iVar.B = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr3, 0);
        u1.a.c();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        iVar.C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(iVar);
        SurfaceTexture surfaceTexture2 = this.f13672x.C;
        surfaceTexture2.getClass();
        if (i6 != 0) {
            z14 = true;
        }
        this.B = new m(this, surfaceTexture2, z14);
    }

    public final void b() {
        this.f13672x.getClass();
        u1.i iVar = this.f13672x;
        iVar.f12776x.removeCallbacks(iVar);
        try {
            SurfaceTexture surfaceTexture = iVar.C;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, iVar.f12777y, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = iVar.f12778z;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = iVar.f12778z;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = iVar.B;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(iVar.f12778z, iVar.B);
            }
            EGLContext eGLContext = iVar.A;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(iVar.f12778z, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = iVar.f12778z;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(iVar.f12778z);
            }
            iVar.f12778z = null;
            iVar.A = null;
            iVar.B = null;
            iVar.C = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = message.what;
        try {
            if (i6 != 1) {
                if (i6 == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th) {
                        try {
                            u1.a.h("PlaceholderSurface", "Failed to release placeholder surface", th);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
            } else {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e10) {
                    u1.a.h("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f13674z = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    u1.a.h("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.A = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (u1.j e12) {
                    u1.a.h("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.A = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
