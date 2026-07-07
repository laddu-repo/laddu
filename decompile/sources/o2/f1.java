package o2;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f9420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f9422c;

    public f1() {
        this(new Random());
    }

    public final f1 a(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i10 = 0;
        while (true) {
            iArr = this.f9421b;
            random = this.f9420a;
            if (i10 >= i) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int iNextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[iNextInt];
            iArr3[iNextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i; i14++) {
            if (i12 >= i || i13 != iArr2[i12]) {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i;
                }
                i13 = i15;
            } else {
                iArr4[i14] = iArr3[i12];
                i12++;
            }
        }
        return new f1(iArr4, new Random(random.nextLong()));
    }

    public f1(int[] iArr, Random random) {
        this.f9421b = iArr;
        this.f9420a = random;
        this.f9422c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f9422c[iArr[i]] = i;
        }
    }

    public f1(Random random) {
        this(new int[0], random);
    }
}
