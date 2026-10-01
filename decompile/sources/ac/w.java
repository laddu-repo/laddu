package ac;

import android.content.Context;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w implements cc.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f454v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cc.d f455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cc.c f456x;

    public w(cc.d dVar, cc.c cVar) {
        this.f455w = dVar;
        this.f456x = cVar;
    }

    @Override // nd.a
    public final Object get() {
        switch (this.f454v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Context context = (Context) this.f456x.f2288v;
                sd.h hVar = (sd.h) this.f455w.get();
                de.i.e(context, "appContext");
                de.i.e(hVar, "blockingDispatcher");
                return u.b(dc.i.f4485a, new s5.d(new r(0)), me.x.b(hVar), new s(context, 0));
            default:
                return new dc.e((b) this.f455w.get(), (sd.h) this.f456x.f2288v);
        }
    }

    public w(cc.c cVar, cc.d dVar) {
        this.f456x = cVar;
        this.f455w = dVar;
    }
}
