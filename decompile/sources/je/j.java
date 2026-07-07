package je;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import ce.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, ee.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7122v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f7123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f7124x;

    public j(de.b bVar) {
        this.f7122v = 1;
        this.f7124x = new ArrayList();
        this.f7123w = bVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7122v) {
        }
        return this.f7123w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7122v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((l) ((d) this.f7124x).f7114c).a(this.f7123w.next());
            default:
                Object next = this.f7123w.next();
                ArrayList arrayList = (ArrayList) this.f7124x;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                de.b bVar = viewGroup != null ? new de.b(3, viewGroup) : null;
                if (bVar == null || !bVar.hasNext()) {
                    while (!this.f7123w.hasNext() && !arrayList.isEmpty()) {
                        this.f7123w = (Iterator) pd.j.J(arrayList);
                        pd.j.K(arrayList);
                    }
                } else {
                    arrayList.add(this.f7123w);
                    this.f7123w = bVar;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7122v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j(d dVar) {
        this.f7122v = 0;
        this.f7124x = dVar;
        this.f7123w = ((e) dVar.f7113b).iterator();
    }
}
