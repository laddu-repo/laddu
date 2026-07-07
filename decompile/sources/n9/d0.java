package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f9208f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f9209a;

    /* renamed from: b, reason: collision with root package name */
    public final w f9210b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9211c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9212d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9213e = null;

    public /* synthetic */ d0(String str, Object obj, w wVar) {
        this.f9209a = str;
        this.f9211c = obj;
        this.f9210b = wVar;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f9212d) {
        }
        if (obj != null) {
            return obj;
        }
        if (a2.f9166k == null) {
            return this.f9211c;
        }
        synchronized (f9208f) {
            try {
                if (w8.l.w()) {
                    if (this.f9213e == null) {
                        obj2 = this.f9211c;
                    } else {
                        obj2 = this.f9213e;
                    }
                    return obj2;
                }
                try {
                    for (d0 d0Var : e0.f9226a) {
                        if (!w8.l.w()) {
                            Object obj3 = null;
                            try {
                                w wVar = d0Var.f9210b;
                                if (wVar != null) {
                                    obj3 = wVar.b();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f9208f) {
                                d0Var.f9213e = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                w wVar2 = this.f9210b;
                if (wVar2 != null) {
                    try {
                        return wVar2.b();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f9211c;
            } finally {
            }
        }
    }
}
