package ma;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8795x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ View f8796y;

    public /* synthetic */ o(View view, int i6) {
        this.f8795x = i6;
        this.f8796y = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8795x) {
            case 0:
                View view = this.f8796y;
                ((InputMethodManager) i0.f.e(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            default:
                View view2 = this.f8796y;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
        }
    }
}
