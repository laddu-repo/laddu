package zb;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import s9.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    public final jb.c f15320a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15321b;

    /* renamed from: c, reason: collision with root package name */
    public final bc.a f15322c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f15323d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15324e;

    public c(Context context, String str, Set set, bc.a aVar, Executor executor) {
        this.f15320a = new jb.c(context, str);
        this.f15323d = set;
        this.f15324e = executor;
        this.f15322c = aVar;
        this.f15321b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        w5.a aVar = (w5.a) this.f15320a.get();
        if (aVar.k(currentTimeMillis)) {
            aVar.i();
            return 3;
        }
        return 1;
    }

    public final n b() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = p0.b.f(this.f15321b);
        } else {
            z10 = true;
        }
        if (!z10) {
            return dg.b.j(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return dg.b.c(this.f15324e, new b(this, 0));
    }

    public final void c() {
        boolean z10;
        if (this.f15323d.size() <= 0) {
            dg.b.j(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = p0.b.f(this.f15321b);
        } else {
            z10 = true;
        }
        if (!z10) {
            dg.b.j(null);
        } else {
            dg.b.c(this.f15324e, new b(this, 1));
        }
    }
}
