package r;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public c f11228x;

    /* renamed from: y, reason: collision with root package name */
    public c f11229y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f11230z;

    public b(c cVar, c cVar2, int i6) {
        this.f11230z = i6;
        this.f11228x = cVar2;
        this.f11229y = cVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f11228x == cVar && cVar == this.f11229y) {
            this.f11229y = null;
            this.f11228x = null;
        }
        c cVar4 = this.f11228x;
        if (cVar4 == cVar) {
            switch (this.f11230z) {
                case 0:
                    cVar2 = cVar4.A;
                    break;
                default:
                    cVar2 = cVar4.f11233z;
                    break;
            }
            this.f11228x = cVar2;
        }
        c cVar5 = this.f11229y;
        if (cVar5 == cVar) {
            c cVar6 = this.f11228x;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f11229y = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f11230z) {
            case 0:
                return cVar.f11233z;
            default:
                return cVar.A;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11229y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f11229y;
        c cVar3 = this.f11228x;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f11229y = cVar;
        return cVar2;
    }
}
