package y1;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import y9.e1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends c {
    public final int A;
    public final ob.d B;
    public final ob.d C;
    public k D;
    public HttpURLConnection E;
    public InputStream F;
    public boolean G;
    public int H;
    public long I;
    public long J;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14391z;

    public o(int i, int i10, ob.d dVar) {
        super(true);
        this.f14391z = i;
        this.A = i10;
        this.B = dVar;
        this.C = new ob.d(23);
    }

    @Override // y1.h
    public final void close() {
        try {
            InputStream inputStream = this.F;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i = w1.b0.f13686a;
                    throw new s(e7, 2000, 3);
                }
            }
        } finally {
            this.F = null;
            k();
            if (this.G) {
                this.G = false;
                d();
            }
            this.E = null;
            this.D = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    @Override // y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(y1.k r27) throws y1.s {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.o.h(y1.k):long");
    }

    @Override // y1.c, y1.h
    public final Map j() {
        HttpURLConnection httpURLConnection = this.E;
        return httpURLConnection == null ? e1.B : new n(httpURLConnection.getHeaderFields());
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.E;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                w1.a.p("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
        }
    }

    public final HttpURLConnection m(URL url, int i, byte[] bArr, long j8, long j9, boolean z2, boolean z10, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f14391z);
        httpURLConnection.setReadTimeout(this.A);
        HashMap map2 = new HashMap();
        ob.d dVar = this.B;
        if (dVar != null) {
            map2.putAll(dVar.d());
        }
        map2.putAll(this.C.d());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = v.a(j8, j9);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z2 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(k.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void n(long j8) throws IOException {
        if (j8 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j8 > 0) {
            int iMin = (int) Math.min(j8, 4096);
            InputStream inputStream = this.F;
            int i = w1.b0.f13686a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new s(new InterruptedIOException(), 2000, 1);
            }
            if (i10 == -1) {
                throw new s(2008);
            }
            j8 -= (long) i10;
            b(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // t1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws y1.s {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.I     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.J     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.F     // Catch: java.io.IOException -> L32
            int r1 = w1.b0.f13686a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.J     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.J = r8     // Catch: java.io.IOException -> L32
            r6.b(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = w1.b0.f13686a
            r8 = 2
            y1.s r7 = y1.s.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.o.read(byte[], int, int):int");
    }

    @Override // y1.h
    public final Uri s() {
        HttpURLConnection httpURLConnection = this.E;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.D;
        if (kVar != null) {
            return kVar.f14377a;
        }
        return null;
    }
}
