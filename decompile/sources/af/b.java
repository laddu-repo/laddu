package af;

import ie.v;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends v {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public final int f712x;

    /* renamed from: y, reason: collision with root package name */
    public final int f713y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f714z;

    public b(int i6, int i10, int i11) {
        this.f712x = i11;
        this.f713y = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i6 >= i10 : i6 <= i10) {
            z10 = true;
        }
        this.f714z = z10;
        this.A = z10 ? i6 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f714z;
    }

    @Override // ie.v
    public final int nextInt() {
        int i6 = this.A;
        if (i6 == this.f713y) {
            if (this.f714z) {
                this.f714z = false;
                return i6;
            }
            throw new NoSuchElementException();
        }
        this.A = this.f712x + i6;
        return i6;
    }
}
