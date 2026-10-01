package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import df.m;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {
    private final ConcurrentHashMap<String, File> _cached;
    private final CacheRepository cacheRepository;
    private final SessionRepository sessionRepository;

    public AndroidCacheWebViewAssets(CacheRepository cacheRepository, SessionRepository sessionRepository) {
        k.e(cacheRepository, "cacheRepository");
        k.e(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap<>();
    }

    private final String getFilename(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append('/');
        String h02 = m.h0(str, '?');
        sb2.append(m.f0('/', h02, h02));
        return sb2.toString();
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        if (r10 == r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e5 -> B:11:0x00e8). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.WebViewConfiguration r9, le.c r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets.invoke(com.unity3d.ads.core.data.model.WebViewConfiguration, le.c):java.lang.Object");
    }
}
