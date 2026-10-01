package d4;

import android.graphics.Rect;
import java.util.Arrays;
import u1.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3781b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3782c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3783d;

    /* renamed from: e, reason: collision with root package name */
    public int f3784e;

    /* renamed from: f, reason: collision with root package name */
    public int f3785f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f3786g;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3780a = new int[4];

    /* renamed from: h, reason: collision with root package name */
    public int f3787h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f3788i = -1;

    public static int a(int[] iArr, int i6) {
        if (i6 >= 0 && i6 < iArr.length) {
            return iArr[i6];
        }
        return iArr[0];
    }

    public static int c(int i6, int i10) {
        return (i6 & 16777215) | ((i10 * 17) << 24);
    }

    public final void b(s sVar, boolean z10, Rect rect, int[] iArr) {
        int i6;
        int i10;
        int width = rect.width();
        int height = rect.height();
        int i11 = !z10 ? 1 : 0;
        int i12 = i11 * width;
        while (true) {
            int i13 = 0;
            do {
                int i14 = 0;
                for (int i15 = 1; i14 < i15 && i15 <= 64; i15 <<= 2) {
                    if (sVar.b() < 4) {
                        i10 = 0;
                        i6 = -1;
                        break;
                    }
                    i14 = (i14 << 4) | sVar.i(4);
                }
                i6 = i14 & 3;
                if (i14 < 4) {
                    i10 = width;
                } else {
                    i10 = i14 >> 2;
                }
                int min = Math.min(i10, width - i13);
                if (min > 0) {
                    int i16 = i12 + min;
                    Arrays.fill(iArr, i12, i16, this.f3780a[i6]);
                    i13 += min;
                    i12 = i16;
                }
            } while (i13 < width);
            i11 += 2;
            if (i11 >= height) {
                return;
            }
            i12 = i11 * width;
            sVar.c();
        }
    }
}
