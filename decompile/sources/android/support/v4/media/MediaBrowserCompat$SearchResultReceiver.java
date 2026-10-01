package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends c.d {
    @Override // c.d
    public final void a(int i6, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.v(bundle);
        }
        if (i6 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    parcelableArray.getClass();
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
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
