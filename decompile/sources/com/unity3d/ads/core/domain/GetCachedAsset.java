package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import df.m;
import gf.f0;
import he.j;
import ie.s;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.k;
import le.i;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context, CacheWebViewAssets cacheWebViewAssets) {
        k.e(cacheRepository, "cacheRepository");
        k.e(context, "context");
        k.e(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String valueOf = String.valueOf(uri.getPath());
        String e02 = m.e0(valueOf, "/", valueOf);
        try {
            InputStream open = this.context.getAssets().open(e02);
            k.d(open, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(e02), null, open);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        Object b10;
        String uri2 = uri.toString();
        k.d(uri2, "uri.toString()");
        CacheResult cacheResult = (CacheResult) f0.B(i.f8353x, new GetCachedAsset$getCachedAsset$result$1(this, m.g0(uri2, "/"), null));
        if (cacheResult instanceof CacheResult.Success) {
            File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
            if (file != null) {
                try {
                    b10 = new FileInputStream(file);
                } catch (Throwable th) {
                    b10 = he.a.b(th);
                }
                if (b10 instanceof j) {
                    b10 = null;
                }
                FileInputStream fileInputStream = (FileInputStream) b10;
                if (fileInputStream != null) {
                    String filePath = file.getAbsolutePath();
                    k.d(filePath, "filePath");
                    return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, fileInputStream);
                }
            }
            return null;
        }
        return getNotFoundResponse();
    }

    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", "utf-8", 404, "Not Found", s.f6847x, new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object b10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('/');
        String uri2 = uri.toString();
        k.d(uri2, "uri.toString()");
        sb2.append(m.g0(m.i0(uri2, "?"), "/"));
        String sb3 = sb2.toString();
        File file = this.cacheWebViewAssets.getCached().get(sb3);
        if (file != null) {
            try {
                b10 = new FileInputStream(file);
            } catch (Throwable th) {
                b10 = he.a.b(th);
            }
            if (b10 instanceof j) {
                b10 = null;
            }
            FileInputStream fileInputStream = (FileInputStream) b10;
            if (fileInputStream != null) {
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(sb3), null, fileInputStream);
            }
        }
        return null;
    }

    public final WebResourceResponse invoke(Uri uri, String webviewType) {
        k.e(uri, "uri");
        k.e(webviewType, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}
