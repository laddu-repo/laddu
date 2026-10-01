package j;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends fa.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ObjectAnimator f6636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f6637y;

    public c(AnimationDrawable animationDrawable, boolean z2, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z2 ? numberOfFrames - 1 : 0;
        int i10 = z2 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f6639b = numberOfFrames2;
        int[] iArr = dVar.f6638a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f6638a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f6638a;
        int i11 = 0;
        for (int i12 = 0; i12 < numberOfFrames2; i12++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i12) - 1 : i12);
            iArr2[i12] = duration;
            i11 += duration;
        }
        dVar.f6640c = i11;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i10);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(dVar.f6640c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f6637y = z10;
        this.f6636x = objectAnimatorOfInt;
    }

    @Override // fa.b
    public final boolean d() {
        return this.f6637y;
    }

    @Override // fa.b
    public final void v() {
        this.f6636x.reverse();
    }

    @Override // fa.b
    public final void w() {
        this.f6636x.start();
    }

    @Override // fa.b
    public final void x() {
        this.f6636x.cancel();
    }
}
