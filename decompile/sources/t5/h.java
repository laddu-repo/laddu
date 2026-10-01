package t5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import com.unity3d.services.core.webview.WebView;
import java.util.Set;
import okhttp3.HttpUrl;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import u5.r;
import u5.u;
import u5.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12611a = 0;

    static {
        Uri.parse("*");
        Uri.parse(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static void a(WebView webView, String str, Set set, com.unity3d.services.core.webview.a aVar) {
        if (u.f12924e.b()) {
            WebViewProviderBoundaryInterface z10 = w.f12926a.z(webView);
            String[] strArr = (String[]) set.toArray(new String[0]);
            r rVar = new r(0, false);
            rVar.f12916y = aVar;
            z10.addWebMessageListener(str, strArr, new dg.a(rVar));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
