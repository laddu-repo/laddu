package t8;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.unity3d.services.UnityAdsConstants;
import j1.p0;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12637c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f12638d = new Object();

    public static AlertDialog e(Activity activity, int i6, w8.q qVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i6 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(w8.p.b(activity, i6));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    string = resources.getString(R.string.ok);
                } else {
                    string = resources.getString(com.playfy.tv.R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(com.playfy.tv.R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(com.playfy.tv.R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, qVar);
        }
        String c10 = w8.p.c(activity, i6);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", h8.c.i(i6, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.DialogFragment, t8.c] */
    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof i.j) {
                p0 z10 = ((i.j) activity).z();
                k kVar = new k();
                x.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.P0 = alertDialog;
                if (onCancelListener != null) {
                    kVar.Q0 = onCancelListener;
                }
                kVar.Q(z10, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        x.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f12631x = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f12632y = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i6, GoogleApiActivity googleApiActivity2) {
        AlertDialog e10 = e(googleApiActivity, i6, new w8.q(super.a(i6, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (e10 == null) {
            return;
        }
        f(googleApiActivity, e10, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [h0.o, e3.e] */
    public final void g(Context context, int i6, PendingIntent pendingIntent) {
        String c10;
        String d10;
        int i10;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", h8.c.j(i6, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i6 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        if (pendingIntent == null) {
            if (i6 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i6 == 6) {
            c10 = w8.p.e(context, "common_google_play_services_resolution_required_title");
        } else {
            c10 = w8.p.c(context, i6);
        }
        if (c10 == null) {
            c10 = context.getResources().getString(com.playfy.tv.R.string.common_google_play_services_notification_ticker);
        }
        if (i6 != 6 && i6 != 19) {
            d10 = w8.p.b(context, i6);
        } else {
            d10 = w8.p.d("common_google_play_services_resolution_required_text", w8.p.a(context), context);
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        x.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        h0.q qVar = new h0.q(context, null);
        qVar.f5797m = true;
        qVar.c(true);
        qVar.f5790e = h0.q.b(c10);
        ?? eVar = new e3.e(1);
        eVar.f5785z = h0.q.b(d10);
        qVar.e(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (a9.b.f632c == null) {
            a9.b.f632c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (a9.b.f632c.booleanValue()) {
            qVar.f5803t.icon = context.getApplicationInfo().icon;
            qVar.j = 2;
            if (a9.b.f(context)) {
                qVar.f5787b.add(new h0.k(resources.getString(com.playfy.tv.R.string.common_open_on_phone), pendingIntent));
            } else {
                qVar.f5792g = pendingIntent;
            }
        } else {
            qVar.f5803t.icon = R.drawable.stat_sys_warning;
            String string = resources.getString(com.playfy.tv.R.string.common_google_play_services_notification_ticker);
            qVar.f5803t.tickerText = h0.q.b(string);
            qVar.f5803t.when = System.currentTimeMillis();
            qVar.f5792g = pendingIntent;
            qVar.f5791f = h0.q.b(d10);
        }
        if (a9.b.d()) {
            if (a9.b.d()) {
                synchronized (f12637c) {
                }
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(com.playfy.tv.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(m6.b.e(string2));
                } else {
                    name = notificationChannel.getName();
                    if (!string2.contentEquals(name)) {
                        notificationChannel.setName(string2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                qVar.f5802r = "com.google.android.gms.availability";
            } else {
                throw new IllegalStateException();
            }
        }
        Notification a10 = qVar.a();
        if (i6 != 1 && i6 != 2 && i6 != 3) {
            i10 = 39789;
        } else {
            i.f12641a.set(false);
            i10 = 10436;
        }
        notificationManager.notify(i10, a10);
    }

    public final void h(Activity activity, v8.e eVar, int i6, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e10 = e(activity, i6, new w8.q(super.a(i6, activity, "d"), eVar, 1), onCancelListener);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
