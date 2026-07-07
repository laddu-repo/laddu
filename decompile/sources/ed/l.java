package ed;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4909v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ab.f f4910w;

    public /* synthetic */ l(ab.f fVar, ad.e eVar, int i) {
        this.f4909v = i;
        this.f4910w = fVar;
    }

    private final void a() {
        ab.f fVar = this.f4910w;
        synchronized (fVar.f300c) {
            try {
                Iterator it = ((ArrayList) fVar.f).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        ab.f fVar = this.f4910w;
        synchronized (fVar.f300c) {
            try {
                Iterator it = ((ArrayList) fVar.f).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        ab.f fVar = this.f4910w;
        synchronized (fVar.f300c) {
            try {
                Iterator it = ((ArrayList) fVar.f).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4909v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                c();
                return;
            default:
                ab.f fVar = this.f4910w;
                synchronized (fVar.f300c) {
                    try {
                        Iterator it = ((ArrayList) fVar.f).iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
