package d7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import b7.c0;
import j1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends b {

    /* renamed from: q, reason: collision with root package name */
    public final j7.a f3959q;

    /* renamed from: r, reason: collision with root package name */
    public final String f3960r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final e7.f f3961t;

    /* renamed from: u, reason: collision with root package name */
    public e7.s f3962u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(b7.y r13, j7.a r14, i7.o r15) {
        /*
            r12 = this;
            int r0 = r15.f6697g
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
            int r0 = r15.f6698h
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
            float r7 = r15.f6699i
            h7.a r8 = r15.f6695e
            h7.b r9 = r15.f6696f
            java.util.ArrayList r10 = r15.f6693c
            h7.b r11 = r15.f6692b
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2.f3959q = r4
            java.lang.String r13 = r15.f6691a
            r2.f3960r = r13
            boolean r13 = r15.j
            r2.s = r13
            h7.a r13 = r15.f6694d
            e7.e r13 = r13.G0()
            r14 = r13
            e7.f r14 = (e7.f) r14
            r2.f3961t = r14
            r13.a(r12)
            r4.f(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.t.<init>(b7.y, j7.a, i7.o):void");
    }

    @Override // d7.b, d7.f
    public final void c(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        if (this.s) {
            return;
        }
        e7.f fVar = this.f3961t;
        int l10 = fVar.l(fVar.f4406c.e(), fVar.c());
        c7.a aVar2 = this.f3843i;
        aVar2.setColor(l10);
        e7.s sVar = this.f3962u;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.e());
        }
        super.c(canvas, matrix, i6, aVar);
    }

    @Override // d7.b, g7.f
    public final void d(f0 f0Var, Object obj) {
        super.d(f0Var, obj);
        PointF pointF = c0.f1490a;
        e7.f fVar = this.f3961t;
        if (obj == 2) {
            fVar.j(f0Var);
            return;
        }
        if (obj == c0.I) {
            e7.s sVar = this.f3962u;
            j7.a aVar = this.f3959q;
            if (sVar != null) {
                aVar.o(sVar);
            }
            e7.s sVar2 = new e7.s(f0Var, null);
            this.f3962u = sVar2;
            sVar2.a(this);
            aVar.f(fVar);
        }
    }

    @Override // d7.d
    public final String getName() {
        return this.f3960r;
    }
}
