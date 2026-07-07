package a2;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements cb.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f209x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f210y;

    public /* synthetic */ e(Object obj, int i6) {
        this.f209x = i6;
        this.f210y = obj;
    }

    @Override // cb.l
    public final Object get() {
        switch (this.f209x) {
            case 0:
                return s1.c.l((Context) this.f210y);
            case 1:
                return (t2.q) this.f210y;
            case 2:
                return (n) this.f210y;
            default:
                try {
                    return (q2.b0) ((Class) this.f210y).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
