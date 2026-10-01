package l2;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class n extends a2.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8098v;

    public n(IllegalStateException illegalStateException, o oVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(oVar == null ? null : oVar.f8099a);
        super(sb2.toString(), illegalStateException);
        boolean z2 = illegalStateException instanceof MediaCodec.CodecException;
        if (z2) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f8098v = z2 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
