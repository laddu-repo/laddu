package le;

import fd.h0;
import java.io.Serializable;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements h, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final h f8350x;

    /* renamed from: y, reason: collision with root package name */
    public final f f8351y;

    public b(f element, h left) {
        k.e(left, "left");
        k.e(element, "element");
        this.f8350x = left;
        this.f8351y = element;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i6 = 2;
                b bVar2 = bVar;
                int i10 = 2;
                while (true) {
                    h hVar = bVar2.f8350x;
                    if (hVar instanceof b) {
                        bVar2 = (b) hVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i10++;
                }
                b bVar3 = this;
                while (true) {
                    h hVar2 = bVar3.f8350x;
                    if (hVar2 instanceof b) {
                        bVar3 = (b) hVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i6++;
                }
                if (i10 == i6) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.f8351y;
                        if (!k.a(bVar.get(fVar.getKey()), fVar)) {
                            z10 = false;
                            break;
                        }
                        h hVar3 = bVar4.f8350x;
                        if (hVar3 instanceof b) {
                            bVar4 = (b) hVar3;
                        } else {
                            k.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z10 = k.a(bVar.get(fVar2.getKey()), fVar2);
                            break;
                        }
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // le.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f8350x.fold(obj, pVar), this.f8351y);
    }

    @Override // le.h
    public final f get(g key) {
        k.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f8351y.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f8350x;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f8351y.hashCode() + this.f8350x.hashCode();
    }

    @Override // le.h
    public final h minusKey(g key) {
        k.e(key, "key");
        f fVar = this.f8351y;
        f fVar2 = fVar.get(key);
        h hVar = this.f8350x;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.f8353x) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override // le.h
    public final h plus(h context) {
        k.e(context, "context");
        if (context == i.f8353x) {
            return this;
        }
        return (h) context.fold(this, new h0(9));
    }

    public final String toString() {
        return r4.a.n(new StringBuilder("["), (String) fold(HttpUrl.FRAGMENT_ENCODE_SET, new h0(8)), ']');
    }
}
