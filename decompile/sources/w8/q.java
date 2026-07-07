package w8;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements DialogInterface.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14220x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Intent f14221y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f14222z;

    public /* synthetic */ q(Intent intent, Object obj, int i6) {
        this.f14220x = i6;
        this.f14221y = intent;
        this.f14222z = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, v8.e] */
    public final void a() {
        switch (this.f14220x) {
            case 0:
                Intent intent = this.f14221y;
                if (intent != null) {
                    ((GoogleApiActivity) this.f14222z).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f14221y;
                if (intent2 != null) {
                    this.f14222z.a(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
