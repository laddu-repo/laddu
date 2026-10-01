package d6;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v6.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a {
    public static final Bitmap.Config E = Bitmap.Config.ARGB_8888;
    public int A;
    public int B;
    public int C;
    public int D;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f4349v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f4350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final oa.b f4351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f4352y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4353z;

    public g(long j8) {
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f4352y = j8;
        this.f4349v = kVar;
        this.f4350w = setUnmodifiableSet;
        this.f4351x = new oa.b(10);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.A + ", misses=" + this.B + ", puts=" + this.C + ", evictions=" + this.D + ", currentSize=" + this.f4353z + ", maxSize=" + this.f4352y + "\nStrategy=" + this.f4349v);
    }

    public final synchronized Bitmap b(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f4349v.b(i, i10, config != null ? config : E);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.f4349v.getClass();
                    sb2.append(k.c(m.d(config) * i * i10, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.B++;
            } else {
                this.A++;
                long j8 = this.f4353z;
                this.f4349v.getClass();
                this.f4353z = j8 - ((long) m.c(bitmapB));
                this.f4351x.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.f4349v.getClass();
                sb3.append(k.c(m.d(config) * i * i10, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void c(long j8) {
        while (this.f4353z > j8) {
            try {
                k kVar = this.f4349v;
                Bitmap bitmap = (Bitmap) kVar.f4363b.e0();
                if (bitmap != null) {
                    kVar.a(Integer.valueOf(m.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f4353z = 0L;
                    return;
                }
                this.f4351x.getClass();
                long j9 = this.f4353z;
                this.f4349v.getClass();
                this.f4353z = j9 - ((long) m.c(bitmap));
                this.D++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.f4349v.getClass();
                    sb2.append(k.c(m.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d6.a
    public final Bitmap d(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i10, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = E;
        }
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // d6.a
    public final Bitmap e(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i10, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = E;
        }
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // d6.a
    public final synchronized void f(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f4349v.getClass();
                if (m.c(bitmap) <= this.f4352y && this.f4350w.contains(bitmap.getConfig())) {
                    this.f4349v.getClass();
                    int iC = m.c(bitmap);
                    this.f4349v.e(bitmap);
                    this.f4351x.getClass();
                    this.C++;
                    this.f4353z += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                        this.f4349v.getClass();
                        sb2.append(k.c(m.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    c(this.f4352y);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f4349v.getClass();
                sb3.append(k.c(m.c(bitmap), bitmap.getConfig()));
                sb3.append(", is mutable: ");
                sb3.append(bitmap.isMutable());
                sb3.append(", is allowed config: ");
                sb3.append(this.f4350w.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb3.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // d6.a
    public final void h(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            i();
        } else if (i >= 20 || i == 15) {
            c(this.f4352y / 2);
        }
    }

    @Override // d6.a
    public final void i() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        c(0L);
    }
}
