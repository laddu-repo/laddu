package k8;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements w2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p1 f7537v;

    public /* synthetic */ f1(p1 p1Var) {
        this.f7537v = p1Var;
    }

    public boolean a() {
        p1 p1Var = this.f7537v;
        try {
            androidx.emoji2.text.p pVarA = z7.c.a(p1Var.f7692v);
            if (pVarA != null) {
                return pVarA.c(128, "com.android.vending").versionCode >= 80837300;
            }
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.J.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e7) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.J.b(e7, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    @Override // k8.w2
    public void j(int i, Throwable th, byte[] bArr) {
        int i10;
        v0 v0Var;
        v0 v0Var2;
        p1 p1Var = this.f7537v;
        v0 v0Var3 = p1Var.A;
        if (i != 200 && i != 204) {
            i10 = 304;
            if (i != 304) {
                i10 = i;
            }
            p1.l(v0Var3);
            v0Var3.E.c(Integer.valueOf(i10), th, "Network Request for Deferred Deep Link failed. response, exception");
        }
        i10 = i;
        if (th == null) {
            d1 d1Var = p1Var.f7696z;
            p1.j(d1Var);
            d1Var.P.b(true);
            if (bArr == null || bArr.length == 0) {
                p1.l(v0Var3);
                v0Var3.I.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    p1.l(v0Var3);
                    v0Var3.I.a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                t4 t4Var = p1Var.D;
                p1.j(t4Var);
                p1 p1Var2 = (p1) t4Var.f2053w;
                if (TextUtils.isEmpty(strOptString)) {
                    v0Var2 = v0Var3;
                } else {
                    Context context = p1Var2.f7692v;
                    v0Var2 = v0Var3;
                    try {
                        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(strOptString3)) {
                                bundle.putString("gbraid", strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                bundle.putString("gad_source", strOptString4);
                            }
                            bundle.putString("gclid", strOptString2);
                            bundle.putString("_cis", "ddp");
                            p1Var.H.K("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(strOptString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                editorEdit.putString("deeplink", strOptString);
                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                if (editorEdit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = p1Var2.f7692v;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e7) {
                                v0 v0Var4 = ((p1) t4Var.f2053w).A;
                                p1.l(v0Var4);
                                v0Var4.B.b(e7, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        v0Var = v0Var2;
                        p1.l(v0Var);
                        v0Var.B.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                p1.l(v0Var2);
                v0Var = v0Var2;
                try {
                    v0Var.E.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                } catch (JSONException e11) {
                    e = e11;
                    p1.l(v0Var);
                    v0Var.B.b(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e12) {
                e = e12;
                v0Var = v0Var3;
            }
        }
        p1.l(v0Var3);
        v0Var3.E.c(Integer.valueOf(i10), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public f1(n4 n4Var) {
        this.f7537v = n4Var.G;
    }
}
