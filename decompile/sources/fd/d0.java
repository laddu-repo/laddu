package fd;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import com.playfy.tv.activities.SplashActivity;
import od.n0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5172x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f5173y;

    public /* synthetic */ d0(SplashActivity splashActivity, int i6) {
        this.f5172x = i6;
        this.f5173y = splashActivity;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [he.f, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f5172x;
        SplashActivity splashActivity = this.f5173y;
        switch (i6) {
            case 0:
                bf.o[] oVarArr = SplashActivity.K;
                String string = ((SharedPreferences) splashActivity.I.getValue()).getString("telegram", "https://t.me/+YJMkvc9WBsRjMDdl");
                kotlin.jvm.internal.k.b(string);
                cf.m.y(splashActivity, string, false);
                return;
            case 1:
                bf.o[] oVarArr2 = SplashActivity.K;
                ((n0) splashActivity.D.getValue()).getData();
                return;
            case 2:
                bf.o[] oVarArr3 = SplashActivity.K;
                String string2 = ((SharedPreferences) splashActivity.I.getValue()).getString("telegram", "https://t.me/+YJMkvc9WBsRjMDdl");
                kotlin.jvm.internal.k.b(string2);
                cf.m.y(splashActivity, string2, false);
                return;
            default:
                bf.o[] oVarArr4 = SplashActivity.K;
                splashActivity.getClass();
                try {
                    Object systemService = splashActivity.getSystemService("activity");
                    kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    ((ActivityManager) systemService).clearApplicationUserData();
                    return;
                } catch (Exception unused) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + splashActivity.getPackageName()));
                    intent.addFlags(268435456);
                    splashActivity.startActivity(intent);
                    return;
                }
        }
    }
}
