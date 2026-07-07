package o5;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l {
    public static long a(Animator animator) {
        long totalDuration;
        totalDuration = animator.getTotalDuration();
        return totalDuration;
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
