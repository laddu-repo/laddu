package y;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import n9.j;
import okhttp3.HttpUrl;
import w8.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f14761b;

    /* renamed from: c, reason: collision with root package name */
    public final j f14762c;

    /* renamed from: a, reason: collision with root package name */
    public int f14760a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f14763d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f14764e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f14765f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f14766g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f14767h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f14768i = -1;
    public boolean j = false;

    public a(b bVar, j jVar) {
        this.f14761b = bVar;
        this.f14762c = jVar;
    }

    public final void a(f fVar, float f3, boolean z10) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i6 = this.f14767h;
            b bVar = this.f14761b;
            if (i6 == -1) {
                this.f14767h = 0;
                this.f14766g[0] = f3;
                this.f14764e[0] = fVar.f14796y;
                this.f14765f[0] = -1;
                fVar.H++;
                fVar.a(bVar);
                this.f14760a++;
                if (!this.j) {
                    int i10 = this.f14768i + 1;
                    this.f14768i = i10;
                    int[] iArr = this.f14764e;
                    if (i10 >= iArr.length) {
                        this.j = true;
                        this.f14768i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i6 != -1 && i12 < this.f14760a; i12++) {
                int i13 = this.f14764e[i6];
                int i14 = fVar.f14796y;
                if (i13 == i14) {
                    float[] fArr = this.f14766g;
                    float f10 = fArr[i6] + f3;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    fArr[i6] = f10;
                    if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (i6 == this.f14767h) {
                            this.f14767h = this.f14765f[i6];
                        } else {
                            int[] iArr2 = this.f14765f;
                            iArr2[i11] = iArr2[i6];
                        }
                        if (z10) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f14768i = i6;
                        }
                        fVar.H--;
                        this.f14760a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i6;
                }
                i6 = this.f14765f[i6];
            }
            int i15 = this.f14768i;
            int i16 = i15 + 1;
            if (this.j) {
                int[] iArr3 = this.f14764e;
                if (iArr3[i15] != -1) {
                    i15 = iArr3.length;
                }
            } else {
                i15 = i16;
            }
            int[] iArr4 = this.f14764e;
            if (i15 >= iArr4.length && this.f14760a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f14764e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        i15 = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f14764e;
            if (i15 >= iArr6.length) {
                i15 = iArr6.length;
                int i18 = this.f14763d * 2;
                this.f14763d = i18;
                this.j = false;
                this.f14768i = i15 - 1;
                this.f14766g = Arrays.copyOf(this.f14766g, i18);
                this.f14764e = Arrays.copyOf(this.f14764e, this.f14763d);
                this.f14765f = Arrays.copyOf(this.f14765f, this.f14763d);
            }
            this.f14764e[i15] = fVar.f14796y;
            this.f14766g[i15] = f3;
            if (i11 != -1) {
                int[] iArr7 = this.f14765f;
                iArr7[i15] = iArr7[i11];
                iArr7[i11] = i15;
            } else {
                this.f14765f[i15] = this.f14767h;
                this.f14767h = i15;
            }
            fVar.H++;
            fVar.a(bVar);
            this.f14760a++;
            if (!this.j) {
                this.f14768i++;
            }
            int i19 = this.f14768i;
            int[] iArr8 = this.f14764e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f14768i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i6 = this.f14767h;
        for (int i10 = 0; i6 != -1 && i10 < this.f14760a; i10++) {
            f fVar = ((f[]) this.f14762c.A)[this.f14764e[i6]];
            if (fVar != null) {
                fVar.b(this.f14761b);
            }
            i6 = this.f14765f[i6];
        }
        this.f14767h = -1;
        this.f14768i = -1;
        this.j = false;
        this.f14760a = 0;
    }

    public final float c(f fVar) {
        int i6 = this.f14767h;
        for (int i10 = 0; i6 != -1 && i10 < this.f14760a; i10++) {
            if (this.f14764e[i6] == fVar.f14796y) {
                return this.f14766g[i6];
            }
            i6 = this.f14765f[i6];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int d() {
        return this.f14760a;
    }

    public final f e(int i6) {
        int i10 = this.f14767h;
        for (int i11 = 0; i10 != -1 && i11 < this.f14760a; i11++) {
            if (i11 == i6) {
                return ((f[]) this.f14762c.A)[this.f14764e[i10]];
            }
            i10 = this.f14765f[i10];
        }
        return null;
    }

    public final float f(int i6) {
        int i10 = this.f14767h;
        for (int i11 = 0; i10 != -1 && i11 < this.f14760a; i11++) {
            if (i11 == i6) {
                return this.f14766g[i10];
            }
            i10 = this.f14765f[i10];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void g(f fVar, float f3) {
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            h(fVar, true);
            return;
        }
        int i6 = this.f14767h;
        b bVar = this.f14761b;
        if (i6 == -1) {
            this.f14767h = 0;
            this.f14766g[0] = f3;
            this.f14764e[0] = fVar.f14796y;
            this.f14765f[0] = -1;
            fVar.H++;
            fVar.a(bVar);
            this.f14760a++;
            if (!this.j) {
                int i10 = this.f14768i + 1;
                this.f14768i = i10;
                int[] iArr = this.f14764e;
                if (i10 >= iArr.length) {
                    this.j = true;
                    this.f14768i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i6 != -1 && i12 < this.f14760a; i12++) {
            int i13 = this.f14764e[i6];
            int i14 = fVar.f14796y;
            if (i13 == i14) {
                this.f14766g[i6] = f3;
                return;
            }
            if (i13 < i14) {
                i11 = i6;
            }
            i6 = this.f14765f[i6];
        }
        int i15 = this.f14768i;
        int i16 = i15 + 1;
        if (this.j) {
            int[] iArr2 = this.f14764e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f14764e;
        if (i15 >= iArr3.length && this.f14760a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f14764e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f14764e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f14763d * 2;
            this.f14763d = i18;
            this.j = false;
            this.f14768i = i15 - 1;
            this.f14766g = Arrays.copyOf(this.f14766g, i18);
            this.f14764e = Arrays.copyOf(this.f14764e, this.f14763d);
            this.f14765f = Arrays.copyOf(this.f14765f, this.f14763d);
        }
        this.f14764e[i15] = fVar.f14796y;
        this.f14766g[i15] = f3;
        if (i11 != -1) {
            int[] iArr6 = this.f14765f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f14765f[i15] = this.f14767h;
            this.f14767h = i15;
        }
        fVar.H++;
        fVar.a(bVar);
        int i19 = this.f14760a + 1;
        this.f14760a = i19;
        if (!this.j) {
            this.f14768i++;
        }
        int[] iArr7 = this.f14764e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f14768i >= iArr7.length) {
            this.j = true;
            this.f14768i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z10) {
        int i6 = this.f14767h;
        if (i6 != -1) {
            int i10 = 0;
            int i11 = -1;
            while (i6 != -1 && i10 < this.f14760a) {
                if (this.f14764e[i6] == fVar.f14796y) {
                    if (i6 == this.f14767h) {
                        this.f14767h = this.f14765f[i6];
                    } else {
                        int[] iArr = this.f14765f;
                        iArr[i11] = iArr[i6];
                    }
                    if (z10) {
                        fVar.b(this.f14761b);
                    }
                    fVar.H--;
                    this.f14760a--;
                    this.f14764e[i6] = -1;
                    if (this.j) {
                        this.f14768i = i6;
                    }
                    return this.f14766g[i6];
                }
                i10++;
                i11 = i6;
                i6 = this.f14765f[i6];
            }
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final String toString() {
        int i6 = this.f14767h;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (int i10 = 0; i6 != -1 && i10 < this.f14760a; i10++) {
            StringBuilder b10 = e.b(k.c(str, " -> "));
            b10.append(this.f14766g[i6]);
            b10.append(" : ");
            StringBuilder b11 = e.b(b10.toString());
            b11.append(((f[]) this.f14762c.A)[this.f14764e[i6]]);
            str = b11.toString();
            i6 = this.f14765f[i6];
        }
        return str;
    }
}
