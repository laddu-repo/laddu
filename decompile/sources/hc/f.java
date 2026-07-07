package hc;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f6218b;

    public f(g gVar, String str) {
        this.f6218b = gVar;
        this.f6217a = str;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        h hVar = this.f6218b.f6222x;
        String string = webResourceRequest.getUrl().toString();
        if (this.f6217a.equals(string)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                intent.setPackage("com.android.chrome");
                hVar.f.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
                hVar.f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                return true;
            }
        } catch (ActivityNotFoundException unused2) {
            return true;
        }
    }
}
