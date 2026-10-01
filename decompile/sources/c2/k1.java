package c2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1826e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f1828h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f1831l;

    public k1() {
        this.f1823b = new o9.v[4];
        this.f1824c = new Matrix[4];
        this.f1825d = new Matrix[4];
        this.f1826e = new PointF();
        this.f = new Path();
        this.f1827g = new Path();
        this.f1828h = new o9.v();
        this.i = new float[2];
        this.f1829j = new float[2];
        this.f1830k = new Path();
        this.f1831l = new Path();
        this.f1822a = true;
        for (int i = 0; i < 4; i++) {
            ((o9.v[]) this.f1823b)[i] = new o9.v();
            ((Matrix[]) this.f1824c)[i] = new Matrix();
            ((Matrix[]) this.f1825d)[i] = new Matrix();
        }
    }

    public t1.s0 a(int i, ArrayList arrayList, o2.f1 f1Var) {
        ArrayList arrayList2 = (ArrayList) this.f1824c;
        if (!arrayList.isEmpty()) {
            this.f1830k = f1Var;
            for (int i10 = i; i10 < arrayList.size() + i; i10++) {
                j1 j1Var = (j1) arrayList.get(i10 - i);
                if (i10 > 0) {
                    j1 j1Var2 = (j1) arrayList2.get(i10 - 1);
                    j1Var.f1810d = j1Var2.f1807a.f9579o.f9522b.o() + j1Var2.f1810d;
                    j1Var.f1811e = false;
                    j1Var.f1809c.clear();
                } else {
                    j1Var.f1810d = 0;
                    j1Var.f1811e = false;
                    j1Var.f1809c.clear();
                }
                int iO = j1Var.f1807a.f9579o.f9522b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((j1) arrayList2.get(i11)).f1810d += iO;
                }
                arrayList2.add(i10, j1Var);
                ((HashMap) this.f1826e).put(j1Var.f1808b, j1Var);
                if (this.f1822a) {
                    g(j1Var);
                    if (((IdentityHashMap) this.f1825d).isEmpty()) {
                        ((HashSet) this.f1828h).add(j1Var);
                    } else {
                        i1 i1Var = (i1) ((HashMap) this.f).get(j1Var);
                        if (i1Var != null) {
                            i1Var.f1774a.c(i1Var.f1775b);
                        }
                    }
                }
            }
        }
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(o9.m mVar, float[] fArr, float f, RectF rectF, ka.c cVar, Path path) {
        int i;
        char c10;
        float f4;
        ka.c cVar2;
        char c11;
        ka.c cVar3 = cVar;
        Matrix[] matrixArr = (Matrix[]) this.f1825d;
        float[] fArr2 = (float[]) this.i;
        o9.v[] vVarArr = (o9.v[]) this.f1823b;
        Matrix[] matrixArr2 = (Matrix[]) this.f1824c;
        path.rewind();
        Path path2 = (Path) this.f;
        path2.rewind();
        Path path3 = (Path) this.f1827g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            c10 = 0;
            if (i10 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f1826e;
            o9.d cVar4 = fArr == null ? i10 != 1 ? i10 != 2 ? i10 != 3 ? mVar.f : mVar.f10038e : mVar.f10040h : mVar.f10039g : new o9.c(fArr[i10]);
            com.bumptech.glide.c cVar5 = i10 != 1 ? i10 != 2 ? i10 != 3 ? mVar.f10035b : mVar.f10034a : mVar.f10037d : mVar.f10036c;
            o9.v vVar = vVarArr[i10];
            cVar5.getClass();
            Matrix[] matrixArr3 = matrixArr;
            cVar5.r(vVar, f, cVar4.a(rectF));
            int i11 = i10 + 1;
            float f10 = (i11 % 4) * 90;
            matrixArr2[i10].reset();
            if (i10 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i10 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i10 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f10);
            o9.v vVar2 = vVarArr[i10];
            fArr2[0] = vVar2.f10063b;
            fArr2[1] = vVar2.f10064c;
            matrixArr2[i10].mapPoints(fArr2);
            matrixArr3[i10].reset();
            matrixArr3[i10].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i10].preRotate(f10);
            i10 = i11;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i12 = 0;
        for (i = 4; i12 < i; i = 4) {
            o9.v vVar3 = vVarArr[i12];
            vVar3.getClass();
            fArr2[c10] = 0.0f;
            fArr2[1] = vVar3.f10062a;
            matrixArr2[i12].mapPoints(fArr2);
            if (i12 == 0) {
                path.moveTo(fArr2[c10], fArr2[1]);
            } else {
                path.lineTo(fArr2[c10], fArr2[1]);
            }
            vVarArr[i12].b(matrixArr2[i12], path);
            if (cVar3 != null) {
                o9.v vVar4 = vVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                o9.i iVar = (o9.i) cVar3.f7872v;
                BitSet bitSet = iVar.f10021z;
                vVar4.getClass();
                f4 = 0.0f;
                bitSet.set(i12, (boolean) c10);
                o9.u[] uVarArr = iVar.f10019x;
                vVar4.a(vVar4.f10066e);
                uVarArr[i12] = new o9.o(new ArrayList((ArrayList) vVar4.f10067g), new Matrix(matrix));
            } else {
                f4 = 0.0f;
            }
            Path path4 = (Path) this.f1830k;
            o9.v vVar5 = (o9.v) this.f1828h;
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            o9.v vVar6 = vVarArr[i12];
            fArr2[0] = vVar6.f10063b;
            fArr2[1] = vVar6.f10064c;
            matrixArr2[i12].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.f1829j;
            o9.v vVar7 = vVarArr[i14];
            vVar7.getClass();
            fArr3[0] = f4;
            fArr3[1] = vVar7.f10062a;
            matrixArr2[i14].mapPoints(fArr3);
            o9.v[] vVarArr2 = vVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f4);
            o9.v vVar8 = vVarArr2[i12];
            fArr2[0] = vVar8.f10063b;
            fArr2[1] = vVar8.f10064c;
            matrixArr5[i12].mapPoints(fArr2);
            if (i12 == 1 || i12 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            vVar5.d(0.0f, 270.0f, 0.0f);
            (i12 != 1 ? i12 != 2 ? i12 != 3 ? mVar.f10041j : mVar.i : mVar.f10043l : mVar.f10042k).getClass();
            vVar5.c(fMax, 0.0f);
            path4.reset();
            vVar5.b(matrixArr4[i12], path4);
            if (this.f1822a && (f(path4, i12) || f(path4, i14))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = vVar5.f10062a;
                matrixArr4[i12].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                vVar5.b(matrixArr4[i12], path2);
            } else {
                vVar5.b(matrixArr4[i12], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr4[i12];
                cVar2 = cVar;
                o9.i iVar2 = (o9.i) cVar2.f7872v;
                c11 = 0;
                iVar2.f10021z.set(i12 + 4, false);
                o9.u[] uVarArr2 = iVar2.f10020y;
                vVar5.a(vVar5.f10066e);
                uVarArr2[i12] = new o9.o(new ArrayList((ArrayList) vVar5.f10067g), new Matrix(matrix2));
            } else {
                cVar2 = cVar;
                c11 = 0;
            }
            c10 = c11;
            cVar3 = cVar2;
            i12 = i13;
            vVarArr = vVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public t1.s0 c() {
        ArrayList arrayList = (ArrayList) this.f1824c;
        if (arrayList.isEmpty()) {
            return t1.s0.f12110a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j1 j1Var = (j1) arrayList.get(i);
            j1Var.f1810d = iO;
            iO += j1Var.f1807a.f9579o.f9522b.o();
        }
        return new q1(arrayList, (o2.f1) this.f1830k);
    }

    public void d() {
        Iterator it = ((HashSet) this.f1828h).iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            if (j1Var.f1809c.isEmpty()) {
                i1 i1Var = (i1) ((HashMap) this.f).get(j1Var);
                if (i1Var != null) {
                    i1Var.f1774a.c(i1Var.f1775b);
                }
                it.remove();
            }
        }
    }

    public void e(j1 j1Var) {
        if (j1Var.f1811e && j1Var.f1809c.isEmpty()) {
            i1 i1Var = (i1) ((HashMap) this.f).remove(j1Var);
            i1Var.getClass();
            h1 h1Var = i1Var.f1776c;
            o2.a aVar = i1Var.f1774a;
            aVar.o(i1Var.f1775b);
            aVar.r(h1Var);
            aVar.q(h1Var);
            ((HashSet) this.f1828h).remove(j1Var);
        }
    }

    public boolean f(Path path, int i) {
        Path path2 = (Path) this.f1831l;
        path2.reset();
        ((o9.v[]) this.f1823b)[i].b(((Matrix[]) this.f1824c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [c2.b1, o2.e0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g(j1 j1Var) {
        o2.y yVar = j1Var.f1807a;
        ?? r12 = new o2.e0() { // from class: c2.b1
            @Override // o2.e0
            public final void a(o2.a aVar, t1.s0 s0Var) {
                w1.x xVar = ((r0) this.f1690a.f1827g).C;
                xVar.d(2);
                xVar.e(22);
            }
        };
        h1 h1Var = new h1(this, j1Var);
        ((HashMap) this.f).put(j1Var, new i1(yVar, r12, h1Var));
        int i = w1.b0.f13686a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        yVar.getClass();
        b3.a aVar = yVar.f9368c;
        aVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) aVar.f1530y;
        o2.j0 j0Var = new o2.j0();
        j0Var.f9465a = handler;
        j0Var.f9466b = h1Var;
        copyOnWriteArrayList.add(j0Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        h2.k kVar = yVar.f9369d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = kVar.f6097c;
        h2.j jVar = new h2.j();
        jVar.f6093a = handler2;
        jVar.f6094b = h1Var;
        copyOnWriteArrayList2.add(jVar);
        yVar.k(r12, (y1.z) this.f1831l, (d2.l) this.f1823b);
    }

    public void h(o2.b0 b0Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f1825d;
        j1 j1Var = (j1) identityHashMap.remove(b0Var);
        j1Var.getClass();
        j1Var.f1807a.n(b0Var);
        j1Var.f1809c.remove(((o2.v) b0Var).f9551v);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(j1Var);
    }

    public void i(int i, int i10) {
        ArrayList arrayList = (ArrayList) this.f1824c;
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            j1 j1Var = (j1) arrayList.remove(i11);
            ((HashMap) this.f1826e).remove(j1Var.f1808b);
            int i12 = -j1Var.f1807a.f9579o.f9522b.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((j1) arrayList.get(i13)).f1810d += i12;
            }
            j1Var.f1811e = true;
            if (this.f1822a) {
                e(j1Var);
            }
        }
    }

    public k1(r0 r0Var, d2.f fVar, w1.x xVar, d2.l lVar) {
        this.f1823b = lVar;
        this.f1827g = r0Var;
        this.f1830k = new o2.f1();
        this.f1825d = new IdentityHashMap();
        this.f1826e = new HashMap();
        this.f1824c = new ArrayList();
        this.i = fVar;
        this.f1829j = xVar;
        this.f = new HashMap();
        this.f1828h = new HashSet();
    }
}
