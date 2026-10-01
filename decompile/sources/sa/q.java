package sa;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2.p f11656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.d f11657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p2.c f11659e;
    public p2.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f11660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f11661h;
    public final ya.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final oa.a f11662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final oa.a f11663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f11664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pa.b f11665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ka.c f11666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ta.c f11667o;

    public q(fa.g gVar, v vVar, pa.b bVar, o2.p pVar, oa.a aVar, oa.a aVar2, ya.c cVar, i iVar, ka.c cVar2, ta.c cVar3) {
        this.f11656b = pVar;
        gVar.a();
        this.f11655a = gVar.f5336a;
        this.f11661h = vVar;
        this.f11665m = bVar;
        this.f11662j = aVar;
        this.f11663k = aVar2;
        this.i = cVar;
        this.f11664l = iVar;
        this.f11666n = cVar2;
        this.f11667o = cVar3;
        this.f11658d = System.currentTimeMillis();
        this.f11657c = new ob.d(11);
    }

    public final void a(ab.f fVar) {
        ta.c.a();
        ta.c.a();
        this.f11659e.b();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f11662j.w(new n(this));
                this.f11660g.f();
                if (!fVar.d().f292b.f287a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f11660g.d(fVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f11660g.g(((o8.h) ((AtomicReference) fVar.i).get()).f9963a);
                c();
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e7);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(ab.f fVar) {
        Future<?> futureSubmit = this.f11667o.f12520a.f12517v.submit(new m(this, fVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e7);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        ta.c.a();
        try {
            p2.c cVar = this.f11659e;
            ya.c cVar2 = (ya.c) cVar.f10197x;
            String str = (String) cVar.f10196w;
            cVar2.getClass();
            if (new File((File) cVar2.f14650x, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e7) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
        }
    }
}
