package la;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import ua.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8319a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f8320b;

    public a(ShapeableImageView shapeableImageView) {
        this.f8320b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f8320b;
        if (shapeableImageView.I == null) {
            return;
        }
        if (shapeableImageView.H == null) {
            shapeableImageView.H = new i(shapeableImageView.I);
        }
        RectF rectF = shapeableImageView.B;
        Rect rect = this.f8319a;
        rectF.round(rect);
        shapeableImageView.H.setBounds(rect);
        shapeableImageView.H.getOutline(outline);
    }
}
