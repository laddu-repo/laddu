package r5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j5.a0;
import j5.j;
import j5.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m5.p;
import m5.s;
import o9.v;
import p7.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final k5.a J;
    public final k5.a K;
    public final HashMap L;
    public final v.g M;
    public final ArrayList N;
    public final ArrayList O;
    public final m5.f P;
    public final w Q;
    public final j R;
    public final int S;
    public final m5.f T;
    public s U;
    public final m5.f V;
    public s W;
    public final m5.i X;
    public s Y;
    public final m5.i Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public s f11289a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final m5.f f11290b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public s f11291c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public s f11292d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final m5.f f11293e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final m5.f f11294f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final m5.f f11295g0;

    public i(w wVar, d dVar) {
        m mVar;
        m mVar2;
        p5.a aVar;
        m mVar3;
        p5.a aVar2;
        m mVar4;
        p5.a aVar3;
        ad.c cVar;
        p5.a aVar4;
        ad.c cVar2;
        p5.b bVar;
        ad.c cVar3;
        p5.b bVar2;
        ad.c cVar4;
        p5.a aVar5;
        ad.c cVar5;
        p5.a aVar6;
        super(wVar, dVar);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        k5.a aVar7 = new k5.a(1, 1);
        aVar7.setStyle(Paint.Style.FILL);
        this.J = aVar7;
        k5.a aVar8 = new k5.a(1, 2);
        aVar8.setStyle(Paint.Style.STROKE);
        this.K = aVar8;
        this.L = new HashMap();
        this.M = new v.g();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = wVar;
        this.R = dVar.f11265b;
        m5.f fVar = new m5.f(2, (List) dVar.f11278q.f2053w);
        this.P = fVar;
        fVar.a(this);
        d(fVar);
        p2.c cVar6 = dVar.f11279r;
        if (cVar6 != null && (cVar5 = (ad.c) cVar6.f10196w) != null && (aVar6 = (p5.a) cVar5.f479w) != null) {
            m5.e eVarF = aVar6.f();
            this.T = (m5.f) eVarF;
            eVarF.a(this);
            d(eVarF);
        }
        if (cVar6 != null && (cVar4 = (ad.c) cVar6.f10196w) != null && (aVar5 = (p5.a) cVar4.f480x) != null) {
            m5.e eVarF2 = aVar5.f();
            this.V = (m5.f) eVarF2;
            eVarF2.a(this);
            d(eVarF2);
        }
        if (cVar6 != null && (cVar3 = (ad.c) cVar6.f10196w) != null && (bVar2 = (p5.b) cVar3.f481y) != null) {
            m5.i iVarF = bVar2.f();
            this.X = iVarF;
            iVarF.a(this);
            d(iVarF);
        }
        if (cVar6 != null && (cVar2 = (ad.c) cVar6.f10196w) != null && (bVar = (p5.b) cVar2.f482z) != null) {
            m5.i iVarF2 = bVar.f();
            this.Z = iVarF2;
            iVarF2.a(this);
            d(iVarF2);
        }
        if (cVar6 != null && (cVar = (ad.c) cVar6.f10196w) != null && (aVar4 = (p5.a) cVar.A) != null) {
            m5.e eVarF3 = aVar4.f();
            this.f11290b0 = (m5.f) eVarF3;
            eVarF3.a(this);
            d(eVarF3);
        }
        if (cVar6 != null && (mVar4 = (m) cVar6.f10197x) != null && (aVar3 = (p5.a) mVar4.f10430w) != null) {
            m5.e eVarF4 = aVar3.f();
            this.f11293e0 = (m5.f) eVarF4;
            eVarF4.a(this);
            d(eVarF4);
        }
        if (cVar6 != null && (mVar3 = (m) cVar6.f10197x) != null && (aVar2 = (p5.a) mVar3.f10431x) != null) {
            m5.e eVarF5 = aVar2.f();
            this.f11294f0 = (m5.f) eVarF5;
            eVarF5.a(this);
            d(eVarF5);
        }
        if (cVar6 != null && (mVar2 = (m) cVar6.f10197x) != null && (aVar = (p5.a) mVar2.f10432y) != null) {
            m5.e eVarF6 = aVar.f();
            this.f11295g0 = (m5.f) eVarF6;
            eVarF6.a(this);
            d(eVarF6);
        }
        if (cVar6 == null || (mVar = (m) cVar6.f10197x) == null) {
            return;
        }
        this.S = mVar.f10429v;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // r5.a, l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        j jVar = this.R;
        rectF.set(0.0f, 0.0f, jVar.f6852k.width(), jVar.f6852k.height());
    }

    @Override // r5.a, o5.f
    public final void g(Object obj, p2.c cVar) {
        super.g(obj, cVar);
        PointF pointF = a0.f6788a;
        if (obj == 1) {
            s sVar = this.U;
            if (sVar != null) {
                o(sVar);
            }
            s sVar2 = new s(null, cVar);
            this.U = sVar2;
            sVar2.a(this);
            d(this.U);
            return;
        }
        if (obj == 2) {
            s sVar3 = this.W;
            if (sVar3 != null) {
                o(sVar3);
            }
            s sVar4 = new s(null, cVar);
            this.W = sVar4;
            sVar4.a(this);
            d(this.W);
            return;
        }
        if (obj == a0.f6802q) {
            s sVar5 = this.Y;
            if (sVar5 != null) {
                o(sVar5);
            }
            s sVar6 = new s(null, cVar);
            this.Y = sVar6;
            sVar6.a(this);
            d(this.Y);
            return;
        }
        if (obj == a0.f6803r) {
            s sVar7 = this.f11289a0;
            if (sVar7 != null) {
                o(sVar7);
            }
            s sVar8 = new s(null, cVar);
            this.f11289a0 = sVar8;
            sVar8.a(this);
            d(this.f11289a0);
            return;
        }
        if (obj == a0.D) {
            s sVar9 = this.f11291c0;
            if (sVar9 != null) {
                o(sVar9);
            }
            s sVar10 = new s(null, cVar);
            this.f11291c0 = sVar10;
            sVar10.a(this);
            d(this.f11291c0);
            return;
        }
        if (obj != a0.K) {
            if (obj == a0.M) {
                m5.f fVar = this.P;
                fVar.getClass();
                fVar.j(new p(new v(), cVar, new o5.b()));
                return;
            }
            return;
        }
        s sVar11 = this.f11292d0;
        if (sVar11 != null) {
            o(sVar11);
        }
        s sVar12 = new s(null, cVar);
        this.f11292d0 = sVar12;
        sVar12.a(this);
        d(this.f11292d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0527, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    @Override // r5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, v5.a r34) {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.i.k(android.graphics.Canvas, android.graphics.Matrix, int, v5.a):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String s(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j8 = iCodePointAt;
        v.g gVar = this.M;
        if (gVar.f(j8) >= 0) {
            return (String) gVar.d(j8);
        }
        StringBuilder sb2 = this.D;
        sb2.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb2.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb2.toString();
        gVar.h(j8, string);
        return string;
    }

    public final void t(o5.b bVar, int i, int i10) {
        s sVar = this.U;
        k5.a aVar = this.J;
        if (sVar != null) {
            aVar.setColor(((Integer) sVar.e()).intValue());
        } else {
            m5.f fVar = this.T;
            if (fVar == null || !x(i10)) {
                aVar.setColor(bVar.f9936h);
            } else {
                aVar.setColor(((Integer) fVar.e()).intValue());
            }
        }
        s sVar2 = this.W;
        k5.a aVar2 = this.K;
        if (sVar2 != null) {
            aVar2.setColor(((Integer) sVar2.e()).intValue());
        } else {
            m5.f fVar2 = this.V;
            if (fVar2 == null || !x(i10)) {
                aVar2.setColor(bVar.i);
            } else {
                aVar2.setColor(((Integer) fVar2.e()).intValue());
            }
        }
        m5.e eVar = this.f11260w.f8503p;
        int iIntValue = 100;
        int iIntValue2 = eVar == null ? 100 : ((Integer) eVar.e()).intValue();
        m5.f fVar3 = this.f11290b0;
        if (fVar3 != null && x(i10)) {
            iIntValue = ((Integer) fVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        aVar.setAlpha(iRound);
        aVar2.setAlpha(iRound);
        s sVar3 = this.Y;
        if (sVar3 != null) {
            aVar2.setStrokeWidth(((Float) sVar3.e()).floatValue());
            return;
        }
        m5.i iVar = this.X;
        if (iVar == null || !x(i10)) {
            aVar2.setStrokeWidth(v5.i.c() * bVar.f9937j);
        } else {
            aVar2.setStrokeWidth(((Float) iVar.e()).floatValue());
        }
    }

    public final h w(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            h hVar = new h();
            hVar.f11287a = "";
            hVar.f11288b = 0.0f;
            arrayList.add(hVar);
        }
        return (h) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        m5.f fVar;
        int length = ((o5.b) this.P.e()).f9930a.length();
        m5.f fVar2 = this.f11293e0;
        if (fVar2 == null || (fVar = this.f11294f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        int iMax = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        m5.f fVar3 = this.f11295g0;
        if (fVar3 != null) {
            int iIntValue = ((Integer) fVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean y(Canvas canvas, o5.b bVar, int i, float f) {
        PointF pointF = bVar.f9939l;
        PointF pointF2 = bVar.f9940m;
        float fC = v5.i.c();
        float f4 = (i * bVar.f * fC) + (pointF == null ? 0.0f : (bVar.f * fC) + pointF.y);
        if (this.Q.P && pointF2 != null && pointF != null && f4 >= pointF.y + pointF2.y + bVar.f9932c) {
            return false;
        }
        float f10 = pointF == null ? 0.0f : pointF.x;
        float f11 = pointF2 != null ? pointF2.x : 0.0f;
        int iC = y.e.c(bVar.f9933d);
        if (iC == 0) {
            canvas.translate(f10, f4);
            return true;
        }
        if (iC == 1) {
            canvas.translate((f10 + f11) - f, f4);
            return true;
        }
        if (iC != 2) {
            return true;
        }
        canvas.translate(((f11 / 2.0f) + f10) - (f / 2.0f), f4);
        return true;
    }

    public final List z(String str, float f, o5.c cVar, float f4, float f10, boolean z2) {
        float fMeasureText;
        int i = 0;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (z2) {
                o5.d dVar = (o5.d) this.R.f6850h.c(o5.d.a(cCharAt, cVar.f9941a, cVar.f9943c));
                if (dVar != null) {
                    fMeasureText = (v5.i.c() * ((float) dVar.f9947c) * f4) + f10;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i12, i12 + 1)) + f10;
            }
            if (cCharAt == ' ') {
                z10 = true;
                f13 = fMeasureText;
            } else if (z10) {
                z10 = false;
                i11 = i12;
                f12 = fMeasureText;
            } else {
                f12 += fMeasureText;
            }
            f11 += fMeasureText;
            if (f > 0.0f && f11 >= f && cCharAt != ' ') {
                i++;
                h hVarW = w(i);
                if (i11 == i10) {
                    hVarW.f11287a = str.substring(i10, i12).trim();
                    hVarW.f11288b = (f11 - fMeasureText) - ((r10.length() - r8.length()) * f13);
                    i10 = i12;
                    i11 = i10;
                    f11 = fMeasureText;
                    f12 = f11;
                } else {
                    hVarW.f11287a = str.substring(i10, i11 - 1).trim();
                    hVarW.f11288b = ((f11 - f12) - ((r8.length() - r14.length()) * f13)) - f13;
                    f11 = f12;
                    i10 = i11;
                }
            }
        }
        if (f11 > 0.0f) {
            i++;
            h hVarW2 = w(i);
            hVarW2.f11287a = str.substring(i10);
            hVarW2.f11288b = f11;
        }
        return this.O.subList(0, i);
    }
}
