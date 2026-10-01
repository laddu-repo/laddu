package u0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: x, reason: collision with root package name */
    public final int f12730x;

    /* renamed from: y, reason: collision with root package name */
    public final c f12731y;

    /* renamed from: z, reason: collision with root package name */
    public final int f12732z;

    public a(int i6, c cVar, int i10) {
        this.f12730x = i6;
        this.f12731y = cVar;
        this.f12732z = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f12730x);
        this.f12731y.f12745a.performAction(this.f12732z, bundle);
    }
}
