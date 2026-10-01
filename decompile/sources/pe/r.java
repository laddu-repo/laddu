package pe;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ de.p f10592w;

    public /* synthetic */ r(de.p pVar, int i) {
        this.f10591v = i;
        this.f10592w = pVar;
    }

    @Override // pe.d
    public final Object j(Object obj, sd.c cVar) {
        switch (this.f10591v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f10592w.f4522v = obj;
                throw new qe.a(this);
            default:
                this.f10592w.f4522v = obj;
                throw new qe.a(this);
        }
    }
}
