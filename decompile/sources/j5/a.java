package j5;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f7225e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7226a;

    /* renamed from: b, reason: collision with root package name */
    public final File f7227b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f7228c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f7229d;

    public a(String str, File file, boolean z10) {
        File file2;
        Lock lock;
        this.f7226a = z10;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f7227b = file2;
        HashMap hashMap = f7225e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7228c = lock;
    }

    public final void a(boolean z10) {
        this.f7228c.lock();
        if (z10) {
            File file = this.f7227b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.f7229d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e10) {
                this.f7229d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f7229d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f7228c.unlock();
    }
}
