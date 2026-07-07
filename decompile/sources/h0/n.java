package h0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends e3.e {
    public IconCompat A;
    public boolean B;

    /* renamed from: z, reason: collision with root package name */
    public IconCompat f5784z;

    @Override // e3.e
    public final void U0(c6.h hVar) {
        Notification.Builder builder = (Notification.Builder) hVar.f1982y;
        Context context = (Context) hVar.f1981x;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f5784z;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                m.a(bigContentTitle, iconCompat.g(context));
            } else if (iconCompat.e() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f5784z.c());
            }
        }
        if (this.B) {
            IconCompat iconCompat2 = this.A;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else if (Build.VERSION.SDK_INT >= 23) {
                l.a(bigContentTitle, iconCompat2.g(context));
            } else if (iconCompat2.e() == 1) {
                bigContentTitle.bigLargeIcon(this.A.c());
            } else {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            m.c(bigContentTitle, false);
            m.b(bigContentTitle, null);
        }
    }

    @Override // e3.e
    public final String V0() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
