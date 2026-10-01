package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends c.d {
    @Override // c.d
    public final void a(int i6, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.v(bundle);
        }
        if (i6 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("media_item")) {
                    Parcelable parcelable = bundle.getParcelable("media_item");
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
