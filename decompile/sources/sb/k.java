package sb;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.firebase.messaging.FirebaseMessaging;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements o8.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f11732w;

    public /* synthetic */ k(FirebaseMessaging firebaseMessaging, int i) {
        this.f11731v = i;
        this.f11732w = firebaseMessaging;
    }

    @Override // o8.e
    public final void n(Object obj) {
        int i = this.f11731v;
        FirebaseMessaging firebaseMessaging = this.f11732w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                u uVar = (u) obj;
                if (firebaseMessaging.f3617e.l()) {
                    uVar.h();
                }
                break;
            default:
                p7.a aVar = (p7.a) obj;
                k4 k4Var = FirebaseMessaging.f3610l;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    android.support.v4.media.session.b.A(aVar.f10396v);
                    firebaseMessaging.e();
                }
                break;
        }
    }
}
