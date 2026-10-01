package t2;

import db.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f12527x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f12528y;

    public i(r1.q qVar, int i6) {
        this.f12527x = (qVar.f11662e & 1) != 0;
        this.f12528y = r4.a.f(i6, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        return z.f4060a.c(this.f12528y, iVar.f12528y).c(this.f12527x, iVar.f12527x).e();
    }
}
