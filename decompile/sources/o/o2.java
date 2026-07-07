package o;

import androidx.appcompat.widget.SearchView;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SearchView f9252w;

    public /* synthetic */ o2(SearchView searchView, int i) {
        this.f9251v = i;
        this.f9252w = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9251v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f9252w.s();
                break;
            default:
                y0.b bVar = this.f9252w.f630n0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                }
                break;
        }
    }
}
