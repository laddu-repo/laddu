package x2;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public float D;
    public float E;
    public final /* synthetic */ k H;

    /* renamed from: x, reason: collision with root package name */
    public final i f14486x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f14487y = new float[16];

    /* renamed from: z, reason: collision with root package name */
    public final float[] f14488z = new float[16];
    public final float[] F = new float[16];
    public final float[] G = new float[16];

    public j(k kVar, i iVar) {
        this.H = kVar;
        float[] fArr = new float[16];
        this.A = fArr;
        float[] fArr2 = new float[16];
        this.B = fArr2;
        float[] fArr3 = new float[16];
        this.C = fArr3;
        this.f14486x = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.E = 3.1415927f;
    }

    @Override // x2.c
    public final synchronized void a(float[] fArr, float f3) {
        float[] fArr2 = this.A;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f10 = -f3;
        this.E = f10;
        Matrix.setRotateM(this.B, 0, -this.D, (float) Math.cos(f10), (float) Math.sin(this.E), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.G, 0, this.A, 0, this.C, 0);
            Matrix.multiplyMM(this.F, 0, this.B, 0, this.G, 0);
        }
        Matrix.multiplyMM(this.f14488z, 0, this.f14487y, 0, this.F, 0);
        this.f14486x.d(this.f14488z);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i6, int i10) {
        float f3;
        GLES20.glViewport(0, 0, i6, i10);
        float f10 = i6 / i10;
        if (f10 > 1.0f) {
            f3 = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
        } else {
            f3 = 90.0f;
        }
        Matrix.perspectiveM(this.f14487y, 0, f3, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.H;
        kVar.B.post(new m8.c(15, kVar, this.f14486x.e()));
    }
}
