package fc;

import android.media.MediaDrm;
import androidx.media3.decoder.DecoderInputBuffer;
import h2.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements MediaDrm.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a9.g f5358b;

    public /* synthetic */ b(t tVar, a9.g gVar, int i) {
        this.f5357a = i;
        this.f5358b = gVar;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i10, byte[] bArr2) {
        switch (this.f5357a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                h.c cVar = ((h2.f) this.f5358b.f273w).R;
                cVar.getClass();
                cVar.obtainMessage(i, bArr).sendToTarget();
                break;
            default:
                h.c cVar2 = ((h2.f) this.f5358b.f273w).R;
                cVar2.getClass();
                cVar2.obtainMessage(i, bArr).sendToTarget();
                break;
        }
    }
}
