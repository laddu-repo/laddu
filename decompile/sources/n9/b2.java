package n9;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9188a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f9189b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9190c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.v0 f9191d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9192e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f9193f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9194g;

    public b2(Context context, com.google.android.gms.internal.measurement.v0 v0Var, Long l10) {
        this.f9192e = true;
        w8.x.g(context);
        Context applicationContext = context.getApplicationContext();
        w8.x.g(applicationContext);
        this.f9188a = applicationContext;
        this.f9193f = l10;
        if (v0Var != null) {
            this.f9191d = v0Var;
            this.f9192e = v0Var.f2467z;
            this.f9190c = v0Var.f2466y;
            this.f9194g = v0Var.B;
            Bundle bundle = v0Var.A;
            if (bundle != null) {
                this.f9189b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
