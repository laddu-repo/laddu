package r;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public c f11234x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11235y = true;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f f11236z;

    public d(f fVar) {
        this.f11236z = fVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f11234x;
        if (cVar == cVar2) {
            c cVar3 = cVar2.A;
            this.f11234x = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11235y = z10;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11235y) {
            if (this.f11236z.f11237x == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f11234x;
        if (cVar == null || cVar.f11233z == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f11235y) {
            this.f11235y = false;
            this.f11234x = this.f11236z.f11237x;
        } else {
            c cVar2 = this.f11234x;
            if (cVar2 != null) {
                cVar = cVar2.f11233z;
            } else {
                cVar = null;
            }
            this.f11234x = cVar;
        }
        return this.f11234x;
    }
}
