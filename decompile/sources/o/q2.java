package o;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9279w;

    public /* synthetic */ q2(int i, Object obj) {
        this.f9278v = i;
        this.f9279w = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f9278v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                SearchView searchView = (SearchView) this.f9279w;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.K;
                View view2 = searchView.S;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.M.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z2 = s3.f9294a;
                    boolean z10 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.f628l0 ? resources.getDimensionPixelSize(g.d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(g.d.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(z10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                throw null;
        }
    }
}
