package p7;

import android.os.Bundle;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.tb;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.h f10424b = new o8.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f10426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10427e;

    public l(int i, int i10, Bundle bundle, int i11) {
        this.f10427e = i11;
        this.f10423a = i;
        this.f10425c = i10;
        this.f10426d = bundle;
    }

    public final boolean a() {
        switch (this.f10427e) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return true;
            default:
                return false;
        }
    }

    public final void b(tb tbVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + tbVar.toString());
        }
        this.f10424b.f9963a.n(tbVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f10424b.a(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f10425c + " id=" + this.f10423a + " oneWay=" + a() + "}";
    }
}
