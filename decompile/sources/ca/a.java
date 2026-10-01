package ca;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import bf.o;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.ui.OverlayInsetsLayout;
import j2.h;
import k4.q;
import k4.r;
import k4.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1993b;

    public /* synthetic */ a(Object obj, int i6) {
        this.f1992a = i6;
        this.f1993b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int height;
        int i18;
        int height2;
        boolean z10;
        int i19 = this.f1992a;
        int i20 = 1;
        Object obj = this.f1993b;
        switch (i19) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i11 - i6 != i15 - i13 || i12 - i10 != i16 - i14) {
                    view.post(new a2.a(carouselLayoutManager, 11));
                    return;
                }
                return;
            case 1:
                o[] oVarArr = MainActivity.J;
                ((MainActivity) obj).Z();
                return;
            case 2:
                q qVar = (q) obj;
                int i21 = qVar.O;
                PopupWindow popupWindow = qVar.N;
                int i22 = i12 - i10;
                int i23 = i16 - i14;
                if ((i11 - i6 != i15 - i13 || i22 != i23) && popupWindow.isShowing()) {
                    qVar.u();
                    popupWindow.update(view, (qVar.getWidth() - popupWindow.getWidth()) - i21, (-popupWindow.getHeight()) - i21, -1, -1);
                    return;
                }
                return;
            case 3:
                v vVar = (v) obj;
                q qVar2 = vVar.f7702a;
                int width = (qVar2.getWidth() - qVar2.getPaddingLeft()) - qVar2.getPaddingRight();
                int height3 = (qVar2.getHeight() - qVar2.getPaddingBottom()) - qVar2.getPaddingTop();
                ViewGroup viewGroup = vVar.f7704c;
                int c10 = v.c(viewGroup);
                if (viewGroup != null) {
                    i17 = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
                } else {
                    i17 = 0;
                }
                int i24 = c10 - i17;
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                if (viewGroup != null) {
                    i18 = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
                } else {
                    i18 = 0;
                }
                int i25 = height - i18;
                int max = Math.max(i24, v.c(vVar.f7711k) + v.c(vVar.f7710i));
                ViewGroup viewGroup2 = vVar.f7705d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i26 = 2;
                int i27 = (height2 * 2) + i25;
                if (width > max && height3 > i27) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (vVar.A != z10) {
                    vVar.A = z10;
                    view.post(new r(vVar, i20));
                }
                if (i11 - i6 == i15 - i13) {
                    i20 = 0;
                }
                if (!vVar.A && i20 != 0) {
                    view.post(new r(vVar, i26));
                    return;
                }
                return;
            default:
                OverlayInsetsLayout overlayInsetsLayout = (OverlayInsetsLayout) obj;
                int i28 = OverlayInsetsLayout.A;
                if (!overlayInsetsLayout.f3378y) {
                    overlayInsetsLayout.f3378y = true;
                    overlayInsetsLayout.post(new h(overlayInsetsLayout, 5));
                    return;
                }
                return;
        }
    }
}
