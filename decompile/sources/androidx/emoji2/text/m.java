package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f911j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile m f912k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.f f914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f917e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oa.b f918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f919h;
    public final e i;

    public m(x xVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f913a = reentrantReadWriteLock;
        this.f915c = 3;
        l lVar = (l) xVar.f906b;
        this.f = lVar;
        int i = xVar.f905a;
        this.f919h = i;
        this.i = (e) xVar.f907c;
        this.f916d = new Handler(Looper.getMainLooper());
        this.f914b = new v.f(0);
        this.f918g = new oa.b(2);
        g gVar = new g(this);
        this.f917e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f915c = 0;
            } catch (Throwable th) {
                this.f913a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                lVar.a(new f(gVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static m a() {
        m mVar;
        synchronized (f911j) {
            try {
                mVar = f912k;
                if (!(mVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return mVar;
    }

    public final int b() {
        this.f913a.readLock().lock();
        try {
            return this.f915c;
        } finally {
            this.f913a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f919h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f913a.writeLock().lock();
        try {
            if (this.f915c == 0) {
                return;
            }
            this.f915c = 0;
            this.f913a.writeLock().unlock();
            g gVar = this.f917e;
            m mVar = (m) gVar.f904c;
            try {
                mVar.f.a(new f(gVar));
            } catch (Throwable th) {
                mVar.d(th);
            }
        } finally {
            this.f913a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f913a.writeLock().lock();
        try {
            this.f915c = 2;
            arrayList.addAll(this.f914b);
            this.f914b.clear();
            this.f913a.writeLock().unlock();
            this.f916d.post(new k(arrayList, this.f915c, th));
        } catch (Throwable th2) {
            this.f913a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4 A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #1 {all -> 0x00fb, blocks: (B:59:0x00c4, B:62:0x00cc, B:65:0x00d4, B:44:0x0088), top: B:96:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.m.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(j jVar) {
        u1.c.g(jVar, "initCallback cannot be null");
        this.f913a.writeLock().lock();
        try {
            if (this.f915c == 1 || this.f915c == 2) {
                this.f916d.post(new k(Arrays.asList(jVar), this.f915c, (Throwable) null));
            } else {
                this.f914b.add(jVar);
            }
            this.f913a.writeLock().unlock();
        } catch (Throwable th) {
            this.f913a.writeLock().unlock();
            throw th;
        }
    }
}
