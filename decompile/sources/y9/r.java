package y9;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractSet {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f14607w;

    public /* synthetic */ r(t tVar, int i) {
        this.f14606v = i;
        this.f14607w = tVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f14606v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f14607w.clear();
                break;
            default:
                this.f14607w.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f14606v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                t tVar = this.f14607w;
                Map mapB = tVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = tVar.d(entry.getKey());
                    if (iD != -1 && Objects.equals(tVar.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f14607w.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f14606v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                t tVar = this.f14607w;
                Map mapB = tVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new q(tVar, 1);
            default:
                t tVar2 = this.f14607w;
                Map mapB2 = tVar2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new q(tVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f14606v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                t tVar = this.f14607w;
                Map mapB = tVar.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!tVar.f()) {
                        int iC = tVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = tVar.f14615v;
                        Objects.requireNonNull(obj2);
                        int iR = p.r(key, value, iC, obj2, tVar.h(), tVar.i(), tVar.j());
                        if (iR != -1) {
                            tVar.e(iR, iC);
                            tVar.A--;
                            tVar.f14619z += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                t tVar2 = this.f14607w;
                Map mapB2 = tVar2.b();
                return mapB2 != null ? mapB2.keySet().remove(obj) : tVar2.g(obj) != t.E;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f14606v) {
        }
        return this.f14607w.size();
    }
}
