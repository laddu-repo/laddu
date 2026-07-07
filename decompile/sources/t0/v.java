package t0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements w {

    /* renamed from: x, reason: collision with root package name */
    public final ScrollFeedbackProvider f12415x;

    public v(NestedScrollView nestedScrollView) {
        this.f12415x = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // t0.w
    public final void onScrollLimit(int i6, int i10, int i11, boolean z10) {
        this.f12415x.onScrollLimit(i6, i10, i11, z10);
    }

    @Override // t0.w
    public final void onScrollProgress(int i6, int i10, int i11, int i12) {
        this.f12415x.onScrollProgress(i6, i10, i11, i12);
    }
}
