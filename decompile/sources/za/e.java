package za;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ua.g {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f15245r;

    public e(ua.m mVar, RectF rectF) {
        super(mVar);
        this.f15245r = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ua.i, za.f, android.graphics.drawable.Drawable] */
    @Override // ua.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? iVar = new ua.i(this);
        iVar.f15247e0 = this;
        iVar.invalidateSelf();
        return iVar;
    }

    public e(e eVar) {
        super(eVar);
        this.f15245r = eVar.f15245r;
    }
}
