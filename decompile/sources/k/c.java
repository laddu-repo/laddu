package k;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends a8.c {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectAnimator f7517a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7518b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [k.d, android.animation.TimeInterpolator, java.lang.Object] */
    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int i6;
        int i10;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i11 = z10 ? numberOfFrames - 1 : 0;
        if (z10) {
            i6 = 0;
        } else {
            i6 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f7520b = numberOfFrames2;
        int[] iArr = obj.f7519a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f7519a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f7519a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            if (z10) {
                i10 = (numberOfFrames2 - i13) - 1;
            } else {
                i10 = i13;
            }
            int duration = animationDrawable.getDuration(i10);
            iArr2[i13] = duration;
            i12 += duration;
        }
        obj.f7521c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i6);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.f7521c);
        ofInt.setInterpolator(obj);
        this.f7518b = z11;
        this.f7517a = ofInt;
    }

    @Override // a8.c
    public final boolean c() {
        return this.f7518b;
    }

    @Override // a8.c
    public final void k() {
        this.f7517a.reverse();
    }

    @Override // a8.c
    public final void n() {
        this.f7517a.start();
    }

    @Override // a8.c
    public final void o() {
        this.f7517a.cancel();
    }
}
