package n3;

import java.util.ArrayList;
import r1.g0;
import r1.i0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9035a;

    public c(ArrayList arrayList) {
        this.f9035a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j = ((b) arrayList.get(0)).f9033b;
            int i6 = 1;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i6)).f9032a < j) {
                    z10 = true;
                    break;
                } else {
                    j = ((b) arrayList.get(i6)).f9033b;
                    i6++;
                }
            }
        }
        u1.c.b(!z10);
    }

    @Override // r1.i0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f9035a.equals(((c) obj).f9035a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9035a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f9035a;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
