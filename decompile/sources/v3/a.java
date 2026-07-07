package v3;

import db.k0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f13261a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13262b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13263c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13264d;

    public a(long j, long j10, List list) {
        this.f13261a = k0.k(list);
        this.f13262b = j;
        this.f13263c = j10;
        long j11 = -9223372036854775807L;
        if (j != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j + j10;
        }
        this.f13264d = j11;
    }
}
