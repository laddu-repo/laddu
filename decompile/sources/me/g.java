package me;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ce.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8693v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8694w;

    public /* synthetic */ g(int i, Object obj) {
        this.f8693v = i;
        this.f8694w = obj;
    }

    @Override // ce.q
    public final Object h(Object obj, Object obj2, Object obj3) {
        switch (this.f8693v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((ac.t) this.f8694w).a((Throwable) obj);
                break;
            case 1:
                ue.c cVar = (ue.c) this.f8694w;
                ue.c.C.set(cVar, null);
                cVar.i(null);
                break;
            default:
                ((ue.g) this.f8694w).c();
                break;
        }
        return od.l.f10126a;
    }

    public /* synthetic */ g(ue.c cVar, ue.b bVar) {
        this.f8693v = 1;
        this.f8694w = cVar;
    }
}
