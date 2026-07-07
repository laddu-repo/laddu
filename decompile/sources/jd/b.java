package jd;

import android.content.Context;
import android.content.SharedPreferences;
import gf.a2;
import java.util.Arrays;
import java.util.Locale;
import kf.f1;
import kf.t0;
import kf.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7356a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f7357b;

    /* renamed from: c, reason: collision with root package name */
    public final he.m f7358c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f7359d;

    /* renamed from: e, reason: collision with root package name */
    public final t0 f7360e;

    /* renamed from: f, reason: collision with root package name */
    public a2 f7361f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7362g;

    /* renamed from: h, reason: collision with root package name */
    public long f7363h;

    public b(Context context, SharedPreferences pref) {
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(pref, "pref");
        this.f7356a = context;
        this.f7357b = pref;
        this.f7358c = he.a.d(new d.a0(5));
        f1 c10 = y0.c(e.f7378a);
        this.f7359d = c10;
        this.f7360e = new t0(c10);
    }

    public static final String a(b bVar, long j) {
        if (j <= 0) {
            return "0 B";
        }
        double d10 = j;
        int log10 = (int) (Math.log10(d10) / Math.log10(1024.0d));
        return String.format(Locale.getDefault(), "%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(d10 / Math.pow(1024.0d, log10)), new String[]{"B", "KB", "MB", "GB", "TB"}[log10]}, 2));
    }

    public final void b() {
        this.f7362g = true;
        a2 a2Var = this.f7361f;
        if (a2Var != null) {
            a2Var.d(null);
        }
        f1 f1Var = this.f7359d;
        f1Var.getClass();
        e eVar = e.f7378a;
        f1Var.h(null, eVar);
        f1Var.getClass();
        f1Var.h(null, eVar);
    }
}
