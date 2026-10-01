package w2;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements GLSurfaceView.Renderer {
    public static final float[] H = {1.164f, 1.164f, 1.164f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.392f, 2.017f, 1.596f, -0.813f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public static final float[] I = {1.164f, 1.164f, 1.164f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.213f, 2.112f, 1.793f, -0.533f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public static final float[] J = {1.168f, 1.168f, 1.168f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.188f, 2.148f, 1.683f, -0.652f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public static final String[] K = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer L = u1.a.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public f4.e0 E;
    public int F;
    public VideoDecoderOutputBuffer G;

    /* renamed from: x, reason: collision with root package name */
    public final t f13700x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f13701y = new int[3];

    /* renamed from: z, reason: collision with root package name */
    public final int[] f13702z = new int[3];
    public final int[] A = new int[3];
    public final int[] B = new int[3];
    public final AtomicReference C = new AtomicReference();
    public final FloatBuffer[] D = new FloatBuffer[3];

    public s(t tVar) {
        this.f13700x = tVar;
        for (int i6 = 0; i6 < 3; i6++) {
            int[] iArr = this.A;
            this.B[i6] = -1;
            iArr[i6] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f13701y;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i6 = 0; i6 < 3; i6++) {
                f4.e0 e0Var = this.E;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(e0Var.f4763x, K[i6]), i6);
                GLES20.glActiveTexture(33984 + i6);
                u1.a.b(3553, iArr[i6]);
            }
            u1.a.c();
        } catch (u1.j e10) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        boolean z10;
        int i6;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.C.getAndSet(null);
        if (videoDecoderOutputBuffer == null && this.G == null) {
            return;
        }
        if (videoDecoderOutputBuffer != null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.G;
            if (videoDecoderOutputBuffer2 != null) {
                videoDecoderOutputBuffer2.release();
            }
            this.G = videoDecoderOutputBuffer;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer3 = this.G;
        videoDecoderOutputBuffer3.getClass();
        int i10 = videoDecoderOutputBuffer3.colorspace;
        if (i10 != 1) {
            if (i10 != 3) {
                fArr = I;
            } else {
                fArr = J;
            }
        } else {
            fArr = H;
        }
        GLES20.glUniformMatrix3fv(this.F, 1, false, fArr, 0);
        int[] iArr = videoDecoderOutputBuffer3.yuvStrides;
        iArr.getClass();
        ByteBuffer[] byteBufferArr = videoDecoderOutputBuffer3.yuvPlanes;
        byteBufferArr.getClass();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 0) {
                i6 = videoDecoderOutputBuffer3.height;
            } else {
                i6 = (videoDecoderOutputBuffer3.height + 1) / 2;
            }
            int i12 = i6;
            GLES20.glActiveTexture(33984 + i11);
            GLES20.glBindTexture(3553, this.f13701y[i11]);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
        }
        int i13 = videoDecoderOutputBuffer3.width;
        int i14 = (i13 + 1) / 2;
        int[] iArr2 = {i13, i14, i14};
        for (int i15 = 0; i15 < 3; i15++) {
            int[] iArr3 = this.A;
            int i16 = iArr3[i15];
            int i17 = iArr2[i15];
            int[] iArr4 = this.B;
            if (i16 != i17 || iArr4[i15] != iArr[i15]) {
                if (iArr[i15] != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.g(z10);
                float f3 = iArr2[i15] / iArr[i15];
                FloatBuffer e10 = u1.a.e(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1.0f});
                FloatBuffer[] floatBufferArr = this.D;
                floatBufferArr[i15] = e10;
                GLES20.glVertexAttribPointer(this.f13702z[i15], 2, 5126, false, 0, (Buffer) floatBufferArr[i15]);
                iArr3[i15] = iArr2[i15];
                iArr4[i15] = iArr[i15];
            }
        }
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        GLES20.glDrawArrays(5, 0, 4);
        try {
            u1.a.c();
        } catch (u1.j e11) {
            Log.e("VideoDecoderGLSV", "Failed to draw a frame", e11);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i6, int i10) {
        GLES20.glViewport(0, 0, i6, i10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f13702z;
        try {
            f4.e0 e0Var = new f4.e0("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.E = e0Var;
            GLES20.glVertexAttribPointer(e0Var.d("in_pos"), 2, 5126, false, 0, (Buffer) L);
            iArr[0] = this.E.d("in_tc_y");
            iArr[1] = this.E.d("in_tc_u");
            iArr[2] = this.E.d("in_tc_v");
            this.F = GLES20.glGetUniformLocation(this.E.f4763x, "mColorConversion");
            u1.a.c();
            a();
            u1.a.c();
        } catch (u1.j e10) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
        }
    }
}
