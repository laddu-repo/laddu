package v2;

import android.opengl.GLES20;
import android.util.Log;
import cf.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f13099j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f13100k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3.d f13102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f13103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13105e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13107h;

    public static boolean b(f fVar) {
        e eVar = fVar.f13095a;
        e eVar2 = fVar.f13096b;
        q3.d[] dVarArr = eVar.f13094a;
        if (dVarArr.length == 1 && dVarArr[0].f10678a == 0) {
            q3.d[] dVarArr2 = eVar2.f13094a;
            if (dVarArr2.length == 1 && dVarArr2[0].f10678a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            m mVar = new m("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f13103c = mVar;
            this.f13104d = GLES20.glGetUniformLocation(mVar.f2328w, "uMvpMatrix");
            this.f13105e = GLES20.glGetUniformLocation(this.f13103c.f2328w, "uTexMatrix");
            this.f = this.f13103c.t("aPosition");
            this.f13106g = this.f13103c.t("aTexCoords");
            this.f13107h = GLES20.glGetUniformLocation(this.f13103c.f2328w, "uTexture");
        } catch (w1.k e7) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e7);
        }
    }
}
