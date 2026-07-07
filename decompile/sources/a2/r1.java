package a2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f377a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f378b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f379c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f380d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f381e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f382f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f383g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f384h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f385i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f386k;

    /* renamed from: l, reason: collision with root package name */
    public Object f387l;

    public r1() {
        this.f378b = new o7.b[4];
        this.f379c = new Matrix[4];
        this.f380d = new Matrix[4];
        this.f381e = new PointF();
        this.f382f = new Path();
        this.f383g = new Path();
        this.f384h = new o7.b();
        this.f385i = new float[2];
        this.j = new float[2];
        this.f386k = new Path();
        this.f387l = new Path();
        this.f377a = true;
        for (int i6 = 0; i6 < 4; i6++) {
            ((o7.b[]) this.f378b)[i6] = new o7.b();
            ((Matrix[]) this.f379c)[i6] = new Matrix();
            ((Matrix[]) this.f380d)[i6] = new Matrix();
        }
    }

    public r1.d1 a(int i6, ArrayList arrayList, q2.c1 c1Var) {
        ArrayList arrayList2 = (ArrayList) this.f379c;
        if (!arrayList.isEmpty()) {
            this.f386k = c1Var;
            for (int i10 = i6; i10 < arrayList.size() + i6; i10++) {
                q1 q1Var = (q1) arrayList.get(i10 - i6);
                if (i10 > 0) {
                    q1 q1Var2 = (q1) arrayList2.get(i10 - 1);
                    q1Var.f369d = q1Var2.f366a.L.f10943e.o() + q1Var2.f369d;
                    q1Var.f370e = false;
                    q1Var.f368c.clear();
                } else {
                    q1Var.f369d = 0;
                    q1Var.f370e = false;
                    q1Var.f368c.clear();
                }
                int o10 = q1Var.f366a.L.f10943e.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((q1) arrayList2.get(i11)).f369d += o10;
                }
                arrayList2.add(i10, q1Var);
                ((HashMap) this.f381e).put(q1Var.f367b, q1Var);
                if (this.f377a) {
                    g(q1Var);
                    if (((IdentityHashMap) this.f380d).isEmpty()) {
                        ((HashSet) this.f384h).add(q1Var);
                    } else {
                        p1 p1Var = (p1) ((HashMap) this.f382f).get(q1Var);
                        if (p1Var != null) {
                            p1Var.f362a.d(p1Var.f363b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(ua.m mVar, float[] fArr, float f3, RectF rectF, k7.c cVar, Path path) {
        int i6;
        char c10;
        float f10;
        ua.f fVar;
        k7.c cVar2;
        ua.d cVar3;
        k6.e eVar;
        k7.c cVar4 = cVar;
        Matrix[] matrixArr = (Matrix[]) this.f380d;
        float[] fArr2 = (float[]) this.f385i;
        o7.b[] bVarArr = (o7.b[]) this.f378b;
        Matrix[] matrixArr2 = (Matrix[]) this.f379c;
        path.rewind();
        Path path2 = (Path) this.f382f;
        path2.rewind();
        Path path3 = (Path) this.f383g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            i6 = 4;
            c10 = 0;
            if (i10 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f381e;
            if (fArr == null) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            cVar3 = mVar.f13020f;
                        } else {
                            cVar3 = mVar.f13019e;
                        }
                    } else {
                        cVar3 = mVar.f13022h;
                    }
                } else {
                    cVar3 = mVar.f13021g;
                }
            } else {
                cVar3 = new ua.c(fArr[i10]);
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        eVar = mVar.f13016b;
                    } else {
                        eVar = mVar.f13015a;
                    }
                } else {
                    eVar = mVar.f13018d;
                }
            } else {
                eVar = mVar.f13017c;
            }
            o7.b bVar = bVarArr[i10];
            eVar.getClass();
            Matrix[] matrixArr3 = matrixArr;
            eVar.c(bVar, f3, cVar3.a(rectF));
            int i11 = i10 + 1;
            float f11 = (i11 % 4) * 90;
            matrixArr2[i10].reset();
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f11);
            o7.b bVar2 = bVarArr[i10];
            fArr2[0] = bVar2.f10028b;
            fArr2[1] = bVar2.f10029c;
            matrixArr2[i10].mapPoints(fArr2);
            matrixArr3[i10].reset();
            matrixArr3[i10].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i10].preRotate(f11);
            i10 = i11;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i12 = 0;
        while (i12 < i6) {
            o7.b bVar3 = bVarArr[i12];
            bVar3.getClass();
            fArr2[c10] = 0.0f;
            fArr2[1] = bVar3.f10027a;
            matrixArr2[i12].mapPoints(fArr2);
            if (i12 == 0) {
                path.moveTo(fArr2[c10], fArr2[1]);
            } else {
                path.lineTo(fArr2[c10], fArr2[1]);
            }
            bVarArr[i12].b(matrixArr2[i12], path);
            if (cVar4 != null) {
                o7.b bVar4 = bVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                ua.i iVar = (ua.i) cVar4.f7745y;
                BitSet bitSet = iVar.B;
                bVar4.getClass();
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                bitSet.set(i12, false);
                ua.u[] uVarArr = iVar.f13001z;
                bVar4.a(bVar4.f10031e);
                uVarArr[i12] = new ua.o(new ArrayList((ArrayList) bVar4.f10033g), new Matrix(matrix));
            } else {
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            Path path4 = (Path) this.f386k;
            o7.b bVar5 = (o7.b) this.f384h;
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            o7.b bVar6 = bVarArr[i12];
            fArr2[0] = bVar6.f10028b;
            fArr2[1] = bVar6.f10029c;
            matrixArr2[i12].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.j;
            o7.b bVar7 = bVarArr[i14];
            bVar7.getClass();
            fArr3[0] = f10;
            fArr3[1] = bVar7.f10027a;
            matrixArr2[i14].mapPoints(fArr3);
            o7.b[] bVarArr2 = bVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            o7.b bVar8 = bVarArr2[i12];
            fArr2[0] = bVar8.f10028b;
            fArr2[1] = bVar8.f10029c;
            matrixArr5[i12].mapPoints(fArr2);
            if (i12 != 1 && i12 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            bVar5.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        fVar = mVar.j;
                    } else {
                        fVar = mVar.f13023i;
                    }
                } else {
                    fVar = mVar.f13025l;
                }
            } else {
                fVar = mVar.f13024k;
            }
            fVar.getClass();
            bVar5.c(max, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path4.reset();
            bVar5.b(matrixArr4[i12], path4);
            if (this.f377a && (f(path4, i12) || f(path4, i14))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = bVar5.f10027a;
                matrixArr4[i12].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                bVar5.b(matrixArr4[i12], path2);
            } else {
                bVar5.b(matrixArr4[i12], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr4[i12];
                cVar2 = cVar;
                ua.i iVar2 = (ua.i) cVar2.f7745y;
                iVar2.B.set(i12 + 4, false);
                ua.u[] uVarArr2 = iVar2.A;
                bVar5.a(bVar5.f10031e);
                uVarArr2[i12] = new ua.o(new ArrayList((ArrayList) bVar5.f10033g), new Matrix(matrix2));
            } else {
                cVar2 = cVar;
            }
            cVar4 = cVar2;
            i12 = i13;
            bVarArr = bVarArr2;
            matrixArr2 = matrixArr5;
            i6 = 4;
            c10 = 0;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public r1.d1 c() {
        ArrayList arrayList = (ArrayList) this.f379c;
        if (arrayList.isEmpty()) {
            return r1.d1.f11368a;
        }
        int i6 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q1 q1Var = (q1) arrayList.get(i10);
            q1Var.f369d = i6;
            i6 += q1Var.f366a.L.f10943e.o();
        }
        return new x1(arrayList, (q2.c1) this.f386k);
    }

    public void d() {
        Iterator it = ((HashSet) this.f384h).iterator();
        while (it.hasNext()) {
            q1 q1Var = (q1) it.next();
            if (q1Var.f368c.isEmpty()) {
                p1 p1Var = (p1) ((HashMap) this.f382f).get(q1Var);
                if (p1Var != null) {
                    p1Var.f362a.d(p1Var.f363b);
                }
                it.remove();
            }
        }
    }

    public void e(q1 q1Var) {
        if (q1Var.f370e && q1Var.f368c.isEmpty()) {
            p1 p1Var = (p1) ((HashMap) this.f382f).remove(q1Var);
            p1Var.getClass();
            o1 o1Var = p1Var.f364c;
            q2.a aVar = p1Var.f362a;
            aVar.r(p1Var.f363b);
            aVar.u(o1Var);
            aVar.t(o1Var);
            ((HashSet) this.f384h).remove(q1Var);
        }
    }

    public boolean f(Path path, int i6) {
        Path path2 = (Path) this.f387l;
        path2.reset();
        ((o7.b[]) this.f378b)[i6].b(((Matrix[]) this.f379c)[i6], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [q2.d0, a2.h1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [f2.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, q2.h0] */
    public void g(q1 q1Var) {
        q2.y yVar = q1Var.f366a;
        ?? r12 = new q2.d0() { // from class: a2.h1
            @Override // q2.d0
            public final void a(q2.a aVar, r1.d1 d1Var) {
                u1.x xVar = ((w0) r1.this.f383g).E;
                xVar.d(2);
                xVar.e(22);
            }
        };
        o1 o1Var = new o1(this, q1Var);
        ((HashMap) this.f382f).put(q1Var, new p1(yVar, r12, o1Var));
        String str = u1.a0.f12750a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        yVar.getClass();
        b2.k kVar = yVar.f10830z;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) kVar.A;
        ?? obj = new Object();
        obj.f10887a = handler;
        obj.f10888b = o1Var;
        copyOnWriteArrayList.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        f2.l lVar = yVar.A;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = lVar.f4677c;
        ?? obj2 = new Object();
        obj2.f4673a = handler2;
        obj2.f4674b = o1Var;
        copyOnWriteArrayList2.add(obj2);
        yVar.m(r12, (w1.a0) this.f387l, (b2.m) this.f378b);
    }

    public void h(q2.a0 a0Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f380d;
        q1 q1Var = (q1) identityHashMap.remove(a0Var);
        q1Var.getClass();
        q1Var.f366a.q(a0Var);
        q1Var.f368c.remove(((q2.v) a0Var).f10971x);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(q1Var);
    }

    public void i(int i6, int i10) {
        ArrayList arrayList = (ArrayList) this.f379c;
        for (int i11 = i10 - 1; i11 >= i6; i11--) {
            q1 q1Var = (q1) arrayList.remove(i11);
            ((HashMap) this.f381e).remove(q1Var.f367b);
            int i12 = -q1Var.f366a.L.f10943e.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((q1) arrayList.get(i13)).f369d += i12;
            }
            q1Var.f370e = true;
            if (this.f377a) {
                e(q1Var);
            }
        }
    }

    public r1(w0 w0Var, b2.f fVar, u1.x xVar, b2.m mVar) {
        this.f378b = mVar;
        this.f383g = w0Var;
        this.f386k = new q2.c1();
        this.f380d = new IdentityHashMap();
        this.f381e = new HashMap();
        this.f379c = new ArrayList();
        this.f385i = fVar;
        this.j = xVar;
        this.f382f = new HashMap();
        this.f384h = new HashSet();
    }
}
