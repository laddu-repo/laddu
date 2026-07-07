package k7;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7739x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f7740y;

    public /* synthetic */ a(Object obj, int i6) {
        this.f7739x = i6;
        this.f7740y = obj;
    }

    public static String f(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7739x) {
            case 0:
                ((HttpURLConnection) this.f7740y).disconnect();
                return;
            default:
                ((n6.b) this.f7740y).close();
                return;
        }
    }

    public String d() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f7740y;
        boolean z10 = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z10 = true;
                }
            } catch (IOException unused) {
            }
            if (z10) {
                return null;
            }
            try {
                return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + f(httpURLConnection);
            } catch (IOException e10) {
                e = e10;
                n7.c.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (NullPointerException e11) {
            e = e11;
            n7.c.c("get error failed ", e);
            return e.getMessage();
        }
    }
}
