package y9;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends p1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f14579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Iterator f14581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f14582z;

    public l0() {
        this.f14578v = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        p4.v.r(this.f14578v != 4);
        int iC = y.e.c(this.f14578v);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f14578v = 4;
            switch (this.f14580x) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                    do {
                        Iterator it = this.f14581y;
                        if (!it.hasNext()) {
                            this.f14578v = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((x9.i) this.f14582z).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.f14581y;
                        if (!it2.hasNext()) {
                            this.f14578v = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((Set) this.f14582z).contains(next));
                    break;
            }
            this.f14579w = next;
            if (this.f14578v != 3) {
                this.f14578v = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14578v = 2;
        Object obj = this.f14579w;
        this.f14579w = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(Iterator it, x9.i iVar) {
        this();
        this.f14580x = 0;
        this.f14581y = it;
        this.f14582z = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(Set set, Set set2) {
        this();
        this.f14580x = 1;
        this.f14582z = set2;
        this.f14581y = set.iterator();
    }
}
