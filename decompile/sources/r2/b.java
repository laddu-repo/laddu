package r2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: x, reason: collision with root package name */
    public final long f11773x;

    /* renamed from: y, reason: collision with root package name */
    public final long f11774y;

    /* renamed from: z, reason: collision with root package name */
    public long f11775z;

    public b(long j, long j10) {
        this.f11773x = j;
        this.f11774y = j10;
        this.f11775z = j - 1;
    }

    public final void b() {
        long j = this.f11775z;
        if (j >= this.f11773x && j <= this.f11774y) {
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // r2.m
    public final boolean next() {
        boolean z10;
        long j = this.f11775z + 1;
        this.f11775z = j;
        if (j > this.f11774y) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
