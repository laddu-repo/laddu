package h7;

import e7.f;
import e7.j;
import e7.n;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends e3.e {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f5980z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i6, List list) {
        super(list, 2);
        this.f5980z = i6;
    }

    @Override // h7.e
    public final e7.e G0() {
        switch (this.f5980z) {
            case 0:
                return new f(0, (List) this.f4301y);
            case 1:
                return new j(0, (List) this.f4301y);
            case 2:
                return new f(1, (List) this.f4301y);
            case 3:
                return new j(1, (List) this.f4301y);
            case 4:
                return new j(2, (List) this.f4301y);
            case 5:
                return new n((List) this.f4301y);
            default:
                return new f(2, (List) this.f4301y);
        }
    }
}
