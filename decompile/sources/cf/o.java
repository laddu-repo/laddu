package cf;

import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2072a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2073b;

    public /* synthetic */ o(Object obj, int i6) {
        this.f2072a = i6;
        this.f2073b = obj;
    }

    @Override // cf.j
    public final Iterator iterator() {
        switch (this.f2072a) {
            case 0:
                return (Iterator) this.f2073b;
            case 1:
                return new df.g((CharSequence) this.f2073b);
            case 2:
                return ((Iterable) this.f2073b).iterator();
            case 3:
                return new se.i(this);
            default:
                return new he.p((ChipGroup) this.f2073b, 6);
        }
    }
}
