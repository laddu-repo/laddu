package d6;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ SystemForegroundService A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3827x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Notification f3828y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3829z;

    public d(SystemForegroundService systemForegroundService, int i6, Notification notification, int i10) {
        this.A = systemForegroundService;
        this.f3827x = i6;
        this.f3828y = notification;
        this.f3829z = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = Build.VERSION.SDK_INT;
        Notification notification = this.f3828y;
        int i10 = this.f3827x;
        SystemForegroundService systemForegroundService = this.A;
        if (i6 >= 29) {
            systemForegroundService.startForeground(i10, notification, this.f3829z);
        } else {
            systemForegroundService.startForeground(i10, notification);
        }
    }
}
