package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class y extends ImageView {

    /* renamed from: x, reason: collision with root package name */
    public final o4.j f10421x;

    /* renamed from: y, reason: collision with root package name */
    public final s8.n f10422y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10423z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        c3.a(context);
        this.f10423z = false;
        b3.a(this, getContext());
        o4.j jVar = new o4.j(this);
        this.f10421x = jVar;
        jVar.m(attributeSet, i6);
        s8.n nVar = new s8.n(this);
        this.f10422y = nVar;
        nVar.e(attributeSet, i6);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o4.j jVar = this.f10421x;
        if (jVar != null) {
            jVar.b();
        }
        s8.n nVar = this.f10422y;
        if (nVar != null) {
            nVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o4.j jVar = this.f10421x;
        if (jVar != null) {
            return jVar.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o4.j jVar = this.f10421x;
        if (jVar != null) {
            return jVar.k();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        d3 d3Var;
        s8.n nVar = this.f10422y;
        if (nVar == null || (d3Var = (d3) nVar.f12261c) == null) {
            return null;
        }
        return d3Var.f10230a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        d3 d3Var;
        s8.n nVar = this.f10422y;
        if (nVar == null || (d3Var = (d3) nVar.f12261c) == null) {
            return null;
        }
        return d3Var.f10231b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f10422y.f12260b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o4.j jVar = this.f10421x;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        o4.j jVar = this.f10421x;
        if (jVar != null) {
            jVar.p(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        s8.n nVar = this.f10422y;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        s8.n nVar = this.f10422y;
        if (nVar != null && drawable != null && !this.f10423z) {
            nVar.f12259a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (nVar != null) {
            nVar.a();
            if (!this.f10423z) {
                ImageView imageView = (ImageView) nVar.f12260b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(nVar.f12259a);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i6) {
        super.setImageLevel(i6);
        this.f10423z = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        s8.n nVar = this.f10422y;
        if (nVar != null) {
            nVar.i(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        s8.n nVar = this.f10422y;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o4.j jVar = this.f10421x;
        if (jVar != null) {
            jVar.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o4.j jVar = this.f10421x;
        if (jVar != null) {
            jVar.x(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        s8.n nVar = this.f10422y;
        if (nVar != null) {
            if (((d3) nVar.f12261c) == null) {
                nVar.f12261c = new Object();
            }
            d3 d3Var = (d3) nVar.f12261c;
            d3Var.f10230a = colorStateList;
            d3Var.f10233d = true;
            nVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        s8.n nVar = this.f10422y;
        if (nVar != null) {
            if (((d3) nVar.f12261c) == null) {
                nVar.f12261c = new Object();
            }
            d3 d3Var = (d3) nVar.f12261c;
            d3Var.f10231b = mode;
            d3Var.f10232c = true;
            nVar.a();
        }
    }
}
