package w8;

import android.view.View;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements d, Callback {

    /* renamed from: x, reason: collision with root package name */
    public final Object f14155x;

    public e(int i6) {
        switch (i6) {
            case 3:
                this.f14155x = new ConcurrentHashMap(16);
                return;
            default:
                this.f14155x = new int[2];
                return;
        }
    }

    @Override // w8.d
    public void a(t8.b bVar) {
        f fVar = (f) this.f14155x;
        if (bVar.f12629y == 0) {
            fVar.e(null, fVar.t());
            return;
        }
        c cVar = fVar.f14174p;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    public JSONObject b(View view) {
        int[] iArr = (int[]) this.f14155x;
        if (view == null) {
            return zc.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zc.b.a(iArr[0], iArr[1], width, height);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        ((hb.d0) this.f14155x).l(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        ((hb.d0) this.f14155x).k(response);
    }

    public /* synthetic */ e(Object obj) {
        this.f14155x = obj;
    }
}
