package k8;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements Runnable {
    public final /* synthetic */ Object A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7615v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f7618y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7619z;

    public l2(AppMeasurementDynamiteService appMeasurementDynamiteService, z6 z6Var, String str, String str2, boolean z2) {
        this.f7619z = z6Var;
        this.f7616w = str;
        this.f7617x = str2;
        this.f7618y = z2;
        this.A = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.l2.run():void");
    }

    public l2(r2 r2Var, boolean z2, Uri uri, String str, String str2) {
        this.f7618y = z2;
        this.f7619z = uri;
        this.f7616w = str;
        this.f7617x = str2;
        this.A = r2Var;
    }

    public l2(u2 u2Var, AtomicReference atomicReference, String str, String str2, boolean z2) {
        this.f7619z = atomicReference;
        this.f7616w = str;
        this.f7617x = str2;
        this.f7618y = z2;
        Objects.requireNonNull(u2Var);
        this.A = u2Var;
    }

    public l2(p3 p3Var, v4 v4Var, boolean z2, u uVar, Bundle bundle) {
        this.f7619z = v4Var;
        this.f7618y = z2;
        this.f7616w = uVar;
        this.f7617x = bundle;
        Objects.requireNonNull(p3Var);
        this.A = p3Var;
    }
}
