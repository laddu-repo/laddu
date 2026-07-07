package kotlin.jvm.internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m extends r implements bf.i {
    @Override // kotlin.jvm.internal.c
    public bf.c computeReflected() {
        x.f8056a.getClass();
        return this;
    }

    @Override // bf.l
    public Object getDelegate() {
        return ((bf.i) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ bf.j getGetter() {
        mo154getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ bf.g getSetter() {
        mo155getSetter();
        return null;
    }

    @Override // ve.a
    public Object invoke() {
        return get();
    }

    @Override // bf.l
    /* renamed from: getGetter, reason: collision with other method in class */
    public bf.k mo154getGetter() {
        ((bf.i) getReflected()).mo154getGetter();
        return null;
    }

    @Override // bf.i
    /* renamed from: getSetter, reason: collision with other method in class */
    public bf.h mo155getSetter() {
        ((bf.i) getReflected()).mo155getSetter();
        return null;
    }
}
