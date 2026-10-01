package k4;

import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.view.SurfaceControl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ RenderNode c() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder d(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder h(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ SurfaceControl.Transaction j() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ RenderNode z() {
        return new RenderNode("OffscreenLayer.shadow");
    }
}
