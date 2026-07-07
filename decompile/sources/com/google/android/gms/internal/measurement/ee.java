package com.google.android.gms.internal.measurement;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ee implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2611v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f2612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f2613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f2614y;

    public ee(fe feVar, zd zdVar, da.v0 v0Var, long j8) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f2613x = zdVar;
        this.f2614y = v0Var;
        this.f2612w = j8;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f2614y).f3614b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f2614y).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            String message = e7.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2611v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((zd) this.f2613x).run();
                long j8 = this.f2612w;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                da.z0 z0Var = (da.z0) ((da.v0) this.f2614y);
                z0Var.getClass();
                da.d1 d1Var = new da.d1(Executors.callable(this, null));
                da.x0 x0Var = new da.x0(d1Var, z0Var.f4465w.schedule(d1Var, j8, timeUnit));
                x0Var.f(new zd(1, x0Var), da.f0.f4407v);
                return;
            case 1:
                k8.f3 f3Var = (k8.f3) this.f2614y;
                f3Var.M((k8.c3) this.f2613x, false, this.f2612w);
                f3Var.A = null;
                k8.p3 p3VarO = ((k8.p1) f3Var.f2053w).o();
                p3VarO.D();
                p3VarO.E();
                p3VarO.R(new da.m0(p3VarO, (k8.c3) null));
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f2613x;
                sb.p pVarS = sb.p.s();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2614y;
                if (pVarS.v(firebaseMessaging.f3614b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f3620j = true;
                        }
                        if (!firebaseMessaging.i.g()) {
                            firebaseMessaging.f(false);
                            if (!sb.p.s().v(firebaseMessaging.f3614b)) {
                                return;
                            }
                        } else if (!sb.p.s().u(firebaseMessaging.f3614b) || a()) {
                            if (b()) {
                                firebaseMessaging.f(false);
                            } else {
                                firebaseMessaging.h(this.f2612w);
                            }
                            if (!sb.p.s().v(firebaseMessaging.f3614b)) {
                                return;
                            }
                        } else {
                            s7.m mVar = new s7.m();
                            mVar.f11534c = this;
                            mVar.a();
                            if (!sb.p.s().v(firebaseMessaging.f3614b)) {
                                return;
                            }
                        }
                    } catch (IOException e7) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.f(false);
                        if (!sb.p.s().v(firebaseMessaging.f3614b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (sb.p.s().v(firebaseMessaging.f3614b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public ee(k8.f3 f3Var, k8.c3 c3Var, long j8) {
        this.f2613x = c3Var;
        this.f2612w = j8;
        Objects.requireNonNull(f3Var);
        this.f2614y = f3Var;
    }

    public ee(FirebaseMessaging firebaseMessaging, long j8) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new y7.a("firebase-iid-executor"));
        this.f2614y = firebaseMessaging;
        this.f2612w = j8;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f3614b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f2613x = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
