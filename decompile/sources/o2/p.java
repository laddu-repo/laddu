package o2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements t7.d {
    public Object A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f9503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f9504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f9505y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f9506z;

    public p(fa.g gVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f9504x = new Object();
        this.f9505y = new o8.h();
        this.f9502v = false;
        this.A = new o8.h();
        gVar.a();
        Context context = gVar.f5336a;
        this.f9503w = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f9502v = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e7);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f9502v = false;
                boolValueOf = null;
            } else {
                this.f9502v = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f9506z = boolValueOf;
        synchronized (this.f9504x) {
            try {
                if (b()) {
                    ((o8.h) this.f9505y).c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t7.d
    public void a(q7.b bVar) {
        ((s7.d) this.A).H.post(new o8.m(7, this, bVar));
    }

    public synchronized boolean b() {
        boolean zH;
        Boolean bool = (Boolean) this.f9506z;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = ((fa.g) this.f9503w).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        d(zH);
        return zH;
    }

    public x9.m c(int i) {
        x9.m pVar;
        x9.m mVar;
        HashMap map = (HashMap) this.f9504x;
        x9.m mVar2 = (x9.m) map.get(Integer.valueOf(i));
        if (mVar2 != null) {
            return mVar2;
        }
        final p2.c cVar = (p2.c) this.f9506z;
        cVar.getClass();
        if (i != 0) {
            final int i10 = 1;
            if (i != 1) {
                final int i11 = 2;
                if (i != 2) {
                    final int i12 = 3;
                    if (i == 3) {
                        pVar = new c2.p(5, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(c0.class));
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(d0.d.h(i, "Unrecognized contentType: "));
                        }
                        pVar = new x9.m() { // from class: o2.o
                            @Override // x9.m
                            public final Object get() {
                                switch (i12) {
                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                        return q.e((Class) this, cVar);
                                    case 1:
                                        return q.e((Class) this, cVar);
                                    case 2:
                                        return q.e((Class) this, cVar);
                                    default:
                                        return new w0(cVar, (w2.m) ((p) this).f9503w);
                                }
                            }
                        };
                    }
                } else {
                    final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(c0.class);
                    mVar = new x9.m() { // from class: o2.o
                        @Override // x9.m
                        public final Object get() {
                            switch (i11) {
                                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                    return q.e((Class) clsAsSubclass, cVar);
                                case 1:
                                    return q.e((Class) clsAsSubclass, cVar);
                                case 2:
                                    return q.e((Class) clsAsSubclass, cVar);
                                default:
                                    return new w0(cVar, (w2.m) ((p) clsAsSubclass).f9503w);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(c0.class);
                mVar = new x9.m() { // from class: o2.o
                    @Override // x9.m
                    public final Object get() {
                        switch (i10) {
                            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                return q.e((Class) genericDeclarationAsSubclass, cVar);
                            case 1:
                                return q.e((Class) genericDeclarationAsSubclass, cVar);
                            case 2:
                                return q.e((Class) genericDeclarationAsSubclass, cVar);
                            default:
                                return new w0(cVar, (w2.m) ((p) genericDeclarationAsSubclass).f9503w);
                        }
                    }
                };
            }
            pVar = mVar;
        } else {
            final Class clsAsSubclass2 = DashMediaSource$Factory.class.asSubclass(c0.class);
            final int i13 = 0;
            pVar = new x9.m() { // from class: o2.o
                @Override // x9.m
                public final Object get() {
                    switch (i13) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            return q.e((Class) clsAsSubclass2, cVar);
                        case 1:
                            return q.e((Class) clsAsSubclass2, cVar);
                        case 2:
                            return q.e((Class) clsAsSubclass2, cVar);
                        default:
                            return new w0(cVar, (w2.m) ((p) clsAsSubclass2).f9503w);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i), pVar);
        return pVar;
    }

    public void d(boolean z2) {
        String str = "Crashlytics automatic data collection " + (z2 ? "ENABLED" : "DISABLED") + " by " + (((Boolean) this.f9506z) == null ? "global Firebase setting" : this.f9502v ? "firebase_crashlytics_collection_enabled manifest flag" : "API") + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void e(q7.b bVar) {
        s7.j jVar = (s7.j) ((s7.d) this.A).E.get((s7.a) this.f9504x);
        if (jVar != null) {
            jVar.n(bVar);
        }
    }

    public p(UUID uuid) {
        this();
        this.f9503w = uuid;
    }

    public p() {
        this.f9505y = y9.e1.B;
        this.f9502v = true;
        y9.c0 c0Var = y9.f0.f14553w;
        this.f9506z = y9.z0.f14637z;
    }
}
