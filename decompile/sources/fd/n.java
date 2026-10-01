package fd;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.playfy.tv.R;
import com.playfy.tv.activities.MainActivity;
import p.u3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5204b;

    public /* synthetic */ n(Object obj, int i6) {
        this.f5203a = i6;
        this.f5204b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18 = this.f5203a;
        Object obj = this.f5204b;
        switch (i18) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                bf.o[] oVarArr = MainActivity.J;
                ((MainActivity) obj).Z();
                return;
            case 1:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.M;
                View view2 = searchView.U;
                boolean z10 = true;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.O.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z11 = u3.f10392a;
                    int i19 = 0;
                    if (searchView.getLayoutDirection() != 1) {
                        z10 = false;
                    }
                    if (searchView.f782n0) {
                        i19 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (z10) {
                        i17 = -rect.left;
                    } else {
                        i17 = paddingLeft - (rect.left + i19);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i17);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i19) - paddingLeft);
                    return;
                }
                return;
            default:
                throw null;
        }
    }
}
