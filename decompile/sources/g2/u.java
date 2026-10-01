package g2;

import android.content.Context;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5481a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5483c;

    public /* synthetic */ u() {
    }

    public boolean equals(Object obj) {
        switch (this.f5481a) {
            case 1:
                if (!(obj instanceof s0.b)) {
                    return false;
                }
                if (this.f5482b != null) {
                    throw null;
                }
                if (this.f5483c == null) {
                    return true;
                }
                throw null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f5481a) {
            case 1:
                String str = this.f5482b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f5483c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f5481a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return this.f5482b + ", " + this.f5483c;
            case 1:
                return "Pair{" + ((Object) this.f5482b) + " " + ((Object) this.f5483c) + "}";
            default:
                return super.toString();
        }
    }

    public u(String str, String str2) {
        this.f5482b = str;
        this.f5483c = str2;
    }

    public u(p2.c cVar) {
        Context context = (Context) cVar.f10196w;
        int iD = sa.f.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f5482b = "Unity";
            String string = context.getResources().getString(iD);
            this.f5483c = string;
            String strK = d0.d.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strK, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f5482b = "Flutter";
                this.f5483c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f5482b = null;
        this.f5483c = null;
    }
}
