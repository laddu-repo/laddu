package x2;

import android.opengl.GLES20;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import f4.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f14472i = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public static final float[] j = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f14473k = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f14474a;

    /* renamed from: b, reason: collision with root package name */
    public s3.c f14475b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f14476c;

    /* renamed from: d, reason: collision with root package name */
    public int f14477d;

    /* renamed from: e, reason: collision with root package name */
    public int f14478e;

    /* renamed from: f, reason: collision with root package name */
    public int f14479f;

    /* renamed from: g, reason: collision with root package name */
    public int f14480g;

    /* renamed from: h, reason: collision with root package name */
    public int f14481h;

    public static boolean b(f fVar) {
        e eVar = fVar.f14468a;
        e eVar2 = fVar.f14469b;
        s3.c[] cVarArr = eVar.f14467a;
        if (cVarArr.length == 1 && cVarArr[0].f12051a == 0) {
            s3.c[] cVarArr2 = eVar2.f14467a;
            if (cVarArr2.length == 1 && cVarArr2[0].f12051a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            e0 e0Var = new e0("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f14476c = e0Var;
            this.f14477d = GLES20.glGetUniformLocation(e0Var.f4763x, "uMvpMatrix");
            this.f14478e = GLES20.glGetUniformLocation(this.f14476c.f4763x, "uTexMatrix");
            this.f14479f = this.f14476c.d("aPosition");
            this.f14480g = this.f14476c.d("aTexCoords");
            this.f14481h = GLES20.glGetUniformLocation(this.f14476c.f4763x, "uTexture");
        } catch (u1.j e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
