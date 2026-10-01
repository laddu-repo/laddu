package ra;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f11906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.b f11907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f11908d;

    public c(d dVar, Context context, TextPaint textPaint, android.support.v4.media.session.b bVar) {
        this.f11908d = dVar;
        this.f11905a = context;
        this.f11906b = textPaint;
        this.f11907c = bVar;
    }

    @Override // android.support.v4.media.session.b
    public final void n(int i6) {
        this.f11907c.n(i6);
    }

    @Override // android.support.v4.media.session.b
    public final void o(Typeface typeface, boolean z10) {
        this.f11908d.f(this.f11905a, this.f11906b, typeface);
        this.f11907c.o(typeface, z10);
    }
}
