package o4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import l4.u;
import s8.n;
import v.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements Iterator, we.a {

    /* renamed from: x, reason: collision with root package name */
    public int f9930x = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9931y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n f9932z;

    public k(n nVar) {
        this.f9932z = nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9930x + 1 < ((m) this.f9932z.f12261c).f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f9931y = true;
            m mVar = (m) this.f9932z.f12261c;
            int i6 = this.f9930x + 1;
            this.f9930x = i6;
            return (u) mVar.g(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f9931y) {
            m mVar = (m) this.f9932z.f12261c;
            ((u) mVar.g(this.f9930x)).f8196z = null;
            int i6 = this.f9930x;
            Object[] objArr = mVar.f13177z;
            Object obj = objArr[i6];
            Object obj2 = v.j.f13164b;
            if (obj != obj2) {
                objArr[i6] = obj2;
                mVar.f13175x = true;
            }
            this.f9930x = i6 - 1;
            this.f9931y = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element");
    }
}
