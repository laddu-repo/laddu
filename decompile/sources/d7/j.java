package d7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import b7.c0;
import j1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends b {
    public e7.s A;

    /* renamed from: q, reason: collision with root package name */
    public final String f3899q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3900r;
    public final v.i s;

    /* renamed from: t, reason: collision with root package name */
    public final v.i f3901t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f3902u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3903v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3904w;

    /* renamed from: x, reason: collision with root package name */
    public final e7.j f3905x;

    /* renamed from: y, reason: collision with root package name */
    public final e7.j f3906y;

    /* renamed from: z, reason: collision with root package name */
    public final e7.j f3907z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(b7.y r13, j7.a r14, i7.e r15) {
        /*
            r12 = this;
            int r0 = r15.f6647h
            int r0 = y.e.c(r0)
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 == r1) goto Lf
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        Ld:
            r5 = r0
            goto L15
        Lf:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto Ld
        L12:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto Ld
        L15:
            int r0 = r15.f6648i
            int r0 = y.e.c(r0)
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L28
            r1 = 2
            if (r0 == r1) goto L25
            r0 = 0
        L23:
            r6 = r0
            goto L2e
        L25:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L23
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L23
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L23
        L2e:
            float r7 = r15.j
            h7.a r8 = r15.f6643d
            h7.b r9 = r15.f6646g
            java.util.ArrayList r10 = r15.f6649k
            h7.b r11 = r15.f6650l
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            v.i r13 = new v.i
            r13.<init>()
            r2.s = r13
            v.i r13 = new v.i
            r13.<init>()
            r2.f3901t = r13
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>()
            r2.f3902u = r13
            java.lang.String r13 = r15.f6640a
            r2.f3899q = r13
            int r13 = r15.f6641b
            r2.f3903v = r13
            boolean r13 = r15.f6651m
            r2.f3900r = r13
            b7.j r13 = r3.f1613x
            float r13 = r13.b()
            r14 = 1107296256(0x42000000, float:32.0)
            float r13 = r13 / r14
            int r13 = (int) r13
            r2.f3904w = r13
            h7.a r13 = r15.f6642c
            e7.e r13 = r13.G0()
            r14 = r13
            e7.j r14 = (e7.j) r14
            r2.f3905x = r14
            r13.a(r12)
            r4.f(r13)
            h7.a r13 = r15.f6644e
            e7.e r13 = r13.G0()
            r14 = r13
            e7.j r14 = (e7.j) r14
            r2.f3906y = r14
            r13.a(r12)
            r4.f(r13)
            h7.a r13 = r15.f6645f
            e7.e r13 = r13.G0()
            r14 = r13
            e7.j r14 = (e7.j) r14
            r2.f3907z = r14
            r13.a(r12)
            r4.f(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.j.<init>(b7.y, j7.a, i7.e):void");
    }

    @Override // d7.b, d7.f
    public final void c(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f3900r) {
            return;
        }
        e(this.f3902u, matrix, false);
        int i10 = this.f3903v;
        e7.j jVar = this.f3905x;
        e7.j jVar2 = this.f3907z;
        e7.j jVar3 = this.f3906y;
        if (i10 == 1) {
            long i11 = i();
            v.i iVar = this.s;
            shader = (LinearGradient) iVar.d(i11);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                i7.c cVar = (i7.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f6631b), cVar.f6630a, Shader.TileMode.CLAMP);
                iVar.h(i11, radialGradient);
                shader = radialGradient;
            }
            this.f3843i.setShader(shader);
            super.c(canvas, matrix, i6, aVar);
        }
        long i12 = i();
        v.i iVar2 = this.f3901t;
        shader = (RadialGradient) iVar2.d(i12);
        if (shader == null) {
            PointF pointF3 = (PointF) jVar3.e();
            PointF pointF4 = (PointF) jVar2.e();
            i7.c cVar2 = (i7.c) jVar.e();
            int[] f3 = f(cVar2.f6631b);
            float[] fArr = cVar2.f6630a;
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), f3, fArr, Shader.TileMode.CLAMP);
            iVar2.h(i12, radialGradient);
            shader = radialGradient;
        }
        this.f3843i.setShader(shader);
        super.c(canvas, matrix, i6, aVar);
    }

    @Override // d7.b, g7.f
    public final void d(f0 f0Var, Object obj) {
        super.d(f0Var, obj);
        if (obj == c0.J) {
            e7.s sVar = this.A;
            j7.a aVar = this.f3840f;
            if (sVar != null) {
                aVar.o(sVar);
            }
            e7.s sVar2 = new e7.s(f0Var, null);
            this.A = sVar2;
            sVar2.a(this);
            aVar.f(this.A);
        }
    }

    public final int[] f(int[] iArr) {
        e7.s sVar = this.A;
        if (sVar != null) {
            Integer[] numArr = (Integer[]) sVar.e();
            int i6 = 0;
            if (iArr.length == numArr.length) {
                while (i6 < iArr.length) {
                    iArr[i6] = numArr[i6].intValue();
                    i6++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i6 < numArr.length) {
                    iArr[i6] = numArr[i6].intValue();
                    i6++;
                }
            }
        }
        return iArr;
    }

    @Override // d7.d
    public final String getName() {
        return this.f3899q;
    }

    public final int i() {
        int i6;
        float f3 = this.f3906y.f4407d;
        float f10 = this.f3904w;
        int round = Math.round(f3 * f10);
        int round2 = Math.round(this.f3907z.f4407d * f10);
        int round3 = Math.round(this.f3905x.f4407d * f10);
        if (round != 0) {
            i6 = 527 * round;
        } else {
            i6 = 17;
        }
        if (round2 != 0) {
            i6 = i6 * 31 * round2;
        }
        if (round3 != 0) {
            return i6 * 31 * round3;
        }
        return i6;
    }
}
