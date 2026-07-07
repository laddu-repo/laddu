package fd;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.internal.measurement.k4;
import com.playfy.tv.R;
import com.playfy.tv.activities.SponsorActivity;
import java.util.ArrayList;
import kd.m0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5185x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SponsorActivity f5186y;

    public /* synthetic */ g0(SponsorActivity sponsorActivity, int i6) {
        this.f5185x = i6;
        this.f5186y = sponsorActivity;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [he.f, java.lang.Object] */
    @Override // ve.a
    public final Object invoke() {
        ActivityOptions activityOptions;
        Bundle bundle;
        int i6 = this.f5185x;
        he.y yVar = he.y.f6101a;
        SponsorActivity sponsorActivity = this.f5186y;
        switch (i6) {
            case 0:
                i0 i0Var = SponsorActivity.O;
                String string = ((SharedPreferences) sponsorActivity.F.getValue()).getString("telegram", "https://t.me/+YJMkvc9WBsRjMDdl");
                kotlin.jvm.internal.k.b(string);
                cf.m.y(sponsorActivity, string, true);
                return yVar;
            case 1:
                sponsorActivity.I = true;
                sponsorActivity.V().f3182b.setEnabled(false);
                sponsorActivity.V().f3182b.setAlpha(0.6f);
                sponsorActivity.V().f3188h.setVisibility(8);
                sponsorActivity.V().f3190k.setVisibility(0);
                sponsorActivity.V().f3189i.setVisibility(0);
                TextView textView = sponsorActivity.V().f3189i;
                he.m mVar = sponsorActivity.N;
                textView.setText(sponsorActivity.getString(R.string.remaining_countdown, Long.valueOf(((Number) mVar.getValue()).longValue())));
                sponsorActivity.X();
                Uri parse = Uri.parse(sponsorActivity.W().f7882c);
                ArrayList arrayList = new ArrayList(new ie.g(new String[]{"com.android.chrome"}, true));
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                int c10 = i0.f.c(sponsorActivity, R.color.bg_main) | (-16777216);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", c10);
                Bundle bundle3 = null;
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle4);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtras(bundle2);
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 2);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    String b10 = p0.b.b();
                    if (!TextUtils.isEmpty(b10)) {
                        if (intent.hasExtra("com.android.browser.headers")) {
                            bundle = intent.getBundleExtra("com.android.browser.headers");
                        } else {
                            bundle = new Bundle();
                        }
                        if (!bundle.containsKey("Accept-Language")) {
                            bundle.putString("Accept-Language", b10);
                            intent.putExtra("com.android.browser.headers", bundle);
                        }
                    }
                }
                if (i10 >= 34) {
                    activityOptions = j4.n.g();
                    d.a.j(activityOptions);
                } else {
                    activityOptions = null;
                }
                if (i10 >= 36) {
                    if (activityOptions == null) {
                        activityOptions = j4.n.g();
                    }
                    d.b.f(activityOptions, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
                }
                if (activityOptions != null) {
                    bundle3 = activityOptions.toBundle();
                }
                try {
                    String k8 = k4.k(sponsorActivity, arrayList);
                    if (k8 != null) {
                        intent.setPackage(k8);
                        intent.addFlags(1073741824);
                        intent.setData(parse);
                        sponsorActivity.startActivity(intent, bundle3);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                        intent2.addFlags(1073741824);
                        sponsorActivity.startActivity(intent2);
                    }
                } catch (Exception unused) {
                    Toast.makeText(sponsorActivity, "Could not open link", 0).show();
                }
                CountDownTimer countDownTimer = sponsorActivity.K;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                long longValue = ((Number) mVar.getValue()).longValue();
                sponsorActivity.J = sponsorActivity.W().f7883d;
                sponsorActivity.K = new e(longValue, sponsorActivity).start();
                return yVar;
            case 2:
                i0 i0Var2 = SponsorActivity.O;
                return (m0) ((id.h) sponsorActivity.E.getValue()).f6831c.f7843d.get(sponsorActivity.getIntent().getIntExtra("sn", 2));
            default:
                i0 i0Var3 = SponsorActivity.O;
                return Long.valueOf(sponsorActivity.W().f7883d * 1000);
        }
    }
}
