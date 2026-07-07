package q2;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f10839a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10840b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10841c;

    public c1() {
        this(new Random());
    }

    public final c1 a(int i6, int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f10840b;
            random = this.f10839a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int nextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[nextInt];
            iArr3[nextInt] = i11 + i6;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 < i10 && i14 == iArr2[i13]) {
                iArr4[i15] = iArr3[i13];
                i13++;
            } else {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= i6) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            }
        }
        return new c1(iArr4, new Random(random.nextLong()));
    }

    public c1(int[] iArr, Random random) {
        this.f10840b = iArr;
        this.f10839a = random;
        this.f10841c = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f10841c[iArr[i6]] = i6;
        }
    }

    public c1(Random random) {
        this(new int[0], random);
    }
}
