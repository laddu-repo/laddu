package c6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f1967h = o.h("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final c2.g f1968g;

    public c(Context context, h6.a aVar) {
        super(context, aVar);
        this.f1968g = new c2.g(this, 1);
    }

    @Override // c6.d
    public final void d() {
        o.f().b(f1967h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f1971b.registerReceiver(this.f1968g, f());
    }

    @Override // c6.d
    public final void e() {
        o.f().b(f1967h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f1971b.unregisterReceiver(this.f1968g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
