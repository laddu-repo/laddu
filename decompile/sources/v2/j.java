package v2;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o2.i0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public final float[] A;
    public float B;
    public float C;
    public final /* synthetic */ k F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f13114v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f13117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float[] f13118z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f13115w = new float[16];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f13116x = new float[16];
    public final float[] D = new float[16];
    public final float[] E = new float[16];

    public j(k kVar, i iVar) {
        this.F = kVar;
        float[] fArr = new float[16];
        this.f13117y = fArr;
        float[] fArr2 = new float[16];
        this.f13118z = fArr2;
        float[] fArr3 = new float[16];
        this.A = fArr3;
        this.f13114v = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.C = 3.1415927f;
    }

    @Override // v2.c
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.f13117y;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f4 = -f;
        this.C = f4;
        Matrix.setRotateM(this.f13118z, 0, -this.B, (float) Math.cos(f4), (float) Math.sin(this.C), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.E, 0, this.f13117y, 0, this.A, 0);
            Matrix.multiplyMM(this.D, 0, this.f13118z, 0, this.E, 0);
        }
        Matrix.multiplyMM(this.f13116x, 0, this.f13115w, 0, this.D, 0);
        this.f13114v.c(this.f13116x);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i10) {
        GLES20.glViewport(0, 0, i, i10);
        float f = i / i10;
        Matrix.perspectiveM(this.f13115w, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.F;
        kVar.f13123z.post(new i0(12, kVar, this.f13114v.e()));
    }
}
