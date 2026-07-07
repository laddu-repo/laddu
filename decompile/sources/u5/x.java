package u5;

import com.unity3d.services.core.webview.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface x {
    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();

    String[] k();

    WebViewProviderBoundaryInterface z(WebView webView);
}
