package q8;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10952a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f10954c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10955d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10956e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10953b = 150;

    public e(long j8) {
        this.f10952a = j8;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f10952a);
        objectAnimator.setDuration(this.f10953b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f10955d);
        objectAnimator.setRepeatMode(this.f10956e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f10954c;
        return timeInterpolator != null ? timeInterpolator : a.f10945b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f10952a == eVar.f10952a && this.f10953b == eVar.f10953b && this.f10955d == eVar.f10955d && this.f10956e == eVar.f10956e) {
            return b().getClass().equals(eVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f10952a;
        long j9 = this.f10953b;
        return ((((b().getClass().hashCode() + (((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31)) * 31) + this.f10955d) * 31) + this.f10956e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(e.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f10952a);
        sb2.append(" duration: ");
        sb2.append(this.f10953b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f10955d);
        sb2.append(" repeatMode: ");
        return j4.a.l(this.f10956e, "}\n", sb2);
    }
}
