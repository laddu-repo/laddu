package id;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cf.m;
import kotlin.jvm.internal.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6828b;

    public g(s sVar, Context context) {
        this.f6827a = sVar;
        this.f6828b = context;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String uri;
        s sVar = this.f6827a;
        if (!sVar.f8051x) {
            return false;
        }
        sVar.f8051x = false;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (uri = url.toString()) != null) {
            m.y(this.f6828b, uri, true);
        }
        return true;
    }
}
