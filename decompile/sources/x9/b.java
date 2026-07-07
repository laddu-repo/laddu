package x9;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a8.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i6) {
        super(11);
        this.f14696f = i6;
    }

    @Override // a8.a
    public final int k(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i6;
        switch (this.f14696f) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i6 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i6 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i6 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i6;
    }

    @Override // a8.a
    public final int l() {
        switch (this.f14696f) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // a8.a
    public final ViewPropertyAnimator n(View view, int i6) {
        switch (this.f14696f) {
            case 0:
                return view.animate().translationY(i6);
            case 1:
                return view.animate().translationX(-i6);
            default:
                return view.animate().translationX(i6);
        }
    }
}
