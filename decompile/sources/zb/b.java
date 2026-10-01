package zb;

import android.util.Base64OutputStream;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15319b;

    public /* synthetic */ b(c cVar, int i6) {
        this.f15318a = i6;
        this.f15319b = cVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        c cVar = this.f15319b;
        synchronized (cVar) {
            try {
                w5.a aVar = (w5.a) cVar.f15320a.get();
                ArrayList e10 = aVar.e();
                aVar.d();
                JSONArray jSONArray = new JSONArray();
                for (int i6 = 0; i6 < e10.size(); i6++) {
                    a aVar2 = (a) e10.get(i6);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar2.f15316a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar2.f15317b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15318a) {
            case 0:
                return a();
            default:
                c cVar = this.f15319b;
                synchronized (cVar) {
                    ((w5.a) cVar.f15320a.get()).m(((lc.b) cVar.f15322c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
