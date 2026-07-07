package t8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import w8.j0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12639a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f12640b;

    /* JADX WARN: Type inference failed for: r0v2, types: [t8.f, java.lang.Object] */
    static {
        AtomicBoolean atomicBoolean = i.f12641a;
        f12639a = 12451000;
        f12640b = new Object();
    }

    public static void c(Context context) {
        AtomicBoolean atomicBoolean = i.f12641a;
        f fVar = f12640b;
        int b10 = fVar.b(context, 11925000);
        if (b10 != 0) {
            Intent a10 = fVar.a(b10, context, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + b10);
            if (a10 == null) {
                throw new Exception();
            }
            throw new Exception("Google Play Services not available");
        }
    }

    public Intent a(int i6, Context context, String str) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return null;
            }
            int i10 = j0.f14207a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && a9.b.f(context)) {
            int i11 = j0.f14207a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f12639a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(c9.c.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        int i12 = j0.f14207a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:49)(1:47)|48)|50|(11:52|(1:54)(1:119)|55|(2:115|116)(1:57)|58|59|60|(1:62)(2:(2:85|(1:87))|(4:93|(1:95)(1:112)|(1:97)|(1:99)(4:100|(2:106|107)|102|(1:104)(1:105)))(1:92))|63|(2:(5:66|67|68|69|(2:70|(2:72|(1:74)(1:75))(2:76|77)))|80)(0)|(1:82)(1:83)))|120|(0)(0)|55|(0)(0)|58|59|60|(0)(0)|63|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b8, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.f.b(android.content.Context, int):int");
    }
}
