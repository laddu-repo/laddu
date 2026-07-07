package com.livxow.tv.firebase;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c3.e;
import com.bumptech.glide.b;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.livxow.tv.activities.PlayerActivity;
import com.livxow.tv.activities.SplashActivity;
import fa.g;
import fc.q;
import h0.j;
import h0.k;
import h0.l;
import h0.m;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import k8.k4;
import kb.h;
import ma.p;
import o8.i;
import sb.o;
import v6.f;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class PushService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(o oVar) {
        Intent intent;
        m mVar;
        e eVar;
        if (oVar.f11740w == null) {
            Bundle bundle = oVar.f11739v;
            v.e eVar2 = new v.e(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar2.put(str, str2);
                    }
                }
            }
            oVar.f11740w = eVar2;
        }
        HashMap map = new HashMap(oVar.f11740w);
        String str3 = (String) map.get("app");
        if (TextUtils.isEmpty(str3)) {
            str3 = "livxow";
        }
        if (str3.equalsIgnoreCase("livxow") || str3.equalsIgnoreCase("all")) {
            try {
                String str4 = (String) map.get("activity");
                if ("Player".equals(str4)) {
                    intent = new Intent(this, (Class<?>) PlayerActivity.class);
                    String str5 = (String) map.get("path");
                    if (TextUtils.isEmpty(str5)) {
                        str5 = "pro";
                    }
                    intent.putExtra("links", str5);
                    intent.putExtra("fromSplash", false);
                } else {
                    intent = "openUrl".equals(str4) ? new Intent("android.intent.action.VIEW", Uri.parse((String) map.get("url"))) : new Intent(this, (Class<?>) SplashActivity.class);
                }
            } catch (Exception unused) {
                intent = new Intent(this, (Class<?>) SplashActivity.class);
            }
            int i = getSharedPreferences("DataPreferences", 0).getInt("NOTIFICATION_ID", 0) + 1;
            getSharedPreferences("DataPreferences", 0).edit().putInt("NOTIFICATION_ID", i).apply();
            intent.addFlags(67108864);
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            Bitmap bitmap = null;
            if (Build.VERSION.SDK_INT >= 26) {
                h.q();
                NotificationChannel notificationChannelE = h.e(getString(q.app_name).toLowerCase().replace(" ", "-") + "-channel", getString(q.app_name));
                notificationManager.createNotificationChannel(notificationChannelE);
                mVar = new m(getApplicationContext(), notificationChannelE.getId());
            } else {
                mVar = new m(getApplicationContext(), null);
            }
            String str6 = (String) map.get("body");
            if (TextUtils.isEmpty(str6)) {
                str6 = "";
            }
            int i10 = fc.o.ic_launcher;
            Notification notification = mVar.f6040s;
            notification.icon = i10;
            mVar.f6028e = m.b((CharSequence) map.get("title"));
            mVar.f = m.b(str6);
            mVar.c(16, true);
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = l.a(l.d(l.c(l.b(), 4), 5));
            mVar.f6029g = activity;
            String str7 = (String) map.get("imgUrl");
            if (str7 == null || str7.isEmpty()) {
                k kVar = new k(2, false);
                kVar.f6023x = m.b(str6);
                eVar = kVar;
            } else {
                try {
                    com.bumptech.glide.o oVarB = b.b(this).b(this);
                    oVarB.getClass();
                    com.bumptech.glide.m mVarY = new com.bumptech.glide.m(oVarB.f2443v, oVarB, Bitmap.class, oVarB.f2444w).a(com.bumptech.glide.o.F).y(str7);
                    r6.e eVar3 = new r6.e();
                    mVarY.w(eVar3, eVar3, mVarY, f.f13222b);
                    bitmap = (Bitmap) eVar3.get();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                if (bitmap != null) {
                    j jVar = new j(2, false);
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.f722b = bitmap;
                    jVar.f6020x = iconCompat;
                    eVar = jVar;
                } else {
                    k kVar2 = new k(2, false);
                    kVar2.f6023x = m.b(str6);
                    eVar = kVar2;
                }
            }
            mVar.e(eVar);
            notificationManager.notify(i, mVar.a());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d() {
        FirebaseMessaging firebaseMessaging;
        k4 k4Var = FirebaseMessaging.f3610l;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(g.c());
        }
        o8.o oVar = firebaseMessaging.f3619h;
        p pVar = new p(14);
        oVar.getClass();
        oVar.f9983b.h(new o8.l(i.f9964a, pVar, new o8.o()));
        oVar.q();
    }
}
