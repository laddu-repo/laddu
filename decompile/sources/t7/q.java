package t7;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Intent f12396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12397x;

    public /* synthetic */ q(Intent intent, Object obj, int i) {
        this.f12395v = i;
        this.f12396w = intent;
        this.f12397x = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, s7.e] */
    public final void a() {
        switch (this.f12395v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Intent intent = this.f12396w;
                if (intent != null) {
                    ((GoogleApiActivity) this.f12397x).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f12396w;
                if (intent2 != null) {
                    this.f12397x.a(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e7) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
