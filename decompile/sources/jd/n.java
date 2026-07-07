package jd;

import com.drake.net.exception.ConvertException;
import com.drake.net.exception.RequestParamsException;
import com.drake.net.exception.ResponseException;
import com.drake.net.exception.ServerResponseException;
import com.playfy.tv.App;
import com.playfy.tv.R;
import com.playfy.tv.helpers.NintyMin;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.lang.reflect.Type;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements t7.b {

    /* renamed from: a, reason: collision with root package name */
    public final xf.c f7393a;

    /* renamed from: b, reason: collision with root package name */
    public final App f7394b;

    /* renamed from: c, reason: collision with root package name */
    public final he.m f7395c = he.a.d(new d.a0(6));

    public n(xf.c cVar, App app) {
        this.f7393a = cVar;
        this.f7394b = app;
    }

    @Override // t7.b
    public final Object a(Type type, Response response) {
        String string;
        try {
            return t7.a.f12625a.a(type, response);
        } catch (ConvertException unused) {
            int code = response.code();
            if (200 <= code && code < 300) {
                ResponseBody body = response.body();
                if (body != null && (string = body.string()) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        String string2 = jSONObject.getString("code");
                        if (kotlin.jvm.internal.k.a(string2, "0")) {
                            return b(string, type);
                        }
                        throw new ResponseException(response, jSONObject.optString("msg", p7.a.a().getString(R.string.no_error_message)), null, string2, 4, null);
                    } catch (JSONException unused2) {
                        return b(string, type);
                    }
                }
                return null;
            }
            if (400 <= code && code < 500) {
                throw new RequestParamsException(response, String.valueOf(code), null, null, 12, null);
            }
            if (code >= 500) {
                throw new ServerResponseException(response, String.valueOf(code), null, null, 12, null);
            }
            throw new ConvertException(response, "Http status code not within range", null, null, 12, null);
        }
    }

    public final Object b(String str, Type type) {
        sf.a v10 = s1.c.v(xf.c.f14725d.f14727b, type);
        int i6 = NintyMin.f3373a;
        String string = new JSONObject(str).getString(JsonStorageKeyNames.DATA_KEY);
        kotlin.jvm.internal.k.d(string, "getString(...)");
        String lora = (String) this.f7395c.getValue();
        kotlin.jvm.internal.k.e(lora, "lora");
        App app = this.f7394b;
        String ohMyNo = NintyMin.ohMyNo(string, app);
        if (ohMyNo == null) {
            ohMyNo = NintyMin.ohMyYes(string, lora, app);
        }
        return this.f7393a.a(ohMyNo, v10);
    }
}
