package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends y implements k {
    public final /* synthetic */ j A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.A = jVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        e9.f.i(this, getContentDescription());
        setOnTouchListener(new o.b(this, this));
    }

    @Override // p.k
    public final boolean b() {
        return false;
    }

    @Override // p.k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.A.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i6, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i6, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
