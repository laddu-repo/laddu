package p5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f10571a;

    /* renamed from: b, reason: collision with root package name */
    public m f10572b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f10573c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f10574d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10575e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f10576f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f10577g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f10578h;

    /* renamed from: i, reason: collision with root package name */
    public int f10579i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10580k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f10581l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f10571a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
