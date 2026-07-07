package com.livxow.tv.services;

import ad.c;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import androidx.media3.ui.PlayerView;
import c2.j0;
import com.livxow.tv.app.App;
import fc.l;
import fc.o;
import h0.m;
import java.util.ArrayList;
import java.util.Random;
import jc.e;
import p8.k;
import pa.a;
import u2.h;
import uc.b;
import uc.g;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class FloatingPlayer extends Service {
    public static volatile FloatingPlayer F;
    public g A;
    public View B;
    public c C;
    public e D;
    public boolean E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WindowManager f3692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f3693w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f3694x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Random f3695y = new Random();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public App f3696z;

    public final void a() {
        this.A.f(this.f3696z.f3686w, this.C, this.D, false);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3693w;
            if (i >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i);
            if (view != null) {
                view.setVisibility(0);
            }
            g gVar = (g) this.f3694x.get(i);
            if (gVar != null && !gVar.f12969u && !gVar.f12970v) {
                gVar.c();
            }
            i++;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        F = this;
        App app = App.P;
        this.f3696z = app;
        app.f3688y = new a(14, this);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelA = h.a();
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelA);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        j0 j0Var;
        super.onDestroy();
        for (int i = 0; i < this.f3693w.size(); i++) {
            View view = (View) this.f3693w.get(i);
            if (view != null) {
                this.f3692v.removeView(view);
            }
            g gVar = (g) this.f3694x.get(i);
            if (gVar != null && (j0Var = gVar.f) != null) {
                j0Var.b0();
                gVar.f = null;
                gVar.f12953c = null;
                gVar.f12954d = null;
                gVar.f12955e = null;
                gVar.f12956g = null;
            }
        }
        this.f3694x.clear();
        this.f3693w.clear();
        F = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && !this.E) {
            m mVar = new m(this, "floating_player_channel");
            mVar.f6028e = m.b("Floating Player");
            mVar.f = m.b("Player is running in background");
            mVar.f6040s.icon = o.ic_launcher;
            mVar.c(2, true);
            mVar.f6031j = 0;
            startForeground(1001, mVar.a());
            this.E = true;
        }
        if (intent != null) {
            this.f3692v = (WindowManager) getSystemService("window");
            ArrayList arrayList = this.f3693w;
            int size = arrayList.size();
            int i12 = vc.a.j(getApplicationContext()).getInt("floatings", 0);
            ArrayList arrayList2 = this.f3694x;
            if (size < i12) {
                c cVarP = c.p(LayoutInflater.from(new ContextThemeWrapper(this, k.Theme_Material3_DayNight_NoActionBar)));
                PlayerView playerView = (PlayerView) cVarP.f481y;
                RelativeLayout relativeLayout = (RelativeLayout) cVarP.f479w;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams((int) TypedValue.applyDimension(1, 250, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 160, getResources().getDisplayMetrics()), i11 >= 26 ? 2038 : 2002, 8, -3);
                layoutParams.gravity = 8388659;
                Random random = this.f3695y;
                layoutParams.x = random.nextInt(400);
                layoutParams.y = random.nextInt(800);
                e eVarA = e.a(playerView.findViewById(l.player_controls));
                g gVar = new g(this.f3696z.f3686w, cVarP, eVarA, intent);
                gVar.f12952b = new uc.a(this, gVar, relativeLayout, cVarP, eVarA);
                eVarA.f7053g.setOnClickListener(new hc.a(this, gVar, relativeLayout, 4));
                b bVar = new b(this, layoutParams, relativeLayout, cVarP);
                relativeLayout.setOnTouchListener(bVar);
                playerView.setOnTouchListener(bVar);
                this.f3692v.addView(relativeLayout, layoutParams);
                arrayList.add(relativeLayout);
                arrayList2.add(gVar);
                return 1;
            }
            ((g) arrayList2.get(arrayList.size() - 1)).a(intent);
        }
        return 1;
    }
}
