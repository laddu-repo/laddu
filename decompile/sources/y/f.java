package y;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public float B;
    public int I;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14795x;

    /* renamed from: y, reason: collision with root package name */
    public int f14796y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f14797z = -1;
    public int A = 0;
    public boolean C = false;
    public final float[] D = new float[9];
    public final float[] E = new float[9];
    public b[] F = new b[16];
    public int G = 0;
    public int H = 0;

    public f(int i6) {
        this.I = i6;
    }

    public final void a(b bVar) {
        int i6 = 0;
        while (true) {
            int i10 = this.G;
            if (i6 < i10) {
                if (this.F[i6] == bVar) {
                    return;
                } else {
                    i6++;
                }
            } else {
                b[] bVarArr = this.F;
                if (i10 >= bVarArr.length) {
                    this.F = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.F;
                int i11 = this.G;
                bVarArr2[i11] = bVar;
                this.G = i11 + 1;
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i6 = this.G;
        int i10 = 0;
        while (i10 < i6) {
            if (this.F[i10] == bVar) {
                while (i10 < i6 - 1) {
                    b[] bVarArr = this.F;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.G--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.I = 5;
        this.A = 0;
        this.f14796y = -1;
        this.f14797z = -1;
        this.B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.C = false;
        int i6 = this.G;
        for (int i10 = 0; i10 < i6; i10++) {
            this.F[i10] = null;
        }
        this.G = 0;
        this.H = 0;
        this.f14795x = false;
        Arrays.fill(this.E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14796y - ((f) obj).f14796y;
    }

    public final void d(c cVar, float f3) {
        this.B = f3;
        this.C = true;
        int i6 = this.G;
        this.f14797z = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            this.F[i10].h(cVar, this, false);
        }
        this.G = 0;
    }

    public final void e(c cVar, b bVar) {
        int i6 = this.G;
        for (int i10 = 0; i10 < i6; i10++) {
            this.F[i10].i(cVar, bVar, false);
        }
        this.G = 0;
    }

    public final String toString() {
        return HttpUrl.FRAGMENT_ENCODE_SET + this.f14796y;
    }
}
