package j1;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends AnimationSet implements Runnable {
    public boolean A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final ViewGroup f6888x;

    /* renamed from: y, reason: collision with root package name */
    public final View f6889y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6890z;

    public b0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.B = true;
        this.f6888x = viewGroup;
        this.f6889y = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.B = true;
        if (this.f6890z) {
            return !this.A;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f6890z = true;
            t0.u.a(this.f6888x, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f6890z;
        ViewGroup viewGroup = this.f6888x;
        if (!z10 && this.B) {
            this.B = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f6889y);
            this.A = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f3) {
        this.B = true;
        if (this.f6890z) {
            return !this.A;
        }
        if (!super.getTransformation(j, transformation, f3)) {
            this.f6890z = true;
            t0.u.a(this.f6888x, this);
        }
        return true;
    }
}
