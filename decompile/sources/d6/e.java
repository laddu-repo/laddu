package d6;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import y5.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3830x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3831y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3832z;

    public /* synthetic */ e(Object obj, Object obj2, int i6, int i10) {
        this.f3830x = i10;
        this.f3832z = obj;
        this.A = obj2;
        this.f3831y = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3830x) {
            case 0:
                ((SystemForegroundService) this.A).B.notify(this.f3831y, (Notification) this.f3832z);
                return;
            case 1:
                String[] strArr = (String[]) this.f3832z;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) this.A;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    iArr[i6] = packageManager.checkPermission(strArr[i6], packageName);
                }
                ((h0.b) activity).onRequestPermissionsResult(this.f3831y, strArr, iArr);
                return;
            case 2:
                ((TextView) this.f3832z).setTypeface((Typeface) this.A, this.f3831y);
                return;
            case 3:
                ((g) this.f3832z).a(this.f3831y, (Intent) this.A);
                return;
            default:
                ((BottomSheetBehavior) this.A).F((View) this.f3832z, this.f3831y, false);
                return;
        }
    }

    public e(SystemForegroundService systemForegroundService, int i6, Notification notification) {
        this.f3830x = 0;
        this.A = systemForegroundService;
        this.f3831y = i6;
        this.f3832z = notification;
    }

    public e(BottomSheetBehavior bottomSheetBehavior, View view, int i6) {
        this.f3830x = 4;
        this.A = bottomSheetBehavior;
        this.f3832z = view;
        this.f3831y = i6;
    }
}
