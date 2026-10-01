package de;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterator, ee.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4501v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f4503x;

    public /* synthetic */ b(int i, Object obj) {
        this.f4501v = i;
        this.f4503x = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4501v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return this.f4502w < ((Object[]) this.f4503x).length;
            case 1:
                Iterator it = (Iterator) this.f4503x;
                while (this.f4502w > 0 && it.hasNext()) {
                    it.next();
                    this.f4502w--;
                }
                return it.hasNext();
            case 2:
                return this.f4502w < ((pd.d) this.f4503x).a();
            default:
                return this.f4502w < ((ViewGroup) this.f4503x).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4501v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                try {
                    Object[] objArr = (Object[]) this.f4503x;
                    int i = this.f4502w;
                    this.f4502w = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f4502w--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            case 1:
                Iterator it = (Iterator) this.f4503x;
                while (this.f4502w > 0 && it.hasNext()) {
                    it.next();
                    this.f4502w--;
                }
                return it.next();
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                pd.d dVar = (pd.d) this.f4503x;
                int i10 = this.f4502w;
                this.f4502w = i10 + 1;
                return dVar.get(i10);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f4503x;
                int i11 = this.f4502w;
                this.f4502w = i11 + 1;
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4501v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f4503x;
                int i = this.f4502w - 1;
                this.f4502w = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public b(Object[] objArr) {
        this.f4501v = 0;
        i.e(objArr, "array");
        this.f4503x = objArr;
    }

    public b(je.b bVar) {
        this.f4501v = 1;
        this.f4503x = bVar.f7107a.iterator();
        this.f4502w = bVar.f7108b;
    }
}
