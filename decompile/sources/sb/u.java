package sb;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.mb;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f11763j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0.d f11765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb f11766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f11767d;
    public final ScheduledThreadPoolExecutor f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f11770h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v.e f11768e = new v.e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11769g = false;

    public u(FirebaseMessaging firebaseMessaging, t0.d dVar, s sVar, mb mbVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f11767d = firebaseMessaging;
        this.f11765b = dVar;
        this.f11770h = sVar;
        this.f11766c = mbVar;
        this.f11764a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void b(o8.o oVar) throws IOException {
        try {
            b8.h.c(oVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e7) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e7);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void a(r rVar, o8.h hVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f11768e) {
            try {
                String str = rVar.f11753c;
                if (this.f11768e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.f11768e.get(str);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f11768e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) throws IOException {
        String strA = this.f11767d.a();
        mb mbVar = this.f11766c;
        mbVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        b(mbVar.i(mbVar.u(strA, "/topics/" + str, bundle)));
    }

    public final void d(String str) throws IOException {
        String strA = this.f11767d.a();
        mb mbVar = this.f11766c;
        mbVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        b(mbVar.i(mbVar.u(strA, "/topics/" + str, bundle)));
    }

    public final void f(r rVar) {
        synchronized (this.f11768e) {
            try {
                String str = rVar.f11753c;
                if (this.f11768e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f11768e.get(str);
                    o8.h hVar = (o8.h) arrayDeque.poll();
                    if (hVar != null) {
                        hVar.a(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f11768e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void g(boolean z2) {
        this.f11769g = z2;
    }

    public final void h() {
        boolean z2;
        if (this.f11770h.a() != null) {
            synchronized (this) {
                z2 = this.f11769g;
            }
            if (z2) {
                return;
            }
            j(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: IOException -> 0x005d, TryCatch #1 {IOException -> 0x005d, blocks: (B:15:0x0028, B:32:0x0083, B:34:0x0089, B:20:0x0039, B:22:0x0041, B:24:0x004a, B:27:0x005f, B:29:0x0067, B:31:0x0070), top: B:54:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.u.i():boolean");
    }

    public final void j(long j8) {
        this.f.schedule(new w(this, this.f11764a, this.f11765b, Math.min(Math.max(30L, 2 * j8), i)), j8, TimeUnit.SECONDS);
        g(true);
    }
}
