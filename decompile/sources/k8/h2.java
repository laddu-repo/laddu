package k8;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h7;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f7563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h7 f7565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7566e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f7567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7568h;

    public h2(Context context, h7 h7Var, Long l10, Long l11) {
        this.f7566e = true;
        t7.y.g(context);
        Context applicationContext = context.getApplicationContext();
        t7.y.g(applicationContext);
        this.f7562a = applicationContext;
        this.f = l10;
        this.f7567g = l11;
        if (h7Var != null) {
            this.f7565d = h7Var;
            this.f7566e = h7Var.f2688x;
            this.f7564c = h7Var.f2687w;
            this.f7568h = h7Var.f2690z;
            Bundle bundle = h7Var.f2689y;
            if (bundle != null) {
                this.f7563b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
