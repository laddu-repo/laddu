package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import cf.k;
import ef.i;
import o.a3;
import o.b3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b3.a f607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f608x;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f606v;
        if (kVar != null) {
            kVar.b();
        }
        b3.a aVar = this.f607w;
        if (aVar != null) {
            aVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f606v;
        if (kVar != null) {
            return kVar.w();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f606v;
        if (kVar != null) {
            return kVar.x();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i iVar;
        b3.a aVar = this.f607w;
        if (aVar == null || (iVar = (i) aVar.f1530y) == null) {
            return null;
        }
        return (ColorStateList) iVar.f4996c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i iVar;
        b3.a aVar = this.f607w;
        if (aVar == null || (iVar = (i) aVar.f1530y) == null) {
            return null;
        }
        return (PorterDuff.Mode) iVar.f4997d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f607w.f1529x).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f606v;
        if (kVar != null) {
            kVar.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        k kVar = this.f606v;
        if (kVar != null) {
            kVar.C(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b3.a aVar = this.f607w;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        b3.a aVar = this.f607w;
        if (aVar != null && drawable != null && !this.f608x) {
            aVar.f1528w = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aVar != null) {
            aVar.a();
            if (this.f608x) {
                return;
            }
            ImageView imageView = (ImageView) aVar.f1529x;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(aVar.f1528w);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f608x = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        b3.a aVar = this.f607w;
        if (aVar != null) {
            aVar.t(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b3.a aVar = this.f607w;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        k kVar = this.f606v;
        if (kVar != null) {
            kVar.J(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        k kVar = this.f606v;
        if (kVar != null) {
            kVar.K(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        b3.a aVar = this.f607w;
        if (aVar != null) {
            if (((i) aVar.f1530y) == null) {
                aVar.f1530y = new i();
            }
            i iVar = (i) aVar.f1530y;
            iVar.f4996c = colorStateList;
            iVar.f4995b = true;
            aVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        b3.a aVar = this.f607w;
        if (aVar != null) {
            if (((i) aVar.f1530y) == null) {
                aVar.f1530y = new i();
            }
            i iVar = (i) aVar.f1530y;
            iVar.f4997d = mode;
            iVar.f4994a = true;
            aVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b3.a(context);
        this.f608x = false;
        a3.a(getContext(), this);
        k kVar = new k(this);
        this.f606v = kVar;
        kVar.z(attributeSet, i);
        b3.a aVar = new b3.a(this);
        this.f607w = aVar;
        aVar.n(attributeSet, i);
    }
}
