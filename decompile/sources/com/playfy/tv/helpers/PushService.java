package com.playfy.tv.helpers;

import a8.b;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.c;
import bg.y;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.playfy.tv.R;
import com.playfy.tv.activities.SplashActivity;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import e3.e;
import gf.f0;
import gf.o0;
import h0.p;
import h0.q;
import ic.r;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import okhttp3.HttpUrl;
import v.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"MissingFirebaseInstanceTokenRefresh"})
/* loaded from: classes.dex */
public final class PushService extends FirebaseMessagingService {
    /* JADX WARN: Type inference failed for: r0v12, types: [h0.o, e3.e] */
    /* JADX WARN: Type inference failed for: r0v14, types: [h0.o, e3.e] */
    /* JADX WARN: Type inference failed for: r0v15, types: [h0.n, e3.e] */
    /* JADX WARN: Type inference failed for: r2v18, types: [v.l, v.e] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(r rVar) {
        int i6;
        int i10;
        Intent intent;
        PendingIntent activity;
        q qVar;
        String str;
        e eVar;
        String id2;
        if (rVar.f6780y == null) {
            Bundle bundle = rVar.f6779x;
            ?? lVar = new l(0);
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (!str2.startsWith("google.") && !str2.startsWith("gcm.") && !str2.equals("from") && !str2.equals("message_type") && !str2.equals("collapse_key")) {
                        lVar.put(str2, str3);
                    }
                }
            }
            rVar.f6780y = lVar;
        }
        v.e eVar2 = rVar.f6780y;
        k.d(eVar2, "getData(...)");
        String str4 = (String) eVar2.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        if (str4 != null) {
            i6 = Integer.parseInt(str4);
        } else {
            i6 = 0;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) b.f(this).a(x.a(SharedPreferences.class), null);
        if (i6 == 2) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("remote_config", true);
            edit.apply();
            return;
        }
        int i11 = sharedPreferences.getInt("notId", 0);
        if (i11 < 500000) {
            i10 = i11 + 1;
        } else {
            i10 = 0;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putInt("notId", i10);
        edit2.apply();
        String str5 = (String) eVar2.get("query");
        if (i6 == 1) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str5));
        } else {
            intent = new Intent(this, (Class<?>) SplashActivity.class);
        }
        intent.addFlags(67108864);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        } else {
            activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
        }
        Object systemService = getSystemService("notification");
        k.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (i12 >= 26) {
            y.p();
            NotificationChannel f3 = y.f(getResources().getString(R.string.app_name));
            notificationManager.createNotificationChannel(f3);
            Context applicationContext = getApplicationContext();
            id2 = f3.getId();
            qVar = new q(applicationContext, id2);
        } else {
            qVar = new q(getApplicationContext(), null);
        }
        q qVar2 = qVar;
        String str6 = (String) eVar2.get("title");
        if (str6 == null) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str7 = (String) eVar2.get("body");
        if (str7 == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = str7;
        }
        Notification notification = qVar2.f5803t;
        notification.icon = R.drawable.ic_stat_notification;
        qVar2.f5790e = q.b(str6);
        qVar2.f5791f = q.b(str);
        qVar2.c(true);
        notification.sound = defaultUri;
        notification.audioStreamType = -1;
        notification.audioAttributes = p.a(p.d(p.c(p.b(), 4), 5));
        qVar2.f5792g = activity;
        String str8 = (String) eVar2.get("image");
        if (str8 != null && str8.length() != 0) {
            Bitmap bitmap = (Bitmap) f0.B(o0.f5694b, new c(this, str8, null, 6, false));
            if (bitmap != null) {
                ?? eVar3 = new e(1);
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f860b = bitmap;
                eVar3.f5784z = iconCompat;
                eVar = eVar3;
            } else {
                ?? eVar4 = new e(1);
                eVar4.f5785z = q.b(str);
                eVar = eVar4;
            }
        } else {
            ?? eVar5 = new e(1);
            eVar5.f5785z = q.b(str);
            eVar = eVar5;
        }
        qVar2.e(eVar);
        notificationManager.notify(i10, qVar2.a());
    }
}
