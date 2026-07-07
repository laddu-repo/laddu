package nc;

import a2.l1;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9595a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9596b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9597c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9598d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9599e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9600f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9601g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f9602h;

    public c(HttpURLConnection httpURLConnection, j jVar, e eVar, LinkedHashSet linkedHashSet, l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.f9597c = httpURLConnection;
        this.f9598d = jVar;
        this.f9599e = eVar;
        this.f9596b = linkedHashSet;
        this.f9600f = lVar;
        this.f9601g = scheduledExecutorService;
        this.f9602h = new Random();
        this.f9595a = false;
    }

    public void a(int i6, long j) {
        if (i6 == 0) {
            e(new mc.h("Unable to fetch the latest version of the template."));
        } else {
            ((ScheduledExecutorService) this.f9601g).schedule(new b(this, i6, j), ((Random) this.f9602h).nextInt(4), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [jb.i, mc.f] */
    public void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = w8.k.c(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str = str.substring(indexOf, lastIndexOf + 1);
                }
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e10) {
                        e(new jb.i("Unable to parse config update message.", e10.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e10);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((l) this.f9600f).b(new mc.h("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((LinkedHashSet) this.f9596b).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((j) this.f9598d).f9637g.f9666a.getLong("last_template_version", 0L);
                        long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j10 > j) {
                            a(3, j10);
                        }
                    }
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f9597c;
        if (httpURLConnection != null) {
            InputStream inputStream = null;
            try {
                try {
                    try {
                        inputStream = httpURLConnection.getInputStream();
                        b(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e10) {
                                Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    if (!this.f9595a) {
                        Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e11);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e12) {
                Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e12);
            }
        }
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                ((u4.a) this.f9597c).d();
                return null;
            }
            return null;
        }
    }

    public synchronized void e(mc.f fVar) {
        Iterator it = ((LinkedHashSet) this.f9596b).iterator();
        while (it.hasNext()) {
            ((mc.b) it.next()).b(fVar);
        }
    }

    public void f(int i6, Serializable serializable) {
        ((Executor) this.f9596b).execute(new l1(this, i6, serializable, 5));
    }

    public c(AssetManager assetManager, Executor executor, u4.a aVar, String str, File file) {
        this.f9595a = false;
        this.f9596b = executor;
        this.f9597c = aVar;
        this.f9600f = str;
        this.f9599e = file;
        int i6 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i6 >= 24) {
            if (i6 >= 31) {
                bArr = u4.b.f12888d;
            } else {
                switch (i6) {
                    case 24:
                    case 25:
                        bArr = u4.b.f12892h;
                        break;
                    case 26:
                        bArr = u4.b.f12891g;
                        break;
                    case 27:
                        bArr = u4.b.f12890f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = u4.b.f12889e;
                        break;
                }
            }
        }
        this.f9598d = bArr;
    }
}
