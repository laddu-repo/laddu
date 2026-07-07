package v1;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements Comparable {

    /* renamed from: y, reason: collision with root package name */
    public long f13254y = -9223372036854775807L;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f13253x = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f13254y, ((r) obj).f13254y);
    }
}
