package qd;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends j1.c implements Iterator, ee.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10998z;

    public d(f fVar, int i) {
        this.f10998z = i;
        de.i.e(fVar, "map");
        this.f6649y = fVar;
        this.f6647w = -1;
        this.f6648x = fVar.C;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10998z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                b();
                int i = this.f6646v;
                f fVar = (f) this.f6649y;
                if (i >= fVar.A) {
                    throw new NoSuchElementException();
                }
                this.f6646v = i + 1;
                this.f6647w = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i10 = this.f6646v;
                f fVar2 = (f) this.f6649y;
                if (i10 >= fVar2.A) {
                    throw new NoSuchElementException();
                }
                this.f6646v = i10 + 1;
                this.f6647w = i10;
                Object obj = fVar2.f11002v[i10];
                e();
                return obj;
            default:
                b();
                int i11 = this.f6646v;
                f fVar3 = (f) this.f6649y;
                if (i11 >= fVar3.A) {
                    throw new NoSuchElementException();
                }
                this.f6646v = i11 + 1;
                this.f6647w = i11;
                Object[] objArr = fVar3.f11003w;
                de.i.b(objArr);
                Object obj2 = objArr[this.f6647w];
                e();
                return obj2;
        }
    }
}
