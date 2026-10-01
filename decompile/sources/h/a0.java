package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.fragment.app.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5833c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f5834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5835e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, a7.j jVar) {
        super(d0Var);
        this.f5834d = d0Var;
        this.f5835e = jVar;
    }

    @Override // androidx.fragment.app.h
    public final IntentFilter e() {
        switch (this.f5833c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
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

    @Override // androidx.fragment.app.h
    public final int f() {
        Location location;
        boolean z2;
        long j8;
        switch (this.f5833c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return u.a((PowerManager) this.f5835e) ? 2 : 1;
            default:
                a7.j jVar = (a7.j) this.f5835e;
                m0 m0Var = (m0) jVar.f204y;
                LocationManager locationManager = (LocationManager) jVar.f203x;
                if (m0Var.f5950b <= System.currentTimeMillis()) {
                    Context context = (Context) jVar.f202w;
                    Location lastKnownLocation = null;
                    if (i0.d.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (i0.d.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (l0.f5944e == null) {
                            l0.f5944e = new l0();
                        }
                        l0 l0Var = l0.f5944e;
                        l0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        l0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z2 = l0Var.f5946b == 1;
                        long j9 = l0Var.f5948d;
                        long j10 = l0Var.f5947c;
                        l0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j11 = l0Var.f5948d;
                        if (j9 == -1 || j10 == -1) {
                            j8 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j10) {
                                j9 = j11;
                            } else if (jCurrentTimeMillis > j9) {
                                j9 = j10;
                            }
                            j8 = j9 + 60000;
                        }
                        m0Var.f5949a = z2;
                        m0Var.f5950b = j8;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z2 = true;
                        }
                    }
                    break;
                } else {
                    z2 = m0Var.f5949a;
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.h
    public final void m() throws IllegalAccessException {
        switch (this.f5833c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f5834d.m(true, true);
                break;
            default:
                this.f5834d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, Context context) {
        super(d0Var);
        this.f5834d = d0Var;
        this.f5835e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
