package f5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f5277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f5278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f5279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5280e;
    public Bitmap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f5281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f5282h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f5285l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f5276a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new r(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new r(this);
    }
}
