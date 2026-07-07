package p5;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f10543a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10544b;

    /* renamed from: c, reason: collision with root package name */
    public float f10545c;

    /* renamed from: d, reason: collision with root package name */
    public float f10546d;

    /* renamed from: e, reason: collision with root package name */
    public float f10547e;

    /* renamed from: f, reason: collision with root package name */
    public float f10548f;

    /* renamed from: g, reason: collision with root package name */
    public float f10549g;

    /* renamed from: h, reason: collision with root package name */
    public float f10550h;

    /* renamed from: i, reason: collision with root package name */
    public float f10551i;
    public final Matrix j;

    /* renamed from: k, reason: collision with root package name */
    public String f10552k;

    public j() {
        this.f10543a = new Matrix();
        this.f10544b = new ArrayList();
        this.f10545c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10546d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10547e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10548f = 1.0f;
        this.f10549g = 1.0f;
        this.f10550h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10551i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = new Matrix();
        this.f10552k = null;
    }

    @Override // p5.k
    public final boolean a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f10544b;
            if (i6 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i6)).a()) {
                return true;
            }
            i6++;
        }
    }

    @Override // p5.k
    public final boolean b(int[] iArr) {
        int i6 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f10544b;
            if (i6 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i6)).b(iArr);
                i6++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f10546d, -this.f10547e);
        matrix.postScale(this.f10548f, this.f10549g);
        matrix.postRotate(this.f10545c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        matrix.postTranslate(this.f10550h + this.f10546d, this.f10551i + this.f10547e);
    }

    public String getGroupName() {
        return this.f10552k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f10546d;
    }

    public float getPivotY() {
        return this.f10547e;
    }

    public float getRotation() {
        return this.f10545c;
    }

    public float getScaleX() {
        return this.f10548f;
    }

    public float getScaleY() {
        return this.f10549g;
    }

    public float getTranslateX() {
        return this.f10550h;
    }

    public float getTranslateY() {
        return this.f10551i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.f10546d) {
            this.f10546d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.f10547e) {
            this.f10547e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.f10545c) {
            this.f10545c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f10548f) {
            this.f10548f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.f10549g) {
            this.f10549g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.f10550h) {
            this.f10550h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.f10551i) {
            this.f10551i = f3;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [p5.l, p5.i] */
    public j(j jVar, v.e eVar) {
        l lVar;
        this.f10543a = new Matrix();
        this.f10544b = new ArrayList();
        this.f10545c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10546d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10547e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10548f = 1.0f;
        this.f10549g = 1.0f;
        this.f10550h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10551i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f10552k = null;
        this.f10545c = jVar.f10545c;
        this.f10546d = jVar.f10546d;
        this.f10547e = jVar.f10547e;
        this.f10548f = jVar.f10548f;
        this.f10549g = jVar.f10549g;
        this.f10550h = jVar.f10550h;
        this.f10551i = jVar.f10551i;
        String str = jVar.f10552k;
        this.f10552k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(jVar.j);
        ArrayList arrayList = jVar.f10544b;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            Object obj = arrayList.get(i6);
            if (obj instanceof j) {
                this.f10544b.add(new j((j) obj, eVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f10534e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    lVar2.f10536g = 1.0f;
                    lVar2.f10537h = 1.0f;
                    lVar2.f10538i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    lVar2.j = 1.0f;
                    lVar2.f10539k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    lVar2.f10540l = Paint.Cap.BUTT;
                    lVar2.f10541m = Paint.Join.MITER;
                    lVar2.f10542n = 4.0f;
                    lVar2.f10533d = iVar.f10533d;
                    lVar2.f10534e = iVar.f10534e;
                    lVar2.f10536g = iVar.f10536g;
                    lVar2.f10535f = iVar.f10535f;
                    lVar2.f10555c = iVar.f10555c;
                    lVar2.f10537h = iVar.f10537h;
                    lVar2.f10538i = iVar.f10538i;
                    lVar2.j = iVar.j;
                    lVar2.f10539k = iVar.f10539k;
                    lVar2.f10540l = iVar.f10540l;
                    lVar2.f10541m = iVar.f10541m;
                    lVar2.f10542n = iVar.f10542n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f10544b.add(lVar);
                Object obj2 = lVar.f10554b;
                if (obj2 != null) {
                    eVar.put(obj2, lVar);
                }
            }
        }
    }
}
