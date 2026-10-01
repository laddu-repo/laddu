package a7;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.playfy.tv.R;
import java.io.Closeable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import v6.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f595a;

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f596b;

    /* renamed from: c, reason: collision with root package name */
    public static final Headers f597c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f595a = configArr;
        if (i6 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f596b = config;
        f597c = new Headers.Builder().build();
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !df.m.S(str)) {
            String j02 = df.m.j0(df.m.j0(str, '#'), '?');
            return mimeTypeMap.getMimeTypeFromExtension(df.m.f0('.', df.m.f0('/', j02, j02), HttpUrl.FRAGMENT_ENCODE_SET));
        }
        return null;
    }

    public static final v c(ImageView imageView) {
        v vVar;
        Object tag = imageView.getTag(R.id.coil_request_manager);
        v vVar2 = null;
        if (tag instanceof v) {
            vVar = (v) tag;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            synchronized (imageView) {
                try {
                    Object tag2 = imageView.getTag(R.id.coil_request_manager);
                    if (tag2 instanceof v) {
                        vVar2 = (v) tag2;
                    }
                    if (vVar2 == null) {
                        vVar2 = new v(imageView);
                        imageView.addOnAttachStateChangeListener(vVar2);
                        imageView.setTag(R.id.coil_request_manager, vVar2);
                    }
                } finally {
                }
            }
            return vVar2;
        }
        return vVar;
    }

    public static final boolean d(Uri uri) {
        if (kotlin.jvm.internal.k.a(uri.getScheme(), "file") && kotlin.jvm.internal.k.a((String) ie.j.H(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int e(e9.f fVar, w6.g gVar) {
        if (fVar instanceof w6.a) {
            return ((w6.a) fVar).f14123k;
        }
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Integer.MAX_VALUE;
            }
            throw new RuntimeException();
        }
        return Integer.MIN_VALUE;
    }
}
