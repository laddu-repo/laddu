package y9;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14526v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Iterator f14527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f14528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f14529y;

    public c(l lVar) {
        this.f14529y = lVar;
        Collection collection = lVar.f14574w;
        this.f14528x = collection;
        this.f14527w = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        l lVar = (l) this.f14529y;
        lVar.b();
        if (lVar.f14574w != ((Collection) this.f14528x)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14526v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f14527w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14526v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Map.Entry entry = (Map.Entry) this.f14527w.next();
                this.f14528x = (Collection) entry.getValue();
                return ((d) this.f14529y).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f14527w.next();
                this.f14528x = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f14527w.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14526v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p4.v.q("no calls to next() since the last call to remove()", ((Collection) this.f14528x) != null);
                this.f14527w.remove();
                ((d) this.f14529y).f14538y.f14626z -= ((Collection) this.f14528x).size();
                ((Collection) this.f14528x).clear();
                this.f14528x = null;
                break;
            case 1:
                p4.v.q("no calls to next() since the last call to remove()", ((Map.Entry) this.f14528x) != null);
                Collection collection = (Collection) ((Map.Entry) this.f14528x).getValue();
                this.f14527w.remove();
                ((e) this.f14529y).f14544w.f14626z -= collection.size();
                collection.clear();
                this.f14528x = null;
                break;
            default:
                this.f14527w.remove();
                l lVar = (l) this.f14529y;
                w0 w0Var = lVar.f14577z;
                w0Var.f14626z--;
                lVar.c();
                break;
        }
    }

    public c(l lVar, ListIterator listIterator) {
        this.f14529y = lVar;
        this.f14528x = lVar.f14574w;
        this.f14527w = listIterator;
    }

    public c(e eVar, Iterator it) {
        this.f14527w = it;
        this.f14529y = eVar;
    }

    public c(d dVar) {
        this.f14529y = dVar;
        this.f14527w = dVar.f14537x.entrySet().iterator();
    }
}
