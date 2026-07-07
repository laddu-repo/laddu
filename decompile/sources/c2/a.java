package c2;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.media.MediaDrm;
import android.view.ContentInfo;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Font.Builder i(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ ContentInfo.Builder o(ClipData clipData, int i6) {
        return new ContentInfo.Builder(clipData, i6);
    }
}
