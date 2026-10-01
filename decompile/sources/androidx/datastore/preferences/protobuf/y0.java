package androidx.datastore.preferences.protobuf;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f875v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f877x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f878y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f879z;

    public /* synthetic */ y0(o2 o2Var) {
        this.f875v = 1;
        Objects.requireNonNull(o2Var);
        this.f879z = o2Var;
        this.f876w = -1;
    }

    public Iterator a() {
        if (this.f878y == null) {
            this.f878y = ((w0) this.f879z).f866w.entrySet().iterator();
        }
        return this.f878y;
    }

    public Iterator b() {
        if (this.f878y == null) {
            this.f878y = ((o2) this.f879z).f2944x.entrySet().iterator();
        }
        return this.f878y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f875v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.f876w + 1;
                w0 w0Var = (w0) this.f879z;
                if (i >= w0Var.f865v.size()) {
                    return !w0Var.f866w.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i10 = this.f876w + 1;
                o2 o2Var = (o2) this.f879z;
                if (i10 >= o2Var.f2943w) {
                    return !o2Var.f2944x.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f875v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f877x = true;
                int i = this.f876w + 1;
                this.f876w = i;
                w0 w0Var = (w0) this.f879z;
                return i < w0Var.f865v.size() ? (Map.Entry) w0Var.f865v.get(this.f876w) : (Map.Entry) a().next();
            default:
                this.f877x = true;
                int i10 = this.f876w + 1;
                this.f876w = i10;
                o2 o2Var = (o2) this.f879z;
                return i10 < o2Var.f2943w ? (p2) o2Var.f2942v[i10] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f875v;
        AbstractMap abstractMap = this.f879z;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w0 w0Var = (w0) abstractMap;
                if (!this.f877x) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f877x = false;
                int i10 = w0.A;
                w0Var.b();
                if (this.f876w >= w0Var.f865v.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f876w;
                this.f876w = i11 - 1;
                w0Var.h(i11);
                return;
            default:
                if (!this.f877x) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f877x = false;
                o2 o2Var = (o2) abstractMap;
                o2Var.f();
                int i12 = this.f876w;
                if (i12 >= o2Var.f2943w) {
                    b().remove();
                    return;
                } else {
                    this.f876w = i12 - 1;
                    o2Var.d(i12);
                    return;
                }
        }
    }

    public y0(w0 w0Var) {
        this.f875v = 0;
        this.f879z = w0Var;
        this.f876w = -1;
    }
}
