package fa;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import kb.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements mb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5329c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f5327a = i;
        this.f5329c = obj;
        this.f5328b = obj2;
    }

    @Override // mb.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f5327a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                g gVar = (g) this.f5329c;
                Context contextA = (Context) this.f5328b;
                String strD = gVar.d();
                rb.a aVar = new rb.a();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    contextA = i >= 24 ? i0.a.a(contextA) : null;
                }
                SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + strD, 0);
                boolean z2 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextA.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f11357a = z2;
                return aVar;
            case 1:
                return new l((Context) this.f5328b, (String) this.f5329c);
            default:
                ma.g gVar2 = (ma.g) this.f5329c;
                ma.b bVar = (ma.b) this.f5328b;
                return bVar.f.p(new ad.c(bVar, gVar2));
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f5327a = 1;
        this.f5328b = context;
        this.f5329c = str;
    }
}
