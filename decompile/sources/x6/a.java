package x6;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.f0;
import androidx.lifecycle.l;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: x, reason: collision with root package name */
    public boolean f14691x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f14692y;

    public a(ImageView imageView) {
        this.f14692y = imageView;
    }

    @Override // androidx.lifecycle.l
    public final void S(f0 f0Var) {
        this.f14691x = true;
        a();
    }

    public final void a() {
        Animatable animatable;
        Object drawable = this.f14692y.getDrawable();
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable == null) {
            return;
        }
        if (this.f14691x) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void b(Drawable drawable) {
        Animatable animatable;
        ImageView imageView = this.f14692y;
        Object drawable2 = imageView.getDrawable();
        if (drawable2 instanceof Animatable) {
            animatable = (Animatable) drawable2;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        a();
    }

    @Override // androidx.lifecycle.l
    public final void d(f0 owner) {
        k.e(owner, "owner");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (k.a(this.f14692y, ((a) obj).f14692y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.lifecycle.l
    public final /* synthetic */ void f(f0 f0Var) {
        r4.a.b(f0Var);
    }

    public final int hashCode() {
        return this.f14692y.hashCode();
    }

    @Override // androidx.lifecycle.l
    public final void y(f0 f0Var) {
        this.f14691x = false;
        a();
    }

    @Override // androidx.lifecycle.l
    public final /* synthetic */ void K(f0 f0Var) {
    }

    @Override // androidx.lifecycle.l
    public final /* synthetic */ void l(f0 f0Var) {
    }
}
