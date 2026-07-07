package v;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import w4.s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f13156a;

    /* renamed from: b, reason: collision with root package name */
    public int f13157b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f13158c;

    /* renamed from: d, reason: collision with root package name */
    public int f13159d;

    public h() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f13159d = highestOneBit - 1;
        this.f13158c = new int[highestOneBit];
    }

    public void a(int i6) {
        int[] iArr = this.f13158c;
        int i10 = this.f13157b;
        iArr[i10] = i6;
        int i11 = this.f13159d & (i10 + 1);
        this.f13157b = i11;
        int i12 = this.f13156a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 >= 0) {
                int[] iArr2 = new int[i14];
                ie.i.c0(0, i12, length, iArr, iArr2);
                ie.i.c0(i13, 0, this.f13156a, this.f13158c, iArr2);
                this.f13158c = iArr2;
                this.f13156a = 0;
                this.f13157b = length;
                this.f13159d = i14 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public void b(int i6, int i10) {
        if (i6 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f13159d;
                int i12 = i11 * 2;
                int[] iArr = this.f13158c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f13158c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i11 * 4];
                    this.f13158c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f13158c;
                iArr4[i12] = i6;
                iArr4[i12 + 1] = i10;
                this.f13159d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        this.f13159d = 0;
        int[] iArr = this.f13158c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        s0 s0Var = recyclerView.K;
        if (recyclerView.J != null && s0Var != null && s0Var.f14012i) {
            if (z10) {
                if (!recyclerView.B.l()) {
                    s0Var.i(recyclerView.J.a(), this);
                }
            } else if (!recyclerView.L()) {
                s0Var.h(this.f13156a, this.f13157b, recyclerView.D0, this);
            }
            int i6 = this.f13159d;
            if (i6 > s0Var.j) {
                s0Var.j = i6;
                s0Var.f14013k = z10;
                recyclerView.f1148z.n();
            }
        }
    }
}
