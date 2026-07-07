package o5;

import a2.z1;
import android.animation.ObjectAnimator;
import android.view.View;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: a0, reason: collision with root package name */
    public static final String[] f9959a0 = {"android:visibility:visibility", "android:visibility:parent"};
    public final int Z;

    public h(int i6) {
        this();
        this.Z = i6;
    }

    public static void K(z zVar) {
        View view = zVar.f10001b;
        int visibility = view.getVisibility();
        HashMap hashMap = zVar.f10000a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float M(z zVar, float f3) {
        Float f10;
        if (zVar != null && (f10 = (Float) zVar.f10000a.get("android:fade:transitionAlpha")) != null) {
            return f10.floatValue();
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a2.z1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a2.z1 N(o5.z r8, o5.z r9) {
        /*
            a2.z1 r0 = new a2.z1
            r0.<init>()
            r1 = 0
            r0.f512a = r1
            r0.f513b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f10000a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f514c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f516e = r6
            goto L33
        L2f:
            r0.f514c = r3
            r0.f516e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f10000a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f515d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f517f = r2
            goto L56
        L52:
            r0.f515d = r3
            r0.f517f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.f514c
            int r9 = r0.f515d
            if (r8 != r9) goto L6c
            java.lang.Object r3 = r0.f516e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r0.f517f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r4) goto L6c
            goto La7
        L6c:
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L75
            r0.f513b = r1
            r0.f512a = r2
            return r0
        L75:
            if (r9 != 0) goto La7
            r0.f513b = r2
            r0.f512a = r2
            return r0
        L7c:
            java.lang.Object r8 = r0.f517f
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L87
            r0.f513b = r1
            r0.f512a = r2
            return r0
        L87:
            java.lang.Object r8 = r0.f516e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto La7
            r0.f513b = r2
            r0.f512a = r2
            return r0
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.f515d
            if (r8 != 0) goto L9d
            r0.f513b = r2
            r0.f512a = r2
            return r0
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.f514c
            if (r8 != 0) goto La7
            r0.f513b = r1
            r0.f512a = r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.h.N(o5.z, o5.z):a2.z1");
    }

    public final ObjectAnimator L(View view, float f3, float f10) {
        if (f3 == f10) {
            return null;
        }
        b0.f9938a.m(view, f3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, b0.f9939b, f10);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        n().a(gVar);
        return ofFloat;
    }

    @Override // o5.r
    public final void c(z zVar) {
        K(zVar);
    }

    @Override // o5.r
    public final void f(z zVar) {
        K(zVar);
        View view = zVar.f10001b;
        Float f3 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f3 == null) {
            if (view.getVisibility() == 0) {
                f3 = Float.valueOf(b0.f9938a.j(view));
            } else {
                f3 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        zVar.f10000a.put("android:fade:transitionAlpha", f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (N(m(r3, false), q(r3, false)).f512a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e5  */
    @Override // o5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator j(android.view.ViewGroup r24, o5.z r25, o5.z r26) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.h.j(android.view.ViewGroup, o5.z, o5.z):android.animation.Animator");
    }

    @Override // o5.r
    public final String[] p() {
        return f9959a0;
    }

    @Override // o5.r
    public final boolean s(z zVar, z zVar2) {
        if (zVar != null || zVar2 != null) {
            if (zVar == null || zVar2 == null || zVar2.f10000a.containsKey("android:visibility:visibility") == zVar.f10000a.containsKey("android:visibility:visibility")) {
                z1 N = N(zVar, zVar2);
                if (N.f512a) {
                    if (N.f514c == 0 || N.f515d == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public h() {
        this.Z = 3;
    }
}
