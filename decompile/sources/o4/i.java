package o4;

import l4.r;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9922x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f9923y;

    public /* synthetic */ i(r rVar, int i6) {
        this.f9922x = i6;
        this.f9923y = rVar;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        boolean contains;
        String key = (String) obj;
        switch (this.f9922x) {
            case 0:
                kotlin.jvm.internal.k.e(key, "key");
                contains = this.f9923y.b().contains(key);
                break;
            default:
                kotlin.jvm.internal.k.e(key, "key");
                contains = this.f9923y.b().contains(key);
                break;
        }
        return Boolean.valueOf(!contains);
    }
}
