package o5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.k4;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends r {
    public static final String[] Z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: a0, reason: collision with root package name */
    public static final b f9952a0 = new b(PointF.class, "topLeft", 0);

    /* renamed from: b0, reason: collision with root package name */
    public static final b f9953b0 = new b(PointF.class, "bottomRight", 1);

    /* renamed from: c0, reason: collision with root package name */
    public static final b f9954c0 = new b(PointF.class, "bottomRight", 2);

    /* renamed from: d0, reason: collision with root package name */
    public static final b f9955d0 = new b(PointF.class, "topLeft", 3);

    /* renamed from: e0, reason: collision with root package name */
    public static final b f9956e0 = new b(PointF.class, "position", 4);

    public static void K(z zVar) {
        View view = zVar.f10001b;
        HashMap hashMap = zVar.f10000a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // o5.r
    public final void c(z zVar) {
        K(zVar);
    }

    @Override // o5.r
    public final void f(z zVar) {
        K(zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o5.r
    public final Animator j(ViewGroup viewGroup, z zVar, z zVar2) {
        int i6;
        f fVar;
        ObjectAnimator a10;
        if (zVar != null) {
            HashMap hashMap = zVar.f10000a;
            if (zVar2 != null) {
                HashMap hashMap2 = zVar2.f10000a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = zVar2.f10001b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i10 = rect.left;
                    int i11 = rect2.left;
                    int i12 = rect.top;
                    int i13 = rect2.top;
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    int i16 = rect.bottom;
                    int i17 = rect2.bottom;
                    int i18 = i14 - i10;
                    int i19 = i16 - i12;
                    int i20 = i15 - i11;
                    int i21 = i17 - i13;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i18 != 0 && i19 != 0) || (i20 != 0 && i21 != 0)) {
                        if (i10 == i11 && i12 == i13) {
                            i6 = 0;
                        } else {
                            i6 = 1;
                        }
                        if (i14 != i15 || i16 != i17) {
                            i6++;
                        }
                    } else {
                        i6 = 0;
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i6++;
                    }
                    int i22 = i6;
                    if (i22 > 0) {
                        b0.a(view, i10, i12, i14, i16);
                        if (i22 == 2) {
                            if (i18 == i20 && i19 == i21) {
                                fVar = this;
                                fVar.S.getClass();
                                a10 = i.a(view, f9956e0, n9.a0.a(i10, i12, i11, i13));
                            } else {
                                fVar = this;
                                e eVar = new e(view);
                                fVar.S.getClass();
                                ObjectAnimator a11 = i.a(eVar, f9952a0, n9.a0.a(i10, i12, i11, i13));
                                fVar.S.getClass();
                                ObjectAnimator a12 = i.a(eVar, f9953b0, n9.a0.a(i14, i16, i15, i17));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(a11, a12);
                                animatorSet.addListener(new c(eVar));
                                a10 = animatorSet;
                            }
                        } else {
                            fVar = this;
                            if (i10 == i11 && i12 == i13) {
                                fVar.S.getClass();
                                a10 = i.a(view, f9954c0, n9.a0.a(i14, i16, i15, i17));
                            } else {
                                fVar.S.getClass();
                                a10 = i.a(view, f9955d0, n9.a0.a(i10, i12, i11, i13));
                            }
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            k4.q(viewGroup4, true);
                            fVar.n().a(new d(viewGroup4));
                        }
                        return a10;
                    }
                }
            }
        }
        return null;
    }

    @Override // o5.r
    public final String[] p() {
        return Z;
    }
}
