package k;

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends a8.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7491a;

    /* renamed from: b, reason: collision with root package name */
    public final Animatable f7492b;

    public /* synthetic */ a(Animatable animatable, int i6) {
        this.f7491a = i6;
        this.f7492b = animatable;
    }

    @Override // a8.c
    public final void n() {
        switch (this.f7491a) {
            case 0:
                this.f7492b.start();
                return;
            default:
                ((p5.e) this.f7492b).start();
                return;
        }
    }

    @Override // a8.c
    public final void o() {
        switch (this.f7491a) {
            case 0:
                this.f7492b.stop();
                return;
            default:
                ((p5.e) this.f7492b).stop();
                return;
        }
    }
}
