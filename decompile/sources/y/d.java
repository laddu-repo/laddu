package y;

import cg.h;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import s8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f14790f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f14791g;

    /* renamed from: h, reason: collision with root package name */
    public int f14792h;

    /* renamed from: i, reason: collision with root package name */
    public l f14793i;

    @Override // y.b
    public final f d(boolean[] zArr) {
        int i6 = -1;
        for (int i10 = 0; i10 < this.f14792h; i10++) {
            f[] fVarArr = this.f14790f;
            f fVar = fVarArr[i10];
            if (!zArr[fVar.f14796y]) {
                l lVar = this.f14793i;
                lVar.f12251y = fVar;
                int i11 = 8;
                if (i6 == -1) {
                    while (i11 >= 0) {
                        float f3 = ((f) lVar.f12251y).E[i11];
                        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                i6 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i6];
                    while (true) {
                        if (i11 >= 0) {
                            float f10 = fVar2.E[i11];
                            float f11 = ((f) lVar.f12251y).E[i11];
                            if (f11 == f10) {
                                i11--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i6 == -1) {
            return null;
        }
        return this.f14790f[i6];
    }

    @Override // y.b
    public final boolean e() {
        if (this.f14792h == 0) {
            return true;
        }
        return false;
    }

    @Override // y.b
    public final void i(c cVar, b bVar, boolean z10) {
        f fVar = bVar.f14769a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.E;
        a aVar = bVar.f14772d;
        int d10 = aVar.d();
        for (int i6 = 0; i6 < d10; i6++) {
            f e10 = aVar.e(i6);
            float f3 = aVar.f(i6);
            l lVar = this.f14793i;
            lVar.f12251y = e10;
            if (e10.f14795x) {
                boolean z11 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((f) lVar.f12251y).E;
                    float f10 = (fArr[i10] * f3) + fArr2[i10];
                    fArr2[i10] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((f) lVar.f12251y).E[i10] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((d) lVar.f12252z).k((f) lVar.f12251y);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f11 = fArr[i11];
                    if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f12 = f11 * f3;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        ((f) lVar.f12251y).E[i11] = f12;
                    } else {
                        ((f) lVar.f12251y).E[i11] = 0.0f;
                    }
                }
                j(e10);
            }
            this.f14770b = (bVar.f14770b * f3) + this.f14770b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i6;
        int i10 = this.f14792h + 1;
        f[] fVarArr = this.f14790f;
        if (i10 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f14790f = fVarArr2;
            this.f14791g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f14790f;
        int i11 = this.f14792h;
        fVarArr3[i11] = fVar;
        int i12 = i11 + 1;
        this.f14792h = i12;
        if (i12 > 1 && fVarArr3[i11].f14796y > fVar.f14796y) {
            int i13 = 0;
            while (true) {
                i6 = this.f14792h;
                if (i13 >= i6) {
                    break;
                }
                this.f14791g[i13] = this.f14790f[i13];
                i13++;
            }
            Arrays.sort(this.f14791g, 0, i6, new h(11));
            for (int i14 = 0; i14 < this.f14792h; i14++) {
                this.f14790f[i14] = this.f14791g[i14];
            }
        }
        fVar.f14795x = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i6 = 0;
        while (i6 < this.f14792h) {
            if (this.f14790f[i6] == fVar) {
                while (true) {
                    int i10 = this.f14792h;
                    if (i6 < i10 - 1) {
                        f[] fVarArr = this.f14790f;
                        int i11 = i6 + 1;
                        fVarArr[i6] = fVarArr[i11];
                        i6 = i11;
                    } else {
                        this.f14792h = i10 - 1;
                        fVar.f14795x = false;
                        return;
                    }
                }
            } else {
                i6++;
            }
        }
    }

    @Override // y.b
    public final String toString() {
        l lVar = this.f14793i;
        String str = " goal -> (" + this.f14770b + ") : ";
        for (int i6 = 0; i6 < this.f14792h; i6++) {
            lVar.f12251y = this.f14790f[i6];
            str = str + lVar + " ";
        }
        return str;
    }
}
