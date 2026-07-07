package gd;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5607b;

    public /* synthetic */ a(Object obj, int i6) {
        this.f5606a = i6;
        this.f5607b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        float f3;
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.f5606a) {
            case 0:
                ViewPropertyAnimator animate = ((b) this.f5607b).f13897a.animate();
                float f14 = 1.0f;
                if (z10) {
                    f3 = 1.1f;
                } else {
                    f3 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f3);
                if (z10) {
                    f14 = 1.1f;
                }
                scaleX.scaleY(f14).setDuration(200L).start();
                return;
            case 1:
                ViewPropertyAnimator animate2 = ((m) this.f5607b).f13897a.animate();
                float f15 = 1.0f;
                if (z10) {
                    f10 = 1.1f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f10);
                if (z10) {
                    f15 = 1.1f;
                }
                scaleX2.scaleY(f15).setDuration(200L).start();
                return;
            case 2:
                k kVar = (k) this.f5607b;
                kVar.f5626v.f3204c.setSelected(z10);
                ViewPropertyAnimator animate3 = kVar.f13897a.animate();
                float f16 = 1.0f;
                if (z10) {
                    f11 = 1.1f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX3 = animate3.scaleX(f11);
                if (z10) {
                    f16 = 1.1f;
                }
                scaleX3.scaleY(f16).setDuration(200L).start();
                return;
            case 3:
                k kVar2 = (k) this.f5607b;
                kVar2.f5626v.f3204c.setSelected(z10);
                ViewPropertyAnimator animate4 = kVar2.f13897a.animate();
                float f17 = 1.0f;
                if (z10) {
                    f12 = 1.1f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX4 = animate4.scaleX(f12);
                if (z10) {
                    f17 = 1.1f;
                }
                scaleX4.scaleY(f17).setDuration(200L).start();
                return;
            case 4:
                ViewPropertyAnimator animate5 = ((r) this.f5607b).f13897a.animate();
                float f18 = 1.0f;
                if (z10) {
                    f13 = 1.1f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator scaleX5 = animate5.scaleX(f13);
                if (z10) {
                    f18 = 1.1f;
                }
                scaleX5.scaleY(f18).setDuration(200L).start();
                return;
            case 5:
                za.c cVar = (za.c) this.f5607b;
                cVar.s(cVar.t());
                return;
            default:
                za.i iVar = (za.i) this.f5607b;
                iVar.f15256l = z10;
                iVar.p();
                if (!z10) {
                    iVar.s(false);
                    iVar.f15257m = false;
                    return;
                }
                return;
        }
    }
}
