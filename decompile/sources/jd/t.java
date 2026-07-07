package jd;

import java.io.File;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends InputStream {

    /* renamed from: x, reason: collision with root package name */
    public final CipherInputStream f7408x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ File f7409y;

    public t(s sVar, Cipher cipher, File file) {
        this.f7409y = file;
        this.f7408x = new CipherInputStream(new r(sVar), cipher);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f7408x.close();
        } catch (Throwable th) {
            he.a.b(th);
        }
        this.f7409y.delete();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f7408x.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] b10, int i6, int i10) {
        kotlin.jvm.internal.k.e(b10, "b");
        return this.f7408x.read(b10, i6, i10);
    }
}
