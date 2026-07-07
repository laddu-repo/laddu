package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.h0;
import h8.c;
import t8.b;
import t8.e;
import v8.d;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f2130y = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f2131x = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i6 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2131x = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                d e10 = d.e(this);
                if (i10 != -1) {
                    if (i10 == 0) {
                        e10.f(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    h0 h0Var = e10.J;
                    h0Var.sendMessage(h0Var.obtainMessage(3));
                }
            }
        } else if (i6 == 2) {
            this.f2131x = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2131x = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2131x = bundle.getInt("resolution");
        }
        if (this.f2131x != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                } catch (ActivityNotFoundException e10) {
                    e = e10;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e11) {
                    e = e11;
                }
                try {
                    googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    googleApiActivity.f2131x = 1;
                    return;
                } catch (ActivityNotFoundException e12) {
                    e = e12;
                    if (extras.getBoolean("notify_manager", true)) {
                        d.e(this).f(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String m9 = c.m("Activity not found while launching ", pendingIntent.toString(), ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            m9 = m9.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", m9, e);
                    }
                    googleApiActivity.f2131x = 1;
                    finish();
                    return;
                } catch (IntentSender.SendIntentException e13) {
                    e = e13;
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                    return;
                }
            }
            x.g(num);
            e.f12638d.d(this, num.intValue(), this);
            this.f2131x = 1;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2131x);
        super.onSaveInstanceState(bundle);
    }
}
