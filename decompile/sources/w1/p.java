package w1;

import android.net.Uri;
import com.google.protobuf.CodedOutputStream;
import db.h1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends c {
    public final int B;
    public final int C;
    public final s8.l D;
    public final s8.l E;
    public l F;
    public HttpURLConnection G;
    public InputStream H;
    public boolean I;
    public int J;
    public long K;
    public long L;

    public p(int i6, int i10, s8.l lVar) {
        super(true);
        this.B = i6;
        this.C = i10;
        this.D = lVar;
        this.E = new s8.l(14);
    }

    @Override // w1.h
    public final void close() {
        try {
            InputStream inputStream = this.H;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    String str = u1.a0.f12750a;
                    throw new t(e10, 2000, 3);
                }
            }
        } finally {
            this.H = null;
            h();
            if (this.I) {
                this.I = false;
                c();
            }
            this.G = null;
            this.F = null;
        }
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.G;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                u1.a.h("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final HttpURLConnection n(URL url, int i6, byte[] bArr, long j, long j10, boolean z10, boolean z11, Map map) {
        String str;
        boolean z12;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.B);
        httpURLConnection.setReadTimeout(this.C);
        HashMap hashMap = new HashMap();
        s8.l lVar = this.D;
        if (lVar != null) {
            hashMap.putAll(lVar.j());
        }
        hashMap.putAll(this.E.j());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = w.a(j, j10);
        if (a10 != null) {
            httpURLConnection.setRequestProperty("Range", a10);
        }
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnection.setDoOutput(z12);
        httpURLConnection.setRequestMethod(l.b(i6));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.K;
            if (j != -1) {
                long j10 = j - this.L;
                if (j10 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j10);
            }
            InputStream inputStream = this.H;
            String str = u1.a0.f12750a;
            int read = inputStream.read(bArr, i6, i10);
            if (read != -1) {
                this.L += read;
                b(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            String str2 = u1.a0.f12750a;
            throw t.a(e10, 2);
        }
    }

    public final void s(long j) {
        if (j != 0) {
            byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
            while (j > 0) {
                int min = (int) Math.min(j, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                InputStream inputStream = this.H;
                String str = u1.a0.f12750a;
                int read = inputStream.read(bArr, 0, min);
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j -= read;
                        b(read);
                    } else {
                        throw new t(2008);
                    }
                } else {
                    throw new t(new InterruptedIOException(), 2000, 1);
                }
            }
        }
    }

    @Override // w1.c, w1.h
    public final Map u() {
        HttpURLConnection httpURLConnection = this.G;
        if (httpURLConnection == null) {
            return h1.D;
        }
        return new o(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x013c A[Catch: IOException -> 0x0147, TRY_LEAVE, TryCatch #0 {IOException -> 0x0147, blocks: (B:22:0x0134, B:24:0x013c), top: B:21:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    @Override // w1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y(w1.l r27) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.p.y(w1.l):long");
    }

    @Override // w1.h
    public final Uri z() {
        HttpURLConnection httpURLConnection = this.G;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        l lVar = this.F;
        if (lVar != null) {
            return lVar.f13542a;
        }
        return null;
    }
}
