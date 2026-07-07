package m6;

import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements j {
    @Override // m6.j
    public final k a(p6.m mVar, v6.o oVar) {
        bg.m m9 = mVar.f10612a.m();
        if (!m9.I(0L, r.f8679b) && !m9.I(0L, r.f8678a) && (!m9.I(0L, r.f8680c) || !m9.I(8L, r.f8681d) || !m9.I(12L, r.f8682e) || !m9.P(17L) || ((byte) (m9.a().y(16L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT >= 30 && m9.I(4L, r.f8683f)) {
                if (!m9.I(8L, r.f8684g) && !m9.I(8L, r.f8685h) && !m9.I(8L, r.f8686i)) {
                    return null;
                }
            } else {
                return null;
            }
        }
        return new z(mVar.f10612a, oVar);
    }

    public final boolean equals(Object obj) {
        return obj instanceof v;
    }

    public final int hashCode() {
        return v.class.hashCode();
    }
}
