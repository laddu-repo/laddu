package w1;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends c {
    public RandomAccessFile B;
    public Uri C;
    public long D;
    public boolean E;

    @Override // w1.h
    public final void close() {
        this.C = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.B;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new j(e10, 2000);
            }
        } finally {
            this.B = null;
            if (this.E) {
                this.E = false;
                c();
            }
        }
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.D;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.B;
            String str = u1.a0.f12750a;
            int read = randomAccessFile.read(bArr, i6, (int) Math.min(j, i10));
            if (read > 0) {
                this.D -= read;
                b(read);
            }
            return read;
        } catch (IOException e10) {
            throw new j(e10, 2000);
        }
    }

    @Override // w1.h
    public final long y(l lVar) {
        Uri uri = lVar.f13542a;
        long j = lVar.f13546e;
        this.C = uri;
        f();
        int i6 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.B = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j10 = lVar.f13547f;
                if (j10 == -1) {
                    j10 = this.B.length() - j;
                }
                this.D = j10;
                if (j10 >= 0) {
                    this.E = true;
                    g(lVar);
                    return this.D;
                }
                throw new j(null, null, 2008);
            } catch (IOException e10) {
                throw new j(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e11.getCause() instanceof ErrnoException) || ((ErrnoException) e11.getCause()).errno != OsConstants.EACCES) {
                    i6 = 2005;
                }
                throw new j(e11, i6);
            }
            throw new j("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e11, 1004);
        } catch (SecurityException e12) {
            throw new j(e12, 2006);
        } catch (RuntimeException e13) {
            throw new j(e13, 2000);
        }
    }

    @Override // w1.h
    public final Uri z() {
        return this.C;
    }
}
