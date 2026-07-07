package ed;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.media3.decoder.DecoderInputBuffer;
import o.o3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f4912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f4914y;

    public /* synthetic */ m(Object obj, Object obj2, boolean z2, int i) {
        this.f4911v = i;
        this.f4913x = obj;
        this.f4914y = obj2;
        this.f4912w = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4911v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((zc.e) this.f4913x).c((ad.e) this.f4914y, this.f4912w);
                return;
            case 1:
                o3 o3Var = (o3) this.f4913x;
                LinearLayout linearLayout = (LinearLayout) this.f4914y;
                int width = linearLayout.getWidth();
                float x10 = linearLayout.getX();
                View view = (View) o3Var.f9254w;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams.width != width) {
                    layoutParams.width = width;
                    view.setLayoutParams(layoutParams);
                }
                if (this.f4912w) {
                    view.animate().translationX(x10).setDuration(220L).setInterpolator(new DecelerateInterpolator()).start();
                    return;
                } else {
                    view.setTranslationX(x10);
                    return;
                }
            case 2:
                ((qc.j) this.f4913x).c((String) this.f4914y, this.f4912w);
                return;
            default:
                Context context = (Context) this.f4913x;
                o8.h hVar = (o8.h) this.f4914y;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = com.bumptech.glide.c.v(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f4912w) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    hVar.c(null);
                }
        }
    }

    public /* synthetic */ m(Object obj, boolean z2, Object obj2, int i) {
        this.f4911v = i;
        this.f4913x = obj;
        this.f4912w = z2;
        this.f4914y = obj2;
    }
}
