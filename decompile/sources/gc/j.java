package gc;

import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.activities.PlayerActivity;
import t1.z;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements h2.o {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h2.f f5812w;

    public /* synthetic */ j(h2.f fVar, int i) {
        this.f5811v = i;
        this.f5812w = fVar;
    }

    @Override // h2.o
    public final h2.n h(z zVar) {
        int i = this.f5811v;
        h2.f fVar = this.f5812w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i10 = PlayerActivity.J0;
                break;
        }
        return fVar;
    }
}
