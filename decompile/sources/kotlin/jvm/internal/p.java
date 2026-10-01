package kotlin.jvm.internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p extends r implements bf.n {
    @Override // kotlin.jvm.internal.c
    public bf.c computeReflected() {
        x.f8056a.getClass();
        return this;
    }

    @Override // bf.n
    public Object getDelegate(Object obj) {
        return ((bf.n) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ bf.j getGetter() {
        mo156getGetter();
        return null;
    }

    @Override // ve.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // bf.n
    /* renamed from: getGetter, reason: collision with other method in class */
    public bf.m mo156getGetter() {
        ((bf.n) getReflected()).mo156getGetter();
        return null;
    }
}
