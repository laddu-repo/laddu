package m3;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8566b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8567c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8568d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f8569e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f8570f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f8566b = str;
        this.f8567c = z10;
        this.f8568d = z11;
        this.f8569e = strArr;
        this.f8570f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f8567c == dVar.f8567c && this.f8568d == dVar.f8568d && Objects.equals(this.f8566b, dVar.f8566b) && Arrays.equals(this.f8569e, dVar.f8569e) && Arrays.equals(this.f8570f, dVar.f8570f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (((527 + (this.f8567c ? 1 : 0)) * 31) + (this.f8568d ? 1 : 0)) * 31;
        String str = this.f8566b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return i10 + i6;
    }
}
