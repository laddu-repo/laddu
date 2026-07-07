package ed;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.fragment.app.d1;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.c0;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4904v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f4907y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f4908z;

    public /* synthetic */ k(ab.f fVar, a7.k kVar, int i, Runnable runnable) {
        this.f4906x = fVar;
        this.f4907y = kVar;
        this.f4905w = i;
        this.f4908z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4904v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((zc.e) this.f4906x).g((ad.e) this.f4907y, (List) this.f4908z, this.f4905w);
                return;
            default:
                ab.f fVar = (ab.f) this.f4906x;
                a7.k kVar = (a7.k) this.f4907y;
                int i = this.f4905w;
                Runnable runnable = (Runnable) this.f4908z;
                i7.c cVar = (i7.c) fVar.f;
                try {
                    try {
                        h7.d dVar = (h7.d) fVar.f300c;
                        Objects.requireNonNull(dVar);
                        ((h7.h) cVar).B(new d1(18, dVar));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) fVar.f298a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((h7.h) cVar).B(new c0(fVar, kVar, i));
                        } else {
                            fVar.e(kVar, i);
                        }
                        break;
                    } catch (i7.a unused) {
                        ((a7.j) fVar.f301d).u(kVar, i + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ k(zc.e eVar, ad.e eVar2, List list, int i) {
        this.f4906x = eVar;
        this.f4907y = eVar2;
        this.f4908z = list;
        this.f4905w = i;
    }
}
