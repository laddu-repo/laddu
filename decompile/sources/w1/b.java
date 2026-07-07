package w1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c {
    public final AssetManager B;
    public Uri C;
    public InputStream D;
    public long E;
    public boolean F;

    public b(Context context) {
        super(false);
        this.B = context.getAssets();
    }

    @Override // w1.h
    public final void close() {
        this.C = null;
        try {
            try {
                InputStream inputStream = this.D;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new j(e10, 2000);
            }
        } finally {
            this.D = null;
            if (this.F) {
                this.F = false;
                c();
            }
        }
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.E;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e10) {
                    throw new j(e10, 2000);
                }
            }
            InputStream inputStream = this.D;
            String str = u1.a0.f12750a;
            int read = inputStream.read(bArr, i6, i10);
            if (read != -1) {
                long j10 = this.E;
                if (j10 != -1) {
                    this.E = j10 - read;
                }
                b(read);
                return read;
            }
        }
        return -1;
    }

    @Override // w1.h
    public final long y(l lVar) {
        int i6;
        try {
            Uri uri = lVar.f13542a;
            long j = lVar.f13546e;
            this.C = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f();
            InputStream open = this.B.open(path, 1);
            this.D = open;
            if (open.skip(j) >= j) {
                long j10 = lVar.f13547f;
                if (j10 != -1) {
                    this.E = j10;
                } else {
                    long available = this.D.available();
                    this.E = available;
                    if (available == 2147483647L) {
                        this.E = -1L;
                    }
                }
                this.F = true;
                g(lVar);
                return this.E;
            }
            throw new j((Exception) null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i6 = 2005;
            } else {
                i6 = 2000;
            }
            throw new j(e11, i6);
        }
    }

    @Override // w1.h
    public final Uri z() {
        return this.C;
    }
}
