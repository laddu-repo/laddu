package ic;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public final ThreadPoolExecutor A = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b9.a("firebase-iid-executor"));

    /* renamed from: x, reason: collision with root package name */
    public final long f6791x;

    /* renamed from: y, reason: collision with root package name */
    public final PowerManager.WakeLock f6792y;

    /* renamed from: z, reason: collision with root package name */
    public final FirebaseMessaging f6793z;

    public v(FirebaseMessaging firebaseMessaging, long j) {
        this.f6793z = firebaseMessaging;
        this.f6791x = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f2843b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6792y = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f6793z.f2843b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        try {
            if (this.f6793z.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e10;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f6792y;
        s k8 = s.k();
        FirebaseMessaging firebaseMessaging = this.f6793z;
        if (k8.r(firebaseMessaging.f2843b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.j = true;
                }
                if (!firebaseMessaging.f2850i.e()) {
                    firebaseMessaging.f(false);
                    if (s.k().r(firebaseMessaging.f2843b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (s.k().q(firebaseMessaging.f2843b) && !a()) {
                    u uVar = new u();
                    uVar.f6790c = this;
                    uVar.a();
                    if (s.k().r(firebaseMessaging.f2843b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    firebaseMessaging.f(false);
                } else {
                    firebaseMessaging.h(this.f6791x);
                }
                if (s.k().r(firebaseMessaging.f2843b)) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.f(false);
                if (s.k().r(firebaseMessaging.f2843b)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (s.k().r(firebaseMessaging.f2843b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
