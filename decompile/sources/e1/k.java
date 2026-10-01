package e1;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.j5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile k f4160k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f4161a;

    /* renamed from: b, reason: collision with root package name */
    public final v.f f4162b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f4163c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4164d;

    /* renamed from: e, reason: collision with root package name */
    public final f f4165e;

    /* renamed from: f, reason: collision with root package name */
    public final j f4166f;

    /* renamed from: g, reason: collision with root package name */
    public final ua.f f4167g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4168h;

    /* renamed from: i, reason: collision with root package name */
    public final d f4169i;

    public k(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4161a = reentrantReadWriteLock;
        this.f4163c = 3;
        j jVar = (j) sVar.f4158b;
        this.f4166f = jVar;
        int i6 = sVar.f4157a;
        this.f4168h = i6;
        this.f4169i = (d) sVar.f4159c;
        this.f4164d = new Handler(Looper.getMainLooper());
        this.f4162b = new v.f(0);
        this.f4167g = new ua.f(8);
        f fVar = new f(this);
        this.f4165e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i6 == 0) {
            try {
                this.f4163c = 0;
            } catch (Throwable th) {
                this.f4161a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        boolean z10;
        synchronized (j) {
            try {
                kVar = f4160k;
                if (kVar != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public final int b() {
        this.f4161a.readLock().lock();
        try {
            return this.f4163c;
        } finally {
            this.f4161a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f4168h == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b() == 1) {
                return;
            }
            this.f4161a.writeLock().lock();
            try {
                if (this.f4163c == 0) {
                    return;
                }
                this.f4163c = 0;
                this.f4161a.writeLock().unlock();
                f fVar = this.f4165e;
                k kVar = fVar.f4154a;
                try {
                    kVar.f4166f.a(new e(fVar));
                    return;
                } catch (Throwable th) {
                    kVar.d(th);
                    return;
                }
            } finally {
                this.f4161a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4161a.writeLock().lock();
        try {
            this.f4163c = 2;
            arrayList.addAll(this.f4162b);
            this.f4162b.clear();
            this.f4161a.writeLock().unlock();
            this.f4164d.post(new com.google.android.material.datepicker.g(arrayList, this.f4163c, th));
        } catch (Throwable th2) {
            this.f4161a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [e1.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.k.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(i iVar) {
        j5.e(iVar, "initCallback cannot be null");
        this.f4161a.writeLock().lock();
        try {
            if (this.f4163c != 1 && this.f4163c != 2) {
                this.f4162b.add(iVar);
                this.f4161a.writeLock().unlock();
            }
            this.f4164d.post(new com.google.android.material.datepicker.g(Arrays.asList(iVar), this.f4163c, (Throwable) null));
            this.f4161a.writeLock().unlock();
        } catch (Throwable th) {
            this.f4161a.writeLock().unlock();
            throw th;
        }
    }
}
