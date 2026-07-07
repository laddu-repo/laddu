package s3;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f12051a;

    /* renamed from: b, reason: collision with root package name */
    public int f12052b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12053c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12054d;

    public c() {
        this.f12053c = new long[10];
        this.f12054d = new Object[10];
    }

    public synchronized void a(long j, Object obj) {
        if (this.f12052b > 0) {
            if (j <= ((long[]) this.f12053c)[((this.f12051a + r0) - 1) % ((Object[]) this.f12054d).length]) {
                b();
            }
        }
        c();
        int i6 = this.f12051a;
        int i10 = this.f12052b;
        Object[] objArr = (Object[]) this.f12054d;
        int length = (i6 + i10) % objArr.length;
        ((long[]) this.f12053c)[length] = j;
        objArr[length] = obj;
        this.f12052b = i10 + 1;
    }

    public synchronized void b() {
        this.f12051a = 0;
        this.f12052b = 0;
        Arrays.fill((Object[]) this.f12054d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f12054d).length;
        if (this.f12052b < length) {
            return;
        }
        int i6 = length * 2;
        long[] jArr = new long[i6];
        Object[] objArr = new Object[i6];
        int i10 = this.f12051a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f12053c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.f12054d, this.f12051a, objArr, 0, i11);
        int i12 = this.f12051a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f12053c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.f12054d, 0, objArr, i11, this.f12051a);
        }
        this.f12053c = jArr;
        this.f12054d = objArr;
        this.f12051a = 0;
    }

    public Object d(boolean z10, long j) {
        Object obj = null;
        long j10 = Long.MAX_VALUE;
        while (this.f12052b > 0) {
            long j11 = j - ((long[]) this.f12053c)[this.f12051a];
            if (j11 < 0 && (z10 || (-j11) >= j10)) {
                break;
            }
            obj = g();
            j10 = j11;
        }
        return obj;
    }

    public synchronized Object e() {
        Object g10;
        if (this.f12052b == 0) {
            g10 = null;
        } else {
            g10 = g();
        }
        return g10;
    }

    public synchronized Object f(long j) {
        return d(true, j);
    }

    public Object g() {
        boolean z10;
        if (this.f12052b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        Object[] objArr = (Object[]) this.f12054d;
        int i6 = this.f12051a;
        Object obj = objArr[i6];
        objArr[i6] = null;
        this.f12051a = (i6 + 1) % objArr.length;
        this.f12052b--;
        return obj;
    }

    public synchronized int h() {
        return this.f12052b;
    }

    public c(int i6, float[] fArr, float[] fArr2, int i10) {
        this.f12051a = i6;
        u1.c.b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f12053c = fArr;
        this.f12054d = fArr2;
        this.f12052b = i10;
    }

    public c(c cVar) {
        float[] fArr = (float[]) cVar.f12053c;
        this.f12051a = fArr.length / 3;
        this.f12053c = u1.a.e(fArr);
        this.f12054d = u1.a.e((float[]) cVar.f12054d);
        int i6 = cVar.f12052b;
        if (i6 == 1) {
            this.f12052b = 5;
        } else if (i6 != 2) {
            this.f12052b = 4;
        } else {
            this.f12052b = 6;
        }
    }
}
