package a7;

import android.os.Handler;
import android.webkit.WebView;
import he.y;
import java.io.IOException;
import jd.c0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements Callback, ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f598x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f599y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f600z;

    public /* synthetic */ g(int i6, Object obj, Object obj2) {
        this.f598x = i6;
        this.f599y = obj;
        this.f600z = obj2;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        switch (this.f598x) {
            case 0:
                try {
                    ((Call) this.f599y).cancel();
                } catch (Throwable unused) {
                }
                return y.f6101a;
            default:
                ((Handler) this.f599y).post(new c0((WebView) this.f600z));
                return y.f6101a;
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (!call.isCanceled()) {
            ((gf.k) this.f600z).resumeWith(he.a.b(iOException));
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        ((gf.k) this.f600z).resumeWith(response);
    }
}
