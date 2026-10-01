package m0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f8407a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f8408b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f8409c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f8410d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i6;
        int i10 = this.f8407a;
        Drawable.ConstantState constantState = this.f8408b;
        if (constantState != null) {
            i6 = constantState.getChangingConfigurations();
        } else {
            i6 = 0;
        }
        return i10 | i6;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m0.d, android.graphics.drawable.Drawable] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ?? drawable = new Drawable();
        drawable.A = this;
        Drawable.ConstantState constantState = this.f8408b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        d.a();
        return drawable;
    }
}
