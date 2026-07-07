package jd;

import android.webkit.ValueCallback;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.p0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f7374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f7375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.k f7376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f7377e;

    public /* synthetic */ d0(AtomicBoolean atomicBoolean, kotlin.jvm.internal.w wVar, gf.k kVar, p0 p0Var, int i6) {
        this.f7373a = i6;
        this.f7374b = atomicBoolean;
        this.f7375c = wVar;
        this.f7376d = kVar;
        this.f7377e = p0Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String b10;
        String b11;
        switch (this.f7373a) {
            case 0:
                String str = (String) obj;
                AtomicBoolean atomicBoolean = this.f7374b;
                if (!atomicBoolean.get() && (b10 = e0.b(str)) != null && !df.m.S(b10)) {
                    e0.a(atomicBoolean, this.f7376d, this.f7377e, b10, (Map) this.f7375c.f8055x);
                    return;
                }
                return;
            default:
                String str2 = (String) obj;
                AtomicBoolean atomicBoolean2 = this.f7374b;
                if (!atomicBoolean2.get() && (b11 = e0.b(str2)) != null && !df.m.S(b11)) {
                    e0.a(atomicBoolean2, this.f7376d, this.f7377e, b11, (Map) this.f7375c.f8055x);
                    return;
                }
                return;
        }
    }
}
