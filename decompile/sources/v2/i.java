package v2;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import t1.o;
import u2.v;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements v, a {
    public int D;
    public SurfaceTexture E;
    public byte[] H;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f13109v = new AtomicBoolean();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f13110w = new AtomicBoolean(true);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f13111x = new g();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c2.b f13112y = new c2.b(10);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q3.d f13113z = new q3.d();
    public final q3.d A = new q3.d();
    public final float[] B = new float[16];
    public final float[] C = new float[16];
    public volatile int F = 0;
    public int G = -1;

    @Override // v2.a
    public final void a(long j8, float[] fArr) {
        ((q3.d) this.f13112y.f1688y).a(j8, fArr);
    }

    @Override // u2.v
    public final void b(long j8, long j9, o oVar, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListU;
        int iJ;
        this.f13113z.a(j9, Long.valueOf(j8));
        byte[] bArr = oVar.B;
        int i10 = oVar.C;
        byte[] bArr2 = this.H;
        int i11 = this.G;
        this.H = bArr;
        if (i10 == -1) {
            i10 = this.F;
        }
        this.G = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.H)) {
            return;
        }
        byte[] bArr3 = this.H;
        f fVar = null;
        if (bArr3 != null) {
            int i12 = this.G;
            t tVar = new t(bArr3);
            try {
                tVar.K(4);
                iJ = tVar.j();
                tVar.J(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iJ == 1886547818) {
                tVar.K(8);
                int i13 = tVar.f13739b;
                int i14 = tVar.f13740c;
                while (i13 < i14) {
                    int iJ2 = tVar.j() + i13;
                    if (iJ2 > i13 && iJ2 <= i14) {
                        int iJ3 = tVar.j();
                        if (iJ3 != 2037673328 && iJ3 != 1836279920) {
                            tVar.J(iJ2);
                            i13 = iJ2;
                        }
                        tVar.I(iJ2);
                        arrayListU = fa.b.u(tVar);
                        break;
                    }
                    break;
                }
                arrayListU = null;
            } else {
                arrayListU = fa.b.u(tVar);
            }
            if (arrayListU != null) {
                int size = arrayListU.size();
                if (size == 1) {
                    e eVar = (e) arrayListU.get(0);
                    fVar = new f(eVar, eVar, i12);
                } else if (size == 2) {
                    fVar = new f((e) arrayListU.get(0), (e) arrayListU.get(1), i12);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i15 = this.G;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f4 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 36; i16 < i19; i19 = 36) {
                float f10 = radians / 2.0f;
                float f11 = (i16 * f) - f10;
                int i20 = i16 + 1;
                float f12 = (i20 * f) - f10;
                int i21 = 0;
                while (i21 < 73) {
                    int i22 = i20;
                    float f13 = f12;
                    float f14 = radians;
                    int i23 = i17;
                    int i24 = i18;
                    int i25 = 0;
                    int i26 = 2;
                    while (i25 < i26) {
                        float f15 = i25 == 0 ? f11 : f13;
                        float f16 = radians2;
                        float f17 = i21 * f4;
                        float f18 = f11;
                        float f19 = f;
                        double d10 = 50.0f;
                        double d11 = (f17 + 3.1415927f) - (f16 / 2.0f);
                        double d12 = f15;
                        fArr[i23] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        fArr[i23 + 1] = (float) (Math.sin(d12) * d10);
                        int i27 = i23 + 3;
                        fArr[i23 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        fArr2[i24] = f17 / f16;
                        int i28 = i24 + 2;
                        fArr2[i24 + 1] = ((i16 + i25) * f19) / f14;
                        if ((i21 == 0 && i25 == 0) || (i21 == 72 && i25 == 1)) {
                            System.arraycopy(fArr, i23, fArr, i27, 3);
                            i23 += 6;
                            i = 2;
                            System.arraycopy(fArr2, i24, fArr2, i28, 2);
                            i24 += 4;
                        } else {
                            i = 2;
                            i23 = i27;
                            i24 = i28;
                        }
                        i25++;
                        i26 = i;
                        radians2 = f16;
                        f11 = f18;
                        f = f19;
                    }
                    i21++;
                    i17 = i23;
                    i18 = i24;
                    i20 = i22;
                    f12 = f13;
                    radians = f14;
                    radians2 = radians2;
                    f = f;
                }
                i16 = i20;
            }
            e eVar2 = new e(new q3.d(0, fArr, fArr2, 1));
            fVar = new f(eVar2, eVar2, i15);
        }
        this.A.a(j9, fVar);
    }

    public final void c(float[] fArr) {
        Object objD;
        GLES20.glClear(16384);
        try {
            w1.a.e();
        } catch (w1.k e7) {
            w1.a.p("SceneRenderer", "Failed to draw a frame", e7);
        }
        if (this.f13109v.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.E;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                w1.a.e();
            } catch (w1.k e10) {
                w1.a.p("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (this.f13110w.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.B, 0);
            }
            long timestamp = this.E.getTimestamp();
            q3.d dVar = this.f13113z;
            synchronized (dVar) {
                objD = dVar.d(false, timestamp);
            }
            Long l10 = (Long) objD;
            if (l10 != null) {
                c2.b bVar = this.f13112y;
                float[] fArr2 = this.B;
                float[] fArr3 = (float[]) ((q3.d) bVar.f1688y).f(l10.longValue());
                if (fArr3 != null) {
                    float[] fArr4 = (float[]) bVar.f1687x;
                    float f = fArr3[0];
                    float f4 = -fArr3[1];
                    float f10 = -fArr3[2];
                    float length = Matrix.length(f, f4, f10);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f4 / length, f10 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!bVar.f1685v) {
                        c2.b.g((float[]) bVar.f1686w, (float[]) bVar.f1687x);
                        bVar.f1685v = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) bVar.f1686w, 0, (float[]) bVar.f1687x, 0);
                }
            }
            f fVar = (f) this.A.f(timestamp);
            if (fVar != null) {
                g gVar = this.f13111x;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f13101a = fVar.f13097c;
                    gVar.f13102b = new q3.d(fVar.f13095a.f13094a[0]);
                    if (!fVar.f13098d) {
                        new q3.d(fVar.f13096b.f13094a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.C, 0, fArr, 0, this.B, 0);
        g gVar2 = this.f13111x;
        int i = this.D;
        float[] fArr5 = this.C;
        q3.d dVar2 = gVar2.f13102b;
        if (dVar2 == null) {
            return;
        }
        int i10 = gVar2.f13101a;
        GLES20.glUniformMatrix3fv(gVar2.f13105e, 1, false, i10 == 1 ? g.f13099j : i10 == 2 ? g.f13100k : g.i, 0);
        GLES20.glUniformMatrix4fv(gVar2.f13104d, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(gVar2.f13107h, 0);
        try {
            w1.a.e();
        } catch (w1.k e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(gVar2.f, 3, 5126, false, 12, (Buffer) dVar2.f10680c);
        try {
            w1.a.e();
        } catch (w1.k e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(gVar2.f13106g, 2, 5126, false, 8, (Buffer) dVar2.f10681d);
        try {
            w1.a.e();
        } catch (w1.k e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(dVar2.f10679b, 0, dVar2.f10678a);
        try {
            w1.a.e();
        } catch (w1.k e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    @Override // v2.a
    public final void d() {
        this.f13113z.b();
        c2.b bVar = this.f13112y;
        ((q3.d) bVar.f1688y).b();
        bVar.f1685v = false;
        this.f13110w.set(true);
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            w1.a.e();
            this.f13111x.a();
            w1.a.e();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            w1.a.e();
            int i = iArr[0];
            w1.a.b(36197, i);
            this.D = i;
        } catch (w1.k e7) {
            w1.a.p("SceneRenderer", "Failed to initialize the renderer", e7);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
        this.E = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: v2.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f13108v.f13109v.set(true);
            }
        });
        return this.E;
    }
}
