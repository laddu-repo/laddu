package sa;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f11683g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f11684h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.t f11685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nb.d f11688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o2.p f11689e;
    public b f;

    public v(Context context, String str, nb.d dVar, o2.p pVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f11686b = context;
        this.f11687c = str;
        this.f11688d = dVar;
        this.f11689e = pVar;
        this.f11685a = new androidx.emoji2.text.t();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f11683g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final u b(boolean z2) {
        String str;
        String str2 = null;
        if (Looper.getMainLooper().isCurrentThread()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        nb.d dVar = this.f11688d;
        if (z2) {
            try {
                str = ((nb.a) b8.h.c(((nb.c) dVar).e(), 10000L, TimeUnit.MILLISECONDS)).f9069a;
            } catch (Exception e7) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e7);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) b8.h.c(((nb.c) dVar).d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e10);
        }
        return new u(str2, str);
    }

    public final synchronized b c() {
        String str;
        b bVar = this.f;
        if (bVar != null && (bVar.f11600b != null || !this.f11689e.b())) {
            return this.f;
        }
        pa.d dVar = pa.d.f10448a;
        dVar.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f11686b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        dVar.e("Cached Firebase Installation ID: " + string);
        if (this.f11689e.b()) {
            u uVarB = b(false);
            dVar.e("Fetched Firebase Installation ID: " + uVarB.f11681a);
            if (uVarB.f11681a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                uVarB = new u(str, null);
            }
            if (Objects.equals(uVarB.f11681a, string)) {
                this.f = new b(sharedPreferences.getString("crashlytics.installation.id", null), uVarB.f11681a, uVarB.f11682b);
            } else {
                this.f = new b(a(sharedPreferences, uVarB.f11681a), uVarB.f11681a, uVarB.f11682b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        dVar.e("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        androidx.emoji2.text.t tVar = this.f11685a;
        Context context = this.f11686b;
        synchronized (tVar) {
            try {
                if (tVar.f929v == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    tVar.f929v = installerPackageName;
                }
                str = "".equals(tVar.f929v) ? null : tVar.f929v;
            } finally {
            }
        }
        return str;
    }
}
