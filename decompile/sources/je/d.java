package je;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends f1.c implements Iterator, we.a {
    public final /* synthetic */ int B;

    public d(f map, int i6) {
        this.B = i6;
        k.e(map, "map");
        this.A = map;
        this.f4631y = -1;
        this.f4632z = map.E;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.B) {
            case 0:
                b();
                int i6 = this.f4630x;
                f fVar = (f) this.A;
                if (i6 < fVar.C) {
                    this.f4630x = i6 + 1;
                    this.f4631y = i6;
                    e eVar = new e(fVar, i6);
                    e();
                    return eVar;
                }
                throw new NoSuchElementException();
            case 1:
                b();
                int i10 = this.f4630x;
                f fVar2 = (f) this.A;
                if (i10 < fVar2.C) {
                    this.f4630x = i10 + 1;
                    this.f4631y = i10;
                    Object obj = fVar2.f7428x[i10];
                    e();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                b();
                int i11 = this.f4630x;
                f fVar3 = (f) this.A;
                if (i11 < fVar3.C) {
                    this.f4630x = i11 + 1;
                    this.f4631y = i11;
                    Object[] objArr = fVar3.f7429y;
                    k.b(objArr);
                    Object obj2 = objArr[this.f4631y];
                    e();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
