package q7;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
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
import androidx.fragment.app.q0;
import com.google.android.gms.common.api.GoogleApiActivity;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f10905d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f10906e = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v7.d f10907c;

    public static AlertDialog d(Activity activity, int i, t7.q qVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(t7.p.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(o7.b.common_google_play_services_enable_button) : resources.getString(o7.b.common_google_play_services_update_button) : resources.getString(o7.b.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, qVar);
        }
        String strA = t7.p.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", d0.d.h(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof h.j) {
                q0 q0VarO = ((h.j) activity).o();
                j jVar = new j();
                y.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.J0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.K0 = onCancelListener;
                }
                jVar.R(q0VarO, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        y.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f10898v = alertDialog;
        if (onCancelListener != null) {
            cVar.f10899w = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new t7.q(super.a(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        g(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, s7.e eVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new t7.q(super.a(i, activity, "d"), eVar, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", d0.d.i(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? t7.p.e(context, "common_google_play_services_resolution_required_title") : t7.p.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(o7.b.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? t7.p.d(context, "common_google_play_services_resolution_required_text", t7.p.c(context)) : t7.p.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        h0.m mVar = new h0.m(context, null);
        mVar.f6034m = true;
        mVar.c(16, true);
        mVar.f6028e = h0.m.b(strE);
        h0.k kVar = new h0.k(2, false);
        kVar.f6023x = h0.m.b(strD);
        mVar.e(kVar);
        PackageManager packageManager = context.getPackageManager();
        if (x7.b.f14255c == null) {
            x7.b.f14255c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = x7.b.f14255c.booleanValue();
        int i11 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            mVar.f6040s.icon = i11;
            mVar.f6031j = 2;
            if (x7.b.f(context)) {
                mVar.f6025b.add(new h0.g(o7.a.common_full_open_on_phone, pendingIntent, resources.getString(o7.b.common_open_on_phone)));
            } else {
                mVar.f6029g = pendingIntent;
            }
        } else {
            mVar.f6040s.icon = R.drawable.stat_sys_warning;
            mVar.f6040s.tickerText = h0.m.b(resources.getString(o7.b.common_google_play_services_notification_ticker));
            mVar.f6040s.when = System.currentTimeMillis();
            mVar.f6029g = pendingIntent;
            mVar.f = h0.m.b(strD);
        }
        if (x7.b.d()) {
            if (!x7.b.d()) {
                throw new IllegalStateException();
            }
            synchronized (f10905d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(o7.b.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(kb.h.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            mVar.f6038q = "com.google.android.gms.availability";
        }
        Notification notificationA = mVar.a();
        if (i == 1 || i == 2 || i == 3) {
            g.f10910a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationA);
    }
}
