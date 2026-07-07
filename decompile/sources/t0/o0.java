package t0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo w10 = gVar.f12350a.w();
        Objects.requireNonNull(w10);
        ContentInfo performReceiveContent = view.performReceiveContent(w10);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == w10) {
            return gVar;
        }
        return new g(new k7.d(performReceiveContent));
    }
}
