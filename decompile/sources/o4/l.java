package o4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f9808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9811d;

    public l() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f9811d = iHighestOneBit - 1;
        this.f9808a = new int[iHighestOneBit];
    }

    public void a(int i) {
        int[] iArr = this.f9808a;
        int i10 = this.f9810c;
        iArr[i10] = i;
        int i11 = this.f9811d & (i10 + 1);
        this.f9810c = i11;
        int i12 = this.f9809b;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i14];
            pd.i.Y(0, i12, length, iArr, iArr2);
            pd.i.Y(i13, 0, this.f9809b, this.f9808a, iArr2);
            this.f9808a = iArr2;
            this.f9809b = 0;
            this.f9810c = length;
            this.f9811d = i14 - 1;
        }
    }

    public void b(int i, int i10) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f9811d;
        int i12 = i11 * 2;
        int[] iArr = this.f9808a;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f9808a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f9808a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f9808a;
        iArr4[i12] = i;
        iArr4[i12 + 1] = i10;
        this.f9811d++;
    }

    public void c(RecyclerView recyclerView, boolean z2) {
        this.f9811d = 0;
        int[] iArr = this.f9808a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        j0 j0Var = recyclerView.I;
        if (recyclerView.H == null || j0Var == null || !j0Var.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1400z.y()) {
                j0Var.i(recyclerView.H.a(), this);
            }
        } else if (!recyclerView.O()) {
            j0Var.h(this.f9809b, this.f9810c, recyclerView.B0, this);
        }
        int i = this.f9811d;
        if (i > j0Var.f9770j) {
            j0Var.f9770j = i;
            j0Var.f9771k = z2;
            recyclerView.f1396x.n();
        }
    }
}
