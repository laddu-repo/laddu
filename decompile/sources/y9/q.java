package y9;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterator {
    public final /* synthetic */ t A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f14603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f14604z;

    public q(t tVar, int i) {
        this.f14604z = i;
        this.A = tVar;
        this.f14603y = tVar;
        this.f14600v = tVar.f14619z;
        this.f14601w = tVar.isEmpty() ? -1 : 0;
        this.f14602x = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14601w >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object sVar;
        t tVar = this.f14603y;
        if (tVar.f14619z != this.f14600v) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14601w;
        this.f14602x = i;
        switch (this.f14604z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                sVar = this.A.i()[i];
                break;
            case 1:
                sVar = new s(this.A, i);
                break;
            default:
                sVar = this.A.j()[i];
                break;
        }
        int i10 = this.f14601w + 1;
        if (i10 >= tVar.A) {
            i10 = -1;
        }
        this.f14601w = i10;
        return sVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        t tVar = this.f14603y;
        if (tVar.f14619z != this.f14600v) {
            throw new ConcurrentModificationException();
        }
        p4.v.q("no calls to next() since the last call to remove()", this.f14602x >= 0);
        this.f14600v += 32;
        tVar.remove(tVar.i()[this.f14602x]);
        this.f14601w--;
        this.f14602x = -1;
    }
}
