package r8;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import y1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11879x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11880y;

    public c(HashMap hashMap) {
        this.f11880y = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f11879x) {
            case 0:
                HashMap hashMap = (HashMap) this.f11880y;
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(uri);
                            Log.w("HttpUrlPinger", sb2.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                    sb3.append("Error while pinging URL: ");
                    sb3.append(uri);
                    sb3.append(". ");
                    sb3.append(message);
                    Log.w("HttpUrlPinger", sb3.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e11) {
                    String message2 = e11.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(uri);
                    sb4.append(". ");
                    sb4.append(message2);
                    Log.w("HttpUrlPinger", sb4.toString(), e11);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    String message3 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
                    sb32.append("Error while pinging URL: ");
                    sb32.append(uri);
                    sb32.append(". ");
                    sb32.append(message3);
                    Log.w("HttpUrlPinger", sb32.toString(), e);
                    return;
                } finally {
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e13) {
                        throw new IllegalStateException(e13);
                    }
                } while (((k) this.f11880y).k());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f11880y = kVar;
    }
}
