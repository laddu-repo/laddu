package y1;

import android.media.MediaCodec;
import d.m0;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import y2.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14799a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14800b;

    public c(String str) {
        this.f14799a = str.concat(".lck");
    }

    public boolean a() {
        synchronized (this) {
            if (((AtomicBoolean) this.f14800b).get()) {
                return false;
            }
            ((AtomicInteger) this.f14799a).incrementAndGet();
            return true;
        }
    }

    public o b(Object... objArr) {
        Constructor a10;
        synchronized (((AtomicBoolean) this.f14800b)) {
            if (!((AtomicBoolean) this.f14800b).get()) {
                try {
                    a10 = ((u2.i) this.f14799a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f14800b).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a10 = null;
        }
        if (a10 == null) {
            return null;
        }
        try {
            return (o) a10.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public void c() {
        String str = (String) this.f14799a;
        if (((FileChannel) this.f14800b) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.f14800b = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.f14800b;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.f14800b = null;
                throw new IllegalStateException(h8.c.m("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    public void d() {
        synchronized (this) {
            ((AtomicInteger) this.f14799a).decrementAndGet();
            if (((AtomicInteger) this.f14799a).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public c(m0 m0Var) {
        this.f14799a = new AtomicInteger(0);
        this.f14800b = new AtomicBoolean(false);
    }

    public c(long[] jArr, long[] jArr2) {
        this.f14799a = jArr;
        this.f14800b = jArr2;
    }

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14799a = cryptoInfo;
        this.f14800b = j2.e.f();
    }

    public c(u2.i iVar) {
        this.f14799a = iVar;
        this.f14800b = new AtomicBoolean(false);
    }
}
