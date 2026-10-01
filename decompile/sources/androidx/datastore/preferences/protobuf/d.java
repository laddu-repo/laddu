package androidx.datastore.preferences.protobuf;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f752v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f753w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f755y;

    public d(com.google.android.gms.internal.measurement.t0 t0Var) {
        this.f755y = t0Var;
        this.f754x = t0Var.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f752v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (this.f753w < this.f754x) {
                }
                break;
            default:
                if (this.f753w < this.f754x) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f752v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.f753w;
                if (i >= this.f754x) {
                    throw new NoSuchElementException();
                }
                this.f753w = i + 1;
                return Byte.valueOf(((g) this.f755y).f(i));
            default:
                int i10 = this.f753w;
                if (i10 >= this.f754x) {
                    throw new NoSuchElementException();
                }
                this.f753w = i10 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.measurement.t0) this.f755y).a(i10));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f752v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public d(g gVar) {
        this.f755y = gVar;
        this.f754x = gVar.size();
    }
}
