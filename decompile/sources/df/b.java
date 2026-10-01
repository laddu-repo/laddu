package df;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Iterator, we.a {
    public af.c A;
    public final /* synthetic */ cf.i B;

    /* renamed from: x, reason: collision with root package name */
    public int f4119x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f4120y;

    /* renamed from: z, reason: collision with root package name */
    public int f4121z;

    public b(cf.i iVar) {
        this.B = iVar;
        int d10 = android.support.v4.media.session.b.d(0, ((CharSequence) iVar.f2065b).length());
        this.f4120y = d10;
        this.f4121z = d10;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [af.a, af.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [af.a, af.c] */
    public final void a() {
        cf.i iVar = this.B;
        CharSequence charSequence = (CharSequence) iVar.f2065b;
        int i6 = this.f4121z;
        int i10 = 0;
        if (i6 < 0) {
            this.f4119x = 0;
            this.A = null;
            return;
        }
        if (i6 > charSequence.length()) {
            this.A = new af.a(this.f4120y, m.M(charSequence), 1);
            this.f4121z = -1;
        } else {
            he.i iVar2 = (he.i) ((ve.p) iVar.f2066c).invoke(charSequence, Integer.valueOf(this.f4121z));
            if (iVar2 == null) {
                this.A = new af.a(this.f4120y, m.M(charSequence), 1);
                this.f4121z = -1;
            } else {
                int intValue = ((Number) iVar2.f6076x).intValue();
                int intValue2 = ((Number) iVar2.f6077y).intValue();
                this.A = android.support.v4.media.session.b.w(this.f4120y, intValue);
                int i11 = intValue + intValue2;
                this.f4120y = i11;
                if (intValue2 == 0) {
                    i10 = 1;
                }
                this.f4121z = i11 + i10;
            }
        }
        this.f4119x = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4119x == -1) {
            a();
        }
        if (this.f4119x == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4119x == -1) {
            a();
        }
        if (this.f4119x != 0) {
            af.c cVar = this.A;
            kotlin.jvm.internal.k.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.A = null;
            this.f4119x = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
