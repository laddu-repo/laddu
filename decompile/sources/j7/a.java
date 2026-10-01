package j7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.lifecycle.j1;
import b7.g0;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import e7.q;
import e7.r;
import j1.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a implements d7.f, e7.a, g7.f {
    public float A;
    public BlurMaskFilter B;
    public c7.a C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f7242a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f7243b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f7244c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final c7.a f7245d = new c7.a(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final c7.a f7246e;

    /* renamed from: f, reason: collision with root package name */
    public final c7.a f7247f;

    /* renamed from: g, reason: collision with root package name */
    public final c7.a f7248g;

    /* renamed from: h, reason: collision with root package name */
    public final c7.a f7249h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f7250i;
    public final RectF j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f7251k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f7252l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f7253m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f7254n;

    /* renamed from: o, reason: collision with root package name */
    public final y f7255o;

    /* renamed from: p, reason: collision with root package name */
    public final d f7256p;

    /* renamed from: q, reason: collision with root package name */
    public final j1 f7257q;

    /* renamed from: r, reason: collision with root package name */
    public final e7.i f7258r;
    public a s;

    /* renamed from: t, reason: collision with root package name */
    public a f7259t;

    /* renamed from: u, reason: collision with root package name */
    public List f7260u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f7261v;

    /* renamed from: w, reason: collision with root package name */
    public final r f7262w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7263x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7264y;

    /* renamed from: z, reason: collision with root package name */
    public c7.a f7265z;

    /* JADX WARN: Type inference failed for: r0v10, types: [e7.i, e7.e] */
    public a(y yVar, d dVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f7246e = new c7.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f7247f = new c7.a(mode2);
        c7.a aVar = new c7.a(1, 0);
        this.f7248g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        c7.a aVar2 = new c7.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f7249h = aVar2;
        this.f7250i = new RectF();
        this.j = new RectF();
        this.f7251k = new RectF();
        this.f7252l = new RectF();
        this.f7253m = new RectF();
        this.f7254n = new Matrix();
        this.f7261v = new ArrayList();
        this.f7263x = true;
        this.A = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f7255o = yVar;
        this.f7256p = dVar;
        List list = dVar.f7273h;
        if (dVar.f7284u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        h7.d dVar2 = dVar.f7274i;
        dVar2.getClass();
        r rVar = new r(dVar2);
        this.f7262w = rVar;
        rVar.b(this);
        if (list != null && !list.isEmpty()) {
            j1 j1Var = new j1(list);
            this.f7257q = j1Var;
            ArrayList arrayList = (ArrayList) j1Var.f949y;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ((e7.e) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.f7257q.f950z;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                e7.e eVar = (e7.e) obj2;
                f(eVar);
                eVar.a(this);
            }
        }
        d dVar3 = this.f7256p;
        if (!dVar3.f7283t.isEmpty()) {
            ?? eVar2 = new e7.e(dVar3.f7283t);
            this.f7258r = eVar2;
            eVar2.f4405b = true;
            eVar2.a(new q(this, 3));
            boolean z10 = ((Float) this.f7258r.e()).floatValue() == 1.0f;
            if (z10 != this.f7263x) {
                this.f7263x = z10;
                this.f7255o.invalidateSelf();
            }
            f(this.f7258r);
            return;
        }
        if (true != this.f7263x) {
            this.f7263x = true;
            this.f7255o.invalidateSelf();
        }
    }

    @Override // e7.a
    public final void a() {
        this.f7255o.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    @Override // d7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r23, android.graphics.Matrix r24, int r25, n7.a r26) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.c(android.graphics.Canvas, android.graphics.Matrix, int, n7.a):void");
    }

    @Override // g7.f
    public void d(f0 f0Var, Object obj) {
        this.f7262w.c(f0Var, obj);
    }

    @Override // d7.f
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f7250i.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        i();
        Matrix matrix2 = this.f7254n;
        matrix2.set(matrix);
        if (z10) {
            List list = this.f7260u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((a) this.f7260u.get(size)).f7262w.e());
                }
            } else {
                a aVar = this.f7259t;
                if (aVar != null) {
                    matrix2.preConcat(aVar.f7262w.e());
                }
            }
        }
        matrix2.preConcat(this.f7262w.e());
    }

    public final void f(e7.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f7261v.add(eVar);
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        a aVar = this.s;
        d dVar = this.f7256p;
        if (aVar != null) {
            String str = aVar.f7256p.f7268c;
            g7.e eVar3 = new g7.e(eVar2);
            eVar3.f5506a.add(str);
            if (eVar.a(i6, this.s.f7256p.f7268c)) {
                a aVar2 = this.s;
                g7.e eVar4 = new g7.e(eVar3);
                eVar4.f5507b = aVar2;
                arrayList.add(eVar4);
            }
            if (eVar.c(i6, this.s.f7256p.f7268c) && eVar.d(i6, dVar.f7268c)) {
                this.s.p(eVar, eVar.b(i6, this.s.f7256p.f7268c) + i6, arrayList, eVar3);
            }
        }
        String str2 = dVar.f7268c;
        String str3 = dVar.f7268c;
        if (eVar.c(i6, str2)) {
            if (!"__container".equals(str3)) {
                g7.e eVar5 = new g7.e(eVar2);
                eVar5.f5506a.add(str3);
                if (eVar.a(i6, str3)) {
                    g7.e eVar6 = new g7.e(eVar5);
                    eVar6.f5507b = this;
                    arrayList.add(eVar6);
                }
                eVar2 = eVar5;
            }
            if (eVar.d(i6, str3)) {
                p(eVar, eVar.b(i6, str3) + i6, arrayList, eVar2);
            }
        }
    }

    public final void i() {
        if (this.f7260u == null) {
            if (this.f7259t == null) {
                this.f7260u = Collections.EMPTY_LIST;
                return;
            }
            this.f7260u = new ArrayList();
            for (a aVar = this.f7259t; aVar != null; aVar = aVar.f7259t) {
                this.f7260u.add(aVar);
            }
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f7250i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f7249h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i6, n7.a aVar);

    public k7.d l() {
        return this.f7256p.f7286w;
    }

    public final boolean m() {
        j1 j1Var = this.f7257q;
        if (j1Var != null && !((ArrayList) j1Var.f949y).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        g0 g0Var = this.f7255o.f1613x.f1542a;
        String str = this.f7256p.f7268c;
        HashMap hashMap = g0Var.f1532c;
        if (g0Var.f1530a) {
            n7.f fVar = (n7.f) hashMap.get(str);
            n7.f fVar2 = fVar;
            if (fVar == null) {
                Object obj = new Object();
                hashMap.put(str, obj);
                fVar2 = obj;
            }
            int i6 = fVar2.f9098a + 1;
            fVar2.f9098a = i6;
            if (i6 == Integer.MAX_VALUE) {
                fVar2.f9098a = i6 / 2;
            }
            if (str.equals("__container")) {
                v.f fVar3 = g0Var.f1531b;
                fVar3.getClass();
                v.a aVar = new v.a(fVar3);
                if (aVar.hasNext()) {
                    aVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(e7.e eVar) {
        this.f7261v.remove(eVar);
    }

    public void q(boolean z10) {
        if (z10 && this.f7265z == null) {
            this.f7265z = new c7.a();
        }
        this.f7264y = z10;
    }

    public void r(float f3) {
        r rVar = this.f7262w;
        e7.e eVar = rVar.f4453p;
        if (eVar != null) {
            eVar.i(f3);
        }
        e7.e eVar2 = rVar.f4458v;
        if (eVar2 != null) {
            eVar2.i(f3);
        }
        e7.e eVar3 = rVar.f4459w;
        if (eVar3 != null) {
            eVar3.i(f3);
        }
        e7.e eVar4 = rVar.f4449l;
        if (eVar4 != null) {
            eVar4.i(f3);
        }
        e7.e eVar5 = rVar.f4450m;
        if (eVar5 != null) {
            eVar5.i(f3);
        }
        e7.e eVar6 = rVar.f4451n;
        if (eVar6 != null) {
            eVar6.i(f3);
        }
        e7.e eVar7 = rVar.f4452o;
        if (eVar7 != null) {
            eVar7.i(f3);
        }
        e7.i iVar = rVar.f4454q;
        if (iVar != null) {
            iVar.i(f3);
        }
        e7.i iVar2 = rVar.f4455r;
        if (iVar2 != null) {
            iVar2.i(f3);
        }
        e7.i iVar3 = rVar.s;
        if (iVar3 != null) {
            iVar3.i(f3);
        }
        e7.i iVar4 = rVar.f4456t;
        if (iVar4 != null) {
            iVar4.i(f3);
        }
        e7.i iVar5 = rVar.f4457u;
        if (iVar5 != null) {
            iVar5.i(f3);
        }
        int i6 = 0;
        j1 j1Var = this.f7257q;
        if (j1Var != null) {
            ArrayList arrayList = (ArrayList) j1Var.f949y;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((e7.e) arrayList.get(i10)).i(f3);
            }
        }
        e7.i iVar6 = this.f7258r;
        if (iVar6 != null) {
            iVar6.i(f3);
        }
        a aVar = this.s;
        if (aVar != null) {
            aVar.r(f3);
        }
        while (true) {
            ArrayList arrayList2 = this.f7261v;
            if (i6 < arrayList2.size()) {
                ((e7.e) arrayList2.get(i6)).i(f3);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // d7.d
    public final void b(List list, List list2) {
    }

    public void p(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
    }
}
