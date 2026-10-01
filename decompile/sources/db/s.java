package db;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements Iterator {
    public final /* synthetic */ v A;
    public final /* synthetic */ int B;
    public final /* synthetic */ v C;

    /* renamed from: x, reason: collision with root package name */
    public int f4038x;

    /* renamed from: y, reason: collision with root package name */
    public int f4039y;

    /* renamed from: z, reason: collision with root package name */
    public int f4040z;

    public s(v vVar, int i6) {
        int i10;
        this.B = i6;
        this.C = vVar;
        this.A = vVar;
        this.f4038x = vVar.B;
        if (vVar.isEmpty()) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f4039y = i10;
        this.f4040z = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4039y >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        v vVar = this.A;
        if (vVar.B == this.f4038x) {
            if (hasNext()) {
                int i6 = this.f4039y;
                this.f4040z = i6;
                switch (this.B) {
                    case 0:
                        obj = this.C.j()[i6];
                        break;
                    case 1:
                        obj = new u(this.C, i6);
                        break;
                    default:
                        obj = this.C.k()[i6];
                        break;
                }
                int i10 = this.f4039y + 1;
                if (i10 >= vVar.C) {
                    i10 = -1;
                }
                this.f4039y = i10;
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        v vVar = this.A;
        if (vVar.B == this.f4038x) {
            if (this.f4040z >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jb.b.i("no calls to next() since the last call to remove()", z10);
            this.f4038x += 32;
            vVar.remove(vVar.j()[this.f4040z]);
            this.f4039y--;
            this.f4040z = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
