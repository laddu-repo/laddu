package ra;

import android.graphics.Typeface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f11900a;

    /* renamed from: b, reason: collision with root package name */
    public final k7.c f11901b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11902c;

    public a(k7.c cVar, Typeface typeface) {
        this.f11900a = typeface;
        this.f11901b = cVar;
    }

    @Override // android.support.v4.media.session.b
    public final void n(int i6) {
        if (!this.f11902c) {
            ma.c cVar = (ma.c) this.f11901b.f7745y;
            if (cVar.l(this.f11900a)) {
                cVar.j(false);
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final void o(Typeface typeface, boolean z10) {
        if (!this.f11902c) {
            ma.c cVar = (ma.c) this.f11901b.f7745y;
            if (cVar.l(typeface)) {
                cVar.j(false);
            }
        }
    }
}
