package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import df.m;
import gf.b0;
import gf.c0;
import gf.f0;
import gf.w1;
import gf.y;
import java.io.File;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final File cacheDir;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final c0 scope;
    private final SessionRepository sessionRepository;
    private final File webviewCacheDir;

    public AndroidCacheRepository(y ioDispatcher, GetCacheDirectory getCacheDirectory, CacheDataSource localCacheDataSource, CacheDataSource remoteCacheDataSource, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile) {
        k.e(ioDispatcher, "ioDispatcher");
        k.e(getCacheDirectory, "getCacheDirectory");
        k.e(localCacheDataSource, "localCacheDataSource");
        k.e(remoteCacheDataSource, "remoteCacheDataSource");
        k.e(context, "context");
        k.e(sessionRepository, "sessionRepository");
        k.e(cleanupDirectory, "cleanupDirectory");
        k.e(downloadPriorityQueue, "downloadPriorityQueue");
        k.e(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = f0.y(f0.y(f0.b(ioDispatcher), new b0("CacheRepository")), w1.f5722x);
        this.cacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
        this.webviewCacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i6, c cVar) {
        return f0.J(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileInternal$2(this, str, file, i6, null), cVar);
    }

    private final File initCacheDir(String str) {
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        File cacheDir = this.context.getCacheDir();
        k.d(cacheDir, "context.cacheDir");
        File invoke = getCacheDirectory.invoke(cacheDir, str);
        invoke.mkdirs();
        return invoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(c cVar) {
        return f0.J(this.scope.getCoroutineContext(), new AndroidCacheRepository$clearCache$2(this, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doesFileExist(java.lang.String r5, le.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r6)
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r6)
            r0.label = r2
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            me.a r5 = me.a.f8833x
            if (r6 != r5) goto L3b
            return r5
        L3b:
            boolean r5 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(c cVar) {
        return f0.J(this.scope.getCoroutineContext(), new AndroidCacheRepository$getCacheSize$2(this, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i6, c cVar) {
        return getFileInternal(this.cacheDir, str, jSONArray, i6, cVar);
    }

    public final String getFilename(String url) {
        k.e(url, "url");
        String h02 = m.h0(url, '?');
        String f02 = m.f0('.', m.f0('/', h02, h02), HttpUrl.FRAGMENT_ENCODE_SET);
        if (!m.S(f02)) {
            return StringExtensionsKt.getSHA256Hash(url) + '.' + f02;
        }
        return StringExtensionsKt.getSHA256Hash(url);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, c cVar) {
        File invoke = this.createFile.invoke(this.webviewCacheDir, str2);
        invoke.mkdirs();
        return getFileInternal(invoke, str, null, 0, cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        k.e(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
            return false;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, c cVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, cVar, 12, null);
    }
}
