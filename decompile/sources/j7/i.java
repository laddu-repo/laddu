package j7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b7.c0;
import b7.j;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import e7.p;
import e7.s;
import j1.f0;
import j4.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.HttpUrl;
import s8.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends a {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final c7.a J;
    public final c7.a K;
    public final HashMap L;
    public final v.i M;
    public final ArrayList N;
    public final ArrayList O;
    public final e7.f P;
    public final y Q;
    public final j R;
    public final int S;
    public final e7.f T;
    public s U;
    public final e7.f V;
    public s W;
    public final e7.i X;
    public s Y;
    public final e7.i Z;

    /* renamed from: a0, reason: collision with root package name */
    public s f7291a0;

    /* renamed from: b0, reason: collision with root package name */
    public final e7.f f7292b0;

    /* renamed from: c0, reason: collision with root package name */
    public s f7293c0;

    /* renamed from: d0, reason: collision with root package name */
    public s f7294d0;

    /* renamed from: e0, reason: collision with root package name */
    public final e7.f f7295e0;

    /* renamed from: f0, reason: collision with root package name */
    public final e7.f f7296f0;

    /* renamed from: g0, reason: collision with root package name */
    public final e7.f f7297g0;

    public i(y yVar, d dVar) {
        super(yVar, dVar);
        n nVar;
        n nVar2;
        h7.a aVar;
        n nVar3;
        h7.a aVar2;
        n nVar4;
        h7.a aVar3;
        b4.h hVar;
        h7.a aVar4;
        b4.h hVar2;
        h7.b bVar;
        b4.h hVar3;
        h7.b bVar2;
        b4.h hVar4;
        h7.a aVar5;
        b4.h hVar5;
        h7.a aVar6;
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        c7.a aVar7 = new c7.a(1, 1);
        aVar7.setStyle(Paint.Style.FILL);
        this.J = aVar7;
        c7.a aVar8 = new c7.a(1, 2);
        aVar8.setStyle(Paint.Style.STROKE);
        this.K = aVar8;
        this.L = new HashMap();
        this.M = new v.i();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = yVar;
        this.R = dVar.f7267b;
        e7.f fVar = new e7.f(2, (List) dVar.f7281q.f4301y);
        this.P = fVar;
        fVar.a(this);
        f(fVar);
        b0 b0Var = dVar.f7282r;
        if (b0Var != null && (hVar5 = (b4.h) b0Var.f7158x) != null && (aVar6 = (h7.a) hVar5.f1471z) != null) {
            e7.e G0 = aVar6.G0();
            this.T = (e7.f) G0;
            G0.a(this);
            f(G0);
        }
        if (b0Var != null && (hVar4 = (b4.h) b0Var.f7158x) != null && (aVar5 = (h7.a) hVar4.A) != null) {
            e7.e G02 = aVar5.G0();
            this.V = (e7.f) G02;
            G02.a(this);
            f(G02);
        }
        if (b0Var != null && (hVar3 = (b4.h) b0Var.f7158x) != null && (bVar2 = (h7.b) hVar3.B) != null) {
            e7.i G03 = bVar2.G0();
            this.X = G03;
            G03.a(this);
            f(G03);
        }
        if (b0Var != null && (hVar2 = (b4.h) b0Var.f7158x) != null && (bVar = (h7.b) hVar2.f1469x) != null) {
            e7.i G04 = bVar.G0();
            this.Z = G04;
            G04.a(this);
            f(G04);
        }
        if (b0Var != null && (hVar = (b4.h) b0Var.f7158x) != null && (aVar4 = (h7.a) hVar.f1470y) != null) {
            e7.e G05 = aVar4.G0();
            this.f7292b0 = (e7.f) G05;
            G05.a(this);
            f(G05);
        }
        if (b0Var != null && (nVar4 = (n) b0Var.f7159y) != null && (aVar3 = (h7.a) nVar4.f12260b) != null) {
            e7.e G06 = aVar3.G0();
            this.f7295e0 = (e7.f) G06;
            G06.a(this);
            f(G06);
        }
        if (b0Var != null && (nVar3 = (n) b0Var.f7159y) != null && (aVar2 = (h7.a) nVar3.f12261c) != null) {
            e7.e G07 = aVar2.G0();
            this.f7296f0 = (e7.f) G07;
            G07.a(this);
            f(G07);
        }
        if (b0Var != null && (nVar2 = (n) b0Var.f7159y) != null && (aVar = (h7.a) nVar2.f12262d) != null) {
            e7.e G08 = aVar.G0();
            this.f7297g0 = (e7.f) G08;
            G08.a(this);
            f(G08);
        }
        if (b0Var != null && (nVar = (n) b0Var.f7159y) != null) {
            this.S = nVar.f12259a;
        }
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            canvas.drawText(str, 0, str.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        }
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, o7.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, g7.b] */
    @Override // j7.a, g7.f
    public final void d(f0 f0Var, Object obj) {
        super.d(f0Var, obj);
        PointF pointF = c0.f1490a;
        if (obj == 1) {
            s sVar = this.U;
            if (sVar != null) {
                o(sVar);
            }
            s sVar2 = new s(f0Var, null);
            this.U = sVar2;
            sVar2.a(this);
            f(this.U);
            return;
        }
        if (obj == 2) {
            s sVar3 = this.W;
            if (sVar3 != null) {
                o(sVar3);
            }
            s sVar4 = new s(f0Var, null);
            this.W = sVar4;
            sVar4.a(this);
            f(this.W);
            return;
        }
        if (obj == c0.f1505q) {
            s sVar5 = this.Y;
            if (sVar5 != null) {
                o(sVar5);
            }
            s sVar6 = new s(f0Var, null);
            this.Y = sVar6;
            sVar6.a(this);
            f(this.Y);
            return;
        }
        if (obj == c0.f1506r) {
            s sVar7 = this.f7291a0;
            if (sVar7 != null) {
                o(sVar7);
            }
            s sVar8 = new s(f0Var, null);
            this.f7291a0 = sVar8;
            sVar8.a(this);
            f(this.f7291a0);
            return;
        }
        if (obj == c0.D) {
            s sVar9 = this.f7293c0;
            if (sVar9 != null) {
                o(sVar9);
            }
            s sVar10 = new s(f0Var, null);
            this.f7293c0 = sVar10;
            sVar10.a(this);
            f(this.f7293c0);
            return;
        }
        if (obj == c0.K) {
            s sVar11 = this.f7294d0;
            if (sVar11 != null) {
                o(sVar11);
            }
            s sVar12 = new s(f0Var, null);
            this.f7294d0 = sVar12;
            sVar12.a(this);
            f(this.f7294d0);
            return;
        }
        if (obj == c0.M) {
            e7.f fVar = this.P;
            fVar.getClass();
            fVar.j(new p(new Object(), f0Var, new Object()));
        }
    }

    @Override // j7.a, d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        j jVar = this.R;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jVar.f1551k.width(), jVar.f1551k.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0522, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f1  */
    @Override // j7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, n7.a r34) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.i.k(android.graphics.Canvas, android.graphics.Matrix, int, n7.a):void");
    }

    public final String s(int i6, String str) {
        int codePointAt = str.codePointAt(i6);
        int charCount = Character.charCount(codePointAt) + i6;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        v.i iVar = this.M;
        if (iVar.f(j) >= 0) {
            return (String) iVar.d(j);
        }
        StringBuilder sb2 = this.D;
        sb2.setLength(0);
        while (i6 < charCount) {
            int codePointAt3 = str.codePointAt(i6);
            sb2.appendCodePoint(codePointAt3);
            i6 += Character.charCount(codePointAt3);
        }
        String sb3 = sb2.toString();
        iVar.h(j, sb3);
        return sb3;
    }

    public final void t(g7.b bVar, int i6, int i10) {
        int intValue;
        s sVar = this.U;
        c7.a aVar = this.J;
        if (sVar != null) {
            aVar.setColor(((Integer) sVar.e()).intValue());
        } else {
            e7.f fVar = this.T;
            if (fVar != null && x(i10)) {
                aVar.setColor(((Integer) fVar.e()).intValue());
            } else {
                aVar.setColor(bVar.f5491h);
            }
        }
        s sVar2 = this.W;
        c7.a aVar2 = this.K;
        if (sVar2 != null) {
            aVar2.setColor(((Integer) sVar2.e()).intValue());
        } else {
            e7.f fVar2 = this.V;
            if (fVar2 != null && x(i10)) {
                aVar2.setColor(((Integer) fVar2.e()).intValue());
            } else {
                aVar2.setColor(bVar.f5492i);
            }
        }
        e7.e eVar = this.f7262w.f4453p;
        int i11 = 100;
        if (eVar == null) {
            intValue = 100;
        } else {
            intValue = ((Integer) eVar.e()).intValue();
        }
        e7.f fVar3 = this.f7292b0;
        if (fVar3 != null && x(i10)) {
            i11 = ((Integer) fVar3.e()).intValue();
        }
        int round = Math.round((((i11 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i6) / 255.0f);
        aVar.setAlpha(round);
        aVar2.setAlpha(round);
        s sVar3 = this.Y;
        if (sVar3 != null) {
            aVar2.setStrokeWidth(((Float) sVar3.e()).floatValue());
            return;
        }
        e7.i iVar = this.X;
        if (iVar != null && x(i10)) {
            aVar2.setStrokeWidth(((Float) iVar.e()).floatValue());
        } else {
            aVar2.setStrokeWidth(n7.i.c() * bVar.j);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [j7.h, java.lang.Object] */
    public final h w(int i6) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i6; size++) {
            ?? obj = new Object();
            obj.f7289a = HttpUrl.FRAGMENT_ENCODE_SET;
            obj.f7290b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            arrayList.add(obj);
        }
        return (h) arrayList.get(i6 - 1);
    }

    public final boolean x(int i6) {
        e7.f fVar;
        int length = ((g7.b) this.P.e()).f5484a.length();
        e7.f fVar2 = this.f7295e0;
        if (fVar2 != null && (fVar = this.f7296f0) != null) {
            int min = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
            int max = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
            e7.f fVar3 = this.f7297g0;
            if (fVar3 != null) {
                int intValue = ((Integer) fVar3.e()).intValue();
                min += intValue;
                max += intValue;
            }
            if (this.S == 2) {
                if (i6 < min || i6 >= max) {
                    return false;
                }
                return true;
            }
            float f3 = (i6 / length) * 100.0f;
            if (f3 < min || f3 >= max) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean y(Canvas canvas, g7.b bVar, int i6, float f3) {
        float f10;
        float f11;
        PointF pointF = bVar.f5494l;
        PointF pointF2 = bVar.f5495m;
        float c10 = n7.i.c();
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (pointF == null) {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f10 = (bVar.f5489f * c10) + pointF.y;
        }
        float f13 = (i6 * bVar.f5489f * c10) + f10;
        if (this.Q.R && pointF2 != null && pointF != null && f13 >= pointF.y + pointF2.y + bVar.f5486c) {
            return false;
        }
        if (pointF == null) {
            f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f11 = pointF.x;
        }
        if (pointF2 != null) {
            f12 = pointF2.x;
        }
        int c11 = y.e.c(bVar.f5487d);
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    return true;
                }
                canvas.translate(((f12 / 2.0f) + f11) - (f3 / 2.0f), f13);
                return true;
            }
            canvas.translate((f11 + f12) - f3, f13);
            return true;
        }
        canvas.translate(f11, f13);
        return true;
    }

    public final List z(String str, float f3, g7.c cVar, float f10, float f11, boolean z10) {
        float measureText;
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i6 = 0;
        int i10 = 0;
        boolean z11 = false;
        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i11 = 0;
        float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (z10) {
                g7.d dVar = (g7.d) this.R.f1549h.c(g7.d.a(charAt, cVar.f5496a, cVar.f5498c));
                if (dVar != null) {
                    measureText = (n7.i.c() * ((float) dVar.f5502c) * f10) + f11;
                }
            } else {
                measureText = this.J.measureText(str.substring(i12, i12 + 1)) + f11;
            }
            if (charAt == ' ') {
                z11 = true;
                f14 = measureText;
            } else if (z11) {
                i11 = i12;
                f13 = measureText;
                z11 = false;
            } else {
                f13 += measureText;
            }
            f12 += measureText;
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f12 >= f3 && charAt != ' ') {
                i6++;
                h w10 = w(i6);
                if (i11 == i10) {
                    w10.f7289a = str.substring(i10, i12).trim();
                    w10.f7290b = (f12 - measureText) - ((r10.length() - r8.length()) * f14);
                    i10 = i12;
                    i11 = i10;
                    f12 = measureText;
                    f13 = f12;
                } else {
                    w10.f7289a = str.substring(i10, i11 - 1).trim();
                    w10.f7290b = ((f12 - f13) - ((r8.length() - r14.length()) * f14)) - f14;
                    f12 = f13;
                    i10 = i11;
                }
            }
        }
        if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i6++;
            h w11 = w(i6);
            w11.f7289a = str.substring(i10);
            w11.f7290b = f12;
        }
        return this.O.subList(0, i6);
    }
}
