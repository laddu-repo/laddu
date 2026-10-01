package r6;

import a7.f;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.k;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements b {
    @Override // r6.b
    public final String a(Object obj, o oVar) {
        Uri uri = (Uri) obj;
        if (k.a(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            Configuration configuration = oVar.f13407a.getResources().getConfiguration();
            Bitmap.Config[] configArr = f.f595a;
            sb2.append(configuration.uiMode & 48);
            return sb2.toString();
        }
        return uri.toString();
    }
}
