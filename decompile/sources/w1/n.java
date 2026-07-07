package w1;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements cb.h {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13553x;

    @Override // cb.h
    public final boolean apply(Object obj) {
        switch (this.f13553x) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            default:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
        }
    }
}
