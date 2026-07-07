package v;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Iterator, we.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public int f13141x;

    /* renamed from: y, reason: collision with root package name */
    public int f13142y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13143z;

    public a(int i6) {
        this.f13141x = i6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13142y < this.f13141x) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f3;
        if (hasNext()) {
            int i6 = this.f13142y;
            switch (this.A) {
                case 0:
                    f3 = ((e) this.B).f(i6);
                    break;
                case 1:
                    f3 = ((e) this.B).i(i6);
                    break;
                default:
                    f3 = ((f) this.B).f13150y[i6];
                    break;
            }
            this.f13142y++;
            this.f13143z = true;
            return f3;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f13143z) {
            int i6 = this.f13142y - 1;
            this.f13142y = i6;
            switch (this.A) {
                case 0:
                    ((e) this.B).g(i6);
                    break;
                case 1:
                    ((e) this.B).g(i6);
                    break;
                default:
                    ((f) this.B).a(i6);
                    break;
            }
            this.f13141x--;
            this.f13143z = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f13151z);
        this.A = 2;
        this.B = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i6) {
        this(eVar.f13174z);
        this.A = i6;
        switch (i6) {
            case 1:
                this.B = eVar;
                this(eVar.f13174z);
                return;
            default:
                this.B = eVar;
                return;
        }
    }
}
