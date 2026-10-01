package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: b, reason: collision with root package name */
    public static final zb.d f978b = new zb.d(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f979a;

    public o1() {
        this.f979a = new AtomicReference(null);
    }

    public o1(p1 store, n1 factory, o1.c defaultCreationExtras) {
        kotlin.jvm.internal.k.e(store, "store");
        kotlin.jvm.internal.k.e(factory, "factory");
        kotlin.jvm.internal.k.e(defaultCreationExtras, "defaultCreationExtras");
        this.f979a = new ic.s(store, factory, defaultCreationExtras);
    }

    public o1(v0 v0Var) {
        this.f979a = v0Var;
    }
}
