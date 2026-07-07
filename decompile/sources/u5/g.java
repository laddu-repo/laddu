package u5;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g {
    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(t5.d dVar) {
        WebMessagePort[] webMessagePortArr;
        p5.c.i();
        String str = dVar.f12610b;
        s8.l[] lVarArr = dVar.f12609a;
        if (lVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = lVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i6 = 0; i6 < length; i6++) {
                s8.l lVar = lVarArr[i6];
                if (((WebMessagePort) lVar.f12251y) == null) {
                    r rVar = v.f12925a;
                    lVar.f12251y = y.e(((WebkitToCompatConverterBoundaryInterface) rVar.f12916y).convertWebMessagePort(Proxy.getInvocationHandler((WebMessagePortBoundaryInterface) lVar.f12252z)));
                }
                webMessagePortArr2[i6] = (WebMessagePort) lVar.f12251y;
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return p5.c.e(str, webMessagePortArr);
    }

    public static WebMessagePort[] c(WebView webView) {
        WebMessagePort[] createWebMessageChannel;
        createWebMessageChannel = webView.createWebMessageChannel();
        return createWebMessageChannel;
    }

    public static t5.d d(WebMessage webMessage) {
        String data;
        WebMessagePort[] ports;
        s8.l[] lVarArr;
        data = webMessage.getData();
        ports = webMessage.getPorts();
        if (ports == null) {
            lVarArr = null;
        } else {
            s8.l[] lVarArr2 = new s8.l[ports.length];
            for (int i6 = 0; i6 < ports.length; i6++) {
                WebMessagePort webMessagePort = ports[i6];
                s8.l lVar = new s8.l(7, false);
                lVar.f12251y = webMessagePort;
                lVarArr2[i6] = lVar;
            }
            lVarArr = lVarArr2;
        }
        return new t5.d(data, lVarArr);
    }

    public static CharSequence e(WebResourceError webResourceError) {
        CharSequence description;
        description = webResourceError.getDescription();
        return description;
    }

    public static int f(WebResourceError webResourceError) {
        int errorCode;
        errorCode = webResourceError.getErrorCode();
        return errorCode;
    }

    public static boolean g(WebSettings webSettings) {
        boolean offscreenPreRaster;
        offscreenPreRaster = webSettings.getOffscreenPreRaster();
        return offscreenPreRaster;
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j, t5.g gVar) {
        webView.postVisualStateCallback(j, new f());
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, t5.e eVar) {
        webMessagePort.setWebMessageCallback(new e(0));
    }

    public static void m(WebMessagePort webMessagePort, t5.e eVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new e(1), handler);
    }
}
