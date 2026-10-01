package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f1000v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f1001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1003y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1004z;

    public d0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1004z = true;
        this.f1000v = viewGroup;
        this.f1001w = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j8, Transformation transformation) {
        this.f1004z = true;
        if (this.f1002x) {
            return !this.f1003y;
        }
        if (!super.getTransformation(j8, transformation)) {
            this.f1002x = true;
            t0.p.a(this.f1000v, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1002x;
        ViewGroup viewGroup = this.f1000v;
        if (z2 || !this.f1004z) {
            viewGroup.endViewTransition(this.f1001w);
            this.f1003y = true;
        } else {
            this.f1004z = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j8, Transformation transformation, float f) {
        this.f1004z = true;
        if (this.f1002x) {
            return !this.f1003y;
        }
        if (!super.getTransformation(j8, transformation, f)) {
            this.f1002x = true;
            t0.p.a(this.f1000v, this);
        }
        return true;
    }
}
