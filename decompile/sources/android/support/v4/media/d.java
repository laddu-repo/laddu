package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {
    public static Uri a(MediaDescription mediaDescription) {
        Uri mediaUri;
        mediaUri = mediaDescription.getMediaUri();
        return mediaUri;
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
