package f5;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f5250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5254e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5256h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f5257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5258k;

    public l() {
        this.f5250a = new Matrix();
        this.f5251b = new ArrayList();
        this.f5252c = 0.0f;
        this.f5253d = 0.0f;
        this.f5254e = 0.0f;
        this.f = 1.0f;
        this.f5255g = 1.0f;
        this.f5256h = 0.0f;
        this.i = 0.0f;
        this.f5257j = new Matrix();
        this.f5258k = null;
    }

    @Override // f5.m
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5251b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((m) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // f5.m
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f5251b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((m) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f5257j;
        matrix.reset();
        matrix.postTranslate(-this.f5253d, -this.f5254e);
        matrix.postScale(this.f, this.f5255g);
        matrix.postRotate(this.f5252c, 0.0f, 0.0f);
        matrix.postTranslate(this.f5256h + this.f5253d, this.i + this.f5254e);
    }

    public String getGroupName() {
        return this.f5258k;
    }

    public Matrix getLocalMatrix() {
        return this.f5257j;
    }

    public float getPivotX() {
        return this.f5253d;
    }

    public float getPivotY() {
        return this.f5254e;
    }

    public float getRotation() {
        return this.f5252c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.f5255g;
    }

    public float getTranslateX() {
        return this.f5256h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.f5253d) {
            this.f5253d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f5254e) {
            this.f5254e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f5252c) {
            this.f5252c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f5255g) {
            this.f5255g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f5256h) {
            this.f5256h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public l(l lVar, v.e eVar) {
        n jVar;
        this.f5250a = new Matrix();
        this.f5251b = new ArrayList();
        this.f5252c = 0.0f;
        this.f5253d = 0.0f;
        this.f5254e = 0.0f;
        this.f = 1.0f;
        this.f5255g = 1.0f;
        this.f5256h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f5257j = matrix;
        this.f5258k = null;
        this.f5252c = lVar.f5252c;
        this.f5253d = lVar.f5253d;
        this.f5254e = lVar.f5254e;
        this.f = lVar.f;
        this.f5255g = lVar.f5255g;
        this.f5256h = lVar.f5256h;
        this.i = lVar.i;
        String str = lVar.f5258k;
        this.f5258k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(lVar.f5257j);
        ArrayList arrayList = lVar.f5251b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof l) {
                this.f5251b.add(new l((l) obj, eVar));
            } else {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    k kVar2 = new k(kVar);
                    kVar2.f5242e = 0.0f;
                    kVar2.f5243g = 1.0f;
                    kVar2.f5244h = 1.0f;
                    kVar2.i = 0.0f;
                    kVar2.f5245j = 1.0f;
                    kVar2.f5246k = 0.0f;
                    kVar2.f5247l = Paint.Cap.BUTT;
                    kVar2.f5248m = Paint.Join.MITER;
                    kVar2.f5249n = 4.0f;
                    kVar2.f5241d = kVar.f5241d;
                    kVar2.f5242e = kVar.f5242e;
                    kVar2.f5243g = kVar.f5243g;
                    kVar2.f = kVar.f;
                    kVar2.f5261c = kVar.f5261c;
                    kVar2.f5244h = kVar.f5244h;
                    kVar2.i = kVar.i;
                    kVar2.f5245j = kVar.f5245j;
                    kVar2.f5246k = kVar.f5246k;
                    kVar2.f5247l = kVar.f5247l;
                    kVar2.f5248m = kVar.f5248m;
                    kVar2.f5249n = kVar.f5249n;
                    jVar = kVar2;
                } else if (obj instanceof j) {
                    jVar = new j((j) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f5251b.add(jVar);
                Object obj2 = jVar.f5260b;
                if (obj2 != null) {
                    eVar.put(obj2, jVar);
                }
            }
        }
    }
}
