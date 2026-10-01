package u9;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import v.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l f12960a = new l(0);

    /* renamed from: b, reason: collision with root package name */
    public final l f12961b = new l(0);

    public static e a(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0) {
            return b(context, resourceId);
        }
        return null;
    }

    public static e b(Context context, int i6) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i6);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i6), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, u9.f] */
    public static e c(ArrayList arrayList) {
        e eVar = new e();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = (Animator) arrayList.get(i6);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                eVar.f12961b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                ?? obj = new Object();
                obj.f12965d = 0;
                obj.f12966e = 1;
                obj.f12962a = startDelay;
                obj.f12963b = duration;
                obj.f12964c = interpolator;
                obj.f12965d = objectAnimator.getRepeatCount();
                obj.f12966e = objectAnimator.getRepeatMode();
                eVar.f12960a.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return eVar;
    }

    public final f d(String str) {
        l lVar = this.f12960a;
        if (lVar.get(str) != null) {
            return (f) lVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f12960a.equals(((e) obj).f12960a);
    }

    public final int hashCode() {
        return this.f12960a.hashCode();
    }

    public final String toString() {
        return "\n" + e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f12960a + "}\n";
    }
}
