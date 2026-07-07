package d1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends de.j implements ce.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w0 f3941x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(w0 w0Var, int i) {
        super(0);
        this.f3940w = i;
        this.f3941x = w0Var;
    }

    @Override // ce.a
    public final Object b() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f3940w) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                System.loadLibrary("datastore_shared_counter");
                w0 w0Var = this.f3941x;
                File file = new File(w0Var.f3953b.getAbsolutePath() + w0Var.f3956e);
                w0.f(w0Var, file);
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 939524096);
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptorOpen = null;
                }
                try {
                    int fd2 = parcelFileDescriptorOpen.getFd();
                    NativeSharedCounter nativeSharedCounter = d1.f3860b;
                    if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    d1 d1Var = new d1(jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return d1Var;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            default:
                w0 w0Var2 = this.f3941x;
                File file2 = new File(w0Var2.f3953b.getAbsolutePath() + w0Var2.f3955d);
                w0.f(w0Var2, file2);
                return file2;
        }
    }
}
