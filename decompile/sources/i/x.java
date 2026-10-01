package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.lifecycle.j1;
import java.util.Calendar;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends y {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6265c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f6266d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, j1 j1Var) {
        super(b0Var);
        this.f6266d = b0Var;
        this.f6267e = j1Var;
    }

    @Override // i.y
    public final IntentFilter e() {
        switch (this.f6265c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, i.i0] */
    @Override // i.y
    public final int f() {
        Location location;
        boolean z10;
        long j;
        Location location2;
        switch (this.f6265c) {
            case 0:
                if (t.a((PowerManager) this.f6267e)) {
                    return 2;
                }
                return 1;
            default:
                j1 j1Var = (j1) this.f6267e;
                j0 j0Var = (j0) j1Var.A;
                LocationManager locationManager = (LocationManager) j1Var.f950z;
                if (j0Var.f6221b > System.currentTimeMillis()) {
                    z10 = j0Var.f6220a;
                } else {
                    Context context = (Context) j1Var.f949y;
                    Location location3 = null;
                    if (i0.f.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (i0.f.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z10 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (i0.f6213d == null) {
                            i0.f6213d = new Object();
                        }
                        i0 i0Var = i0.f6213d;
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (i0Var.f6216c == 1) {
                            z10 = true;
                        }
                        long j10 = i0Var.f6215b;
                        long j11 = i0Var.f6214a;
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j12 = i0Var.f6215b;
                        if (j10 != -1 && j11 != -1) {
                            if (currentTimeMillis > j11) {
                                j10 = j12;
                            } else if (currentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j = j10 + 60000;
                        } else {
                            j = currentTimeMillis + 43200000;
                        }
                        j0Var.f6220a = z10;
                        j0Var.f6221b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i6 = Calendar.getInstance().get(11);
                        if (i6 < 6 || i6 >= 22) {
                            z10 = true;
                        }
                    }
                }
                if (!z10) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // i.y
    public final void j() {
        switch (this.f6265c) {
            case 0:
                this.f6266d.k(true, true);
                return;
            default:
                this.f6266d.k(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, Context context) {
        super(b0Var);
        this.f6266d = b0Var;
        this.f6267e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
