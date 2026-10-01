package r8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import t8.f;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public t8.a f11872a;

    /* renamed from: b, reason: collision with root package name */
    public f9.d f11873b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11874c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11875d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public d f11876e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f11877f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11878g;

    public b(Context context) {
        x.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f11877f = applicationContext != null ? applicationContext : context;
        this.f11874c = false;
        this.f11878g = -1L;
    }

    public static a a(Context context) {
        b bVar = new b(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bVar.c();
            a e10 = bVar.e();
            d(e10, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e10;
        } finally {
        }
    }

    public static void d(a aVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            hashMap.put("app_context", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            if (aVar != null) {
                if (true != aVar.f11871c) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = aVar.f11870b;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new c(hashMap).start();
        }
    }

    public final void b() {
        x.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f11877f != null && this.f11872a != null) {
                    try {
                        if (this.f11874c) {
                            z8.a.b().c(this.f11877f, this.f11872a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.f11874c = false;
                    this.f11873b = null;
                    this.f11872a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        f9.d bVar;
        x.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f11874c) {
                    b();
                }
                Context context = this.f11877f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b10 = f.f12640b.b(context, 12451000);
                    if (b10 != 0 && b10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    t8.a aVar = new t8.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (z8.a.b().a(context, intent, aVar, 1)) {
                            this.f11872a = aVar;
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder a10 = aVar.a();
                                int i6 = f9.c.f5152e;
                                IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                if (queryLocalInterface instanceof f9.d) {
                                    bVar = (f9.d) queryLocalInterface;
                                } else {
                                    bVar = new f9.b(a10);
                                }
                                this.f11873b = bVar;
                                this.f11874c = true;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a e() {
        a aVar;
        x.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f11874c) {
                    synchronized (this.f11875d) {
                        d dVar = this.f11876e;
                        if (dVar == null || !dVar.A) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f11874c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                x.g(this.f11872a);
                x.g(this.f11873b);
                try {
                    f9.b bVar = (f9.b) this.f11873b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z10 = true;
                    Parcel a10 = bVar.a(obtain, 1);
                    String readString = a10.readString();
                    a10.recycle();
                    f9.b bVar2 = (f9.b) this.f11873b;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i6 = f9.a.f5150a;
                    obtain2.writeInt(1);
                    Parcel a11 = bVar2.a(obtain2, 2);
                    if (a11.readInt() == 0) {
                        z10 = false;
                    }
                    a11.recycle();
                    aVar = new a(readString, z10, 0);
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return aVar;
    }

    public final void f() {
        synchronized (this.f11875d) {
            d dVar = this.f11876e;
            if (dVar != null) {
                dVar.f11883z.countDown();
                try {
                    this.f11876e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f11878g;
            if (j > 0) {
                this.f11876e = new d(this, j);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
