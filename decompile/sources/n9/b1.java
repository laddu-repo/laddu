package n9;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9183a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9184b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9185c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f9187e;

    public b1(c1 c1Var, String str, boolean z10) {
        this.f9187e = c1Var;
        w8.x.d(str);
        this.f9183a = str;
        this.f9184b = z10;
    }

    public final boolean a() {
        if (!this.f9185c) {
            this.f9185c = true;
            this.f9186d = this.f9187e.h1().getBoolean(this.f9183a, this.f9184b);
        }
        return this.f9186d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor edit = this.f9187e.h1().edit();
        edit.putBoolean(this.f9183a, z10);
        edit.apply();
        this.f9186d = z10;
    }
}
