package cf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements Iterator, we.a {
    public final /* synthetic */ j A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2061x;

    /* renamed from: y, reason: collision with root package name */
    public int f2062y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2063z;

    public h(s sVar) {
        this.f2061x = 1;
        this.A = sVar;
        this.f2063z = sVar.f2079a.iterator();
    }

    public void a() {
        Object invoke;
        int i6;
        i iVar = (i) this.A;
        if (this.f2062y == -2) {
            invoke = ((ve.a) iVar.f2065b).invoke();
        } else {
            ve.l lVar = (ve.l) iVar.f2066c;
            Object obj = this.f2063z;
            kotlin.jvm.internal.k.b(obj);
            invoke = lVar.invoke(obj);
        }
        this.f2063z = invoke;
        if (invoke == null) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        this.f2062y = i6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2061x) {
            case 0:
                if (this.f2062y < 0) {
                    a();
                }
                if (this.f2062y == 1) {
                    return true;
                }
                return false;
            default:
                s sVar = (s) this.A;
                Iterator it = (Iterator) this.f2063z;
                while (this.f2062y < sVar.f2080b && it.hasNext()) {
                    it.next();
                    this.f2062y++;
                }
                if (this.f2062y < sVar.f2081c && it.hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2061x) {
            case 0:
                if (this.f2062y < 0) {
                    a();
                }
                if (this.f2062y != 0) {
                    Object obj = this.f2063z;
                    kotlin.jvm.internal.k.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                    this.f2062y = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                s sVar = (s) this.A;
                Iterator it = (Iterator) this.f2063z;
                while (this.f2062y < sVar.f2080b && it.hasNext()) {
                    it.next();
                    this.f2062y++;
                }
                int i6 = this.f2062y;
                if (i6 < sVar.f2081c) {
                    this.f2062y = i6 + 1;
                    return it.next();
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2061x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(i iVar) {
        this.f2061x = 0;
        this.A = iVar;
        this.f2062y = -2;
    }
}
