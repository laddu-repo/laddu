package dd;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f4113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4114b;

    public e(a aVar, String str) {
        this.f4113a = aVar;
        this.f4114b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class.equals(obj.getClass())) {
            e eVar = (e) obj;
            String str = eVar.f4114b;
            a aVar = eVar.f4113a;
            a aVar2 = this.f4113a;
            if (aVar2 == null ? aVar != null : !k.a(aVar2, aVar)) {
                return false;
            }
            String str2 = this.f4114b;
            if (str2 != null) {
                return k.a(str2, str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = 0;
        a aVar = this.f4113a;
        if (aVar != null) {
            i6 = aVar.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = i6 * 31;
        String str = this.f4114b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "YtFile{format=" + this.f4113a + ", url='" + this.f4114b + "'}";
    }
}
