package j6;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6974e;
    public static final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final File f6975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile w f6976h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6979c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6980d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6977a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f6974e = i < 29;
        f = i >= 28;
        f6975g = new File("/proc/self/fd");
    }

    public static w a() {
        if (f6976h == null) {
            synchronized (w.class) {
                try {
                    if (f6976h == null) {
                        f6976h = new w();
                    }
                } finally {
                }
            }
        }
        return f6976h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f6977a;
    }

    public final boolean c(int i, int i10, boolean z2, boolean z10) {
        boolean z11;
        if (z2) {
            if (f) {
                if (!f6974e || this.f6980d.get()) {
                    if (z10) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i10 >= 0) {
                        synchronized (this) {
                            try {
                                int i11 = this.f6978b + 1;
                                this.f6978b = i11;
                                if (i11 >= 50) {
                                    this.f6978b = 0;
                                    int length = f6975g.list().length;
                                    long jB = b();
                                    boolean z12 = ((long) length) < jB;
                                    this.f6979c = z12;
                                    if (!z12 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB);
                                    }
                                }
                                z11 = this.f6979c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z11) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
