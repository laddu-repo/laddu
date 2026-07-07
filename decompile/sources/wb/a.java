package wb;

import java.util.Map;
import xb.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ub.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14259a;

    @Override // ub.a
    public final void a(Object obj, Object obj2) {
        switch (this.f14259a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ub.e eVar = (ub.e) obj2;
                eVar.c(f.f14706g, entry.getKey());
                eVar.c(f.f14707h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
