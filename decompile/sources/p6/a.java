package p6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.nio.ByteBuffer;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10585a;

    public /* synthetic */ a(int i6) {
        this.f10585a = i6;
    }

    @Override // p6.f
    public final g a(Object obj, o oVar) {
        switch (this.f10585a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!a7.f.d(uri)) {
                    return null;
                }
                return new b(uri, oVar, 0);
            case 1:
                return new c((Bitmap) obj, oVar, 0);
            case 2:
                return new c((ByteBuffer) obj, oVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!kotlin.jvm.internal.k.a(uri2.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    return null;
                }
                return new b(uri2, oVar, 1);
            case 4:
                return new c((Drawable) obj, oVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!kotlin.jvm.internal.k.a(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new b(uri3, oVar, 2);
        }
    }
}
