package j4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends u5.r {
    @Override // u5.r
    public final u5.r A(int i6) {
        ((AudioAttributes.Builder) this.f12916y).setUsage(i6);
        return this;
    }

    @Override // u5.r
    public final void B(int i6) {
        ((AudioAttributes.Builder) this.f12916y).setUsage(i6);
    }

    @Override // u5.r
    public final a r() {
        return new a(((AudioAttributes.Builder) this.f12916y).build());
    }
}
