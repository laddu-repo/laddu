package zb;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15316a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15317b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f15316a = str;
            this.f15317b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f15316a.equals(aVar.f15316a) && this.f15317b.equals(aVar.f15317b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15316a.hashCode() ^ 1000003) * 1000003) ^ this.f15317b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f15316a + ", usedDates=" + this.f15317b + "}";
    }
}
