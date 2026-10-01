package ld;

import android.graphics.Path;
import android.graphics.Rect;
import com.playfy.tv.ui.CornerLabelTextview;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum a extends i {
    public a() {
        super("MODE_LEFT", 0);
    }

    @Override // ld.i
    public final float[] a(CornerLabelTextview cornerLabelTextview, int i6, int i10, int i11) {
        return CornerLabelTextview.a(cornerLabelTextview, new Rect(0, 0, i6, i10), i6 / 2, i10 / 2, -45.0f);
    }

    @Override // ld.i
    public final Path b(CornerLabelTextview cornerLabelTextview, Path path, int i6, int i10) {
        int i11 = CornerLabelTextview.F;
        float f3 = i6;
        path.moveTo(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f10 = i10;
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10 - cornerLabelTextview.f3376z);
        path.lineTo(f3 - cornerLabelTextview.f3376z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return path;
    }
}
