package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j0.a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.i;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f2853h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2856c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2857d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2858e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2859f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2860g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j10) {
        String str3;
        this.f2854a = context;
        this.f2855b = str;
        this.f2856c = str2;
        Matcher matcher = f2853h.matcher(str);
        if (matcher.matches()) {
            str3 = matcher.group(1);
        } else {
            str3 = null;
        }
        this.f2857d = str3;
        this.f2858e = "firebase";
        this.f2859f = j;
        this.f2860g = j10;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10, Map map2) {
        long j;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f2855b);
            Context context = this.f2854a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i6 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i6));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i6 >= 28) {
                        j = a.d(packageInfo);
                    } else {
                        j = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context.getPackageName());
            hashMap.put("sdkVersion", "22.1.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (!map2.isEmpty()) {
                hashMap.put("customSignals", new JSONObject(map2));
                Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
            }
            if (l10 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l10));
            }
            return new JSONObject(hashMap);
        }
        throw new i("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f2857d + "/namespaces/" + this.f2858e + ":fetch").openConnection();
        } catch (IOException e10) {
            throw new i(e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d A[LOOP:0: B:8:0x0097->B:10:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7 A[Catch: all -> 0x018e, JSONException -> 0x0190, IOException | JSONException -> 0x0192, TRY_LEAVE, TryCatch #8 {all -> 0x018e, blocks: (B:14:0x00bb, B:16:0x00d7, B:84:0x0194, B:85:0x019d, B:94:0x019e, B:95:0x01a5), top: B:13:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194 A[Catch: all -> 0x018e, JSONException -> 0x0190, IOException | JSONException -> 0x0192, TRY_ENTER, TryCatch #8 {all -> 0x018e, blocks: (B:14:0x00bb, B:16:0x00d7, B:84:0x0194, B:85:0x019d, B:94:0x019e, B:95:0x01a5), top: B:13:0x00bb }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nc.i fetch(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.Long r16, java.util.Date r17, java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):nc.i");
    }
}
