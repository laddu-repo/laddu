package y1;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c {
    public Uri A;
    public long B;
    public boolean C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RandomAccessFile f14392z;

    @Override // y1.h
    public final void close() {
        this.A = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14392z;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new p(e7, 2000);
            }
        } finally {
            this.f14392z = null;
            if (this.C) {
                this.C = false;
                d();
            }
        }
    }

    @Override // y1.h
    public final long h(k kVar) throws p {
        Uri uri = kVar.f14377a;
        long j8 = kVar.f14381e;
        this.A = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f14392z = randomAccessFile;
            try {
                randomAccessFile.seek(j8);
                long length = kVar.f;
                if (length == -1) {
                    length = this.f14392z.length() - j8;
                }
                this.B = length;
                if (length < 0) {
                    throw new p(null, null, 2008);
                }
                this.C = true;
                f(kVar);
                return this.B;
            } catch (IOException e7) {
                throw new p(e7, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new p(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new p("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e10, 1004);
        } catch (SecurityException e11) {
            throw new p(e11, 2006);
        } catch (RuntimeException e12) {
            throw new p(e12, 2000);
        }
    }

    @Override // t1.g
    public final int read(byte[] bArr, int i, int i10) throws p {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.B;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14392z;
            int i11 = w1.b0.f13686a;
            int i12 = randomAccessFile.read(bArr, i, (int) Math.min(j8, i10));
            if (i12 > 0) {
                this.B -= (long) i12;
                b(i12);
            }
            return i12;
        } catch (IOException e7) {
            throw new p(e7, 2000);
        }
    }

    @Override // y1.h
    public final Uri s() {
        return this.A;
    }
}
