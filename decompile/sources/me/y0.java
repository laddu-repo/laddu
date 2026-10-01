package me;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 extends de.h implements ce.l {
    public final /* synthetic */ int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i, obj, cls, str, str2, i10, i11);
        this.D = i12;
    }

    @Override // ce.l
    public final Object a(Object obj) {
        switch (this.D) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((z0) this.f4506w).l((Throwable) obj);
                return od.l.f10126a;
            default:
                de.i.e((Set) obj, "p0");
                p4.g gVar = (p4.g) this.f4506w;
                ReentrantLock reentrantLock = gVar.f10303d;
                reentrantLock.lock();
                try {
                    List listO = pd.j.O(gVar.f10302c.values());
                    reentrantLock.unlock();
                    Iterator it = listO.iterator();
                    if (!it.hasNext()) {
                        return od.l.f10126a;
                    }
                    ((p4.l) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}
