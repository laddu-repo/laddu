package x1;

import android.net.Uri;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import r1.f0;
import s8.l;
import u1.a0;
import w1.c;
import w1.j;
import w1.t;
import w1.v;
import w1.w;
import w8.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c {
    public final Call.Factory B;
    public final l C;
    public final String D;
    public final l E;
    public w1.l F;
    public Response G;
    public InputStream H;
    public boolean I;
    public long J;
    public long K;

    static {
        f0.a("media3.datasource.okhttp");
    }

    public b(Call.Factory factory, String str, l lVar) {
        super(true);
        factory.getClass();
        this.B = factory;
        this.D = str;
        this.E = lVar;
        this.C = new l(14);
    }

    @Override // w1.h
    public final void close() {
        if (this.I) {
            this.I = false;
            c();
            h();
        }
        this.G = null;
        this.F = null;
    }

    public final void h() {
        Response response = this.G;
        if (response != null) {
            ResponseBody body = response.body();
            body.getClass();
            body.close();
        }
        this.H = null;
    }

    public final void n(long j) {
        if (j != 0) {
            byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
            while (j > 0) {
                try {
                    int min = (int) Math.min(j, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                    InputStream inputStream = this.H;
                    String str = a0.f12750a;
                    int read = inputStream.read(bArr, 0, min);
                    if (!Thread.currentThread().isInterrupted()) {
                        if (read != -1) {
                            j -= read;
                            b(read);
                        } else {
                            throw new t(2008);
                        }
                    } else {
                        throw new InterruptedIOException();
                    }
                } catch (IOException e10) {
                    if (e10 instanceof t) {
                        throw ((t) e10);
                    }
                    throw new t(2000);
                }
            }
        }
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.J;
            if (j != -1) {
                long j10 = j - this.K;
                if (j10 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j10);
            }
            InputStream inputStream = this.H;
            String str = a0.f12750a;
            int read = inputStream.read(bArr, i6, i10);
            if (read != -1) {
                this.K += read;
                b(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            String str2 = a0.f12750a;
            throw t.a(e10, 2);
        }
    }

    @Override // w1.c, w1.h
    public final Map u() {
        Response response = this.G;
        if (response == null) {
            return Collections.EMPTY_MAP;
        }
        return response.headers().toMultimap();
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, hb.o] */
    @Override // w1.h
    public final long y(w1.l lVar) {
        RequestBody requestBody;
        long j;
        this.F = lVar;
        this.K = 0L;
        this.J = 0L;
        f();
        long j10 = lVar.f13546e;
        int i6 = lVar.f13543b;
        long j11 = lVar.f13547f;
        HttpUrl parse = HttpUrl.parse(lVar.f13542a.toString());
        if (parse != null) {
            Request.Builder url = new Request.Builder().url(parse);
            HashMap hashMap = new HashMap();
            l lVar2 = this.E;
            if (lVar2 != null) {
                hashMap.putAll(lVar2.j());
            }
            hashMap.putAll(this.C.j());
            hashMap.putAll(lVar.f13545d);
            for (Map.Entry entry : hashMap.entrySet()) {
                url.header((String) entry.getKey(), (String) entry.getValue());
            }
            String a10 = w.a(j10, j11);
            if (a10 != null) {
                url.addHeader("Range", a10);
            }
            String str = this.D;
            if (str != null) {
                url.addHeader("User-Agent", str);
            }
            if ((lVar.f13549h & 1) != 1) {
                url.addHeader("Accept-Encoding", "identity");
            }
            byte[] bArr = lVar.f13544c;
            j jVar = null;
            if (bArr != null) {
                requestBody = RequestBody.create(bArr);
            } else if (i6 == 2) {
                requestBody = RequestBody.create(a0.f12751b);
            } else {
                requestBody = null;
            }
            url.method(w1.l.b(i6), requestBody);
            Call newCall = this.B.newCall(url.build());
            try {
                ?? obj = new Object();
                newCall.enqueue(new e((Object) obj));
                try {
                    try {
                        Response response = (Response) obj.get();
                        this.G = response;
                        ResponseBody body = response.body();
                        body.getClass();
                        this.H = body.byteStream();
                        int code = response.code();
                        long j12 = -1;
                        if (!response.isSuccessful()) {
                            if (code == 416 && j10 == w.b(response.headers().get("Content-Range"))) {
                                this.I = true;
                                g(lVar);
                                if (j11 == -1) {
                                    return 0L;
                                }
                                return j11;
                            }
                            try {
                                InputStream inputStream = this.H;
                                inputStream.getClass();
                                eb.b.b(inputStream);
                            } catch (IOException unused) {
                                String str2 = a0.f12750a;
                            }
                            Map<String, List<String>> multimap = response.headers().toMultimap();
                            h();
                            if (code == 416) {
                                jVar = new j(2008);
                            }
                            response.message();
                            throw new v(code, jVar, multimap);
                        }
                        MediaType contentType = body.contentType();
                        if (contentType != null) {
                            contentType.toString();
                        }
                        if (code == 200 && j10 != 0) {
                            j = j10;
                        } else {
                            j = 0;
                        }
                        if (j11 != -1) {
                            this.J = j11;
                        } else {
                            long contentLength = body.contentLength();
                            if (contentLength != -1) {
                                j12 = contentLength - j;
                            }
                            this.J = j12;
                        }
                        this.I = true;
                        g(lVar);
                        try {
                            n(j);
                            return this.J;
                        } catch (t e10) {
                            h();
                            throw e10;
                        }
                    } catch (InterruptedException unused2) {
                        newCall.cancel();
                        throw new InterruptedIOException();
                    }
                } catch (ExecutionException e11) {
                    throw new IOException(e11);
                }
            } catch (IOException e12) {
                throw t.a(e12, 1);
            }
        }
        throw new t("Malformed URL", 1004);
    }

    @Override // w1.h
    public final Uri z() {
        Response response = this.G;
        if (response != null) {
            return Uri.parse(response.request().url().toString());
        }
        w1.l lVar = this.F;
        if (lVar != null) {
            return lVar.f13542a;
        }
        return null;
    }
}
