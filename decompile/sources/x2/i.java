package x2;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import cf.m;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;
import r1.q;
import u1.t;
import w2.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements v, a {
    public int F;
    public SurfaceTexture G;
    public byte[] J;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f14483x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f14484y = new AtomicBoolean(true);

    /* renamed from: z, reason: collision with root package name */
    public final g f14485z = new Object();
    public final a2.c A = new a2.c();
    public final s3.c B = new s3.c();
    public final s3.c C = new s3.c();
    public final float[] D = new float[16];
    public final float[] E = new float[16];
    public volatile int H = 0;
    public int I = -1;

    @Override // x2.a
    public final void a(long j, float[] fArr) {
        ((s3.c) this.A.A).a(j, fArr);
    }

    @Override // x2.a
    public final void b() {
        this.B.b();
        a2.c cVar = this.A;
        ((s3.c) cVar.A).b();
        cVar.f170x = false;
        this.f14484y.set(true);
    }

    @Override // w2.v
    public final void c(long j, long j10, q qVar, MediaFormat mediaFormat) {
        float f3;
        ArrayList arrayList;
        int k8;
        this.B.a(j10, Long.valueOf(j));
        byte[] bArr = qVar.B;
        int i6 = qVar.C;
        byte[] bArr2 = this.J;
        int i10 = this.I;
        this.J = bArr;
        if (i6 == -1) {
            i6 = this.H;
        }
        this.I = i6;
        if (i10 == i6 && Arrays.equals(bArr2, this.J)) {
            return;
        }
        byte[] bArr3 = this.J;
        f fVar = null;
        if (bArr3 != null) {
            int i11 = this.I;
            t tVar = new t(bArr3);
            try {
                tVar.L(4);
                k8 = tVar.k();
                tVar.K(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (k8 == 1886547818) {
                tVar.L(8);
                int i12 = tVar.f12812b;
                int i13 = tVar.f12813c;
                while (i12 < i13) {
                    int k9 = tVar.k() + i12;
                    if (k9 <= i12 || k9 > i13) {
                        break;
                    }
                    int k10 = tVar.k();
                    if (k10 != 2037673328 && k10 != 1836279920) {
                        tVar.K(k9);
                        i12 = k9;
                    }
                    tVar.J(k9);
                    arrayList = m.z(tVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = m.z(tVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 1) {
                    if (size == 2) {
                        fVar = new f((e) arrayList.get(0), (e) arrayList.get(1), i11);
                    }
                } else {
                    e eVar = (e) arrayList.get(0);
                    fVar = new f(eVar, eVar, i11);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i14 = this.I;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f10 = radians / 36;
            float f11 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 36; i15 < i18; i18 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i15 * f10) - f12;
                int i19 = i15 + 1;
                float f14 = (i19 * f10) - f12;
                int i20 = 0;
                while (i20 < 73) {
                    int i21 = i19;
                    float f15 = f14;
                    float f16 = radians;
                    int i22 = i16;
                    int i23 = i17;
                    int i24 = 0;
                    while (i24 < 2) {
                        if (i24 == 0) {
                            f3 = f13;
                        } else {
                            f3 = f15;
                        }
                        float f17 = radians2;
                        float f18 = i20 * f11;
                        float f19 = f13;
                        float f20 = f10;
                        double d10 = 50.0f;
                        double d11 = (f18 + 3.1415927f) - (f17 / 2.0f);
                        double d12 = f3;
                        fArr[i22] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        fArr[i22 + 1] = (float) (Math.sin(d12) * d10);
                        int i25 = i22 + 3;
                        fArr[i22 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        fArr2[i23] = f18 / f17;
                        int i26 = i23 + 2;
                        fArr2[i23 + 1] = ((i15 + i24) * f20) / f16;
                        if ((i20 != 0 || i24 != 0) && (i20 != 72 || i24 != 1)) {
                            i22 = i25;
                            i23 = i26;
                            i24++;
                            radians2 = f17;
                            f13 = f19;
                            f10 = f20;
                        }
                        System.arraycopy(fArr, i22, fArr, i25, 3);
                        i22 += 6;
                        System.arraycopy(fArr2, i23, fArr2, i26, 2);
                        i23 += 4;
                        i24++;
                        radians2 = f17;
                        f13 = f19;
                        f10 = f20;
                    }
                    i20++;
                    i16 = i22;
                    i17 = i23;
                    i19 = i21;
                    f14 = f15;
                    radians = f16;
                    radians2 = radians2;
                    f10 = f10;
                }
                i15 = i19;
            }
            e eVar2 = new e(new s3.c(0, fArr, fArr2, 1));
            fVar = new f(eVar2, eVar2, i14);
        }
        this.C.a(j10, fVar);
    }

    public final void d(float[] fArr) {
        float[] fArr2;
        Object d10;
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            u1.a.c();
        } catch (u1.j e10) {
            u1.a.h("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f14483x.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.G;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                u1.a.c();
            } catch (u1.j e11) {
                u1.a.h("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f14484y.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.D, 0);
            }
            long timestamp = this.G.getTimestamp();
            s3.c cVar = this.B;
            synchronized (cVar) {
                d10 = cVar.d(false, timestamp);
            }
            Long l10 = (Long) d10;
            if (l10 != null) {
                a2.c cVar2 = this.A;
                float[] fArr3 = this.D;
                float[] fArr4 = (float[]) ((s3.c) cVar2.A).f(l10.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) cVar2.f172z;
                    float f3 = fArr4[0];
                    float f10 = -fArr4[1];
                    float f11 = -fArr4[2];
                    float length = Matrix.length(f3, f10, f11);
                    if (length != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f3 / length, f10 / length, f11 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!cVar2.f170x) {
                        a2.c.b((float[]) cVar2.f171y, (float[]) cVar2.f172z);
                        cVar2.f170x = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) cVar2.f171y, 0, (float[]) cVar2.f172z, 0);
                }
            }
            f fVar = (f) this.C.f(timestamp);
            if (fVar != null) {
                g gVar = this.f14485z;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f14474a = fVar.f14470c;
                    gVar.f14475b = new s3.c(fVar.f14468a.f14467a[0]);
                    if (!fVar.f14471d) {
                        new s3.c(fVar.f14469b.f14467a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.E, 0, fArr, 0, this.D, 0);
        g gVar2 = this.f14485z;
        int i6 = this.F;
        float[] fArr6 = this.E;
        s3.c cVar3 = gVar2.f14475b;
        if (cVar3 != null) {
            int i10 = gVar2.f14474a;
            if (i10 == 1) {
                fArr2 = g.j;
            } else if (i10 == 2) {
                fArr2 = g.f14473k;
            } else {
                fArr2 = g.f14472i;
            }
            GLES20.glUniformMatrix3fv(gVar2.f14478e, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(gVar2.f14477d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i6);
            GLES20.glUniform1i(gVar2.f14481h, 0);
            try {
                u1.a.c();
            } catch (u1.j e12) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
            }
            GLES20.glVertexAttribPointer(gVar2.f14479f, 3, 5126, false, 12, (Buffer) cVar3.f12053c);
            try {
                u1.a.c();
            } catch (u1.j e13) {
                Log.e("ProjectionRenderer", "Failed to load position data", e13);
            }
            GLES20.glVertexAttribPointer(gVar2.f14480g, 2, 5126, false, 8, (Buffer) cVar3.f12054d);
            try {
                u1.a.c();
            } catch (u1.j e14) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e14);
            }
            GLES20.glDrawArrays(cVar3.f12052b, 0, cVar3.f12051a);
            try {
                u1.a.c();
            } catch (u1.j e15) {
                Log.e("ProjectionRenderer", "Failed to render", e15);
            }
        }
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            u1.a.c();
            this.f14485z.a();
            u1.a.c();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            u1.a.c();
            int i6 = iArr[0];
            u1.a.b(36197, i6);
            this.F = i6;
        } catch (u1.j e10) {
            u1.a.h("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.F);
        this.G = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: x2.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f14483x.set(true);
            }
        });
        return this.G;
    }
}
