package md;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f8662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ByteArrayInputStream f8664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f8665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f8666z = new e(this);
    public final HashMap A = new HashMap();

    public h(g gVar, String str, ByteArrayInputStream byteArrayInputStream, long j8) {
        this.f8662v = gVar;
        this.f8663w = str;
        this.f8664x = byteArrayInputStream;
        this.f8665y = j8;
        this.C = j8 < 0;
        this.E = true;
    }

    public static void l(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final void A(OutputStream outputStream, long j8) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z2 = j8 == -1;
        while (true) {
            if (j8 <= 0 && !z2) {
                return;
            }
            int i = this.f8664x.read(bArr, 0, (int) (z2 ? 16384L : Math.min(j8, 16384L)));
            if (i <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i);
            if (!z2) {
                j8 -= (long) i;
            }
        }
    }

    public final long B(PrintWriter printWriter, long j8) {
        String strA = a("content-length");
        if (strA != null) {
            try {
                j8 = Long.parseLong(strA);
            } catch (NumberFormatException unused) {
                k.f8671d.severe("content-length was no number ".concat(strA));
            }
        }
        printWriter.print("Content-Length: " + j8 + "\r\n");
        return j8;
    }

    public final void D(boolean z2) {
        this.D = z2;
    }

    public final void G(boolean z2) {
        this.E = z2;
    }

    public final void H(int i) {
        this.B = i;
    }

    public final String a(String str) {
        return (String) this.A.get(str.toLowerCase());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f8664x;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    public final boolean i() {
        return "close".equals(a("connection"));
    }

    public final void m(OutputStream outputStream) {
        String str = this.f8663w;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        g gVar = this.f8662v;
        try {
            if (gVar == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            String str2 = new a(str).f8640c;
            if (str2 == null) {
                str2 = "US-ASCII";
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str2)), false);
            printWriter.append("HTTP/1.1 ").append("" + gVar.f8660v + " " + gVar.f8661w).append(" \r\n");
            if (str != null) {
                l(printWriter, "Content-Type", str);
            }
            if (a("date") == null) {
                l(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : this.f8666z.entrySet()) {
                l(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (a("connection") == null) {
                l(printWriter, "Connection", this.E ? "keep-alive" : "close");
            }
            if (a("content-length") != null) {
                this.D = false;
            }
            if (this.D) {
                l(printWriter, "Content-Encoding", "gzip");
                this.C = true;
            }
            ByteArrayInputStream byteArrayInputStream = this.f8664x;
            long jB = byteArrayInputStream != null ? this.f8665y : 0L;
            if (this.B != 5 && this.C) {
                l(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.D) {
                jB = B(printWriter, jB);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.B != 5 && this.C) {
                f fVar = new f(outputStream);
                if (this.D) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fVar);
                    A(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    A(fVar, -1L);
                }
                fVar.a();
            } else if (this.D) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                A(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                A(outputStream, jB);
            }
            outputStream.flush();
            k.a(byteArrayInputStream);
        } catch (IOException e7) {
            k.f8671d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e7);
        }
    }
}
