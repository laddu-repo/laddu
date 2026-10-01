package q8;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import v.i;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10950a = new i(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f10951b = new i(0);

    public static d a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static d b(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e7) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e7);
            return null;
        }
    }

    public static d c(ArrayList arrayList) {
        d dVar = new d();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            dVar.f10951b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            e eVar = new e();
            eVar.f10955d = 0;
            eVar.f10956e = 1;
            eVar.f10952a = startDelay;
            eVar.f10953b = duration;
            eVar.f10954c = interpolator;
            eVar.f10955d = objectAnimator.getRepeatCount();
            eVar.f10956e = objectAnimator.getRepeatMode();
            dVar.f10950a.put(propertyName, eVar);
        }
        return dVar;
    }

    public final e d(String str) {
        i iVar = this.f10950a;
        if (iVar.get(str) != null) {
            return (e) iVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f10950a.equals(((d) obj).f10950a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10950a.hashCode();
    }

    public final String toString() {
        return "\n" + d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f10950a + "}\n";
    }
}
