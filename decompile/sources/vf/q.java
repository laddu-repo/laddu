package vf;

import java.nio.charset.Charset;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends f {
    public final transient int[] A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient byte[][] f13642z;

    public q(byte[][] bArr, int[] iArr) {
        super(f.f13604y.f13605v);
        this.f13642z = bArr;
        this.A = iArr;
    }

    @Override // vf.f
    public final int a() {
        return this.A[this.f13642z.length - 1];
    }

    @Override // vf.f
    public final String b() {
        return new f(l()).b();
    }

    @Override // vf.f
    public final byte[] c() {
        return l();
    }

    @Override // vf.f
    public final byte d(int i) {
        byte[][] bArr = this.f13642z;
        int length = bArr.length - 1;
        int[] iArr = this.A;
        t1.c(iArr[length], i, 1L);
        int iB = wf.b.b(this, i);
        return bArr[iB][(i - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // vf.f
    public final boolean e(int i, int i10, int i11, byte[] bArr) {
        de.i.e(bArr, "other");
        if (i < 0 || i > a() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i;
        int iB = wf.b.b(this, i);
        while (i < i12) {
            int[] iArr = this.A;
            int i13 = iB == 0 ? 0 : iArr[iB - 1];
            int i14 = iArr[iB] - i13;
            byte[][] bArr2 = this.f13642z;
            int i15 = iArr[bArr2.length + iB];
            int iMin = Math.min(i12, i14 + i13) - i;
            if (!t1.a((i - i13) + i15, i10, iMin, bArr2[iB], bArr)) {
                return false;
            }
            i10 += iMin;
            i += iMin;
            iB++;
        }
        return true;
    }

    @Override // vf.f
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.a() == a() && f(fVar, a());
    }

    @Override // vf.f
    public final boolean f(f fVar, int i) {
        de.i.e(fVar, "other");
        if (a() - i >= 0) {
            int iB = wf.b.b(this, 0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < i) {
                int[] iArr = this.A;
                int i12 = iB == 0 ? 0 : iArr[iB - 1];
                int i13 = iArr[iB] - i12;
                byte[][] bArr = this.f13642z;
                int i14 = iArr[bArr.length + iB];
                int iMin = Math.min(i, i13 + i12) - i10;
                if (fVar.e(i11, (i10 - i12) + i14, iMin, bArr[iB])) {
                    i11 += iMin;
                    i10 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // vf.f
    public final String g(Charset charset) {
        de.i.e(charset, "charset");
        return new f(l()).g(charset);
    }

    @Override // vf.f
    public final f h(int i, int i10) {
        if (i10 == -1234567890) {
            i10 = a();
        }
        if (i < 0) {
            throw new IllegalArgumentException(d0.d.i(i, "beginIndex=", " < 0").toString());
        }
        if (i10 > a()) {
            StringBuilder sbO = d0.d.o(i10, "endIndex=", " > length(");
            sbO.append(a());
            sbO.append(')');
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        int i11 = i10 - i;
        if (i11 < 0) {
            throw new IllegalArgumentException(j4.a.k(i10, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i10 == a()) {
            return this;
        }
        if (i == i10) {
            return f.f13604y;
        }
        int iB = wf.b.b(this, i);
        int iB2 = wf.b.b(this, i10 - 1);
        byte[][] bArr = this.f13642z;
        byte[][] bArr2 = (byte[][]) pd.i.c0(bArr, iB, iB2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.A;
        if (iB <= iB2) {
            int i12 = iB;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(iArr2[i12] - i, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr2.length] = iArr2[bArr.length + i12];
                if (i12 == iB2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iB != 0 ? iArr2[iB - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i15) + iArr[length];
        return new q(bArr2, iArr);
    }

    @Override // vf.f
    public final int hashCode() {
        int i = this.f13606w;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f13642z;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.A;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f13606w = i11;
        return i11;
    }

    @Override // vf.f
    public final f i() {
        return new f(l()).i();
    }

    @Override // vf.f
    public final void k(c cVar, int i) {
        int iB = wf.b.b(this, 0);
        int i10 = 0;
        while (i10 < i) {
            int[] iArr = this.A;
            int i11 = iB == 0 ? 0 : iArr[iB - 1];
            int i12 = iArr[iB] - i11;
            byte[][] bArr = this.f13642z;
            int i13 = iArr[bArr.length + iB];
            int iMin = Math.min(i, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            o oVar = new o(bArr[iB], i14, i14 + iMin, true);
            o oVar2 = cVar.f13602v;
            if (oVar2 == null) {
                oVar.f13638g = oVar;
                oVar.f = oVar;
                cVar.f13602v = oVar;
            } else {
                o oVar3 = oVar2.f13638g;
                de.i.b(oVar3);
                oVar3.b(oVar);
            }
            i10 += iMin;
            iB++;
        }
        cVar.f13603w += (long) i;
    }

    public final byte[] l() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f13642z;
        int length = bArr2.length;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i < length) {
            int[] iArr = this.A;
            int i12 = iArr[length + i];
            int i13 = iArr[i];
            int i14 = i13 - i10;
            pd.i.X(i11, i12, i12 + i14, bArr2[i], bArr);
            i11 += i14;
            i++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // vf.f
    public final String toString() {
        return new f(l()).toString();
    }
}
