package t9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f12440r;

    public f(o9.m mVar, RectF rectF) {
        super(mVar);
        this.f12440r = rectF;
    }

    @Override // o9.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f12442b0 = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f12440r = fVar.f12440r;
    }
}
